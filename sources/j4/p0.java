package j4;

import java.io.IOException;

public final class p0 implements b1 {

    public final int f12641a;

    public final r0 f12642b;

    public p0(r0 r0Var, int i10) {
        this.f12642b = r0Var;
        this.f12641a = i10;
    }

    @Override
    public final void a() throws IOException {
        int i10 = this.f12641a;
        r0 r0Var = this.f12642b;
        r0Var.D[i10].w();
        com.google.android.exoplayer2.upstream.q0 q0Var = r0Var.f12656s;
        int iZ3 = r0Var.d.z3(r0Var.M);
        IOException iOException = q0Var.f3032c;
        if (iOException != null) {
            throw iOException;
        }
        com.google.android.exoplayer2.upstream.m0 m0Var = q0Var.f3031b;
        if (m0Var != null) {
            if (iZ3 == Integer.MIN_VALUE) {
                iZ3 = m0Var.f3001a;
            }
            IOException iOException2 = m0Var.f3004e;
            if (iOException2 != null && m0Var.f3005f > iZ3) {
                throw iOException2;
            }
        }
    }

    @Override
    public final boolean e() {
        r0 r0Var = this.f12642b;
        return !r0Var.v() && r0Var.D[this.f12641a].u(r0Var.V);
    }

    @Override
    public final int f(long j10) throws Throwable {
        r0 r0Var = this.f12642b;
        if (r0Var.v()) {
            return 0;
        }
        int i10 = this.f12641a;
        r0Var.r(i10);
        a1 a1Var = r0Var.D[i10];
        int iS = a1Var.s(j10, r0Var.V);
        a1Var.E(iS);
        if (iS == 0) {
            r0Var.s(i10);
        }
        return iS;
    }

    @Override
    public final int i(h3.u0 u0Var, k3.i iVar, int i10) {
        r0 r0Var = this.f12642b;
        if (r0Var.v()) {
            return -3;
        }
        int i11 = this.f12641a;
        r0Var.r(i11);
        int iZ = r0Var.D[i11].z(u0Var, iVar, i10, r0Var.V);
        if (iZ == -3) {
            r0Var.s(i11);
        }
        return iZ;
    }
}
