package defpackage;

import android.graphics.Color;
import android.util.SparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class amb {
    public int a;
    public bmb b;
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
    public xlb y;
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
        if (indexOfKey < 0 && (i2 = cmb.hm.get(i, -1)) >= 0) {
            indexOfKey = sparseIntArray.indexOfKey(i2);
        }
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return cmb.gm[i];
    }

    public static void g(SparseIntArray sparseIntArray) {
        for (int i = cmb.pb; i < cmb.wb; i++) {
            sparseIntArray.delete(i);
            sparseIntArray.put(i, cmb.gm[i]);
        }
        for (int i2 = cmb.xb; i2 < cmb.Jc; i2++) {
            sparseIntArray.delete(i2);
            sparseIntArray.put(i2, cmb.gm[i2]);
        }
        for (int i3 = cmb.Kc; i3 < cmb.Sc; i3++) {
            sparseIntArray.delete(i3);
            sparseIntArray.put(i3, cmb.gm[i3]);
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
        fArr[1] = mlb.f(f2, 0.6f, 1.0f, 0.0f);
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.05f));
        return Color.HSVToColor(30, fArr);
    }

    public final boolean d(android.util.SparseIntArray r21, android.util.SparseIntArray r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amb.d(android.util.SparseIntArray, android.util.SparseIntArray):boolean");
    }

    public final int e(int i, int i2, boolean z) {
        int f = on2.f(0.25f, i, i2);
        float[] fArr = this.A;
        Color.colorToHSV(f, fArr);
        float f2 = 0.1f;
        fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
        float f3 = fArr[2];
        if (!z) {
            f2 = 0.0f;
        }
        fArr[2] = mlb.f(f3, f2, 1.0f, 0.0f);
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
                fArr[0] = pqe.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = pqe.a(fArr[1] - 0.35f, 0.0f, 1.0f);
                fArr[2] = pqe.a(fArr[2] - 0.65f, 0.0f, 1.0f);
                return Color.HSVToColor(90, fArr);
            }
        }
        fArr[0] = f;
        fArr[1] = 0.2f;
        fArr[2] = pqe.a(fArr[2] - 0.65f, 0.0f, 1.0f);
        return Color.HSVToColor(90, fArr);
    }

    public final int h(int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amb.h(int, int):int");
    }
}
