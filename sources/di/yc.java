package di;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class yc extends Path {
    public final int f8494a = AndroidUtilities.dp(10.0f);
    public final float[] f8495b;
    public ArrayList f8496c;
    public ArrayList d;
    public float f8497e;
    public float f8498f;
    public float f8499g;
    public float h;
    public float f8500i;
    public float f8501j;
    public float f8502k;

    public yc() {
        this.f8495b = r0;
        float dp = AndroidUtilities.dp(2.0f);
        float[] fArr = {dp, dp, dp, dp, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public static int c(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) != null) {
                i10 += ((sc) arrayList.get(i11)).f8140e;
            }
        }
        return i10;
    }

    public final void a(float f7, float f10, float f11, float f12, float f13, float f14, ArrayList arrayList) {
        float f15;
        float f16;
        short s10;
        float d;
        int i10;
        float d10;
        int i11;
        float f17 = f7;
        float f18 = f11;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (Math.abs(this.f8497e - f12) <= 1.0f && Math.abs(this.f8498f - f13) <= 0.01f && Math.abs(this.f8499g - 0.0f) <= 0.1f && Math.abs(this.h - f14) <= 1.0f && Math.abs(this.f8500i - f17) <= 1.0f && Math.abs(this.f8501j - f10) <= 1.0f && Math.abs(this.f8502k - f18) <= 1.0f) {
                ArrayList arrayList2 = this.f8496c;
                if (arrayList2 != null && arrayList2.size() == arrayList.size()) {
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        if (arrayList.get(i12) == null) {
                            i11 = 0;
                        } else {
                            i11 = ((sc) arrayList.get(i12)).f8138b;
                        }
                        if (intValue == i11) {
                        }
                    }
                }
                ArrayList arrayList3 = this.d;
                if (arrayList3 != null && arrayList3.size() == arrayList.size()) {
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        float floatValue = ((Float) arrayList3.get(i13)).floatValue();
                        if (arrayList.get(i13) == null) {
                            d10 = 0.0f;
                        } else {
                            d10 = ((sc) arrayList.get(i13)).f8137a.d(((sc) arrayList.get(i13)).f8139c, false);
                        }
                        if (floatValue != d10) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            ArrayList arrayList4 = this.f8496c;
            if (arrayList4 == null) {
                this.f8496c = new ArrayList();
            } else {
                arrayList4.clear();
            }
            int i14 = 0;
            while (i14 < arrayList.size()) {
                ArrayList arrayList5 = this.f8496c;
                if (arrayList.get(i14) == null) {
                    i10 = 0;
                } else {
                    i10 = ((sc) arrayList.get(i14)).f8138b;
                }
                i14 = com.google.android.gms.internal.vision.e2.e(i10, i14, 1, arrayList5);
            }
            ArrayList arrayList6 = this.d;
            if (arrayList6 == null) {
                this.d = new ArrayList();
            } else {
                arrayList6.clear();
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                ArrayList arrayList7 = this.d;
                if (arrayList.get(i15) == null) {
                    d = 0.0f;
                } else {
                    d = ((sc) arrayList.get(i15)).f8137a.d(((sc) arrayList.get(i15)).f8139c, false);
                }
                arrayList7.add(Float.valueOf(d));
            }
            this.f8500i = f17;
            this.f8501j = f10;
            this.f8502k = f18;
            this.f8499g = 0.0f;
            this.f8498f = f13;
            this.f8497e = f12;
            this.h = f14;
            ArrayList arrayList8 = this.d;
            rewind();
            float round = Math.round(AndroidUtilities.dpf2(3.3333f));
            int i16 = 0;
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                if (arrayList.get(i17) != null) {
                    i16 = Math.max(i16, ((sc) arrayList.get(i17)).f8138b);
                }
            }
            int max = Math.max(0, (int) (((f10 - this.f8494a) - f17) / round));
            int min = Math.min(i16 - 1, (int) Math.ceil(((f18 + f15) - f17) / round));
            while (max <= min) {
                float f19 = max;
                float dp = (f19 * round) + f17 + AndroidUtilities.dp(2.0f);
                int i18 = 0;
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    if (arrayList.get(i19) != null && max < ((sc) arrayList.get(i19)).f8138b) {
                        s10 = ((sc) arrayList.get(i19)).d[max];
                    } else {
                        s10 = 0;
                    }
                    if (f19 < ((Float) arrayList8.get(i19)).floatValue() && max + 1 > ((Float) arrayList8.get(i19)).floatValue()) {
                        s10 = (short) ((((Float) arrayList8.get(i19)).floatValue() - f19) * s10);
                    } else if (f19 > ((Float) arrayList8.get(i19)).floatValue()) {
                        s10 = 0;
                    }
                    i18 += s10;
                }
                if (f13 <= 0.0f) {
                    f16 = 0.0f;
                } else {
                    f16 = (i18 / f13) * f12 * 0.6f;
                }
                if (dp < f10 || dp > f18) {
                    f16 *= 0.0f;
                    if (f16 <= 0.0f) {
                        max++;
                        f17 = f7;
                        f18 = f11;
                    }
                }
                float max2 = Math.max(f16, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), 0.0f));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(dp, AndroidUtilities.lerp(f14 - max2, f14 - ((f12 + max2) / 2.0f), 0.0f), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f14, org.telegram.messenger.w1.y(f12, max2, 2.0f, f14), 0.0f));
                addRoundRect(rectF, this.f8495b, Path.Direction.CW);
                max++;
                f17 = f7;
                f18 = f11;
            }
            return;
        }
        rewind();
    }

    public final void b(float f7, float f10, float f11, float f12, long j3, float f13, float f14, float f15, sc scVar) {
        float f16;
        float f17;
        ArrayList arrayList;
        float f18;
        float f19 = f7;
        float f20 = f10;
        float f21 = f11;
        if (scVar == null) {
            rewind();
            return;
        }
        int i10 = scVar.f8138b;
        org.telegram.ui.Components.e6 e6Var = scVar.f8137a;
        float d = e6Var.d(scVar.f8139c, false);
        if (0 == j3 && Math.abs(this.f8497e - f13) <= 1.0f && Math.abs(this.f8498f - f14) <= 0.01f && Math.abs(this.f8499g - f12) <= 0.1f && Math.abs(this.h - f15) <= 1.0f && Math.abs(this.f8500i - f19) <= 1.0f && Math.abs(this.f8501j - f20) <= 1.0f && Math.abs(this.f8502k - f21) <= 1.0f && (arrayList = this.f8496c) != null && arrayList.size() == 1) {
            ArrayList arrayList2 = this.d;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                f18 = ((Float) this.d.get(0)).floatValue();
            } else {
                f18 = 0.0f;
            }
            if (Math.abs(f18 - d) <= 0.01f) {
                return;
            }
        }
        ArrayList arrayList3 = this.f8496c;
        if (arrayList3 == null) {
            this.f8496c = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f8496c.add(Integer.valueOf(i10));
        ArrayList arrayList4 = this.d;
        if (arrayList4 == null) {
            this.d = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.d.add(Float.valueOf(d));
        this.f8500i = f19;
        this.f8501j = f20;
        this.f8502k = f21;
        this.f8499g = f12;
        this.f8498f = f14;
        this.f8497e = f13;
        this.h = f15;
        float d10 = e6Var.d(scVar.f8139c, false);
        rewind();
        float round = Math.round(AndroidUtilities.dpf2(3.3333f));
        int max = Math.max(0, (int) (((f20 - this.f8494a) - f19) / round));
        int min = Math.min(i10 - 1, (int) Math.ceil(((f16 + f21) - f19) / round));
        while (max <= min) {
            float f22 = max;
            float dp = (f22 * round) + f19 + AndroidUtilities.dp(2.0f);
            short s10 = scVar.d[max];
            if (f14 <= 0.0f) {
                f17 = 0.0f;
            } else {
                f17 = (s10 / f14) * f13 * 0.6f;
            }
            if (f22 < d10 && max + 1 > d10) {
                f17 *= d10 - f22;
            } else if (f22 > d10) {
                f17 = 0.0f;
            }
            if (dp < f20 || dp > f21) {
                f17 *= f12;
                if (f17 <= 0.0f) {
                    max++;
                    f19 = f7;
                    f20 = f10;
                    f21 = f11;
                }
            }
            float max2 = Math.max(f17, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f12));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(dp, AndroidUtilities.lerp(f15 - max2, f15 - ((f13 + max2) / 2.0f), f12), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f15, org.telegram.messenger.w1.y(f13, max2, 2.0f, f15), f12));
            addRoundRect(rectF, this.f8495b, Path.Direction.CW);
            max++;
            f19 = f7;
            f20 = f10;
            f21 = f11;
        }
    }
}
