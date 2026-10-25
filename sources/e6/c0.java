package e6;

import android.util.Log;
import android.util.SparseIntArray;
import c3.h0;
import com.google.android.gms.internal.cast.e3;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.p2;
import com.google.android.gms.internal.cast.s6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public final class c0 extends f6.g {
    public final int f9811a;
    public final Object f9812b;

    public c0(Object obj, int i10) {
        this.f9811a = i10;
        this.f9812b = obj;
    }

    @Override
    public void a() {
        switch (this.f9811a) {
            case 2:
                ((g6.h) this.f9812b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void c() {
        switch (this.f9811a) {
            case 2:
                ((g6.h) this.f9812b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        switch (this.f9811a) {
            case 2:
                ((g6.h) this.f9812b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void e() {
        switch (this.f9811a) {
            case 2:
                ((g6.h) this.f9812b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void g() {
        switch (this.f9811a) {
            case 1:
                f6.c cVar = (f6.c) this.f9812b;
                long e = cVar.e();
                if (e != cVar.f10191b) {
                    cVar.f10191b = e;
                    cVar.c();
                    if (cVar.f10191b != 0) {
                        cVar.d();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((g6.h) this.f9812b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void h(String str, long j10, int i10, long j11, long j12) {
        switch (this.f9811a) {
            case 0:
                l4 l4Var = ((c) this.f9812b).f9810l;
                if (l4Var != null) {
                    s6 F = l4Var.f6819a.F();
                    p2 p2Var = new p2(str);
                    p2Var.f6854b = j10;
                    p2Var.f6855c = i10;
                    p2Var.d = j11;
                    p2Var.e = j12;
                    e3 e3Var = new e3(p2Var);
                    e3Var.f6776f = F.h;
                    F.d.add(e3Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void i(int[] iArr) {
        switch (this.f9811a) {
            case 1:
                f6.c cVar = (f6.c) this.f9812b;
                ArrayList c10 = h6.a.c(iArr);
                if (!cVar.d.equals(c10)) {
                    cVar.h();
                    cVar.f10193f.evictAll();
                    cVar.f10194g.clear();
                    cVar.d = c10;
                    f6.c.b(cVar);
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
        switch (this.f9811a) {
            case 1:
                if (i10 == 0) {
                    i11 = ((f6.c) this.f9812b).d.size();
                } else {
                    i11 = ((f6.c) this.f9812b).e.get(i10, -1);
                    if (i11 == -1) {
                        ((f6.c) this.f9812b).d();
                        return;
                    }
                }
                ((f6.c) this.f9812b).h();
                ((f6.c) this.f9812b).d.addAll(i11, h6.a.c(iArr));
                f6.c.b((f6.c) this.f9812b);
                f6.c cVar = (f6.c) this.f9812b;
                synchronized (cVar.f10199m) {
                    Iterator it = cVar.f10199m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((f6.c) this.f9812b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void k(d6.o[] oVarArr) {
        switch (this.f9811a) {
            case 1:
                HashSet hashSet = new HashSet();
                f6.c cVar = (f6.c) this.f9812b;
                SparseIntArray sparseIntArray = cVar.e;
                ArrayList arrayList = cVar.f10194g;
                arrayList.clear();
                int i10 = 0;
                for (d6.o oVar : oVarArr) {
                    int i11 = oVar.f8112b;
                    cVar.f10193f.put(Integer.valueOf(i11), oVar);
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
                h6.a.e(arrayList2);
                f6.c.a(cVar);
                cVar.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(int[] iArr) {
        switch (this.f9811a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i10 : iArr) {
                    ((f6.c) this.f9812b).f10193f.remove(Integer.valueOf(i10));
                    int i11 = ((f6.c) this.f9812b).e.get(i10, -1);
                    if (i11 == -1) {
                        ((f6.c) this.f9812b).d();
                        return;
                    }
                    ((f6.c) this.f9812b).e.delete(i10);
                    arrayList.add(Integer.valueOf(i11));
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    ((f6.c) this.f9812b).h();
                    ((f6.c) this.f9812b).d.removeAll(h6.a.c(iArr));
                    f6.c.b((f6.c) this.f9812b);
                    f6.c cVar = (f6.c) this.f9812b;
                    h6.a.e(arrayList);
                    synchronized (cVar.f10199m) {
                        Iterator it = cVar.f10199m.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    ((f6.c) this.f9812b).f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void m(ArrayList arrayList, ArrayList arrayList2, int i10) {
        switch (this.f9811a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                if (i10 == 0) {
                    ((f6.c) this.f9812b).d.size();
                } else if (arrayList2.isEmpty()) {
                    h6.b bVar = ((f6.c) this.f9812b).f10190a;
                    Log.w(bVar.f12621a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((f6.c) this.f9812b).e.get(i10, -1) == -1) {
                    ((f6.c) this.f9812b).e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = ((f6.c) this.f9812b).e.get(((Integer) obj).intValue(), -1);
                    if (i12 == -1) {
                        ((f6.c) this.f9812b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i12));
                }
                ((f6.c) this.f9812b).h();
                f6.c cVar = (f6.c) this.f9812b;
                cVar.d = arrayList;
                f6.c.b(cVar);
                f6.c cVar2 = (f6.c) this.f9812b;
                synchronized (cVar2.f10199m) {
                    Iterator it = cVar2.f10199m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((f6.c) this.f9812b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void n(int[] iArr) {
        switch (this.f9811a) {
            case 1:
                f6.c cVar = (f6.c) this.f9812b;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (i10 < iArr.length) {
                    int i11 = iArr[i10];
                    cVar.f10193f.remove(Integer.valueOf(i11));
                    int i12 = cVar.e.get(i11, -1);
                    if (i12 == -1) {
                        cVar.d();
                        return;
                    }
                    i10 = h0.i(i12, i10, 1, arrayList);
                }
                Collections.sort(arrayList);
                cVar.h();
                h6.a.e(arrayList);
                f6.c.a(cVar);
                cVar.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void o() {
        switch (this.f9811a) {
            case 1:
                ((f6.c) this.f9812b).d();
                return;
            default:
                return;
        }
    }
}
