package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wn5 extends yc8 {
    public final ArrayList a;
    public final zn5 b;

    public wn5(zn5 zn5Var, ArrayList arrayList) {
        this.b = zn5Var;
        this.a = arrayList;
    }

    @Override
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        this.b.s((no6) this.a.get(0));
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        yn5 yn5Var = this.b.b;
        if (yn5Var == null) {
            return null;
        }
        return yn5Var.getCloseIntoObject();
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
