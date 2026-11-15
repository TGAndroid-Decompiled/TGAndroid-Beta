package ac;

import a8.d8;
import a8.r7;
import a8.xa;
import ab.c0;
import android.graphics.Bitmap;
import android.support.v4.media.session.a0;
import android.view.View;
import android.view.animation.Interpolator;
import c8.ce;
import c8.db;
import c8.eb;
import c8.fg;
import c8.g;
import c8.gg;
import c8.pa;
import c8.qa;
import c8.re;
import c8.ta;
import c8.tf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import q6.m;
import r0.l0;
import r0.m0;
public final class d implements tf {
    public long f1016a;
    public boolean f1017b;
    public final Object f1018c;
    public Object d;
    public Object f1019e;
    public final Object f1020f;

    public d(f fVar, long j3, eb ebVar, boolean z10, ub.a aVar, gg ggVar) {
        this.f1018c = fVar;
        this.f1016a = j3;
        this.d = ebVar;
        this.f1017b = z10;
        this.f1019e = aVar;
        this.f1020f = ggVar;
    }

    public void a() {
        if (!this.f1017b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f1018c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((l0) obj).b();
        }
        this.f1017b = false;
    }

    public void b() {
        View view;
        if (this.f1017b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f1018c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            l0 l0Var = (l0) obj;
            long j3 = this.f1016a;
            if (j3 >= 0) {
                l0Var.c(j3);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) l0Var.f55683a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((m0) this.f1019e) != null) {
                l0Var.d((i) this.f1020f);
            }
            View view2 = (View) l0Var.f55683a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f1017b = true;
    }

    @Override
    public xa zza() {
        int i7;
        pa paVar;
        f fVar = (f) this.f1018c;
        long j3 = this.f1016a;
        boolean z10 = this.f1017b;
        ub.a aVar = (ub.a) this.f1019e;
        gg ggVar = (gg) this.f1020f;
        r7 r7Var = new r7(3, (byte) 0);
        a0 a0Var = new a0(17, false);
        a0Var.f1713b = Long.valueOf(j3 & Long.MAX_VALUE);
        a0Var.f1714c = (eb) this.d;
        a0Var.d = Boolean.valueOf(z10);
        r7Var.f617b = new ta(a0Var);
        int i10 = aVar.f58000e;
        f.f1025l.getClass();
        int i11 = aVar.f58000e;
        if (i11 == -1) {
            Bitmap bitmap = aVar.f57997a;
            m.g(bitmap);
            i7 = bitmap.getAllocationByteCount();
        } else if (i11 != 17 && i11 != 842094169) {
            if (i11 != 35) {
                i7 = 0;
            } else {
                m.g(null);
                throw null;
            }
        } else {
            m.g(null);
            throw null;
        }
        wf.b bVar = new wf.b(7, false);
        if (i10 != -1) {
            if (i10 != 35) {
                if (i10 != 842094169) {
                    if (i10 != 16) {
                        if (i10 != 17) {
                            paVar = pa.UNKNOWN_FORMAT;
                        } else {
                            paVar = pa.NV21;
                        }
                    } else {
                        paVar = pa.NV16;
                    }
                } else {
                    paVar = pa.YV12;
                }
            } else {
                paVar = pa.YUV_420_888;
            }
        } else {
            paVar = pa.BITMAP;
        }
        bVar.f59107b = paVar;
        bVar.f59108c = Integer.valueOf(i7 & Integer.MAX_VALUE);
        r7Var.f618c = new qa(bVar);
        r7Var.d = fVar.f1026e.a();
        if (ggVar != null) {
            List list = ggVar.d;
            g gVar = c8.i.f4541b;
            Object[] array = list.toArray();
            int length = array.length;
            d8.a(length, array);
            r7Var.f620f = c8.i.m(length, array);
            List<fg> list2 = ggVar.f4518a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i12 = 0;
                for (fg fgVar : list2) {
                    c0 c0Var = new c0(2);
                    c0Var.f909b = Integer.valueOf(fgVar.f4499c & Integer.MAX_VALUE);
                    c0Var.f910c = Integer.valueOf(fgVar.d & Integer.MAX_VALUE);
                    c0Var.d = Integer.valueOf(fgVar.f4500e & Integer.MAX_VALUE);
                    c0Var.f911e = Integer.valueOf(fgVar.f4501f & Integer.MAX_VALUE);
                    re reVar = new re(c0Var);
                    int i13 = i12 + 1;
                    int length2 = objArr.length;
                    if (length2 < i13) {
                        int i14 = length2 + (length2 >> 1) + 1;
                        if (i14 < i13) {
                            int highestOneBit = Integer.highestOneBit(i12);
                            i14 = highestOneBit + highestOneBit;
                        }
                        if (i14 < 0) {
                            i14 = Integer.MAX_VALUE;
                        }
                        objArr = Arrays.copyOf(objArr, i14);
                    }
                    objArr[i12] = reVar;
                    i12 = i13;
                }
                r7Var.f619e = c8.i.m(i12, objArr);
            }
        }
        ga.d dVar = new ga.d(1);
        dVar.d = db.TYPE_THIN;
        dVar.h = new ce(r7Var);
        return new xa(dVar, 0);
    }

    public d() {
        this.f1016a = -1L;
        this.f1020f = new i(this);
        this.f1018c = new ArrayList();
    }
}
