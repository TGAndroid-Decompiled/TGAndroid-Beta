package j4;

import h3.j2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
public final class m0 implements a0, z {
    public final a0[] f13511a;
    public final IdentityHashMap f13512b;
    public final za.a f13513c;
    public final ArrayList d = new ArrayList();
    public final HashMap f13514e = new HashMap();
    public z f13515f;
    public j1 h;
    public a0[] f13516n;
    public android.support.v4.media.c f13517r;

    public m0(za.a aVar, long[] jArr, a0... a0VarArr) {
        this.f13513c = aVar;
        this.f13511a = a0VarArr;
        aVar.getClass();
        this.f13517r = new android.support.v4.media.c(new d1[0], 19);
        this.f13512b = new IdentityHashMap();
        this.f13516n = new a0[0];
        for (int i9 = 0; i9 < a0VarArr.length; i9++) {
            long j10 = jArr[i9];
            if (j10 != 0) {
                this.f13511a[i9] = new k0(a0VarArr[i9], j10);
            }
        }
    }

    @Override
    public final boolean b() {
        return this.f13517r.b();
    }

    @Override
    public final void c(d1 d1Var) {
        a0 a0Var = (a0) d1Var;
        z zVar = this.f13515f;
        zVar.getClass();
        zVar.c(this);
    }

    @Override
    public final long d() {
        return this.f13517r.d();
    }

