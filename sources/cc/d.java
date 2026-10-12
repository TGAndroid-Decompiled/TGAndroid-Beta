package cc;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import m.q3;
import n6.l;
import n6.o;
import r0.m0;
import r0.n0;
import w7.e9;
import z7.ee;
import z7.fb;
import z7.g;
import z7.gb;
import z7.hg;
import z7.ig;
import z7.qa;
import z7.ra;
import z7.te;
import z7.va;
import z7.vf;
public final class d implements vf {
    public long f4716a;
    public boolean f4717b;
    public final Object f4718c;
    public Object d;
    public Object e;
    public final Object f4719f;

    public d(f fVar, long j10, gb gbVar, boolean z10, wb.a aVar, ig igVar) {
        this.f4718c = fVar;
        this.f4716a = j10;
        this.d = gbVar;
        this.f4717b = z10;
        this.e = aVar;
        this.f4719f = igVar;
    }

    public void a() {
        if (!this.f4717b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f4718c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m0) obj).b();
        }
        this.f4717b = false;
    }

    public void b() {
        View view;
        if (this.f4717b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f4718c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m0 m0Var = (m0) obj;
            long j10 = this.f4716a;
            if (j10 >= 0) {
                m0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) m0Var.f43742a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((n0) this.e) != null) {
                m0Var.d((i) this.f4719f);
            }
            View view2 = (View) m0Var.f43742a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f4717b = true;
    }

    @Override
    public a5.a zza() {
        int i10;
        qa qaVar;
        f fVar = (f) this.f4718c;
        long j10 = this.f4716a;
        boolean z10 = this.f4717b;
        wb.a aVar = (wb.a) this.e;
        ig igVar = (ig) this.f4719f;
        ?? obj = new Object();
        u2.c cVar = new u2.c(18, false);
        cVar.f45875b = Long.valueOf(j10 & Long.MAX_VALUE);
        cVar.f45876c = (gb) this.d;
        cVar.d = Boolean.valueOf(z10);
        obj.f5426b = new va(cVar);
        int i11 = aVar.e;
        f.f4724l.getClass();
        int i12 = aVar.e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f47511a;
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
        o oVar = new o(28, false);
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
        oVar.f16131b = qaVar;
        oVar.f16132c = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f5427c = new ra(oVar);
        obj.f5425a = fVar.e.a();
        if (igVar != null) {
            List list = igVar.d;
            g gVar = z7.i.f49654b;
            Object[] array = list.toArray();
            int length = array.length;
            e9.a(length, array);
            obj.e = z7.i.q(length, array);
            List<hg> list2 = igVar.f49670a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (hg hgVar : list2) {
                    ?? obj2 = new Object();
                    obj2.f43662a = Integer.valueOf(hgVar.f49652c & Integer.MAX_VALUE);
                    obj2.f43663b = Integer.valueOf(hgVar.d & Integer.MAX_VALUE);
                    obj2.f43664c = Integer.valueOf(hgVar.e & Integer.MAX_VALUE);
                    obj2.d = Integer.valueOf(hgVar.f49653f & Integer.MAX_VALUE);
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
        obj3.f15221c = fb.TYPE_THIN;
        obj3.f15222f = new ee(obj);
        return new a5.a((q3) obj3, 0);
    }

    public d() {
        this.f4716a = -1L;
        this.f4719f = new i(this);
        this.f4718c = new ArrayList();
    }
}
