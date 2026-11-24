package defpackage;

import org.webrtc.RendererCommon;
public final class xa5 implements RendererCommon.RendererEvents {
    public final ya5 a;

    public xa5(ya5 ya5Var) {
        this.a = ya5Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        gm.c3(new wa5(this.a, (byte) 0));
    }

    @Override
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
        gm.c3(new wa5(this.a, (byte) 1));
    }
}
