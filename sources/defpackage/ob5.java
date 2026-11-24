package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ob5 implements Runnable {
    public final byte a;
    public final qb5 b;
    public final String c;
    public final int d;

    public ob5(qb5 qb5Var, String str, int i, byte b) {
        this.a = b;
        this.b = qb5Var;
        this.c = str;
        this.d = i;
    }

    @Override
    public final void run() {
        long j;
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                qb5 qb5Var = this.b;
                String str = this.c;
                int i = this.d;
                if (qb5Var.e != null) {
                    qb5Var.e = null;
                    gl.d3(new ob5(qb5Var, str, i, (byte) 1));
                    return;
                }
                return;
            default:
                qb5 qb5Var2 = this.b;
                String str2 = this.c;
                int i2 = this.d;
                qb5Var2.e = null;
                if (!hc2.T(qb5Var2.x.P1) && qb5Var2.x.Q1 != null) {
                    arrayList = new ArrayList(qb5Var2.x.Q1.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.g.c(new tn6(qb5Var2, str2, i2, arrayList2, (byte) 26));
                } else {
                    qb5Var2.h = false;
                }
                zr9 zr9Var = qb5Var2.d;
                boolean w = hc2.w(3, qb5Var2.x.P1);
                if (hc2.T(qb5Var2.x.P1)) {
                    j = qb5Var2.x.P1.id;
                } else {
                    j = 0;
                }
                zr9Var.g(str2, w, false, true, false, j, false, 2, i2);
                return;
        }
    }
}
