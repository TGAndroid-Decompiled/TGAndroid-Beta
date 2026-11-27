package defpackage;
public final class ua1 implements ks4 {
    public final byte a;
    public final Object b;

    public ua1(xj7 xj7Var, wj7 wj7Var) {
        this.a = (byte) 1;
        this.b = xj7Var;
    }

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                mx2 mx2Var = (mx2) obj3;
                ((a2) obj4).invoke((Throwable) obj);
                return g9cVar;
            case 1:
                xj7 xj7Var = (xj7) obj4;
                Throwable th = (Throwable) obj;
                g9c g9cVar2 = (g9c) obj2;
                mx2 mx2Var2 = (mx2) obj3;
                xj7.h.set(xj7Var, null);
                xj7Var.f(null);
                return g9cVar;
            default:
                Throwable th2 = (Throwable) obj;
                g9c g9cVar3 = (g9c) obj2;
                mx2 mx2Var3 = (mx2) obj3;
                ((k4a) obj4).b();
                return g9cVar;
        }
    }

    public ua1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
