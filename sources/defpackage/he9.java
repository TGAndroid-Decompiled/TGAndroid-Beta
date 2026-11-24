package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class he9 {
    public final ye9 a;

    public he9(ye9 ye9Var) {
        this.a = ye9Var;
    }

    public final void a(lk0 lk0Var) {
        lk0 lk0Var2;
        ye9 ye9Var = this.a;
        ArrayList arrayList = ye9Var.t3;
        int indexOf = arrayList.indexOf(lk0Var);
        if (indexOf >= 0 && ye9.t3(lk0Var)) {
            int M3 = ye9Var.M3(indexOf);
            if (M3 >= arrayList.size()) {
                M3 = arrayList.size() - 1;
            }
            ld9 ld9Var = ye9Var.R3;
            if (ld9Var != null) {
                ld9Var.d();
            }
            while (M3 >= indexOf) {
                arrayList.remove(M3);
                M3--;
            }
            lk0 lk0Var3 = null;
            if (indexOf > 0) {
                lk0Var2 = (lk0) arrayList.get(indexOf - 1);
            } else {
                lk0Var2 = null;
            }
            if (lk0Var2 != null && !lk0Var2.i && !ye9.t3(lk0Var2) && !ye9.A3(lk0Var2.b)) {
                lk0Var3 = lk0Var2;
            }
            if (arrayList.isEmpty()) {
                lk0Var3 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(lk0Var3);
            }
            ye9Var.g3.O(false);
            ld9 ld9Var2 = ye9Var.R3;
            if (ld9Var2 != null) {
                ld9Var2.h();
            }
            if (lk0Var3 != null) {
                ye9Var.post(new sd9(ye9Var, lk0Var3, (byte) 22));
            }
        }
    }
}
