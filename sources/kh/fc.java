package kh;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class fc extends Path {
    public final int f15244a = AndroidUtilities.dp(10.0f);
    public final float[] f15245b;
    public ArrayList f15246c;
    public ArrayList d;
    public float f15247e;
    public float f15248f;
    public float f15249g;
    public float h;
    public float f15250i;
    public float f15251j;
    public float f15252k;

    public fc() {
        this.f15245b = r0;
        float dp = AndroidUtilities.dp(2.0f);
        float[] fArr = {dp, dp, dp, dp, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public static int c(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != null) {
                i9 += ((zb) arrayList.get(i10)).f16482e;
            }
        }
        return i9;
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, ArrayList arrayList) {
        float f16;
        float f17;
        short s10;
        float d;
        int i9;
        float d9;
        int i10;
        float f18 = f10;
        float f19 = f12;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (Math.abs(this.f15247e - f13) <= 1.0f && Math.abs(this.f15248f - f14) <= 0.01f && Math.abs(this.f15249g - 0.0f) <= 0.1f && Math.abs(this.h - f15) <= 1.0f && Math.abs(this.f15250i - f18) <= 1.0f && Math.abs(this.f15251j - f11) <= 1.0f && Math.abs(this.f15252k - f19) <= 1.0f) {
                ArrayList arrayList2 = this.f15246c;
                if (arrayList2 != null && arrayList2.size() == arrayList.size()) {
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        int intValue = ((Integer) arrayList2.get(i11)).intValue();
                        if (arrayList.get(i11) == null) {
                            i10 = 0;
                        } else {
                            i10 = ((zb) arrayList.get(i11)).f16480b;
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
                            d9 = 0.0f;
                        } else {
                            d9 = ((zb) arrayList.get(i12)).f16479a.d(((zb) arrayList.get(i12)).f16481c, false);
                        }
                        if (floatValue != d9) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            ArrayList arrayList4 = this.f15246c;
            if (arrayList4 == null) {
                this.f15246c = new ArrayList();
            } else {
                arrayList4.clear();
            }
            int i13 = 0;
            while (i13 < arrayList.size()) {
                ArrayList arrayList5 = this.f15246c;
                if (arrayList.get(i13) == null) {
                    i9 = 0;
                } else {
                    i9 = ((zb) arrayList.get(i13)).f16480b;
                }
                i13 = j3.r0.e(i9, i13, 1, arrayList5);
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
                    d = 0.0f;
                } else {
                    d = ((zb) arrayList.get(i14)).f16479a.d(((zb) arrayList.get(i14)).f16481c, false);
                }
                arrayList7.add(Float.valueOf(d));
            }
            this.f15250i = f18;
            this.f15251j = f11;
            this.f15252k = f19;
            this.f15249g = 0.0f;
            this.f15248f = f14;
            this.f15247e = f13;
            this.h = f15;
            ArrayList arrayList8 = this.d;
            rewind();
            float round = Math.round(AndroidUtilities.dpf2(3.3333f));
            int i15 = 0;
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                if (arrayList.get(i16) != null) {
                    i15 = Math.max(i15, ((zb) arrayList.get(i16)).f16480b);
                }
            }
            int max = Math.max(0, (int) (((f11 - this.f15244a) - f18) / round));
            int min = Math.min(i15 - 1, (int) Math.ceil(((f19 + f16) - f18) / round));
            while (max <= min) {
                float f20 = max;
                float dp = (f20 * round) + f18 + AndroidUtilities.dp(2.0f);
                int i17 = 0;
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    if (arrayList.get(i18) != null && max < ((zb) arrayList.get(i18)).f16480b) {
                        s10 = ((zb) arrayList.get(i18)).d[max];
                    } else {
                        s10 = 0;
                    }
                    if (f20 < ((Float) arrayList8.get(i18)).floatValue() && max + 1 > ((Float) arrayList8.get(i18)).floatValue()) {
                        s10 = (short) ((((Float) arrayList8.get(i18)).floatValue() - f20) * s10);
                    } else if (f20 > ((Float) arrayList8.get(i18)).floatValue()) {
                        s10 = 0;
                    }
                    i17 += s10;
                }
                if (f14 <= 0.0f) {
                    f17 = 0.0f;
                } else {
                    f17 = (i17 / f14) * f13 * 0.6f;
                }
                if (dp < f11 || dp > f19) {
                    f17 *= 0.0f;
                    if (f17 <= 0.0f) {
                        max++;
                        f18 = f10;
                        f19 = f12;
                    }
                }
                float max2 = Math.max(f17, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), 0.0f));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(dp, AndroidUtilities.lerp(f15 - max2, f15 - ((f13 + max2) / 2.0f), 0.0f), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f15, org.telegram.messenger.l0.a(f13, max2, 2.0f, f15), 0.0f));
                addRoundRect(rectF, this.f15245b, Path.Direction.CW);
                max++;
                f18 = f10;
                f19 = f12;
            }
            return;
        }
        rewind();
    }

    public final void b(float f10, float f11, float f12, float f13, long j10, float f14, float f15, float f16, zb zbVar) {
        float f17;
        float f18;
        ArrayList arrayList;
        float f19;
        float f20 = f10;
        float f21 = f11;
        float f22 = f12;
        if (zbVar == null) {
            rewind();
            return;
        }
        int i9 = zbVar.f16480b;
        org.telegram.ui.Components.y5 y5Var = zbVar.f16479a;
        float d = y5Var.d(zbVar.f16481c, false);
        if (0 == j10 && Math.abs(this.f15247e - f14) <= 1.0f && Math.abs(this.f15248f - f15) <= 0.01f && Math.abs(this.f15249g - f13) <= 0.1f && Math.abs(this.h - f16) <= 1.0f && Math.abs(this.f15250i - f20) <= 1.0f && Math.abs(this.f15251j - f21) <= 1.0f && Math.abs(this.f15252k - f22) <= 1.0f && (arrayList = this.f15246c) != null && arrayList.size() == 1) {
            ArrayList arrayList2 = this.d;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                f19 = ((Float) this.d.get(0)).floatValue();
            } else {
                f19 = 0.0f;
            }
            if (Math.abs(f19 - d) <= 0.01f) {
                return;
            }
        }
        ArrayList arrayList3 = this.f15246c;
        if (arrayList3 == null) {
            this.f15246c = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f15246c.add(Integer.valueOf(i9));
        ArrayList arrayList4 = this.d;
        if (arrayList4 == null) {
            this.d = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.d.add(Float.valueOf(d));
        this.f15250i = f20;
        this.f15251j = f21;
        this.f15252k = f22;
        this.f15249g = f13;
        this.f15248f = f15;
        this.f15247e = f14;
        this.h = f16;
        float d9 = y5Var.d(zbVar.f16481c, false);
        rewind();
        float round = Math.round(AndroidUtilities.dpf2(3.3333f));
        int max = Math.max(0, (int) (((f21 - this.f15244a) - f20) / round));
        int min = Math.min(i9 - 1, (int) Math.ceil(((f17 + f22) - f20) / round));
        while (max <= min) {
            float f23 = max;
            float dp = (f23 * round) + f20 + AndroidUtilities.dp(2.0f);
            short s10 = zbVar.d[max];
            if (f15 <= 0.0f) {
                f18 = 0.0f;
            } else {
                f18 = (s10 / f15) * f14 * 0.6f;
            }
            if (f23 < d9 && max + 1 > d9) {
                f18 *= d9 - f23;
            } else if (f23 > d9) {
                f18 = 0.0f;
            }
            if (dp < f21 || dp > f22) {
                f18 *= f13;
                if (f18 <= 0.0f) {
                    max++;
                    f20 = f10;
                    f21 = f11;
                    f22 = f12;
                }
            }
            float max2 = Math.max(f18, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f13));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(dp, AndroidUtilities.lerp(f16 - max2, f16 - ((f14 + max2) / 2.0f), f13), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f16, org.telegram.messenger.l0.a(f14, max2, 2.0f, f16), f13));
            addRoundRect(rectF, this.f15245b, Path.Direction.CW);
            max++;
            f20 = f10;
            f21 = f11;
            f22 = f12;
        }
    }
}
