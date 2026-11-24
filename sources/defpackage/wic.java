package defpackage;

import org.webrtc.RendererCommon;
public final class wic implements RendererCommon.RendererEvents {
    @Override
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
        gm.c3(new e1b((byte) 8));
    }

    @Override
    public final void onFirstFrameRendered() {
    }
}
