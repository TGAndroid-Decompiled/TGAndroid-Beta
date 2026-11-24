package defpackage;

import java.io.File;
import org.telegram.messenger.Utilities;
public final class jk5 implements Runnable {
    public final byte a;
    public final fl5 b;
    public final String c;

    public jk5(fl5 fl5Var, String str, byte b) {
        this.a = b;
        this.b = fl5Var;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        fl5 fl5Var = this.b;
        switch (b) {
            case 0:
                tk5 tk5Var = (tk5) fl5Var.g.get(str);
                if (tk5Var != null) {
                    sk5 sk5Var = tk5Var.s;
                    if (sk5Var != null) {
                        sk5 sk5Var2 = new sk5(fl5Var, sk5Var.a);
                        tk5Var.s = sk5Var2;
                        fl5Var.o.add(sk5Var2);
                    }
                    fl5Var.P(false);
                    return;
                }
                return;
            case 1:
                tk5 tk5Var2 = (tk5) fl5Var.g.get(str);
                if (tk5Var2 != null) {
                    tk5Var2.c(null, null);
                    return;
                }
                return;
            case 2:
                fl5Var.w.remove(str);
                return;
            case 3:
                String x = fl5.x(str, "jpg");
                String str2 = Utilities.a(str) + "." + x;
                File file = new File(ba4.z(4), str2);
                if (!file.exists()) {
                    gl5 g = gl5.g(str);
                    tk5 tk5Var3 = new tk5(fl5Var);
                    tk5Var3.m = 1;
                    tk5Var3.d = Utilities.a(str);
                    tk5Var3.f = null;
                    tk5Var3.i = g;
                    tk5Var3.g = x;
                    tk5Var3.j = null;
                    byte b2 = g.p;
                    if (b2 != 0) {
                        tk5Var3.l = b2;
                    }
                    tk5Var3.e = str2;
                    fl5Var.g.put(str2, tk5Var3);
                    tk5Var3.q = new File(ba4.z(4), tb4.o(Utilities.a(g.g), "_temp.jpg"));
                    tk5Var3.p = file;
                    sk5 sk5Var3 = new sk5(fl5Var, tk5Var3);
                    tk5Var3.s = sk5Var3;
                    fl5Var.o.add(sk5Var3);
                    fl5Var.P(false);
                    return;
                }
                return;
            default:
                tk5 tk5Var4 = (tk5) fl5Var.g.get(str);
                if (tk5Var4 != null) {
                    al5 al5Var = tk5Var4.t;
                    if (al5Var != null) {
                        al5 al5Var2 = new al5(fl5Var, al5Var.a, al5Var.c);
                        tk5Var4.t = al5Var2;
                        fl5Var.n.add(al5Var2);
                    }
                    fl5Var.Q(false);
                    return;
                }
                return;
        }
    }
}
