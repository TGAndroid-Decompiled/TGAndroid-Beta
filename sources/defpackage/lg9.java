package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class lg9 {
    public final ch9 a;

    public lg9(ch9 ch9Var) {
        this.a = ch9Var;
    }

    public final void a(ll0 ll0Var) {
        ll0 ll0Var2;
        ch9 ch9Var = this.a;
        ArrayList arrayList = ch9Var.t3;
        int indexOf = arrayList.indexOf(ll0Var);
        if (indexOf >= 0 && ch9.t3(ll0Var)) {
            int M3 = ch9Var.M3(indexOf);
            if (M3 >= arrayList.size()) {
                M3 = arrayList.size() - 1;
            }
            of9 of9Var = ch9Var.R3;
            if (of9Var != null) {
                of9Var.d();
            }
            while (M3 >= indexOf) {
                arrayList.remove(M3);
                M3--;
            }
            ll0 ll0Var3 = null;
            if (indexOf > 0) {
                ll0Var2 = (ll0) arrayList.get(indexOf - 1);
            } else {
                ll0Var2 = null;
            }
            if (ll0Var2 != null && !ll0Var2.i && !ch9.t3(ll0Var2) && !ch9.A3(ll0Var2.b)) {
                ll0Var3 = ll0Var2;
            }
            if (arrayList.isEmpty()) {
                ll0Var3 = new ll0(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(ll0Var3);
            }
            ch9Var.g3.O(false);
            of9 of9Var2 = ch9Var.R3;
            if (of9Var2 != null) {
                of9Var2.h();
            }
            if (ll0Var3 != null) {
                ch9Var.post(new vf9(ch9Var, ll0Var3, (byte) 22));
            }
        }
    }
}
