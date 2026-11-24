package defpackage;
public final class nva implements g94, bja {
    public final byte a;
    public final nxa b;

    public nva(nxa nxaVar, byte b) {
        this.a = b;
        this.b = nxaVar;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        byte b = this.a;
        nxa nxaVar = this.b;
        switch (b) {
            case 0:
                nxaVar.s1();
                return;
            case 1:
                nxaVar.s1();
                return;
            default:
                nxaVar.X.setAlpha(f);
                return;
        }
    }

    @Override
    public final void V(float f, int i) {
        byte b = this.a;
    }

    @Override
    public final int b() {
        return this.b.b0;
    }

    private final void a(float f, int i) {
    }

    private final void c(float f, int i) {
    }

    private final void d(float f, int i) {
    }
}
