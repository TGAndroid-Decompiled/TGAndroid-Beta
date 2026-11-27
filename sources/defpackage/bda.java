package defpackage;
public final class bda extends cda {
    public final uca f;
    public final float g;
    public final float h;
    public final dda i;

    public bda(dda ddaVar, uca ucaVar, boolean z, boolean z2) {
        float f;
        this.i = ddaVar;
        this.b = false;
        this.f = ucaVar;
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
        uca ucaVar = this.f;
        if (ucaVar != null) {
            float f = (this.g * ucaVar.d) + ucaVar.b;
            float f2 = ucaVar.c;
            dda ddaVar = this.i;
            ddaVar.c(f, (this.h * ucaVar.e) + f2, true);
            float[] fArr = ddaVar.p;
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
        uca ucaVar = this.f;
        float f3 = ((-this.g) * ucaVar.d) + ucaVar.b;
        float f4 = ((-this.h) * ucaVar.e) + ucaVar.c;
        dda ddaVar = this.i;
        ddaVar.c(f, f2, false);
        ddaVar.c(f3, f4, true);
        float[] fArr = ddaVar.p;
        float f5 = fArr[0];
        float f6 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f2 - f6, f - f5)) - ucaVar.h;
        ucaVar.d = ((float) Math.abs(Math.cos(atan2) * dte.a(f, f2, f5, f6))) / 2.0f;
        ucaVar.e = ((float) Math.abs(Math.sin(atan2) * dte.a(f, f2, f5, f6))) / 2.0f;
        ucaVar.b = (f + f5) / 2.0f;
        ucaVar.c = (f2 + f6) / 2.0f;
        for (int i = 0; i < ddaVar.m.size(); i++) {
            ((cda) ddaVar.m.get(i)).a();
        }
    }
}
