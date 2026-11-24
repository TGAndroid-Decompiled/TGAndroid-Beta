package defpackage;

import org.webrtc.RendererCommon;
public final class aic implements RendererCommon.RendererEvents {
    public final iic a;

    public aic(iic iicVar) {
        this.a = iicVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        gm.c3(new f8c(this, (byte) 15));
    }

    @Override
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
        gm.c3(new e1b((byte) 8));
    }
}
