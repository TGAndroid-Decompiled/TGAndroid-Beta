package ag;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.pa;

public final class i3 {

    public long f469a;

    public final int f470b;
    public float d;

    public float f472e;

    public float f473f;

    public float f474g;
    public float h;

    public float f475i;

    public float f476j;

    public float f477k;

    public int f478l;

    public int f479m;

    public float f480n;

    public float f481o;

    public float f482p;

    public final j3 f484r;

    public float f471c = 1.0f;

    public boolean f483q = true;

    public i3(j3 j3Var) {
        this.f484r = j3Var;
        int i10 = j3Var.S;
        j3Var.S = i10 + 1;
        this.f470b = i10;
    }

    public final void a(Canvas canvas, long j10, float f10) {
        float fClamp;
        j3 j3Var = this.f484r;
        boolean z10 = j3Var.G;
        RectF rectF = j3Var.f501c;
        float f11 = j3Var.A;
        if (z10) {
            int[] iArr = j3Var.E;
            int i10 = this.f478l;
            int i11 = iArr[i10];
            float[] fArr = j3Var.D[i10];
            int i12 = i11 * 2;
            this.h = fArr[i12];
            this.f475i = fArr[i12 + 1];
            iArr[i10] = i11 + 1;
        } else {
            this.h = this.d;
            this.f475i = this.f472e;
        }
        if (rectF.isEmpty() || !rectF.contains(this.h, this.f475i)) {
            canvas.save();
            canvas.translate(this.h, this.f475i);
            float f12 = this.f480n;
            if (f12 != 0.0f) {
                canvas.rotate(f12, j3Var.d[this.f478l].getWidth() / 2.0f, j3Var.d[this.f478l].getHeight() / 2.0f);
            }
            if (j3Var.I) {
                long j11 = this.f469a - j10;
                if (j11 < 200) {
                    fClamp = Utilities.clamp(1.0f - (j11 / 150.0f), 1.0f, 0.0f);
                } else {
                    fClamp = 0.0f;
                }
            } else {
                fClamp = 0.0f;
            }
            float f13 = this.f481o;
            if (f13 < 1.0f || hh.m.f9702b != 1.0f) {
                float interpolation = AndroidUtilities.overshootInterpolator.getInterpolation(f13) * hh.m.f9702b;
                canvas.scale(interpolation, interpolation, 0.0f, 0.0f);
            }
            if (j3Var.f503f[this.f478l]) {
                float fMin = (Math.min(j3Var.f511o, 3.5f) * (f11 / 1000.0f)) + this.f482p;
                this.f482p = fMin;
                canvas.scale((float) Math.cos(((double) fMin) * 3.141592653589793d), 1.0f, 0.0f, 0.0f);
            }
            Utilities.CallbackReturn callbackReturn = j3Var.f508l;
            Paint paint = callbackReturn != null ? (Paint) callbackReturn.run(Integer.valueOf(this.f470b)) : j3Var.f505i;
            float f14 = 1.0f - fClamp;
            paint.setAlpha((int) (this.f479m * f14 * f10));
            Bitmap bitmap = j3Var.d[this.f478l];
            if (j3Var.f509m) {
                float f15 = this.f471c * f14 * f10 * this.f481o;
                canvas.scale(f15, f15);
            }
            canvas.drawBitmap(bitmap, -(bitmap.getWidth() >> 1), -(bitmap.getHeight() >> 1), paint);
            canvas.restore();
        }
        if (j3Var.f504g) {
            return;
        }
        float fDp = (f11 / 660.0f) * AndroidUtilities.dp(4.0f);
        float fMin2 = j3Var.f503f[this.f478l] ? Math.min(j3Var.f511o, 3.5f) * 4.0f * fDp : fDp * j3Var.f511o;
        this.d = (this.f476j * fMin2) + this.d;
        this.f472e = (this.f477k * fMin2) + this.f472e;
        float f16 = this.f481o;
        if (f16 != 1.0f) {
            float f17 = (f11 / 200.0f) + f16;
            this.f481o = f17;
            if (f17 > 1.0f) {
                this.f481o = 1.0f;
            }
        }
    }

