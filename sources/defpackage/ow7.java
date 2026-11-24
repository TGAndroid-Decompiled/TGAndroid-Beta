package defpackage;

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
public final class ow7 {
    public byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ow7(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = (byte) 16;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        if (!bitmap.isRecycled()) {
            arrayList2.add(xvc.h);
            this.b = bitmap;
            arrayList.add(zhb.d);
            arrayList.add(zhb.e);
            arrayList.add(zhb.f);
            arrayList.add(zhb.g);
            arrayList.add(zhb.h);
            arrayList.add(zhb.i);
            return;
        }
        u36.j("Bitmap is not valid");
        throw null;
    }

    public final xvc a() {
        double d;
        Bitmap createScaledBitmap;
        nw7[] nw7VarArr;
        ArrayList arrayList;
        xvc xvcVar;
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList2 = (ArrayList) this.d;
        Bitmap bitmap = (Bitmap) this.b;
        int height = bitmap.getHeight() * bitmap.getWidth();
        if (height > 12544) {
            d = Math.sqrt(12544.0d / height);
        } else {
            d = -1.0d;
        }
        int i2 = 0;
        if (d <= 0.0d) {
            createScaledBitmap = bitmap;
        } else {
            createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        }
        int width = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        byte b = this.a;
        if (arrayList2.isEmpty()) {
            nw7VarArr = null;
        } else {
            nw7VarArr = (nw7[]) arrayList2.toArray(new nw7[arrayList2.size()]);
        }
        sm2 sm2Var = new sm2(iArr, b, nw7VarArr);
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList3 = (ArrayList) this.c;
        xvc xvcVar2 = new xvc((ArrayList) sm2Var.d, arrayList3);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) xvcVar2.d;
        int size = arrayList3.size();
        int i3 = 0;
        while (i3 < size) {
            zhb zhbVar = (zhb) arrayList3.get(i3);
            float[] fArr = zhbVar.c;
            float[] fArr2 = zhbVar.a;
            int length = fArr.length;
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i4 = i2; i4 < length; i4++) {
                float f6 = fArr[i4];
                if (f6 > 0.0f) {
                    f5 += f6;
                }
            }
            if (f5 != 0.0f) {
                int length2 = fArr.length;
                for (int i5 = i2; i5 < length2; i5++) {
                    float f7 = fArr[i5];
                    if (f7 > 0.0f) {
                        fArr[i5] = f7 / f5;
                    }
                }
            }
            qt qtVar = (qt) xvcVar2.c;
            ArrayList arrayList4 = (ArrayList) xvcVar2.b;
            int size2 = arrayList4.size();
            int i6 = i2;
            float f8 = 0.0f;
            pw7 pw7Var = null;
            while (i6 < size2) {
                pw7 pw7Var2 = (pw7) arrayList4.get(i6);
                float[] b2 = pw7Var2.b();
                float f9 = b2[1];
                float f10 = f4;
                float[] fArr3 = zhbVar.b;
                if (f9 >= fArr2[i6] && f9 <= fArr2[2]) {
                    float f11 = b2[2];
                    if (f11 >= fArr3[i6] && f11 <= fArr3[2] && !sparseBooleanArray.get(pw7Var2.d)) {
                        float[] b3 = pw7Var2.b();
                        arrayList = arrayList3;
                        pw7 pw7Var3 = (pw7) xvcVar2.e;
                        if (pw7Var3 != null) {
                            i = pw7Var3.e;
                        } else {
                            i = 1;
                        }
                        xvcVar = xvcVar2;
                        float[] fArr4 = zhbVar.c;
                        float f12 = fArr4[i6];
                        if (f12 > f10) {
                            f = (1.0f - Math.abs(b3[1] - fArr2[1])) * f12;
                        } else {
                            f = f10;
                        }
                        float f13 = fArr4[1];
                        if (f13 > f10) {
                            f2 = (1.0f - Math.abs(b3[2] - fArr3[1])) * f13;
                        } else {
                            f2 = f10;
                        }
                        float f14 = fArr4[2];
                        if (f14 > f10) {
                            f3 = (pw7Var2.e / i) * f14;
                        } else {
                            f3 = f10;
                        }
                        float f15 = f + f2 + f3;
                        if (pw7Var == null || f15 > f8) {
                            pw7Var = pw7Var2;
                            f8 = f15;
                        }
                        i6++;
                        f4 = f10;
                        arrayList3 = arrayList;
                        xvcVar2 = xvcVar;
                    }
                }
                arrayList = arrayList3;
                xvcVar = xvcVar2;
                i6++;
                f4 = f10;
                arrayList3 = arrayList;
                xvcVar2 = xvcVar;
            }
            ArrayList arrayList5 = arrayList3;
            xvc xvcVar3 = xvcVar2;
            if (pw7Var != null) {
                sparseBooleanArray.append(pw7Var.d, true);
            }
            qtVar.put(zhbVar, pw7Var);
            i3++;
            i2 = i6;
            arrayList3 = arrayList5;
            xvcVar2 = xvcVar3;
        }
        xvc xvcVar4 = xvcVar2;
        sparseBooleanArray.clear();
        return xvcVar4;
    }

    public final void b(Throwable th) {
        boolean z = th instanceof TimeoutException;
        nkd nkdVar = (nkd) this.d;
        if (z) {
            nkdVar.E(102, 28, sld.p);
            yid.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            nkdVar.E(95, 28, sld.p);
            yid.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.c).run();
    }

    public ow7(nkd nkdVar, int i, gu2 gu2Var, Runnable runnable) {
        this.a = i;
        this.b = gu2Var;
        this.c = runnable;
        this.d = nkdVar;
    }
}
