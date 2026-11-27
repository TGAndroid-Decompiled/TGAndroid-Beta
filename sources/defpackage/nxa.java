package defpackage;
public final class nxa implements s84, ska {
    public final byte a;
    public final nza b;

    public nxa(nza nzaVar, byte b) {
        this.a = b;
        this.b = nzaVar;
    }

    @Override
    public final int c() {
        return this.b.b0;
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        byte b = this.a;
        nza nzaVar = this.b;
        switch (b) {
            case 0:
                nzaVar.s1();
                return;
            case 1:
                nzaVar.s1();
                return;
            default:
                nzaVar.X.setAlpha(f);
                return;
        }
    }

    @Override
    public final void v0(float f, int i) {
        byte b = this.a;
    }

    private final void a(float f, int i) {
    }

    private final void b(float f, int i) {
    }

    private final void d(float f, int i) {
    }
}
