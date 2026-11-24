package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class z07 implements sr6, rr6 {
    public final sr6[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public rr6 f;
    public txb h;
    public sr6[] n;
    public lq2 r;

    public z07(ie7 ie7Var, long[] jArr, sr6... sr6VarArr) {
        this.a = sr6VarArr;
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        this.r = new lq2(w59Var, w59Var);
        this.c = new IdentityHashMap();
        this.n = new sr6[0];
        this.b = new boolean[sr6VarArr.length];
        for (int i = 0; i < sr6VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new rnb(sr6VarArr[i], j);
            }
        }
    }

    @Override
    public final void a(sr6 sr6Var) {
        ArrayList arrayList = this.d;
        arrayList.remove(sr6Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        sr6[] sr6VarArr = this.a;
        int i = 0;
        for (sr6 sr6Var2 : sr6VarArr) {
            i += sr6Var2.q().a;
        }
        sxb[] sxbVarArr = new sxb[i];
        int i2 = 0;
        for (int i3 = 0; i3 < sr6VarArr.length; i3++) {
            txb q = sr6VarArr[i3].q();
            int i4 = q.a;
            int i5 = 0;
            while (i5 < i4) {
                sxb a = q.a(i5);
                int i6 = a.a;
                fm4[] fm4VarArr = new fm4[i6];
                int i7 = 0;
                while (i7 < i6) {
                    fm4 fm4Var = a.d[i7];
                    em4 a2 = fm4Var.a();
                    String str = fm4Var.n;
                    sr6[] sr6VarArr2 = sr6VarArr;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i3);
                    sb.append(":");
                    String str2 = fm4Var.a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb.append(str2);
                    a2.a = sb.toString();
                    if (str != null) {
                        a2.m = i3 + ":" + str;
                    }
                    fm4VarArr[i7] = new fm4(a2);
                    i7++;
                    sr6VarArr = sr6VarArr2;
                }
                sr6[] sr6VarArr3 = sr6VarArr;
                sxb sxbVar = new sxb(i3 + ":" + a.b, fm4VarArr);
                this.e.put(sxbVar, a);
                sxbVarArr[i2] = sxbVar;
                i5++;
                i2++;
                sr6VarArr = sr6VarArr3;
            }
        }
        this.h = new txb(sxbVarArr);
        rr6 rr6Var = this.f;
        rr6Var.getClass();
        rr6Var.a(this);
    }

    @Override
    public final void b(q4a q4aVar) {
        sr6 sr6Var = (sr6) q4aVar;
        rr6 rr6Var = this.f;
        rr6Var.getClass();
        rr6Var.b(this);
    }

    @Override
    public final boolean d() {
        return this.r.d();
    }

    @Override
    public final long e(k64[] k64VarArr, boolean[] zArr, ip9[] ip9VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        ip9 ip9Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[k64VarArr.length];
        int[] iArr3 = new int[k64VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = k64VarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            ip9 ip9Var2 = ip9VarArr[i2];
            if (ip9Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(ip9Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr2[i2] = intValue;
            k64 k64Var = k64VarArr[i2];
            if (k64Var != null) {
                String str = k64Var.c().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = k64VarArr.length;
        ip9[] ip9VarArr2 = new ip9[length2];
        ip9[] ip9VarArr3 = new ip9[k64VarArr.length];
        k64[] k64VarArr2 = new k64[k64VarArr.length];
        sr6[] sr6VarArr = this.a;
        ArrayList arrayList = new ArrayList(sr6VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < sr6VarArr.length) {
            int i4 = i;
            while (i4 < k64VarArr.length) {
                if (iArr2[i4] == i3) {
                    ip9Var = ip9VarArr[i4];
                } else {
                    ip9Var = null;
                }
                ip9VarArr3[i4] = ip9Var;
                if (iArr3[i4] == i3) {
                    k64 k64Var2 = k64VarArr[i4];
                    k64Var2.getClass();
                    iArr = iArr2;
                    sxb sxbVar = (sxb) this.e.get(k64Var2.c());
                    sxbVar.getClass();
                    k64VarArr2[i4] = new y07(k64Var2, sxbVar);
                } else {
                    iArr = iArr2;
                    k64VarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            sr6[] sr6VarArr2 = sr6VarArr;
            int i5 = i3;
            long e = sr6VarArr2[i3].e(k64VarArr2, zArr, ip9VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = e;
            } else if (e != j2) {
                sc8.j("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < k64VarArr.length; i6++) {
                boolean z2 = true;
                if (iArr3[i6] == i5) {
                    ip9 ip9Var3 = ip9VarArr3[i6];
                    ip9Var3.getClass();
                    ip9VarArr2[i6] = ip9VarArr3[i6];
                    identityHashMap.put(ip9Var3, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    if (ip9VarArr3[i6] != null) {
                        z2 = false;
                    }
                    gre.p(z2);
                }
            }
            if (z) {
                arrayList.add(sr6VarArr2[i5]);
            }
            i3 = i5 + 1;
            sr6VarArr = sr6VarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(ip9VarArr2, i7, ip9VarArr, i7, length2);
        this.n = (sr6[]) arrayList.toArray(new sr6[i7]);
        this.r = new lq2(arrayList, tne.b(arrayList, new g31((byte) 16)));
        return j2;
    }

    @Override
    public final void f() {
        for (sr6 sr6Var : this.a) {
            sr6Var.f();
        }
    }

    @Override
    public final long g() {
        return this.r.g();
    }

    @Override
    public final long i(long j, gv9 gv9Var) {
        sr6 sr6Var;
        sr6[] sr6VarArr = this.n;
        if (sr6VarArr.length > 0) {
            sr6Var = sr6VarArr[0];
        } else {
            sr6Var = this.a[0];
        }
        return sr6Var.i(j, gv9Var);
    }

    @Override
    public final void k() {
        for (sr6 sr6Var : this.a) {
            sr6Var.k();
        }
    }

    @Override
    public final long l(long j) {
        long l = this.n[0].l(j);
        int i = 1;
        while (true) {
            sr6[] sr6VarArr = this.n;
            if (i < sr6VarArr.length) {
                if (sr6VarArr[i].l(l) == l) {
                    i++;
                } else {
                    sc8.j("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else {
                return l;
            }
        }
    }

    @Override
    public final void m(long j) {
        for (sr6 sr6Var : this.n) {
            sr6Var.m(j);
        }
    }

    @Override
    public final long o() {
        long j;
        sr6 sr6Var;
        sr6[] sr6VarArr = this.n;
        int length = sr6VarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            sr6 sr6Var2 = sr6VarArr[i];
            long o = sr6Var2.o();
            if (o != j2) {
                if (j3 == j2) {
                    sr6[] sr6VarArr2 = this.n;
                    int length2 = sr6VarArr2.length;
                    int i2 = 0;
                    while (true) {
                        j = j2;
                        if (i2 >= length2 || (sr6Var = sr6VarArr2[i2]) == sr6Var2) {
                            break;
                        } else if (sr6Var.l(o) == o) {
                            i2++;
                            j2 = j;
                        } else {
                            sc8.j("Unexpected child seekToUs result.");
                            return 0L;
                        }
                    }
                    j3 = o;
                } else {
                    j = j2;
                    if (o != j3) {
                        sc8.j("Conflicting discontinuities.");
                        return 0L;
                    }
                }
            } else {
                j = j2;
                if (j3 != j && sr6Var2.l(j3) != j3) {
                    sc8.j("Unexpected child seekToUs result.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override
    public final void p(rr6 rr6Var, long j) {
        this.f = rr6Var;
        ArrayList arrayList = this.d;
        sr6[] sr6VarArr = this.a;
        Collections.addAll(arrayList, sr6VarArr);
        for (sr6 sr6Var : sr6VarArr) {
            sr6Var.p(this, j);
        }
    }

    @Override
    public final txb q() {
        txb txbVar = this.h;
        txbVar.getClass();
        return txbVar;
    }

    @Override
    public final boolean r(t86 t86Var) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((sr6) arrayList.get(i)).r(t86Var);
            }
            return false;
        }
        return this.r.r(t86Var);
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
