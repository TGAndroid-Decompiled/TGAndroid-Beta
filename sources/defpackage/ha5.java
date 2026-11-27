package defpackage;

import java.util.ArrayList;
import org.webrtc.RendererCommon;
public final class ha5 implements RendererCommon.RendererEvents {
    public final ka5 a;

    public ha5(ka5 ka5Var) {
        this.a = ka5Var;
    }

    @Override
    public final void onFirstFrameRendered() {
        ArrayList arrayList = this.a.m0;
        for (int i = 0; i < arrayList.size(); i++) {
            hl.r((Runnable) arrayList.get(i));
            ((Runnable) arrayList.get(i)).run();
        }
        arrayList.clear();
    }

    @Override
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }
}
