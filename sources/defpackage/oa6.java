package defpackage;
public class oa6 extends pfc {
    public static final nf5 d = new nf5((byte) 21);
    public final rma b = new rma();
    public boolean c = false;

    @Override
    public final void b() {
        rma rmaVar = this.b;
        int i = rmaVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            na6 na6Var = (na6) rmaVar.b[i2];
            x5d x5dVar = na6Var.l;
            x5dVar.b();
            x5dVar.c = true;
            m41 m41Var = na6Var.n;
            if (m41Var != null) {
                na6Var.h(m41Var);
            }
            na6 na6Var2 = x5dVar.a;
            if (na6Var2 != null) {
                if (na6Var2 == na6Var) {
                    x5dVar.a = null;
                    x5dVar.d = true;
                    x5dVar.b = false;
                    x5dVar.c = false;
                    x5dVar.e = false;
                } else {
                    u36.j("Attempting to unregister the wrong listener");
                    return;
                }
            } else {
                dq9.m("No listener register");
                return;
            }
        }
        int i3 = rmaVar.c;
        Object[] objArr = rmaVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        rmaVar.c = 0;
    }
}
