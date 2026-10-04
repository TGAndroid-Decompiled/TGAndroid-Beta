package li;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.i6;
import w7.e0;
public final class h {
    public final m f15652a;

    public h(m mVar) {
        this.f15652a = mVar;
    }

    public final void a() {
        int i10;
        m mVar = this.f15652a;
        ArrayList arrayList = mVar.f15663c;
        ArrayList arrayList2 = mVar.f15683z;
        long j3 = mVar.f15675q;
        long j10 = m.B;
        if (j3 != j10) {
            mVar.f15675q = j10;
            i10 = 32;
        } else {
            i10 = 0;
        }
        long j11 = i6.Hl;
        if (mVar.f15674p != j11) {
            mVar.f15674p = j11;
            i10 |= 16;
        }
        if (i10 == 0) {
            return;
        }
        if (e0.a(i10, 16)) {
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                k kVar = (k) arrayList2.get(i11);
                kVar.f15653a.a(kVar.f15654b.f());
            }
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            l lVar = (l) arrayList.get(i12);
            if (e0.a(i10, 32)) {
                e eVar = lVar.f15656b;
                n nVar = m.A;
                if (!Objects.equals(eVar.f15647a, nVar)) {
                    eVar.f15647a = nVar;
                    eVar.g(nVar);
                }
            }
            if (e0.a(i10, 16)) {
                lVar.f15656b.k();
            }
            lVar.f15656b.invalidateSelf();
            lVar.f15655a.invalidate();
            lVar.f15660g = true;
        }
        mVar.f15676r |= i10;
    }

    public final void b() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        m mVar = this.f15652a;
        ArrayList arrayList = mVar.f15670l;
        Trace.beginSection("G.CheckPositions");
        Rect rect = mVar.f15678t;
        ni.a aVar = mVar.f15680w;
        ArrayList arrayList2 = mVar.f15663c;
        RectF rectF = mVar.f15677s;
        int width = mVar.f15669k.getWidth();
        int height = mVar.f15669k.getHeight();
        if (mVar.f15679u == width && mVar.v == height) {
            z10 = false;
        } else {
            mVar.f15679u = width;
            mVar.v = height;
            z10 = true;
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            l lVar = (l) arrayList2.get(i10);
            View view = lVar.f15655a;
            RectF rectF2 = lVar.f15659f;
            RectF rectF3 = lVar.d;
            RectF rectF4 = lVar.f15657c;
            boolean z16 = z10;
            RectF rectF5 = lVar.f15658e;
            int i11 = size;
            e eVar = lVar.f15656b;
            int i12 = i10;
            if (hh.k.c(view, mVar.f15669k, rectF)) {
                if (!rectF4.equals(rectF)) {
                    rectF4.set(rectF);
                    lVar.f15660g = true;
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
                    lVar.f15660g = true;
                    z11 = true;
                } else {
                    z12 = true;
                }
                rectF.offset(rectF4.left, rectF4.top);
                if (!rectF5.equals(rectF)) {
                    rectF5.set(rectF);
                    lVar.f15660g = z12;
                    z11 = true;
                }
                rectF.set(rectF5);
                rectF.inset(-eVar.c(), -eVar.d());
                if (!rectF2.equals(rectF)) {
                    rectF2.set(rectF);
                    lVar.f15660g = true;
                    z11 = true;
                }
                View view2 = lVar.f15655a;
                if (!rectF5.isEmpty() && view2.isAttachedToWindow() && rectF5.intersects(0.0f, 0.0f, width, height) && eVar.f15648b > 0 && view2.getVisibility() == 0 && view2.getAlpha() > 0.0f && view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 && eVar.e()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (lVar.h == z13 && (!z13 || z14)) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (z15) {
                    lVar.h = z13;
                    lVar.f15660g = true;
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
            aVar.f16909b = 0;
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                l lVar2 = (l) arrayList2.get(i13);
                if (lVar2.h && lVar2.f15656b.j()) {
                    RectF rectF6 = lVar2.f15659f;
                    aVar.a(rectF6.left, rectF6.top, rectF6.right, rectF6.bottom);
                }
            }
            ni.b bVar = mVar.d;
            ni.a aVar2 = mVar.f15681x;
            bVar.getClass();
            if (aVar != aVar2) {
                aVar2.f16909b = 0;
                int i14 = aVar.f16909b;
                for (int i15 = 0; i15 < i14; i15++) {
                    RectF c10 = aVar.c(i15);
                    float f7 = c10.left;
                    float f10 = c10.top;
                    float f11 = c10.right;
                    float f12 = c10.bottom;
                    int i16 = 0;
                    while (i16 < aVar2.f16909b) {
                        RectF c11 = aVar2.c(i16);
                        float f13 = c11.left;
                        float f14 = c11.right;
                        ni.a aVar3 = aVar;
                        float f15 = bVar.f16911a;
                        if (f11 >= f13 ? f14 >= f7 || f7 - f14 <= f15 : f13 - f11 <= f15) {
                            float f16 = c11.top;
                            float f17 = c11.bottom;
                            float f18 = bVar.f16912b;
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
                int i17 = aVar2.f16909b;
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
        int i20 = mVar.f15676r;
        mVar.f15676r = 0;
        if (z17) {
            i20 |= 4;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int size3 = arrayList.size();
            for (int i21 = 0; i21 < size3; i21++) {
                ah.i iVar = (ah.i) arrayList.get(i21);
                if (iVar.f494e) {
                    iVar.f494e = false;
                    mVar.f15666g++;
                }
            }
        }
        long j3 = mVar.f15673o;
        long j10 = mVar.f15666g;
        if (j3 != j10) {
            mVar.f15673o = j10;
            i20 |= 8;
        }
        long j11 = mVar.f15672n;
        long j12 = mVar.f15665f;
        if (j11 != j12) {
            mVar.f15672n = j12;
            i20 |= 2;
        }
        long j13 = mVar.f15671m;
        long j14 = mVar.f15664e;
        if (j13 != j14) {
            mVar.f15671m = j14;
            i20 |= 1;
        }
        if (i20 != 0) {
            Trace.beginSection("G.Listeners");
            i iVar2 = mVar.f15661a;
            if (iVar2 != null) {
                iVar2.k(i20);
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
                l lVar3 = (l) arrayList2.get(i22);
                boolean z19 = lVar3.h;
                e eVar2 = lVar3.f15656b;
                if (z19 && (lVar3.f15660g || a2 || z18)) {
                    lVar3.f15660g = false;
                    if (eVar2.j()) {
                        eVar2.a();
                    } else {
                        eVar2.invalidateSelf();
                        lVar3.f15655a.invalidate();
                    }
                }
            }
            Trace.endSection();
        }
    }
}
