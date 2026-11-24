package defpackage;

import java.io.File;
import org.telegram.messenger.Utilities;
public final class jm5 implements Runnable {
    public final byte a;
    public final fn5 b;
    public final String c;

    public jm5(fn5 fn5Var, String str, byte b) {
        this.a = b;
        this.b = fn5Var;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        fn5 fn5Var = this.b;
        switch (b) {
            case 0:
                tm5 tm5Var = (tm5) fn5Var.g.get(str);
                if (tm5Var != null) {
                    sm5 sm5Var = tm5Var.s;
                    if (sm5Var != null) {
                        sm5 sm5Var2 = new sm5(fn5Var, sm5Var.a);
                        tm5Var.s = sm5Var2;
                        fn5Var.o.add(sm5Var2);
                    }
                    fn5Var.P(false);
                    return;
                }
                return;
            case 1:
                tm5 tm5Var2 = (tm5) fn5Var.g.get(str);
                if (tm5Var2 != null) {
                    tm5Var2.c(null, null);
                    return;
                }
                return;
            case 2:
                fn5Var.w.remove(str);
                return;
            case 3:
                String x = fn5.x(str, "jpg");
                String str2 = Utilities.a(str) + "." + x;
                File file = new File(bc4.z(4), str2);
                if (!file.exists()) {
                    gn5 g = gn5.g(str);
                    tm5 tm5Var3 = new tm5(fn5Var);
                    tm5Var3.m = 1;
                    tm5Var3.d = Utilities.a(str);
                    tm5Var3.f = null;
                    tm5Var3.i = g;
                    tm5Var3.g = x;
                    tm5Var3.j = null;
                    byte b2 = g.p;
                    if (b2 != 0) {
                        tm5Var3.l = b2;
                    }
                    tm5Var3.e = str2;
                    fn5Var.g.put(str2, tm5Var3);
                    tm5Var3.q = new File(bc4.z(4), td4.p(Utilities.a(g.g), "_temp.jpg"));
                    tm5Var3.p = file;
                    sm5 sm5Var3 = new sm5(fn5Var, tm5Var3);
                    tm5Var3.s = sm5Var3;
                    fn5Var.o.add(sm5Var3);
                    fn5Var.P(false);
                    return;
                }
                return;
            default:
                tm5 tm5Var4 = (tm5) fn5Var.g.get(str);
                if (tm5Var4 != null) {
                    an5 an5Var = tm5Var4.t;
                    if (an5Var != null) {
                        an5 an5Var2 = new an5(fn5Var, an5Var.a, an5Var.c);
                        tm5Var4.t = an5Var2;
                        fn5Var.n.add(an5Var2);
                    }
                    fn5Var.Q(false);
                    return;
                }
                return;
        }
    }
}
