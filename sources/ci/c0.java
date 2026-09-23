package ci;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class c0 extends VideoPlayerHolderBase {
    public final int f4428a;
    public final Object f4429b;

    public c0(Object obj, int i10) {
        this.f4428a = i10;
        this.f4429b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f4428a) {
            case 0:
                return !((d0) this.f4429b).f4490p.f4577n0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f4428a) {
            case 0:
                d0 d0Var = (d0) this.f4429b;
                d0Var.f4481f = true;
                d0Var.f4490p.invalidate();
                return;
            default:
                rg.z1 z1Var = (rg.z1) this.f4429b;
                TextureView textureView = z1Var.J;
                if (textureView != null && !z1Var.F) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new qg.n0(this, 4)).setDuration(200L);
                    return;
                }
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        switch (this.f4428a) {
            case 1:
                rg.z1 z1Var = (rg.z1) this.f4429b;
                c0 c0Var = z1Var.H;
                if (c0Var != null) {
                    if (i10 == 4) {
                        c0Var.seekTo(0L);
                        z1Var.H.play();
                        return;
                    } else if (i10 == 1) {
                        c0Var.play();
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
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        switch (this.f4428a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this, i10, i11, i12, 0));
                return;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f7);
                return;
        }
    }
}
