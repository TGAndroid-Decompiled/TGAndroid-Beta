package n5;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.h3;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.s2;
import com.google.android.gms.internal.cast.v6;
import j3.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public final class d0 extends o5.g {
    public final int f18485a;
    public final Object f18486b;

    public d0(Object obj, int i9) {
        this.f18485a = i9;
        this.f18486b = obj;
    }

    @Override
    public void a() {
        switch (this.f18485a) {
            case 2:
                ((p5.h) this.f18486b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void c() {
        switch (this.f18485a) {
            case 2:
                ((p5.h) this.f18486b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        switch (this.f18485a) {
            case 2:
                ((p5.h) this.f18486b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void e() {
        switch (this.f18485a) {
            case 2:
                ((p5.h) this.f18486b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void g() {
        switch (this.f18485a) {
            case 1:
                o5.c cVar = (o5.c) this.f18486b;
                long e10 = cVar.e();
                if (e10 != cVar.f18959b) {
                    cVar.f18959b = e10;
                    cVar.c();
                    if (cVar.f18959b != 0) {
                        cVar.d();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((p5.h) this.f18486b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void h(String str, long j10, int i9, long j11, long j12) {
        switch (this.f18485a) {
            case 0:
                o4 o4Var = ((c) this.f18486b).f18483l;
                if (o4Var != null) {
                    v6 E = o4Var.f3178a.E();
                    s2 s2Var = new s2(str);
                    s2Var.f3214b = j10;
                    s2Var.f3215c = i9;
                    s2Var.d = j11;
                    s2Var.f3216e = j12;
                    h3 h3Var = new h3(s2Var);
                    h3Var.f3125f = E.h;
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
        switch (this.f18485a) {
            case 1:
                o5.c cVar = (o5.c) this.f18486b;
                ArrayList c10 = q5.a.c(iArr);
                if (!cVar.d.equals(c10)) {
                    cVar.h();
                    cVar.f18962f.evictAll();
                    cVar.f18963g.clear();
                    cVar.d = c10;
                    o5.c.b(cVar);
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
    public void j(int[] iArr, int i9) {
        int i10;
        switch (this.f18485a) {
            case 1:
                if (i9 == 0) {
                    i10 = ((o5.c) this.f18486b).d.size();
                } else {
                    i10 = ((o5.c) this.f18486b).f18961e.get(i9, -1);
                    if (i10 == -1) {
                        ((o5.c) this.f18486b).d();
                        return;
                    }
                }
                ((o5.c) this.f18486b).h();
                ((o5.c) this.f18486b).d.addAll(i10, q5.a.c(iArr));
                o5.c.b((o5.c) this.f18486b);
                o5.c cVar = (o5.c) this.f18486b;
                synchronized (cVar.f18968m) {
                    Iterator it = cVar.f18968m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((o5.c) this.f18486b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void k(m5.o[] oVarArr) {
        switch (this.f18485a) {
            case 1:
                HashSet hashSet = new HashSet();
                o5.c cVar = (o5.c) this.f18486b;
                SparseIntArray sparseIntArray = cVar.f18961e;
                ArrayList arrayList = cVar.f18963g;
                arrayList.clear();
                int i9 = 0;
                for (m5.o oVar : oVarArr) {
                    int i10 = oVar.f17446b;
                    cVar.f18962f.put(Integer.valueOf(i10), oVar);
                    int i11 = sparseIntArray.get(i10, -1);
                    if (i11 == -1) {
                        cVar.d();
                        return;
                    }
                    hashSet.add(Integer.valueOf(i11));
                }
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    int i12 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                    if (i12 != -1) {
                        hashSet.add(Integer.valueOf(i12));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                cVar.h();
                q5.a.e(arrayList2);
                o5.c.a(cVar);
                cVar.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(int[] iArr) {
        switch (this.f18485a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i9 : iArr) {
                    ((o5.c) this.f18486b).f18962f.remove(Integer.valueOf(i9));
                    int i10 = ((o5.c) this.f18486b).f18961e.get(i9, -1);
                    if (i10 == -1) {
                        ((o5.c) this.f18486b).d();
                        return;
                    }
                    ((o5.c) this.f18486b).f18961e.delete(i9);
                    arrayList.add(Integer.valueOf(i10));
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    ((o5.c) this.f18486b).h();
                    ((o5.c) this.f18486b).d.removeAll(q5.a.c(iArr));
                    o5.c.b((o5.c) this.f18486b);
                    o5.c cVar = (o5.c) this.f18486b;
                    q5.a.e(arrayList);
                    synchronized (cVar.f18968m) {
                        Iterator it = cVar.f18968m.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    ((o5.c) this.f18486b).f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void m(ArrayList arrayList, ArrayList arrayList2, int i9) {
        switch (this.f18485a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i10 = 0;
                if (i9 == 0) {
                    ((o5.c) this.f18486b).d.size();
                } else if (arrayList2.isEmpty()) {
                    q5.b bVar = ((o5.c) this.f18486b).f18958a;
                    Log.w(bVar.f46009a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((o5.c) this.f18486b).f18961e.get(i9, -1) == -1) {
                    ((o5.c) this.f18486b).f18961e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    int i11 = ((o5.c) this.f18486b).f18961e.get(((Integer) obj).intValue(), -1);
                    if (i11 == -1) {
                        ((o5.c) this.f18486b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i11));
                }
                ((o5.c) this.f18486b).h();
                o5.c cVar = (o5.c) this.f18486b;
                cVar.d = arrayList;
                o5.c.b(cVar);
                o5.c cVar2 = (o5.c) this.f18486b;
                synchronized (cVar2.f18968m) {
                    Iterator it = cVar2.f18968m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((o5.c) this.f18486b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void n(int[] iArr) {
        switch (this.f18485a) {
            case 1:
                o5.c cVar = (o5.c) this.f18486b;
                ArrayList arrayList = new ArrayList();
                int i9 = 0;
                while (i9 < iArr.length) {
                    int i10 = iArr[i9];
                    cVar.f18962f.remove(Integer.valueOf(i10));
                    int i11 = cVar.f18961e.get(i10, -1);
                    if (i11 == -1) {
                        cVar.d();
                        return;
                    }
                    i9 = r0.e(i11, i9, 1, arrayList);
                }
                Collections.sort(arrayList);
                cVar.h();
                q5.a.e(arrayList);
                o5.c.a(cVar);
                cVar.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void o() {
        switch (this.f18485a) {
            case 1:
                ((o5.c) this.f18486b).d();
                return;
            default:
                return;
        }
    }
}
