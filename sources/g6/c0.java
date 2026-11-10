package g6;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.internal.cast.e3;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.p2;
import com.google.android.gms.internal.cast.r6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public final class c0 extends h6.g {
    public final int f13554a;
    public final Object f13555b;

    public c0(Object obj, int i7) {
        this.f13554a = i7;
        this.f13555b = obj;
    }

    @Override
    public void a() {
        switch (this.f13554a) {
            case 2:
                ((i6.h) this.f13555b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void c() {
        switch (this.f13554a) {
            case 2:
                ((i6.h) this.f13555b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        switch (this.f13554a) {
            case 2:
                ((i6.h) this.f13555b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void e() {
        switch (this.f13554a) {
            case 2:
                ((i6.h) this.f13555b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void g() {
        switch (this.f13554a) {
            case 1:
                h6.c cVar = (h6.c) this.f13555b;
                long e10 = cVar.e();
                if (e10 != cVar.f14224b) {
                    cVar.f14224b = e10;
                    cVar.c();
                    if (cVar.f14224b != 0) {
                        cVar.d();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((i6.h) this.f13555b).b();
                return;
            default:
                return;
        }
    }

    @Override
    public void h(String str, long j3, int i7, long j10, long j11) {
        switch (this.f13554a) {
            case 0:
                l4 l4Var = ((c) this.f13555b).f13553l;
                if (l4Var != null) {
                    r6 N = l4Var.f6901a.N();
                    p2 p2Var = new p2(str);
                    p2Var.f6950b = j3;
                    p2Var.f6951c = i7;
                    p2Var.d = j10;
                    p2Var.f6952e = j11;
                    e3 e3Var = new e3(p2Var);
                    e3Var.f6853f = N.h;
                    N.d.add(e3Var);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void i(int[] iArr) {
        switch (this.f13554a) {
            case 1:
                h6.c cVar = (h6.c) this.f13555b;
                ArrayList c10 = j6.a.c(iArr);
                if (!cVar.d.equals(c10)) {
                    cVar.h();
                    cVar.f14227f.evictAll();
                    cVar.f14228g.clear();
                    cVar.d = c10;
                    h6.c.b(cVar);
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
    public void j(int[] iArr, int i7) {
        int i10;
        switch (this.f13554a) {
            case 1:
                if (i7 == 0) {
                    i10 = ((h6.c) this.f13555b).d.size();
                } else {
                    i10 = ((h6.c) this.f13555b).f14226e.get(i7, -1);
                    if (i10 == -1) {
                        ((h6.c) this.f13555b).d();
                        return;
                    }
                }
                ((h6.c) this.f13555b).h();
                ((h6.c) this.f13555b).d.addAll(i10, j6.a.c(iArr));
                h6.c.b((h6.c) this.f13555b);
                h6.c cVar = (h6.c) this.f13555b;
                synchronized (cVar.f14233m) {
                    Iterator it = cVar.f14233m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((h6.c) this.f13555b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void k(f6.o[] oVarArr) {
        switch (this.f13554a) {
            case 1:
                HashSet hashSet = new HashSet();
                h6.c cVar = (h6.c) this.f13555b;
                SparseIntArray sparseIntArray = cVar.f14226e;
                ArrayList arrayList = cVar.f14228g;
                arrayList.clear();
                int i7 = 0;
                for (f6.o oVar : oVarArr) {
                    int i10 = oVar.f11307b;
                    cVar.f14227f.put(Integer.valueOf(i10), oVar);
                    int i11 = sparseIntArray.get(i10, -1);
                    if (i11 == -1) {
                        cVar.d();
                        return;
                    }
                    hashSet.add(Integer.valueOf(i11));
                }
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    int i12 = sparseIntArray.get(((Integer) obj).intValue(), -1);
                    if (i12 != -1) {
                        hashSet.add(Integer.valueOf(i12));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                cVar.h();
                j6.a.e(arrayList2);
                h6.c.a(cVar);
                cVar.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void l(int[] iArr) {
        switch (this.f13554a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (int i7 : iArr) {
                    ((h6.c) this.f13555b).f14227f.remove(Integer.valueOf(i7));
                    int i10 = ((h6.c) this.f13555b).f14226e.get(i7, -1);
                    if (i10 == -1) {
                        ((h6.c) this.f13555b).d();
                        return;
                    }
                    ((h6.c) this.f13555b).f14226e.delete(i7);
                    arrayList.add(Integer.valueOf(i10));
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    ((h6.c) this.f13555b).h();
                    ((h6.c) this.f13555b).d.removeAll(j6.a.c(iArr));
                    h6.c.b((h6.c) this.f13555b);
                    h6.c cVar = (h6.c) this.f13555b;
                    j6.a.e(arrayList);
                    synchronized (cVar.f14233m) {
                        Iterator it = cVar.f14233m.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    }
                    ((h6.c) this.f13555b).f();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void m(ArrayList arrayList, ArrayList arrayList2, int i7) {
        switch (this.f13554a) {
            case 1:
                ArrayList arrayList3 = new ArrayList();
                int i10 = 0;
                if (i7 == 0) {
                    ((h6.c) this.f13555b).d.size();
                } else if (arrayList2.isEmpty()) {
                    j6.b bVar = ((h6.c) this.f13555b).f14223a;
                    Log.w(bVar.f16508a, bVar.d("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else if (((h6.c) this.f13555b).f14226e.get(i7, -1) == -1) {
                    ((h6.c) this.f13555b).f14226e.get(((Integer) arrayList2.get(0)).intValue(), -1);
                }
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    int i11 = ((h6.c) this.f13555b).f14226e.get(((Integer) obj).intValue(), -1);
                    if (i11 == -1) {
                        ((h6.c) this.f13555b).d();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i11));
                }
                ((h6.c) this.f13555b).h();
                h6.c cVar = (h6.c) this.f13555b;
                cVar.d = arrayList;
                h6.c.b(cVar);
                h6.c cVar2 = (h6.c) this.f13555b;
                synchronized (cVar2.f14233m) {
                    Iterator it = cVar2.f14233m.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
                ((h6.c) this.f13555b).f();
                return;
            default:
                return;
        }
    }

    @Override
    public void n(int[] iArr) {
        switch (this.f13554a) {
            case 1:
                h6.c cVar = (h6.c) this.f13555b;
                ArrayList arrayList = new ArrayList();
                int i7 = 0;
                while (i7 < iArr.length) {
                    int i10 = iArr[i7];
                    cVar.f14227f.remove(Integer.valueOf(i10));
                    int i11 = cVar.f14226e.get(i10, -1);
                    if (i11 == -1) {
                        cVar.d();
                        return;
                    }
                    i7 = com.google.android.recaptcha.internal.a.f(i11, i7, 1, arrayList);
                }
                Collections.sort(arrayList);
                cVar.h();
                j6.a.e(arrayList);
                h6.c.a(cVar);
                cVar.f();
                return;
            default:
                return;
        }
    }

    @Override
    public void o() {
        switch (this.f13554a) {
            case 1:
                ((h6.c) this.f13555b).d();
                return;
            default:
                return;
        }
    }
}
