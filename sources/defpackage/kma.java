package defpackage;
public final class kma implements fw2, cx2 {
    public final fw2 a;
    public final sw2 b;

    public kma(fw2 fw2Var, sw2 sw2Var) {
        this.a = fw2Var;
        this.b = sw2Var;
    }

    @Override
    public final cx2 getCallerFrame() {
        fw2 fw2Var = this.a;
        if (fw2Var instanceof cx2) {
            return (cx2) fw2Var;
        }
        return null;
    }

    @Override
    public final sw2 getContext() {
        return this.b;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
