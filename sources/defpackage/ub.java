package defpackage;

import android.content.Context;
public final class ub extends cra {
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
                bra braVar = this.a;
                braVar.q = true;
                braVar.J = false;
                braVar.K = true;
                braVar.H = true;
                braVar.c();
                return;
            case 1:
                super.a();
                bra braVar2 = this.a;
                braVar2.q = true;
                braVar2.J = false;
                braVar2.K = true;
                braVar2.H = true;
                braVar2.c();
                return;
            case 2:
                bra braVar3 = this.a;
                braVar3.q = true;
                braVar3.J = false;
                braVar3.H = true;
                braVar3.I = true;
                braVar3.k = gl.L(-14.0f);
                bra braVar4 = this.a;
                braVar4.x = (short) 2000;
                braVar4.y = (short) 3000;
                braVar4.r = (byte) 16;
                braVar4.G = false;
                braVar4.N = 28;
                braVar4.P = bkb.Ck;
                braVar4.c();
                return;
            case 3:
                bra braVar5 = new bra(50);
                this.a = braVar5;
                braVar5.N = 100;
                braVar5.L = false;
                braVar5.G = false;
                braVar5.J = true;
                braVar5.H = true;
                braVar5.I = false;
                braVar5.r = (byte) 4;
                braVar5.w = 0.98f;
                braVar5.v = 0.98f;
                braVar5.u = 0.98f;
                braVar5.c();
                return;
            case 4:
                bra braVar6 = this.a;
                braVar6.q = true;
                braVar6.J = false;
                braVar6.H = true;
                braVar6.I = true;
                braVar6.k = gl.L(-14.0f);
                bra braVar7 = this.a;
                braVar7.x = (short) 2000;
                braVar7.y = (short) 3000;
                braVar7.r = (byte) 16;
                braVar7.G = false;
                braVar7.N = 28;
                braVar7.P = bkb.Ck;
                braVar7.c();
                return;
            default:
                super.a();
                bra braVar8 = this.a;
                braVar8.q = true;
                braVar8.J = false;
                braVar8.K = true;
                braVar8.H = true;
                braVar8.c();
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
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gl.L(52.0f));
                return;
            case 3:
            default:
                super.onMeasure(i, i2);
                return;
            case 4:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gl.L(52.0f));
                return;
            case 5:
                super.onMeasure(i, i2);
                this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gl.L(52.0f));
                return;
        }
    }
}
