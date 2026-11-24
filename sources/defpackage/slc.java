package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class slc {
    public final tm a;
    public ValueAnimator b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final hkc k;
    public final int l;
    public int m = 0;
    public float n = 0.0f;
    public int o;
    public int p;
    public boolean q;
    public ValueAnimator r;

    public slc(TLRPC.User user, hkc hkcVar, int i) {
        this.k = hkcVar;
        this.l = i;
        boolean e = e86.e(512);
        long o = m9c.o(user);
        if (e && o != 0) {
            tm tmVar = new tm(i, 13, hkcVar, false);
            this.a = tmVar;
            tmVar.j(o, false);
            tmVar.k(-16777216);
            tmVar.w = this.m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.b = ofFloat;
            ofFloat.addUpdateListener(new vjc(this, hkcVar, (byte) 3));
            this.e = gm.L(12.0f) + this.c;
            this.f = gm.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.b;
            this.c = gm.L(12.0f) + secureRandom.nextInt(gm.L(16.0f));
            this.d = gm.L(12.0f) + secureRandom.nextInt(gm.L(16.0f));
            this.b.setInterpolator(new LinearInterpolator());
            this.b.addListener(new rlc(this));
            this.b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        tm tmVar = this.a;
        if (tmVar == null) {
            return;
        }
        canvas.save();
        float f = this.n;
        canvas.scale(f, f, this.o / 2.0f, gm.L(300.0f));
        canvas.translate(this.i - this.p, this.j);
        int i = this.g;
        int i2 = this.h;
        int i3 = this.l;
        tmVar.setBounds(i, i2, i + i3, i3 + i2);
        tmVar.w = this.m;
        tmVar.draw(canvas);
        canvas.restore();
    }

    public final void b(int i, int i2) {
        int i3;
        mm mmVar;
        tm tmVar = this.a;
        if (tmVar != null) {
            this.i = i;
            this.j = i2;
            this.k.invalidate();
            if (!this.q) {
                Drawable drawable = tmVar.f[0];
                if ((drawable instanceof vm) && ((mmVar = ((vm) drawable).k) == null || !mmVar.C())) {
                    return;
                }
                this.q = true;
                if (this.i > this.o / 2) {
                    i3 = gm.L(12.0f);
                } else {
                    i3 = -gm.L(12.0f);
                }
                this.p = i3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new d53(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new qlc(this, (byte) 0));
                ofFloat.setDuration(350L);
                ofFloat.setStartDelay(180L);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(d53.f);
                ofInt.addUpdateListener(new qlc(this, (byte) 1));
                ofInt.setStartDelay(180L);
                ofInt.setDuration(350L);
                ofInt.start();
            }
        }
    }
}
