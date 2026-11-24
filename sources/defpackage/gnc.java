package defpackage;
public final class gnc implements yr3 {
    public final byte a;
    public final lnc b;

    public gnc(lnc lncVar, byte b) {
        this.a = b;
        this.b = lncVar;
    }

    @Override
    public final void a(yla ylaVar, float f, float f2) {
        byte b = this.a;
        lnc lncVar = this.b;
        switch (b) {
            case 0:
                lncVar.c.setScaleX(f);
                lncVar.c.setScaleY(f);
                return;
            default:
                lncVar.Q = f2;
                return;
        }
    }
}
