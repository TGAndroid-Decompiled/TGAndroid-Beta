package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class z27 implements tt6, st6 {
    public final tt6[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public st6 f;
    public vzb h;
    public tt6[] n;
    public wr2 r;

    public z27(kg7 kg7Var, long[] jArr, tt6... tt6VarArr) {
        this.a = tt6VarArr;
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        this.r = new wr2(y79Var, y79Var);
        this.c = new IdentityHashMap();
        this.n = new tt6[0];
        this.b = new boolean[tt6VarArr.length];
        for (int i = 0; i < tt6VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new spb(tt6VarArr[i], j);
            }
        }
    }

    @Override
    public final void a(tt6 tt6Var) {
        ArrayList arrayList = this.d;
        arrayList.remove(tt6Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        tt6[] tt6VarArr = this.a;
        int i = 0;
        for (tt6 tt6Var2 : tt6VarArr) {
            i += tt6Var2.q().a;
        }
        uzb[] uzbVarArr = new uzb[i];
        int i2 = 0;
        for (int i3 = 0; i3 < tt6VarArr.length; i3++) {
            vzb q = tt6VarArr[i3].q();
            int i4 = q.a;
            int i5 = 0;
            while (i5 < i4) {
                uzb a = q.a(i5);
                int i6 = a.a;
                go4[] go4VarArr = new go4[i6];
                int i7 = 0;
                while (i7 < i6) {
                    go4 go4Var = a.d[i7];
                    fo4 a2 = go4Var.a();
                    String str = go4Var.n;
                    tt6[] tt6VarArr2 = tt6VarArr;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i3);
                    sb.append(":");
                    String str2 = go4Var.a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb.append(str2);
                    a2.a = sb.toString();
                    if (str != null) {
                        a2.m = i3 + ":" + str;
                    }
                    go4VarArr[i7] = new go4(a2);
                    i7++;
                    tt6VarArr = tt6VarArr2;
                }
                tt6[] tt6VarArr3 = tt6VarArr;
                uzb uzbVar = new uzb(i3 + ":" + a.b, go4VarArr);
                this.e.put(uzbVar, a);
                uzbVarArr[i2] = uzbVar;
                i5++;
                i2++;
                tt6VarArr = tt6VarArr3;
            }
        }
        this.h = new vzb(uzbVarArr);
        st6 st6Var = this.f;
        st6Var.getClass();
        st6Var.a(this);
    }

    @Override
    public final void b(s6a s6aVar) {
        tt6 tt6Var = (tt6) s6aVar;
        st6 st6Var = this.f;
        st6Var.getClass();
        st6Var.b(this);
    }

    @Override
    public final long c(t74[] t74VarArr, boolean[] zArr, jr9[] jr9VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        jr9 jr9Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[t74VarArr.length];
        int[] iArr3 = new int[t74VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = t74VarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            jr9 jr9Var2 = jr9VarArr[i2];
            if (jr9Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(jr9Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr2[i2] = intValue;
            t74 t74Var = t74VarArr[i2];
            if (t74Var != null) {
                String str = t74Var.c().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = t74VarArr.length;
        jr9[] jr9VarArr2 = new jr9[length2];
        jr9[] jr9VarArr3 = new jr9[t74VarArr.length];
        t74[] t74VarArr2 = new t74[t74VarArr.length];
        tt6[] tt6VarArr = this.a;
        ArrayList arrayList = new ArrayList(tt6VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < tt6VarArr.length) {
            int i4 = i;
            while (i4 < t74VarArr.length) {
                if (iArr2[i4] == i3) {
                    jr9Var = jr9VarArr[i4];
                } else {
                    jr9Var = null;
                }
                jr9VarArr3[i4] = jr9Var;
                if (iArr3[i4] == i3) {
                    t74 t74Var2 = t74VarArr[i4];
                    t74Var2.getClass();
                    iArr = iArr2;
                    uzb uzbVar = (uzb) this.e.get(t74Var2.c());
                    uzbVar.getClass();
                    t74VarArr2[i4] = new y27(t74Var2, uzbVar);
                } else {
                    iArr = iArr2;
                    t74VarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            tt6[] tt6VarArr2 = tt6VarArr;
            int i5 = i3;
            long c = tt6VarArr2[i3].c(t74VarArr2, zArr, jr9VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = c;
            } else if (c != j2) {
                dq9.m("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < t74VarArr.length; i6++) {
                boolean z2 = true;
                if (iArr3[i6] == i5) {
                    jr9 jr9Var3 = jr9VarArr3[i6];
                    jr9Var3.getClass();
                    jr9VarArr2[i6] = jr9VarArr3[i6];
                    identityHashMap.put(jr9Var3, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    if (jr9VarArr3[i6] != null) {
                        z2 = false;
                    }
                    jte.p(z2);
                }
            }
            if (z) {
                arrayList.add(tt6VarArr2[i5]);
            }
            i3 = i5 + 1;
            tt6VarArr = tt6VarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(jr9VarArr2, i7, jr9VarArr, i7, length2);
        this.n = (tt6[]) arrayList.toArray(new tt6[i7]);
        this.r = new wr2(arrayList, wpe.b(arrayList, new o41((byte) 16)));
        return j2;
    }

    @Override
    public final void e() {
        for (tt6 tt6Var : this.a) {
            tt6Var.e();
        }
    }

    @Override
    public final boolean f() {
        return this.r.f();
    }

    @Override
    public final long g() {
        return this.r.g();
    }

    @Override
    public final long h(long j, jx9 jx9Var) {
        tt6 tt6Var;
        tt6[] tt6VarArr = this.n;
        if (tt6VarArr.length > 0) {
            tt6Var = tt6VarArr[0];
        } else {
            tt6Var = this.a[0];
        }
        return tt6Var.h(j, jx9Var);
    }

    @Override
    public final void j() {
        for (tt6 tt6Var : this.a) {
            tt6Var.j();
        }
    }

    @Override
    public final long k(long j) {
        long k = this.n[0].k(j);
        int i = 1;
        while (true) {
            tt6[] tt6VarArr = this.n;
            if (i < tt6VarArr.length) {
                if (tt6VarArr[i].k(k) == k) {
                    i++;
                } else {
                    dq9.m("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else {
                return k;
            }
        }
    }

    @Override
    public final void l(long j) {
        for (tt6 tt6Var : this.n) {
            tt6Var.l(j);
        }
    }

    @Override
    public final long n() {
        long j;
        tt6 tt6Var;
        tt6[] tt6VarArr = this.n;
        int length = tt6VarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            tt6 tt6Var2 = tt6VarArr[i];
            long n = tt6Var2.n();
            if (n != j2) {
                if (j3 == j2) {
                    tt6[] tt6VarArr2 = this.n;
                    int length2 = tt6VarArr2.length;
                    int i2 = 0;
                    while (true) {
                        j = j2;
                        if (i2 >= length2 || (tt6Var = tt6VarArr2[i2]) == tt6Var2) {
                            break;
                        } else if (tt6Var.k(n) == n) {
                            i2++;
                            j2 = j;
                        } else {
                            dq9.m("Unexpected child seekToUs result.");
                            return 0L;
                        }
                    }
                    j3 = n;
                } else {
                    j = j2;
                    if (n != j3) {
                        dq9.m("Conflicting discontinuities.");
                        return 0L;
                    }
                }
            } else {
                j = j2;
                if (j3 != j && tt6Var2.k(j3) != j3) {
                    dq9.m("Unexpected child seekToUs result.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override
    public final void o(st6 st6Var, long j) {
        this.f = st6Var;
        ArrayList arrayList = this.d;
        tt6[] tt6VarArr = this.a;
        Collections.addAll(arrayList, tt6VarArr);
        for (tt6 tt6Var : tt6VarArr) {
            tt6Var.o(this, j);
        }
    }

    @Override
    public final vzb q() {
        vzb vzbVar = this.h;
        vzbVar.getClass();
        return vzbVar;
    }

    @Override
    public final boolean r(sa6 sa6Var) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((tt6) arrayList.get(i)).r(sa6Var);
            }
            return false;
        }
        return this.r.r(sa6Var);
    }

    @Override
    public final long s() {
        return this.r.s();
    }

    @Override
    public final void t(long j) {
        this.r.t(j);
    }
}
