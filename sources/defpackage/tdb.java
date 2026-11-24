package defpackage;
public final class tdb implements zga, x74 {
    public final byte a;
    public final ydb b;

    public tdb(ydb ydbVar, byte b) {
        this.a = b;
        this.b = ydbVar;
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
        ydb ydbVar = this.b;
        switch (b) {
            case 1:
                ydbVar.G0();
                return;
            case 2:
                ydbVar.G0();
                return;
            default:
                ydbVar.X.setAlpha(f);
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
