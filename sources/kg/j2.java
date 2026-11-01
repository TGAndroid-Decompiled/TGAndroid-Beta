package kg;

import android.view.TextureView;
import bi.b3;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class j2 extends VideoPlayerHolderBase {
    public final int f11134a;
    public final Object f11135b;

    public j2(Object obj, int i10) {
        this.f11134a = i10;
        this.f11135b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f11134a) {
            case 1:
                return !((vh.w) this.f11135b).f52099p.f52156n0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f11134a) {
            case 0:
                k2 k2Var = (k2) this.f11135b;
                TextureView textureView = k2Var.J;
                if (textureView != null && !k2Var.F) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new bg.e(this, 8)).setDuration(200L);
                    return;
                }
                return;
            default:
                vh.w wVar = (vh.w) this.f11135b;
                wVar.f52090f = true;
                wVar.f52099p.invalidate();
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        switch (this.f11134a) {
            case 0:
                k2 k2Var = (k2) this.f11135b;
                j2 j2Var = k2Var.H;
                if (j2Var != null) {
                    if (i10 == 4) {
                        j2Var.seekTo(0L);
                        k2Var.H.play();
                        return;
                    } else if (i10 == 1) {
                        j2Var.play();
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
        switch (this.f11134a) {
            case 1:
                org.telegram.messenger.i0.g3(new b3(this, i10, i11, i12, 3));
                return;
            default:
                super.onVideoSizeChanged(i10, i11, i12, f7);
                return;
        }
    }
}
