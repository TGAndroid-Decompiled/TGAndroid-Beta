package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class pd5 implements Runnable {
    public final byte a;
    public final rd5 b;
    public final String c;
    public final int d;

    public pd5(rd5 rd5Var, String str, int i, byte b) {
        this.a = b;
        this.b = rd5Var;
        this.c = str;
        this.d = i;
    }

    @Override
    public final void run() {
        long j;
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                rd5 rd5Var = this.b;
                String str = this.c;
                int i = this.d;
                if (rd5Var.e != null) {
                    rd5Var.e = null;
                    hl.c3(new pd5(rd5Var, str, i, (byte) 1));
                    return;
                }
                return;
            default:
                rd5 rd5Var2 = this.b;
                String str2 = this.c;
                int i2 = this.d;
                rd5Var2.e = null;
                if (!xc2.T(rd5Var2.x.P1) && rd5Var2.x.Q1 != null) {
                    arrayList = new ArrayList(rd5Var2.x.Q1.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.g.c(new gp6(rd5Var2, str2, i2, arrayList2, (byte) 27));
                } else {
                    rd5Var2.h = false;
                }
                sv9 sv9Var = rd5Var2.d;
                boolean w = xc2.w(3, rd5Var2.x.P1);
                if (xc2.T(rd5Var2.x.P1)) {
                    j = rd5Var2.x.P1.id;
                } else {
                    j = 0;
                }
                sv9Var.g(str2, w, false, true, false, j, false, 2, i2);
                return;
        }
    }
}
