package k;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import b4.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k7.c0;
import l7.w0;
import m.r3;
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
    public long f10241a;
    public boolean f10242b;
    public final Object f10243c;
    public Object d;
    public Object f10244e;
    public final Object f10245f;

    public j(nb.e eVar, long j10, hb hbVar, boolean z4, hb.a aVar, jg jgVar) {
        this.f10243c = eVar;
        this.f10241a = j10;
        this.d = hbVar;
        this.f10242b = z4;
        this.f10244e = aVar;
        this.f10245f = jgVar;
    }

    public void a() {
        if (!this.f10242b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f10243c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m0) obj).b();
        }
        this.f10242b = false;
    }

    public void b() {
        View view;
        if (this.f10242b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f10243c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m0 m0Var = (m0) obj;
            long j10 = this.f10241a;
            if (j10 >= 0) {
                m0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) m0Var.f46481a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((n0) this.f10244e) != null) {
                m0Var.d((i) this.f10245f);
            }
            View view2 = (View) m0Var.f46481a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f10242b = true;
    }

    @Override
    public e0 zza() {
        int i10;
        ra raVar;
        nb.e eVar = (nb.e) this.f10243c;
        long j10 = this.f10241a;
        boolean z4 = this.f10242b;
        hb.a aVar = (hb.a) this.f10244e;
        jg jgVar = (jg) this.f10245f;
        ?? obj = new Object();
        w0 w0Var = new w0(10, false);
        w0Var.f12080b = Long.valueOf(j10 & Long.MAX_VALUE);
        w0Var.f12081c = (hb) this.d;
        w0Var.d = Boolean.valueOf(z4);
        obj.f2315a = new wa(w0Var);
        int i11 = aVar.f7369e;
        nb.e.f15924l.getClass();
        int i12 = aVar.f7369e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f7366a;
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
        qaVar.f15701b = raVar;
        qaVar.f15702c = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f2316b = new sa(qaVar);
        obj.f2317c = eVar.f15925e.a();
        if (jgVar != null) {
            List list = jgVar.d;
            n7.g gVar = n7.i.f15451b;
            Object[] array = list.toArray();
            int length = array.length;
            c0.a(length, array);
            obj.f2318e = n7.i.r(length, array);
            List<ig> list2 = jgVar.f15620a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (ig igVar : list2) {
                    ?? obj2 = new Object();
                    obj2.f4080a = Integer.valueOf(igVar.f15600c & Integer.MAX_VALUE);
                    obj2.f4081b = Integer.valueOf(igVar.d & Integer.MAX_VALUE);
                    obj2.f4082c = Integer.valueOf(igVar.f15601e & Integer.MAX_VALUE);
                    obj2.d = Integer.valueOf(igVar.f15602f & Integer.MAX_VALUE);
                    ue ueVar = new ue(obj2);
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
        ?? obj3 = new Object();
        obj3.f13331c = gb.TYPE_THIN;
        obj3.f13333f = new fe(obj);
        return new e0((r3) obj3, 0);
    }

    public j() {
        this.f10241a = -1L;
        this.f10245f = new i(this);
        this.f10243c = new ArrayList();
    }
}
