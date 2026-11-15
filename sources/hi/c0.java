package hi;

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.g71;
public final class c0 extends VideoPlayerHolderBase {
    public final int f13955a;
    public final Object f13956b;

    public c0(Object obj, int i7) {
        this.f13955a = i7;
        this.f13956b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f13955a) {
            case 0:
                return !((d0) this.f13956b).f14085p.f14211o0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f13955a) {
            case 0:
                d0 d0Var = (d0) this.f13956b;
                d0Var.f14076f = true;
                d0Var.f14085p.invalidate();
                return;
            default:
                ug.w1 w1Var = (ug.w1) this.f13956b;
                TextureView textureView = w1Var.K;
                if (textureView != null && !w1Var.G) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new g71(this, 20)).setDuration(200L);
                    return;
                }
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        switch (this.f13955a) {
            case 1:
                ug.w1 w1Var = (ug.w1) this.f13956b;
                c0 c0Var = w1Var.I;
                if (c0Var != null) {
                    if (i7 == 4) {
                        c0Var.seekTo(0L);
                        w1Var.I.play();
                        return;
                    } else if (i7 == 1) {
                        c0Var.play();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                super.onStateChanged(z10, i7);
                return;
        }
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        switch (this.f13955a) {
            case 0:
                org.telegram.messenger.g0.h3(new b0(this, i7, i10, i11, 0));
                return;
            default:
                super.onVideoSizeChanged(i7, i10, i11, f10);
                return;
        }
    }
}
