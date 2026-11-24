package defpackage;

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
public final class nu7 {
    public byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public nu7(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = (byte) 16;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        if (!bitmap.isRecycled()) {
            arrayList2.add(wtc.f);
            this.b = bitmap;
            arrayList.add(yfb.d);
            arrayList.add(yfb.e);
            arrayList.add(yfb.f);
            arrayList.add(yfb.g);
            arrayList.add(yfb.h);
            arrayList.add(yfb.i);
            return;
        }
        w26.j("Bitmap is not valid");
        throw null;
    }

    public final wtc a() {
        double d;
        Bitmap createScaledBitmap;
        mu7[] mu7VarArr;
        ArrayList arrayList;
        wtc wtcVar;
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
            mu7VarArr = null;
        } else {
            mu7VarArr = (mu7[]) arrayList2.toArray(new mu7[arrayList2.size()]);
        }
        gl2 gl2Var = new gl2(iArr, b, mu7VarArr);
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList3 = (ArrayList) gl2Var.d;
        ArrayList arrayList4 = (ArrayList) this.c;
        ?? obj = new Object();
        obj.a = arrayList3;
        obj.c = new SparseBooleanArray();
        obj.b = new aia(0);
        int size = arrayList3.size();
        int i3 = Integer.MIN_VALUE;
        ou7 ou7Var = null;
        for (int i4 = 0; i4 < size; i4++) {
            ou7 ou7Var2 = (ou7) arrayList3.get(i4);
            int i5 = ou7Var2.e;
            if (i5 > i3) {
                ou7Var = ou7Var2;
                i3 = i5;
            }
        }
        obj.d = ou7Var;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) obj.c;
        int size2 = arrayList4.size();
        int i6 = 0;
        wtc wtcVar2 = obj;
        while (i6 < size2) {
            yfb yfbVar = (yfb) arrayList4.get(i6);
            float[] fArr = yfbVar.c;
            float[] fArr2 = yfbVar.a;
            int length = fArr.length;
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i7 = i2; i7 < length; i7++) {
                float f6 = fArr[i7];
                if (f6 > 0.0f) {
                    f5 += f6;
                }
            }
            if (f5 != 0.0f) {
                int length2 = fArr.length;
                for (int i8 = i2; i8 < length2; i8++) {
                    float f7 = fArr[i8];
                    if (f7 > 0.0f) {
                        fArr[i8] = f7 / f5;
                    }
                }
            }
            ps psVar = (ps) wtcVar2.b;
            ArrayList arrayList5 = (ArrayList) wtcVar2.a;
            int size3 = arrayList5.size();
            int i9 = i2;
            float f8 = 0.0f;
            ou7 ou7Var3 = null;
            wtc wtcVar3 = wtcVar2;
            while (i9 < size3) {
                ou7 ou7Var4 = (ou7) arrayList5.get(i9);
                float[] b2 = ou7Var4.b();
                float f9 = b2[1];
                float f10 = f4;
                float[] fArr3 = yfbVar.b;
                if (f9 >= fArr2[i9] && f9 <= fArr2[2]) {
                    float f11 = b2[2];
                    if (f11 >= fArr3[i9] && f11 <= fArr3[2] && !sparseBooleanArray.get(ou7Var4.d)) {
                        float[] b3 = ou7Var4.b();
                        arrayList = arrayList4;
                        ou7 ou7Var5 = (ou7) wtcVar3.d;
                        if (ou7Var5 != null) {
                            i = ou7Var5.e;
                        } else {
                            i = 1;
                        }
                        wtcVar = wtcVar3;
                        float[] fArr4 = yfbVar.c;
                        float f12 = fArr4[i9];
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
                            f3 = (ou7Var4.e / i) * f14;
                        } else {
                            f3 = f10;
                        }
                        float f15 = f + f2 + f3;
                        if (ou7Var3 == null || f15 > f8) {
                            ou7Var3 = ou7Var4;
                            f8 = f15;
                        }
                        i9++;
                        f4 = f10;
                        arrayList4 = arrayList;
                        wtcVar3 = wtcVar;
                    }
                }
                arrayList = arrayList4;
                wtcVar = wtcVar3;
                i9++;
                f4 = f10;
                arrayList4 = arrayList;
                wtcVar3 = wtcVar;
            }
            ArrayList arrayList6 = arrayList4;
            wtc wtcVar4 = wtcVar3;
            if (ou7Var3 != null) {
                sparseBooleanArray.append(ou7Var3.d, true);
            }
            psVar.put(yfbVar, ou7Var3);
            i6++;
            i2 = i9;
            arrayList4 = arrayList6;
            wtcVar2 = wtcVar4;
        }
        wtc wtcVar5 = wtcVar2;
        sparseBooleanArray.clear();
        return wtcVar5;
    }

    public final void b(Throwable th) {
        boolean z = th instanceof TimeoutException;
        lid lidVar = (lid) this.d;
        if (z) {
            lidVar.E(102, 28, qjd.p);
            xgd.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            lidVar.E(95, 28, qjd.p);
            xgd.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.c).run();
    }

    public nu7(lid lidVar, int i, vs2 vs2Var, Runnable runnable) {
        this.a = i;
        this.b = vs2Var;
        this.c = runnable;
        this.d = lidVar;
    }
}
