package defpackage;
public final class yca extends bda {
    public final byte f;
    public final cda g;

    public yca(cda cdaVar, byte b, boolean z) {
        super(0);
        this.f = b;
        this.g = cdaVar;
    }

    @Override
    public final void a() {
        byte b = this.f;
        cda cdaVar = this.g;
        switch (b) {
            case 0:
                tca tcaVar = cdaVar.h;
                double atan2 = Math.atan2(tcaVar.c - tcaVar.j, tcaVar.b - tcaVar.i) + 3.141592653589793d;
                tca tcaVar2 = cdaVar.h;
                double d = tcaVar2.k / 5.5f;
                this.d = tcaVar2.b + ((float) (Math.cos(atan2) * d));
                this.e = cdaVar.h.c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                tca tcaVar3 = cdaVar.h;
                float f = tcaVar3.c;
                this.d = tcaVar3.b + tcaVar3.d;
                this.e = f;
                return;
            case 2:
                tca tcaVar4 = cdaVar.h;
                float min = Math.min(tcaVar4.d, tcaVar4.e);
                tca tcaVar5 = cdaVar.h;
                this.d = (0.95105654f * min) + tcaVar5.b;
                this.e = ((-0.309017f) * min) + tcaVar5.c;
                return;
            case 3:
                tca tcaVar6 = cdaVar.h;
                this.d = tcaVar6.b;
                this.e = tcaVar6.c - Math.abs(tcaVar6.e);
                return;
            case 4:
                tca tcaVar7 = cdaVar.h;
                float f2 = tcaVar7.i;
                float f3 = tcaVar7.j;
                tcaVar7.i = f2;
                tcaVar7.j = f3;
                this.d = f2;
                this.e = f3;
                return;
            default:
                tca tcaVar8 = cdaVar.h;
                this.d = tcaVar8.b;
                this.e = tcaVar8.c;
                return;
        }
    }

    @Override
    public final void b(float f, float f2) {
        byte b = this.f;
        int i = 0;
        cda cdaVar = this.g;
        switch (b) {
            case 0:
                tca tcaVar = cdaVar.h;
                double atan2 = Math.atan2(tcaVar.c - tcaVar.j, tcaVar.b - tcaVar.i) + 1.5707963267948966d;
                tca tcaVar2 = cdaVar.h;
                tca tcaVar3 = cdaVar.h;
                float f3 = tcaVar3.b;
                float f4 = tcaVar3.c;
                cdaVar.getClass();
                tcaVar3.k = Math.min((dte.a(tcaVar2.b, tcaVar2.c, tcaVar2.i, tcaVar2.j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f4 - f2)) - (Math.sin(atan2) * (f3 - f))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f;
                this.e = f2;
                tca tcaVar4 = cdaVar.h;
                float a = dte.a(tcaVar4.b, tcaVar4.c, f, f2);
                tcaVar4.e = a;
                tcaVar4.d = a;
                return;
            case 2:
                tca tcaVar5 = cdaVar.h;
                float a2 = dte.a(tcaVar5.b, tcaVar5.c, f, f2);
                tcaVar5.e = a2;
                tcaVar5.d = a2;
                tca tcaVar6 = cdaVar.h;
                tcaVar6.h = (float) ((((float) Math.atan2(tcaVar6.c - f2, f - tcaVar6.b)) - 0.3141592653589793d) + tcaVar6.h);
                a();
                return;
            case 3:
                tca tcaVar7 = cdaVar.h;
                tcaVar7.h = (float) ((((float) Math.atan2(tcaVar7.c - f2, f - tcaVar7.b)) - 1.5707963267948966d) + tcaVar7.h);
                while (i < cdaVar.m.size()) {
                    bda bdaVar = (bda) cdaVar.m.get(i);
                    if (bdaVar instanceof ada) {
                        bdaVar.a();
                    }
                    i++;
                }
                return;
            case 4:
                tca tcaVar8 = cdaVar.h;
                tcaVar8.i = f;
                tcaVar8.j = f2;
                this.d = f;
                this.e = f2;
                float f5 = tcaVar8.c;
                float f6 = tcaVar8.e;
                float f7 = f5 - f6;
                int i2 = (f2 > f7 ? 1 : (f2 == f7 ? 0 : -1));
                if (i2 > 0 && f2 < f5 + f6) {
                    float f8 = tcaVar8.b;
                    if (f <= f8) {
                        float f9 = f8 - tcaVar8.d;
                        if (f > f9) {
                            this.d = f9;
                            f = f9;
                        }
                    }
                    if (f > f5) {
                        float f10 = f8 + tcaVar8.d;
                        if (f < f10) {
                            this.d = f10;
                            f = f10;
                        }
                    }
                }
                float f11 = tcaVar8.b;
                float f12 = tcaVar8.d;
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
                tcaVar8.i = f;
                tcaVar8.j = f2;
                return;
        }
        while (i < cdaVar.m.size()) {
            bda bdaVar2 = (bda) cdaVar.m.get(i);
            if (bdaVar2 != this) {
                bdaVar2.a();
            }
            i++;
        }
        tca tcaVar9 = cdaVar.h;
        tcaVar9.b = f;
        tcaVar9.c = f2;
        this.d = f;
        this.e = f2;
    }

    public yca(cda cdaVar, byte b) {
        this.f = b;
        this.g = cdaVar;
    }
}
