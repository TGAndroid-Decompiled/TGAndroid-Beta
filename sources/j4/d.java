package j4;

import h3.j2;
import java.util.ArrayList;

public final class d implements z, y {

    public final z f12533a;

    public y f12534b;

    public c[] f12535c = new c[0];
    public long d;

    public long f12536e;

    public long f12537f;
    public f h;

    public d(z zVar, boolean z10, long j10, long j11) {
        this.f12533a = zVar;
        this.d = z10 ? j10 : -9223372036854775807L;
        this.f12536e = j10;
        this.f12537f = j11;
    }

    @Override
    public final long B(long j10, j2 j2Var) {
        long j11 = this.f12536e;
        if (j10 == j11) {
            return j11;
        }
        long jI = d5.g0.i(j2Var.f7954a, 0L, j10 - j11);
        long j12 = j2Var.f7955b;
        long j13 = this.f12537f;
        long jI2 = d5.g0.i(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10);
        if (jI != j2Var.f7954a || jI2 != j2Var.f7955b) {
            j2Var = new j2(jI, jI2);
        }
        return this.f12533a.B(j10, j2Var);
    }

    @Override
    public final long D() {
        long jD = this.f12533a.D();
        if (jD != Long.MIN_VALUE) {
            long j10 = this.f12537f;
            if (j10 == Long.MIN_VALUE || jD < j10) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void E(y yVar, long j10) {
        this.f12534b = yVar;
        this.f12533a.E(this, j10);
    }

    @Override
    public final long F(b5.s[] sVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        long j11;
        d5.p pVarE;
        int iA;
        this.f12535c = new c[b1VarArr.length];
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i10 = 0;
        while (true) {
            b1 b1Var = null;
            if (i10 >= b1VarArr.length) {
                break;
            }
            c[] cVarArr = this.f12535c;
            c cVar = (c) b1VarArr[i10];
            cVarArr[i10] = cVar;
            if (cVar != null) {
                b1Var = cVar.f12530a;
            }
            b1VarArr2[i10] = b1Var;
            i10++;
        }
        long jF = this.f12533a.F(sVarArr, zArr, b1VarArr2, zArr2, j10);
        boolean z10 = true;
        if (c()) {
            long j12 = this.f12536e;
            if (j10 != j12 || j12 == 0) {
                j11 = -9223372036854775807L;
            } else {
                int length = sVarArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        j11 = -9223372036854775807L;
                    } else {
                        b5.s sVar = sVarArr[i11];
                        if (sVar != null) {
                            h3.t0 t0VarO = sVar.o();
                            String str = t0VarO.B;
                            String str2 = t0VarO.f8190r;
                            ArrayList arrayList = d5.q.f4823a;
                            if (str != null) {
                                switch (str) {
                                    case "audio/eac3-joc":
                                    case "audio/mpeg-L1":
                                    case "audio/mpeg-L2":
                                    case "audio/ac3":
                                    case "audio/raw":
                                    case "audio/eac3":
                                    case "audio/flac":
                                    case "audio/mpeg":
                                    case "audio/g711-alaw":
                                    case "audio/g711-mlaw":
                                        continue;
                                        break;
                                    case "audio/mp4a-latm":
                                        if (str2 != null && (pVarE = d5.q.e(str2)) != null && (iA = pVarE.a()) != 0 && iA != 16) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                }
                            }
                            j11 = jF;
                        }
                        i11++;
                    }
                }
            }
        } else {
            j11 = -9223372036854775807L;
        }
        this.d = j11;
        if (jF != j10) {
            if (jF >= this.f12536e) {
                long j13 = this.f12537f;
                if (j13 != Long.MIN_VALUE && jF > j13) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        d5.a.i(z10);
        for (int i12 = 0; i12 < b1VarArr.length; i12++) {
            b1 b1Var2 = b1VarArr2[i12];
            if (b1Var2 == null) {
                this.f12535c[i12] = null;
            } else {
                c[] cVarArr2 = this.f12535c;
                c cVar2 = cVarArr2[i12];
                if (cVar2 == null || cVar2.f12530a != b1Var2) {
                    cVarArr2[i12] = new c(this, b1Var2);
                }
            }
            b1VarArr[i12] = this.f12535c[i12];
        }
        return jF;
    }

    @Override
    public final void I(long j10) {
        this.f12533a.I(j10);
    }

    @Override
    public final void a(d1 d1Var) {
        y yVar = this.f12534b;
        yVar.getClass();
        yVar.a(this);
    }

    @Override
    public final boolean b() {
        return this.f12533a.b();
    }

    public final boolean c() {
        return this.d != -9223372036854775807L;
    }

    @Override
    public final void e(z zVar) {
        if (this.h != null) {
            return;
        }
        y yVar = this.f12534b;
        yVar.getClass();
        yVar.e(this);
    }

    @Override
    public final long g() {
        long jG = this.f12533a.g();
        if (jG != Long.MIN_VALUE) {
            long j10 = this.f12537f;
            if (j10 == Long.MIN_VALUE || jG < j10) {
                return jG;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final void m() throws f {
        f fVar = this.h;
        if (fVar != null) {
            throw fVar;
        }
        this.f12533a.m();
    }

    @Override
    public final long o(long j10) {
        this.d = -9223372036854775807L;
        boolean z10 = false;
        for (c cVar : this.f12535c) {
            if (cVar != null) {
                cVar.f12531b = false;
            }
        }
        long jO = this.f12533a.o(j10);
        if (jO == j10) {
            z10 = true;
        } else if (jO >= this.f12536e) {
            long j11 = this.f12537f;
            if (j11 == Long.MIN_VALUE || jO <= j11) {
                z10 = true;
            }
        }
        d5.a.i(z10);
        return jO;
    }

    @Override
    public final void p(long j10) {
        this.f12533a.p(j10);
    }

    @Override
    public final boolean q(long j10) {
        return this.f12533a.q(j10);
    }

    @Override
    public final long w() {
        if (c()) {
            long j10 = this.d;
            this.d = -9223372036854775807L;
            long jW = w();
            return jW != -9223372036854775807L ? jW : j10;
        }
        long jW2 = this.f12533a.w();
        if (jW2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        d5.a.i(jW2 >= this.f12536e);
        long j11 = this.f12537f;
        d5.a.i(j11 == Long.MIN_VALUE || jW2 <= j11);
        return jW2;
    }

    @Override
    public final j1 z() {
        return this.f12533a.z();
    }
}
