package defpackage;
public final class jq3 implements mv8 {
    public static final Object c = new Object();
    public volatile mv8 a;
    public volatile Object b;

    public static mv8 a(mv8 mv8Var) {
        if (mv8Var instanceof jq3) {
            return mv8Var;
        }
        ?? obj = new Object();
        obj.b = c;
        obj.a = mv8Var;
        return obj;
    }

    @Override
    public final Object mo8get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.mo8get();
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
