package org.telegram.messenger.pip;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.TooltipPopup;
import androidx.core.math.MathUtils;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import com.google.zxing.BinaryBitmap;
import java.util.HashMap;
import org.commonmark.parser.Parser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.pip.activity.IPipActivity;
import org.telegram.messenger.pip.source.IPipSourceDelegate;
import org.telegram.messenger.pip.source.PipSourceHandlerState2;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda28;
import org.webrtc.TextureViewRenderer;

public final class PipSource {
    public static int sourceIdCounter;
    public static final Rect tmpRect = new Rect();
    public View contentView;
    public final TooltipPopup controller;
    public final int cornerRadius;
    public final IPipSourceDelegate delegate;
    public boolean isAvailable;
    public final boolean needMediaSession;
    public final BinaryBitmap params;
    public final Parser pipPositionObserver;
    public View placeholderView;
    public ExoPlayerImpl player;
    public final int priority;
    public final PipSourceHandlerState2 state2;
    public final String tag;

    public final class Builder {
        public final Activity activity;
        public View contentView;
        public int cornerRadius;
        public final IPipSourceDelegate delegate;
        public int height;
        public View placeholderView;
        public ExoPlayerImpl player;
        public String tagPrefix;
        public int width;
        public int priority = 0;
        public boolean needMediaSession = false;

        public Builder(Activity activity, IPipSourceDelegate iPipSourceDelegate) {
            this.activity = activity;
            this.delegate = iPipSourceDelegate;
        }

        public final PipSource build() {
            ComponentCallbacks2 componentCallbacks2 = this.activity;
            if (componentCallbacks2 instanceof IPipActivity) {
                return new PipSource(((LaunchActivity) ((IPipActivity) componentCallbacks2)).pipActivityController, this);
            }
            return null;
        }
    }

    public PipSource(TooltipPopup tooltipPopup, Builder builder) {
        int i = sourceIdCounter;
        sourceIdCounter = i + 1;
        BinaryBitmap binaryBitmap = new BinaryBitmap(17);
        this.params = binaryBitmap;
        Parser parser = new Parser(new LaunchActivity$$ExternalSyntheticLambda28(this, 1));
        this.pipPositionObserver = parser;
        StringBuilder sb = new StringBuilder();
        String str = builder.tagPrefix;
        sb.append(str == null ? "pip-source" : str);
        sb.append("-");
        sb.append(i);
        String string = sb.toString();
        this.tag = string;
        this.delegate = builder.delegate;
        this.priority = builder.priority;
        this.cornerRadius = builder.cornerRadius;
        this.needMediaSession = builder.needMediaSession;
        this.controller = tooltipPopup;
        int i2 = builder.width;
        int i3 = builder.height;
        Point point = (Point) binaryBitmap.matrix;
        if (point.x != i2 || point.y != i3) {
            point.set(i2, i3);
        }
        this.player = builder.player;
        this.placeholderView = builder.placeholderView;
        this.state2 = new PipSourceHandlerState2(this);
        View view = builder.contentView;
        parser.setViewInternal(view);
        this.contentView = view;
        if (view != null) {
            updateContentPosition(view);
        }
        checkAvailable(false);
        ((HashMap) tooltipPopup.mContext).put(string, this);
        tooltipPopup.updateSources();
    }

    public final void checkAvailable(boolean z) {
        boolean z2 = this.params.isValid() && this.delegate.pipIsAvailable();
        if (this.isAvailable != z2) {
            this.isAvailable = z2;
            if (z) {
                TooltipPopup tooltipPopup = this.controller;
                tooltipPopup.updateSources();
                ((PipActivityContentLayout) tooltipPopup.mMessageView).invalidate();
            }
        }
    }

    public final void destroy() {
        this.pipPositionObserver.setViewInternal(null);
        TooltipPopup tooltipPopup = this.controller;
        if (((HashMap) tooltipPopup.mContext).remove(this.tag) != null) {
            tooltipPopup.updateSources();
        }
    }

    public final void updateContentPosition(View view) {
        boolean z;
        TooltipPopup tooltipPopup = this.controller;
        if (AndroidUtilities.isInPictureInPictureMode((LaunchActivity) tooltipPopup.mLayoutParams)) {
            return;
        }
        LaunchActivity launchActivity = (LaunchActivity) tooltipPopup.mLayoutParams;
        int[] iArr = PipUtils.tmpCords;
        view.getLocationOnScreen(iArr);
        boolean z2 = false;
        int i = iArr[0];
        int i2 = iArr[1];
        View decorView = launchActivity.getWindow().getDecorView();
        decorView.getLocationOnScreen(iArr);
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int width = view.getWidth() + i3;
        int height = view.getHeight() + i4;
        int i5 = iArr[0];
        int iClamp = MathUtils.clamp(i3, i5, decorView.getWidth() + i5);
        int i6 = iArr[1];
        int iClamp2 = MathUtils.clamp(i4, i6, decorView.getHeight() + i6);
        int i7 = iArr[0];
        int iClamp3 = MathUtils.clamp(width, i7, decorView.getWidth() + i7);
        int i8 = iArr[1];
        int iClamp4 = MathUtils.clamp(height, i8, decorView.getHeight() + i8);
        Rect rect = tmpRect;
        rect.set(iClamp, iClamp2, iClamp3, iClamp4);
        BinaryBitmap binaryBitmap = this.params;
        if (((Rect) binaryBitmap.binarizer).equals(rect)) {
            z = false;
        } else {
            ((Rect) binaryBitmap.binarizer).set(rect);
            z = true;
        }
        if (view instanceof TextureViewRenderer) {
            TextureViewRenderer textureViewRenderer = (TextureViewRenderer) view;
            int i9 = textureViewRenderer.rotatedFrameWidth;
            int i10 = textureViewRenderer.rotatedFrameHeight;
            Point point = (Point) binaryBitmap.matrix;
            if (point.x != i9 || point.y != i10) {
                point.set(i9, i10);
                z2 = true;
            }
            z |= z2;
        } else if (view.getWidth() != 0 && view.getHeight() != 0) {
            int width2 = view.getWidth();
            int height2 = view.getHeight();
            Point point2 = (Point) binaryBitmap.matrix;
            if (point2.x != width2 || point2.y != height2) {
                point2.set(width2, height2);
                z2 = true;
            }
            z |= z2;
        }
        if (z) {
            checkAvailable(true);
            if (((PipSource) tooltipPopup.mTmpDisplayFrame) == this) {
                PipUtils.applyPictureInPictureParams((LaunchActivity) tooltipPopup.mLayoutParams, this);
                MediaSessionConnector mediaSessionConnector = (MediaSessionConnector) tooltipPopup.mTmpAppPos;
                if (mediaSessionConnector != null) {
                    mediaSessionConnector.setPlayer(this.player);
                }
            }
            ((PipActivityContentLayout) tooltipPopup.mMessageView).invalidate();
        }
    }
}
