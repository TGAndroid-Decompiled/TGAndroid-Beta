package defpackage;

import java.util.ArrayList;
import org.webrtc.RendererCommon;
public final class e85 implements RendererCommon.RendererEvents {
    public final h85 a;

    public e85(h85 h85Var) {
        this.a = h85Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ArrayList arrayList = this.a.m0;
        for (int i = 0; i < arrayList.size(); i++) {
            gl.r((Runnable) arrayList.get(i));
            ((Runnable) arrayList.get(i)).run();
        }
        arrayList.clear();
    }

    @Override
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }
}
