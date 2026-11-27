package defpackage;
public final class zca extends cda {
    public final byte f;
    public final dda g;

    public zca(dda ddaVar, byte b, boolean z) {
        super(0);
        this.f = b;
        this.g = ddaVar;
    }

    @Override
    public final void a() {
        byte b = this.f;
        dda ddaVar = this.g;
        switch (b) {
            case 0:
                uca ucaVar = ddaVar.h;
                double atan2 = Math.atan2(ucaVar.c - ucaVar.j, ucaVar.b - ucaVar.i) + 3.141592653589793d;
                uca ucaVar2 = ddaVar.h;
                double d = ucaVar2.k / 5.5f;
                this.d = ucaVar2.b + ((float) (Math.cos(atan2) * d));
                this.e = ddaVar.h.c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                uca ucaVar3 = ddaVar.h;
                float f = ucaVar3.c;
                this.d = ucaVar3.b + ucaVar3.d;
                this.e = f;
                return;
            case 2:
                uca ucaVar4 = ddaVar.h;
                float min = Math.min(ucaVar4.d, ucaVar4.e);
                uca ucaVar5 = ddaVar.h;
                this.d = (0.95105654f * min) + ucaVar5.b;
                this.e = ((-0.309017f) * min) + ucaVar5.c;
                return;
            case 3:
                uca ucaVar6 = ddaVar.h;
                this.d = ucaVar6.b;
                this.e = ucaVar6.c - Math.abs(ucaVar6.e);
                return;
            case 4:
                uca ucaVar7 = ddaVar.h;
                float f2 = ucaVar7.i;
                float f3 = ucaVar7.j;
                ucaVar7.i = f2;
                ucaVar7.j = f3;
                this.d = f2;
                this.e = f3;
                return;
            default:
                uca ucaVar8 = ddaVar.h;
                this.d = ucaVar8.b;
                this.e = ucaVar8.c;
                return;
        }
    }

    @Override
    public final void b(float f, float f2) {
        byte b = this.f;
        int i = 0;
        dda ddaVar = this.g;
        switch (b) {
            case 0:
                uca ucaVar = ddaVar.h;
                double atan2 = Math.atan2(ucaVar.c - ucaVar.j, ucaVar.b - ucaVar.i) + 1.5707963267948966d;
                uca ucaVar2 = ddaVar.h;
                uca ucaVar3 = ddaVar.h;
                float f3 = ucaVar3.b;
                float f4 = ucaVar3.c;
                ddaVar.getClass();
                ucaVar3.k = Math.min((dte.a(ucaVar2.b, ucaVar2.c, ucaVar2.i, ucaVar2.j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f4 - f2)) - (Math.sin(atan2) * (f3 - f))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f;
                this.e = f2;
                uca ucaVar4 = ddaVar.h;
                float a = dte.a(ucaVar4.b, ucaVar4.c, f, f2);
                ucaVar4.e = a;
                ucaVar4.d = a;
                return;
            case 2:
                uca ucaVar5 = ddaVar.h;
                float a2 = dte.a(ucaVar5.b, ucaVar5.c, f, f2);
                ucaVar5.e = a2;
                ucaVar5.d = a2;
                uca ucaVar6 = ddaVar.h;
                ucaVar6.h = (float) ((((float) Math.atan2(ucaVar6.c - f2, f - ucaVar6.b)) - 0.3141592653589793d) + ucaVar6.h);
                a();
                return;
            case 3:
                uca ucaVar7 = ddaVar.h;
                ucaVar7.h = (float) ((((float) Math.atan2(ucaVar7.c - f2, f - ucaVar7.b)) - 1.5707963267948966d) + ucaVar7.h);
                while (i < ddaVar.m.size()) {
                    cda cdaVar = (cda) ddaVar.m.get(i);
                    if (cdaVar instanceof bda) {
                        cdaVar.a();
                    }
                    i++;
                }
                return;
            case 4:
                uca ucaVar8 = ddaVar.h;
                ucaVar8.i = f;
                ucaVar8.j = f2;
                this.d = f;
                this.e = f2;
                float f5 = ucaVar8.c;
                float f6 = ucaVar8.e;
                float f7 = f5 - f6;
                int i2 = (f2 > f7 ? 1 : (f2 == f7 ? 0 : -1));
                if (i2 > 0 && f2 < f5 + f6) {
                    float f8 = ucaVar8.b;
                    if (f <= f8) {
                        float f9 = f8 - ucaVar8.d;
                        if (f > f9) {
                            this.d = f9;
                            f = f9;
                        }
                    }
                    if (f > f5) {
                        float f10 = f8 + ucaVar8.d;
                        if (f < f10) {
                            this.d = f10;
                            f = f10;
                        }
                    }
                }
                float f11 = ucaVar8.b;
                float f12 = ucaVar8.d;
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
                ucaVar8.i = f;
                ucaVar8.j = f2;
                return;
        }
        while (i < ddaVar.m.size()) {
            cda cdaVar2 = (cda) ddaVar.m.get(i);
            if (cdaVar2 != this) {
                cdaVar2.a();
            }
            i++;
        }
        uca ucaVar9 = ddaVar.h;
        ucaVar9.b = f;
        ucaVar9.c = f2;
        this.d = f;
        this.e = f2;
    }

    public zca(dda ddaVar, byte b) {
        this.f = b;
        this.g = ddaVar;
    }
}
