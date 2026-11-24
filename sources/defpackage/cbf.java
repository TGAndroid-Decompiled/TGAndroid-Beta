package defpackage;

import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public final class cbf extends h69 {
    public final byte a;
    public final Object b;

    public cbf(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a() {
        switch (this.a) {
            case 2:
                ((kgf) this.b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.a) {
            case 2:
                ((kgf) this.b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.a) {
            case 2:
                ((kgf) this.b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public final void e() {
        switch (this.a) {
            case 2:
                ((kgf) this.b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public final void g() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                wr6 wr6Var = (wr6) obj;
                long d = wr6Var.d();
                if (d != wr6Var.b) {
                    wr6Var.b = d;
                    wr6Var.b();
                    if (wr6Var.b != 0) {
                        wr6Var.c();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((kgf) obj).b();
                return;
            default:
                return;
        }
    }

    @Override
    public final void h(String str, long j, int i, long j2, long j3) {
        switch (this.a) {
            case 0:
                e6e e6eVar = ((ed1) this.b).l;
                if (e6eVar != null) {
                    mhf T = ((gl2) e6eVar.b).T();
                    n7f n7fVar = new n7f(str);
                    n7fVar.b = j;
                    n7fVar.c = i;
                    n7fVar.d = j2;
                    n7fVar.e = j3;
                    m9f m9fVar = new m9f(n7fVar);
                    m9fVar.f = T.h;
                    T.d.add(m9fVar);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void i(int[] iArr) {
        switch (this.a) {
            case 1:
                wr6 wr6Var = (wr6) this.b;
                ArrayList c = id1.c(iArr);
                if (!wr6Var.d.equals(c)) {
                    wr6Var.h();
                    wr6Var.f.evictAll();
                    wr6Var.g.clear();
                    wr6Var.d = c;
                    wr6.a(wr6Var);
                    wr6Var.f();
                    wr6Var.e();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void j(int[] iArr, int i) {
        int i2;
        switch (this.a) {
            case 1:
                wr6 wr6Var = (wr6) this.b;
                if (i == 0) {
                    i2 = wr6Var.d.size();
                } else {
                    i2 = wr6Var.e.get(i, -1);
                    if (i2 == -1) {
                        ((wr6) this.b).c();
                        return;
                    }
                }
                ((wr6) this.b).h();
                ((wr6) this.b).d.addAll(i2, id1.c(iArr));
                wr6.a((wr6) this.b);
                wr6 wr6Var2 = (wr6) this.b;
                synchronized (wr6Var2.m) {
                    Iterator it = wr6Var2.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((wr6) this.b).e();
                return;
            default:
                return;
        }
    }

    @Override
    public final void k(zr6[] zr6VarArr) {
        switch (this.a) {
            case 1:
                HashSet hashSet = new HashSet();
                wr6 wr6Var = (wr6) this.b;
                SparseIntArray sparseIntArray = wr6Var.e;
                ArrayList arrayList = wr6Var.g;
                arrayList.clear();
                int i = 0;
                for (zr6 zr6Var : zr6VarArr) {
                    int i2 = zr6Var.b;
                    wr6Var.f.put(Integer.valueOf(i2), zr6Var);
                    int i3 = sparseIntArray.get(i2, -1);
                    if (i3 == -1) {
                        wr6Var.c();
                        return;
                    }
                    hashSet.add(Integer.valueOf(i3));
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    int i4 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                    if (i4 != -1) {
                        hashSet.add(Integer.valueOf(i4));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                wr6Var.h();
                id1.e(arrayList2);
                wr6Var.g();
                wr6Var.e();
                return;
            default:
                return;
        }
    }

    @Override
    public final void l(int[] iArr) {
        switch (this.a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i : iArr) {
                    ((wr6) this.b).f.remove(Integer.valueOf(i));
                    int i2 = ((wr6) this.b).e.get(i, -1);
                    wr6 wr6Var = (wr6) this.b;
                    if (i2 == -1) {
                        wr6Var.c();
                        return;
                    }
                    wr6Var.e.delete(i);
                    arrayList.add(Integer.valueOf(i2));
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    ((wr6) this.b).h();
                    ((wr6) this.b).d.removeAll(id1.c(iArr));
                    wr6.a((wr6) this.b);
                    wr6 wr6Var2 = (wr6) this.b;
                    id1.e(arrayList);
                    synchronized (wr6Var2.m) {
                        Iterator it = wr6Var2.m.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    ((wr6) this.b).e();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void m(ArrayList arrayList, ArrayList arrayList2, int i) {
        switch (this.a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                if (i == 0) {
                    ((wr6) this.b).d.size();
                } else {
                    boolean isEmpty = arrayList2.isEmpty();
                    wr6 wr6Var = (wr6) this.b;
                    if (isEmpty) {
                        dc6 dc6Var = wr6Var.a;
                        Log.w(dc6Var.a, dc6Var.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                    } else if (wr6Var.e.get(i, -1) == -1) {
                        ((wr6) this.b).e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                    }
                }
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    int i3 = ((wr6) this.b).e.get(((Integer) obj).intValue(), -1);
                    if (i3 == -1) {
                        ((wr6) this.b).c();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i3));
                }
                ((wr6) this.b).h();
                wr6 wr6Var2 = (wr6) this.b;
                wr6Var2.d = arrayList;
                wr6.a(wr6Var2);
                wr6 wr6Var3 = (wr6) this.b;
                synchronized (wr6Var3.m) {
                    Iterator it = wr6Var3.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((wr6) this.b).e();
                return;
            default:
                return;
        }
    }

    @Override
    public final void n(int[] iArr) {
        switch (this.a) {
            case 1:
                wr6 wr6Var = (wr6) this.b;
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (i < iArr.length) {
                    int i2 = iArr[i];
                    wr6Var.f.remove(Integer.valueOf(i2));
                    int i3 = wr6Var.e.get(i2, -1);
                    if (i3 == -1) {
                        wr6Var.c();
                        return;
                    }
                    i = tb4.g(i3, i, 1, arrayList);
                }
                Collections.sort(arrayList);
                wr6Var.h();
                id1.e(arrayList);
                wr6Var.g();
                wr6Var.e();
                return;
            default:
                return;
        }
    }

    @Override
    public final void o() {
        switch (this.a) {
            case 1:
                ((wr6) this.b).c();
                return;
            default:
                return;
        }
    }
}
