package defpackage;
public final class ma1 implements gq4 {
    public final byte a;
    public final Object b;

    public ma1(nh7 nh7Var, mh7 mh7Var) {
        this.a = (byte) 1;
        this.b = nh7Var;
    }

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                sw2 sw2Var = (sw2) obj3;
                ((z1) obj4).invoke((Throwable) obj);
                return g5cVar;
            case 1:
                nh7 nh7Var = (nh7) obj4;
                Throwable th = (Throwable) obj;
                g5c g5cVar2 = (g5c) obj2;
                sw2 sw2Var2 = (sw2) obj3;
                nh7.h.set(nh7Var, null);
                nh7Var.f(null);
                return g5cVar;
            default:
                Throwable th2 = (Throwable) obj;
                g5c g5cVar3 = (g5c) obj2;
                sw2 sw2Var3 = (sw2) obj3;
                ((r0a) obj4).b();
                return g5cVar;
        }
    }

    public ma1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
