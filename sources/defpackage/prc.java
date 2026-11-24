package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
public final class prc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final long g;
    public final qrc h;

    public prc(qrc qrcVar, prc prcVar, float f, boolean z) {
        long uptimeMillis;
        float f2;
        float A;
        float f3;
        this.h = qrcVar;
        this.f = z;
        this.b = f;
        this.a = prcVar != null ? prcVar.a : f;
        if (prcVar != null && !z) {
            uptimeMillis = prcVar.g;
        } else {
            uptimeMillis = SystemClock.uptimeMillis();
        }
        this.g = uptimeMillis;
        float f4 = 0.0f;
        if (prcVar != null && z) {
            f2 = prcVar.a();
        } else {
            f2 = 0.0f;
        }
        if (prcVar != null) {
            float f5 = prcVar.c;
            f4 = td4.A(1.0f, f5, f2, f5);
        }
        this.c = f4;
        if (prcVar == null) {
            A = qrcVar.P;
        } else {
            float f6 = prcVar.d;
            A = td4.A(1.0f, f6, f2, f6);
        }
        this.d = A;
        if (prcVar == null) {
            f3 = (-gm.N(44.0f)) * 0.1f;
        } else {
            f3 = prcVar.e * (1.0f - f2);
        }
        this.e = f3;
    }

    public final float a() {
        if (this.h.J >= 1.0f) {
            return 1.0f;
        }
        return qrc.T.getInterpolation(Math.min(1.0f, ((float) (SystemClock.uptimeMillis() - this.g)) / 320.0f));
    }

    public final void b(Canvas canvas, Paint paint, String str, float f, int i) {
        float f2;
        float f3;
        float a = a();
        float f4 = 1.0f;
        boolean z = this.f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        float f5 = this.c;
        float A = td4.A(f2, f5, a, f5);
        if (A <= 0.0f) {
            return;
        }
        int alpha = paint.getAlpha();
        float measureText = paint.measureText(str);
        canvas.save();
        float d = d() + f;
        float f6 = i;
        float f7 = this.e;
        float f8 = f6 + f7;
        if (z) {
            f3 = gm.N(44.0f) * 0.1f;
        } else {
            f3 = 0.0f;
        }
        canvas.translate(d, td4.A(f3, f7, a, f8));
        if (z) {
            f4 = this.h.P;
        }
        float f9 = this.d;
        float A2 = td4.A(f4, f9, a, f9);
        canvas.scale(A2, A2, measureText / 2.0f, (paint.descent() + paint.ascent()) / 2.0f);
        paint.setAlpha(Math.round(alpha * A));
        canvas.drawText(str, 0.0f, 0.0f, paint);
        paint.setAlpha(alpha);
        canvas.restore();
    }

    public final prc c() {
        qrc qrcVar = this.h;
        if (qrcVar.J >= 1.0f) {
            return new prc(qrcVar, d());
        }
        return new prc(qrcVar, d(), this);
    }

    public final float d() {
        float f = this.b;
        float f2 = this.a;
        return (qrc.T.getInterpolation(this.h.J) * (f - f2)) + f2;
    }

    public prc(qrc qrcVar, float f) {
        this.h = qrcVar;
        this.f = false;
        this.b = f;
        this.a = f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = 0.0f;
        this.g = SystemClock.uptimeMillis();
    }

    public prc(qrc qrcVar, float f, prc prcVar) {
        this.h = qrcVar;
        this.f = prcVar.f;
        this.b = f;
        this.a = f;
        this.c = prcVar.c;
        this.d = prcVar.d;
        this.e = prcVar.e;
        this.g = prcVar.g;
    }
}
