package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class w22 implements Runnable {
    public final byte a;
    public final x22 b;
    public final String c;
    public final int d;

    public w22(x22 x22Var, String str, int i, byte b) {
        this.a = b;
        this.b = x22Var;
        this.c = str;
        this.d = i;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                x22 x22Var = this.b;
                String str = this.c;
                int i = this.d;
                x22Var.getClass();
                hl.c3(new w22(x22Var, str, i, (byte) 1));
                return;
            default:
                x22 x22Var2 = this.b;
                String str2 = this.c;
                int i2 = this.d;
                x22Var2.getClass();
                int i3 = yac.t0;
                Utilities.g.c(new iz0(x22Var2, str2, new ArrayList(lv2.r(i3).Z.values()), new ArrayList(lv2.r(i3).f0), i3, i2));
                return;
        }
    }
}
