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
    public final int f6634a;
    public final Object f6635b;

    public c0(Object obj, int i10) {
        this.f6634a = i10;
        this.f6635b = obj;
    }

    @Override
    public void a() {
        switch (this.f6634a) {
            case 2:
                ((f6.i) this.f6635b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void c() {
        switch (this.f6634a) {
            case 2:
                ((f6.i) this.f6635b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        switch (this.f6634a) {
            case 2:
                ((f6.i) this.f6635b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void e() {
        switch (this.f6634a) {
            case 2:
                ((f6.i) this.f6635b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void g() {
        switch (this.f6634a) {
            case 1:
                e6.c cVar = (e6.c) this.f6635b;
                long e7 = cVar.e();
                if (e7 != cVar.f8879b) {
                    cVar.f8879b = e7;
                    cVar.c();
                    if (cVar.f8879b != 0) {
                        cVar.d();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((f6.i) this.f6635b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void h(String str, long j3, int i10, long j10, long j11) {
        switch (this.f6634a) {
            case 0:
                q4 q4Var = ((c) this.f6635b).f6633l;
                if (q4Var != null) {
                    x6 A = q4Var.f5462a.A();
                    u2 u2Var = new u2(str);
                    u2Var.f5502b = j3;
                    u2Var.f5503c = i10;
                    u2Var.d = j10;
                    u2Var.f5504e = j11;
                    j3 j3Var = new j3(u2Var);
                    j3Var.f5404f = A.h;
                    A.d.add(j3Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void i(int[] iArr) {
        switch (this.f6634a) {
            case 1:
                e6.c cVar = (e6.c) this.f6635b;
                ArrayList c10 = g6.a.c(iArr);
                if (!cVar.d.equals(c10)) {
                    cVar.h();
                    cVar.f8882f.evictAll();
                    cVar.f8883g.clear();
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
        switch (this.f6634a) {
            case 1:
                if (i10 == 0) {
                    i11 = ((e6.c) this.f6635b).d.size();
                } else {
                    i11 = ((e6.c) this.f6635b).f8881e.get(i10, -1);
                    if (i11 == -1) {
                        ((e6.c) this.f6635b).d();
                        return;
                    }
                }
                ((e6.c) this.f6635b).h();
                ((e6.c) this.f6635b).d.addAll(i11, g6.a.c(iArr));
                e6.c.b((e6.c) this.f6635b);
                e6.c cVar = (e6.c) this.f6635b;
                synchronized (cVar.f8888m) {
                    Iterator it = cVar.f8888m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((e6.c) this.f6635b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void k(c6.o[] oVarArr) {
        switch (this.f6634a) {
            case 1:
                HashSet hashSet = new HashSet();
                e6.c cVar = (e6.c) this.f6635b;
                SparseIntArray sparseIntArray = cVar.f8881e;
                ArrayList arrayList = cVar.f8883g;
                arrayList.clear();
                int i10 = 0;
                for (c6.o oVar : oVarArr) {
                    int i11 = oVar.f4570b;
                    cVar.f8882f.put(Integer.valueOf(i11), oVar);
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
        switch (this.f6634a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i10 : iArr) {
                    ((e6.c) this.f6635b).f8882f.remove(Integer.valueOf(i10));
                    int i11 = ((e6.c) this.f6635b).f8881e.get(i10, -1);
                    if (i11 == -1) {
                        ((e6.c) this.f6635b).d();
                        return;
                    }
                    ((e6.c) this.f6635b).f8881e.delete(i10);
                    arrayList.add(Integer.valueOf(i11));
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    ((e6.c) this.f6635b).h();
                    ((e6.c) this.f6635b).d.removeAll(g6.a.c(iArr));
                    e6.c.b((e6.c) this.f6635b);
                    e6.c cVar = (e6.c) this.f6635b;
                    g6.a.e(arrayList);
                    synchronized (cVar.f8888m) {
                        Iterator it = cVar.f8888m.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    ((e6.c) this.f6635b).f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void m(ArrayList arrayList, ArrayList arrayList2, int i10) {
        switch (this.f6634a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                if (i10 == 0) {
                    ((e6.c) this.f6635b).d.size();
                } else if (arrayList2.isEmpty()) {
                    g6.b bVar = ((e6.c) this.f6635b).f8878a;
                    Log.w(bVar.f10414a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((e6.c) this.f6635b).f8881e.get(i10, -1) == -1) {
                    ((e6.c) this.f6635b).f8881e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = ((e6.c) this.f6635b).f8881e.get(((Integer) obj).intValue(), -1);
                    if (i12 == -1) {
                        ((e6.c) this.f6635b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i12));
                }
                ((e6.c) this.f6635b).h();
                e6.c cVar = (e6.c) this.f6635b;
                cVar.d = arrayList;
                e6.c.b(cVar);
                e6.c cVar2 = (e6.c) this.f6635b;
                synchronized (cVar2.f8888m) {
                    Iterator it = cVar2.f8888m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((e6.c) this.f6635b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void n(int[] iArr) {
        switch (this.f6634a) {
            case 1:
                e6.c cVar = (e6.c) this.f6635b;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (i10 < iArr.length) {
                    int i11 = iArr[i10];
                    cVar.f8882f.remove(Integer.valueOf(i11));
                    int i12 = cVar.f8881e.get(i11, -1);
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
        switch (this.f6634a) {
            case 1:
                ((e6.c) this.f6635b).d();
                return;
            default:
                return;
        }
    }
}
