package fi;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class eb extends Path {
    public final int f11941a = org.telegram.messenger.g0.L(10.0f);
    public final float[] f11942b;
    public ArrayList f11943c;
    public ArrayList d;
    public float f11944e;
    public float f11945f;
    public float f11946g;
    public float h;
    public float f11947i;
    public float f11948j;
    public float f11949k;

    public eb() {
        this.f11942b = r0;
        float L = org.telegram.messenger.g0.L(2.0f);
        float[] fArr = {L, L, L, L, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public static int c(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null) {
                i7 += ((ya) arrayList.get(i10)).f13224e;
            }
        }
        return i7;
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, ArrayList arrayList) {
        float f16;
        float f17;
        float f18;
        short s5;
        float e10;
        int i7;
        float e11;
        int i10;
        float f19 = f10;
        float f20 = f12;
        if (arrayList != null && !arrayList.isEmpty()) {
            float f21 = 0.0f;
            if (Math.abs(this.f11944e - f13) <= 1.0f && Math.abs(this.f11945f - f14) <= 0.01f && Math.abs(this.f11946g - 0.0f) <= 0.1f && Math.abs(this.h - f15) <= 1.0f && Math.abs(this.f11947i - f19) <= 1.0f && Math.abs(this.f11948j - f11) <= 1.0f && Math.abs(this.f11949k - f20) <= 1.0f) {
                ArrayList arrayList2 = this.f11943c;
                if (arrayList2 != null && arrayList2.size() == arrayList.size()) {
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        int intValue = ((Integer) arrayList2.get(i11)).intValue();
                        if (arrayList.get(i11) == null) {
                            i10 = 0;
                        } else {
                            i10 = ((ya) arrayList.get(i11)).f13222b;
                        }
                        if (intValue == i10) {
                        }
                    }
                }
                ArrayList arrayList3 = this.d;
                if (arrayList3 != null && arrayList3.size() == arrayList.size()) {
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        float floatValue = ((Float) arrayList3.get(i12)).floatValue();
                        if (arrayList.get(i12) == null) {
                            e11 = 0.0f;
                        } else {
                            e11 = ((ya) arrayList.get(i12)).f13221a.e(false, ((ya) arrayList.get(i12)).f13223c);
                        }
                        if (floatValue != e11) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            ArrayList arrayList4 = this.f11943c;
            if (arrayList4 == null) {
                this.f11943c = new ArrayList();
            } else {
                arrayList4.clear();
            }
            int i13 = 0;
            while (i13 < arrayList.size()) {
                ArrayList arrayList5 = this.f11943c;
                if (arrayList.get(i13) == null) {
                    i7 = 0;
                } else {
                    i7 = ((ya) arrayList.get(i13)).f13222b;
                }
                i13 = com.google.android.recaptcha.internal.a.f(i7, i13, 1, arrayList5);
            }
            ArrayList arrayList6 = this.d;
            if (arrayList6 == null) {
                this.d = new ArrayList();
            } else {
                arrayList6.clear();
            }
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ArrayList arrayList7 = this.d;
                if (arrayList.get(i14) == null) {
                    e10 = 0.0f;
                } else {
                    e10 = ((ya) arrayList.get(i14)).f13221a.e(false, ((ya) arrayList.get(i14)).f13223c);
                }
                arrayList7.add(Float.valueOf(e10));
            }
            this.f11947i = f19;
            this.f11948j = f11;
            this.f11949k = f20;
            this.f11946g = 0.0f;
            this.f11945f = f14;
            this.f11944e = f13;
            this.h = f15;
            ArrayList arrayList8 = this.d;
            rewind();
            float round = Math.round(org.telegram.messenger.g0.N(3.3333f));
            int i15 = 0;
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                if (arrayList.get(i16) != null) {
                    i15 = Math.max(i15, ((ya) arrayList.get(i16)).f13222b);
                }
            }
            int max = Math.max(0, (int) (((f11 - this.f11941a) - f19) / round));
            int min = Math.min(i15 - 1, (int) Math.ceil(((f20 + f16) - f19) / round));
            while (max <= min) {
                float f22 = max;
                float L = (f22 * round) + f19 + org.telegram.messenger.g0.L(2.0f);
                float f23 = f21;
                int i17 = 0;
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    if (arrayList.get(i18) != null && max < ((ya) arrayList.get(i18)).f13222b) {
                        s5 = ((ya) arrayList.get(i18)).d[max];
                    } else {
                        s5 = 0;
                    }
                    if (f22 < ((Float) arrayList8.get(i18)).floatValue() && max + 1 > ((Float) arrayList8.get(i18)).floatValue()) {
                        s5 = (short) ((((Float) arrayList8.get(i18)).floatValue() - f22) * s5);
                    } else if (f22 > ((Float) arrayList8.get(i18)).floatValue()) {
                        s5 = 0;
                    }
                    i17 += s5;
                }
                if (f14 <= f23) {
                    f17 = f23;
                } else {
                    f17 = (i17 / f14) * f13 * 0.6f;
                }
                if (L < f11 || L > f20) {
                    f17 *= f23;
                    if (f17 <= f23) {
                        f18 = f23;
                        max++;
                        f19 = f10;
                        f20 = f12;
                        f21 = f18;
                    }
                }
                f18 = f23;
                float max2 = Math.max(f17, org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(0.66f), org.telegram.messenger.g0.N(1.5f), f18));
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(L, org.telegram.messenger.g0.T1(f15 - max2, f15 - ((f13 + max2) / 2.0f), f18), org.telegram.messenger.g0.N(1.66f) + L, org.telegram.messenger.g0.T1(f15, org.telegram.messenger.k5.y(f13, max2, 2.0f, f15), f18));
                addRoundRect(rectF, this.f11942b, Path.Direction.CW);
                max++;
                f19 = f10;
                f20 = f12;
                f21 = f18;
            }
            return;
        }
        rewind();
    }

    public final void b(float f10, float f11, float f12, float f13, long j3, float f14, float f15, float f16, ya yaVar) {
        float f17;
        float f18;
        ArrayList arrayList;
        float f19;
        float f20 = f10;
        float f21 = f11;
        float f22 = f12;
        if (yaVar == null) {
            rewind();
            return;
        }
        int i7 = yaVar.f13222b;
        org.telegram.ui.Components.v5 v5Var = yaVar.f13221a;
        float e10 = v5Var.e(false, yaVar.f13223c);
        if (0 == j3 && Math.abs(this.f11944e - f14) <= 1.0f && Math.abs(this.f11945f - f15) <= 0.01f && Math.abs(this.f11946g - f13) <= 0.1f && Math.abs(this.h - f16) <= 1.0f && Math.abs(this.f11947i - f20) <= 1.0f && Math.abs(this.f11948j - f21) <= 1.0f && Math.abs(this.f11949k - f22) <= 1.0f && (arrayList = this.f11943c) != null && arrayList.size() == 1) {
            ArrayList arrayList2 = this.d;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                f19 = ((Float) this.d.get(0)).floatValue();
            } else {
                f19 = 0.0f;
            }
            if (Math.abs(f19 - e10) <= 0.01f) {
                return;
            }
        }
        ArrayList arrayList3 = this.f11943c;
        if (arrayList3 == null) {
            this.f11943c = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f11943c.add(Integer.valueOf(i7));
        ArrayList arrayList4 = this.d;
        if (arrayList4 == null) {
            this.d = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.d.add(Float.valueOf(e10));
        this.f11947i = f20;
        this.f11948j = f21;
        this.f11949k = f22;
        this.f11946g = f13;
        this.f11945f = f15;
        this.f11944e = f14;
        this.h = f16;
        float e11 = v5Var.e(false, yaVar.f13223c);
        rewind();
        float round = Math.round(org.telegram.messenger.g0.N(3.3333f));
        int max = Math.max(0, (int) (((f21 - this.f11941a) - f20) / round));
        int min = Math.min(i7 - 1, (int) Math.ceil(((f17 + f22) - f20) / round));
        while (max <= min) {
            float f23 = max;
            float L = (f23 * round) + f20 + org.telegram.messenger.g0.L(2.0f);
            short s5 = yaVar.d[max];
            if (f15 <= 0.0f) {
                f18 = 0.0f;
            } else {
                f18 = (s5 / f15) * f14 * 0.6f;
            }
            if (f23 < e11 && max + 1 > e11) {
                f18 *= e11 - f23;
            } else if (f23 > e11) {
                f18 = 0.0f;
            }
            if (L < f21 || L > f22) {
                f18 *= f13;
                if (f18 <= 0.0f) {
                    max++;
                    f20 = f10;
                    f21 = f11;
                    f22 = f12;
                }
            }
            float max2 = Math.max(f18, org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(0.66f), org.telegram.messenger.g0.N(1.5f), f13));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(L, org.telegram.messenger.g0.T1(f16 - max2, f16 - ((f14 + max2) / 2.0f), f13), org.telegram.messenger.g0.N(1.66f) + L, org.telegram.messenger.g0.T1(f16, org.telegram.messenger.k5.y(f14, max2, 2.0f, f16), f13));
            addRoundRect(rectF, this.f11942b, Path.Direction.CW);
            max++;
            f20 = f10;
            f21 = f11;
            f22 = f12;
        }
    }
}
