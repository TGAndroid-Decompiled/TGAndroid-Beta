package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class yh9 {
    public final pi9 a;

    public yh9(pi9 pi9Var) {
        this.a = pi9Var;
    }

    public final void a(mk0 mk0Var) {
        mk0 mk0Var2;
        pi9 pi9Var = this.a;
        ArrayList arrayList = pi9Var.t3;
        int indexOf = arrayList.indexOf(mk0Var);
        if (indexOf >= 0 && pi9.u3(mk0Var)) {
            int N3 = pi9Var.N3(indexOf);
            if (N3 >= arrayList.size()) {
                N3 = arrayList.size() - 1;
            }
            ch9 ch9Var = pi9Var.R3;
            if (ch9Var != null) {
                ch9Var.d();
            }
            while (N3 >= indexOf) {
                arrayList.remove(N3);
                N3--;
            }
            mk0 mk0Var3 = null;
            if (indexOf > 0) {
                mk0Var2 = (mk0) arrayList.get(indexOf - 1);
            } else {
                mk0Var2 = null;
            }
            if (mk0Var2 != null && !mk0Var2.i && !pi9.u3(mk0Var2) && !pi9.B3(mk0Var2.b)) {
                mk0Var3 = mk0Var2;
            }
            if (arrayList.isEmpty()) {
                mk0Var3 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(mk0Var3);
            }
            pi9Var.g3.O(false);
            ch9 ch9Var2 = pi9Var.R3;
            if (ch9Var2 != null) {
                ch9Var2.h();
            }
            if (mk0Var3 != null) {
                pi9Var.post(new jh9(pi9Var, mk0Var3, (byte) 23));
            }
        }
    }
}
