package defpackage;

import java.util.ArrayList;
public final class sm9 implements un9 {
    public final um9 a;

    public sm9(um9 um9Var) {
        this.a = um9Var;
    }

    @Override
    public final void onRejoinRequested() {
        gl.d3(new zk9(this, (byte) 4));
    }

    @Override
    public final void onStreamChannels(ArrayList arrayList) {
        gl.d3(new tj9(this, arrayList, (byte) 9));
    }
}
