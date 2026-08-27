package ag;

import android.graphics.Bitmap;
import android.media.VolumeProvider;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class h1 {

    public int f411a;

    public int f412b;

    public int f413c;
    public Object d;

    public Object f414e;

    public Object f415f;

    public h1(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.f414e = arrayList;
        this.f411a = 16;
        this.f412b = 12544;
        this.f413c = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f415f = arrayList2;
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(d2.c.f4710g);
        this.d = bitmap;
        arrayList.add(d2.f.d);
        arrayList.add(d2.f.f4722e);
        arrayList.add(d2.f.f4723f);
        arrayList.add(d2.f.f4724g);
        arrayList.add(d2.f.h);
        arrayList.add(d2.f.f4725i);
    }

    public int a(int i10) {
        SparseArray sparseArray = ((androidx.emoji2.text.r) this.f414e).f1377a;
        androidx.emoji2.text.r rVar = sparseArray == null ? null : (androidx.emoji2.text.r) sparseArray.get(i10);
        int i11 = 1;
        if (this.f411a == 2) {
            if (rVar != null) {
                this.f414e = rVar;
                this.f413c++;
            } else if (i10 == 65038) {
                d();
            } else if (i10 != 65039) {
                androidx.emoji2.text.r rVar2 = (androidx.emoji2.text.r) this.f414e;
                if (rVar2.f1378b != null) {
                    if (this.f413c != 1) {
                        this.f415f = rVar2;
                        d();
                    } else if (e()) {
                        this.f415f = (androidx.emoji2.text.r) this.f414e;
                        d();
                    } else {
                        d();
                    }
                    i11 = 3;
                } else {
                    d();
                }
            }
            i11 = 2;
        } else if (rVar == null) {
            d();
        } else {
            this.f411a = 2;
            this.f414e = rVar;
            this.f413c = 1;
            i11 = 2;
        }
        this.f412b = i10;
        return i11;
    }

    public d2.c b() {
        int iMax;
        d2.c cVar;
        ArrayList arrayList = (ArrayList) this.f415f;
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap == null) {
            throw new AssertionError();
        }
        int i10 = this.f413c;
        int i11 = this.f412b;
        double dSqrt = -1.0d;
        if (i11 > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i11) {
                dSqrt = Math.sqrt(((double) i11) / ((double) height));
            }
        } else if (i10 > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i10) {
            dSqrt = ((double) i10) / ((double) iMax);
        }
        Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        int width = bitmapCreateScaledBitmap.getWidth();
        int height2 = bitmapCreateScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        d2.c cVar2 = new d2.c(iArr, this.f411a, arrayList.isEmpty() ? null : (d2.d[]) arrayList.toArray(new d2.d[arrayList.size()]));
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        ArrayList arrayList2 = (ArrayList) cVar2.f4713c;
        ArrayList arrayList3 = (ArrayList) this.f414e;
        d2.c cVar3 = new d2.c(arrayList3, arrayList2);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) cVar3.d;
        int size = arrayList3.size();
        int i12 = 0;
        while (i12 < size) {
            d2.f fVar = (d2.f) arrayList3.get(i12);
            float[] fArr = fVar.f4728c;
            float[] fArr2 = fVar.f4726a;
            float f10 = 0.0f;
            for (float f11 : fArr) {
                if (f11 > 0.0f) {
                    f10 += f11;
                }
            }
            if (f10 != 0.0f) {
                int length = fArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    float f12 = fArr[i13];
                    if (f12 > 0.0f) {
                        fArr[i13] = f12 / f10;
                    }
                }
            }
            a0.f fVar2 = (a0.f) cVar3.f4713c;
            List list = (List) cVar3.f4711a;
            int size2 = list.size();
            int i14 = 0;
            d2.e eVar = null;
            float f13 = 0.0f;
            while (i14 < size2) {
                d2.e eVar2 = (d2.e) list.get(i14);
                float[] fArrB = eVar2.b();
                float f14 = fArrB[1];
                float[] fArr3 = fVar.f4727b;
                if (f14 < fArr2[0] || f14 > fArr2[2]) {
                    cVar = cVar3;
                } else {
                    float f15 = fArrB[2];
                    if (f15 < fArr3[0] || f15 > fArr3[2] || sparseBooleanArray.get(eVar2.d)) {
                        cVar = cVar3;
                    } else {
                        float[] fArrB2 = eVar2.b();
                        d2.e eVar3 = (d2.e) cVar3.f4714e;
                        int i15 = eVar3 != null ? eVar3.f4718e : 1;
                        cVar = cVar3;
                        float[] fArr4 = fVar.f4728c;
                        float f16 = fArr4[0];
                        float fAbs = f16 > 0.0f ? (1.0f - Math.abs(fArrB2[1] - fArr2[1])) * f16 : 0.0f;
                        float f17 = fArr4[1];
                        float fAbs2 = f17 > 0.0f ? (1.0f - Math.abs(fArrB2[2] - fArr3[1])) * f17 : 0.0f;
                        float f18 = fArr4[2];
                        float f19 = fAbs + fAbs2 + (f18 > 0.0f ? (eVar2.f4718e / i15) * f18 : 0.0f);
                        if (eVar == null || f19 > f13) {
                            eVar = eVar2;
                            f13 = f19;
                        }
                    }
                }
                i14++;
                cVar3 = cVar;
            }
            d2.c cVar4 = cVar3;
            if (eVar != null) {
                sparseBooleanArray.append(eVar.d, true);
            }
            fVar2.put(fVar, eVar);
            i12++;
            cVar3 = cVar4;
        }
        d2.c cVar5 = cVar3;
        sparseBooleanArray.clear();
        return cVar5;
    }

    public VolumeProvider c() {
        h1 h1Var;
        if (((VolumeProvider) this.f414e) != null) {
            h1Var = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            h1Var = this;
            h1Var.f414e = new y1.e(h1Var, this.f411a, this.f412b, this.f413c, (String) this.d);
        } else {
            h1Var = this;
            h1Var.f414e = new y1.f(this, h1Var.f411a, h1Var.f412b, h1Var.f413c);
        }
        return (VolumeProvider) h1Var.f414e;
    }

    public void d() {
        this.f411a = 1;
        this.f414e = (androidx.emoji2.text.r) this.d;
        this.f413c = 0;
    }

    public boolean e() {
        p1.a aVarB = ((androidx.emoji2.text.r) this.f414e).f1378b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.d).get(iA + aVarB.f45341a) == 0) || this.f412b == 65039;
    }
}
