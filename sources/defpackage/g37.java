package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class g37 implements xt6, wt6 {
    public final xt6[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public wt6 f;
    public u1c h;
    public xt6[] n;
    public er2 r;

    public g37(rg7 rg7Var, long[] jArr, xt6... xt6VarArr) {
        this.a = xt6VarArr;
        no5 no5Var = po5.b;
        j99 j99Var = j99.e;
        this.r = new er2(j99Var, j99Var);
        this.c = new IdentityHashMap();
        this.n = new xt6[0];
        this.b = new boolean[xt6VarArr.length];
        for (int i = 0; i < xt6VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new rrb(xt6VarArr[i], j);
            }
        }
    }

    @Override
    public final void a(xt6 xt6Var) {
        ArrayList arrayList = this.d;
        arrayList.remove(xt6Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        xt6[] xt6VarArr = this.a;
        int i = 0;
        for (xt6 xt6Var2 : xt6VarArr) {
            i += xt6Var2.r().a;
        }
        t1c[] t1cVarArr = new t1c[i];
        int i2 = 0;
        for (int i3 = 0; i3 < xt6VarArr.length; i3++) {
            u1c r = xt6VarArr[i3].r();
            int i4 = r.a;
            int i5 = 0;
            while (i5 < i4) {
                t1c a = r.a(i5);
                int i6 = a.a;
                ko4[] ko4VarArr = new ko4[i6];
                int i7 = 0;
                while (i7 < i6) {
                    ko4 ko4Var = a.d[i7];
                    jo4 a2 = ko4Var.a();
                    String str = ko4Var.n;
                    xt6[] xt6VarArr2 = xt6VarArr;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i3);
                    sb.append(":");
                    String str2 = ko4Var.a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb.append(str2);
                    a2.a = sb.toString();
                    if (str != null) {
                        a2.m = i3 + ":" + str;
                    }
                    ko4VarArr[i7] = new ko4(a2);
                    i7++;
                    xt6VarArr = xt6VarArr2;
                }
                xt6[] xt6VarArr3 = xt6VarArr;
                t1c t1cVar = new t1c(i3 + ":" + a.b, ko4VarArr);
                this.e.put(t1cVar, a);
                t1cVarArr[i2] = t1cVar;
                i5++;
                i2++;
                xt6VarArr = xt6VarArr3;
            }
        }
        this.h = new u1c(t1cVarArr);
        wt6 wt6Var = this.f;
        wt6Var.getClass();
        wt6Var.a(this);
    }

    @Override
    public final long c(e74[] e74VarArr, boolean[] zArr, at9[] at9VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        at9 at9Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[e74VarArr.length];
        int[] iArr3 = new int[e74VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = e74VarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            at9 at9Var2 = at9VarArr[i2];
            if (at9Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(at9Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr2[i2] = intValue;
            e74 e74Var = e74VarArr[i2];
            if (e74Var != null) {
                String str = e74Var.c().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = e74VarArr.length;
        at9[] at9VarArr2 = new at9[length2];
        at9[] at9VarArr3 = new at9[e74VarArr.length];
        e74[] e74VarArr2 = new e74[e74VarArr.length];
        xt6[] xt6VarArr = this.a;
        ArrayList arrayList = new ArrayList(xt6VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < xt6VarArr.length) {
            int i4 = i;
            while (i4 < e74VarArr.length) {
                if (iArr2[i4] == i3) {
                    at9Var = at9VarArr[i4];
                } else {
                    at9Var = null;
                }
                at9VarArr3[i4] = at9Var;
                if (iArr3[i4] == i3) {
                    e74 e74Var2 = e74VarArr[i4];
                    e74Var2.getClass();
                    iArr = iArr2;
                    t1c t1cVar = (t1c) this.e.get(e74Var2.c());
                    t1cVar.getClass();
                    e74VarArr2[i4] = new f37(e74Var2, t1cVar);
                } else {
                    iArr = iArr2;
                    e74VarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            xt6[] xt6VarArr2 = xt6VarArr;
            int i5 = i3;
            long c = xt6VarArr2[i3].c(e74VarArr2, zArr, at9VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = c;
            } else if (c != j2) {
                grb.i("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < e74VarArr.length; i6++) {
                boolean z2 = true;
                if (iArr3[i6] == i5) {
                    at9 at9Var3 = at9VarArr3[i6];
                    at9Var3.getClass();
                    at9VarArr2[i6] = at9VarArr3[i6];
                    identityHashMap.put(at9Var3, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    if (at9VarArr3[i6] != null) {
                        z2 = false;
                    }
                    yve.p(z2);
                }
            }
            if (z) {
                arrayList.add(xt6VarArr2[i5]);
            }
            i3 = i5 + 1;
            xt6VarArr = xt6VarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(at9VarArr2, i7, at9VarArr, i7, length2);
        this.n = (xt6[]) arrayList.toArray(new xt6[i7]);
        this.r = new er2(arrayList, ose.b(arrayList, new p31((byte) 16)));
        return j2;
    }

    @Override
    public final void d() {
        for (xt6 xt6Var : this.a) {
            xt6Var.d();
        }
    }

    @Override
    public final boolean e() {
        return this.r.e();
    }

    @Override
    public final void f(i8a i8aVar) {
        xt6 xt6Var = (xt6) i8aVar;
        wt6 wt6Var = this.f;
        wt6Var.getClass();
        wt6Var.f(this);
    }

    @Override
    public final long h() {
        return this.r.h();
    }

    @Override
    public final long j(long j, az9 az9Var) {
        xt6 xt6Var;
        xt6[] xt6VarArr = this.n;
        if (xt6VarArr.length > 0) {
            xt6Var = xt6VarArr[0];
        } else {
            xt6Var = this.a[0];
        }
        return xt6Var.j(j, az9Var);
    }

    @Override
    public final void l() {
        for (xt6 xt6Var : this.a) {
            xt6Var.l();
        }
    }

    @Override
    public final long m(long j) {
        long m = this.n[0].m(j);
        int i = 1;
        while (true) {
            xt6[] xt6VarArr = this.n;
            if (i < xt6VarArr.length) {
                if (xt6VarArr[i].m(m) == m) {
                    i++;
                } else {
                    grb.i("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else {
                return m;
            }
        }
    }

    @Override
    public final void n(long j) {
        for (xt6 xt6Var : this.n) {
            xt6Var.n(j);
        }
    }

    @Override
    public final long p() {
        long j;
        xt6 xt6Var;
        xt6[] xt6VarArr = this.n;
        int length = xt6VarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            xt6 xt6Var2 = xt6VarArr[i];
            long p = xt6Var2.p();
            if (p != j2) {
                if (j3 == j2) {
                    xt6[] xt6VarArr2 = this.n;
                    int length2 = xt6VarArr2.length;
                    int i2 = 0;
                    while (true) {
                        j = j2;
                        if (i2 >= length2 || (xt6Var = xt6VarArr2[i2]) == xt6Var2) {
                            break;
                        } else if (xt6Var.m(p) == p) {
                            i2++;
                            j2 = j;
                        } else {
                            grb.i("Unexpected child seekToUs result.");
                            return 0L;
                        }
                    }
                    j3 = p;
                } else {
                    j = j2;
                    if (p != j3) {
                        grb.i("Conflicting discontinuities.");
                        return 0L;
                    }
                }
            } else {
                j = j2;
                if (j3 != j && xt6Var2.m(j3) != j3) {
                    grb.i("Unexpected child seekToUs result.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override
    public final void q(wt6 wt6Var, long j) {
        this.f = wt6Var;
        ArrayList arrayList = this.d;
        xt6[] xt6VarArr = this.a;
        Collections.addAll(arrayList, xt6VarArr);
        for (xt6 xt6Var : xt6VarArr) {
            xt6Var.q(this, j);
        }
    }

    @Override
    public final u1c r() {
        u1c u1cVar = this.h;
        u1cVar.getClass();
        return u1cVar;
    }

    @Override
    public final boolean s(xa6 xa6Var) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((xt6) arrayList.get(i)).s(xa6Var);
            }
            return false;
        }
        return this.r.s(xa6Var);
    }

    @Override
    public final long t() {
        return this.r.t();
    }

    @Override
    public final void u(long j) {
        this.r.u(j);
    }
}
