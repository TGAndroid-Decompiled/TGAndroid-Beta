package defpackage;
public final class kba extends lba {
    public final dba f;
    public final float g;
    public final float h;
    public final mba i;

    public kba(mba mbaVar, dba dbaVar, boolean z, boolean z2) {
        float f;
        this.i = mbaVar;
        this.b = false;
        this.f = dbaVar;
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
        dba dbaVar = this.f;
        if (dbaVar != null) {
            float f = (this.g * dbaVar.d) + dbaVar.b;
            float f2 = dbaVar.c;
            mba mbaVar = this.i;
            mbaVar.c(f, (this.h * dbaVar.e) + f2, true);
            float[] fArr = mbaVar.p;
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
        dba dbaVar = this.f;
        float f3 = ((-this.g) * dbaVar.d) + dbaVar.b;
        float f4 = ((-this.h) * dbaVar.e) + dbaVar.c;
        mba mbaVar = this.i;
        mbaVar.c(f, f2, false);
        mbaVar.c(f3, f4, true);
        float[] fArr = mbaVar.p;
        float f5 = fArr[0];
        float f6 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f2 - f6, f - f5)) - dbaVar.h;
        dbaVar.d = ((float) Math.abs(Math.cos(atan2) * oqe.a(f, f2, f5, f6))) / 2.0f;
        dbaVar.e = ((float) Math.abs(Math.sin(atan2) * oqe.a(f, f2, f5, f6))) / 2.0f;
        dbaVar.b = (f + f5) / 2.0f;
        dbaVar.c = (f2 + f6) / 2.0f;
        for (int i = 0; i < mbaVar.m.size(); i++) {
            ((lba) mbaVar.m.get(i)).a();
        }
    }
}
