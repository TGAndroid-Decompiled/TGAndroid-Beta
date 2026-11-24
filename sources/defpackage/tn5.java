package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tn5 extends jb8 {
    public final ArrayList a;
    public final wn5 b;

    public tn5(wn5 wn5Var, ArrayList arrayList) {
        this.b = wn5Var;
        this.a = arrayList;
    }

    @Override
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        this.b.s((jo6) this.a.get(0));
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        vn5 vn5Var = this.b.b;
        if (vn5Var == null) {
            return null;
        }
        return vn5Var.getCloseIntoObject();
    }

    @Override
    public final boolean U() {
        return false;
    }

    @Override
    public final boolean y() {
        return false;
    }
}
