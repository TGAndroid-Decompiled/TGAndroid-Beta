package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class qua extends cra {
    public Paint[] r;
    public final short s;
    public final byte w;

    public qua(Context context, int i, int i2) {
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
        bra braVar = new bra(this.s);
        this.a = braVar;
        braVar.N = 105;
        int i4 = 0;
        braVar.L = false;
        braVar.G = false;
        braVar.J = true;
        braVar.H = true;
        braVar.I = false;
        braVar.m = true;
        braVar.h = true;
        byte b = this.w;
        if (b == 1) {
            braVar.k = gl.L(24.0f);
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
                f = bm2.f(f2, i2, i3);
            } else {
                f = bm2.f(i4 / (this.r.length - 1), -371690, -14281);
            }
            this.r[i4].setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
            i4++;
        }
        bra braVar2 = this.a;
        braVar2.l = new z02(this, (byte) 9);
        braVar2.r = (byte) 17;
        braVar2.s = (byte) 18;
        braVar2.t = (byte) 19;
        if (b == 2) {
            braVar2.M = true;
            braVar2.r = (byte) 9;
            braVar2.s = (byte) 11;
            braVar2.t = (byte) 13;
            braVar2.o = 1.6f;
            braVar2.x = (short) 1400;
            braVar2.y = (short) 1600;
            braVar2.K = true;
        }
        braVar2.P = bkb.F6;
        braVar2.c();
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
