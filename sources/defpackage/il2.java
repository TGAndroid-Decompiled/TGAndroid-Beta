package defpackage;

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class il2 extends VideoPlayerHolderBase {
    public final byte a;
    public final Object b;

    public il2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean needRepeat() {
        switch (this.a) {
            case 0:
                return !((jl2) this.b).p.o0;
            default:
                return super.needRepeat();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                jl2 jl2Var = (jl2) obj;
                jl2Var.f = true;
                jl2Var.p.invalidate();
                return;
            default:
                yfc yfcVar = (yfc) obj;
                TextureView textureView = yfcVar.K;
                if (textureView != null && !yfcVar.G) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new omb(this, (byte) 15)).setDuration(200L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        switch (this.a) {
            case 1:
                yfc yfcVar = (yfc) this.b;
                il2 il2Var = yfcVar.I;
                if (il2Var != null) {
                    if (i == 4) {
                        il2Var.seekTo(0L);
                        yfcVar.I.play();
                        return;
                    } else if (i == 1) {
                        il2Var.play();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                super.onStateChanged(z, i);
                return;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        switch (this.a) {
            case 0:
                hl.c3(new hl2(this, i, i2, i3, (byte) 0));
                return;
            default:
                super.onVideoSizeChanged(i, i2, i3, f);
                return;
        }
    }
}
