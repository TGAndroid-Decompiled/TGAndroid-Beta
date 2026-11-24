package defpackage;
public final class k9a extends l9a {
    public final d9a f;
    public final float g;
    public final float h;
    public final m9a i;

    public k9a(m9a m9aVar, d9a d9aVar, boolean z, boolean z2) {
        float f;
        this.i = m9aVar;
        this.b = false;
        this.f = d9aVar;
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
        d9a d9aVar = this.f;
        if (d9aVar != null) {
            float f = (this.g * d9aVar.d) + d9aVar.b;
            float f2 = d9aVar.c;
            m9a m9aVar = this.i;
            m9aVar.c(f, (this.h * d9aVar.e) + f2, true);
            float[] fArr = m9aVar.p;
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
        d9a d9aVar = this.f;
        float f3 = ((-this.g) * d9aVar.d) + d9aVar.b;
        float f4 = ((-this.h) * d9aVar.e) + d9aVar.c;
        m9a m9aVar = this.i;
        m9aVar.c(f, f2, false);
        m9aVar.c(f3, f4, true);
        float[] fArr = m9aVar.p;
        float f5 = fArr[0];
        float f6 = fArr[1];
        double atan2 = (3.141592653589793d - Math.atan2(f2 - f6, f - f5)) - d9aVar.h;
        d9aVar.d = ((float) Math.abs(Math.cos(atan2) * loe.a(f, f2, f5, f6))) / 2.0f;
        d9aVar.e = ((float) Math.abs(Math.sin(atan2) * loe.a(f, f2, f5, f6))) / 2.0f;
        d9aVar.b = (f + f5) / 2.0f;
        d9aVar.c = (f2 + f6) / 2.0f;
        for (int i = 0; i < m9aVar.m.size(); i++) {
            ((l9a) m9aVar.m.get(i)).a();
        }
    }
}
