package defpackage;
public final class qp3 implements uw8 {
    public static final Object c = new Object();
    public volatile uw8 a;
    public volatile Object b;

    public static uw8 a(uw8 uw8Var) {
        if (uw8Var instanceof qp3) {
            return uw8Var;
        }
        ?? obj = new Object();
        obj.b = c;
        obj.a = uw8Var;
        return obj;
    }

    @Override
    public final Object mo21get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.mo21get();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
