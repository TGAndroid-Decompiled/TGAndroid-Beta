package org.telegram.messenger.pip.source;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import com.google.android.exoplayer2.Player;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.PipSourceContentView;
import org.telegram.messenger.pip.activity.IPipActivityAnimationListener;
import org.telegram.messenger.pip.activity.IPipActivityListener;
import org.telegram.messenger.pip.utils.Trigger;
import org.telegram.ui.ActionBar.Theme;

public class PipSourceHandlerState2 implements IPipActivityListener, IPipActivityAnimationListener {
    private PipSourceSnapshot contentBackground;
    private PipSourceSnapshot contentForeground;
    private float lastProgress;
    private float lastRadius;
    public View pictureInPicturePlaceholderView;
    public View pictureInPictureView;
    private PipSourceContentView pictureInPictureWrapperView;
    private PipSourcePlaceholder pipSourcePlaceholder;
    private boolean shouldBeAttached;
    private final PipSource source;
    private int state = 0;
    public final Rect positionSource = new Rect();
    public final Rect position = new Rect();
    private final RectF rect = new RectF();
    private final Path path = new Path();

    @Override
    public void onCompleteEnterToPip() {
        IPipActivityListener.CC.$default$onCompleteEnterToPip(this);
    }

    @Override
    public void onEnterAnimationEnd(long j) {
        IPipActivityAnimationListener.CC.$default$onEnterAnimationEnd(this, j);
    }

    @Override
    public void onEnterAnimationStart(long j) {
        IPipActivityAnimationListener.CC.$default$onEnterAnimationStart(this, j);
    }

    @Override
    public void onLeaveAnimationEnd(long j) {
        IPipActivityAnimationListener.CC.$default$onLeaveAnimationEnd(this, j);
    }

    @Override
    public void onLeaveAnimationStart(long j) {
        IPipActivityAnimationListener.CC.$default$onLeaveAnimationStart(this, j);
    }

    @Override
    public void onStartExitFromPip(boolean z) {
        IPipActivityListener.CC.$default$onStartExitFromPip(this, z);
    }

    public PipSourceHandlerState2(PipSource pipSource) {
        this.source = pipSource;
    }

