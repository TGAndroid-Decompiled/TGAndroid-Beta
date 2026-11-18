package hi;

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.k71;
public final class d0 extends VideoPlayerHolderBase {
    public final int f14354a;
    public final Object f14355b;

    public d0(Object obj, int i7) {
        this.f14354a = i7;
        this.f14355b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f14354a) {
            case 0:
                return !((e0) this.f14355b).f14519p.f14626o0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f14354a) {
            case 0:
                e0 e0Var = (e0) this.f14355b;
                e0Var.f14510f = true;
                e0Var.f14519p.invalidate();
                return;
            default:
                ug.x1 x1Var = (ug.x1) this.f14355b;
                TextureView textureView = x1Var.K;
                if (textureView != null && !x1Var.G) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new k71(this, 20)).setDuration(200L);
                    return;
                }
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        switch (this.f14354a) {
            case 1:
                ug.x1 x1Var = (ug.x1) this.f14355b;
                d0 d0Var = x1Var.I;
                if (d0Var != null) {
                    if (i7 == 4) {
                        d0Var.seekTo(0L);
                        x1Var.I.play();
                        return;
                    } else if (i7 == 1) {
                        d0Var.play();
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
        switch (this.f14354a) {
            case 0:
                org.telegram.messenger.g0.g3(new c0(this, i7, i10, i11, 0));
                return;
            default:
                super.onVideoSizeChanged(i7, i10, i11, f10);
                return;
        }
    }
}
