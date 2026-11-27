package defpackage;

import android.content.Context;
public final class vb extends eva {
    public final byte r;

    public vb(Context context, byte b) {
        super(context);
        this.r = b;
    }

    @Override
    public final void a() {
        switch (this.r) {
            case 0:
                super.a();
                dva dvaVar = this.a;
                dvaVar.q = true;
                dvaVar.J = false;
                dvaVar.K = true;
                dvaVar.H = true;
                dvaVar.c();
                return;
            case 1:
                super.a();
                dva dvaVar2 = this.a;
                dvaVar2.q = true;
                dvaVar2.J = false;
                dvaVar2.K = true;
                dvaVar2.H = true;
                dvaVar2.c();
                return;
            case 2:
                dva dvaVar3 = this.a;
                dvaVar3.q = true;
                dvaVar3.J = false;
                dvaVar3.H = true;
                dvaVar3.I = true;
                dvaVar3.k = hl.L(-14.0f);
                dva dvaVar4 = this.a;
                dvaVar4.x = (short) 2000;
                dvaVar4.y = (short) 3000;
                dvaVar4.r = (byte) 16;
                dvaVar4.G = false;
                dvaVar4.N = 28;
                dvaVar4.P = aob.Dk;
                dvaVar4.c();
                return;
            case 3:
                dva dvaVar5 = new dva(50);
                this.a = dvaVar5;
                dvaVar5.N = 100;
                dvaVar5.L = false;
                dvaVar5.G = false;
                dvaVar5.J = true;
                dvaVar5.H = true;
                dvaVar5.I = false;
                dvaVar5.r = (byte) 4;
                dvaVar5.w = 0.98f;
                dvaVar5.v = 0.98f;
                dvaVar5.u = 0.98f;
                dvaVar5.c();
                return;
            case 4:
                dva dvaVar6 = this.a;
                dvaVar6.q = true;
                dvaVar6.J = false;
                dvaVar6.H = true;
                dvaVar6.I = true;
                dvaVar6.k = hl.L(-14.0f);
                dva dvaVar7 = this.a;
                dvaVar7.x = (short) 2000;
                dvaVar7.y = (short) 3000;
                dvaVar7.r = (byte) 16;
                dvaVar7.G = false;
                dvaVar7.N = 28;
                dvaVar7.P = aob.Dk;
                dvaVar7.c();
                return;
            default:
                super.a();
                dva dvaVar8 = this.a;
                dvaVar8.q = true;
                dvaVar8.J = false;
                dvaVar8.K = true;
                dvaVar8.H = true;
                dvaVar8.c();
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
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - hl.L(52.0f));
                return;
            case 3:
            default:
                super.onMeasure(i, i2);
                return;
            case 4:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - hl.L(52.0f));
                return;
            case 5:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - hl.L(52.0f));
                return;
        }
    }
}
