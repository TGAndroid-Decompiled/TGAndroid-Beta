package bc;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.firebase.messaging.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import m.q3;
import n6.m;
import n7.z0;
import r0.l0;
import r0.m0;
import v7.k;
import w7.g9;
import z7.fb;
import z7.fe;
import z7.g;
import z7.gb;
import z7.ig;
import z7.jg;
import z7.qa;
import z7.ra;
import z7.ue;
import z7.va;
import z7.wf;
public final class d implements wf {
    public long f3849a;
    public boolean f3850b;
    public final Object f3851c;
    public Object d;
    public Object f3852e;
    public final Object f3853f;

    public d(f fVar, long j3, gb gbVar, boolean z10, vb.a aVar, jg jgVar) {
        this.f3851c = fVar;
        this.f3849a = j3;
        this.d = gbVar;
        this.f3850b = z10;
        this.f3852e = aVar;
        this.f3853f = jgVar;
    }

    public void a() {
        if (!this.f3850b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f3851c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l0) obj).b();
        }
        this.f3850b = false;
    }

    public void b() {
        View view;
        if (this.f3850b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f3851c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l0 l0Var = (l0) obj;
            long j3 = this.f3849a;
            if (j3 >= 0) {
                l0Var.c(j3);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) l0Var.f46868a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((m0) this.f3852e) != null) {
                l0Var.d((i) this.f3853f);
            }
            View view2 = (View) l0Var.f46868a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f3850b = true;
    }

    @Override
    public a5.a zza() {
        int i10;
        qa qaVar;
        f fVar = (f) this.f3851c;
        long j3 = this.f3849a;
        boolean z10 = this.f3850b;
        vb.a aVar = (vb.a) this.f3852e;
        jg jgVar = (jg) this.f3853f;
        ?? obj = new Object();
        k kVar = new k(17, false);
        kVar.f49333b = Long.valueOf(j3 & Long.MAX_VALUE);
        kVar.f49334c = (gb) this.d;
        kVar.d = Boolean.valueOf(z10);
        obj.f6064a = new va(kVar);
        int i11 = aVar.f49605e;
        f.f3858l.getClass();
        int i12 = aVar.f49605e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f49602a;
            m.h(bitmap);
            i10 = bitmap.getAllocationByteCount();
        } else if (i12 != 17 && i12 != 842094169) {
            if (i12 != 35) {
                i10 = 0;
            } else {
                m.h(null);
                throw null;
            }
        } else {
            m.h(null);
            throw null;
        }
        z0 z0Var = new z0(26, (byte) 0);
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
        z0Var.f16869b = qaVar;
        z0Var.f16870c = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f6065b = new ra(z0Var);
        obj.f6066c = fVar.f3859e.a();
        if (jgVar != null) {
            List list = jgVar.d;
            g gVar = z7.i.f53994b;
            Object[] array = list.toArray();
            int length = array.length;
            g9.a(length, array);
            obj.f6067e = z7.i.r(length, array);
            List<ig> list2 = jgVar.f54027a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (ig igVar : list2) {
                    s sVar = new s(14, false);
                    sVar.f7970b = Integer.valueOf(igVar.f54013c & Integer.MAX_VALUE);
                    sVar.f7971c = Integer.valueOf(igVar.d & Integer.MAX_VALUE);
                    sVar.d = Integer.valueOf(igVar.f54014e & Integer.MAX_VALUE);
                    sVar.f7972e = Integer.valueOf(igVar.f54015f & Integer.MAX_VALUE);
                    ue ueVar = new ue(sVar);
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
                obj.d = z7.i.r(i13, objArr);
            }
        }
        ?? obj2 = new Object();
        obj2.f15822c = fb.TYPE_THIN;
        obj2.f15824f = new fe(obj);
        return new a5.a((q3) obj2, 0);
    }

    public d() {
        this.f3849a = -1L;
        this.f3853f = new i(this);
        this.f3851c = new ArrayList();
    }
}
