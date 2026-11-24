package defpackage;
public final class wp8 implements x74, j8c {
    public final lca a;

    public wp8(lca lcaVar) {
        this.a = lcaVar;
    }

    @Override
    public final Object g(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        lca lcaVar = this.a;
        lcaVar.i();
        if (num.intValue() == -1) {
            lcaVar.h(new xp8(lcaVar, (byte) 1), null);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        this.a.l();
    }

    @Override
    public final void D(float f, int i) {
    }
}
