package defpackage;
public final class it8 implements s84, jcc {
    public final cga a;

    public it8(cga cgaVar) {
        this.a = cgaVar;
    }

    @Override
    public final Object g(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        cga cgaVar = this.a;
        cgaVar.i();
        if (num.intValue() == -1) {
            cgaVar.h(new jt8(cgaVar, (byte) 1), null);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        this.a.l();
    }

    @Override
    public final void v0(float f, int i) {
    }
}
