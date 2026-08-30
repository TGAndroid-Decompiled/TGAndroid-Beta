package k;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import b4.e0;
import com.google.firebase.messaging.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k7.b0;
import l7.w0;
import m.s3;
import n7.fe;
import n7.gb;
import n7.hb;
import n7.ig;
import n7.jg;
import n7.qa;
import n7.ra;
import n7.sa;
import n7.ue;
import n7.wa;
import n7.wf;
import r0.m0;
import r0.n0;
public final class j implements wf {
    public long f9543a;
    public boolean f9544b;
    public final Object f9545c;
    public Object d;
    public Object e;
    public final Object f9546f;

    public j(nb.e eVar, long j10, hb hbVar, boolean z4, hb.a aVar, jg jgVar) {
        this.f9545c = eVar;
        this.f9543a = j10;
        this.d = hbVar;
        this.f9544b = z4;
        this.e = aVar;
        this.f9546f = jgVar;
    }

    public void a() {
        if (!this.f9544b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f9545c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m0) obj).b();
        }
        this.f9544b = false;
    }

    public void b() {
        View view;
        if (this.f9544b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f9545c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m0 m0Var = (m0) obj;
            long j10 = this.f9543a;
            if (j10 >= 0) {
                m0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) m0Var.f43128a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((n0) this.e) != null) {
                m0Var.d((i) this.f9546f);
            }
            View view2 = (View) m0Var.f43128a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f9544b = true;
    }

    @Override
    public e0 zza() {
        int i10;
        ra raVar;
        nb.e eVar = (nb.e) this.f9545c;
        long j10 = this.f9543a;
        boolean z4 = this.f9544b;
        hb.a aVar = (hb.a) this.e;
        jg jgVar = (jg) this.f9546f;
        ?? obj = new Object();
        w0 w0Var = new w0(10, false);
        w0Var.f11676b = Long.valueOf(j10 & Long.MAX_VALUE);
        w0Var.f11677c = (hb) this.d;
        w0Var.d = Boolean.valueOf(z4);
        obj.f2129a = new wa(w0Var);
        int i11 = aVar.e;
        nb.e.f14907l.getClass();
        int i12 = aVar.e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f7051a;
            b6.m.h(bitmap);
            i10 = bitmap.getAllocationByteCount();
        } else if (i12 != 17 && i12 != 842094169) {
            if (i12 != 35) {
                i10 = 0;
            } else {
                b6.m.h(null);
                throw null;
            }
        } else {
            b6.m.h(null);
            throw null;
        }
        qa qaVar = new qa(0);
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
        qaVar.f14702b = raVar;
        qaVar.f14703c = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f2130b = new sa(qaVar);
        obj.f2131c = eVar.e.a();
        if (jgVar != null) {
            List list = jgVar.d;
            n7.g gVar = n7.i.f14461b;
            Object[] array = list.toArray();
            int length = array.length;
            b0.a(length, array);
            obj.e = n7.i.r(length, array);
            List<ig> list2 = jgVar.f14627a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (ig igVar : list2) {
                    r rVar = new r(17, false);
                    rVar.f4028b = Integer.valueOf(igVar.f14609c & Integer.MAX_VALUE);
                    rVar.f4029c = Integer.valueOf(igVar.d & Integer.MAX_VALUE);
                    rVar.d = Integer.valueOf(igVar.e & Integer.MAX_VALUE);
                    rVar.e = Integer.valueOf(igVar.f14610f & Integer.MAX_VALUE);
                    ue ueVar = new ue(rVar);
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
                obj.d = n7.i.r(i13, objArr);
            }
        }
        ?? obj2 = new Object();
        obj2.f13643c = gb.TYPE_THIN;
        obj2.f13644f = new fe(obj);
        return new e0((s3) obj2, 0);
    }

    public j() {
        this.f9543a = -1L;
        this.f9546f = new i(this);
        this.f9545c = new ArrayList();
    }
}
