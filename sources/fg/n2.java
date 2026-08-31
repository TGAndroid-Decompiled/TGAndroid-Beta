package fg;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.yh;
public final class n2 {
    public long f6421a;
    public final int f6422b;
    public float d;
    public float f6424e;
    public float f6425f;
    public float f6426g;
    public float h;
    public float f6427i;
    public float f6428j;
    public float f6429k;
    public int f6430l;
    public int f6431m;
    public float f6432n;
    public float f6433o;
    public float f6434p;
    public final o2 f6436r;
    public float f6423c = 1.0f;
    public boolean f6435q = true;

    public n2(o2 o2Var) {
        this.f6436r = o2Var;
        int i10 = o2Var.S;
        o2Var.S = i10 + 1;
        this.f6422b = i10;
    }

    public final void a(android.graphics.Canvas r11, long r12, float r14) {
        throw new UnsupportedOperationException("Method not decompiled: fg.n2.a(android.graphics.Canvas, long, float):void");
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
        o2 o2Var = this.f6436r;
        int i12 = o2Var.N;
        ArrayList arrayList = o2Var.f6462n;
        RectF rectF = o2Var.f6451a;
        int i13 = 0;
        if (i12 == 28) {
            if (Utilities.fastRandom.nextFloat() < 0.13f) {
                this.f6430l = 0;
            } else {
                this.f6430l = (int) Math.floor((nextFloat * (o2Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f6430l = Math.abs(Utilities.fastRandom.nextInt() % o2Var.d.length);
        }
        long j11 = j10 + o2Var.f6471x;
        Random random = Utilities.fastRandom;
        int i14 = o2Var.f6472y;
        if (o2Var.f6455f[this.f6430l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f6421a = j11 + random.nextInt(i14 * i10);
        this.f6432n = 0.0f;
        if (o2Var.f6461m) {
            this.f6423c = (Utilities.fastRandom.nextFloat() * 0.6f) + 0.4f;
        }
        if (o2Var.B) {
            float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
            float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            int i15 = 0;
            float f15 = 0.0f;
            while (i15 < 10) {
                float abs3 = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
                float f16 = 2.1474836E9f;
                while (i13 < arrayList.size()) {
                    if (o2Var.h) {
                        f13 = ((n2) arrayList.get(i13)).f6425f - abs3;
                        f14 = ((n2) arrayList.get(i13)).f6426g;
                    } else {
                        f13 = ((n2) arrayList.get(i13)).d - abs3;
                        f14 = ((n2) arrayList.get(i13)).f6424e;
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
            this.f6424e = abs2;
        } else {
            f10 = 0.6f;
            f11 = 0.0f;
            if (o2Var.J) {
                float width = rectF.width();
                float f19 = o2Var.f6458j;
                float w10 = e2.c.w(width, f19, yh.f(Utilities.fastRandom, 1000) / 1000.0f, f19);
                float f20 = yh.f(Utilities.fastRandom, 360);
                if (o2Var.f6455f[this.f6430l] && !this.f6435q) {
                    w10 = Math.min(w10, AndroidUtilities.dp(10.0f));
                    f12 = AndroidUtilities.dp(30.0f) + 0.0f;
                } else {
                    f12 = 0.0f;
                }
                double d = w10;
                double d10 = f20;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.f6424e = rectF.centerY() + f12 + o2Var.f6459k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
                this.f6424e = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            }
        }
        if (o2Var.f6455f[this.f6430l]) {
            this.f6434p = Math.abs(Utilities.fastRandom.nextFloat() * 2.0f);
        }
        if (o2Var.f6455f[this.f6430l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.fastRandom.nextFloat() * 200.0f));
        } else if (o2Var.h) {
            atan2 = Utilities.fastRandom.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.f6424e - (rectF.centerY() + o2Var.f6459k), this.d - (rectF.centerX() + f11));
        }
        this.f6428j = (float) Math.cos(atan2);
        this.f6429k = (float) Math.sin(atan2);
        if (o2Var.f6454e[this.f6430l]) {
            this.f6431m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f6431m = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i16 = o2Var.N;
        if ((i16 == 6 && ((i11 = this.f6430l) == 1 || i11 == 2)) || i16 == 9 || i16 == 3 || i16 == 7 || i16 == 24 || i16 == 11 || i16 == 22 || i16 == 4) {
            this.f6432n = (int) (((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 45.0f);
        }
        if (o2Var.N != 101) {
            this.f6433o = 0.0f;
        }
        if (o2Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.fastRandom.nextFloat() * 1.2f) + f10)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f6425f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + o2Var.f6459k;
            this.f6424e = sin;
            this.f6426g = sin;
        }
        this.f6435q = false;
    }
}
