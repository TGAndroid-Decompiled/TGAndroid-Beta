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
import org.telegram.ui.Cells.f3;
import r0.l0;
import r0.m0;
import v7.s1;
import w7.i9;
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
    public long f3496a;
    public boolean f3497b;
    public final Object f3498c;
    public Object d;
    public Object e;
    public final Object f3499f;

    public d(f fVar, long j3, gb gbVar, boolean z10, vb.a aVar, ig igVar) {
        this.f3498c = fVar;
        this.f3496a = j3;
        this.d = gbVar;
        this.f3497b = z10;
        this.e = aVar;
        this.f3499f = igVar;
    }

    public void a() {
        if (!this.f3497b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f3498c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l0) obj).b();
        }
        this.f3497b = false;
    }

    public void b() {
        View view;
        if (this.f3497b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f3498c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l0 l0Var = (l0) obj;
            long j3 = this.f3496a;
            if (j3 >= 0) {
                l0Var.c(j3);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) l0Var.f42152a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((m0) this.e) != null) {
                l0Var.d((i) this.f3499f);
            }
            View view2 = (View) l0Var.f42152a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f3497b = true;
    }

    @Override
    public a5.a zza() {
        int i10;
        qa qaVar;
        f fVar = (f) this.f3498c;
        long j3 = this.f3496a;
        boolean z10 = this.f3497b;
        vb.a aVar = (vb.a) this.e;
        ig igVar = (ig) this.f3499f;
        ?? obj = new Object();
        s1 s1Var = new s1(15, false);
        s1Var.f44383b = Long.valueOf(j3 & Long.MAX_VALUE);
        s1Var.d = (gb) this.d;
        s1Var.f44384c = Boolean.valueOf(z10);
        obj.f4261a = new va(s1Var);
        int i11 = aVar.e;
        f.f3504l.getClass();
        int i12 = aVar.e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f44578a;
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
        f3 f3Var = new f3(25);
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
        f3Var.f20269b = qaVar;
        f3Var.f20270c = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f4262b = new ra(f3Var);
        obj.f4263c = fVar.e.a();
        if (igVar != null) {
            List list = igVar.d;
            g gVar = z7.i.f48784b;
            Object[] array = list.toArray();
            int length = array.length;
            i9.a(length, array);
            obj.e = z7.i.r(length, array);
            List<hg> list2 = igVar.f48800a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (hg hgVar : list2) {
                    t tVar = new t(14, false);
                    tVar.f7346b = Integer.valueOf(hgVar.f48782c & Integer.MAX_VALUE);
                    tVar.f7347c = Integer.valueOf(hgVar.d & Integer.MAX_VALUE);
                    tVar.d = Integer.valueOf(hgVar.e & Integer.MAX_VALUE);
                    tVar.e = Integer.valueOf(hgVar.f48783f & Integer.MAX_VALUE);
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
        obj2.f14505c = fb.TYPE_THIN;
        obj2.f14506f = new ee(obj);
        return new a5.a((p3) obj2, 0);
    }

    public d() {
        this.f3496a = -1L;
        this.f3499f = new i(this);
        this.f3498c = new ArrayList();
    }
}
