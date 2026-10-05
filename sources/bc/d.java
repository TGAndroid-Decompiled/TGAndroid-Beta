package bc;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.firebase.messaging.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import m.p3;
import n6.l;
import n7.z0;
import r0.l0;
import r0.m0;
import v7.k;
import w7.m9;
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
    public long f3770a;
    public boolean f3771b;
    public final Object f3772c;
    public Object d;
    public Object f3773e;
    public final Object f3774f;

    public d(f fVar, long j3, gb gbVar, boolean z10, vb.a aVar, ig igVar) {
        this.f3772c = fVar;
        this.f3770a = j3;
        this.d = gbVar;
        this.f3771b = z10;
        this.f3773e = aVar;
        this.f3774f = igVar;
    }

    public void a() {
        if (!this.f3771b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f3772c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l0) obj).b();
        }
        this.f3771b = false;
    }

    public void b() {
        View view;
        if (this.f3771b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f3772c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l0 l0Var = (l0) obj;
            long j3 = this.f3770a;
            if (j3 >= 0) {
                l0Var.c(j3);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) l0Var.f45622a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((m0) this.f3773e) != null) {
                l0Var.d((i) this.f3774f);
            }
            View view2 = (View) l0Var.f45622a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f3771b = true;
    }

    @Override
    public a5.a zza() {
        int i10;
        qa qaVar;
        f fVar = (f) this.f3772c;
        long j3 = this.f3770a;
        boolean z10 = this.f3771b;
        vb.a aVar = (vb.a) this.f3773e;
        ig igVar = (ig) this.f3774f;
        ?? obj = new Object();
        k kVar = new k(16, false);
        kVar.f47993b = Long.valueOf(j3 & Long.MAX_VALUE);
        kVar.f47994c = (gb) this.d;
        kVar.d = Boolean.valueOf(z10);
        obj.f4603a = new va(kVar);
        int i11 = aVar.f48266e;
        f.f3779l.getClass();
        int i12 = aVar.f48266e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f48263a;
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
        z0 z0Var = new z0(28);
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
        z0Var.f16856b = qaVar;
        z0Var.f16857c = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f4604b = new ra(z0Var);
        obj.f4605c = fVar.f3780e.a();
        if (igVar != null) {
            List list = igVar.d;
            g gVar = z7.i.f52800b;
            Object[] array = list.toArray();
            int length = array.length;
            m9.a(length, array);
            obj.f4606e = z7.i.r(length, array);
            List<hg> list2 = igVar.f52817a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (hg hgVar : list2) {
                    s sVar = new s(14, false);
                    sVar.f7922b = Integer.valueOf(hgVar.f52797c & Integer.MAX_VALUE);
                    sVar.f7923c = Integer.valueOf(hgVar.d & Integer.MAX_VALUE);
                    sVar.d = Integer.valueOf(hgVar.f52798e & Integer.MAX_VALUE);
                    sVar.f7924e = Integer.valueOf(hgVar.f52799f & Integer.MAX_VALUE);
                    te teVar = new te(sVar);
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
                obj.d = z7.i.r(i13, objArr);
            }
        }
        ?? obj2 = new Object();
        obj2.f15861c = fb.TYPE_THIN;
        obj2.f15863f = new ee(obj);
        return new a5.a((p3) obj2, 0);
    }

    public d() {
        this.f3770a = -1L;
        this.f3774f = new i(this);
        this.f3772c = new ArrayList();
    }
}
