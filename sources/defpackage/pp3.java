package defpackage;
public final class pp3 implements tw8 {
    public static final Object c = new Object();
    public volatile tw8 a;
    public volatile Object b;

    public static tw8 a(tw8 tw8Var) {
        if (tw8Var instanceof pp3) {
            return tw8Var;
        }
        ?? obj = new Object();
        obj.b = c;
        obj.a = tw8Var;
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
