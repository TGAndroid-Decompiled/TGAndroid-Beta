package lh;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class bc extends Path {

    public final int f15706a = AndroidUtilities.dp(10.0f);

    public final float[] f15707b;

    public ArrayList f15708c;
    public ArrayList d;

    public float f15709e;

    public float f15710f;

    public float f15711g;
    public float h;

    public float f15712i;

    public float f15713j;

    public float f15714k;

    public bc() {
        this.f15707b = new float[]{fDp, fDp, fDp, fDp, 0.0f, 0.0f, 0.0f, 0.0f};
        float fDp = AndroidUtilities.dp(2.0f);
    }

    public static int c(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) != null) {
                i10 += ((vb) arrayList.get(i11)).f16958e;
            }
        }
        return i10;
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, ArrayList arrayList) {
        ArrayList arrayList2;
        float f16 = f10;
        float f17 = f12;
        if (arrayList == null || arrayList.isEmpty()) {
            rewind();
            return;
        }
        if (Math.abs(this.f15709e - f13) <= 1.0f && Math.abs(this.f15710f - f14) <= 0.01f && Math.abs(this.f15711g - 0.0f) <= 0.1f && Math.abs(this.h - f15) <= 1.0f && Math.abs(this.f15712i - f16) <= 1.0f && Math.abs(this.f15713j - f11) <= 1.0f && Math.abs(this.f15714k - f17) <= 1.0f) {
            ArrayList arrayList3 = this.f15708c;
            if (arrayList3 == null || arrayList3.size() != arrayList.size()) {
                arrayList2 = this.d;
                if (arrayList2 != null || arrayList2.size() != arrayList.size()) {
                    return;
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (((Float) arrayList2.get(i10)).floatValue() != (arrayList.get(i10) == null ? 0.0f : ((vb) arrayList.get(i10)).f16955a.d(((vb) arrayList.get(i10)).f16957c, false))) {
                        return;
                    }
                }
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList3.size()) {
                        if (((Integer) arrayList3.get(i11)).intValue() != (arrayList.get(i11) == null ? 0 : ((vb) arrayList.get(i11)).f16956b)) {
                            arrayList2 = this.d;
                            if (arrayList2 != null) {
                                return;
                            } else {
                                return;
                            }
                        }
                        i11++;
                    }
                }
            }
        }
        ArrayList arrayList4 = this.f15708c;
        if (arrayList4 == null) {
            this.f15708c = new ArrayList();
        } else {
            arrayList4.clear();
        }
        int iF = 0;
        while (iF < arrayList.size()) {
            iF = i0.a.f(arrayList.get(iF) == null ? 0 : ((vb) arrayList.get(iF)).f16956b, iF, 1, this.f15708c);
        }
        ArrayList arrayList5 = this.d;
        if (arrayList5 == null) {
            this.d = new ArrayList();
        } else {
            arrayList5.clear();
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.d.add(Float.valueOf(arrayList.get(i12) == null ? 0.0f : ((vb) arrayList.get(i12)).f16955a.d(((vb) arrayList.get(i12)).f16957c, false)));
        }
        this.f15712i = f16;
        this.f15713j = f11;
        this.f15714k = f17;
        this.f15711g = 0.0f;
        this.f15710f = f14;
        this.f15709e = f13;
        this.h = f15;
        ArrayList arrayList6 = this.d;
        rewind();
        float fRound = Math.round(AndroidUtilities.dpf2(3.3333f));
        int iMax = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (arrayList.get(i13) != null) {
                iMax = Math.max(iMax, ((vb) arrayList.get(i13)).f16956b);
            }
        }
        float f18 = this.f15706a;
        int iMax2 = Math.max(0, (int) (((f11 - f18) - f16) / fRound));
        int iMin = Math.min(iMax - 1, (int) Math.ceil(((f17 + f18) - f16) / fRound));
        while (iMax2 <= iMin) {
            float f19 = iMax2;
            float fDp = (f19 * fRound) + f16 + AndroidUtilities.dp(2.0f);
            int i14 = 0;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                short sFloatValue = (arrayList.get(i15) == null || iMax2 >= ((vb) arrayList.get(i15)).f16956b) ? (short) 0 : ((vb) arrayList.get(i15)).d[iMax2];
                if (f19 < ((Float) arrayList6.get(i15)).floatValue() && iMax2 + 1 > ((Float) arrayList6.get(i15)).floatValue()) {
                    sFloatValue = (short) ((((Float) arrayList6.get(i15)).floatValue() - f19) * sFloatValue);
                } else if (f19 > ((Float) arrayList6.get(i15)).floatValue()) {
                    sFloatValue = 0;
                }
                i14 += sFloatValue;
            }
            float f20 = f14 <= 0.0f ? 0.0f : (i14 / f14) * f13 * 0.6f;
            if (fDp < f11 || fDp > f17) {
                f20 *= 0.0f;
                if (f20 > 0.0f) {
                    float fMax = Math.max(f20, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), 0.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(fDp, AndroidUtilities.lerp(f15 - fMax, f15 - ((f13 + fMax) / 2.0f), 0.0f), AndroidUtilities.dpf2(1.66f) + fDp, AndroidUtilities.lerp(f15, org.telegram.messenger.y1.a(f13, fMax, 2.0f, f15), 0.0f));
                    addRoundRect(rectF, this.f15707b, Path.Direction.CW);
                }
            } else {
                float fMax2 = Math.max(f20, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), 0.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(fDp, AndroidUtilities.lerp(f15 - fMax2, f15 - ((f13 + fMax2) / 2.0f), 0.0f), AndroidUtilities.dpf2(1.66f) + fDp, AndroidUtilities.lerp(f15, org.telegram.messenger.y1.a(f13, fMax2, 2.0f, f15), 0.0f));
                addRoundRect(rectF2, this.f15707b, Path.Direction.CW);
            }
            iMax2++;
            f16 = f10;
            f17 = f12;
        }
    }

    public final void b(float f10, float f11, float f12, float f13, long j10, float f14, float f15, float f16, vb vbVar) {
        ArrayList arrayList;
        float f17 = f10;
        float f18 = f11;
        float f19 = f12;
        if (vbVar == null) {
            rewind();
            return;
        }
        int i10 = vbVar.f16956b;
        org.telegram.ui.Components.y5 y5Var = vbVar.f16955a;
        float fD = y5Var.d(vbVar.f16957c, false);
        if (0 == j10 && Math.abs(this.f15709e - f14) <= 1.0f && Math.abs(this.f15710f - f15) <= 0.01f && Math.abs(this.f15711g - f13) <= 0.1f && Math.abs(this.h - f16) <= 1.0f && Math.abs(this.f15712i - f17) <= 1.0f && Math.abs(this.f15713j - f18) <= 1.0f && Math.abs(this.f15714k - f19) <= 1.0f && (arrayList = this.f15708c) != null && arrayList.size() == 1) {
            ArrayList arrayList2 = this.d;
            if (Math.abs(((arrayList2 == null || arrayList2.isEmpty()) ? 0.0f : ((Float) this.d.get(0)).floatValue()) - fD) <= 0.01f) {
                return;
            }
        }
        ArrayList arrayList3 = this.f15708c;
        if (arrayList3 == null) {
            this.f15708c = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f15708c.add(Integer.valueOf(i10));
        ArrayList arrayList4 = this.d;
        if (arrayList4 == null) {
            this.d = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.d.add(Float.valueOf(fD));
        this.f15712i = f17;
        this.f15713j = f18;
        this.f15714k = f19;
        this.f15711g = f13;
        this.f15710f = f15;
        this.f15709e = f14;
        this.h = f16;
        float fD2 = y5Var.d(vbVar.f16957c, false);
        rewind();
        float fRound = Math.round(AndroidUtilities.dpf2(3.3333f));
        float f20 = this.f15706a;
        int iMax = Math.max(0, (int) (((f18 - f20) - f17) / fRound));
        int iMin = Math.min(i10 - 1, (int) Math.ceil(((f20 + f19) - f17) / fRound));
        while (iMax <= iMin) {
            float f21 = iMax;
            float fDp = (f21 * fRound) + f17 + AndroidUtilities.dp(2.0f);
            float f22 = f15 <= 0.0f ? 0.0f : (vbVar.d[iMax] / f15) * f14 * 0.6f;
            if (f21 < fD2 && iMax + 1 > fD2) {
                f22 *= fD2 - f21;
            } else if (f21 > fD2) {
                f22 = 0.0f;
            }
            if (fDp < f18 || fDp > f19) {
                f22 *= f13;
                if (f22 > 0.0f) {
                    float fMax = Math.max(f22, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f13));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(fDp, AndroidUtilities.lerp(f16 - fMax, f16 - ((f14 + fMax) / 2.0f), f13), AndroidUtilities.dpf2(1.66f) + fDp, AndroidUtilities.lerp(f16, org.telegram.messenger.y1.a(f14, fMax, 2.0f, f16), f13));
                    addRoundRect(rectF, this.f15707b, Path.Direction.CW);
                }
            } else {
                float fMax2 = Math.max(f22, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f13));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(fDp, AndroidUtilities.lerp(f16 - fMax2, f16 - ((f14 + fMax2) / 2.0f), f13), AndroidUtilities.dpf2(1.66f) + fDp, AndroidUtilities.lerp(f16, org.telegram.messenger.y1.a(f14, fMax2, 2.0f, f16), f13));
                addRoundRect(rectF2, this.f15707b, Path.Direction.CW);
            }
            iMax++;
            f17 = f10;
            f18 = f11;
            f19 = f12;
        }
    }
}
