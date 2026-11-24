package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class md5 implements Runnable {
    public final byte a;
    public final od5 b;
    public final String c;
    public final int d;

    public md5(od5 od5Var, String str, int i, byte b) {
        this.a = b;
        this.b = od5Var;
        this.c = str;
        this.d = i;
    }

    @Override
    public final void run() {
        long j;
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                od5 od5Var = this.b;
                String str = this.c;
                int i = this.d;
                if (od5Var.e != null) {
                    od5Var.e = null;
                    gm.c3(new md5(od5Var, str, i, (byte) 1));
                    return;
                }
                return;
            default:
                od5 od5Var2 = this.b;
                String str2 = this.c;
                int i2 = this.d;
                od5Var2.e = null;
                if (!sd2.T(od5Var2.x.P1) && od5Var2.x.Q1 != null) {
                    arrayList = new ArrayList(od5Var2.x.Q1.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.g.c(new up6(od5Var2, str2, i2, arrayList2, (byte) 27));
                } else {
                    od5Var2.h = false;
                }
                bu9 bu9Var = od5Var2.d;
                boolean w = sd2.w(3, od5Var2.x.P1);
                if (sd2.T(od5Var2.x.P1)) {
                    j = od5Var2.x.P1.id;
                } else {
                    j = 0;
                }
                bu9Var.g(str2, w, false, true, false, j, false, 2, i2);
                return;
        }
    }
}
