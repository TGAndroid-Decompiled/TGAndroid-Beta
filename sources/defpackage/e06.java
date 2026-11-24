package defpackage;
public final class e06 implements mt8 {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile mt8 b;

    public e06(mt8 mt8Var) {
        this.b = mt8Var;
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
