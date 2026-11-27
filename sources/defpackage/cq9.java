package defpackage;

import java.util.ArrayList;
public final class cq9 implements lr9 {
    public final dq9 a;

    public cq9(dq9 dq9Var) {
        this.a = dq9Var;
    }

    @Override
    public final void onRejoinRequested() {
        hl.c3(new v59(this, (byte) 19));
    }

    @Override
    public final void onStreamChannels(ArrayList arrayList) {
        hl.c3(new en9(this, arrayList, (byte) 6));
    }
}
