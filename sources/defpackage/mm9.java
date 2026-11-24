package defpackage;

import java.util.ArrayList;
public final class mm9 implements un9 {
    public final nm9 a;

    public mm9(nm9 nm9Var) {
        this.a = nm9Var;
    }

    @Override
    public final void onRejoinRequested() {
        gl.c3(new zk9(this, (byte) 3));
    }

    @Override
    public final void onStreamChannels(ArrayList arrayList) {
        gl.c3(new tj9(this, arrayList, (byte) 7));
    }
}
