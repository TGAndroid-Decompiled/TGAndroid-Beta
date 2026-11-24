package defpackage;

import android.view.TextureView;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class am2 extends VideoPlayerHolderBase {
    public final byte a;
    public final Object b;

    public am2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean needRepeat() {
        switch (this.a) {
            case 0:
                return !((bm2) this.b).p.o0;
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
                bm2 bm2Var = (bm2) obj;
                bm2Var.f = true;
                bm2Var.p.invalidate();
                return;
            default:
                bec becVar = (bec) obj;
                TextureView textureView = becVar.K;
                if (textureView != null && !becVar.G) {
                    textureView.setAlpha(0.0f);
                    textureView.animate().alpha(1.0f).setListener(new q7b(this, (byte) 18)).setDuration(200L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        switch (this.a) {
            case 1:
                bec becVar = (bec) this.b;
                am2 am2Var = becVar.I;
                if (am2Var != null) {
                    if (i == 4) {
                        am2Var.seekTo(0L);
                        becVar.I.play();
                        return;
                    } else if (i == 1) {
                        am2Var.play();
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
                gm.c3(new zl2(this, i, i2, i3, (byte) 0));
                return;
            default:
                super.onVideoSizeChanged(i, i2, i3, f);
                return;
        }
    }
}
