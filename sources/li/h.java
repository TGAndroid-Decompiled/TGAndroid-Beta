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
    public final n f15654a;

    public h(n nVar) {
        this.f15654a = nVar;
    }

    public final void a() {
        int i10;
        n nVar = this.f15654a;
        ArrayList arrayList = nVar.f15668c;
        ArrayList arrayList2 = nVar.A;
        long j3 = nVar.f15681r;
        long j10 = n.C;
        if (j3 != j10) {
            nVar.f15681r = j10;
            i10 = 32;
        } else {
            i10 = 0;
        }
        long j11 = i6.Hl;
        if (nVar.f15680q != j11) {
            nVar.f15680q = j11;
            i10 |= 16;
        }
        Iterator it = nVar.f15675l.iterator();
        while (it.hasNext()) {
            if (((zl0) it.next()).b0()) {
                nVar.f15671g++;
            }
        }
        if (i10 == 0) {
            return;
        }
        if (e0.a(i10, 16)) {
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                l lVar = (l) arrayList2.get(i11);
                lVar.f15658a.a(lVar.f15659b.f());
            }
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            m mVar = (m) arrayList.get(i12);
            if (e0.a(i10, 32)) {
                e eVar = mVar.f15661b;
                o oVar = n.B;
                if (!Objects.equals(eVar.f15649a, oVar)) {
                    eVar.f15649a = oVar;
                    eVar.g(oVar);
                }
            }
            if (e0.a(i10, 16)) {
                mVar.f15661b.k();
            }
            mVar.f15661b.invalidateSelf();
            mVar.f15660a.invalidate();
            mVar.f15665g = true;
        }
        nVar.f15682s |= i10;
    }

    public final void b() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        n nVar = this.f15654a;
        ArrayList arrayList = nVar.f15676m;
        Trace.beginSection("G.CheckPositions");
        Rect rect = nVar.f15684u;
        ni.a aVar = nVar.f15686x;
        ArrayList arrayList2 = nVar.f15668c;
        RectF rectF = nVar.f15683t;
        int width = nVar.f15674k.getWidth();
        int height = nVar.f15674k.getHeight();
        if (nVar.v == width && nVar.f15685w == height) {
            z10 = false;
        } else {
            nVar.v = width;
            nVar.f15685w = height;
            z10 = true;
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            m mVar = (m) arrayList2.get(i10);
            View view = mVar.f15660a;
            RectF rectF2 = mVar.f15664f;
            RectF rectF3 = mVar.d;
            RectF rectF4 = mVar.f15662c;
            boolean z16 = z10;
            RectF rectF5 = mVar.f15663e;
            int i11 = size;
            e eVar = mVar.f15661b;
            int i12 = i10;
            if (hh.k.c(view, nVar.f15674k, rectF)) {
                if (!rectF4.equals(rectF)) {
                    rectF4.set(rectF);
                    mVar.f15665g = true;
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
                    mVar.f15665g = true;
                    z11 = true;
                } else {
                    z12 = true;
                }
                rectF.offset(rectF4.left, rectF4.top);
                if (!rectF5.equals(rectF)) {
                    rectF5.set(rectF);
                    mVar.f15665g = z12;
                    z11 = true;
                }
                rectF.set(rectF5);
                rectF.inset(-eVar.c(), -eVar.d());
                if (!rectF2.equals(rectF)) {
                    rectF2.set(rectF);
                    mVar.f15665g = true;
                    z11 = true;
                }
                View view2 = mVar.f15660a;
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
                if (mVar.h == z13 && (!z13 || z14)) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (z15) {
                    mVar.h = z13;
                    mVar.f15665g = true;
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
            aVar.f16914b = 0;
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                m mVar2 = (m) arrayList2.get(i13);
                if (mVar2.h && mVar2.f15661b.j()) {
                    RectF rectF6 = mVar2.f15664f;
                    aVar.a(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom);
                }
            }
            ni.b bVar = nVar.d;
            ni.a aVar2 = nVar.f15687y;
            bVar.getClass();
            if (aVar != aVar2) {
                aVar2.f16914b = 0;
                int i14 = aVar.f16914b;
                for (int i15 = 0; i15 < i14; i15++) {
                    RectF c10 = aVar.c(i15);
                    float f7 = c10.left;
                    float f10 = c10.top;
                    float f11 = c10.right;
                    float f12 = c10.bottom;
                    int i16 = 0;
                    while (i16 < aVar2.f16914b) {
                        RectF c11 = aVar2.c(i16);
                        float f13 = c11.left;
                        float f14 = c11.right;
                        ni.a aVar3 = aVar;
                        float f15 = bVar.f16916a;
                        if (f11 >= f13 ? f14 >= f7 || f7 - f14 <= f15 : f13 - f11 <= f15) {
                            float f16 = c11.top;
                            float f17 = c11.bottom;
                            float f18 = bVar.f16917b;
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
                int i17 = aVar2.f16914b;
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
        int i20 = nVar.f15682s;
        nVar.f15682s = 0;
        if (z17) {
            i20 |= 4;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int size3 = arrayList.size();
            for (int i21 = 0; i21 < size3; i21++) {
                ah.i iVar = (ah.i) arrayList.get(i21);
                if (iVar.f494e) {
                    iVar.f494e = false;
                    nVar.f15671g++;
                }
            }
        }
        long j3 = nVar.f15679p;
        long j10 = nVar.f15671g;
        if (j3 != j10) {
            nVar.f15679p = j10;
            i20 |= 8;
        }
        long j11 = nVar.f15678o;
        long j12 = nVar.f15670f;
        if (j11 != j12) {
            nVar.f15678o = j12;
            i20 |= 2;
        }
        long j13 = nVar.f15677n;
        long j14 = nVar.f15669e;
        if (j13 != j14) {
            nVar.f15677n = j14;
            i20 |= 1;
        }
        if (i20 != 0) {
            Trace.beginSection("G.Listeners");
            j jVar = nVar.f15666a;
            if (jVar != null) {
                jVar.k(i20);
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
                m mVar3 = (m) arrayList2.get(i22);
                boolean z19 = mVar3.h;
                e eVar2 = mVar3.f15661b;
                if (z19 && (mVar3.f15665g || a2 || z18)) {
                    mVar3.f15665g = false;
                    if (eVar2.j()) {
                        eVar2.a();
                    } else {
                        eVar2.invalidateSelf();
                        mVar3.f15660a.invalidate();
                    }
                }
            }
            Trace.endSection();
        }
    }
}
