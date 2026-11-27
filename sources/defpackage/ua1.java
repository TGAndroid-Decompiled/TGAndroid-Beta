package defpackage;
public final class ua1 implements ks4 {
    public final byte a;
    public final Object b;

    public ua1(wj7 wj7Var, vj7 vj7Var) {
        this.a = (byte) 1;
        this.b = wj7Var;
    }

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                mx2 mx2Var = (mx2) obj3;
                ((a2) obj4).invoke((Throwable) obj);
                return f9cVar;
            case 1:
                wj7 wj7Var = (wj7) obj4;
                Throwable th = (Throwable) obj;
                f9c f9cVar2 = (f9c) obj2;
                mx2 mx2Var2 = (mx2) obj3;
                wj7.h.set(wj7Var, null);
                wj7Var.f(null);
                return f9cVar;
            default:
                Throwable th2 = (Throwable) obj;
                f9c f9cVar3 = (f9c) obj2;
                mx2 mx2Var3 = (mx2) obj3;
                ((k4a) obj4).b();
                return f9cVar;
        }
    }

    public ua1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
