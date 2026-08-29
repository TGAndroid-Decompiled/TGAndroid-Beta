package cg;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.th;
public final class q2 {
    public long f3289a;
    public final int f3290b;
    public float d;
    public float f3292e;
    public float f3293f;
    public float f3294g;
    public float h;
    public float f3295i;
    public float f3296j;
    public float f3297k;
    public int f3298l;
    public int f3299m;
    public float f3300n;
    public float f3301o;
    public float f3302p;
    public final r2 f3304r;
    public float f3291c = 1.0f;
    public boolean f3303q = true;

    public q2(r2 r2Var) {
        this.f3304r = r2Var;
        int i10 = r2Var.S;
        r2Var.S = i10 + 1;
        this.f3290b = i10;
    }

    public final void a(android.graphics.Canvas r11, long r12, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: cg.q2.a(android.graphics.Canvas, long, float):void");
    }

    public final void b(long j10) {
        int i10;
        float f9;
        float f10;
        float f11;
        double atan2;
        int i11;
        float f12;
        float f13;
        float nextFloat;
        r2 r2Var = this.f3304r;
        int i12 = r2Var.N;
        ArrayList arrayList = r2Var.f3341n;
        RectF rectF = r2Var.f3330a;
        int i13 = 0;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f3298l = 0;
            } else {
                this.f3298l = (int) Math.floor((nextFloat * (r2Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f3298l = Math.abs(Utilities.fastRandom.nextInt() % r2Var.d.length);
        }
        long j11 = j10 + r2Var.f3350x;
        Random random = Utilities.fastRandom;
        int i14 = r2Var.f3351y;
        if (r2Var.f3334f[this.f3298l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f3289a = j11 + random.nextInt(i14 * i10);
        this.f3300n = 0.0f;
        if (r2Var.f3340m) {
            this.f3291c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (r2Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            int i15 = 0;
            float f14 = 0.0f;
            while (i15 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f15 = 2.1474836E9f;
                while (i13 < arrayList.size()) {
                    if (r2Var.h) {
                        f12 = ((q2) arrayList.get(i13)).f3293f - abs3;
                        f13 = ((q2) arrayList.get(i13)).f3294g;
                    } else {
                        f12 = ((q2) arrayList.get(i13)).d - abs3;
                        f13 = ((q2) arrayList.get(i13)).f3292e;
                    }
                    float f16 = f13 - abs4;
                    float f17 = (f16 * f16) + (f12 * f12);
                    if (f17 < f15) {
                        f15 = f17;
                    }
                    i13++;
                }
                if (f15 > f14) {
                    abs2 = abs4;
                    f14 = f15;
                    abs = abs3;
                }
                i15++;
                i13 = 0;
            }
            f9 = 0.6f;
            f10 = 0.0f;
            this.d = abs;
            this.f3292e = abs2;
        } else {
            f9 = 0.6f;
            f10 = 0.0f;
            if (r2Var.J) {
                float width = rectF.width();
                float f18 = r2Var.f3337j;
                float z10 = com.google.android.recaptcha.internal.a.z(width, f18, th.f(Utilities.fastRandom, 1000) / 1000.0f, f18);
                float f19 = th.f(Utilities.fastRandom, 360);
                if (r2Var.f3334f[this.f3298l] && !this.f3303q) {
                    z10 = Math.min(z10, AndroidUtilities.dp(10.0f));
                    f11 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f11 = 0.0f;
                }
                double d = z10;
                double d10 = f19;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.f3292e = rectF.centerY() + f11 + r2Var.f3338k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.f3292e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (r2Var.f3334f[this.f3298l]) {
            this.f3302p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (r2Var.f3334f[this.f3298l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (r2Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.f3292e - (rectF.centerY() + r2Var.f3338k), this.d - (rectF.centerX() + f10));
        }
        this.f3296j = (float) Math.cos(atan2);
        this.f3297k = (float) Math.sin(atan2);
        if (r2Var.f3333e[this.f3298l]) {
            this.f3299m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f3299m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = r2Var.N;
        if ((i16 == 6 && ((i11 = this.f3298l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f3300n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (r2Var.N != 101) {
            this.f3301o = 0.0f;
        }
        if (r2Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f9)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f3293f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + r2Var.f3338k;
            this.f3292e = sin;
            this.f3294g = sin;
        }
        this.f3303q = false;
    }
}
