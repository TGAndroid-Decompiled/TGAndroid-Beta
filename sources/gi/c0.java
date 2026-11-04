package gi;

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.i81;
public final class c0 extends VideoPlayerHolderBase {
    public final int f12475a;
    public final Object f12476b;

    public c0(Object obj, int i3) {
        this.f12475a = i3;
        this.f12476b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f12475a) {
            case 0:
                return !((d0) this.f12476b).f12546p.f12636o0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f12475a) {
            case 0:
                d0 d0Var = (d0) this.f12476b;
                d0Var.f12537f = true;
                d0Var.f12546p.invalidate();
                return;
            default:
                vg.w1 w1Var = (vg.w1) this.f12476b;
                TextureView textureView = w1Var.K;
                if (textureView != null && !w1Var.G) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new i81(this, 19)).setDuration(200L);
                    return;
                }
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i3) {
        switch (this.f12475a) {
            case 1:
                vg.w1 w1Var = (vg.w1) this.f12476b;
                c0 c0Var = w1Var.I;
                if (c0Var != null) {
                    if (i3 == 4) {
                        c0Var.seekTo(0L);
                        w1Var.I.play();
                        return;
                    } else if (i3 == 1) {
                        c0Var.play();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                super.onStateChanged(z10, i3);
                return;
        }
    }

    @Override
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        switch (this.f12475a) {
            case 0:
                org.telegram.messenger.g0.h3(new b0(this, i3, i10, i11, 0));
                return;
            default:
                super.onVideoSizeChanged(i3, i10, i11, f10);
                return;
        }
    }
}
