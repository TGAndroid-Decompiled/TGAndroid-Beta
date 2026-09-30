package ci;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class c0 extends VideoPlayerHolderBase {
    public final int f4435a;
    public final Object f4436b;

    public c0(Object obj, int i10) {
        this.f4435a = i10;
        this.f4436b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f4435a) {
            case 0:
                return !((d0) this.f4436b).f4497p.f4584n0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f4435a) {
            case 0:
                d0 d0Var = (d0) this.f4436b;
                d0Var.f4488f = true;
                d0Var.f4497p.invalidate();
                return;
            default:
                rg.z1 z1Var = (rg.z1) this.f4436b;
                TextureView textureView = z1Var.J;
                if (textureView != null && !z1Var.F) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new pg.d0(this, 5)).setDuration(200L);
                    return;
                }
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        switch (this.f4435a) {
            case 1:
                rg.z1 z1Var = (rg.z1) this.f4436b;
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
        switch (this.f4435a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this, i10, i11, i12, 0));
                return;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f7);
                return;
        }
    }
}
