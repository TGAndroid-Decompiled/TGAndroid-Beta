package kg;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class e2 {
    public long f11044a;
    public final int f11045b;
    public float d;
    public float e;
    public float f11047f;
    public float f11048g;
    public float h;
    public float f11049i;
    public float f11050j;
    public float f11051k;
    public int f11052l;
    public int f11053m;
    public float f11054n;
    public long f11055o;
    public float f11056p;
    public float f11057q;
    public float f11058r;
    public final f2 f11060t;
    public float f11046c = 1.0f;
    public boolean f11059s = true;

    public e2(f2 f2Var) {
        this.f11060t = f2Var;
        int i10 = f2Var.T;
        f2Var.T = i10 + 1;
        this.f11045b = i10;
    }

    public final void a(android.graphics.Canvas r21, long r22, float r24) {
        throw new UnsupportedOperationException("Method not decompiled: kg.e2.a(android.graphics.Canvas, long, float):void");
    }

    public final void b(long j10) {
        int i10;
        float f7;
        float f10;
        float f11;
        double atan2;
        int i11;
        float f12;
        float f13;
        float f14;
        float nextFloat;
        f2 f2Var = this.f11060t;
        int i12 = f2Var.O;
        ArrayList arrayList = f2Var.f11078n;
        RectF rectF = f2Var.f11068a;
        if (i12 == 28) {
            if (Utilities.f14520c.nextFloat() < 0.13f) {
                this.f11052l = 0;
            } else {
                this.f11052l = (int) Math.floor((nextFloat * (f2Var.d.length - 2)) + 1.0f);
            }
        } else {
            this.f11052l = Math.abs(((int) Utilities.f14520c.nextLong()) % f2Var.d.length);
        }
        long j11 = f2Var.f11087x + j10;
        d5.a aVar = Utilities.f14520c;
        int i13 = f2Var.f11088y;
        if (f2Var.f11071f[this.f11052l]) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        this.f11044a = aVar.nextInt(i13 * i10) + j11;
        this.f11055o = j10;
        this.f11056p = aVar.nextFloat() * 6.28f;
        float f15 = 0.0f;
        this.f11054n = 0.0f;
        float f16 = 0.6f;
        if (f2Var.f11077m) {
            this.f11046c = (aVar.nextFloat() * 0.6f) + 0.4f;
        }
        if (f2Var.B) {
            float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
            float abs2 = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            float f17 = 0.0f;
            int i14 = 0;
            while (i14 < 10) {
                float f18 = rectF.left;
                d5.a aVar2 = Utilities.f14520c;
                float f19 = f15;
                int i15 = i14;
                float abs3 = Math.abs(((int) aVar2.nextLong()) % rectF.width()) + f18;
                float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
                float f20 = 2.1474836E9f;
                int i16 = 0;
                while (i16 < arrayList.size()) {
                    if (f2Var.h) {
                        f13 = ((e2) arrayList.get(i16)).f11047f - abs3;
                        f12 = f16;
                        f14 = ((e2) arrayList.get(i16)).f11048g;
                    } else {
                        f12 = f16;
                        f13 = ((e2) arrayList.get(i16)).d - abs3;
                        f14 = ((e2) arrayList.get(i16)).e;
                    }
                    float f21 = f14 - abs4;
                    float f22 = (f21 * f21) + (f13 * f13);
                    if (f22 < f20) {
                        f20 = f22;
                    }
                    i16++;
                    f16 = f12;
                }
                float f23 = f16;
                if (f20 > f17) {
                    abs = abs3;
                    f17 = f20;
                    abs2 = abs4;
                }
                i14 = i15 + 1;
                f15 = f19;
                f16 = f23;
            }
            f7 = f15;
            f10 = f16;
            this.d = abs;
            this.e = abs2;
        } else {
            f7 = 0.0f;
            f10 = 0.6f;
            if (f2Var.J) {
                float width = rectF.width();
                float f24 = f2Var.f11074j;
                float z10 = c3.i0.z(width, f24, Math.abs(((int) aVar.nextLong()) % 1000) / 1000.0f, f24);
                float abs5 = Math.abs(((int) aVar.nextLong()) % 360);
                if (f2Var.f11071f[this.f11052l] && !this.f11059s) {
                    z10 = Math.min(z10, org.telegram.messenger.i0.L(10.0f));
                    f11 = org.telegram.messenger.i0.L(30.0f) + 0.0f;
                } else {
                    f11 = 0.0f;
                }
                double d = z10;
                double d10 = abs5;
                this.d = rectF.centerX() + 0.0f + ((float) (Math.sin(Math.toRadians(d10)) * d));
                this.e = rectF.centerY() + f11 + f2Var.f11075k + ((float) (Math.cos(Math.toRadians(d10)) * d));
            } else {
                this.d = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
                this.e = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
            }
        }
        if (f2Var.f11071f[this.f11052l]) {
            this.f11058r = Math.abs(Utilities.f14520c.nextFloat() * 2.0f);
        }
        if (f2Var.f11071f[this.f11052l]) {
            atan2 = Math.toRadians(280.0f - (Utilities.f14520c.nextFloat() * 200.0f));
        } else if (f2Var.h) {
            atan2 = Utilities.f14520c.nextDouble() * 3.141592653589793d * 2.0d;
        } else {
            atan2 = Math.atan2(this.e - (rectF.centerY() + f2Var.f11075k), this.d - (rectF.centerX() + f7));
        }
        this.f11050j = (float) Math.cos(atan2);
        this.f11051k = (float) Math.sin(atan2);
        if (f2Var.e[this.f11052l]) {
            this.f11053m = (int) (((Utilities.f14520c.nextInt(50) + 50) / 100.0f) * 120.0f);
        } else {
            this.f11053m = (int) (((Utilities.f14520c.nextInt(50) + 50) / 100.0f) * 255.0f);
        }
        int i17 = f2Var.O;
        if ((i17 == 6 && ((i11 = this.f11052l) == 1 || i11 == 2)) || i17 == 9 || i17 == 3 || i17 == 7 || i17 == 24 || i17 == 11 || i17 == 22 || i17 == 4) {
            this.f11054n = (int) (((((int) Utilities.f14520c.nextLong()) % 100) / 100.0f) * 45.0f);
        }
        if (f2Var.O != 101) {
            this.f11057q = f7;
        }
        if (f2Var.h) {
            float min = (Math.min(rectF.width(), rectF.height()) * ((Utilities.f14520c.nextFloat() * 1.2f) + f10)) / 2.0f;
            float cos = (((float) Math.cos(atan2)) * min) + rectF.centerX() + 0.0f;
            this.d = cos;
            this.f11047f = cos;
            float sin = (((float) Math.sin(atan2)) * min) + rectF.centerY() + f2Var.f11075k;
            this.e = sin;
            this.f11048g = sin;
        }
        this.f11059s = false;
    }
}
