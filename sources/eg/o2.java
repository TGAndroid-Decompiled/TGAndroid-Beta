package eg;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ai;
public final class o2 {
    public long f5389a;
    public final int f5390b;
    public float d;
    public float e;
    public float f5392f;
    public float f5393g;
    public float h;
    public float f5394i;
    public float f5395j;
    public float f5396k;
    public int f5397l;
    public int f5398m;
    public float f5399n;
    public float f5400o;
    public float f5401p;
    public final p2 f5403r;
    public float f5391c = 1.0f;
    public boolean f5402q = true;

    public o2(p2 p2Var) {
        this.f5403r = p2Var;
        int i10 = p2Var.S;
        p2Var.S = i10 + 1;
        this.f5390b = i10;
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
        p2 p2Var = this.f5403r;
        int i12 = p2Var.N;
        ArrayList arrayList = p2Var.f5426n;
        RectF rectF = p2Var.f5416a;
        int i13 = 0;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f5397l = 0;
            } else {
                this.f5397l = (int) Math.floor((nextFloat * (p2Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f5397l = Math.abs(Utilities.fastRandom.nextInt() % p2Var.d.length);
        }
        long j11 = j10 + p2Var.f5435x;
        Random random = Utilities.fastRandom;
        int i14 = p2Var.f5436y;
        if (p2Var.f5419f[this.f5397l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f5389a = j11 + random.nextInt(i14 * i10);
        this.f5399n = 0.0f;
        if (p2Var.f5425m) {
            this.f5391c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
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
                        f13 = ((o2) arrayList.get(i13)).f5392f - abs3;
                        f14 = ((o2) arrayList.get(i13)).f5393g;
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
                float f19 = p2Var.f5422j;
                float w10 = e2.c.w(width, f19, ai.f(Utilities.fastRandom, 1000) / 1000.0f, f19);
                float f20 = ai.f(Utilities.fastRandom, 360);
                if (p2Var.f5419f[this.f5397l] && !this.f5402q) {
                    w10 = Math.min(w10, AndroidUtilities.dp(10.0f));
                    f12 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f12 = 0.0f;
                }
                double d = w10;
                double d10 = f20;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f12 + p2Var.f5423k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (p2Var.f5419f[this.f5397l]) {
            this.f5401p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (p2Var.f5419f[this.f5397l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (p2Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.e - (rectF.centerY() + p2Var.f5423k), this.d - (rectF.centerX() + f11));
        }
        this.f5395j = (float) Math.cos(atan2);
        this.f5396k = (float) Math.sin(atan2);
        if (p2Var.e[this.f5397l]) {
            this.f5398m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f5398m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = p2Var.N;
        if ((i16 == 6 && ((i11 = this.f5397l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f5399n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (p2Var.N != 101) {
            this.f5400o = 0.0f;
        }
        if (p2Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f10)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f5392f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + p2Var.f5423k;
            this.e = sin;
            this.f5393g = sin;
        }
        this.f5402q = false;
    }
}
