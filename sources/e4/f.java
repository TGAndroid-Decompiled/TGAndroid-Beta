package e4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import h5.d0;
import h5.m;
import j3.c0;
import j3.d1;
import j3.e1;
import j3.f0;
import j3.n0;
import j7.c7;
import java.util.ArrayList;
public final class f extends j3.e implements Handler.Callback {
    public final d B;
    public final c0 C;
    public final Handler D;
    public final e E;
    public c7 F;
    public boolean G;
    public boolean H;
    public long I;
    public c J;
    public long K;

    public f(c0 c0Var, Looper looper) {
        super(5);
        Handler handler;
        this.C = c0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = d0.f6924a;
            handler = new Handler(looper, this);
        }
        this.D = handler;
        this.B = d.f5111a;
        this.E = new e();
        this.K = -9223372036854775807L;
    }

    public final long A(long j10) {
        boolean z4;
        boolean z10 = false;
        if (j10 != -9223372036854775807L) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        if (this.K != -9223372036854775807L) {
            z10 = true;
        }
        h5.a.i(z10);
        return j10 - this.K;
    }

    public final void B(c cVar) {
        c0 c0Var = this.C;
        f0 f0Var = c0Var.f8423a;
        e1 e1Var = f0Var.f8527e0;
        m mVar = f0Var.f8538l;
        d1 a2 = e1Var.a();
        int i10 = 0;
        while (true) {
            b[] bVarArr = cVar.f5109a;
            if (i10 >= bVarArr.length) {
                break;
            }
            bVarArr[i10].c(a2);
            i10++;
        }
        f0Var.f8527e0 = new e1(a2);
        e1 L = f0Var.L();
        if (!L.equals(f0Var.M)) {
            f0Var.M = L;
            mVar.c(14, new gg.f(c0Var, 12));
        }
        mVar.c(28, new gg.f(cVar, 13));
        mVar.b();
    }

    @Override
    public final String g() {
        return "MetadataRenderer";
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            B((c) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public final boolean i() {
        return this.H;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final void k() {
        this.J = null;
        this.F = null;
        this.K = -9223372036854775807L;
    }

    @Override
    public final void m(long j10, boolean z4) {
        this.J = null;
        this.G = false;
        this.H = false;
    }

    @Override
    public final void r(n0[] n0VarArr, long j10, long j11) {
        this.F = this.B.a(n0VarArr[0]);
        c cVar = this.J;
        if (cVar != null) {
            long j12 = cVar.f5110b;
            long j13 = (this.K + j12) - j11;
            if (j12 != j13) {
                cVar = new c(j13, cVar.f5109a);
            }
            this.J = cVar;
        }
        this.K = j11;
    }

    @Override
    public final void t(long j10, long j11) {
        boolean z4 = true;
        while (z4) {
            if (!this.G && this.J == null) {
                e eVar = this.E;
                eVar.b();
                f7.b bVar = this.f8472c;
                bVar.m();
                int s6 = s(bVar, eVar, 0);
                if (s6 == -4) {
                    if (eVar.d(4)) {
                        this.G = true;
                    } else {
                        eVar.f5112s = this.I;
                        eVar.l();
                        c7 c7Var = this.F;
                        int i10 = d0.f6924a;
                        c a2 = c7Var.a(eVar);
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList(a2.f5109a.length);
                            z(a2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.J = new c(A(eVar.f14227f), (b[]) arrayList.toArray(new b[0]));
                            }
                        }
                    }
                } else if (s6 == -5) {
                    n0 n0Var = (n0) bVar.f6002c;
                    n0Var.getClass();
                    this.I = n0Var.G;
                }
            }
            c cVar = this.J;
            if (cVar != null && cVar.f5110b <= A(j10)) {
                c cVar2 = this.J;
                Handler handler = this.D;
                if (handler != null) {
                    handler.obtainMessage(0, cVar2).sendToTarget();
                } else {
                    B(cVar2);
                }
                this.J = null;
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.G && this.J == null) {
                this.H = true;
            }
        }
    }

    @Override
    public final int x(n0 n0Var) {
        int i10;
        if (this.B.b(n0Var)) {
            if (n0Var.X == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return e2.c.b(i10, 0, 0);
        }
        return e2.c.b(0, 0, 0);
    }

    public final void z(c cVar, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            b[] bVarArr = cVar.f5109a;
            if (i10 < bVarArr.length) {
                n0 b10 = bVarArr[i10].b();
                if (b10 != null) {
                    d dVar = this.B;
                    if (dVar.b(b10)) {
                        c7 a2 = dVar.a(b10);
                        byte[] d = bVarArr[i10].d();
                        d.getClass();
                        e eVar = this.E;
                        eVar.b();
                        eVar.k(d.length);
                        eVar.d.put(d);
                        eVar.l();
                        c a10 = a2.a(eVar);
                        if (a10 != null) {
                            z(a10, arrayList);
                        }
                        i10++;
                    }
                }
                arrayList.add(bVarArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }
}
