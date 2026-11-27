package defpackage;

import org.webrtc.RendererCommon;
public final class ab5 implements RendererCommon.RendererEvents {
    public final bb5 a;

    public ab5(bb5 bb5Var) {
        this.a = bb5Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        hl.c3(new ea5(this.a, (byte) 2));
    }

    @Override
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
        hl.c3(new ea5(this.a, (byte) 2));
    }
}
