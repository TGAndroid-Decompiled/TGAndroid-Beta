package defpackage;
public final class yr8 implements g94, kac {
    public final lea a;

    public yr8(lea leaVar) {
        this.a = leaVar;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        this.a.l();
    }

    @Override
    public final Object j(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        lea leaVar = this.a;
        leaVar.i();
        if (num.intValue() == -1) {
            leaVar.h(new zr8(leaVar, (byte) 1), null);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public final void V(float f, int i) {
    }
}
