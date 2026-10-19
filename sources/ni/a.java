package ni;

import a1.g;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import ih.j;
import java.util.ArrayList;
import java.util.Iterator;
public final class a {
    public final e f17475a;

    public final void a() {
        boolean z10;
        int i10;
        oi.a aVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        e eVar = this.f17475a;
        ArrayList arrayList = eVar.d;
        oi.a aVar2 = eVar.f17494p;
        RectF rectF = eVar.f17491m;
        int width = eVar.f17487i.getWidth();
        int height = eVar.f17487i.getHeight();
        if (eVar.f17492n == width && eVar.f17493o == height) {
            z10 = false;
        } else {
            eVar.f17492n = width;
            eVar.f17493o = height;
            z10 = true;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            d dVar = (d) obj;
            View view = dVar.f17477a;
            RectF rectF2 = dVar.f17480f;
            RectF rectF3 = dVar.d;
            RectF rectF4 = dVar.f17479c;
            RectF rectF5 = dVar.e;
            dh.d dVar2 = dVar.f17478b;
            boolean z16 = z10;
            if (!j.c(view, eVar.f17487i, rectF)) {
                z10 = z16;
            } else {
                if (!rectF4.equals(rectF)) {
                    rectF4.set(rectF);
                    dVar.f17481g = true;
                    dVar2.t(rectF4.left, rectF4.top);
                    z11 = true;
                } else {
                    z11 = z16;
                }
                rectF.set(dVar2.getBounds());
                if (!rectF3.equals(rectF)) {
                    rectF3.set(rectF);
                    z12 = true;
                    dVar.f17481g = true;
                    z11 = true;
                } else {
                    z12 = true;
                }
                rectF.offset(rectF4.left, rectF4.top);
                if (!rectF5.equals(rectF)) {
                    rectF5.set(rectF);
                    dVar.f17481g = z12;
                    z11 = true;
                }
                rectF.set(rectF5);
                rectF.inset(-dVar2.h, -dVar2.f8013i);
                if (!rectF2.equals(rectF)) {
                    rectF2.set(rectF);
                    dVar.f17481g = true;
                    z11 = true;
                }
                View view2 = dVar.f17477a;
                if (!rectF5.isEmpty() && view2.isAttachedToWindow() && rectF5.intersects(0.0f, 0.0f, width, height) && dVar2.f8016l > 0 && view2.getVisibility() == 0 && view2.getAlpha() > 0.0f && view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 && dVar2.j()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (dVar.h == z13 && (!z13 || z14)) {
                    z15 = z11;
                } else {
                    dVar.h = z13;
                    dVar.f17481g = true;
                    z15 = true;
                }
                z10 = z15;
            }
        }
        boolean z17 = z10;
        if (z17) {
            aVar2.f17753b = 0;
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList.get(i12);
                i12++;
                d dVar3 = (d) obj2;
                if (dVar3.h) {
                    RectF rectF6 = dVar3.f17480f;
                    aVar2.a(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom);
                }
            }
            oi.b bVar = eVar.e;
            oi.a aVar3 = eVar.f17495q;
            bVar.getClass();
            if (aVar2 != aVar3) {
                aVar3.f17753b = 0;
                int i13 = aVar2.f17753b;
                for (int i14 = 0; i14 < i13; i14++) {
                    RectF b10 = aVar2.b(i14);
                    float f7 = b10.left;
                    float f10 = b10.top;
                    float f11 = b10.right;
                    float f12 = b10.bottom;
                    int i15 = 0;
                    while (i15 < aVar3.f17753b) {
                        RectF b11 = aVar3.b(i15);
                        float f13 = b11.left;
                        float f14 = b11.right;
                        float f15 = bVar.f17755a;
                        if (f11 >= f13 ? !(f14 >= f7 || f7 - f14 <= f15) : f13 - f11 > f15) {
                            aVar = aVar2;
                        } else {
                            float f16 = b11.top;
                            float f17 = b11.bottom;
                            aVar = aVar2;
                            float f18 = bVar.f17756b;
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
                                aVar3.c(i15);
                                i15 = 0;
                                aVar2 = aVar;
                            }
                        }
                        i15++;
                        aVar2 = aVar;
                    }
                    aVar3.a(f7, f10, f11, f12);
                }
                int i16 = aVar3.f17753b;
                for (int i17 = 1; i17 < i16; i17++) {
                    RectF b12 = aVar3.b(i17);
                    float f19 = b12.left;
                    float f20 = b12.top;
                    float f21 = b12.right;
                    float f22 = b12.bottom;
                    int i18 = i17 - 1;
                    while (i18 >= 0) {
                        RectF b13 = aVar3.b(i18);
                        float f23 = b13.top;
                        float f24 = b13.left;
                        int compare = Float.compare(f23, f20);
                        if (compare == 0) {
                            compare = Float.compare(f24, f19);
                        }
                        if (compare <= 0) {
                            break;
                        }
                        aVar3.b(i18 + 1).set(b13);
                        i18--;
                    }
                    aVar3.b(i18 + 1).set(f19, f20, f21, f22);
                }
            } else {
                throw new IllegalArgumentException("positions and output must be different arrays");
            }
        }
        ArrayList arrayList2 = eVar.f17497s;
        if (arrayList2.size() <= 0) {
            Iterator it = eVar.f17484c.iterator();
            if (!it.hasNext()) {
                if (z17) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                long j10 = eVar.f17490l;
                long j11 = eVar.h;
                if (j10 != j11) {
                    eVar.f17490l = j11;
                    i10 |= 8;
                }
                long j12 = eVar.f17489k;
                long j13 = eVar.f17486g;
                if (j12 != j13) {
                    eVar.f17489k = j13;
                    i10 |= 2;
                }
                long j14 = eVar.f17488j;
                long j15 = eVar.f17485f;
                if (j14 != j15) {
                    eVar.f17488j = j15;
                    i10 |= 1;
                }
                if (i10 != 0) {
                    c cVar = eVar.f17482a;
                    if (cVar != null) {
                        cVar.c(i10);
                    }
                    int size3 = arrayList.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj3 = arrayList.get(i19);
                        i19++;
                        d dVar4 = (d) obj3;
                        boolean z18 = dVar4.h;
                        dh.d dVar5 = dVar4.f17478b;
                        if (z18 && dVar4.f17481g) {
                            dVar4.f17481g = false;
                            if (Build.VERSION.SDK_INT >= 29 && (dVar5 instanceof dh.e)) {
                                dVar5.w();
                            } else {
                                dVar5.invalidateSelf();
                            }
                        }
                    }
                    return;
                }
                return;
            }
            throw g.j(it);
        }
        arrayList2.get(0).getClass();
        throw new ClassCastException();
    }
}
