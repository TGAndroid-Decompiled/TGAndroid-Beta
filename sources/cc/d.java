package cc;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import m.s3;
import n6.l;
import r0.l0;
import r0.m0;
import w7.e9;
import z7.fe;
import z7.g;
import z7.gb;
import z7.hb;
import z7.ig;
import z7.jg;
import z7.ra;
import z7.sa;
import z7.ue;
import z7.wa;
import z7.wf;
public final class d implements wf {
    public long f5087a;
    public boolean f5088b;
    public final Object f5089c;
    public Object d;
    public Object e;
    public final Object f5090f;

    public d(f fVar, long j10, hb hbVar, boolean z10, wb.a aVar, jg jgVar) {
        this.f5089c = fVar;
        this.f5087a = j10;
        this.d = hbVar;
        this.f5088b = z10;
        this.e = aVar;
        this.f5090f = jgVar;
    }

    public void a() {
        if (!this.f5088b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f5089c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l0) obj).b();
        }
        this.f5088b = false;
    }

    public void b() {
        View view;
        if (this.f5088b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f5089c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l0 l0Var = (l0) obj;
            long j10 = this.f5087a;
            if (j10 >= 0) {
                l0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) l0Var.f44839a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((m0) this.e) != null) {
                l0Var.d((i) this.f5090f);
            }
            View view2 = (View) l0Var.f44839a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f5088b = true;
    }

    @Override
    public a5.a zza() {
        int i10;
        ra raVar;
        f fVar = (f) this.f5089c;
        long j10 = this.f5087a;
        boolean z10 = this.f5088b;
        wb.a aVar = (wb.a) this.e;
        jg jgVar = (jg) this.f5090f;
        ?? obj = new Object();
        u2.c cVar = new u2.c(18, false);
        cVar.f47272b = Long.valueOf(j10 & Long.MAX_VALUE);
        cVar.f47273c = (hb) this.d;
        cVar.d = Boolean.valueOf(z10);
        obj.f6881b = new wa(cVar);
        int i11 = aVar.e;
        f.f5095l.getClass();
        int i12 = aVar.e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f48906a;
            l.h(bitmap);
            i10 = bitmap.getAllocationByteCount();
        } else if (i12 != 17 && i12 != 842094169) {
            if (i12 != 35) {
                i10 = 0;
            } else {
                l.h(null);
                throw null;
            }
        } else {
            l.h(null);
            throw null;
        }
        ?? obj2 = new Object();
        if (i11 != -1) {
            if (i11 != 35) {
                if (i11 != 842094169) {
                    if (i11 != 16) {
                        if (i11 != 17) {
                            raVar = ra.UNKNOWN_FORMAT;
                        } else {
                            raVar = ra.NV21;
                        }
                    } else {
                        raVar = ra.NV16;
                    }
                } else {
                    raVar = ra.YV12;
                }
            } else {
                raVar = ra.YUV_420_888;
            }
        } else {
            raVar = ra.BITMAP;
        }
        obj2.f51150a = raVar;
        obj2.f51151b = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f6882c = new sa(obj2);
        obj.f6880a = fVar.e.a();
        if (jgVar != null) {
            List list = jgVar.d;
            g gVar = z7.i.f50910b;
            Object[] array = list.toArray();
            int length = array.length;
            e9.a(length, array);
            obj.e = z7.i.q(length, array);
            List<ig> list2 = jgVar.f51076a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (ig igVar : list2) {
                    ?? obj3 = new Object();
                    obj3.f44763a = Integer.valueOf(igVar.f51058c & Integer.MAX_VALUE);
                    obj3.f44764b = Integer.valueOf(igVar.d & Integer.MAX_VALUE);
                    obj3.f44765c = Integer.valueOf(igVar.e & Integer.MAX_VALUE);
                    obj3.d = Integer.valueOf(igVar.f51059f & Integer.MAX_VALUE);
                    ue ueVar = new ue(obj3);
                    int i14 = i13 + 1;
                    int length2 = objArr.length;
                    if (length2 < i14) {
                        int i15 = length2 + (length2 >> 1) + 1;
                        if (i15 < i14) {
                            int highestOneBit = Integer.highestOneBit(i13);
                            i15 = highestOneBit + highestOneBit;
                        }
                        if (i15 < 0) {
                            i15 = Integer.MAX_VALUE;
                        }
                        objArr = Arrays.copyOf(objArr, i15);
                    }
                    objArr[i13] = ueVar;
                    i13 = i14;
                }
                obj.d = z7.i.q(i13, objArr);
            }
        }
        ?? obj4 = new Object();
        obj4.f16336c = gb.TYPE_THIN;
        obj4.f16337f = new fe(obj);
        return new a5.a((s3) obj4, 0);
    }

    public d() {
        this.f5087a = -1L;
        this.f5090f = new i(this);
        this.f5089c = new ArrayList();
    }
}
