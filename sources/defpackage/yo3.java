package defpackage;
public final class yo3 implements kt8 {
    public static final Object c = new Object();
    public volatile kt8 a;
    public volatile Object b;

    public static kt8 a(kt8 kt8Var) {
        if (kt8Var instanceof yo3) {
            return kt8Var;
        }
        ?? obj = new Object();
        obj.b = c;
        obj.a = kt8Var;
        return obj;
    }

    @Override
    public final Object mo9get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.mo9get();
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
