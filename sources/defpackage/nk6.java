package defpackage;
public final class nk6 implements es4 {
    public final kj4 a;
    public final Object b;

    public nk6(kj4 kj4Var, Object obj) {
        this.a = kj4Var;
        this.b = obj;
    }

    @Override
    public final Object apply(Object obj) {
        return ((es4) this.a.b).apply(obj);
    }
}
