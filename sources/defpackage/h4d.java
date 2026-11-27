package defpackage;
public final class h4d implements l4d {
    public static final Object c = new Object();
    public volatile i4d a;
    public volatile Object b;

    public static h4d b(i4d i4dVar) {
        if (i4dVar instanceof h4d) {
            return (h4d) i4dVar;
        }
        ?? obj = new Object();
        obj.b = c;
        obj.a = i4dVar;
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
