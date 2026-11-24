package defpackage;
public final class r1d implements v1d {
    public static final Object c = new Object();
    public volatile s1d a;
    public volatile Object b;

    public static r1d b(s1d s1dVar) {
        if (s1dVar instanceof r1d) {
            return (r1d) s1dVar;
        }
        ?? obj = new Object();
        obj.b = c;
        obj.a = s1dVar;
        return obj;
    }

    @Override
    public final Object a() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.a();
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
