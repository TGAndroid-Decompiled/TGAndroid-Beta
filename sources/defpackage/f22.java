package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f22 implements Runnable {
    public final byte a;
    public final g22 b;
    public final String c;
    public final int d;

    public f22(g22 g22Var, String str, int i, byte b) {
        this.a = b;
        this.b = g22Var;
        this.c = str;
        this.d = i;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                g22 g22Var = this.b;
                String str = this.c;
                int i = this.d;
                g22Var.getClass();
                gl.d3(new f22(g22Var, str, i, (byte) 1));
                return;
            default:
                g22 g22Var2 = this.b;
                String str2 = this.c;
                int i2 = this.d;
                g22Var2.getClass();
                int i3 = y6c.t0;
                Utilities.g.c(new az0(g22Var2, str2, new ArrayList(qu2.r(i3).Z.values()), new ArrayList(qu2.r(i3).f0), i3, i2));
                return;
        }
    }
}
