package defpackage;

import org.webrtc.RendererCommon;
public final class yfc implements RendererCommon.RendererEvents {
    public final hgc a;

    public yfc(hgc hgcVar) {
        this.a = hgcVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        gl.c3(new kbc(this, (byte) 6));
    }

    @Override
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }
}
