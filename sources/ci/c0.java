package ci;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class c0 extends VideoPlayerHolderBase {
    public final int f4809a;
    public final Object f4810b;

    public c0(Object obj, int i10) {
        this.f4809a = i10;
        this.f4810b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f4809a) {
            case 0:
                return !((d0) this.f4810b).f4891p.f5006n0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f4809a) {
            case 0:
                d0 d0Var = (d0) this.f4810b;
                d0Var.f4882f = true;
                d0Var.f4891p.invalidate();
                return;
            default:
                rg.a2 a2Var = (rg.a2) this.f4810b;
                TextureView textureView = a2Var.J;
                if (textureView != null && !a2Var.F) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new org.telegram.ui.Wallet.z4(this, 11)).setDuration(200L);
                    return;
                }
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        switch (this.f4809a) {
            case 1:
                rg.a2 a2Var = (rg.a2) this.f4810b;
                c0 c0Var = a2Var.H;
                if (c0Var != null) {
                    if (i10 == 4) {
                        c0Var.seekTo(0L);
                        a2Var.H.play();
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
        switch (this.f4809a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this, i10, i11, i12, 0));
                return;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f7);
                return;
        }
    }
}
