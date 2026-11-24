package defpackage;

import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class a83 implements z29, ed {
    public final e83 a;

    public a83(e83 e83Var) {
        this.a = e83Var;
    }

    @Override
    public final int run() {
        e83 e83Var = this.a;
        ArrayList arrayList = e83Var.k3;
        int i = 0;
        while (true) {
            if (i < arrayList.size()) {
                if (((z73) arrayList.get(i)).a == 5) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return -1;
        }
        e83Var.h3.g1(i, gl.L(60.0f));
        return i;
    }

    @Override
    public final void u(hd hdVar, int i) {
        int i2;
        int i3;
        int i4;
        e83 e83Var = this.a;
        h83 h83Var = e83Var.w3;
        ArrayList arrayList = e83Var.n3;
        arrayList.clear();
        int i5 = 0;
        while (true) {
            d83[] d83VarArr = e83Var.o3;
            if (i5 >= d83VarArr.length) {
                i2 = ((d) h83Var).currentAccount;
                yxa.c(i2).l(0);
                i3 = ((d) h83Var).currentAccount;
                yxa.c(i3).l(1);
                i4 = ((d) h83Var).currentAccount;
                yxa.c(i4).l(2);
                e83Var.f3 = true;
                e83Var.C1();
                e83Var.D1(true);
                return;
            }
            d83 d83Var = d83VarArr[i5];
            if (d83Var.c > 0) {
                arrayList.add(Integer.valueOf(d83Var.d));
            }
            i5++;
        }
    }
}
