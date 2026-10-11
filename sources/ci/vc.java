package ci;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class vc extends Path {
    public final int f6168a = AndroidUtilities.dp(10.0f);
    public final float[] f6169b;
    public ArrayList f6170c;
    public ArrayList d;
    public float f6171e;
    public float f6172f;
    public float f6173g;
    public float h;
    public float f6174i;
    public float f6175j;
    public float f6176k;

    public vc() {
        this.f6169b = r0;
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
                i10 += ((oc) arrayList.get(i11)).f5705e;
            }
        }
        return i10;
    }

    public final void a(float f7, float f10, float f11, float f12, float f13, float f14, ArrayList arrayList) {
        float f15;
        float f16;
        float f17;
        short s10;
        float d;
        int i10;
        float d10;
        int i11;
        float f18 = f7;
        float f19 = f11;
        if (arrayList != null && !arrayList.isEmpty()) {
            float f20 = 0.0f;
            if (Math.abs(this.f6171e - f12) <= 1.0f && Math.abs(this.f6172f - f13) <= 0.01f && Math.abs(this.f6173g - 0.0f) <= 0.1f && Math.abs(this.h - f14) <= 1.0f && Math.abs(this.f6174i - f18) <= 1.0f && Math.abs(this.f6175j - f10) <= 1.0f && Math.abs(this.f6176k - f19) <= 1.0f) {
                ArrayList arrayList2 = this.f6170c;
                if (arrayList2 != null && arrayList2.size() == arrayList.size()) {
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        if (arrayList.get(i12) == null) {
                            i11 = 0;
                        } else {
                            i11 = ((oc) arrayList.get(i12)).f5703b;
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
                            d10 = ((oc) arrayList.get(i13)).f5702a.d(((oc) arrayList.get(i13)).f5704c, false);
                        }
                        if (floatValue != d10) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            ArrayList arrayList4 = this.f6170c;
            if (arrayList4 == null) {
                this.f6170c = new ArrayList();
            } else {
                arrayList4.clear();
            }
            int i14 = 0;
            while (i14 < arrayList.size()) {
                ArrayList arrayList5 = this.f6170c;
                if (arrayList.get(i14) == null) {
                    i10 = 0;
                } else {
                    i10 = ((oc) arrayList.get(i14)).f5703b;
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
                    d = ((oc) arrayList.get(i15)).f5702a.d(((oc) arrayList.get(i15)).f5704c, false);
                }
                arrayList7.add(Float.valueOf(d));
            }
            this.f6174i = f18;
            this.f6175j = f10;
            this.f6176k = f19;
            this.f6173g = 0.0f;
            this.f6172f = f13;
            this.f6171e = f12;
            this.h = f14;
            ArrayList arrayList8 = this.d;
            rewind();
            float round = Math.round(AndroidUtilities.dpf2(3.3333f));
            int i16 = 0;
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                if (arrayList.get(i17) != null) {
                    i16 = Math.max(i16, ((oc) arrayList.get(i17)).f5703b);
                }
            }
            int max = Math.max(0, (int) (((f10 - this.f6168a) - f18) / round));
            int min = Math.min(i16 - 1, (int) Math.ceil(((f19 + f15) - f18) / round));
            while (max <= min) {
                float f21 = max;
                float dp = (f21 * round) + f18 + AndroidUtilities.dp(2.0f);
                float f22 = f20;
                int i18 = 0;
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    if (arrayList.get(i19) != null && max < ((oc) arrayList.get(i19)).f5703b) {
                        s10 = ((oc) arrayList.get(i19)).d[max];
                    } else {
                        s10 = 0;
                    }
                    if (f21 < ((Float) arrayList8.get(i19)).floatValue() && max + 1 > ((Float) arrayList8.get(i19)).floatValue()) {
                        s10 = (short) ((((Float) arrayList8.get(i19)).floatValue() - f21) * s10);
                    } else if (f21 > ((Float) arrayList8.get(i19)).floatValue()) {
                        s10 = 0;
                    }
                    i18 += s10;
                }
                if (f13 <= f22) {
                    f16 = f22;
                } else {
                    f16 = (i18 / f13) * f12 * 0.6f;
                }
                if (dp < f10 || dp > f19) {
                    f16 *= f22;
                    if (f16 <= f22) {
                        f17 = f22;
                        max++;
                        f18 = f7;
                        f19 = f11;
                        f20 = f17;
                    }
                }
                f17 = f22;
                float max2 = Math.max(f16, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f17));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(dp, AndroidUtilities.lerp(f14 - max2, f14 - ((f12 + max2) / 2.0f), f17), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f14, org.telegram.messenger.q.x(f12, max2, 2.0f, f14), f17));
                addRoundRect(rectF, this.f6169b, Path.Direction.CW);
                max++;
                f18 = f7;
                f19 = f11;
                f20 = f17;
            }
            return;
        }
        rewind();
    }

    public final void b(float f7, float f10, float f11, float f12, long j3, float f13, float f14, float f15, oc ocVar) {
        float f16;
        float f17;
        ArrayList arrayList;
        float f18;
        float f19 = f7;
        float f20 = f10;
        float f21 = f11;
        if (ocVar == null) {
            rewind();
            return;
        }
        int i10 = ocVar.f5703b;
        org.telegram.ui.Components.g6 g6Var = ocVar.f5702a;
        float d = g6Var.d(ocVar.f5704c, false);
        if (0 == j3 && Math.abs(this.f6171e - f13) <= 1.0f && Math.abs(this.f6172f - f14) <= 0.01f && Math.abs(this.f6173g - f12) <= 0.1f && Math.abs(this.h - f15) <= 1.0f && Math.abs(this.f6174i - f19) <= 1.0f && Math.abs(this.f6175j - f20) <= 1.0f && Math.abs(this.f6176k - f21) <= 1.0f && (arrayList = this.f6170c) != null && arrayList.size() == 1) {
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
        ArrayList arrayList3 = this.f6170c;
        if (arrayList3 == null) {
            this.f6170c = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f6170c.add(Integer.valueOf(i10));
        ArrayList arrayList4 = this.d;
        if (arrayList4 == null) {
            this.d = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.d.add(Float.valueOf(d));
        this.f6174i = f19;
        this.f6175j = f20;
        this.f6176k = f21;
        this.f6173g = f12;
        this.f6172f = f14;
        this.f6171e = f13;
        this.h = f15;
        float d10 = g6Var.d(ocVar.f5704c, false);
        rewind();
        float round = Math.round(AndroidUtilities.dpf2(3.3333f));
        int max = Math.max(0, (int) (((f20 - this.f6168a) - f19) / round));
        int min = Math.min(i10 - 1, (int) Math.ceil(((f16 + f21) - f19) / round));
        while (max <= min) {
            float f22 = max;
            float dp = (f22 * round) + f19 + AndroidUtilities.dp(2.0f);
            short s10 = ocVar.d[max];
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
            rectF.set(dp, AndroidUtilities.lerp(f15 - max2, f15 - ((f13 + max2) / 2.0f), f12), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f15, org.telegram.messenger.q.x(f13, max2, 2.0f, f15), f12));
            addRoundRect(rectF, this.f6169b, Path.Direction.CW);
            max++;
            f19 = f7;
            f20 = f10;
            f21 = f11;
        }
    }
}
