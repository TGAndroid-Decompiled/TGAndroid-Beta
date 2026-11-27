package defpackage;

import java.io.File;
import org.telegram.messenger.Utilities;
public final class mm5 implements Runnable {
    public final byte a;
    public final in5 b;
    public final String c;

    public mm5(in5 in5Var, String str, byte b) {
        this.a = b;
        this.b = in5Var;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        in5 in5Var = this.b;
        switch (b) {
            case 0:
                wm5 wm5Var = (wm5) in5Var.g.get(str);
                if (wm5Var != null) {
                    dn5 dn5Var = wm5Var.t;
                    if (dn5Var != null) {
                        dn5 dn5Var2 = new dn5(in5Var, dn5Var.a, dn5Var.c);
                        wm5Var.t = dn5Var2;
                        in5Var.n.add(dn5Var2);
                    }
                    in5Var.Q(false);
                    return;
                }
                return;
            case 1:
                wm5 wm5Var2 = (wm5) in5Var.g.get(str);
                if (wm5Var2 != null) {
                    vm5 vm5Var = wm5Var2.s;
                    if (vm5Var != null) {
                        vm5 vm5Var2 = new vm5(in5Var, vm5Var.a);
                        wm5Var2.s = vm5Var2;
                        in5Var.o.add(vm5Var2);
                    }
                    in5Var.P(false);
                    return;
                }
                return;
            case 2:
                wm5 wm5Var3 = (wm5) in5Var.g.get(str);
                if (wm5Var3 != null) {
                    wm5Var3.c(null, null);
                    return;
                }
                return;
            case 3:
                in5Var.w.remove(str);
                return;
            default:
                String x = in5.x(str, "jpg");
                String str2 = Utilities.a(str) + "." + x;
                File file = new File(xb4.z(4), str2);
                if (!file.exists()) {
                    jn5 g = jn5.g(str);
                    wm5 wm5Var4 = new wm5(in5Var);
                    wm5Var4.m = 1;
                    wm5Var4.d = Utilities.a(str);
                    wm5Var4.f = null;
                    wm5Var4.i = g;
                    wm5Var4.g = x;
                    wm5Var4.j = null;
                    byte b2 = g.p;
                    if (b2 != 0) {
                        wm5Var4.l = b2;
                    }
                    wm5Var4.e = str2;
                    in5Var.g.put(str2, wm5Var4);
                    wm5Var4.q = new File(xb4.z(4), qd4.o(Utilities.a(g.g), "_temp.jpg"));
                    wm5Var4.p = file;
                    vm5 vm5Var3 = new vm5(in5Var, wm5Var4);
                    wm5Var4.s = vm5Var3;
                    in5Var.o.add(vm5Var3);
                    in5Var.P(false);
                    return;
                }
                return;
        }
    }
}
