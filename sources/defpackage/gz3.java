package defpackage;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class gz3 implements Runnable {
    public final byte a;
    public final o24 b;

    public gz3(o24 o24Var, byte b) {
        this.a = b;
        this.b = o24Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        o24 o24Var = this.b;
        switch (b) {
            case 0:
                o24Var.X(false);
                o24Var.C();
                return;
            case 1:
                y04 y04Var = o24Var.S;
                if (y04Var != null) {
                    y04Var.F(true);
                    return;
                }
                return;
            case 2:
                p14 p14Var = o24Var.u1;
                if (p14Var != null) {
                    p14Var.s(o24Var.S.h);
                    return;
                }
                return;
            case 3:
                ArrayList<c14> emojipacks = o24Var.getEmojipacks();
                for (int i = 0; i < emojipacks.size(); i++) {
                    if (emojipacks.get(i).i) {
                        SparseIntArray sparseIntArray = o24Var.S.s;
                        char[] cArr = jx3.a;
                        int i2 = sparseIntArray.get(i + 8);
                        o24Var.Q.E0();
                        o24Var.U(i2);
                        o24Var.E(i2, hl.L(-9.0f));
                        o24Var.j(0, null);
                    }
                }
                return;
            case 4:
                p14 p14Var2 = o24Var.u1;
                if (p14Var2 != null) {
                    p14Var2.p();
                    return;
                }
                return;
            default:
                o24Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", yac.h(o24Var.d1).e());
                o24Var.Z1.presentFragment(new zu1(bundle));
                return;
        }
    }
}
