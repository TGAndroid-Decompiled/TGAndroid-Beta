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
import v7.a6;
import w7.g9;
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
    public long f2577a;
    public boolean f2578b;
    public final Object f2579c;
    public Object d;
    public Object f2580e;
    public final Object f2581f;

    public d(f fVar, long j3, gb gbVar, boolean z10, vb.a aVar, ig igVar) {
        this.f2579c = fVar;
        this.f2577a = j3;
        this.d = gbVar;
        this.f2578b = z10;
        this.f2580e = aVar;
        this.f2581f = igVar;
    }

    public void a() {
        if (!this.f2578b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f2579c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l0) obj).b();
        }
        this.f2578b = false;
    }

    public void b() {
        View view;
        if (this.f2578b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f2579c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l0 l0Var = (l0) obj;
            long j3 = this.f2577a;
            if (j3 >= 0) {
                l0Var.c(j3);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) l0Var.f44709a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((m0) this.f2580e) != null) {
                l0Var.d((i) this.f2581f);
            }
            View view2 = (View) l0Var.f44709a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f2578b = true;
    }

    @Override
    public a5.a zza() {
        int i10;
        qa qaVar;
        f fVar = (f) this.f2579c;
        long j3 = this.f2577a;
        boolean z10 = this.f2578b;
        vb.a aVar = (vb.a) this.f2580e;
        ig igVar = (ig) this.f2581f;
        ?? obj = new Object();
        a6 a6Var = new a6(13, false);
        a6Var.f47378b = Long.valueOf(j3 & Long.MAX_VALUE);
        a6Var.f47379c = (gb) this.d;
        a6Var.d = Boolean.valueOf(z10);
        obj.f4796a = new va(a6Var);
        int i11 = aVar.f47771e;
        f.f2586l.getClass();
        int i12 = aVar.f47771e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f47768a;
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
        z0 z0Var = new z0(28, false);
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
        z0Var.f16703b = qaVar;
        z0Var.f16704c = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f4797b = new ra(z0Var);
        obj.f4798c = fVar.f2587e.a();
        if (igVar != null) {
            List list = igVar.d;
            g gVar = z7.i.f51101b;
            Object[] array = list.toArray();
            int length = array.length;
            g9.a(length, array);
            obj.f4799e = z7.i.r(length, array);
            List<hg> list2 = igVar.f51118a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (hg hgVar : list2) {
                    s sVar = new s(14, false);
                    sVar.f6391b = Integer.valueOf(hgVar.f51098c & Integer.MAX_VALUE);
                    sVar.f6392c = Integer.valueOf(hgVar.d & Integer.MAX_VALUE);
                    sVar.d = Integer.valueOf(hgVar.f51099e & Integer.MAX_VALUE);
                    sVar.f6393e = Integer.valueOf(hgVar.f51100f & Integer.MAX_VALUE);
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
        obj2.f15636c = fb.TYPE_THIN;
        obj2.f15638f = new ee(obj);
        return new a5.a((p3) obj2, 0);
    }

    public d() {
        this.f2577a = -1L;
        this.f2581f = new i(this);
        this.f2579c = new ArrayList();
    }
}
