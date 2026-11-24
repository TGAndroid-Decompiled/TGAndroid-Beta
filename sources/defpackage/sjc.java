package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class sjc {
    public final tl a;
    public ValueAnimator b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final hic k;
    public final int l;
    public int m = 0;
    public float n = 0.0f;
    public int o;
    public int p;
    public boolean q;
    public ValueAnimator r;

    public sjc(TLRPC.User user, hic hicVar, int i) {
        this.k = hicVar;
        this.l = i;
        boolean e = e66.e(512);
        long n = l7c.n(user);
        if (e && n != 0) {
            tl tlVar = new tl(i, 13, hicVar, false);
            this.a = tlVar;
            tlVar.j(n, false);
            tlVar.k(-16777216);
            tlVar.w = this.m;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.b = ofFloat;
            ofFloat.addUpdateListener(new vhc(this, hicVar, (byte) 3));
            this.e = gl.L(12.0f) + this.c;
            this.f = gl.L(12.0f) + this.d;
            SecureRandom secureRandom = Utilities.b;
            this.c = gl.L(12.0f) + secureRandom.nextInt(gl.L(16.0f));
            this.d = gl.L(12.0f) + secureRandom.nextInt(gl.L(16.0f));
            this.b.setInterpolator(new LinearInterpolator());
            this.b.addListener(new rjc(this));
            this.b.setDuration(2000L);
        }
    }

    public final void a(Canvas canvas) {
        tl tlVar = this.a;
        if (tlVar == null) {
            return;
        }
        canvas.save();
        float f = this.n;
        canvas.scale(f, f, this.o / 2.0f, gl.L(300.0f));
        canvas.translate(this.i - this.p, this.j);
        int i = this.g;
        int i2 = this.h;
        int i3 = this.l;
        tlVar.setBounds(i, i2, i + i3, i3 + i2);
        tlVar.w = this.m;
        tlVar.draw(canvas);
        canvas.restore();
    }

    public final void b(int i, int i2) {
        int i3;
        ml mlVar;
        tl tlVar = this.a;
        if (tlVar != null) {
            this.i = i;
            this.j = i2;
            this.k.invalidate();
            if (!this.q) {
                Drawable drawable = tlVar.f[0];
                if ((drawable instanceof vl) && ((mlVar = ((vl) drawable).k) == null || !mlVar.C())) {
                    return;
                }
                this.q = true;
                if (this.i > this.o / 2) {
                    i3 = gl.L(12.0f);
                } else {
                    i3 = -gl.L(12.0f);
                }
                this.p = i3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new s33(0.34d, 1.36d, 0.64d, 1.0d));
                ofFloat.addUpdateListener(new qjc(this, (byte) 0));
                ofFloat.setDuration(350L);
                ofFloat.setStartDelay(180L);
                ofFloat.start();
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 255);
                ofInt.setInterpolator(s33.f);
                ofInt.addUpdateListener(new qjc(this, (byte) 1));
                ofInt.setStartDelay(180L);
                ofInt.setDuration(350L);
                ofInt.start();
            }
        }
    }
}
