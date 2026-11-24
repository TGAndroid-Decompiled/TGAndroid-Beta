package defpackage;
public final class ufb implements bja, g94 {
    public final byte a;
    public final yfb b;

    public ufb(yfb yfbVar, byte b) {
        this.a = b;
        this.b = yfbVar;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        byte b = this.a;
        yfb yfbVar = this.b;
        switch (b) {
            case 1:
                yfbVar.H0();
                return;
            case 2:
                yfbVar.H0();
                return;
            default:
                yfbVar.X.setAlpha(f);
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
