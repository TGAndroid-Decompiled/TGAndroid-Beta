package li;

import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import hh.k;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n;
import w7.d0;
public final class c {
    public final i f14290a;

    public c(i iVar) {
        this.f14290a = iVar;
    }

    public final void a() {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        i iVar = this.f14290a;
        ArrayList arrayList = iVar.f14305i;
        mi.a aVar = iVar.f14312p;
        ArrayList arrayList2 = iVar.f14302c;
        RectF rectF = iVar.f14309m;
        int width = iVar.h.getWidth();
        int height = iVar.h.getHeight();
        if (iVar.f14310n == width && iVar.f14311o == height) {
            z10 = false;
        } else {
            iVar.f14310n = width;
            iVar.f14311o = height;
            z10 = true;
        }
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            h hVar = (h) arrayList2.get(i11);
            View view = hVar.f14295a;
            RectF rectF2 = hVar.f14298f;
            RectF rectF3 = hVar.d;
            RectF rectF4 = hVar.f14297c;
            RectF rectF5 = hVar.e;
            boolean z15 = z10;
            ch.d dVar = hVar.f14296b;
            int i12 = size;
            if (!k.c(view, iVar.h, rectF)) {
                z10 = z15;
            } else {
                if (!rectF4.equals(rectF)) {
                    rectF4.set(rectF);
                    hVar.f14299g = true;
                    dVar.t(rectF4.left, rectF4.top);
                    z15 = true;
                }
                rectF.set(dVar.getBounds());
                if (!rectF3.equals(rectF)) {
                    rectF3.set(rectF);
                    z11 = true;
                    hVar.f14299g = true;
                    z15 = true;
                } else {
                    z11 = true;
                }
                rectF.offset(rectF4.left, rectF4.top);
                if (!rectF5.equals(rectF)) {
                    rectF5.set(rectF);
                    hVar.f14299g = z11;
                    z12 = true;
                } else {
                    z12 = z15;
                }
                rectF.set(rectF5);
                rectF.inset(-dVar.h, -dVar.f4287i);
                if (!rectF2.equals(rectF)) {
                    rectF2.set(rectF);
                    hVar.f14299g = true;
                    z12 = true;
                }
                View view2 = hVar.f14295a;
                if (!rectF5.isEmpty() && view2.isAttachedToWindow() && rectF5.intersects(0.0f, 0.0f, width, height) && dVar.f4290l > 0 && view2.getVisibility() == 0 && view2.getAlpha() > 0.0f && view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 && dVar.j()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (hVar.h == z13 && (!z13 || z14)) {
                    z10 = z12;
                } else {
                    hVar.h = z13;
                    hVar.f14299g = true;
                    z10 = true;
                    i11++;
                    size = i12;
                }
            }
            i11++;
            size = i12;
        }
        boolean z16 = z10;
        if (z16) {
            aVar.f15018b = 0;
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                h hVar2 = (h) arrayList2.get(i13);
                if (hVar2.h) {
                    RectF rectF6 = hVar2.f14298f;
                    aVar.a(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom);
                }
            }
            mi.b bVar = iVar.d;
            mi.a aVar2 = iVar.f14313q;
            bVar.getClass();
            if (aVar != aVar2) {
                aVar2.f15018b = 0;
                int i14 = aVar.f15018b;
                for (int i15 = 0; i15 < i14; i15++) {
                    RectF c10 = aVar.c(i15);
                    float f7 = c10.left;
                    float f10 = c10.top;
                    float f11 = c10.right;
                    float f12 = c10.bottom;
                    int i16 = 0;
                    while (i16 < aVar2.f15018b) {
                        RectF c11 = aVar2.c(i16);
                        float f13 = c11.left;
                        float f14 = c11.right;
                        mi.a aVar3 = aVar;
                        float f15 = bVar.f15020a;
                        if (f11 >= f13 ? f14 >= f7 || f7 - f14 <= f15 : f13 - f11 <= f15) {
                            float f16 = c11.top;
                            float f17 = c11.bottom;
                            float f18 = bVar.f15021b;
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
                int i17 = aVar2.f15018b;
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
        ArrayList arrayList3 = iVar.f14315s;
        int size3 = arrayList3.size();
        boolean z17 = false;
        for (int i20 = 0; i20 < size3; i20++) {
            g gVar = (g) arrayList3.get(i20);
            n nVar = gVar.f14294b;
            fh.c cVar = gVar.f14293a;
            int themedColor = nVar.f19601a.getThemedColor(j6.f19006a7);
            if (cVar.f9072a.getColor() != themedColor) {
                cVar.a(themedColor);
                z17 = true;
            }
        }
        if (z16) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (z17) {
            i10 |= 16;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int size4 = arrayList.size();
            for (int i21 = 0; i21 < size4; i21++) {
                ah.i iVar2 = (ah.i) arrayList.get(i21);
                if (iVar2.e) {
                    iVar2.e = false;
                    iVar.f14304g++;
                }
            }
        }
        long j3 = iVar.f14308l;
        long j10 = iVar.f14304g;
        if (j3 != j10) {
            iVar.f14308l = j10;
            i10 |= 8;
        }
        long j11 = iVar.f14307k;
        long j12 = iVar.f14303f;
        if (j11 != j12) {
            iVar.f14307k = j12;
            i10 |= 2;
        }
        long j13 = iVar.f14306j;
        long j14 = iVar.e;
        if (j13 != j14) {
            iVar.f14306j = j14;
            i10 |= 1;
        }
        if (i10 != 0) {
            f fVar = iVar.f14300a;
            if (fVar != null) {
                fVar.j(i10);
            }
            boolean a2 = d0.a(i10, 16);
            boolean a10 = d0.a(i10, 4);
            int size5 = arrayList2.size();
            for (int i22 = 0; i22 < size5; i22++) {
                h hVar3 = (h) arrayList2.get(i22);
                boolean z18 = hVar3.h;
                ch.d dVar2 = hVar3.f14296b;
                if (z18 && (hVar3.f14299g || a10 || a2)) {
                    hVar3.f14299g = false;
                    if (a2) {
                        dVar2.v();
                    }
                    if (Build.VERSION.SDK_INT >= 29 && (dVar2 instanceof ch.e)) {
                        dVar2.w();
                    } else {
                        dVar2.invalidateSelf();
                    }
                }
            }
        }
    }
}
