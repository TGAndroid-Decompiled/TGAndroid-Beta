package bc;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.firebase.messaging.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import m.p3;
import n6.l;
import n7.a1;
import r0.l0;
import r0.m0;
import v7.r1;
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
    public long f3493a;
    public boolean f3494b;
    public final Object f3495c;
    public Object d;
    public Object e;
    public final Object f3496f;

    public d(f fVar, long j3, gb gbVar, boolean z10, vb.a aVar, ig igVar) {
        this.f3495c = fVar;
        this.f3493a = j3;
        this.d = gbVar;
        this.f3494b = z10;
        this.e = aVar;
        this.f3496f = igVar;
    }

    public void a() {
        if (!this.f3494b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f3495c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l0) obj).b();
        }
        this.f3494b = false;
    }

    public void b() {
        View view;
        if (this.f3494b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f3495c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l0 l0Var = (l0) obj;
            long j3 = this.f3493a;
            if (j3 >= 0) {
                l0Var.c(j3);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) l0Var.f41849a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((m0) this.e) != null) {
                l0Var.d((i) this.f3496f);
            }
            View view2 = (View) l0Var.f41849a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f3494b = true;
    }

    @Override
    public a5.a zza() {
        int i10;
        qa qaVar;
        f fVar = (f) this.f3495c;
        long j3 = this.f3493a;
        boolean z10 = this.f3494b;
        vb.a aVar = (vb.a) this.e;
        ig igVar = (ig) this.f3496f;
        ?? obj = new Object();
        r1 r1Var = new r1(15, false);
        r1Var.f44074b = Long.valueOf(j3 & Long.MAX_VALUE);
        r1Var.d = (gb) this.d;
        r1Var.f44075c = Boolean.valueOf(z10);
        obj.f4257a = new va(r1Var);
        int i11 = aVar.e;
        f.f3501l.getClass();
        int i12 = aVar.e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f44277a;
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
        a1 a1Var = new a1(28);
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
        a1Var.f15106b = qaVar;
        a1Var.f15107c = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f4258b = new ra(a1Var);
        obj.f4259c = fVar.e.a();
        if (igVar != null) {
            List list = igVar.d;
            g gVar = z7.i.f48477b;
            Object[] array = list.toArray();
            int length = array.length;
            g9.a(length, array);
            obj.e = z7.i.r(length, array);
            List<hg> list2 = igVar.f48493a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (hg hgVar : list2) {
                    t tVar = new t(14, false);
                    tVar.f7349b = Integer.valueOf(hgVar.f48475c & Integer.MAX_VALUE);
                    tVar.f7350c = Integer.valueOf(hgVar.d & Integer.MAX_VALUE);
                    tVar.d = Integer.valueOf(hgVar.e & Integer.MAX_VALUE);
                    tVar.e = Integer.valueOf(hgVar.f48476f & Integer.MAX_VALUE);
                    te teVar = new te(tVar);
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
        obj2.f14282c = fb.TYPE_THIN;
        obj2.f14283f = new ee(obj);
        return new a5.a((p3) obj2, 0);
    }

    public d() {
        this.f3493a = -1L;
        this.f3496f = new i(this);
        this.f3495c = new ArrayList();
    }
}
