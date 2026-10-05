package li;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.zl0;
import w7.e0;
public final class h {
    public final p f15654a;

    public h(p pVar) {
        this.f15654a = pVar;
    }

    public final void a() {
        int i10;
        p pVar = this.f15654a;
        ArrayList arrayList = pVar.f15673c;
        ArrayList arrayList2 = pVar.A;
        long j3 = pVar.f15686r;
        long j10 = p.C;
        if (j3 != j10) {
            pVar.f15686r = j10;
            i10 = 32;
        } else {
            i10 = 0;
        }
        long j11 = i6.Hl;
        if (pVar.f15685q != j11) {
            pVar.f15685q = j11;
            i10 |= 16;
        }
        Iterator it = pVar.f15680l.iterator();
        while (it.hasNext()) {
            if (((zl0) it.next()).b0()) {
                pVar.f15676g++;
            }
        }
        if (i10 == 0) {
            return;
        }
        if (e0.a(i10, 16)) {
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                n nVar = (n) arrayList2.get(i11);
                nVar.f15663a.a(nVar.f15664b.f());
            }
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            o oVar = (o) arrayList.get(i12);
            if (e0.a(i10, 32)) {
                e eVar = oVar.f15666b;
                q qVar = p.B;
                if (!Objects.equals(eVar.f15649a, qVar)) {
                    eVar.f15649a = qVar;
                    eVar.g(qVar);
                }
            }
            if (e0.a(i10, 16)) {
                oVar.f15666b.k();
            }
            oVar.f15666b.invalidateSelf();
            oVar.f15665a.invalidate();
            oVar.f15670g = true;
        }
        pVar.f15687s |= i10;
    }

    public final void b() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        p pVar = this.f15654a;
        ArrayList arrayList = pVar.f15681m;
        Trace.beginSection("G.CheckPositions");
        Rect rect = pVar.f15689u;
        ni.a aVar = pVar.f15691x;
        ArrayList arrayList2 = pVar.f15673c;
        RectF rectF = pVar.f15688t;
        int width = pVar.f15679k.getWidth();
        int height = pVar.f15679k.getHeight();
        if (pVar.v == width && pVar.f15690w == height) {
            z10 = false;
        } else {
            pVar.v = width;
            pVar.f15690w = height;
            z10 = true;
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            o oVar = (o) arrayList2.get(i10);
            View view = oVar.f15665a;
            RectF rectF2 = oVar.f15669f;
            RectF rectF3 = oVar.d;
            RectF rectF4 = oVar.f15667c;
            boolean z16 = z10;
            RectF rectF5 = oVar.f15668e;
            int i11 = size;
            e eVar = oVar.f15666b;
            int i12 = i10;
            if (hh.k.c(view, pVar.f15679k, rectF)) {
                if (!rectF4.equals(rectF)) {
                    rectF4.set(rectF);
                    oVar.f15670g = true;
                    eVar.i(rectF4.left, rectF4.top);
                    z11 = true;
                } else {
                    z11 = false;
                }
                eVar.b(rect);
                rectF.set(rect);
                if (!rectF3.equals(rectF)) {
                    rectF3.set(rectF);
                    z12 = true;
                    oVar.f15670g = true;
                    z11 = true;
                } else {
                    z12 = true;
                }
                rectF.offset(rectF4.left, rectF4.top);
                if (!rectF5.equals(rectF)) {
                    rectF5.set(rectF);
                    oVar.f15670g = z12;
                    z11 = true;
                }
                rectF.set(rectF5);
                rectF.inset(-eVar.c(), -eVar.d());
                if (!rectF2.equals(rectF)) {
                    rectF2.set(rectF);
                    oVar.f15670g = true;
                    z11 = true;
                }
                View view2 = oVar.f15665a;
                if (!rectF5.isEmpty() && view2.isAttachedToWindow() && rectF5.intersects(0.0f, 0.0f, width, height) && eVar.f15650b > 0 && view2.getVisibility() == 0 && view2.getAlpha() > 0.0f && view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 && eVar.e()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (oVar.h == z13 && (!z13 || z14)) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (z15) {
                    oVar.h = z13;
                    oVar.f15670g = true;
                    z11 = true;
                }
                if ((z13 || z15) && z11) {
                    z10 = true;
                    i10 = i12 + 1;
                    size = i11;
                }
            }
            z10 = z16;
            i10 = i12 + 1;
            size = i11;
        }
        boolean z17 = z10;
        if (z17) {
            aVar.f16919b = 0;
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                o oVar2 = (o) arrayList2.get(i13);
                if (oVar2.h && oVar2.f15666b.j()) {
                    RectF rectF6 = oVar2.f15669f;
                    aVar.a(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom);
                }
            }
            ni.b bVar = pVar.d;
            ni.a aVar2 = pVar.f15692y;
            bVar.getClass();
            if (aVar != aVar2) {
                aVar2.f16919b = 0;
                int i14 = aVar.f16919b;
                for (int i15 = 0; i15 < i14; i15++) {
                    RectF c10 = aVar.c(i15);
                    float f7 = c10.left;
                    float f10 = c10.top;
                    float f11 = c10.right;
                    float f12 = c10.bottom;
                    int i16 = 0;
                    while (i16 < aVar2.f16919b) {
                        RectF c11 = aVar2.c(i16);
                        float f13 = c11.left;
                        float f14 = c11.right;
                        ni.a aVar3 = aVar;
                        float f15 = bVar.f16921a;
                        if (f11 >= f13 ? f14 >= f7 || f7 - f14 <= f15 : f13 - f11 <= f15) {
                            float f16 = c11.top;
                            float f17 = c11.bottom;
                            float f18 = bVar.f16922b;
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
                int i17 = aVar2.f16919b;
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
        Trace.endSection();
        int i20 = pVar.f15687s;
        pVar.f15687s = 0;
        if (z17) {
            i20 |= 4;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int size3 = arrayList.size();
            for (int i21 = 0; i21 < size3; i21++) {
                ah.i iVar = (ah.i) arrayList.get(i21);
                if (iVar.f494e) {
                    iVar.f494e = false;
                    pVar.f15676g++;
                }
            }
        }
        long j3 = pVar.f15684p;
        long j10 = pVar.f15676g;
        if (j3 != j10) {
            pVar.f15684p = j10;
            i20 |= 8;
        }
        long j11 = pVar.f15683o;
        long j12 = pVar.f15675f;
        if (j11 != j12) {
            pVar.f15683o = j12;
            i20 |= 2;
        }
        long j13 = pVar.f15682n;
        long j14 = pVar.f15674e;
        if (j13 != j14) {
            pVar.f15682n = j14;
            i20 |= 1;
        }
        if (i20 != 0) {
            Trace.beginSection("G.Listeners");
            l lVar = pVar.f15671a;
            if (lVar != null) {
                lVar.k(i20);
            }
            Trace.endSection();
            boolean a2 = e0.a(i20, 4);
            boolean z18 = true;
            if (!e0.a(i20, 1) && !e0.a(i20, 2)) {
                z18 = false;
            }
            Trace.beginSection("G.UpdateDisplayLists");
            int size4 = arrayList2.size();
            for (int i22 = 0; i22 < size4; i22++) {
                o oVar3 = (o) arrayList2.get(i22);
                boolean z19 = oVar3.h;
                e eVar2 = oVar3.f15666b;
                if (z19 && (oVar3.f15670g || a2 || z18)) {
                    oVar3.f15670g = false;
                    if (eVar2.j()) {
                        eVar2.a();
                    } else {
                        eVar2.invalidateSelf();
                        oVar3.f15665a.invalidate();
                    }
                }
            }
            Trace.endSection();
        }
    }
}
