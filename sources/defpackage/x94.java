package defpackage;
public final class x94 implements Runnable {
    public final byte a;
    public final String b;
    public final ha4 c;

    public x94(String str, ha4 ha4Var, byte b) {
        this.a = b;
        this.b = str;
        this.c = ha4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ha4 ha4Var = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                ja4 h = ea4.h(str);
                h.b();
                ha4 ha4Var2 = h.l;
                if (ha4Var2 != null && ha4Var2.c == ha4Var.c) {
                    h.l = null;
                }
                h.b.add(ha4Var);
                h.c();
                if (h.h) {
                    ea4.e.cancelRunnable(h.d);
                    h.g = false;
                    h.h = false;
                }
                h.d(1000L);
                return;
            default:
                ja4 h2 = ea4.h(str);
                h2.b();
                h2.l = ha4Var;
                h2.c();
                return;
        }
    }
}
