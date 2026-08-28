package jb;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.firebase.messaging.t;
import f7.v8;
import j7.ee;
import j7.fb;
import j7.g;
import j7.gb;
import j7.hg;
import j7.ig;
import j7.qa;
import j7.ra;
import j7.te;
import j7.va;
import j7.vf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import m.t3;
import r0.m0;
import r0.n0;
import x5.l;
public final class d implements vf {
    public long f14291a;
    public boolean f14292b;
    public final Object f14293c;
    public Object d;
    public Object f14294e;
    public final Object f14295f;

    public d(f fVar, long j10, gb gbVar, boolean z10, db.a aVar, ig igVar) {
        this.f14293c = fVar;
        this.f14291a = j10;
        this.d = gbVar;
        this.f14292b = z10;
        this.f14294e = aVar;
        this.f14295f = igVar;
    }

    public void a() {
        if (!this.f14292b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f14293c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((m0) obj).b();
        }
        this.f14292b = false;
    }

    public void b() {
        View view;
        if (this.f14292b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f14293c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            m0 m0Var = (m0) obj;
            long j10 = this.f14291a;
            if (j10 >= 0) {
                m0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) m0Var.f46927a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((n0) this.f14294e) != null) {
                m0Var.d((i) this.f14295f);
            }
            View view2 = (View) m0Var.f46927a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f14292b = true;
    }

    @Override
    public a6.a zza() {
        int i9;
        qa qaVar;
        f fVar = (f) this.f14293c;
        long j10 = this.f14291a;
        boolean z10 = this.f14292b;
        db.a aVar = (db.a) this.f14294e;
        ig igVar = (ig) this.f14295f;
        ?? obj = new Object();
        j4.c cVar = new j4.c(4, false);
        cVar.f13431b = Long.valueOf(j10 & Long.MAX_VALUE);
        cVar.f13432c = (gb) this.d;
        cVar.d = Boolean.valueOf(z10);
        obj.f1413a = new va(cVar);
        int i10 = aVar.f4469e;
        f.f14300l.getClass();
        int i11 = aVar.f4469e;
        if (i11 == -1) {
            Bitmap bitmap = aVar.f4466a;
            l.h(bitmap);
            i9 = bitmap.getAllocationByteCount();
        } else if (i11 != 17 && i11 != 842094169) {
            if (i11 != 35) {
                i9 = 0;
            } else {
                l.h(null);
                throw null;
            }
        } else {
            l.h(null);
            throw null;
        }
        g5.b bVar = new g5.b(11);
        if (i10 != -1) {
            if (i10 != 35) {
                if (i10 != 842094169) {
                    if (i10 != 16) {
                        if (i10 != 17) {
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
        bVar.f7111b = qaVar;
        bVar.f7112c = Integer.valueOf(i9 & Integer.MAX_VALUE);
        obj.f1414b = new ra(bVar);
        obj.f1415c = fVar.f14301e.a();
        if (igVar != null) {
            List list = igVar.d;
            g gVar = j7.i.f13961b;
            Object[] array = list.toArray();
            int length = array.length;
            v8.a(length, array);
            obj.f1416e = j7.i.r(length, array);
            List<hg> list2 = igVar.f13978a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i12 = 0;
                for (hg hgVar : list2) {
                    t tVar = new t(14, false);
                    tVar.f4177b = Integer.valueOf(hgVar.f13958c & Integer.MAX_VALUE);
                    tVar.f4178c = Integer.valueOf(hgVar.d & Integer.MAX_VALUE);
                    tVar.d = Integer.valueOf(hgVar.f13959e & Integer.MAX_VALUE);
                    tVar.f4179e = Integer.valueOf(hgVar.f13960f & Integer.MAX_VALUE);
                    te teVar = new te(tVar);
                    int i13 = i12 + 1;
                    int length2 = objArr.length;
                    if (length2 < i13) {
                        int i14 = length2 + (length2 >> 1) + 1;
                        if (i14 < i13) {
                            int highestOneBit = Integer.highestOneBit(i12);
                            i14 = highestOneBit + highestOneBit;
                        }
                        if (i14 < 0) {
                            i14 = Integer.MAX_VALUE;
                        }
                        objArr = Arrays.copyOf(objArr, i14);
                    }
                    objArr[i12] = teVar;
                    i12 = i13;
                }
                obj.d = j7.i.r(i12, objArr);
            }
        }
        ?? obj2 = new Object();
        obj2.f17100c = fb.TYPE_THIN;
        obj2.f17102f = new ee(obj);
        return new a6.a((t3) obj2, 0);
    }

    public d() {
        this.f14291a = -1L;
        this.f14295f = new i(this);
        this.f14293c = new ArrayList();
    }
}
