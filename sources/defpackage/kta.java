package defpackage;
public final class kta implements x74, zga {
    public final byte a;
    public final jva b;

    public kta(jva jvaVar, byte b) {
        this.a = b;
        this.b = jvaVar;
    }

    @Override
    public final void D(float f, int i) {
        byte b = this.a;
    }

    @Override
    public final int b() {
        return this.b.b0;
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        byte b = this.a;
        jva jvaVar = this.b;
        switch (b) {
            case 0:
                jvaVar.r1();
                return;
            case 1:
                jvaVar.r1();
                return;
            default:
                jvaVar.X.setAlpha(f);
                return;
        }
    }

    private final void a(float f, int i) {
    }

    private final void c(float f, int i) {
    }

    private final void d(float f, int i) {
    }
}
