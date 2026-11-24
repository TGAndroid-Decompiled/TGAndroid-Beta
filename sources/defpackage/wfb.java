package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class wfb extends dta {
    public Paint[] r;
    public final byte s;
    public final boolean w;

    public wfb(Context context, int i, int i2) {
        super(context);
        this.s = i;
        this.w = i2;
        c();
    }

    @Override
    public final void a() {
        cta ctaVar = new cta(this.s);
        this.a = ctaVar;
        ctaVar.N = 106;
        int i = 0;
        ctaVar.L = false;
        ctaVar.G = false;
        ctaVar.J = true;
        ctaVar.H = true;
        ctaVar.I = false;
        ctaVar.m = true;
        ctaVar.h = true;
        if (this.w) {
            ctaVar.k = gm.L(24.0f);
        }
        this.r = new Paint[20];
        while (true) {
            Paint[] paintArr = this.r;
            if (i < paintArr.length) {
                paintArr[i] = new Paint(1);
                this.r[i].setColorFilter(new PorterDuffColorFilter(on2.f(i / (this.r.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                i++;
            } else {
                cta ctaVar2 = this.a;
                ctaVar2.l = new k22(this, (byte) 10);
                ctaVar2.r = (byte) 17;
                ctaVar2.s = (byte) 18;
                ctaVar2.t = (byte) 19;
                ctaVar2.P = cmb.F6;
                ctaVar2.c();
                return;
            }
        }
    }

    @Override
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
