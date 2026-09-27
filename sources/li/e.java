package li;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import w7.d0;
public final class e {
    public final l f14371a;

    public final void a() {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        l lVar = this.f14371a;
        ArrayList arrayList = lVar.f14389l;
        ni.a aVar = lVar.f14396s;
        ArrayList arrayList2 = lVar.f14383c;
        RectF rectF = lVar.f14393p;
        int width = lVar.f14388k.getWidth();
        int height = lVar.f14388k.getHeight();
        if (lVar.f14394q == width && lVar.f14395r == height) {
            z10 = false;
        } else {
            lVar.f14394q = width;
            lVar.f14395r = height;
            z10 = true;
        }
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            k kVar = (k) arrayList2.get(i11);
            View view = kVar.f14376a;
            RectF rectF2 = kVar.f14379f;
            RectF rectF3 = kVar.d;
            RectF rectF4 = kVar.f14378c;
            RectF rectF5 = kVar.e;
            boolean z16 = z10;
            mi.c cVar = kVar.f14377b;
            int i12 = size;
            if (hh.k.c(view, lVar.f14388k, rectF)) {
                if (!rectF4.equals(rectF)) {
                    rectF4.set(rectF);
                    kVar.f14380g = true;
                    cVar.e(rectF4.left, rectF4.top);
                    z11 = true;
                } else {
                    z11 = false;
                }
                rectF.set(cVar.getBounds());
                if (!rectF3.equals(rectF)) {
                    rectF3.set(rectF);
                    z12 = true;
                    kVar.f14380g = true;
                    z11 = true;
                } else {
                    z12 = true;
                }
                rectF.offset(rectF4.left, rectF4.top);
                if (!rectF5.equals(rectF)) {
                    rectF5.set(rectF);
                    kVar.f14380g = z12;
                    z11 = true;
                }
                rectF.set(rectF5);
                rectF.inset(-cVar.b(), -cVar.c());
                if (!rectF2.equals(rectF)) {
                    rectF2.set(rectF);
                    kVar.f14380g = true;
                    z11 = true;
                }
                View view2 = kVar.f14376a;
                if (!rectF5.isEmpty() && view2.isAttachedToWindow() && rectF5.intersects(0.0f, 0.0f, width, height) && cVar.getAlpha() > 0 && view2.getVisibility() == 0 && view2.getAlpha() > 0.0f && view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 && cVar.d()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (kVar.h == z13 && (!z13 || z14)) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (z15) {
                    kVar.h = z13;
                    kVar.f14380g = true;
                    z11 = true;
                }
                if ((z13 || z15) && z11) {
                    z10 = true;
                    i11++;
                    size = i12;
                }
            }
            z10 = z16;
            i11++;
            size = i12;
        }
        boolean z17 = z10;
        if (z17) {
            aVar.f15502b = 0;
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                k kVar2 = (k) arrayList2.get(i13);
                if (kVar2.h) {
                    RectF rectF6 = kVar2.f14379f;
                    aVar.a(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom);
                }
            }
            ni.b bVar = lVar.d;
            ni.a aVar2 = lVar.f14397t;
            bVar.getClass();
            if (aVar != aVar2) {
                aVar2.f15502b = 0;
                int i14 = aVar.f15502b;
                for (int i15 = 0; i15 < i14; i15++) {
                    RectF c10 = aVar.c(i15);
                    float f7 = c10.left;
                    float f10 = c10.top;
                    float f11 = c10.right;
                    float f12 = c10.bottom;
                    int i16 = 0;
                    while (i16 < aVar2.f15502b) {
                        RectF c11 = aVar2.c(i16);
                        float f13 = c11.left;
                        float f14 = c11.right;
                        ni.a aVar3 = aVar;
                        float f15 = bVar.f15504a;
                        if (f11 >= f13 ? f14 >= f7 || f7 - f14 <= f15 : f13 - f11 <= f15) {
                            float f16 = c11.top;
                            float f17 = c11.bottom;
                            float f18 = bVar.f15505b;
                            if (f12 >= f16 ? f17 >= f10 || f10 - f17 <= f18 : f16 - f12 <= f18) {
                                if (f13 < f7) {
                                    f7 = f13;
                                }
                                if (f16 < f10) {
                                    f10 = f16;
                                }
                                if (f14 > f11) {
                                    f11 = f14;
                                }
                                if (f17 > f12) {
                                    f12 = f17;
                                }
                                aVar2.d(i16);
                                i16 = 0;
                                aVar = aVar3;
                            }
                        }
                        i16++;
                        aVar = aVar3;
                    }
                    aVar2.a(f7, f10, f11, f12);
                }
                int i17 = aVar2.f15502b;
                for (int i18 = 1; i18 < i17; i18++) {
                    RectF c12 = aVar2.c(i18);
                    float f19 = c12.left;
                    float f20 = c12.top;
                    float f21 = c12.right;
                    float f22 = c12.bottom;
                    int i19 = i18 - 1;
                    while (i19 >= 0) {
                        RectF c13 = aVar2.c(i19);
                        float f23 = c13.top;
                        float f24 = c13.left;
                        int compare = Float.compare(f23, f20);
                        if (compare == 0) {
                            compare = Float.compare(f24, f19);
                        }
                        if (compare <= 0) {
                            break;
                        }
                        aVar2.c(i19 + 1).set(c13);
                        i19--;
                    }
                    aVar2.c(i19 + 1).set(f19, f20, f21, f22);
                }
            } else {
                throw new IllegalArgumentException("positions and output must be different arrays");
            }
        }
        ArrayList arrayList3 = lVar.v;
        int size3 = arrayList3.size();
        boolean z18 = false;
        for (int i20 = 0; i20 < size3; i20++) {
            j jVar = (j) arrayList3.get(i20);
            i iVar = jVar.f14375b;
            fh.c cVar2 = jVar.f14374a;
            int g10 = iVar.g();
            if (cVar2.f9058a.getColor() != g10) {
                cVar2.a(g10);
                z18 = true;
            }
        }
        if (z17) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (z18) {
            i10 |= 16;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int size4 = arrayList.size();
            for (int i21 = 0; i21 < size4; i21++) {
                ah.i iVar2 = (ah.i) arrayList.get(i21);
                if (iVar2.e) {
                    iVar2.e = false;
                    lVar.f14385g++;
                }
            }
        }
        long j3 = lVar.f14392o;
        long j10 = lVar.f14385g;
        if (j3 != j10) {
            lVar.f14392o = j10;
            i10 |= 8;
        }
        long j11 = lVar.f14391n;
        long j12 = lVar.f14384f;
        if (j11 != j12) {
            lVar.f14391n = j12;
            i10 |= 2;
        }
        long j13 = lVar.f14390m;
        long j14 = lVar.e;
        if (j13 != j14) {
            lVar.f14390m = j14;
            i10 |= 1;
        }
        if (i10 != 0) {
            h hVar = lVar.f14381a;
            if (hVar != null) {
                hVar.j(i10);
            }
            boolean a2 = d0.a(i10, 16);
            d0.a(i10, 4);
            int size5 = arrayList2.size();
            for (int i22 = 0; i22 < size5; i22++) {
                k kVar3 = (k) arrayList2.get(i22);
                boolean z19 = kVar3.h;
                mi.c cVar3 = kVar3.f14377b;
                if (z19) {
                    boolean z20 = kVar3.f14380g;
                }
                kVar3.f14380g = false;
                if (a2) {
                    cVar3.g();
                }
                if (cVar3.f()) {
                    cVar3.a();
                } else {
                    cVar3.invalidateSelf();
                    kVar3.f14376a.invalidate();
                }
            }
        }
    }
}
