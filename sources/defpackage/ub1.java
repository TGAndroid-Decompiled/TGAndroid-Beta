package defpackage;
public final class ub1 implements hs4 {
    public final byte a;
    public final Object b;

    public ub1(qj7 qj7Var, pj7 pj7Var) {
        this.a = (byte) 1;
        this.b = qj7Var;
    }

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                cy2 cy2Var = (cy2) obj3;
                ((z1) obj4).invoke((Throwable) obj);
                return g7cVar;
            case 1:
                qj7 qj7Var = (qj7) obj4;
                Throwable th = (Throwable) obj;
                g7c g7cVar2 = (g7c) obj2;
                cy2 cy2Var2 = (cy2) obj3;
                qj7.h.set(qj7Var, null);
                qj7Var.f(null);
                return g7cVar;
            default:
                Throwable th2 = (Throwable) obj;
                g7c g7cVar3 = (g7c) obj2;
                cy2 cy2Var3 = (cy2) obj3;
                ((t2a) obj4).b();
                return g7cVar;
        }
    }

    public ub1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
