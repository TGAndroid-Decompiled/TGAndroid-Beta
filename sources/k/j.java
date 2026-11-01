package k;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m.p3;
import r0.k0;
import r0.l0;
import w7.q9;
import x7.g8;
import z7.ee;
import z7.fb;
import z7.gb;
import z7.ig;
import z7.jg;
import z7.qa;
import z7.ra;
import z7.ue;
import z7.va;
import z7.wf;
public final class j implements wf {
    public long f10515a;
    public boolean f10516b;
    public final Object f10517c;
    public Object d;
    public Object e;
    public final Object f10518f;

    public j(ub.d dVar, long j10, gb gbVar, boolean z10, ob.a aVar, jg jgVar) {
        this.f10517c = dVar;
        this.f10515a = j10;
        this.d = gbVar;
        this.f10516b = z10;
        this.e = aVar;
        this.f10518f = jgVar;
    }

    public void a() {
        if (!this.f10516b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f10517c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((k0) obj).b();
        }
        this.f10516b = false;
    }

    public void b() {
        View view;
        if (this.f10516b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f10517c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            k0 k0Var = (k0) obj;
            long j10 = this.f10515a;
            if (j10 >= 0) {
                k0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) k0Var.f46144a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((l0) this.e) != null) {
                k0Var.d((i) this.f10518f);
            }
            View view2 = (View) k0Var.f46144a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f10516b = true;
    }

    @Override
    public a5.a zza() {
        int i10;
        qa qaVar;
        ub.d dVar = (ub.d) this.f10517c;
        long j10 = this.f10515a;
        boolean z10 = this.f10516b;
        ob.a aVar = (ob.a) this.e;
        jg jgVar = (jg) this.f10518f;
        ?? obj = new Object();
        q5.d dVar2 = new q5.d(29, false);
        dVar2.f45498b = Long.valueOf(j10 & Long.MAX_VALUE);
        dVar2.f45499c = (gb) this.d;
        dVar2.d = Boolean.valueOf(z10);
        obj.f2777a = new va(dVar2);
        int i11 = aVar.e;
        ub.d.f50219l.getClass();
        int i12 = aVar.e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f14122a;
            n6.l.g(bitmap);
            i10 = bitmap.getAllocationByteCount();
        } else if (i12 != 17 && i12 != 842094169) {
            if (i12 != 35) {
                i10 = 0;
            } else {
                n6.l.g(null);
                throw null;
            }
        } else {
            n6.l.g(null);
            throw null;
        }
        g8 g8Var = new g8(5);
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
        g8Var.f53182b = qaVar;
        g8Var.f53183c = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f2778b = new ra(g8Var);
        obj.f2779c = dVar.e.a();
        if (jgVar != null) {
            List list = jgVar.d;
            z7.g gVar = z7.i.f54974b;
            Object[] array = list.toArray();
            int length = array.length;
            q9.a(length, array);
            obj.e = z7.i.q(length, array);
            List<ig> list2 = jgVar.f55005a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (ig igVar : list2) {
                    ji.f fVar = new ji.f(16, false);
                    fVar.f10442b = Integer.valueOf(igVar.f54992c & Integer.MAX_VALUE);
                    fVar.f10443c = Integer.valueOf(igVar.d & Integer.MAX_VALUE);
                    fVar.d = Integer.valueOf(igVar.e & Integer.MAX_VALUE);
                    fVar.e = Integer.valueOf(igVar.f54993f & Integer.MAX_VALUE);
                    ue ueVar = new ue(fVar);
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
        ?? obj2 = new Object();
        obj2.f12521c = fb.TYPE_THIN;
        obj2.f12522f = new ee(obj);
        return new a5.a((p3) obj2, 0);
    }

    public j() {
        this.f10515a = -1L;
        this.f10518f = new i(this);
        this.f10517c = new ArrayList();
    }
}
