package defpackage;

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;
public final class vz3 implements Runnable {
    public final byte a;
    public final e34 b;

    public vz3(e34 e34Var, byte b) {
        this.a = b;
        this.b = e34Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        e34 e34Var = this.b;
        switch (b) {
            case 0:
                e34Var.Y(false);
                e34Var.B();
                return;
            case 1:
                o14 o14Var = e34Var.S;
                if (o14Var != null) {
                    o14Var.F(true);
                    return;
                }
                return;
            case 2:
                f24 f24Var = e34Var.u1;
                if (f24Var != null) {
                    f24Var.s(e34Var.S.h);
                    return;
                }
                return;
            case 3:
                f24 f24Var2 = e34Var.u1;
                if (f24Var2 != null) {
                    f24Var2.p();
                    return;
                }
                return;
            case 4:
                e34Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", z8c.h(e34Var.d1).e());
                e34Var.Z1.presentFragment(new yv1(bundle));
                return;
            default:
                ArrayList<s14> emojipacks = e34Var.getEmojipacks();
                for (int i = 0; i < emojipacks.size(); i++) {
                    if (emojipacks.get(i).i) {
                        SparseIntArray sparseIntArray = e34Var.S.s;
                        char[] cArr = zx3.a;
                        int i2 = sparseIntArray.get(i + 8);
                        e34Var.Q.D0();
                        e34Var.U(i2);
                        e34Var.E(i2, gm.L(-9.0f));
                        e34Var.j(0, null);
                    }
                }
                return;
        }
    }
}