    private void performPreAttach() {
        if (this.state != 0) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_DETACHED: " + this.state);
            return;
        }
        this.source.params.getPosition(this.positionSource);
        Log.i("PIP_DEBUG", "[HANDLER] pre attach start " + this.positionSource);
        int measuredWidth = this.source.controller.activity.getWindow().getDecorView().getMeasuredWidth();
        int measuredHeight = this.source.controller.activity.getWindow().getDecorView().getMeasuredHeight();
        Bitmap bitmapPipCreatePrimaryWindowViewBitmap = this.source.delegate.pipCreatePrimaryWindowViewBitmap();
        final IPipSourceDelegate iPipSourceDelegate = this.source.delegate;
        Objects.requireNonNull(iPipSourceDelegate);
        this.contentBackground = new PipSourceSnapshot(measuredWidth, measuredHeight, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                iPipSourceDelegate.pipRenderBackground((Canvas) obj);
            }
        });
        final IPipSourceDelegate iPipSourceDelegate2 = this.source.delegate;
        Objects.requireNonNull(iPipSourceDelegate2);
        this.contentForeground = new PipSourceSnapshot(measuredWidth, measuredHeight, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                iPipSourceDelegate2.pipRenderForeground((Canvas) obj);
            }
        });
        this.pictureInPictureView = this.source.delegate.pipCreatePictureInPictureView();
        this.pictureInPicturePlaceholderView = new View(this.source.controller.activity);
        PipSourceContentView pipSourceContentView = new PipSourceContentView(this.source.controller.activity, this);
        this.pictureInPictureWrapperView = pipSourceContentView;
        pipSourceContentView.addView(this.pictureInPicturePlaceholderView);
        this.pictureInPictureWrapperView.addView(this.pictureInPictureView);
        PipSourcePlaceholder pipSourcePlaceholder = new PipSourcePlaceholder(this.pictureInPicturePlaceholderView, this.source.placeholderView);
        this.pipSourcePlaceholder = pipSourcePlaceholder;
        pipSourcePlaceholder.setPlaceholder(bitmapPipCreatePrimaryWindowViewBitmap);
        this.source.controller.getPipContentView().addView(this.pictureInPictureWrapperView);
        this.state = 1;
        this.pictureInPictureWrapperView.invalidate();
        AndroidUtilities.doOnPreDraw(this.pictureInPictureView, Trigger.run(new Trigger.Callback() {
            @Override
            public final void run(boolean z) {
                PipSourceHandlerState2.$r8$lambda$OJ6TCd9j1ASPOaXttSCtHNB46v0(this.f$0, z);
            }
        }, 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre attach end");
    }

    public static void $r8$lambda$OJ6TCd9j1ASPOaXttSCtHNB46v0(final PipSourceHandlerState2 pipSourceHandlerState2, boolean z) {
        pipSourceHandlerState2.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.performAttach();
            }
        });
    }

    public void performAttach() {
        if (this.state != 1) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + this.state);
            return;
        }
        Log.i("PIP_DEBUG", "[HANDLER] attach");
        this.pipSourcePlaceholder.stopPlaceholderForSource();
        this.source.delegate.pipHidePrimaryWindowView(Trigger.run(new Trigger.Callback() {
            @Override
            public final void run(boolean z) {
                PipSourceHandlerState2.$r8$lambda$_0s5XHU7H0igMoPANFvvW2kjXXo(this.f$0, z);
            }
        }, 400L));
        this.state = 2;
        if (this.shouldBeAttached) {
            return;
        }
        performPreDetach1();
    }

    public static void $r8$lambda$_0s5XHU7H0igMoPANFvvW2kjXXo(PipSourceHandlerState2 pipSourceHandlerState2, boolean z) {
        pipSourceHandlerState2.pipSourcePlaceholder.stopPlaceholderForActivity();
        Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z);
    }

    private void performPreDetach1() {
        if (this.state != 2) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_ATTACHED: " + this.state);
            return;
        }
        this.pipSourcePlaceholder.setPlaceholder(this.source.delegate.pipCreatePictureInPictureViewBitmap());
        this.state = 3;
        this.pictureInPictureWrapperView.removeView(this.pictureInPictureView);
        this.pictureInPictureWrapperView.invalidate();
        this.pictureInPictureView = null;
        AndroidUtilities.doOnPreDraw(this.pictureInPictureWrapperView, Trigger.run(new Trigger.Callback() {
            @Override
            public final void run(boolean z) {
                PipSourceHandlerState2.$r8$lambda$n8ccvq7nV2IkZ9Vzn9O72rIal2c(this.f$0, z);
            }
        }, 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 1");
    }

    public static void $r8$lambda$n8ccvq7nV2IkZ9Vzn9O72rIal2c(final PipSourceHandlerState2 pipSourceHandlerState2, boolean z) {
        pipSourceHandlerState2.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.performPreDetach2();
            }
        });
    }

    public void performPreDetach2() {
        if (this.state != 3) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + this.state);
            return;
        }
        this.source.delegate.pipShowPrimaryWindowView(Trigger.run(new Trigger.Callback() {
            @Override
            public final void run(boolean z) {
                PipSourceHandlerState2.$r8$lambda$ZySLOLIvyuM3KbeOOCEW108V4hQ(this.f$0, z);
            }
        }, 400L));
        this.pictureInPictureWrapperView.invalidate();
        this.state = 4;
        AndroidUtilities.doOnPreDraw(this.source.contentView, Trigger.run(new Trigger.Callback() {
            @Override
            public final void run(boolean z) {
                PipSourceHandlerState2.m1116$r8$lambda$5ZF6tf4lCT3nStrKGYxbw_Tsic(this.f$0, z);
            }
        }, 300L));
        Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
    }

    public static void $r8$lambda$ZySLOLIvyuM3KbeOOCEW108V4hQ(PipSourceHandlerState2 pipSourceHandlerState2, boolean z) {
        pipSourceHandlerState2.getClass();
        Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z);
        final PipSourcePlaceholder pipSourcePlaceholder = pipSourceHandlerState2.pipSourcePlaceholder;
        Objects.requireNonNull(pipSourcePlaceholder);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                pipSourcePlaceholder.stopPlaceholderForSource();
            }
        });
    }

    public static void m1116$r8$lambda$5ZF6tf4lCT3nStrKGYxbw_Tsic(final PipSourceHandlerState2 pipSourceHandlerState2, boolean z) {
        pipSourceHandlerState2.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.performDetach();
            }
        });
    }

    public void performDetach() {
        if (this.state != 4) {
            FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + this.state);
            return;
        }
        this.source.controller.getPipContentView().removeView(this.pictureInPictureWrapperView);
        this.pictureInPictureView = null;
        this.pictureInPictureWrapperView = null;
        this.pictureInPicturePlaceholderView = null;
        PipSourceSnapshot pipSourceSnapshot = this.contentForeground;
        if (pipSourceSnapshot != null) {
            pipSourceSnapshot.release();
            this.contentForeground = null;
        }
        PipSourceSnapshot pipSourceSnapshot2 = this.contentBackground;
        if (pipSourceSnapshot2 != null) {
            pipSourceSnapshot2.release();
            this.contentBackground = null;
        }
        this.pipSourcePlaceholder.stopPlaceholderForActivity();
        this.state = 0;
        Log.i("PIP_DEBUG", "[HANDLER] detach");
        if (this.shouldBeAttached) {
            performPreAttach();
        }
    }

    public void updatePositionViewRect(int i, int i2, boolean z) {
        if (z) {
            this.position.set(0, 0, i, i2);
        } else {
            this.position.set(this.positionSource);
        }
    }

    private void rebuildPath(float f) {
        if (this.lastRadius == f) {
            return;
        }
        this.lastRadius = f;
        this.rect.set(this.position);
        this.path.reset();
        this.path.addRoundRect(this.rect, f, f, Path.Direction.CW);
        this.path.close();
    }

    public void draw(Canvas canvas, Utilities.Callback callback) {
        float f = this.source.cornerRadius * (1.0f - this.lastProgress);
        boolean z = f > 1.0f;
        drawBackground(canvas);
        if (z) {
            rebuildPath(f);
            canvas.save();
            canvas.clipPath(this.path);
        }
        callback.run(canvas);
        drawForeground(canvas);
        if (z) {
            canvas.restore();
        }
    }

    private void drawBackground(Canvas canvas) {
        canvas.drawColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite), (int) Math.min(this.lastProgress * 420.0f, 255.0f)));
        this.contentBackground.draw(canvas, 1.0f);
    }

    private void drawForeground(Canvas canvas) {
        this.contentForeground.draw(canvas, 1.0f - this.lastProgress);
    }

    public boolean isAttachedToPip() {
        return this.state != 0;
    }

    @Override
    public void onPipStashStart() {
        Player player;
        PipSource pipSource = this.source;
        if (pipSource == null || (player = pipSource.getPlayer()) == null) {
            return;
        }
        player.pause();
    }

    @Override
    public void onPipStashEnd() {
        Player player;
        PipSource pipSource = this.source;
        if (pipSource == null || (player = pipSource.getPlayer()) == null) {
            return;
        }
        player.play();
    }

    @Override
    public void onStartEnterToPip() {
        this.shouldBeAttached = true;
        performPreAttach();
    }

    @Override
    public void onCompleteExitFromPip(boolean z) {
        this.shouldBeAttached = false;
        performPreDetach1();
    }

    @Override
    public void onTransitionAnimationFrame() {
        PipSourceContentView pipSourceContentView = this.pictureInPictureWrapperView;
        if (pipSourceContentView != null) {
            pipSourceContentView.invalidate();
        }
    }

    @Override
    public void onTransitionAnimationProgress(float f) {
        this.lastProgress = f;
        PipSourceContentView pipSourceContentView = this.pictureInPictureWrapperView;
        if (pipSourceContentView != null) {
            pipSourceContentView.invalidate();
        }
    }

    public void onReceiveMaxPriority() {
        this.source.controller.addPipListener(this);
        this.source.controller.addAnimationListener(this);
        PipSource pipSource = this.source;
        pipSource.controller.addActionListener(pipSource.tag, null);
    }

    public void onLoseMaxPriority() {
        this.shouldBeAttached = false;
        performPreDetach1();
        this.source.controller.removePipListener(this);
        this.source.controller.removeAnimationListener(this);
        PipSource pipSource = this.source;
        pipSource.controller.removeActionListener(pipSource.tag, null);
    }
}
