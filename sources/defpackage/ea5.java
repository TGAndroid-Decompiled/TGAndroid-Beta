package defpackage;

import java.util.ArrayList;
import org.webrtc.RendererCommon;
public final class ea5 implements RendererCommon.RendererEvents {
    public final ha5 a;

    public ea5(ha5 ha5Var) {
        this.a = ha5Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ArrayList arrayList = this.a.m0;
        for (int i = 0; i < arrayList.size(); i++) {
            gm.r((Runnable) arrayList.get(i));
            ((Runnable) arrayList.get(i)).run();
        }
        arrayList.clear();
    }

    @Override
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }
}