    public final void b(long j10) {
        float f10;
        float f11;
        float fDp;
        double dNextDouble;
        int i10;
        float f12;
        float f13;
        j3 j3Var = this.f484r;
        int i11 = j3Var.N;
        ArrayList arrayList = j3Var.f510n;
        RectF rectF = j3Var.f499a;
        int i12 = 0;
        if (i11 == 28) {
            float fNextFloat = Utilities.fastRandom.nextFloat();
            if (fNextFloat < 0.13f) {
                this.f478l = 0;
            } else {
                this.f478l = (int) Math.floor((fNextFloat * (j3Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f478l = Math.abs(Utilities.fastRandom.nextInt() % j3Var.d.length);
        }
        this.f469a = j10 + j3Var.f519x + ((long) Utilities.fastRandom.nextInt(j3Var.f520y * (j3Var.f503f[this.f478l] ? 3 : 1)));
        this.f480n = 0.0f;
        if (j3Var.f509m) {
            this.f471c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (j3Var.B) {
            float fAbs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float fAbs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            int i13 = 0;
            float f14 = 0.0f;
            while (i13 < 10) {
                float fAbs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float fAbs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f15 = 2.1474836E9f;
                while (i12 < arrayList.size()) {
                    if (j3Var.h) {
                        f12 = ((i3) arrayList.get(i12)).f473f - fAbs3;
                        f13 = ((i3) arrayList.get(i12)).f474g;
                    } else {
                        f12 = ((i3) arrayList.get(i12)).d - fAbs3;
                        f13 = ((i3) arrayList.get(i12)).f472e;
                    }
                    float f16 = f13 - fAbs4;
                    float f17 = (f16 * f16) + (f12 * f12);
                    if (f17 < f15) {
                        f15 = f17;
                    }
                    i12++;
                }
                if (f15 > f14) {
                    fAbs2 = fAbs4;
                    f14 = f15;
                    fAbs = fAbs3;
                }
                i13++;
                i12 = 0;
            }
            f10 = 0.6f;
            f11 = 0.0f;
            this.d = fAbs;
            this.f472e = fAbs2;
        } else {
            f10 = 0.6f;
            f11 = 0.0f;
            if (j3Var.J) {
                float f18 = pa.f(Utilities.fastRandom, 1000) / 1000.0f;
                float fWidth = rectF.width();
                float f19 = j3Var.f506j;
                float fZ = com.google.android.recaptcha.internal.a.z(fWidth, f19, f18, f19);
                float f20 = pa.f(Utilities.fastRandom, 360);
                if (!j3Var.f503f[this.f478l] || this.f483q) {
                    fDp = 0.0f;
                } else {
                    fZ = Math.min(fZ, AndroidUtilities.dp(10.0f));
                    fDp = AndroidUtilities.dp(30.0f) + 0.0f;
                }
                double d = fZ;
                double d10 = f20;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.f472e = rectF.centerY() + fDp + j3Var.f507k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.f472e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (j3Var.f503f[this.f478l]) {
            this.f482p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (j3Var.f503f[this.f478l]) {
            dNextDouble = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else {
            dNextDouble = j3Var.h ? Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d : Math.atan2(this.f472e - (rectF.centerY() + j3Var.f507k), this.d - (rectF.centerX() + f11));
        }
        this.f476j = (float) Math.cos(dNextDouble);
        this.f477k = (float) Math.sin(dNextDouble);
        if (j3Var.f502e[this.f478l]) {
            this.f479m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f479m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i14 = j3Var.N;
        if ((i14 == 6 && ((i10 = this.f478l) == 1 || i10 == 2)) || i14 == 9 || i14 == 3 || i14 == 7 || i14 == 24 || i14 == 11 || i14 == 22 || i14 == 4) {
            this.f480n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (j3Var.N != 101) {
            this.f481o = 0.0f;
        }
        if (j3Var.h) {
            float fMin = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f10)) / 2.0f;
            float fCos = (((float) Math.cos(dNextDouble)) * fMin) + rectF.centerX() + 0.0f;
            this.d = fCos;
            this.f473f = fCos;
            float fSin = (((float) Math.sin(dNextDouble)) * fMin) + rectF.centerY() + j3Var.f507k;
            this.f472e = fSin;
            this.f474g = fSin;
        }
        this.f483q = false;
    }
}
