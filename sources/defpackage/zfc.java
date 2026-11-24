package defpackage;

import org.webrtc.RendererCommon;
public final class zfc implements RendererCommon.RendererEvents {
    public final hgc a;

    public zfc(hgc hgcVar) {
        this.a = hgcVar;
    }

    @Override
    public final void onFirstFrameRendered() {
        gl.c3(new kbc(this, (byte) 7));
    }

    @Override
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
        gl.c3(new cza((byte) 8));
    }
}
