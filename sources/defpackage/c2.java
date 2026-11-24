package defpackage;
public abstract class c2 implements qw2 {
    public final rw2 a;

    public c2(rw2 rw2Var) {
        this.a = rw2Var;
    }

    @Override
    public final Object fold(Object obj, eq4 eq4Var) {
        return eq4Var.invoke(obj, this);
    }

    @Override
    public qw2 get(rw2 rw2Var) {
        return kud.a(this, rw2Var);
    }

    @Override
    public final rw2 getKey() {
        return this.a;
    }

    @Override
    public sw2 minusKey(rw2 rw2Var) {
        return kud.b(this, rw2Var);
    }

    @Override
    public final sw2 plus(sw2 sw2Var) {
        return kud.c(this, sw2Var);
    }
}
