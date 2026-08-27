package n5;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.g3;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.r2;
import com.google.android.gms.internal.cast.t6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public final class d0 extends o5.g {

    public final int f18312a;

    public final Object f18313b;

    public d0(Object obj, int i10) {
        this.f18312a = i10;
        this.f18313b = obj;
    }

    @Override
    public void a() {
        switch (this.f18312a) {
            case 2:
                ((p5.h) this.f18313b).b();
                break;
        }
    }

    @Override
    public void c() {
        switch (this.f18312a) {
            case 2:
                ((p5.h) this.f18313b).b();
                break;
        }
    }

    @Override
    public void d() {
        switch (this.f18312a) {
            case 2:
                ((p5.h) this.f18313b).b();
                break;
        }
    }

    @Override
    public void e() {
        switch (this.f18312a) {
            case 2:
                ((p5.h) this.f18313b).b();
                break;
        }
    }

    @Override
    public void g() {
        switch (this.f18312a) {
            case 1:
                o5.c cVar = (o5.c) this.f18313b;
                long jE = cVar.e();
                if (jE != cVar.f19306b) {
                    cVar.f19306b = jE;
                    cVar.c();
                    if (cVar.f19306b != 0) {
                        cVar.d();
                    }
                }
                break;
            case 2:
                ((p5.h) this.f18313b).b();
                break;
        }
    }

    @Override
    public void h(String str, long j10, int i10, long j11, long j12) {
        switch (this.f18312a) {
            case 0:
                m4 m4Var = ((c) this.f18313b).f18310l;
                if (m4Var != null) {
                    t6 t6VarF = m4Var.f3588a.F();
                    r2 r2Var = new r2(str);
                    r2Var.f3640b = j10;
                    r2Var.f3641c = i10;
                    r2Var.d = j11;
                    r2Var.f3642e = j12;
                    g3 g3Var = new g3(r2Var);
                    g3Var.f3541f = t6VarF.h;
                    t6VarF.d.add(g3Var);
                }
                break;
        }
    }

    @Override
    public void i(int[] iArr) {
        switch (this.f18312a) {
            case 1:
                o5.c cVar = (o5.c) this.f18313b;
                ArrayList arrayListC = r5.a.c(iArr);
                if (!cVar.d.equals(arrayListC)) {
                    cVar.h();
                    cVar.f19309f.evictAll();
                    cVar.f19310g.clear();
                    cVar.d = arrayListC;
                    o5.c.b(cVar);
                    cVar.g();
                    cVar.f();
                    break;
                }
                break;
        }
    }

    @Override
    public void j(int[] iArr, int i10) {
        int size;
        switch (this.f18312a) {
            case 1:
                if (i10 == 0) {
                    size = ((o5.c) this.f18313b).d.size();
                } else {
                    size = ((o5.c) this.f18313b).f19308e.get(i10, -1);
                    if (size == -1) {
                        ((o5.c) this.f18313b).d();
                        return;
                    }
                }
                ((o5.c) this.f18313b).h();
                ((o5.c) this.f18313b).d.addAll(size, r5.a.c(iArr));
                o5.c.b((o5.c) this.f18313b);
                o5.c cVar = (o5.c) this.f18313b;
                synchronized (cVar.f19315m) {
                    Iterator it = cVar.f19315m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((o5.c) this.f18313b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void k(m5.p[] pVarArr) {
        switch (this.f18312a) {
            case 1:
                HashSet hashSet = new HashSet();
                o5.c cVar = (o5.c) this.f18313b;
                SparseIntArray sparseIntArray = cVar.f19308e;
                ArrayList arrayList = cVar.f19310g;
                arrayList.clear();
                int i10 = 0;
                for (m5.p pVar : pVarArr) {
                    int i11 = pVar.f17825b;
                    cVar.f19309f.put(Integer.valueOf(i11), pVar);
                    int i12 = sparseIntArray.get(i11, -1);
                    if (i12 == -1) {
                        cVar.d();
                    } else {
                        hashSet.add(Integer.valueOf(i12));
                    }
                    break;
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
                r5.a.e(arrayList2);
                o5.c.a(cVar);
                cVar.f();
                break;
        }
    }

    @Override
    public void l(int[] iArr) {
        switch (this.f18312a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i10 : iArr) {
                    ((o5.c) this.f18313b).f19309f.remove(Integer.valueOf(i10));
                    int i11 = ((o5.c) this.f18313b).f19308e.get(i10, -1);
                    if (i11 == -1) {
                        ((o5.c) this.f18313b).d();
                        return;
                    } else {
                        ((o5.c) this.f18313b).f19308e.delete(i10);
                        arrayList.add(Integer.valueOf(i11));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Collections.sort(arrayList);
                ((o5.c) this.f18313b).h();
                ((o5.c) this.f18313b).d.removeAll(r5.a.c(iArr));
                o5.c.b((o5.c) this.f18313b);
                o5.c cVar = (o5.c) this.f18313b;
                r5.a.e(arrayList);
                synchronized (cVar.f19315m) {
                    Iterator it = cVar.f19315m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((o5.c) this.f18313b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void m(ArrayList arrayList, ArrayList arrayList2, int i10) {
        switch (this.f18312a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                if (i10 == 0) {
                    ((o5.c) this.f18313b).d.size();
                } else if (arrayList2.isEmpty()) {
                    r5.b bVar = ((o5.c) this.f18313b).f19305a;
                    Log.w(bVar.f46768a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((o5.c) this.f18313b).f19308e.get(i10, -1) == -1) {
                    o5.c cVar = (o5.c) this.f18313b;
                    cVar.f19308e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    int i12 = ((o5.c) this.f18313b).f19308e.get(((Integer) obj).intValue(), -1);
                    if (i12 == -1) {
                        ((o5.c) this.f18313b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i12));
                }
                ((o5.c) this.f18313b).h();
                o5.c cVar2 = (o5.c) this.f18313b;
                cVar2.d = arrayList;
                o5.c.b(cVar2);
                o5.c cVar3 = (o5.c) this.f18313b;
                synchronized (cVar3.f19315m) {
                    Iterator it = cVar3.f19315m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                ((o5.c) this.f18313b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void n(int[] iArr) {
        switch (this.f18312a) {
            case 1:
                o5.c cVar = (o5.c) this.f18313b;
                ArrayList arrayList = new ArrayList();
                int iF = 0;
                while (iF < iArr.length) {
                    int i10 = iArr[iF];
                    cVar.f19309f.remove(Integer.valueOf(i10));
                    int i11 = cVar.f19308e.get(i10, -1);
                    if (i11 == -1) {
                        cVar.d();
                    } else {
                        iF = i0.a.f(i11, iF, 1, arrayList);
                    }
                    break;
                }
                Collections.sort(arrayList);
                cVar.h();
                r5.a.e(arrayList);
                o5.c.a(cVar);
                cVar.f();
                break;
        }
    }

    @Override
    public void o() {
        switch (this.f18312a) {
            case 1:
                ((o5.c) this.f18313b).d();
                break;
        }
    }
}
