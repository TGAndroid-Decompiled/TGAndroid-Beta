package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.ArrayDeque;
public final class ql5 extends ug0 {
    public final uj0 K;
    public final z83 L;
    public final ArrayDeque M;
    public boolean N;
    public boolean O;
    public pl5 P;
    public long Q;
    public long R;
    public byte S;
    public int T;
    public fm4 U;
    public vj0 V;
    public z83 W;
    public b64 X;
    public Bitmap Y;
    public boolean Z;
    public jd1 a0;
    public jd1 b0;
    public int c0;
    public boolean d0;

    public ql5(uj0 uj0Var) {
        super(4);
        this.K = uj0Var;
        this.L = new z83(0, 0);
        this.P = pl5.c;
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
                sk4 sk4Var = this.c;
                sk4Var.m();
                z83 z83Var = this.L;
                z83Var.clear();
                int A = A(sk4Var, z83Var, 2);
                if (A == -5) {
                    fm4 fm4Var = (fm4) sk4Var.c;
                    fm4Var.getClass();
                    this.U = fm4Var;
                    this.d0 = true;
                } else if (A == -4) {
                    gre.p(z83Var.isEndOfStream());
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
            } catch (ck5 e) {
                throw e(e, null, false, 4003);
            }
        }
    }

    @Override
    public final int G(fm4 fm4Var) {
        return uj0.c(fm4Var);
    }

    public final boolean K(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql5.K(long):boolean");
    }

    public final boolean L(long r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql5.L(long):boolean");
    }

    public final void M() {
        if (!this.d0) {
            return;
        }
        fm4 fm4Var = this.U;
        fm4Var.getClass();
        int c = uj0.c(fm4Var);
        if (c != ls6.a(4, 0, 0, 0) && c != ls6.a(3, 0, 0, 0)) {
            throw e(new Exception("Provided decoder factory can't create decoder for format."), this.U, false, 4005);
        }
        vj0 vj0Var = this.V;
        if (vj0Var != null) {
            vj0Var.release();
        }
        this.V = new vj0(this.K.a);
        this.d0 = false;
    }

    public final void N() {
        this.W = null;
        this.S = (byte) 0;
        this.R = -9223372036854775807L;
        vj0 vj0Var = this.V;
        if (vj0Var != null) {
            vj0Var.release();
            this.V = null;
        }
    }

    @Override
    public final void d(int i, Object obj) {
        if (i == 15 || i != 23) {
            return;
        }
        this.X = (b64) obj;
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
        this.P = pl5.c;
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
        vj0 vj0Var = this.V;
        if (vj0Var != null) {
            vj0Var.flush();
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
    public final void y(defpackage.fm4[] r5, long r6, long r8, defpackage.rx6 r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql5.y(fm4[], long, long, rx6):void");
    }
}
