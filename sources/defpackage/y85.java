package defpackage;

import org.webrtc.RendererCommon;
public final class y85 implements RendererCommon.RendererEvents {
    public final z85 a;

    public y85(z85 z85Var) {
        this.a = z85Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        gl.d3(new x85(this.a, (byte) 0));
    }

    @Override
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
        gl.d3(new x85(this.a, (byte) 1));
    }
}
