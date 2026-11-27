package defpackage;
public final class i26 implements vw8 {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile vw8 b;

    public i26(vw8 vw8Var) {
        this.b = vw8Var;
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
