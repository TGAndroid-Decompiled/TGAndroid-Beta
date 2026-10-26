package dc;

import a8.ab;
import a8.ah;
import a8.bh;
import a8.cf;
import a8.eb;
import a8.h0;
import a8.j;
import a8.jg;
import a8.ne;
import a8.ng;
import a8.ob;
import a8.qb;
import a8.za;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.i;
import m.r3;
import n4.s;
import o6.l;
import r0.l0;
import r0.m0;
public final class d implements jg {
    public long f8315a;
    public boolean f8316b;
    public final Object f8317c;
    public Object d;
    public Object e;
    public final Object f8318f;

    public d(f fVar, long j10, qb qbVar, boolean z10, xb.a aVar, bh bhVar) {
        this.f8317c = fVar;
        this.f8315a = j10;
        this.d = qbVar;
        this.f8316b = z10;
        this.e = aVar;
        this.f8318f = bhVar;
    }

    public void a() {
        if (!this.f8316b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f8317c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l0) obj).b();
        }
        this.f8316b = false;
    }

    public void b() {
        View view;
        if (this.f8316b) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f8317c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l0 l0Var = (l0) obj;
            long j10 = this.f8315a;
            if (j10 >= 0) {
                l0Var.c(j10);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) l0Var.f47119a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((m0) this.e) != null) {
                l0Var.d((i) this.f8318f);
            }
            View view2 = (View) l0Var.f47119a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f8316b = true;
    }

    @Override
    public ng zza() {
        int i10;
        za zaVar;
        f fVar = (f) this.f8317c;
        long j10 = this.f8315a;
        boolean z10 = this.f8316b;
        xb.a aVar = (xb.a) this.e;
        bh bhVar = (bh) this.f8318f;
        ?? obj = new Object();
        h0 h0Var = new h0(3, false);
        h0Var.f511b = Long.valueOf(j10 & Long.MAX_VALUE);
        h0Var.f512c = (qb) this.d;
        h0Var.d = Boolean.valueOf(z10);
        obj.f614a = new eb(h0Var);
        int i11 = aVar.e;
        f.f8323l.getClass();
        int i12 = aVar.e;
        if (i12 == -1) {
            Bitmap bitmap = aVar.f51707a;
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
        s sVar = new s(3, false);
        if (i11 != -1) {
            if (i11 != 35) {
                if (i11 != 842094169) {
                    if (i11 != 16) {
                        if (i11 != 17) {
                            zaVar = za.UNKNOWN_FORMAT;
                        } else {
                            zaVar = za.NV21;
                        }
                    } else {
                        zaVar = za.NV16;
                    }
                } else {
                    zaVar = za.YV12;
                }
            } else {
                zaVar = za.YUV_420_888;
            }
        } else {
            zaVar = za.BITMAP;
        }
        sVar.f18696b = zaVar;
        sVar.f18697c = Integer.valueOf(i10 & Integer.MAX_VALUE);
        obj.f615b = new ab(sVar);
        obj.f616c = fVar.e.a();
        if (bhVar != null) {
            List list = bhVar.d;
            j jVar = a8.l.f586b;
            Object[] array = list.toArray();
            int length = array.length;
            a8.l0.a(length, array);
            obj.e = a8.l.q(length, array);
            List<ah> list2 = bhVar.f376a;
            if (!list2.isEmpty()) {
                Object[] objArr = new Object[4];
                int i13 = 0;
                for (ah ahVar : list2) {
                    ?? obj2 = new Object();
                    obj2.f7757a = Integer.valueOf(ahVar.f363c & Integer.MAX_VALUE);
                    obj2.f7758b = Integer.valueOf(ahVar.d & Integer.MAX_VALUE);
                    obj2.f7759c = Integer.valueOf(ahVar.e & Integer.MAX_VALUE);
                    obj2.d = Integer.valueOf(ahVar.f364f & Integer.MAX_VALUE);
                    cf cfVar = new cf(obj2);
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
                    objArr[i13] = cfVar;
                    i13 = i14;
                }
                obj.d = a8.l.q(i13, objArr);
            }
        }
        ?? obj3 = new Object();
        obj3.f17846c = ob.TYPE_THIN;
        obj3.f17847f = new ne(obj);
        return new ng((r3) obj3, 0);
    }

    public d() {
        this.f8315a = -1L;
        this.f8318f = new i(this);
        this.f8317c = new ArrayList();
    }
}
