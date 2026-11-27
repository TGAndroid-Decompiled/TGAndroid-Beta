package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class rhb extends eva {
    public Paint[] r;
    public final byte s;
    public final boolean w;

    public rhb(Context context, int i, int i2) {
        super(context);
        this.s = i;
        this.w = i2;
        c();
    }

    @Override
    public final void a() {
        dva dvaVar = new dva(this.s);
        this.a = dvaVar;
        dvaVar.N = 106;
        int i = 0;
        dvaVar.L = false;
        dvaVar.G = false;
        dvaVar.J = true;
        dvaVar.H = true;
        dvaVar.I = false;
        dvaVar.m = true;
        dvaVar.h = true;
        if (this.w) {
            dvaVar.k = hl.L(24.0f);
        }
        this.r = new Paint[20];
        while (true) {
            Paint[] paintArr = this.r;
            if (i < paintArr.length) {
                paintArr[i] = new Paint(1);
                this.r[i].setColorFilter(new PorterDuffColorFilter(vm2.f(i / (this.r.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i++;
            } else {
                dva dvaVar2 = this.a;
                dvaVar2.l = new p12(this, (byte) 10);
                dvaVar2.r = (byte) 17;
                dvaVar2.s = (byte) 18;
                dvaVar2.t = (byte) 19;
                dvaVar2.P = aob.G6;
                dvaVar2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
