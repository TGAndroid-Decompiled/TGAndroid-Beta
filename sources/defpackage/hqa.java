package defpackage;
public final class hqa implements zw2, wx2 {
    public final zw2 a;
    public final mx2 b;

    public hqa(zw2 zw2Var, mx2 mx2Var) {
        this.a = zw2Var;
        this.b = mx2Var;
    }

    @Override
    public final wx2 getCallerFrame() {
        zw2 zw2Var = this.a;
        if (zw2Var instanceof wx2) {
            return (wx2) zw2Var;
        }
        return null;
    }

    @Override
    public final mx2 getContext() {
        return this.b;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
