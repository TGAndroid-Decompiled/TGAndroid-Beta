package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class uya extends eva {
    public Paint[] r;
    public final short s;
    public final byte w;

    public uya(Context context, int i, int i2) {
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
        dva dvaVar = new dva(this.s);
        this.a = dvaVar;
        dvaVar.N = 105;
        int i4 = 0;
        dvaVar.L = false;
        dvaVar.G = false;
        dvaVar.J = true;
        dvaVar.H = true;
        dvaVar.I = false;
        dvaVar.m = true;
        dvaVar.h = true;
        byte b = this.w;
        if (b == 1) {
            dvaVar.k = hl.L(24.0f);
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
                f = vm2.f(f2, i2, i3);
            } else {
                f = vm2.f(i4 / (this.r.length - 1), -371690, -14281);
            }
            this.r[i4].setColorFilter(new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN));
            i4++;
        }
        dva dvaVar2 = this.a;
        dvaVar2.l = new p12(this, (byte) 9);
        dvaVar2.r = (byte) 17;
        dvaVar2.s = (byte) 18;
        dvaVar2.t = (byte) 19;
        if (b == 2) {
            dvaVar2.M = true;
            dvaVar2.r = (byte) 9;
            dvaVar2.s = (byte) 11;
            dvaVar2.t = (byte) 13;
            dvaVar2.o = 1.6f;
            dvaVar2.x = (short) 1400;
            dvaVar2.y = (short) 1600;
            dvaVar2.K = true;
        }
        dvaVar2.P = aob.G6;
        dvaVar2.c();
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