    @Override
    public final void f(a0 a0Var) {
        ArrayList arrayList = this.d;
        arrayList.remove(a0Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        a0[] a0VarArr = this.f13511a;
        int i9 = 0;
        for (a0 a0Var2 : a0VarArr) {
            i9 += a0Var2.q().f13491a;
        }
        i1[] i1VarArr = new i1[i9];
        int i10 = 0;
        for (int i11 = 0; i11 < a0VarArr.length; i11++) {
            j1 q10 = a0VarArr[i11].q();
            int i12 = q10.f13491a;
            int i13 = 0;
            while (i13 < i12) {
                i1 a2 = q10.a(i13);
                i1 i1Var = new i1(i11 + ":" + a2.f13482b, a2.d);
                this.f13514e.put(i1Var, a2);
                i1VarArr[i10] = i1Var;
                i13++;
                i10++;
            }
        }
        this.h = new j1(i1VarArr);
        z zVar = this.f13515f;
        zVar.getClass();
        zVar.f(this);
    }

    @Override
    public final void g() {
        for (a0 a0Var : this.f13511a) {
            a0Var.g();
        }
    }

    @Override
    public final long i(long j10) {
        long i9 = this.f13516n[0].i(j10);
        int i10 = 1;
        while (true) {
            a0[] a0VarArr = this.f13516n;
            if (i10 < a0VarArr.length) {
                if (a0VarArr[i10].i(i9) == i9) {
                    i10++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return i9;
            }
        }
    }

    @Override
    public final void k(long j10) {
        for (a0 a0Var : this.f13516n) {
            a0Var.k(j10);
        }
    }

    @Override
    public final boolean n(long j10) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((a0) arrayList.get(i9)).n(j10);
            }
            return false;
        }
        return this.f13517r.n(j10);
    }

    @Override
    public final long o() {
        a0[] a0VarArr;
        a0[] a0VarArr2;
        long j10 = -9223372036854775807L;
        for (a0 a0Var : this.f13516n) {
            long o6 = a0Var.o();
            if (o6 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (a0 a0Var2 : this.f13516n) {
                        if (a0Var2 == a0Var) {
                            break;
                        } else if (a0Var2.i(o6) != o6) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = o6;
                } else if (o6 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && a0Var.i(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override
    public final j1 q() {
        j1 j1Var = this.h;
        j1Var.getClass();
        return j1Var;
    }

    @Override
    public final long u(long j10, j2 j2Var) {
        a0 a0Var;
        a0[] a0VarArr = this.f13516n;
        if (a0VarArr.length > 0) {
            a0Var = a0VarArr[0];
        } else {
            a0Var = this.f13511a[0];
        }
        return a0Var.u(j10, j2Var);
    }

    @Override
    public final long v() {
        return this.f13517r.v();
    }

    @Override
    public final void w(z zVar, long j10) {
        this.f13515f = zVar;
        ArrayList arrayList = this.d;
        a0[] a0VarArr = this.f13511a;
        Collections.addAll(arrayList, a0VarArr);
        for (a0 a0Var : a0VarArr) {
            a0Var.w(this, j10);
        }
    }

    @Override
    public final long x(b5.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        b1 b1Var;
        int[] iArr;
        Integer num;
        int intValue;
        int[] iArr2 = new int[tVarArr.length];
        int[] iArr3 = new int[tVarArr.length];
        int i9 = 0;
        while (true) {
            int length = tVarArr.length;
            identityHashMap = this.f13512b;
            if (i9 >= length) {
                break;
            }
            b1 b1Var2 = b1VarArr[i9];
            if (b1Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(b1Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr2[i9] = intValue;
            b5.t tVar = tVarArr[i9];
            if (tVar != null) {
                String str = tVar.b().f13482b;
                iArr3[i9] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i9] = -1;
            }
            i9++;
        }
        identityHashMap.clear();
        int length2 = tVarArr.length;
        b1[] b1VarArr2 = new b1[length2];
        b1[] b1VarArr3 = new b1[tVarArr.length];
        b5.t[] tVarArr2 = new b5.t[tVarArr.length];
        a0[] a0VarArr = this.f13511a;
        ArrayList arrayList = new ArrayList(a0VarArr.length);
        long j11 = j10;
        int i10 = 0;
        while (i10 < a0VarArr.length) {
            int i11 = 0;
            while (i11 < tVarArr.length) {
                if (iArr2[i11] == i10) {
                    b1Var = b1VarArr[i11];
                } else {
                    b1Var = null;
                }
                b1VarArr3[i11] = b1Var;
                if (iArr3[i11] == i10) {
                    b5.t tVar2 = tVarArr[i11];
                    tVar2.getClass();
                    iArr = iArr2;
                    i1 i1Var = (i1) this.f13514e.get(tVar2.b());
                    i1Var.getClass();
                    tVarArr2[i11] = new j0(tVar2, i1Var);
                } else {
                    iArr = iArr2;
                    tVarArr2[i11] = null;
                }
                i11++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            a0[] a0VarArr2 = a0VarArr;
            int i12 = i10;
            long x10 = a0VarArr2[i10].x(tVarArr2, zArr, b1VarArr3, zArr2, j11);
            if (i12 == 0) {
                j11 = x10;
            } else if (x10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i13 = 0; i13 < tVarArr.length; i13++) {
                boolean z11 = true;
                if (iArr3[i13] == i12) {
                    b1 b1Var3 = b1VarArr3[i13];
                    b1Var3.getClass();
                    b1VarArr2[i13] = b1VarArr3[i13];
                    identityHashMap.put(b1Var3, Integer.valueOf(i12));
                    z10 = true;
                } else if (iArr4[i13] == i12) {
                    if (b1VarArr3[i13] != null) {
                        z11 = false;
                    }
                    d5.a.i(z11);
                }
            }
            if (z10) {
                arrayList.add(a0VarArr2[i12]);
            }
            i10 = i12 + 1;
            a0VarArr = a0VarArr2;
            iArr2 = iArr4;
        }
        System.arraycopy(b1VarArr2, 0, b1VarArr, 0, length2);
        a0[] a0VarArr3 = (a0[]) arrayList.toArray(new a0[0]);
        this.f13516n = a0VarArr3;
        this.f13513c.getClass();
        this.f13517r = new android.support.v4.media.c(a0VarArr3, 19);
        return j11;
    }

    @Override
    public final void z(long j10) {
        this.f13517r.z(j10);
    }
}
