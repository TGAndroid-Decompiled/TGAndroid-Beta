package defpackage;

import android.graphics.Color;
import android.util.SparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ynb {
    public int a;
    public znb b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public long k;
    public long l;
    public long m;
    public float p;
    public boolean q;
    public TLRPC.TL_theme r;
    public TLRPC.TL_wallPaper s;
    public int t;
    public String u;
    public String v;
    public TLRPC.InputFile w;
    public TLRPC.InputFile x;
    public unb y;
    public boolean z;
    public int n = 45;
    public String o = "";
    public final float[] A = new float[3];

    public static int a(SparseIntArray sparseIntArray, int... iArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            if (sparseIntArray.indexOfKey(iArr[i5]) >= 0) {
                try {
                    int i6 = sparseIntArray.get(iArr[i5]);
                    i2 += Color.red(i6);
                    i3 += Color.green(i6);
                    i4 += Color.blue(i6);
                    i++;
                } catch (Exception unused) {
                }
            }
        }
        if (i == 0) {
            return 0;
        }
        return Color.argb(255, i2 / i, i3 / i, i4 / i);
    }

    public static int c(SparseIntArray sparseIntArray, int i) {
        int i2;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey < 0 && (i2 = aob.im.get(i, -1)) >= 0) {
            indexOfKey = sparseIntArray.indexOfKey(i2);
        }
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return aob.hm[i];
    }

    public static void g(SparseIntArray sparseIntArray) {
        for (int i = aob.qb; i < aob.xb; i++) {
            sparseIntArray.delete(i);
            sparseIntArray.put(i, aob.hm[i]);
        }
        for (int i2 = aob.yb; i2 < aob.Kc; i2++) {
            sparseIntArray.delete(i2);
            sparseIntArray.put(i2, aob.hm[i2]);
        }
        for (int i3 = aob.Lc; i3 < aob.Tc; i3++) {
            sparseIntArray.delete(i3);
            sparseIntArray.put(i3, aob.hm[i3]);
        }
    }

    public final int b(int i, int i2) {
        float[] fArr = this.A;
        Color.colorToHSV(i2, fArr);
        float f = fArr[0];
        Color.colorToHSV(i, fArr);
        float f2 = fArr[1];
        if (f2 <= 0.0f) {
            fArr[0] = f;
        }
        fArr[1] = xnb.f(f2, 0.6f, 1.0f, 0.0f);
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.05f));
        return Color.HSVToColor(30, fArr);
    }

    public final boolean d(android.util.SparseIntArray r21, android.util.SparseIntArray r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynb.d(android.util.SparseIntArray, android.util.SparseIntArray):boolean");
    }

    public final int e(int i, int i2, boolean z) {
        int f = vm2.f(0.25f, i, i2);
        float[] fArr = this.A;
        Color.colorToHSV(f, fArr);
        float f2 = 0.1f;
        fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
        float f3 = fArr[2];
        if (!z) {
            f2 = 0.0f;
        }
        fArr[2] = xnb.f(f3, f2, 1.0f, 0.0f);
        return Color.HSVToColor(51, fArr);
    }

    public final int f(int i, float f, boolean z) {
        if (z) {
            return 520093695;
        }
        float[] fArr = this.A;
        Color.colorToHSV(i, fArr);
        if (fArr[1] > 0.0f) {
            float f2 = fArr[2];
            if (f2 < 1.0f && f2 > 0.0f) {
                fArr[0] = ete.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = ete.a(fArr[1] - 0.35f, 0.0f, 1.0f);
                fArr[2] = ete.a(fArr[2] - 0.65f, 0.0f, 1.0f);
                return Color.HSVToColor(90, fArr);
            }
        }
        fArr[0] = f;
        fArr[1] = 0.2f;
        fArr[2] = ete.a(fArr[2] - 0.65f, 0.0f, 1.0f);
        return Color.HSVToColor(90, fArr);
    }

    public final int h(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynb.h(int, int):int");
    }
}
