package defpackage;

import org.webrtc.RendererCommon;
public final class vgc implements RendererCommon.RendererEvents {
    @Override
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
        gl.c3(new cza((byte) 8));
    }

    @Override
    public final void onFirstFrameRendered() {
    }
}
