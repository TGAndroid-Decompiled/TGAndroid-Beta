package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.ArrayDeque;
public final class qn5 extends uh0 {
    public final uk0 K;
    public final la3 L;
    public final ArrayDeque M;
    public boolean N;
    public boolean O;
    public pn5 P;
    public long Q;
    public long R;
    public byte S;
    public int T;
    public go4 U;
    public vk0 V;
    public la3 W;
    public k74 X;
    public Bitmap Y;
    public boolean Z;
    public re1 a0;
    public re1 b0;
    public int c0;
    public boolean d0;

    public qn5(uk0 uk0Var) {
        super(4);
        this.K = uk0Var;
        this.L = new la3(0, 0);
        this.P = pn5.c;
        this.M = new ArrayDeque();
        this.R = -9223372036854775807L;
        this.Q = -9223372036854775807L;
        this.S = (byte) 0;
        this.T = 1;
    }

    @Override
    public final void B(long j, long j2) {
        if (!this.O) {
            if (this.U == null) {
                mj4 mj4Var = this.c;
                mj4Var.i();
                la3 la3Var = this.L;
                la3Var.clear();
                int A = A(mj4Var, la3Var, 2);
                if (A == -5) {
                    go4 go4Var = (go4) mj4Var.c;
                    go4Var.getClass();
                    this.U = go4Var;
                    this.d0 = true;
                } else if (A == -4) {
                    jte.p(la3Var.isEndOfStream());
                    this.N = true;
                    this.O = true;
                    return;
                } else {
                    return;
                }
            }
            if (this.V == null) {
                M();
            }
            try {
                Trace.beginSection("drainAndFeedDecoder");
                do {
                } while (K(j));
                do {
                } while (L(j));
                Trace.endSection();
            } catch (cm5 e) {
                throw e(e, null, false, 4003);
            }
        }
    }

    @Override
    public final int G(go4 go4Var) {
        return uk0.f(go4Var);
    }

    public final boolean K(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn5.K(long):boolean");
    }

    public final boolean L(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn5.L(long):boolean");
    }

    public final void M() {
        if (!this.d0) {
            return;
        }
        go4 go4Var = this.U;
        go4Var.getClass();
        int f = uk0.f(go4Var);
        if (f != kt6.a(4, 0, 0, 0) && f != kt6.a(3, 0, 0, 0)) {
            throw e(new Exception("Provided decoder factory can't create decoder for format."), this.U, false, 4005);
        }
        vk0 vk0Var = this.V;
        if (vk0Var != null) {
            vk0Var.release();
        }
        this.V = new vk0(this.K.a);
        this.d0 = false;
    }

    public final void N() {
        this.W = null;
        this.S = (byte) 0;
        this.R = -9223372036854775807L;
        vk0 vk0Var = this.V;
        if (vk0Var != null) {
            vk0Var.release();
            this.V = null;
        }
    }

    @Override
    public final void d(int i, Object obj) {
        if (i == 15 || i != 23) {
            return;
        }
        this.X = (k74) obj;
    }

    @Override
    public final String l() {
        return "ImageRenderer";
    }

    @Override
    public final boolean n() {
        return this.O;
    }

    @Override
    public final boolean o() {
        int i = this.T;
        if (i != 3) {
            if (i != 0 || !this.Z) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void q() {
        this.U = null;
        this.P = pn5.c;
        this.M.clear();
        N();
    }

    @Override
    public final void r(boolean z, boolean z2) {
        this.T = z2 ? 1 : 0;
    }

    @Override
    public final void s(long j, boolean z, boolean z2) {
        this.T = Math.min(this.T, 1);
        this.O = false;
        this.N = false;
        this.Y = null;
        this.a0 = null;
        this.b0 = null;
        this.Z = false;
        this.W = null;
        vk0 vk0Var = this.V;
        if (vk0Var != null) {
            vk0Var.flush();
        }
        this.M.clear();
    }

    @Override
    public final void t() {
        N();
    }

    @Override
    public final void v() {
        N();
        this.T = Math.min(this.T, 1);
    }

    @Override
    public final void y(defpackage.go4[] r5, long r6, long r8, defpackage.rz6 r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn5.y(go4[], long, long, rz6):void");
    }
}
