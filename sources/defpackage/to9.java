package defpackage;

import java.util.ArrayList;
public final class to9 implements vp9 {
    public final vo9 a;

    public to9(vo9 vo9Var) {
        this.a = vo9Var;
    }

    @Override
    public final void onRejoinRequested() {
        gm.c3(new kf9(this, (byte) 12));
    }

    @Override
    public final void onStreamChannels(ArrayList arrayList) {
        gm.c3(new il9(this, arrayList, (byte) 11));
    }
}
