package cc;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import m.t3;
import n6.l;
import r0.l0;
import r0.m0;
import w7.e9;
import z7.ee;
import z7.fb;
import z7.g;
import z7.gb;
import z7.ig;
import z7.jg;
import z7.qa;
import z7.ra;
import z7.te;
import z7.va;
import z7.vf;
public final class d implements vf {
    public long f4719a;
    public boolean f4720b;
    public final Object f4721c;
    public Object d;
    public Object e;
    public final Object f4722f;

    public d(f fVar, long j10, gb gbVar, boolean z10, wb.a aVar, jg jgVar) {
        this.f4721c = fVar;
        this.f4719a = j10;
        this.d = gbVar;
        this.f4720b = z10;
        this.e = aVar;
        this.f4722f = jgVar;
    }

    public void a() {
        if (!this.f4720b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f4721c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l0) obj).b();
        }
        this.f4720b = false;
    }

    public void b() {
        View view;
        if (this.f4720b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f4721c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l0 l0Var = (l0) obj;
            long j10 = this.f4719a;
            if (j10 >= 0) {
                l0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) l0Var.f43495a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((m0) this.e) != null) {
                l0Var.d((i) this.f4722f);
            }
            View view2 = (View) l0Var.f43495a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f4720b = true;
    }

    @Override
    public a5.a zza() {
        int i10;
        qa qaVar;
        f fVar = (f) this.f4721c;
        long j10 = this.f4719a;
        boolean z10 = this.f4720b;
        wb.a aVar = (wb.a) this.e;
        jg jgVar = (jg) this.f4722f;
        ?? obj = new Object();
        u2.c cVar = new u2.c(18, false);
        cVar.f45875b = Long.valueOf(j10 & Long.MAX_VALUE);
        cVar.f45876c = (gb) this.d;
        cVar.d = Boolean.valueOf(z10);
        obj.f5429b = new va(cVar);
        int i11 = aVar.e;
        f.f4727l.getClass();
        int i12 = aVar.e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f47510a;
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
        n3.b bVar = new n3.b(29, false);
        if (i11 != -1) {
            if (i11 != 35) {
                if (i11 != 842094169) {
                    if (i11 != 16) {
                        if (i11 != 17) {
                            qaVar = qa.UNKNOWN_FORMAT;
                        } else {
                            qaVar = qa.NV21;
                        }
                    } else {
                        qaVar = qa.NV16;
                    }
                } else {
                    qaVar = qa.YV12;
                }
            } else {
                qaVar = qa.YUV_420_888;
            }
        } else {
            qaVar = qa.BITMAP;
        }
        bVar.f15703b = qaVar;
        bVar.f15704c = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f5430c = new ra(bVar);
        obj.f5428a = fVar.e.a();
        if (jgVar != null) {
            List list = jgVar.d;
            g gVar = z7.i.f49652b;
            Object[] array = list.toArray();
            int length = array.length;
            e9.a(length, array);
            obj.e = z7.i.q(length, array);
            List<ig> list2 = jgVar.f49683a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (ig igVar : list2) {
                    ?? obj2 = new Object();
                    obj2.f42944a = Integer.valueOf(igVar.f49670c & Integer.MAX_VALUE);
                    obj2.f42945b = Integer.valueOf(igVar.d & Integer.MAX_VALUE);
                    obj2.f42946c = Integer.valueOf(igVar.e & Integer.MAX_VALUE);
                    obj2.d = Integer.valueOf(igVar.f49671f & Integer.MAX_VALUE);
                    te teVar = new te(obj2);
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
                    objArr[i13] = teVar;
                    i13 = i14;
                }
                obj.d = z7.i.q(i13, objArr);
            }
        }
        ?? obj3 = new Object();
        obj3.f14985c = fb.TYPE_THIN;
        obj3.f14986f = new ee(obj);
        return new a5.a((t3) obj3, 0);
    }

    public d() {
        this.f4719a = -1L;
        this.f4722f = new i(this);
        this.f4721c = new ArrayList();
    }
}
