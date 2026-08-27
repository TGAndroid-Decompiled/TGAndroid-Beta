package k;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.firebase.messaging.t;
import g7.v8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k7.ee;
import k7.fb;
import k7.gb;
import k7.hg;
import k7.ig;
import k7.qa;
import k7.ra;
import k7.te;
import k7.va;
import k7.vf;
import m.t3;
import r0.m0;
import r0.n0;

public final class j implements vf {

    public long f14251a;

    public boolean f14252b;

    public final Object f14253c;
    public Object d;

    public Object f14254e;

    public final Object f14255f;

    public j(kb.e eVar, long j10, gb gbVar, boolean z10, eb.a aVar, ig igVar) {
        this.f14253c = eVar;
        this.f14251a = j10;
        this.d = gbVar;
        this.f14252b = z10;
        this.f14254e = aVar;
        this.f14255f = igVar;
    }

    public void a() {
        if (this.f14252b) {
            ArrayList arrayList = (ArrayList) this.f14253c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((m0) obj).b();
            }
            this.f14252b = false;
        }
    }

    public void b() {
        View view;
        if (this.f14252b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f14253c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m0 m0Var = (m0) obj;
            long j10 = this.f14251a;
            if (j10 >= 0) {
                m0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) m0Var.f46617a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((n0) this.f14254e) != null) {
                m0Var.d((i) this.f14255f);
            }
            View view2 = (View) m0Var.f46617a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f14252b = true;
    }

    @Override
    public b6.a zza() {
        int allocationByteCount;
        qa qaVar;
        kb.e eVar = (kb.e) this.f14253c;
        long j10 = this.f14251a;
        gb gbVar = (gb) this.d;
        boolean z10 = this.f14252b;
        eb.a aVar = (eb.a) this.f14254e;
        ig igVar = (ig) this.f14255f;
        af.h hVar = new af.h();
        boolean z11 = false;
        j9.a aVar2 = new j9.a(5, z11);
        aVar2.f12863b = Long.valueOf(j10 & Long.MAX_VALUE);
        aVar2.f12864c = gbVar;
        aVar2.d = Boolean.valueOf(z10);
        hVar.f274a = new va(aVar2);
        int i10 = aVar.f5366e;
        kb.e.f15149l.getClass();
        int i11 = aVar.f5366e;
        int i12 = 17;
        if (i11 == -1) {
            Bitmap bitmap = aVar.f5363a;
            y5.l.h(bitmap);
            allocationByteCount = bitmap.getAllocationByteCount();
        } else {
            if (i11 == 17 || i11 == 842094169) {
                y5.l.h(null);
                throw null;
            }
            if (i11 == 35) {
                y5.l.h(null);
                throw null;
            }
            allocationByteCount = 0;
        }
        g5.b bVar = new g5.b(12);
        if (i10 == -1) {
            qaVar = qa.BITMAP;
        } else if (i10 == 35) {
            qaVar = qa.YUV_420_888;
        } else if (i10 == 842094169) {
            qaVar = qa.YV12;
        } else if (i10 != 16) {
            qaVar = i10 != 17 ? qa.UNKNOWN_FORMAT : qa.NV21;
        } else {
            qaVar = qa.NV16;
        }
        bVar.f6389b = qaVar;
        bVar.f6390c = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
        hVar.f275b = new ra(bVar);
        hVar.f276c = eVar.f15150e.a();
        if (igVar != null) {
            List list = igVar.d;
            k7.g gVar = k7.i.f14815b;
            Object[] array = list.toArray();
            int length = array.length;
            v8.a(length, array);
            hVar.f277e = k7.i.r(length, array);
            List<hg> list2 = igVar.f14832a;
            if (!list2.isEmpty()) {
                Object[] objArrCopyOf = new Object[4];
                int i13 = 0;
                for (hg hgVar : list2) {
                    t tVar = new t(i12, z11);
                    tVar.f4619b = Integer.valueOf(hgVar.f14812c & Integer.MAX_VALUE);
                    tVar.f4620c = Integer.valueOf(hgVar.d & Integer.MAX_VALUE);
                    tVar.d = Integer.valueOf(hgVar.f14813e & Integer.MAX_VALUE);
                    tVar.f4621e = Integer.valueOf(hgVar.f14814f & Integer.MAX_VALUE);
                    te teVar = new te(tVar);
                    int i14 = i13 + 1;
                    int length2 = objArrCopyOf.length;
                    if (length2 < i14) {
                        int i15 = length2 + (length2 >> 1) + 1;
                        if (i15 < i14) {
                            int iHighestOneBit = Integer.highestOneBit(i13);
                            i15 = iHighestOneBit + iHighestOneBit;
                        }
                        if (i15 < 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i15);
                    }
                    objArrCopyOf[i13] = teVar;
                    i13 = i14;
                }
                hVar.d = k7.i.r(i13, objArrCopyOf);
            }
        }
        t3 t3Var = new t3();
        t3Var.f17475c = fb.TYPE_THIN;
        t3Var.f17477f = new ee(hVar);
        return new b6.a(t3Var, 0);
    }

    public j() {
        this.f14251a = -1L;
        this.f14255f = new i(this);
        this.f14253c = new ArrayList();
    }
}
