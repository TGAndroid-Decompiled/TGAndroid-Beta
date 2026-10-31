package d6;

import android.util.Log;
import android.util.SparseIntArray;
import c3.i0;
import com.google.android.gms.internal.cast.g3;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.r2;
import com.google.android.gms.internal.cast.t6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public final class c0 extends e6.g {
    public final int f5771a;
    public final Object f5772b;

    public c0(Object obj, int i10) {
        this.f5771a = i10;
        this.f5772b = obj;
    }

    @Override
    public void a() {
        switch (this.f5771a) {
            case 2:
                ((f6.i) this.f5772b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void c() {
        switch (this.f5771a) {
            case 2:
                ((f6.i) this.f5772b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        switch (this.f5771a) {
            case 2:
                ((f6.i) this.f5772b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void e() {
        switch (this.f5771a) {
            case 2:
                ((f6.i) this.f5772b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void g() {
        switch (this.f5771a) {
            case 1:
                e6.c cVar = (e6.c) this.f5772b;
                long e = cVar.e();
                if (e != cVar.f6262b) {
                    cVar.f6262b = e;
                    cVar.c();
                    if (cVar.f6262b != 0) {
                        cVar.d();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((f6.i) this.f5772b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void h(String str, long j10, int i10, long j11, long j12) {
        switch (this.f5771a) {
            case 0:
                m4 m4Var = ((c) this.f5772b).f5770l;
                if (m4Var != null) {
                    t6 P = m4Var.f4712a.P();
                    r2 r2Var = new r2(str);
                    r2Var.f4756b = j10;
                    r2Var.f4757c = i10;
                    r2Var.d = j11;
                    r2Var.e = j12;
                    g3 g3Var = new g3(r2Var);
                    g3Var.f4664f = P.h;
                    P.d.add(g3Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void i(int[] iArr) {
        switch (this.f5771a) {
            case 1:
                e6.c cVar = (e6.c) this.f5772b;
                ArrayList c10 = g6.a.c(iArr);
                if (!cVar.d.equals(c10)) {
                    cVar.h();
                    cVar.f6264f.evictAll();
                    cVar.f6265g.clear();
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
        switch (this.f5771a) {
            case 1:
                if (i10 == 0) {
                    i11 = ((e6.c) this.f5772b).d.size();
                } else {
                    i11 = ((e6.c) this.f5772b).e.get(i10, -1);
                    if (i11 == -1) {
                        ((e6.c) this.f5772b).d();
                        return;
                    }
                }
                ((e6.c) this.f5772b).h();
                ((e6.c) this.f5772b).d.addAll(i11, g6.a.c(iArr));
                e6.c.b((e6.c) this.f5772b);
                e6.c cVar = (e6.c) this.f5772b;
                synchronized (cVar.f6270m) {
                    Iterator it = cVar.f6270m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((e6.c) this.f5772b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void k(c6.o[] oVarArr) {
        switch (this.f5771a) {
            case 1:
                HashSet hashSet = new HashSet();
                e6.c cVar = (e6.c) this.f5772b;
                SparseIntArray sparseIntArray = cVar.e;
                ArrayList arrayList = cVar.f6265g;
                arrayList.clear();
                int i10 = 0;
                for (c6.o oVar : oVarArr) {
                    int i11 = oVar.f3915b;
                    cVar.f6264f.put(Integer.valueOf(i11), oVar);
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
        switch (this.f5771a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i10 : iArr) {
                    ((e6.c) this.f5772b).f6264f.remove(Integer.valueOf(i10));
                    int i11 = ((e6.c) this.f5772b).e.get(i10, -1);
                    if (i11 == -1) {
                        ((e6.c) this.f5772b).d();
                        return;
                    }
                    ((e6.c) this.f5772b).e.delete(i10);
                    arrayList.add(Integer.valueOf(i11));
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    ((e6.c) this.f5772b).h();
                    ((e6.c) this.f5772b).d.removeAll(g6.a.c(iArr));
                    e6.c.b((e6.c) this.f5772b);
                    e6.c cVar = (e6.c) this.f5772b;
                    g6.a.e(arrayList);
                    synchronized (cVar.f6270m) {
                        Iterator it = cVar.f6270m.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    ((e6.c) this.f5772b).f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void m(ArrayList arrayList, ArrayList arrayList2, int i10) {
        switch (this.f5771a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                if (i10 == 0) {
                    ((e6.c) this.f5772b).d.size();
                } else if (arrayList2.isEmpty()) {
                    g6.b bVar = ((e6.c) this.f5772b).f6261a;
                    Log.w(bVar.f7367a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((e6.c) this.f5772b).e.get(i10, -1) == -1) {
                    ((e6.c) this.f5772b).e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = ((e6.c) this.f5772b).e.get(((Integer) obj).intValue(), -1);
                    if (i12 == -1) {
                        ((e6.c) this.f5772b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i12));
                }
                ((e6.c) this.f5772b).h();
                e6.c cVar = (e6.c) this.f5772b;
                cVar.d = arrayList;
                e6.c.b(cVar);
                e6.c cVar2 = (e6.c) this.f5772b;
                synchronized (cVar2.f6270m) {
                    Iterator it = cVar2.f6270m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((e6.c) this.f5772b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void n(int[] iArr) {
        switch (this.f5771a) {
            case 1:
                e6.c cVar = (e6.c) this.f5772b;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (i10 < iArr.length) {
                    int i11 = iArr[i10];
                    cVar.f6264f.remove(Integer.valueOf(i11));
                    int i12 = cVar.e.get(i11, -1);
                    if (i12 == -1) {
                        cVar.d();
                        return;
                    }
                    i10 = i0.j(i12, i10, 1, arrayList);
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
        switch (this.f5771a) {
            case 1:
                ((e6.c) this.f5772b).d();
                return;
            default:
                return;
        }
    }
}
