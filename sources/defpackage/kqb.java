package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class kqb extends Path {
    public final int a = gm.L(10.0f);
    public final float[] b;
    public ArrayList c;
    public ArrayList d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;

    public kqb() {
        this.b = r0;
        float L = gm.L(2.0f);
        float[] fArr = {L, L, L, L, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public static int c(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) != null) {
                i += ((eqb) arrayList.get(i2)).e;
            }
        }
        return i;
    }

    public final void a(float f, float f2, float f3, float f4, float f5, float f6, ArrayList arrayList) {
        float f7;
        float f8;
        float f9;
        short s;
        float e;
        int i;
        float e2;
        int i2;
        float f10 = f;
        float f11 = f3;
        if (arrayList != null && !arrayList.isEmpty()) {
            float f12 = 0.0f;
            if (Math.abs(this.e - f4) <= 1.0f && Math.abs(this.f - f5) <= 0.01f && Math.abs(this.g - 0.0f) <= 0.1f && Math.abs(this.h - f6) <= 1.0f && Math.abs(this.i - f10) <= 1.0f && Math.abs(this.j - f2) <= 1.0f && Math.abs(this.k - f11) <= 1.0f) {
                ArrayList arrayList2 = this.c;
                if (arrayList2 != null && arrayList2.size() == arrayList.size()) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        int intValue = ((Integer) arrayList2.get(i3)).intValue();
                        if (arrayList.get(i3) == null) {
                            i2 = 0;
                        } else {
                            i2 = ((eqb) arrayList.get(i3)).b;
                        }
                        if (intValue == i2) {
                        }
                    }
                }
                ArrayList arrayList3 = this.d;
                if (arrayList3 != null && arrayList3.size() == arrayList.size()) {
                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                        float floatValue = ((Float) arrayList3.get(i4)).floatValue();
                        if (arrayList.get(i4) == null) {
                            e2 = 0.0f;
                        } else {
                            e2 = ((eqb) arrayList.get(i4)).a.e(false, ((eqb) arrayList.get(i4)).c);
                        }
                        if (floatValue != e2) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            ArrayList arrayList4 = this.c;
            if (arrayList4 == null) {
                this.c = new ArrayList();
            } else {
                arrayList4.clear();
            }
            int i5 = 0;
            while (i5 < arrayList.size()) {
                ArrayList arrayList5 = this.c;
                if (arrayList.get(i5) == null) {
                    i = 0;
                } else {
                    i = ((eqb) arrayList.get(i5)).b;
                }
                i5 = td4.g(i, i5, 1, arrayList5);
            }
            ArrayList arrayList6 = this.d;
            if (arrayList6 == null) {
                this.d = new ArrayList();
            } else {
                arrayList6.clear();
            }
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                ArrayList arrayList7 = this.d;
                if (arrayList.get(i6) == null) {
                    e = 0.0f;
                } else {
                    e = ((eqb) arrayList.get(i6)).a.e(false, ((eqb) arrayList.get(i6)).c);
                }
                arrayList7.add(Float.valueOf(e));
            }
            this.i = f10;
            this.j = f2;
            this.k = f11;
            this.g = 0.0f;
            this.f = f5;
            this.e = f4;
            this.h = f6;
            ArrayList arrayList8 = this.d;
            rewind();
            float round = Math.round(gm.N(3.3333f));
            int i7 = 0;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                if (arrayList.get(i8) != null) {
                    i7 = Math.max(i7, ((eqb) arrayList.get(i8)).b);
                }
            }
            int max = Math.max(0, (int) (((f2 - this.a) - f10) / round));
            int min = Math.min(i7 - 1, (int) Math.ceil(((f11 + f7) - f10) / round));
            while (max <= min) {
                float f13 = max;
                float L = (f13 * round) + f10 + gm.L(2.0f);
                float f14 = f12;
                int i9 = 0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (arrayList.get(i10) != null && max < ((eqb) arrayList.get(i10)).b) {
                        s = ((eqb) arrayList.get(i10)).d[max];
                    } else {
                        s = 0;
                    }
                    if (f13 < ((Float) arrayList8.get(i10)).floatValue() && max + 1 > ((Float) arrayList8.get(i10)).floatValue()) {
                        s = (short) ((((Float) arrayList8.get(i10)).floatValue() - f13) * s);
                    } else if (f13 > ((Float) arrayList8.get(i10)).floatValue()) {
                        s = 0;
                    }
                    i9 += s;
                }
                if (f5 <= f14) {
                    f8 = f14;
                } else {
                    f8 = (i9 / f5) * f4 * 0.6f;
                }
                if (L < f2 || L > f11) {
                    f8 *= f14;
                    if (f8 <= f14) {
                        f9 = f14;
                        max++;
                        f10 = f;
                        f11 = f3;
                        f12 = f9;
                    }
                }
                f9 = f14;
                float max2 = Math.max(f8, gm.R1(gm.N(0.66f), gm.N(1.5f), f9));
                RectF rectF = gm.P;
                rectF.set(L, gm.R1(f6 - max2, f6 - ((f4 + max2) / 2.0f), f9), gm.N(1.66f) + L, gm.R1(f6, td4.y(f4, max2, 2.0f, f6), f9));
                addRoundRect(rectF, this.b, Path.Direction.CW);
                max++;
                f10 = f;
                f11 = f3;
                f12 = f9;
            }
            return;
        }
        rewind();
    }

    public final void b(float f, float f2, float f3, float f4, long j, float f5, float f6, float f7, eqb eqbVar) {
        float f8;
        float f9;
        ArrayList arrayList;
        float f10;
        float f11 = f;
        float f12 = f2;
        float f13 = f3;
        if (eqbVar == null) {
            rewind();
            return;
        }
        int i = eqbVar.b;
        ln lnVar = eqbVar.a;
        float e = lnVar.e(false, eqbVar.c);
        if (0 == j && Math.abs(this.e - f5) <= 1.0f && Math.abs(this.f - f6) <= 0.01f && Math.abs(this.g - f4) <= 0.1f && Math.abs(this.h - f7) <= 1.0f && Math.abs(this.i - f11) <= 1.0f && Math.abs(this.j - f12) <= 1.0f && Math.abs(this.k - f13) <= 1.0f && (arrayList = this.c) != null && arrayList.size() == 1) {
            ArrayList arrayList2 = this.d;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                f10 = ((Float) this.d.get(0)).floatValue();
            } else {
                f10 = 0.0f;
            }
            if (Math.abs(f10 - e) <= 0.01f) {
                return;
            }
        }
        ArrayList arrayList3 = this.c;
        if (arrayList3 == null) {
            this.c = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.c.add(Integer.valueOf(i));
        ArrayList arrayList4 = this.d;
        if (arrayList4 == null) {
            this.d = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.d.add(Float.valueOf(e));
        this.i = f11;
        this.j = f12;
        this.k = f13;
        this.g = f4;
        this.f = f6;
        this.e = f5;
        this.h = f7;
        float e2 = lnVar.e(false, eqbVar.c);
        rewind();
        float round = Math.round(gm.N(3.3333f));
        int max = Math.max(0, (int) (((f12 - this.a) - f11) / round));
        int min = Math.min(i - 1, (int) Math.ceil(((f8 + f13) - f11) / round));
        while (max <= min) {
            float f14 = max;
            float L = (f14 * round) + f11 + gm.L(2.0f);
            short s = eqbVar.d[max];
            if (f6 <= 0.0f) {
                f9 = 0.0f;
            } else {
                f9 = (s / f6) * f5 * 0.6f;
            }
            if (f14 < e2 && max + 1 > e2) {
                f9 *= e2 - f14;
            } else if (f14 > e2) {
                f9 = 0.0f;
            }
            if (L < f12 || L > f13) {
                f9 *= f4;
                if (f9 <= 0.0f) {
                    max++;
                    f11 = f;
                    f12 = f2;
                    f13 = f3;
                }
            }
            float max2 = Math.max(f9, gm.R1(gm.N(0.66f), gm.N(1.5f), f4));
            RectF rectF = gm.P;
            rectF.set(L, gm.R1(f7 - max2, f7 - ((f5 + max2) / 2.0f), f4), gm.N(1.66f) + L, gm.R1(f7, td4.y(f5, max2, 2.0f, f7), f4));
            addRoundRect(rectF, this.b, Path.Direction.CW);
            max++;
            f11 = f;
            f12 = f2;
            f13 = f3;
        }
    }
}
