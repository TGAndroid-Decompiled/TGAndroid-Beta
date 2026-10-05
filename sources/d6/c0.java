package d6;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.j3;
import com.google.android.gms.internal.cast.q4;
import com.google.android.gms.internal.cast.u2;
import com.google.android.gms.internal.cast.x6;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public final class c0 extends e6.g {
    public final int f8138a;
    public final Object f8139b;

    public c0(Object obj, int i10) {
        this.f8138a = i10;
        this.f8139b = obj;
    }

    @Override
    public void a() {
        switch (this.f8138a) {
            case 2:
                ((f6.i) this.f8139b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void c() {
        switch (this.f8138a) {
            case 2:
                ((f6.i) this.f8139b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        switch (this.f8138a) {
            case 2:
                ((f6.i) this.f8139b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void e() {
        switch (this.f8138a) {
            case 2:
                ((f6.i) this.f8139b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void g() {
        switch (this.f8138a) {
            case 1:
                e6.c cVar = (e6.c) this.f8139b;
                long e7 = cVar.e();
                if (e7 != cVar.f8652b) {
                    cVar.f8652b = e7;
                    cVar.c();
                    if (cVar.f8652b != 0) {
                        cVar.d();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((f6.i) this.f8139b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void h(String str, long j3, int i10, long j10, long j11) {
        switch (this.f8138a) {
            case 0:
                q4 q4Var = ((c) this.f8139b).f8137l;
                if (q4Var != null) {
                    x6 w10 = q4Var.f6962a.w();
                    u2 u2Var = new u2(str);
                    u2Var.f7002b = j3;
                    u2Var.f7003c = i10;
                    u2Var.d = j10;
                    u2Var.f7004e = j11;
                    j3 j3Var = new j3(u2Var);
                    j3Var.f6904f = w10.h;
                    w10.d.add(j3Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void i(int[] iArr) {
        switch (this.f8138a) {
            case 1:
                e6.c cVar = (e6.c) this.f8139b;
                ArrayList c10 = g6.a.c(iArr);
                if (!cVar.d.equals(c10)) {
                    cVar.h();
                    cVar.f8655f.evictAll();
                    cVar.f8656g.clear();
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
        switch (this.f8138a) {
            case 1:
                if (i10 == 0) {
                    i11 = ((e6.c) this.f8139b).d.size();
                } else {
                    i11 = ((e6.c) this.f8139b).f8654e.get(i10, -1);
                    if (i11 == -1) {
                        ((e6.c) this.f8139b).d();
                        return;
                    }
                }
                ((e6.c) this.f8139b).h();
                ((e6.c) this.f8139b).d.addAll(i11, g6.a.c(iArr));
                e6.c.b((e6.c) this.f8139b);
                e6.c cVar = (e6.c) this.f8139b;
                synchronized (cVar.f8661m) {
                    Iterator it = cVar.f8661m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((e6.c) this.f8139b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void k(c6.o[] oVarArr) {
        switch (this.f8138a) {
            case 1:
                HashSet hashSet = new HashSet();
                e6.c cVar = (e6.c) this.f8139b;
                SparseIntArray sparseIntArray = cVar.f8654e;
                ArrayList arrayList = cVar.f8656g;
                arrayList.clear();
                int i10 = 0;
                for (c6.o oVar : oVarArr) {
                    int i11 = oVar.f4350b;
                    cVar.f8655f.put(Integer.valueOf(i11), oVar);
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
        switch (this.f8138a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i10 : iArr) {
                    ((e6.c) this.f8139b).f8655f.remove(Integer.valueOf(i10));
                    int i11 = ((e6.c) this.f8139b).f8654e.get(i10, -1);
                    if (i11 == -1) {
                        ((e6.c) this.f8139b).d();
                        return;
                    }
                    ((e6.c) this.f8139b).f8654e.delete(i10);
                    arrayList.add(Integer.valueOf(i11));
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    ((e6.c) this.f8139b).h();
                    ((e6.c) this.f8139b).d.removeAll(g6.a.c(iArr));
                    e6.c.b((e6.c) this.f8139b);
                    e6.c cVar = (e6.c) this.f8139b;
                    g6.a.e(arrayList);
                    synchronized (cVar.f8661m) {
                        Iterator it = cVar.f8661m.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    ((e6.c) this.f8139b).f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void m(ArrayList arrayList, ArrayList arrayList2, int i10) {
        switch (this.f8138a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                if (i10 == 0) {
                    ((e6.c) this.f8139b).d.size();
                } else if (arrayList2.isEmpty()) {
                    g6.b bVar = ((e6.c) this.f8139b).f8651a;
                    Log.w(bVar.f10250a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((e6.c) this.f8139b).f8654e.get(i10, -1) == -1) {
                    ((e6.c) this.f8139b).f8654e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = ((e6.c) this.f8139b).f8654e.get(((Integer) obj).intValue(), -1);
                    if (i12 == -1) {
                        ((e6.c) this.f8139b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i12));
                }
                ((e6.c) this.f8139b).h();
                e6.c cVar = (e6.c) this.f8139b;
                cVar.d = arrayList;
                e6.c.b(cVar);
                e6.c cVar2 = (e6.c) this.f8139b;
                synchronized (cVar2.f8661m) {
                    Iterator it = cVar2.f8661m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((e6.c) this.f8139b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void n(int[] iArr) {
        switch (this.f8138a) {
            case 1:
                e6.c cVar = (e6.c) this.f8139b;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (i10 < iArr.length) {
                    int i11 = iArr[i10];
                    cVar.f8655f.remove(Integer.valueOf(i11));
                    int i12 = cVar.f8654e.get(i11, -1);
                    if (i12 == -1) {
                        cVar.d();
                        return;
                    }
                    i10 = e2.e(i12, i10, 1, arrayList);
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
        switch (this.f8138a) {
            case 1:
                ((e6.c) this.f8139b).d();
                return;
            default:
                return;
        }
    }
}
