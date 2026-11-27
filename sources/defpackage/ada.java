package defpackage;
public final class ada extends bda {
    public final tca f;
    public final float g;
    public final float h;
    public final cda i;

    public ada(cda cdaVar, tca tcaVar, boolean z, boolean z2) {
        float f;
        this.i = cdaVar;
        this.b = false;
        this.f = tcaVar;
        if (z) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        this.g = f;
        this.h = z2 ? -1.0f : 1.0f;
        a();
    }

    @Override
    public final void a() {
        tca tcaVar = this.f;
        if (tcaVar != null) {
            float f = (this.g * tcaVar.d) + tcaVar.b;
            float f2 = tcaVar.c;
            cda cdaVar = this.i;
            cdaVar.c(f, (this.h * tcaVar.e) + f2, true);
            float[] fArr = cdaVar.p;
            float f3 = fArr[0];
            float f4 = fArr[1];
            this.d = f3;
            this.e = f4;
        }
    }

    @Override
    public final void b(float f, float f2) {
        this.d = f;
        this.e = f2;
        tca tcaVar = this.f;
        float f3 = ((-this.g) * tcaVar.d) + tcaVar.b;
        float f4 = ((-this.h) * tcaVar.e) + tcaVar.c;
        cda cdaVar = this.i;
        cdaVar.c(f, f2, false);
        cdaVar.c(f3, f4, true);
        float[] fArr = cdaVar.p;
        float f5 = fArr[0];
        float f6 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f2 - f6, f - f5)) - tcaVar.h;
        tcaVar.d = ((float) Math.abs(Math.cos(atan2) * dte.a(f, f2, f5, f6))) / 2.0f;
        tcaVar.e = ((float) Math.abs(Math.sin(atan2) * dte.a(f, f2, f5, f6))) / 2.0f;
        tcaVar.b = (f + f5) / 2.0f;
        tcaVar.c = (f2 + f6) / 2.0f;
        for (int i = 0; i < cdaVar.m.size(); i++) {
            ((bda) cdaVar.m.get(i)).a();
        }
    }
}
