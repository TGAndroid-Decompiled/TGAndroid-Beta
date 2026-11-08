package fi;

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.s81;
public final class c0 extends VideoPlayerHolderBase {
    public final int f11720a;
    public final Object f11721b;

    public c0(Object obj, int i7) {
        this.f11720a = i7;
        this.f11721b = obj;
    }

    @Override
    public boolean needRepeat() {
        switch (this.f11720a) {
            case 0:
                return !((d0) this.f11721b).f11781p.f11840n0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        switch (this.f11720a) {
            case 0:
                d0 d0Var = (d0) this.f11721b;
                d0Var.f11772f = true;
                d0Var.f11781p.invalidate();
                return;
            default:
                ug.t1 t1Var = (ug.t1) this.f11721b;
                TextureView textureView = t1Var.J;
                if (textureView != null && !t1Var.F) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new s81(this, 19)).setDuration(200L);
                    return;
                }
                return;
        }
    }

    @Override
    public void onStateChanged(boolean z9, int i7) {
        switch (this.f11720a) {
            case 1:
                ug.t1 t1Var = (ug.t1) this.f11721b;
                c0 c0Var = t1Var.H;
                if (c0Var != null) {
                    if (i7 == 4) {
                        c0Var.seekTo(0L);
                        t1Var.H.play();
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
                super.onStateChanged(z9, i7);
                return;
        }
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        switch (this.f11720a) {
            case 0:
                org.telegram.messenger.g0.h3(new b0(this, i7, i10, i11, 0));
                return;
            default:
                super.onVideoSizeChanged(i7, i10, i11, f10);
                return;
        }
    }
}
