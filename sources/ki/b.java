package ki;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import hh.k;
import java.util.ArrayList;
public final class b {
    public final h f13652a;

    public final void a() {
        boolean z10;
        int i10;
        li.a aVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        h hVar = this.f13652a;
        ArrayList arrayList = hVar.f13663c;
        li.a aVar2 = hVar.f13672o;
        RectF rectF = hVar.f13669l;
        int width = hVar.h.getWidth();
        int height = hVar.h.getHeight();
        if (hVar.f13670m == width && hVar.f13671n == height) {
            z10 = false;
        } else {
            hVar.f13670m = width;
            hVar.f13671n = height;
            z10 = true;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            g gVar = (g) obj;
            View view = gVar.f13656a;
            RectF rectF2 = gVar.f13659f;
            RectF rectF3 = gVar.d;
            RectF rectF4 = gVar.f13658c;
            RectF rectF5 = gVar.e;
            ch.d dVar = gVar.f13657b;
            boolean z16 = z10;
            if (!k.c(view, hVar.h, rectF)) {
                z10 = z16;
            } else {
                if (!rectF4.equals(rectF)) {
                    rectF4.set(rectF);
                    gVar.f13660g = true;
                    dVar.t(rectF4.left, rectF4.top);
                    z11 = true;
                } else {
                    z11 = z16;
                }
                rectF.set(dVar.getBounds());
                if (!rectF3.equals(rectF)) {
                    rectF3.set(rectF);
                    z12 = true;
                    gVar.f13660g = true;
                    z11 = true;
                } else {
                    z12 = true;
                }
                rectF.offset(rectF4.left, rectF4.top);
                if (!rectF5.equals(rectF)) {
                    rectF5.set(rectF);
                    gVar.f13660g = z12;
                    z11 = true;
                }
                rectF.set(rectF5);
                rectF.inset(-dVar.h, -dVar.f4282i);
                if (!rectF2.equals(rectF)) {
                    rectF2.set(rectF);
                    gVar.f13660g = true;
                    z11 = true;
                }
                View view2 = gVar.f13656a;
                if (!rectF5.isEmpty() && view2.isAttachedToWindow() && rectF5.intersects(0.0f, 0.0f, width, height) && dVar.f4285l > 0 && view2.getVisibility() == 0 && view2.getAlpha() > 0.0f && view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 && dVar.j()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (gVar.h == z13 && (!z13 || z14)) {
                    z15 = z11;
                } else {
                    gVar.h = z13;
                    gVar.f13660g = true;
                    z15 = true;
                }
                z10 = z15;
            }
        }
        boolean z17 = z10;
        if (z17) {
            aVar2.f14124b = 0;
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList.get(i12);
                i12++;
                g gVar2 = (g) obj2;
                if (gVar2.h) {
                    RectF rectF6 = gVar2.f13659f;
                    aVar2.a(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom);
                }
            }
            li.b bVar = hVar.d;
            li.a aVar3 = hVar.f13673p;
            bVar.getClass();
            if (aVar2 != aVar3) {
                aVar3.f14124b = 0;
                int i13 = aVar2.f14124b;
                for (int i14 = 0; i14 < i13; i14++) {
                    RectF c10 = aVar2.c(i14);
                    float f7 = c10.left;
                    float f10 = c10.top;
                    float f11 = c10.right;
                    float f12 = f10;
                    float f13 = f7;
                    float f14 = c10.bottom;
                    int i15 = 0;
                    while (i15 < aVar3.f14124b) {
                        RectF c11 = aVar3.c(i15);
                        float f15 = c11.left;
                        float f16 = c11.right;
                        float f17 = bVar.f14126a;
                        if (f11 >= f15 ? !(f16 >= f13 || f13 - f16 <= f17) : f15 - f11 > f17) {
                            aVar = aVar2;
                        } else {
                            float f18 = c11.top;
                            float f19 = c11.bottom;
                            aVar = aVar2;
                            float f20 = bVar.f14127b;
                            if (f14 >= f18 ? f19 >= f12 || f12 - f19 <= f20 : f18 - f14 <= f20) {
                                if (f15 < f13) {
                                    f13 = f15;
                                }
                                if (f18 < f12) {
                                    f12 = f18;
                                }
                                if (f16 > f11) {
                                    f11 = f16;
                                }
                                if (f19 > f14) {
                                    f14 = f19;
                                }
                                aVar3.d(i15);
                                i15 = 0;
                                aVar2 = aVar;
                            }
                        }
                        i15++;
                        aVar2 = aVar;
                    }
                    aVar3.a(f13, f12, f11, f14);
                }
                int i16 = aVar3.f14124b;
                for (int i17 = 1; i17 < i16; i17++) {
                    RectF c12 = aVar3.c(i17);
                    float f21 = c12.left;
                    float f22 = c12.top;
                    float f23 = c12.right;
                    float f24 = c12.bottom;
                    int i18 = i17 - 1;
                    while (i18 >= 0) {
                        RectF c13 = aVar3.c(i18);
                        float f25 = c13.top;
                        float f26 = c13.left;
                        int compare = Float.compare(f25, f22);
                        if (compare == 0) {
                            compare = Float.compare(f26, f21);
                        }
                        if (compare <= 0) {
                            break;
                        }
                        aVar3.c(i18 + 1).set(c13);
                        i18--;
                    }
                    aVar3.c(i18 + 1).set(f21, f22, f23, f24);
                }
            } else {
                throw new IllegalArgumentException("positions and output must be different arrays");
            }
        }
        ArrayList arrayList2 = hVar.f13675r;
        int size3 = arrayList2.size();
        boolean z18 = false;
        for (int i19 = 0; i19 < size3; i19++) {
            f fVar = (f) arrayList2.get(i19);
            e eVar = fVar.f13655b;
            fh.c cVar = fVar.f13654a;
            int e = eVar.e();
            if (cVar.f9068a.getColor() != e) {
                cVar.a(e);
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
        long j3 = hVar.f13668k;
        long j10 = hVar.f13665g;
        if (j3 != j10) {
            hVar.f13668k = j10;
            i10 |= 8;
        }
        long j11 = hVar.f13667j;
        long j12 = hVar.f13664f;
        if (j11 != j12) {
            hVar.f13667j = j12;
            i10 |= 2;
        }
        long j13 = hVar.f13666i;
        long j14 = hVar.e;
        if (j13 != j14) {
            hVar.f13666i = j14;
            i10 |= 1;
        }
        if (i10 != 0) {
            d dVar2 = hVar.f13661a;
            if (dVar2 != null) {
                dVar2.j(i10);
            }
            int size4 = arrayList.size();
            int i20 = 0;
            while (i20 < size4) {
                Object obj3 = arrayList.get(i20);
                i20++;
                g gVar3 = (g) obj3;
                boolean z19 = gVar3.h;
                ch.d dVar3 = gVar3.f13657b;
                if (z19 && gVar3.f13660g) {
                    gVar3.f13660g = false;
                    if (Build.VERSION.SDK_INT >= 29 && (dVar3 instanceof ch.e)) {
                        dVar3.w();
                    } else {
                        dVar3.invalidateSelf();
                    }
                }
            }
        }
    }
}
