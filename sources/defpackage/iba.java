package defpackage;
public final class iba extends lba {
    public final byte f;
    public final mba g;

    public iba(mba mbaVar, byte b, boolean z) {
        super(0);
        this.f = b;
        this.g = mbaVar;
    }

    @Override
    public final void a() {
        byte b = this.f;
        mba mbaVar = this.g;
        switch (b) {
            case 0:
                dba dbaVar = mbaVar.h;
                double atan2 = Math.atan2(dbaVar.c - dbaVar.j, dbaVar.b - dbaVar.i) + 3.141592653589793d;
                dba dbaVar2 = mbaVar.h;
                double d = dbaVar2.k / 5.5f;
                this.d = dbaVar2.b + ((float) (Math.cos(atan2) * d));
                this.e = mbaVar.h.c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                dba dbaVar3 = mbaVar.h;
                float f = dbaVar3.c;
                this.d = dbaVar3.b + dbaVar3.d;
                this.e = f;
                return;
            case 2:
                dba dbaVar4 = mbaVar.h;
                float min = Math.min(dbaVar4.d, dbaVar4.e);
                dba dbaVar5 = mbaVar.h;
                this.d = (0.95105654f * min) + dbaVar5.b;
                this.e = ((-0.309017f) * min) + dbaVar5.c;
                return;
            case 3:
                dba dbaVar6 = mbaVar.h;
                this.d = dbaVar6.b;
                this.e = dbaVar6.c - Math.abs(dbaVar6.e);
                return;
            case 4:
                dba dbaVar7 = mbaVar.h;
                float f2 = dbaVar7.i;
                float f3 = dbaVar7.j;
                dbaVar7.i = f2;
                dbaVar7.j = f3;
                this.d = f2;
                this.e = f3;
                return;
            default:
                dba dbaVar8 = mbaVar.h;
                this.d = dbaVar8.b;
                this.e = dbaVar8.c;
                return;
        }
    }

    @Override
    public final void b(float f, float f2) {
        byte b = this.f;
        int i = 0;
        mba mbaVar = this.g;
        switch (b) {
            case 0:
                dba dbaVar = mbaVar.h;
                double atan2 = Math.atan2(dbaVar.c - dbaVar.j, dbaVar.b - dbaVar.i) + 1.5707963267948966d;
                dba dbaVar2 = mbaVar.h;
                dba dbaVar3 = mbaVar.h;
                float f3 = dbaVar3.b;
                float f4 = dbaVar3.c;
                mbaVar.getClass();
                dbaVar3.k = Math.min((oqe.a(dbaVar2.b, dbaVar2.c, dbaVar2.i, dbaVar2.j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f4 - f2)) - (Math.sin(atan2) * (f3 - f))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f;
                this.e = f2;
                dba dbaVar4 = mbaVar.h;
                float a = oqe.a(dbaVar4.b, dbaVar4.c, f, f2);
                dbaVar4.e = a;
                dbaVar4.d = a;
                return;
            case 2:
                dba dbaVar5 = mbaVar.h;
                float a2 = oqe.a(dbaVar5.b, dbaVar5.c, f, f2);
                dbaVar5.e = a2;
                dbaVar5.d = a2;
                dba dbaVar6 = mbaVar.h;
                dbaVar6.h = (float) ((((float) Math.atan2(dbaVar6.c - f2, f - dbaVar6.b)) - 0.3141592653589793d) + dbaVar6.h);
                a();
                return;
            case 3:
                dba dbaVar7 = mbaVar.h;
                dbaVar7.h = (float) ((((float) Math.atan2(dbaVar7.c - f2, f - dbaVar7.b)) - 1.5707963267948966d) + dbaVar7.h);
                while (i < mbaVar.m.size()) {
                    lba lbaVar = (lba) mbaVar.m.get(i);
                    if (lbaVar instanceof kba) {
                        lbaVar.a();
                    }
                    i++;
                }
                return;
            case 4:
                dba dbaVar8 = mbaVar.h;
                dbaVar8.i = f;
                dbaVar8.j = f2;
                this.d = f;
                this.e = f2;
                float f5 = dbaVar8.c;
                float f6 = dbaVar8.e;
                float f7 = f5 - f6;
                int i2 = (f2 > f7 ? 1 : (f2 == f7 ? 0 : -1));
                if (i2 > 0 && f2 < f5 + f6) {
                    float f8 = dbaVar8.b;
                    if (f <= f8) {
                        float f9 = f8 - dbaVar8.d;
                        if (f > f9) {
                            this.d = f9;
                            f = f9;
                        }
                    }
                    if (f > f5) {
                        float f10 = f8 + dbaVar8.d;
                        if (f < f10) {
                            this.d = f10;
                            f = f10;
                        }
                    }
                }
                float f11 = dbaVar8.b;
                float f12 = dbaVar8.d;
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
                dbaVar8.i = f;
                dbaVar8.j = f2;
                return;
        }
        while (i < mbaVar.m.size()) {
            lba lbaVar2 = (lba) mbaVar.m.get(i);
            if (lbaVar2 != this) {
                lbaVar2.a();
            }
            i++;
        }
        dba dbaVar9 = mbaVar.h;
        dbaVar9.b = f;
        dbaVar9.c = f2;
        this.d = f;
        this.e = f2;
    }

    public iba(mba mbaVar, byte b) {
        this.f = b;
        this.g = mbaVar;
    }
}
