package defpackage;
public final class e26 implements nv8 {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile nv8 b;

    public e26(nv8 nv8Var) {
        this.b = nv8Var;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.a;
                if (obj == obj3) {
                    obj = this.b.get();
                    this.a = obj;
                    this.b = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
