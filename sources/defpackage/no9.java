package defpackage;

import java.util.ArrayList;
public final class no9 implements vp9 {
    public final oo9 a;

    public no9(oo9 oo9Var) {
        this.a = oo9Var;
    }

    @Override
    public final void onRejoinRequested() {
        gm.c3(new kf9(this, (byte) 11));
    }

    @Override
    public final void onStreamChannels(ArrayList arrayList) {
        gm.c3(new il9(this, arrayList, (byte) 9));
    }
}
