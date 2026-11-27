package defpackage;

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
public final class ux7 {
    public byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ux7(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = (byte) 16;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        if (!bitmap.isRecycled()) {
            arrayList2.add(lyc.h);
            this.b = bitmap;
            arrayList.add(ujb.d);
            arrayList.add(ujb.e);
            arrayList.add(ujb.f);
            arrayList.add(ujb.g);
            arrayList.add(ujb.h);
            arrayList.add(ujb.i);
            return;
        }
        lq5.j("Bitmap is not valid");
        throw null;
    }

    public final lyc a() {
        double d;
        Bitmap createScaledBitmap;
        tx7[] tx7VarArr;
        ArrayList arrayList;
        lyc lycVar;
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
            tx7VarArr = null;
        } else {
            tx7VarArr = (tx7[]) arrayList2.toArray(new tx7[arrayList2.size()]);
        }
        am2 am2Var = new am2(iArr, b, tx7VarArr);
        if (createScaledBitmap != bitmap) {
            createScaledBitmap.recycle();
        }
        ArrayList arrayList3 = (ArrayList) this.c;
        lyc lycVar2 = new lyc((ArrayList) am2Var.d, arrayList3);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) lycVar2.d;
        int size = arrayList3.size();
        int i3 = 0;
        while (i3 < size) {
            ujb ujbVar = (ujb) arrayList3.get(i3);
            float[] fArr = ujbVar.c;
            float[] fArr2 = ujbVar.a;
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
            qs qsVar = (qs) lycVar2.c;
            ArrayList arrayList4 = (ArrayList) lycVar2.b;
            int size2 = arrayList4.size();
            int i6 = i2;
            float f8 = 0.0f;
            vx7 vx7Var = null;
            while (i6 < size2) {
                vx7 vx7Var2 = (vx7) arrayList4.get(i6);
                float[] b2 = vx7Var2.b();
                float f9 = b2[1];
                float f10 = f4;
                float[] fArr3 = ujbVar.b;
                if (f9 >= fArr2[i6] && f9 <= fArr2[2]) {
                    float f11 = b2[2];
                    if (f11 >= fArr3[i6] && f11 <= fArr3[2] && !sparseBooleanArray.get(vx7Var2.d)) {
                        float[] b3 = vx7Var2.b();
                        arrayList = arrayList3;
                        vx7 vx7Var3 = (vx7) lycVar2.e;
                        if (vx7Var3 != null) {
                            i = vx7Var3.e;
                        } else {
                            i = 1;
                        }
                        lycVar = lycVar2;
                        float[] fArr4 = ujbVar.c;
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
                            f3 = (vx7Var2.e / i) * f14;
                        } else {
                            f3 = f10;
                        }
                        float f15 = f + f2 + f3;
                        if (vx7Var == null || f15 > f8) {
                            vx7Var = vx7Var2;
                            f8 = f15;
                        }
                        i6++;
                        f4 = f10;
                        arrayList3 = arrayList;
                        lycVar2 = lycVar;
                    }
                }
                arrayList = arrayList3;
                lycVar = lycVar2;
                i6++;
                f4 = f10;
                arrayList3 = arrayList;
                lycVar2 = lycVar;
            }
            ArrayList arrayList5 = arrayList3;
            lyc lycVar3 = lycVar2;
            if (vx7Var != null) {
                sparseBooleanArray.append(vx7Var.d, true);
            }
            qsVar.put(ujbVar, vx7Var);
            i3++;
            i2 = i6;
            arrayList3 = arrayList5;
            lycVar2 = lycVar3;
        }
        lyc lycVar4 = lycVar2;
        sparseBooleanArray.clear();
        return lycVar4;
    }

    public final void b(Throwable th) {
        boolean z = th instanceof TimeoutException;
        cnd cndVar = (cnd) this.d;
        if (z) {
            cndVar.E(102, 28, hod.p);
            old.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            cndVar.E(95, 28, hod.p);
            old.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.c).run();
    }

    public ux7(cnd cndVar, int i, pt2 pt2Var, Runnable runnable) {
        this.a = i;
        this.b = pt2Var;
        this.c = runnable;
        this.d = cndVar;
    }
}
