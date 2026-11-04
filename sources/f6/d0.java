package f6;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.f3;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.q2;
import com.google.android.gms.internal.cast.s6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public final class d0 extends g6.g {
    public final int f11477a;
    public final Object f11478b;

    public d0(Object obj, int i3) {
        this.f11477a = i3;
        this.f11478b = obj;
    }

    @Override
    public void a() {
        switch (this.f11477a) {
            case 2:
                ((h6.h) this.f11478b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void c() {
        switch (this.f11477a) {
            case 2:
                ((h6.h) this.f11478b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        switch (this.f11477a) {
            case 2:
                ((h6.h) this.f11478b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void e() {
        switch (this.f11477a) {
            case 2:
                ((h6.h) this.f11478b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void g() {
        switch (this.f11477a) {
            case 1:
                g6.c cVar = (g6.c) this.f11478b;
                long e10 = cVar.e();
                if (e10 != cVar.f11981b) {
                    cVar.f11981b = e10;
                    cVar.c();
                    if (cVar.f11981b != 0) {
                        cVar.d();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((h6.h) this.f11478b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void h(String str, long j10, int i3, long j11, long j12) {
        switch (this.f11477a) {
            case 0:
                m4 m4Var = ((c) this.f11478b).f11475l;
                if (m4Var != null) {
                    s6 Q = m4Var.f6968a.Q();
                    q2 q2Var = new q2(str);
                    q2Var.f7013b = j10;
                    q2Var.f7014c = i3;
                    q2Var.d = j11;
                    q2Var.f7015e = j12;
                    f3 f3Var = new f3(q2Var);
                    f3Var.f6915f = Q.h;
                    Q.d.add(f3Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void i(int[] iArr) {
        switch (this.f11477a) {
            case 1:
                g6.c cVar = (g6.c) this.f11478b;
                ArrayList c2 = i6.a.c(iArr);
                if (!cVar.d.equals(c2)) {
                    cVar.h();
                    cVar.f11984f.evictAll();
                    cVar.f11985g.clear();
                    cVar.d = c2;
                    g6.c.b(cVar);
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
    public void j(int[] iArr, int i3) {
        int i10;
        switch (this.f11477a) {
            case 1:
                if (i3 == 0) {
                    i10 = ((g6.c) this.f11478b).d.size();
                } else {
                    i10 = ((g6.c) this.f11478b).f11983e.get(i3, -1);
                    if (i10 == -1) {
                        ((g6.c) this.f11478b).d();
                        return;
                    }
                }
                ((g6.c) this.f11478b).h();
                ((g6.c) this.f11478b).d.addAll(i10, i6.a.c(iArr));
                g6.c.b((g6.c) this.f11478b);
                g6.c cVar = (g6.c) this.f11478b;
                synchronized (cVar.f11990m) {
                    Iterator it = cVar.f11990m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((g6.c) this.f11478b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void k(e6.o[] oVarArr) {
        switch (this.f11477a) {
            case 1:
                HashSet hashSet = new HashSet();
                g6.c cVar = (g6.c) this.f11478b;
                SparseIntArray sparseIntArray = cVar.f11983e;
                ArrayList arrayList = cVar.f11985g;
                arrayList.clear();
                int i3 = 0;
                for (e6.o oVar : oVarArr) {
                    int i10 = oVar.f9745b;
                    cVar.f11984f.put(Integer.valueOf(i10), oVar);
                    int i11 = sparseIntArray.get(i10, -1);
                    if (i11 == -1) {
                        cVar.d();
                        return;
                    }
                    hashSet.add(Integer.valueOf(i11));
                }
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    int i12 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                    if (i12 != -1) {
                        hashSet.add(Integer.valueOf(i12));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                cVar.h();
                i6.a.e(arrayList2);
                g6.c.a(cVar);
                cVar.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(int[] iArr) {
        switch (this.f11477a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i3 : iArr) {
                    ((g6.c) this.f11478b).f11984f.remove(Integer.valueOf(i3));
                    int i10 = ((g6.c) this.f11478b).f11983e.get(i3, -1);
                    if (i10 == -1) {
                        ((g6.c) this.f11478b).d();
                        return;
                    }
                    ((g6.c) this.f11478b).f11983e.delete(i3);
                    arrayList.add(Integer.valueOf(i10));
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    ((g6.c) this.f11478b).h();
                    ((g6.c) this.f11478b).d.removeAll(i6.a.c(iArr));
                    g6.c.b((g6.c) this.f11478b);
                    g6.c cVar = (g6.c) this.f11478b;
                    i6.a.e(arrayList);
                    synchronized (cVar.f11990m) {
                        Iterator it = cVar.f11990m.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    ((g6.c) this.f11478b).f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void m(ArrayList arrayList, ArrayList arrayList2, int i3) {
        switch (this.f11477a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i10 = 0;
                if (i3 == 0) {
                    ((g6.c) this.f11478b).d.size();
                } else if (arrayList2.isEmpty()) {
                    i6.b bVar = ((g6.c) this.f11478b).f11980a;
                    Log.w(bVar.f14620a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((g6.c) this.f11478b).f11983e.get(i3, -1) == -1) {
                    ((g6.c) this.f11478b).f11983e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    int i11 = ((g6.c) this.f11478b).f11983e.get(((Integer) obj).intValue(), -1);
                    if (i11 == -1) {
                        ((g6.c) this.f11478b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i11));
                }
                ((g6.c) this.f11478b).h();
                g6.c cVar = (g6.c) this.f11478b;
                cVar.d = arrayList;
                g6.c.b(cVar);
                g6.c cVar2 = (g6.c) this.f11478b;
                synchronized (cVar2.f11990m) {
                    Iterator it = cVar2.f11990m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((g6.c) this.f11478b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void n(int[] iArr) {
        switch (this.f11477a) {
            case 1:
                g6.c cVar = (g6.c) this.f11478b;
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                while (i3 < iArr.length) {
                    int i10 = iArr[i3];
                    cVar.f11984f.remove(Integer.valueOf(i10));
                    int i11 = cVar.f11983e.get(i10, -1);
                    if (i11 == -1) {
                        cVar.d();
                        return;
                    }
                    i3 = com.google.android.recaptcha.internal.a.f(i11, i3, 1, arrayList);
                }
                Collections.sort(arrayList);
                cVar.h();
                i6.a.e(arrayList);
                g6.c.a(cVar);
                cVar.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void o() {
        switch (this.f11477a) {
            case 1:
                ((g6.c) this.f11478b).d();
                return;
            default:
                return;
        }
    }
}
