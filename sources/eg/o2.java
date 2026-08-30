package eg;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.yh;
public final class o2 {
    public long f5400a;
    public final int f5401b;
    public float d;
    public float e;
    public float f5403f;
    public float f5404g;
    public float h;
    public float f5405i;
    public float f5406j;
    public float f5407k;
    public int f5408l;
    public int f5409m;
    public float f5410n;
    public float f5411o;
    public float f5412p;
    public final p2 f5414r;
    public float f5402c = 1.0f;
    public boolean f5413q = true;

    public o2(p2 p2Var) {
        this.f5414r = p2Var;
        int i10 = p2Var.S;
        p2Var.S = i10 + 1;
        this.f5401b = i10;
    }

    public final void a(android.graphics.Canvas r11, long r12, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: eg.o2.a(android.graphics.Canvas, long, float):void");
    }

    public final void b(long j10) {
        int i10;
        float f10;
        float f11;
        float f12;
        double atan2;
        int i11;
        float f13;
        float f14;
        float nextFloat;
        p2 p2Var = this.f5414r;
        int i12 = p2Var.N;
        ArrayList arrayList = p2Var.f5437n;
        RectF rectF = p2Var.f5427a;
        int i13 = 0;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f5408l = 0;
            } else {
                this.f5408l = (int) Math.floor((nextFloat * (p2Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f5408l = Math.abs(Utilities.fastRandom.nextInt() % p2Var.d.length);
        }
        long j11 = j10 + p2Var.f5446x;
        Random random = Utilities.fastRandom;
        int i14 = p2Var.f5447y;
        if (p2Var.f5430f[this.f5408l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f5400a = j11 + random.nextInt(i14 * i10);
        this.f5410n = 0.0f;
        if (p2Var.f5436m) {
            this.f5402c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (p2Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            int i15 = 0;
            float f15 = 0.0f;
            while (i15 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f16 = 2.1474836E9f;
                while (i13 < arrayList.size()) {
                    if (p2Var.h) {
                        f13 = ((o2) arrayList.get(i13)).f5403f - abs3;
                        f14 = ((o2) arrayList.get(i13)).f5404g;
                    } else {
                        f13 = ((o2) arrayList.get(i13)).d - abs3;
                        f14 = ((o2) arrayList.get(i13)).e;
                    }
                    float f17 = f14 - abs4;
                    float f18 = (f17 * f17) + (f13 * f13);
                    if (f18 < f16) {
                        f16 = f18;
                    }
                    i13++;
                }
                if (f16 > f15) {
                    abs2 = abs4;
                    f15 = f16;
                    abs = abs3;
                }
                i15++;
                i13 = 0;
            }
            f10 = 0.6f;
            f11 = 0.0f;
            this.d = abs;
            this.e = abs2;
        } else {
            f10 = 0.6f;
            f11 = 0.0f;
            if (p2Var.J) {
                float width = rectF.width();
                float f19 = p2Var.f5433j;
                float w10 = e2.c.w(width, f19, yh.g(Utilities.fastRandom, 1000) / 1000.0f, f19);
                float g10 = yh.g(Utilities.fastRandom, 360);
                if (p2Var.f5430f[this.f5408l] && !this.f5413q) {
                    w10 = Math.min(w10, AndroidUtilities.dp(10.0f));
                    f12 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f12 = 0.0f;
                }
                double d = w10;
                double d10 = g10;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f12 + p2Var.f5434k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (p2Var.f5430f[this.f5408l]) {
            this.f5412p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (p2Var.f5430f[this.f5408l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (p2Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.e - (rectF.centerY() + p2Var.f5434k), this.d - (rectF.centerX() + f11));
        }
        this.f5406j = (float) Math.cos(atan2);
        this.f5407k = (float) Math.sin(atan2);
        if (p2Var.e[this.f5408l]) {
            this.f5409m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f5409m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = p2Var.N;
        if ((i16 == 6 && ((i11 = this.f5408l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f5410n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (p2Var.N != 101) {
            this.f5411o = 0.0f;
        }
        if (p2Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f10)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f5403f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + p2Var.f5434k;
            this.e = sin;
            this.f5404g = sin;
        }
        this.f5413q = false;
    }
}
