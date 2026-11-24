package defpackage;
public final class i9a extends l9a {
    public final byte f;
    public final m9a g;

    public i9a(m9a m9aVar, byte b, boolean z) {
        super(0);
        this.f = b;
        this.g = m9aVar;
    }

    @Override
    public final void a() {
        byte b = this.f;
        m9a m9aVar = this.g;
        switch (b) {
            case 0:
                d9a d9aVar = m9aVar.h;
                double atan2 = Math.atan2(d9aVar.c - d9aVar.j, d9aVar.b - d9aVar.i) + 3.141592653589793d;
                d9a d9aVar2 = m9aVar.h;
                double d = d9aVar2.k / 5.5f;
                this.d = d9aVar2.b + ((float) (Math.cos(atan2) * d));
                this.e = m9aVar.h.c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                d9a d9aVar3 = m9aVar.h;
                float f = d9aVar3.c;
                this.d = d9aVar3.b + d9aVar3.d;
                this.e = f;
                return;
            case 2:
                d9a d9aVar4 = m9aVar.h;
                float min = Math.min(d9aVar4.d, d9aVar4.e);
                d9a d9aVar5 = m9aVar.h;
                this.d = (0.95105654f * min) + d9aVar5.b;
                this.e = ((-0.309017f) * min) + d9aVar5.c;
                return;
            case 3:
                d9a d9aVar6 = m9aVar.h;
                this.d = d9aVar6.b;
                this.e = d9aVar6.c - Math.abs(d9aVar6.e);
                return;
            case 4:
                d9a d9aVar7 = m9aVar.h;
                float f2 = d9aVar7.i;
                float f3 = d9aVar7.j;
                d9aVar7.i = f2;
                d9aVar7.j = f3;
                this.d = f2;
                this.e = f3;
                return;
            default:
                d9a d9aVar8 = m9aVar.h;
                this.d = d9aVar8.b;
                this.e = d9aVar8.c;
                return;
        }
    }

    @Override
    public final void b(float f, float f2) {
        byte b = this.f;
        int i = 0;
        m9a m9aVar = this.g;
        switch (b) {
            case 0:
                d9a d9aVar = m9aVar.h;
                double atan2 = Math.atan2(d9aVar.c - d9aVar.j, d9aVar.b - d9aVar.i) + 1.5707963267948966d;
                d9a d9aVar2 = m9aVar.h;
                d9a d9aVar3 = m9aVar.h;
                float f3 = d9aVar3.b;
                float f4 = d9aVar3.c;
                m9aVar.getClass();
                d9aVar3.k = Math.min((loe.a(d9aVar2.b, d9aVar2.c, d9aVar2.i, d9aVar2.j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f4 - f2)) - (Math.sin(atan2) * (f3 - f))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f;
                this.e = f2;
                d9a d9aVar4 = m9aVar.h;
                float a = loe.a(d9aVar4.b, d9aVar4.c, f, f2);
                d9aVar4.e = a;
                d9aVar4.d = a;
                return;
            case 2:
                d9a d9aVar5 = m9aVar.h;
                float a2 = loe.a(d9aVar5.b, d9aVar5.c, f, f2);
                d9aVar5.e = a2;
                d9aVar5.d = a2;
                d9a d9aVar6 = m9aVar.h;
                d9aVar6.h = (float) ((((float) Math.atan2(d9aVar6.c - f2, f - d9aVar6.b)) - 0.3141592653589793d) + d9aVar6.h);
                a();
                return;
            case 3:
                d9a d9aVar7 = m9aVar.h;
                d9aVar7.h = (float) ((((float) Math.atan2(d9aVar7.c - f2, f - d9aVar7.b)) - 1.5707963267948966d) + d9aVar7.h);
                while (i < m9aVar.m.size()) {
                    l9a l9aVar = (l9a) m9aVar.m.get(i);
                    if (l9aVar instanceof k9a) {
                        l9aVar.a();
                    }
                    i++;
                }
                return;
            case 4:
                d9a d9aVar8 = m9aVar.h;
                d9aVar8.i = f;
                d9aVar8.j = f2;
                this.d = f;
                this.e = f2;
                float f5 = d9aVar8.c;
                float f6 = d9aVar8.e;
                float f7 = f5 - f6;
                int i2 = (f2 > f7 ? 1 : (f2 == f7 ? 0 : -1));
                if (i2 > 0 && f2 < f5 + f6) {
                    float f8 = d9aVar8.b;
                    if (f <= f8) {
                        float f9 = f8 - d9aVar8.d;
                        if (f > f9) {
                            this.d = f9;
                            f = f9;
                        }
                    }
                    if (f > f5) {
                        float f10 = f8 + d9aVar8.d;
                        if (f < f10) {
                            this.d = f10;
                            f = f10;
                        }
                    }
                }
                float f11 = d9aVar8.b;
                float f12 = d9aVar8.d;
                if (f > f11 - f12 && f < f11 + f12) {
                    if (f2 <= f5 && i2 > 0) {
                        this.e = f7;
                        f2 = f7;
                    } else if (f2 > f5) {
                        float f13 = f5 + f6;
                        if (f2 < f13) {
                            this.e = f13;
                            f2 = f13;
                        }
                    }
                }
                d9aVar8.i = f;
                d9aVar8.j = f2;
                return;
        }
        while (i < m9aVar.m.size()) {
            l9a l9aVar2 = (l9a) m9aVar.m.get(i);
            if (l9aVar2 != this) {
                l9aVar2.a();
            }
            i++;
        }
        d9a d9aVar9 = m9aVar.h;
        d9aVar9.b = f;
        d9aVar9.c = f2;
        this.d = f;
        this.e = f2;
    }

    public i9a(m9a m9aVar, byte b) {
        this.f = b;
        this.g = m9aVar;
    }
}
