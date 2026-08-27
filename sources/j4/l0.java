package j4;

import h3.j2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

public final class l0 implements z, y {

    public final z[] f12607a;

    public final IdentityHashMap f12608b;

    public final za.b f12609c;
    public final ArrayList d = new ArrayList();

    public final HashMap f12610e = new HashMap();

    public y f12611f;
    public j1 h;

    public z[] f12612n;

    public a9.i f12613r;

    public l0(za.b bVar, long[] jArr, z... zVarArr) {
        this.f12609c = bVar;
        this.f12607a = zVarArr;
        bVar.getClass();
        this.f12613r = new a9.i(new d1[0], 21);
        this.f12608b = new IdentityHashMap();
        this.f12612n = new z[0];
        for (int i10 = 0; i10 < zVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f12607a[i10] = new j0(zVarArr[i10], j10);
            }
        }
    }

    @Override
    public final long B(long j10, j2 j2Var) {
        z[] zVarArr = this.f12612n;
        return (zVarArr.length > 0 ? zVarArr[0] : this.f12607a[0]).B(j10, j2Var);
    }

    @Override
    public final long D() {
        return this.f12613r.D();
    }

    @Override
    public final void E(y yVar, long j10) {
        this.f12611f = yVar;
        ArrayList arrayList = this.d;
        z[] zVarArr = this.f12607a;
        Collections.addAll(arrayList, zVarArr);
        for (z zVar : zVarArr) {
            zVar.E(this, j10);
        }
    }

    @Override
    public final long F(b5.s[] sVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[sVarArr.length];
        int[] iArr2 = new int[sVarArr.length];
        int i10 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.f12608b;
            if (i10 >= length) {
                break;
            }
            b1 b1Var = b1VarArr[i10];
            Integer num = b1Var == null ? null : (Integer) identityHashMap.get(b1Var);
            iArr[i10] = num == null ? -1 : num.intValue();
            b5.s sVar = sVarArr[i10];
            if (sVar != null) {
                String str = sVar.b().f12584b;
                iArr2[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        b1[] b1VarArr2 = new b1[length2];
        b1[] b1VarArr3 = new b1[sVarArr.length];
        b5.s[] sVarArr2 = new b5.s[sVarArr.length];
        z[] zVarArr = this.f12607a;
        ArrayList arrayList = new ArrayList(zVarArr.length);
        long j11 = j10;
        int i11 = 0;
        while (i11 < zVarArr.length) {
            int i12 = 0;
            while (i12 < sVarArr.length) {
                b1VarArr3[i12] = iArr[i12] == i11 ? b1VarArr[i12] : null;
                if (iArr2[i12] == i11) {
                    b5.s sVar2 = sVarArr[i12];
                    sVar2.getClass();
                    i1 i1Var = (i1) this.f12610e.get(sVar2.b());
                    i1Var.getClass();
                    sVarArr2[i12] = new i0(sVar2, i1Var);
                } else {
                    sVarArr2[i12] = null;
                }
                i12++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            z[] zVarArr2 = zVarArr;
            int i13 = i11;
            long jF = zVarArr2[i11].F(sVarArr2, zArr, b1VarArr3, zArr2, j11);
            if (i13 == 0) {
                j11 = jF;
            } else if (jF != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < sVarArr.length; i14++) {
                if (iArr2[i14] == i13) {
                    b1 b1Var2 = b1VarArr3[i14];
                    b1Var2.getClass();
                    b1VarArr2[i14] = b1VarArr3[i14];
                    identityHashMap.put(b1Var2, Integer.valueOf(i13));
                    z10 = true;
                } else if (iArr3[i14] == i13) {
                    d5.a.i(b1VarArr3[i14] == null);
                }
            }
            if (z10) {
                arrayList.add(zVarArr2[i13]);
            }
            i11 = i13 + 1;
            zVarArr = zVarArr2;
            iArr = iArr3;
        }
        System.arraycopy(b1VarArr2, 0, b1VarArr, 0, length2);
        z[] zVarArr3 = (z[]) arrayList.toArray(new z[0]);
        this.f12612n = zVarArr3;
        this.f12609c.getClass();
        this.f12613r = new a9.i(zVarArr3, 21);
        return j11;
    }

    @Override
    public final void I(long j10) {
        this.f12613r.I(j10);
    }

    @Override
    public final void a(d1 d1Var) {
        y yVar = this.f12611f;
        yVar.getClass();
        yVar.a(this);
    }

    @Override
    public final boolean b() {
        return this.f12613r.b();
    }

    @Override
    public final void e(z zVar) {
        ArrayList arrayList = this.d;
        arrayList.remove(zVar);
        if (arrayList.isEmpty()) {
            z[] zVarArr = this.f12607a;
            int i10 = 0;
            for (z zVar2 : zVarArr) {
                i10 += zVar2.z().f12593a;
            }
            i1[] i1VarArr = new i1[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < zVarArr.length; i12++) {
                j1 j1VarZ = zVarArr[i12].z();
                int i13 = j1VarZ.f12593a;
                int i14 = 0;
                while (i14 < i13) {
                    i1 i1VarA = j1VarZ.a(i14);
                    i1 i1Var = new i1(i12 + ":" + i1VarA.f12584b, i1VarA.d);
                    this.f12610e.put(i1Var, i1VarA);
                    i1VarArr[i11] = i1Var;
                    i14++;
                    i11++;
                }
            }
            this.h = new j1(i1VarArr);
            y yVar = this.f12611f;
            yVar.getClass();
            yVar.e(this);
        }
    }

    @Override
    public final long g() {
        return this.f12613r.g();
    }

    @Override
    public final void m() {
        for (z zVar : this.f12607a) {
            zVar.m();
        }
    }

    @Override
    public final long o(long j10) {
        long jO = this.f12612n[0].o(j10);
        int i10 = 1;
        while (true) {
            z[] zVarArr = this.f12612n;
            if (i10 >= zVarArr.length) {
                return jO;
            }
            if (zVarArr[i10].o(jO) != jO) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override
    public final void p(long j10) {
        for (z zVar : this.f12612n) {
            zVar.p(j10);
        }
    }

    @Override
    public final boolean q(long j10) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.f12613r.q(j10);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((z) arrayList.get(i10)).q(j10);
        }
        return false;
    }

    @Override
    public final long w() {
        long j10 = -9223372036854775807L;
        for (z zVar : this.f12612n) {
            long jW = zVar.w();
            if (jW == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && zVar.o(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (z zVar2 : this.f12612n) {
                    if (zVar2 == zVar) {
                        break;
                    }
                    if (zVar2.o(jW) != jW) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jW;
            } else if (jW != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override
    public final j1 z() {
        j1 j1Var = this.h;
        j1Var.getClass();
        return j1Var;
    }
}
