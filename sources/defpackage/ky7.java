package defpackage;
public final class ky7 implements px2 {
    public final ro1 a;

    public ky7(ro1 ro1Var) {
        this.a = ro1Var;
    }

    @Override
    public final cy2 getContext() {
        return k34.a;
    }

    @Override
    public final void resumeWith(Object obj) {
        boolean z = obj instanceof sc9;
        ro1 ro1Var = this.a;
        if (z) {
            ro1Var.a(null, ((sc9) obj).a);
        } else {
            ro1Var.a(obj, null);
        }
    }
}
