package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class foc {
    public final ul a;
    public ValueAnimator b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final tmc k;
    public final int l;
    public int m = 0;
    public float n = 0.0f;
    public int o;
    public int p;
    public boolean q;
    public ValueAnimator r;

    public foc(TLRPC.User user, tmc tmcVar, int i) {
        this.k = tmcVar;
        this.l = i;
        boolean e = i86.e(512);
        long o = lbc.o(user);
        if (e && o != 0) {
            ul ulVar = new ul(i, 13, tmcVar, false);
            this.a = ulVar;
            ulVar.j(o, false);
            ulVar.k(-16777216);
            ulVar.w = this.m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.b = ofFloat;
            ofFloat.addUpdateListener(new cmc(this, tmcVar, (byte) 3));
            this.e = hl.L(12.0f) + this.c;
            this.f = hl.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.b;
            this.c = hl.L(12.0f) + secureRandom.nextInt(hl.L(16.0f));
            this.d = hl.L(12.0f) + secureRandom.nextInt(hl.L(16.0f));
            this.b.setInterpolator(new LinearInterpolator());
            this.b.addListener(new eoc(this));
            this.b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        ul ulVar = this.a;
        if (ulVar == null) {
            return;
        }
        canvas.save();
        float f = this.n;
        canvas.scale(f, f, this.o / 2.0f, hl.L(300.0f));
        canvas.translate(this.i - this.p, this.j);
        int i = this.g;
        int i2 = this.h;
        int i3 = this.l;
        ulVar.setBounds(i, i2, i + i3, i3 + i2);
        ulVar.w = this.m;
        ulVar.draw(canvas);
        canvas.restore();
    }

    public final void b(int i, int i2) {
        int i3;
        nl nlVar;
        ul ulVar = this.a;
        if (ulVar != null) {
            this.i = i;
            this.j = i2;
            this.k.invalidate();
            if (!this.q) {
                Drawable drawable = ulVar.f[0];
                if ((drawable instanceof wl) && ((nlVar = ((wl) drawable).k) == null || !nlVar.C())) {
                    return;
                }
                this.q = true;
                if (this.i > this.o / 2) {
                    i3 = hl.L(12.0f);
                } else {
                    i3 = -hl.L(12.0f);
                }
                this.p = i3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new k43(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new doc(this, (byte) 0));
                ofFloat.setDuration(350L);
                ofFloat.setStartDelay(180L);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(k43.f);
                ofInt.addUpdateListener(new doc(this, (byte) 1));
                ofInt.setStartDelay(180L);
                ofInt.setDuration(350L);
                ofInt.start();
            }
        }
    }
}
