package defpackage;

import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public final class ddf extends j89 {
    public final byte a;
    public final Object b;

    public ddf(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a() {
        switch (this.a) {
            case 2:
                ((lif) this.b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.a) {
            case 2:
                ((lif) this.b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.a) {
            case 2:
                ((lif) this.b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public final void e() {
        switch (this.a) {
            case 2:
                ((lif) this.b).b();
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
                xt6 xt6Var = (xt6) obj;
                long d = xt6Var.d();
                if (d != xt6Var.b) {
                    xt6Var.b = d;
                    xt6Var.b();
                    if (xt6Var.b != 0) {
                        xt6Var.c();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((lif) obj).b();
                return;
            default:
                return;
        }
    }

    @Override
    public final void h(String str, long j, int i, long j2, long j3) {
        switch (this.a) {
            case 0:
                fkd fkdVar = ((me1) this.b).l;
                if (fkdVar != null) {
                    njf S = ((sm2) fkdVar.b).S();
                    p9f p9fVar = new p9f(str);
                    p9fVar.b = j;
                    p9fVar.c = i;
                    p9fVar.d = j2;
                    p9fVar.e = j3;
                    obf obfVar = new obf(p9fVar);
                    obfVar.f = S.h;
                    S.d.add(obfVar);
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
                xt6 xt6Var = (xt6) this.b;
                ArrayList c = qe1.c(iArr);
                if (!xt6Var.d.equals(c)) {
                    xt6Var.h();
                    xt6Var.f.evictAll();
                    xt6Var.g.clear();
                    xt6Var.d = c;
                    xt6.a(xt6Var);
                    xt6Var.f();
                    xt6Var.e();
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
                xt6 xt6Var = (xt6) this.b;
                if (i == 0) {
                    i2 = xt6Var.d.size();
                } else {
                    i2 = xt6Var.e.get(i, -1);
                    if (i2 == -1) {
                        ((xt6) this.b).c();
                        return;
                    }
                }
                ((xt6) this.b).h();
                ((xt6) this.b).d.addAll(i2, qe1.c(iArr));
                xt6.a((xt6) this.b);
                xt6 xt6Var2 = (xt6) this.b;
                synchronized (xt6Var2.m) {
                    Iterator it = xt6Var2.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((xt6) this.b).e();
                return;
            default:
                return;
        }
    }

    @Override
    public final void k(au6[] au6VarArr) {
        switch (this.a) {
            case 1:
                HashSet hashSet = new HashSet();
                xt6 xt6Var = (xt6) this.b;
                SparseIntArray sparseIntArray = xt6Var.e;
                ArrayList arrayList = xt6Var.g;
                arrayList.clear();
                int i = 0;
                for (au6 au6Var : au6VarArr) {
                    int i2 = au6Var.b;
                    xt6Var.f.put(Integer.valueOf(i2), au6Var);
                    int i3 = sparseIntArray.get(i2, -1);
                    if (i3 == -1) {
                        xt6Var.c();
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
                xt6Var.h();
                qe1.e(arrayList2);
                xt6Var.g();
                xt6Var.e();
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
                    ((xt6) this.b).f.remove(Integer.valueOf(i));
                    int i2 = ((xt6) this.b).e.get(i, -1);
                    xt6 xt6Var = (xt6) this.b;
                    if (i2 == -1) {
                        xt6Var.c();
                        return;
                    }
                    xt6Var.e.delete(i);
                    arrayList.add(Integer.valueOf(i2));
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    ((xt6) this.b).h();
                    ((xt6) this.b).d.removeAll(qe1.c(iArr));
                    xt6.a((xt6) this.b);
                    xt6 xt6Var2 = (xt6) this.b;
                    qe1.e(arrayList);
                    synchronized (xt6Var2.m) {
                        Iterator it = xt6Var2.m.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    ((xt6) this.b).e();
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
                    ((xt6) this.b).d.size();
                } else {
                    boolean isEmpty = arrayList2.isEmpty();
                    xt6 xt6Var = (xt6) this.b;
                    if (isEmpty) {
                        ce6 ce6Var = xt6Var.a;
                        Log.w(ce6Var.a, ce6Var.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                    } else if (xt6Var.e.get(i, -1) == -1) {
                        ((xt6) this.b).e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                    }
                }
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    int i3 = ((xt6) this.b).e.get(((Integer) obj).intValue(), -1);
                    if (i3 == -1) {
                        ((xt6) this.b).c();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i3));
                }
                ((xt6) this.b).h();
                xt6 xt6Var2 = (xt6) this.b;
                xt6Var2.d = arrayList;
                xt6.a(xt6Var2);
                xt6 xt6Var3 = (xt6) this.b;
                synchronized (xt6Var3.m) {
                    Iterator it = xt6Var3.m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((xt6) this.b).e();
                return;
            default:
                return;
        }
    }

    @Override
    public final void n(int[] iArr) {
        switch (this.a) {
            case 1:
                xt6 xt6Var = (xt6) this.b;
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (i < iArr.length) {
                    int i2 = iArr[i];
                    xt6Var.f.remove(Integer.valueOf(i2));
                    int i3 = xt6Var.e.get(i2, -1);
                    if (i3 == -1) {
                        xt6Var.c();
                        return;
                    }
                    i = td4.g(i3, i, 1, arrayList);
                }
                Collections.sort(arrayList);
                xt6Var.h();
                qe1.e(arrayList);
                xt6Var.g();
                xt6Var.e();
                return;
            default:
                return;
        }
    }

    @Override
    public final void o() {
        switch (this.a) {
            case 1:
                ((xt6) this.b).c();
                return;
            default:
                return;
        }
    }
}
