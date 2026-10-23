package d6;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.h3;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.s2;
import com.google.android.gms.internal.cast.w6;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public final class c0 extends e6.g {
    public final int f7869a;
    public final Object f7870b;

    public c0(Object obj, int i10) {
        this.f7869a = i10;
        this.f7870b = obj;
    }

    @Override
    public void a() {
        switch (this.f7869a) {
            case 2:
                ((f6.h) this.f7870b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void c() {
        switch (this.f7869a) {
            case 2:
                ((f6.h) this.f7870b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        switch (this.f7869a) {
            case 2:
                ((f6.h) this.f7870b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void e() {
        switch (this.f7869a) {
            case 2:
                ((f6.h) this.f7870b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void g() {
        switch (this.f7869a) {
            case 1:
                e6.c cVar = (e6.c) this.f7870b;
                long e = cVar.e();
                if (e != cVar.f8353b) {
                    cVar.f8353b = e;
                    cVar.c();
                    if (cVar.f8353b != 0) {
                        cVar.d();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((f6.h) this.f7870b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void h(String str, long j10, int i10, long j11, long j12) {
        switch (this.f7869a) {
            case 0:
                o4 o4Var = ((c) this.f7870b).f7868l;
                if (o4Var != null) {
                    w6 E = o4Var.f6754a.E();
                    s2 s2Var = new s2(str);
                    s2Var.f6786b = j10;
                    s2Var.f6787c = i10;
                    s2Var.d = j11;
                    s2Var.e = j12;
                    h3 h3Var = new h3(s2Var);
                    h3Var.f6701f = E.h;
                    E.d.add(h3Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void i(int[] iArr) {
        switch (this.f7869a) {
            case 1:
                e6.c cVar = (e6.c) this.f7870b;
                ArrayList c10 = g6.a.c(iArr);
                if (!cVar.d.equals(c10)) {
                    cVar.h();
                    cVar.f8355f.evictAll();
                    cVar.f8356g.clear();
                    cVar.d = c10;
                    e6.c.b(cVar);
                    cVar.g();
                    cVar.f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void j(int[] iArr, int i10) {
        int i11;
        switch (this.f7869a) {
            case 1:
                if (i10 == 0) {
                    i11 = ((e6.c) this.f7870b).d.size();
                } else {
                    i11 = ((e6.c) this.f7870b).e.get(i10, -1);
                    if (i11 == -1) {
                        ((e6.c) this.f7870b).d();
                        return;
                    }
                }
                ((e6.c) this.f7870b).h();
                ((e6.c) this.f7870b).d.addAll(i11, g6.a.c(iArr));
                e6.c.b((e6.c) this.f7870b);
                e6.c cVar = (e6.c) this.f7870b;
                synchronized (cVar.f8361m) {
                    Iterator it = cVar.f8361m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((e6.c) this.f7870b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void k(c6.o[] oVarArr) {
        switch (this.f7869a) {
            case 1:
                HashSet hashSet = new HashSet();
                e6.c cVar = (e6.c) this.f7870b;
                SparseIntArray sparseIntArray = cVar.e;
                ArrayList arrayList = cVar.f8356g;
                arrayList.clear();
                int i10 = 0;
                for (c6.o oVar : oVarArr) {
                    int i11 = oVar.f4889b;
                    cVar.f8355f.put(Integer.valueOf(i11), oVar);
                    int i12 = sparseIntArray.get(i11, -1);
                    if (i12 == -1) {
                        cVar.d();
                        return;
                    }
                    hashSet.add(Integer.valueOf(i12));
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    int i13 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                    if (i13 != -1) {
                        hashSet.add(Integer.valueOf(i13));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                cVar.h();
                g6.a.e(arrayList2);
                e6.c.a(cVar);
                cVar.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(int[] iArr) {
        switch (this.f7869a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i10 : iArr) {
                    ((e6.c) this.f7870b).f8355f.remove(Integer.valueOf(i10));
                    int i11 = ((e6.c) this.f7870b).e.get(i10, -1);
                    if (i11 == -1) {
                        ((e6.c) this.f7870b).d();
                        return;
                    }
                    ((e6.c) this.f7870b).e.delete(i10);
                    arrayList.add(Integer.valueOf(i11));
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    ((e6.c) this.f7870b).h();
                    ((e6.c) this.f7870b).d.removeAll(g6.a.c(iArr));
                    e6.c.b((e6.c) this.f7870b);
                    e6.c cVar = (e6.c) this.f7870b;
                    g6.a.e(arrayList);
                    synchronized (cVar.f8361m) {
                        Iterator it = cVar.f8361m.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    ((e6.c) this.f7870b).f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void m(ArrayList arrayList, ArrayList arrayList2, int i10) {
        switch (this.f7869a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                if (i10 == 0) {
                    ((e6.c) this.f7870b).d.size();
                } else if (arrayList2.isEmpty()) {
                    g6.b bVar = ((e6.c) this.f7870b).f8352a;
                    Log.w(bVar.f10861a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((e6.c) this.f7870b).e.get(i10, -1) == -1) {
                    ((e6.c) this.f7870b).e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = ((e6.c) this.f7870b).e.get(((Integer) obj).intValue(), -1);
                    if (i12 == -1) {
                        ((e6.c) this.f7870b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i12));
                }
                ((e6.c) this.f7870b).h();
                e6.c cVar = (e6.c) this.f7870b;
                cVar.d = arrayList;
                e6.c.b(cVar);
                e6.c cVar2 = (e6.c) this.f7870b;
                synchronized (cVar2.f8361m) {
                    Iterator it = cVar2.f8361m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((e6.c) this.f7870b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void n(int[] iArr) {
        switch (this.f7869a) {
            case 1:
                e6.c cVar = (e6.c) this.f7870b;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (i10 < iArr.length) {
                    int i11 = iArr[i10];
                    cVar.f8355f.remove(Integer.valueOf(i11));
                    int i12 = cVar.e.get(i11, -1);
                    if (i12 == -1) {
                        cVar.d();
                        return;
                    }
                    i10 = k3.f(i12, i10, 1, arrayList);
                }
                Collections.sort(arrayList);
                cVar.h();
                g6.a.e(arrayList);
                e6.c.a(cVar);
                cVar.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void o() {
        switch (this.f7869a) {
            case 1:
                ((e6.c) this.f7870b).d();
                return;
            default:
                return;
        }
    }
}
