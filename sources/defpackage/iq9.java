package defpackage;

import java.util.ArrayList;
public final class iq9 implements lr9 {
    public final kq9 a;

    public iq9(kq9 kq9Var) {
        this.a = kq9Var;
    }

    @Override
    public final void onRejoinRequested() {
        hl.c3(new v59(this, (byte) 20));
    }

    @Override
    public final void onStreamChannels(ArrayList arrayList) {
        hl.c3(new dn9(this, arrayList, (byte) 9));
    }
}
