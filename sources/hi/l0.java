package hi;

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.i71;
public final class l0 extends VideoPlayerHolderBase {
    public final int f14807a;
    public final Object f14808b;

    public l0(Object obj, int i7) {
        this.f14807a = i7;
        this.f14808b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f14807a) {
            case 0:
                return !((m0) this.f14808b).f14877p.f14983o0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f14807a) {
            case 0:
                m0 m0Var = (m0) this.f14808b;
                m0Var.f14868f = true;
                m0Var.f14877p.invalidate();
                return;
            default:
                ug.x1 x1Var = (ug.x1) this.f14808b;
                TextureView textureView = x1Var.K;
                if (textureView != null && !x1Var.G) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new i71(this, 20)).setDuration(200L);
                    return;
                }
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        switch (this.f14807a) {
            case 1:
                ug.x1 x1Var = (ug.x1) this.f14808b;
                l0 l0Var = x1Var.I;
                if (l0Var != null) {
                    if (i7 == 4) {
                        l0Var.seekTo(0L);
                        x1Var.I.play();
                        return;
                    } else if (i7 == 1) {
                        l0Var.play();
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
        switch (this.f14807a) {
            case 0:
                org.telegram.messenger.g0.g3(new k0(this, i7, i10, i11, 0));
                return;
            default:
                super.onVideoSizeChanged(i7, i10, i11, f10);
                return;
        }
    }
}
