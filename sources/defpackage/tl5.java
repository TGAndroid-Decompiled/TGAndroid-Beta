package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tl5 extends i98 {
    public final ArrayList a;
    public final wl5 b;

    public tl5(wl5 wl5Var, ArrayList arrayList) {
        this.b = wl5Var;
        this.a = arrayList;
    }

    @Override
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        this.b.s((jm6) this.a.get(0));
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        vl5 vl5Var = this.b.b;
        if (vl5Var == null) {
            return null;
        }
        return vl5Var.getCloseIntoObject();
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final boolean y() {
        return false;
    }
}
