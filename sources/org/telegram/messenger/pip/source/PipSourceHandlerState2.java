package org.telegram.messenger.pip.source;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.TooltipPopup;
import com.google.android.exoplayer2.ExoPlayerImpl;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pip.PipActivityContentLayout;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.PipSourceContentView;
import org.telegram.messenger.pip.activity.IPipActivityAnimationListener;
import org.telegram.messenger.pip.activity.IPipActivityListener;
import org.telegram.messenger.pip.utils.Trigger;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.MHTML;

public final class PipSourceHandlerState2 implements IPipActivityListener, IPipActivityAnimationListener {
    public PipSourceSnapshot contentBackground;
    public PipSourceSnapshot contentForeground;
    public float lastProgress;
    public float lastRadius;
    public View pictureInPicturePlaceholderView;
    public View pictureInPictureView;
    public PipSourceContentView pictureInPictureWrapperView;
    public MHTML pipSourcePlaceholder;
    public boolean shouldBeAttached;
    public final PipSource source;
    public int state = 0;
    public final Rect positionSource = new Rect();
    public final Rect position = new Rect();
    public final RectF rect = new RectF();
    public final Path path = new Path();

    public PipSourceHandlerState2(PipSource pipSource) {
        this.source = pipSource;
    }

    @Override
    public final void onCompleteEnterToPip() {
    }

    @Override
    public final void onCompleteExitFromPip() {
        this.shouldBeAttached = false;
        performPreDetach1();
    }

    @Override
    public final void onPipStashEnd() {
        ExoPlayerImpl exoPlayerImpl;
        PipSource pipSource = this.source;
        if (pipSource == null || (exoPlayerImpl = pipSource.player) == null) {
            return;
        }
        exoPlayerImpl.setPlayWhenReady(true);
    }

    @Override
    public final void onPipStashStart() {
        ExoPlayerImpl exoPlayerImpl;
        PipSource pipSource = this.source;
        if (pipSource == null || (exoPlayerImpl = pipSource.player) == null) {
            return;
        }
        exoPlayerImpl.setPlayWhenReady(false);
    }

    @Override
    public final void onStartEnterToPip() {
        this.shouldBeAttached = true;
        performPreAttach();
    }

    @Override
    public final void onStartExitFromPip() {
    }

    public final void performPreAttach() {
        if (this.state != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.state);
            return;
        }
        this.positionSource.set((Rect) this.source.params.binarizer);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + this.positionSource);
        int measuredWidth = ((LaunchActivity) this.source.controller.mLayoutParams).getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = ((LaunchActivity) this.source.controller.mLayoutParams).getWindow().getDecorView().getMeasuredHeight();
        Bitmap bitmapPipCreatePrimaryWindowViewBitmap = this.source.delegate.pipCreatePrimaryWindowViewBitmap();
        final IPipSourceDelegate iPipSourceDelegate = this.source.delegate;
        Objects.requireNonNull(iPipSourceDelegate);
        final int i = 0;
        this.contentBackground = new PipSourceSnapshot(measuredWidth, measuredHeight, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (i) {
                    case 0:
                        iPipSourceDelegate.pipRenderBackground((Canvas) obj);
                        break;
                    default:
                        iPipSourceDelegate.pipRenderForeground((Canvas) obj);
                        break;
                }
            }
        });
        final IPipSourceDelegate iPipSourceDelegate2 = this.source.delegate;
        Objects.requireNonNull(iPipSourceDelegate2);
        final int i2 = 1;
        this.contentForeground = new PipSourceSnapshot(measuredWidth, measuredHeight, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (i2) {
                    case 0:
                        iPipSourceDelegate2.pipRenderBackground((Canvas) obj);
                        break;
                    default:
                        iPipSourceDelegate2.pipRenderForeground((Canvas) obj);
                        break;
                }
            }
        });
        this.pictureInPictureView = this.source.delegate.pipCreatePictureInPictureView();
        this.pictureInPicturePlaceholderView = new View((LaunchActivity) this.source.controller.mLayoutParams);
        PipSourceContentView pipSourceContentView = new PipSourceContentView((LaunchActivity) this.source.controller.mLayoutParams, this);
        this.pictureInPictureWrapperView = pipSourceContentView;
        pipSourceContentView.addView(this.pictureInPicturePlaceholderView);
        this.pictureInPictureWrapperView.addView(this.pictureInPictureView);
        View view = this.pictureInPicturePlaceholderView;
        View view2 = this.source.placeholderView;
        MHTML mhtml = new MHTML();
        mhtml.file = view;
        mhtml.boundary = view2;
        this.pipSourcePlaceholder = mhtml;
        mhtml.setPlaceholder(bitmapPipCreatePrimaryWindowViewBitmap);
        TooltipPopup tooltipPopup = this.source.controller;
        if (((PipActivityContentLayout) tooltipPopup.mMessageView) == null) {
            tooltipPopup.mMessageView = new PipActivityContentLayout((LaunchActivity) tooltipPopup.mLayoutParams);
        }
        ((PipActivityContentLayout) tooltipPopup.mMessageView).addView(this.pictureInPictureWrapperView);
        this.state = 1;
        this.pictureInPictureWrapperView.invalidate();
        AndroidUtilities.doOnPreDraw(this.pictureInPictureView, new Trigger(ApplicationLoader.applicationHandler, new PipSourceHandlerState2$$ExternalSyntheticLambda0(this, 1), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public final void performPreDetach1() {
        if (this.state != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.state);
            return;
        }
        this.pipSourcePlaceholder.setPlaceholder(this.source.delegate.pipCreatePictureInPictureViewBitmap());
        this.state = 3;
        this.pictureInPictureWrapperView.removeView(this.pictureInPictureView);
        this.pictureInPictureWrapperView.invalidate();
        this.pictureInPictureView = null;
        AndroidUtilities.doOnPreDraw(this.pictureInPictureWrapperView, new Trigger(ApplicationLoader.applicationHandler, new PipSourceHandlerState2$$ExternalSyntheticLambda0(this, 0), 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }
}
