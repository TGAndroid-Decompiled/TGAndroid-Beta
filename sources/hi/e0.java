package hi;

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.k71;
public final class e0 extends VideoPlayerHolderBase {
    public final int f14579a;
    public final Object f14580b;

    public e0(Object obj, int i7) {
        this.f14579a = i7;
        this.f14580b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f14579a) {
            case 0:
                return !((f0) this.f14580b).f14625p.f14681o0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f14579a) {
            case 0:
                f0 f0Var = (f0) this.f14580b;
                f0Var.f14616f = true;
                f0Var.f14625p.invalidate();
                return;
            default:
                ug.w1 w1Var = (ug.w1) this.f14580b;
                TextureView textureView = w1Var.K;
                if (textureView != null && !w1Var.G) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new k71(this, 20)).setDuration(200L);
                    return;
                }
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        switch (this.f14579a) {
            case 1:
                ug.w1 w1Var = (ug.w1) this.f14580b;
                e0 e0Var = w1Var.I;
                if (e0Var != null) {
                    if (i7 == 4) {
                        e0Var.seekTo(0L);
                        w1Var.I.play();
                        return;
                    } else if (i7 == 1) {
                        e0Var.play();
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
        switch (this.f14579a) {
            case 0:
                org.telegram.messenger.g0.g3(new d0(this, i7, i10, i11, 0));
                return;
            default:
                super.onVideoSizeChanged(i7, i10, i11, f10);
                return;
        }
    }
}
