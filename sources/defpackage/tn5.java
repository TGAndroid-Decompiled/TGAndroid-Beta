package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.ArrayDeque;
public final class tn5 extends vg0 {
    public final vj0 K;
    public final s93 L;
    public final ArrayDeque M;
    public boolean N;
    public boolean O;
    public sn5 P;
    public long Q;
    public long R;
    public byte S;
    public int T;
    public ko4 U;
    public wj0 V;
    public s93 W;
    public v64 X;
    public Bitmap Y;
    public boolean Z;
    public sd1 a0;
    public sd1 b0;
    public int c0;
    public boolean d0;

    public tn5(vj0 vj0Var) {
        super(4);
        this.K = vj0Var;
        this.L = new s93(0, 0);
        this.P = sn5.c;
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
                ym4 ym4Var = this.c;
                ym4Var.t();
                s93 s93Var = this.L;
                s93Var.clear();
                int A = A(ym4Var, s93Var, 2);
                if (A == -5) {
                    ko4 ko4Var = (ko4) ym4Var.c;
                    ko4Var.getClass();
                    this.U = ko4Var;
                    this.d0 = true;
                } else if (A == -4) {
                    yve.p(s93Var.isEndOfStream());
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
            } catch (fm5 e) {
                throw e(e, null, false, 4003);
            }
        }
    }

    @Override
    public final int G(ko4 ko4Var) {
        return vj0.e(ko4Var);
    }

    public final boolean K(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn5.K(long):boolean");
    }

    public final boolean L(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn5.L(long):boolean");
    }

    public final void M() {
        if (!this.d0) {
            return;
        }
        ko4 ko4Var = this.U;
        ko4Var.getClass();
        int e = vj0.e(ko4Var);
        if (e != qu6.a(4, 0, 0, 0) && e != qu6.a(3, 0, 0, 0)) {
            throw e(new Exception("Provided decoder factory can't create decoder for format."), this.U, false, 4005);
        }
        wj0 wj0Var = this.V;
        if (wj0Var != null) {
            wj0Var.release();
        }
        this.V = new wj0(this.K.a);
        this.d0 = false;
    }

    public final void N() {
        this.W = null;
        this.S = (byte) 0;
        this.R = -9223372036854775807L;
        wj0 wj0Var = this.V;
        if (wj0Var != null) {
            wj0Var.release();
            this.V = null;
        }
    }

    @Override
    public final void d(int i, Object obj) {
        if (i == 15 || i != 23) {
            return;
        }
        this.X = (v64) obj;
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
        this.P = sn5.c;
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
        wj0 wj0Var = this.V;
        if (wj0Var != null) {
            wj0Var.flush();
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
    public final void y(defpackage.ko4[] r5, long r6, long r8, defpackage.vz6 r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn5.y(ko4[], long, long, vz6):void");
    }
}
