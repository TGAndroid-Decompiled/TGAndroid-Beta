package kh;

import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.te1;
public final class d0 extends VideoPlayerHolderBase {
    public final int f15077a;
    public final Object f15078b;

    public d0(Object obj, int i9) {
        this.f15077a = i9;
        this.f15078b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f15077a) {
            case 0:
                return !((e0) this.f15078b).f15142p.f15208j0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f15077a) {
            case 0:
                e0 e0Var = (e0) this.f15078b;
                e0Var.f15133f = true;
                e0Var.f15142p.invalidate();
                return;
            default:
                zf.z1 z1Var = (zf.z1) this.f15078b;
                TextureView textureView = z1Var.F;
                if (textureView != null && !z1Var.B) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new te1(this, 13)).setDuration(200L);
                    return;
                }
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i9) {
        switch (this.f15077a) {
            case 1:
                zf.z1 z1Var = (zf.z1) this.f15078b;
                d0 d0Var = z1Var.D;
                if (d0Var != null) {
                    if (i9 == 4) {
                        d0Var.seekTo(0L);
                        z1Var.D.play();
                        return;
                    } else if (i9 == 1) {
                        d0Var.play();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                super.onStateChanged(z10, i9);
                return;
        }
    }

    @Override
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
        switch (this.f15077a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this, i9, i10, i11, 0));
                return;
            default:
                super.onVideoSizeChanged(i9, i10, i11, f10);
                return;
        }
    }
}
