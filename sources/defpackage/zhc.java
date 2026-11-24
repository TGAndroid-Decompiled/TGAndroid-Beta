package defpackage;

import org.webrtc.RendererCommon;
public final class zhc implements RendererCommon.RendererEvents {
    public final iic a;

    public zhc(iic iicVar) {
        this.a = iicVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        gm.c3(new f8c(this, (byte) 14));
    }

    @Override
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }
}
