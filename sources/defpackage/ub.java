package defpackage;

import android.content.Context;
public final class ub extends dta {
    public final byte r;

    public ub(Context context, byte b) {
        super(context);
        this.r = b;
    }

    @Override
    public final void a() {
        switch (this.r) {
            case 0:
                super.a();
                cta ctaVar = this.a;
                ctaVar.q = true;
                ctaVar.J = false;
                ctaVar.K = true;
                ctaVar.H = true;
                ctaVar.c();
                return;
            case 1:
                super.a();
                cta ctaVar2 = this.a;
                ctaVar2.q = true;
                ctaVar2.J = false;
                ctaVar2.K = true;
                ctaVar2.H = true;
                ctaVar2.c();
                return;
            case 2:
                cta ctaVar3 = this.a;
                ctaVar3.q = true;
                ctaVar3.J = false;
                ctaVar3.H = true;
                ctaVar3.I = true;
                ctaVar3.k = gm.L(-14.0f);
                cta ctaVar4 = this.a;
                ctaVar4.x = (short) 2000;
                ctaVar4.y = (short) 3000;
                ctaVar4.r = (byte) 16;
                ctaVar4.G = false;
                ctaVar4.N = 28;
                ctaVar4.P = cmb.Ck;
                ctaVar4.c();
                return;
            case 3:
                cta ctaVar5 = new cta(50);
                this.a = ctaVar5;
                ctaVar5.N = 100;
                ctaVar5.L = false;
                ctaVar5.G = false;
                ctaVar5.J = true;
                ctaVar5.H = true;
                ctaVar5.I = false;
                ctaVar5.r = (byte) 4;
                ctaVar5.w = 0.98f;
                ctaVar5.v = 0.98f;
                ctaVar5.u = 0.98f;
                ctaVar5.c();
                return;
            case 4:
                cta ctaVar6 = this.a;
                ctaVar6.q = true;
                ctaVar6.J = false;
                ctaVar6.H = true;
                ctaVar6.I = true;
                ctaVar6.k = gm.L(-14.0f);
                cta ctaVar7 = this.a;
                ctaVar7.x = (short) 2000;
                ctaVar7.y = (short) 3000;
                ctaVar7.r = (byte) 16;
                ctaVar7.G = false;
                ctaVar7.N = 28;
                ctaVar7.P = cmb.Ck;
                ctaVar7.c();
                return;
            default:
                super.a();
                cta ctaVar8 = this.a;
                ctaVar8.q = true;
                ctaVar8.J = false;
                ctaVar8.K = true;
                ctaVar8.H = true;
                ctaVar8.c();
                return;
        }
    }

    @Override
    public final int getStarsRectWidth() {
        switch (this.r) {
            case 0:
                return getMeasuredWidth();
            case 1:
                return getMeasuredWidth();
            case 2:
            default:
                return super.getStarsRectWidth();
            case 3:
                return getMeasuredWidth();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.r) {
            case 2:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gm.L(52.0f));
                return;
            case 3:
            default:
                super.onMeasure(i, i2);
                return;
            case 4:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gm.L(52.0f));
                return;
            case 5:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gm.L(52.0f));
                return;
        }
    }
}
