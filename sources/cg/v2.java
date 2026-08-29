package cg;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class v2 extends VideoPlayerHolderBase {
    public final int f3428a;
    public final Object f3429b;

    public v2(Object obj, int i10) {
        this.f3428a = i10;
        this.f3429b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f3428a) {
            case 1:
                return !((nh.d0) this.f3429b).f17517p.f17570j0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f3428a) {
            case 0:
                w2 w2Var = (w2) this.f3429b;
                TextureView textureView = w2Var.F;
                if (textureView != null && !w2Var.B) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new ag.m0(this, 4)).setDuration(200L);
                    return;
                }
                return;
            default:
                nh.d0 d0Var = (nh.d0) this.f3429b;
                d0Var.f17508f = true;
                d0Var.f17517p.invalidate();
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        switch (this.f3428a) {
            case 0:
                w2 w2Var = (w2) this.f3429b;
                v2 v2Var = w2Var.D;
                if (v2Var != null) {
                    if (i10 == 4) {
                        v2Var.seekTo(0L);
                        w2Var.D.play();
                        return;
                    } else if (i10 == 1) {
                        v2Var.play();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                super.onStateChanged(z10, i10);
                return;
        }
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
        switch (this.f3428a) {
            case 1:
                AndroidUtilities.runOnUIThread(new nh.c0(this, i10, i11, i12, 0));
                return;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f9);
                return;
        }
    }
}
