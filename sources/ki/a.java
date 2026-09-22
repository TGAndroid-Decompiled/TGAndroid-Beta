package ki;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import hh.k;
import java.util.ArrayList;
import java.util.Iterator;
public final class a {
    public final e f13651a;

    public final void a() {
        boolean z10;
        int i10;
        li.a aVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        e eVar = this.f13651a;
        ArrayList arrayList = eVar.d;
        li.a aVar2 = eVar.f13670p;
        RectF rectF = eVar.f13667m;
        int width = eVar.f13663i.getWidth();
        int height = eVar.f13663i.getHeight();
        if (eVar.f13668n == width && eVar.f13669o == height) {
            z10 = false;
        } else {
            eVar.f13668n = width;
            eVar.f13669o = height;
            z10 = true;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            d dVar = (d) obj;
            View view = dVar.f13653a;
            RectF rectF2 = dVar.f13656f;
            RectF rectF3 = dVar.d;
            RectF rectF4 = dVar.f13655c;
            RectF rectF5 = dVar.e;
            ch.d dVar2 = dVar.f13654b;
            boolean z16 = z10;
            if (!k.c(view, eVar.f13663i, rectF)) {
                z10 = z16;
            } else {
                if (!rectF4.equals(rectF)) {
                    rectF4.set(rectF);
                    dVar.f13657g = true;
                    dVar2.t(rectF4.left, rectF4.top);
                    z11 = true;
                } else {
                    z11 = z16;
                }
                rectF.set(dVar2.getBounds());
                if (!rectF3.equals(rectF)) {
                    rectF3.set(rectF);
                    z12 = true;
                    dVar.f13657g = true;
                    z11 = true;
                } else {
                    z12 = true;
                }
                rectF.offset(rectF4.left, rectF4.top);
                if (!rectF5.equals(rectF)) {
                    rectF5.set(rectF);
                    dVar.f13657g = z12;
                    z11 = true;
                }
                rectF.set(rectF5);
                rectF.inset(-dVar2.h, -dVar2.f4284i);
                if (!rectF2.equals(rectF)) {
                    rectF2.set(rectF);
                    dVar.f13657g = true;
                    z11 = true;
                }
                View view2 = dVar.f13653a;
                if (!rectF5.isEmpty() && view2.isAttachedToWindow() && rectF5.intersects(0.0f, 0.0f, width, height) && dVar2.f4287l > 0 && view2.getVisibility() == 0 && view2.getAlpha() > 0.0f && view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f) {
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
                    dVar.f13657g = true;
                    z15 = true;
                }
                z10 = z15;
            }
        }
        boolean z17 = z10;
        if (z17) {
            aVar2.f14125b = 0;
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList.get(i12);
                i12++;
                d dVar3 = (d) obj2;
                if (dVar3.h) {
                    RectF rectF6 = dVar3.f13656f;
                    aVar2.a(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom);
                }
            }
            li.b bVar = eVar.e;
            li.a aVar3 = eVar.f13671q;
            bVar.getClass();
            if (aVar2 != aVar3) {
                aVar3.f14125b = 0;
                int i13 = aVar2.f14125b;
                for (int i14 = 0; i14 < i13; i14++) {
                    RectF b10 = aVar2.b(i14);
                    float f7 = b10.left;
                    float f10 = b10.top;
                    float f11 = b10.right;
                    float f12 = b10.bottom;
                    int i15 = 0;
                    while (i15 < aVar3.f14125b) {
                        RectF b11 = aVar3.b(i15);
                        float f13 = b11.left;
                        float f14 = b11.right;
                        float f15 = bVar.f14127a;
                        if (f11 >= f13 ? !(f14 >= f7 || f7 - f14 <= f15) : f13 - f11 > f15) {
                            aVar = aVar2;
                        } else {
                            float f16 = b11.top;
                            float f17 = b11.bottom;
                            aVar = aVar2;
                            float f18 = bVar.f14128b;
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
                int i16 = aVar3.f14125b;
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
        ArrayList arrayList2 = eVar.f13673s;
        if (arrayList2.size() <= 0) {
            Iterator it = eVar.f13660c.iterator();
            if (!it.hasNext()) {
                if (z17) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                long j3 = eVar.f13666l;
                long j10 = eVar.h;
                if (j3 != j10) {
                    eVar.f13666l = j10;
                    i10 |= 8;
                }
                long j11 = eVar.f13665k;
                long j12 = eVar.f13662g;
                if (j11 != j12) {
                    eVar.f13665k = j12;
                    i10 |= 2;
                }
                long j13 = eVar.f13664j;
                long j14 = eVar.f13661f;
                if (j13 != j14) {
                    eVar.f13664j = j14;
                    i10 |= 1;
                }
                if (i10 != 0) {
                    c cVar = eVar.f13658a;
                    if (cVar != null) {
                        cVar.b(i10);
                    }
                    int size3 = arrayList.size();
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj3 = arrayList.get(i19);
                        i19++;
                        d dVar4 = (d) obj3;
                        boolean z18 = dVar4.h;
                        ch.d dVar5 = dVar4.f13654b;
                        if (z18 && dVar4.f13657g) {
                            dVar4.f13657g = false;
                            if (Build.VERSION.SDK_INT >= 29 && (dVar5 instanceof ch.e)) {
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
            throw a4.a.k(it);
        }
        arrayList2.get(0).getClass();
        throw new ClassCastException();
    }
}
