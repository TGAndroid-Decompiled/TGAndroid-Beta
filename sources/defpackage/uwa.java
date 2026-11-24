package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class uwa extends dta {
    public Paint[] r;
    public final short s;
    public final byte w;

    public uwa(Context context, int i, int i2) {
        super(context);
        this.s = i;
        this.w = i2;
        c();
    }

    @Override
    public final void a() {
        int i;
        int f;
        float f2;
        int i2;
        int i3;
        cta ctaVar = new cta(this.s);
        this.a = ctaVar;
        ctaVar.N = 105;
        int i4 = 0;
        ctaVar.L = false;
        ctaVar.G = false;
        ctaVar.J = true;
        ctaVar.H = true;
        ctaVar.I = false;
        ctaVar.m = true;
        ctaVar.h = true;
        byte b = this.w;
        if (b == 1) {
            ctaVar.k = gm.L(24.0f);
        }
        if (b == 2) {
            i = 40;
        } else {
            i = 20;
        }
        this.r = new Paint[i];
        while (true) {
            Paint[] paintArr = this.r;
            if (i4 >= paintArr.length) {
                break;
            }
            paintArr[i4] = new Paint(1);
            if (b == 2) {
                if (i4 >= 20) {
                    f2 = (i4 - 20) / 19.0f;
                    i2 = -1005568;
                    i3 = -2062336;
                } else if (i4 % 5 == 0) {
                    f = -2340;
                } else {
                    f2 = i4 / 19.0f;
                    i2 = -10645;
                    i3 = -20165;
                }
                f = on2.f(f2, i2, i3);
            } else {
                f = on2.f(i4 / (this.r.length - 1), -371690, -14281);
            }
            this.r[i4].setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
            i4++;
        }
        cta ctaVar2 = this.a;
        ctaVar2.l = new k22(this, (byte) 9);
        ctaVar2.r = (byte) 17;
        ctaVar2.s = (byte) 18;
        ctaVar2.t = (byte) 19;
        if (b == 2) {
            ctaVar2.M = true;
            ctaVar2.r = (byte) 9;
            ctaVar2.s = (byte) 11;
            ctaVar2.t = (byte) 13;
            ctaVar2.o = 1.6f;
            ctaVar2.x = (short) 1400;
            ctaVar2.y = (short) 1600;
            ctaVar2.K = true;
        }
        ctaVar2.P = cmb.F6;
        ctaVar2.c();
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
