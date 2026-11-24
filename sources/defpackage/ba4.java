package defpackage;
public final class ba4 implements Runnable {
    public final byte a;
    public final String b;
    public final la4 c;

    public ba4(String str, la4 la4Var, byte b) {
        this.a = b;
        this.b = str;
        this.c = la4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        la4 la4Var = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                na4 e = ia4.e(str);
                e.b();
                la4 la4Var2 = e.l;
                if (la4Var2 != null && la4Var2.c == la4Var.c) {
                    e.l = null;
                }
                e.b.add(la4Var);
                e.c();
                if (e.h) {
                    ia4.d.cancelRunnable(e.d);
                    e.g = false;
                    e.h = false;
                }
                e.d(1000L);
                return;
            default:
                na4 e2 = ia4.e(str);
                e2.b();
                e2.l = la4Var;
                e2.c();
                return;
        }
    }
}
