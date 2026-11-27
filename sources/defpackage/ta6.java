package defpackage;
public class ta6 extends nhc {
    public static final qf5 d = new qf5((byte) 21);
    public final koa b = new koa();
    public boolean c = false;

    @Override
    public final void b() {
        koa koaVar = this.b;
        int i = koaVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            sa6 sa6Var = (sa6) koaVar.b[i2];
            m8d m8dVar = sa6Var.l;
            m8dVar.b();
            m8dVar.c = true;
            n31 n31Var = sa6Var.n;
            if (n31Var != null) {
                sa6Var.h(n31Var);
            }
            sa6 sa6Var2 = m8dVar.a;
            if (sa6Var2 != null) {
                if (sa6Var2 == sa6Var) {
                    m8dVar.a = null;
                    m8dVar.d = true;
                    m8dVar.b = false;
                    m8dVar.c = false;
                    m8dVar.e = false;
                } else {
                    lq5.j("Attempting to unregister the wrong listener");
                    return;
                }
            } else {
                grb.i("No listener register");
                return;
            }
        }
        int i3 = koaVar.c;
        Object[] objArr = koaVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        koaVar.c = 0;
    }
}
