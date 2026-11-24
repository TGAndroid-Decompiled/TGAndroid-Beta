package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j$.util.Objects;
import java.io.IOException;
public final class zhb extends ug0 implements Handler.Callback {
    public final ize K;
    public final z83 L;
    public w33 M;
    public final u39 N;
    public boolean O;
    public byte P;
    public lab Q;
    public qab R;
    public rab S;
    public rab T;
    public int U;
    public final Handler V;
    public final t54 W;
    public final sk4 X;
    public boolean Y;
    public boolean Z;
    public fm4 a0;
    public long b0;
    public long c0;

    public zhb(t54 t54Var, Looper looper) {
        super(3);
        Handler handler;
        u39 u39Var = nab.A;
        this.W = t54Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = g8c.a;
            handler = new Handler(looper, this);
        }
        this.V = handler;
        this.N = u39Var;
        this.K = new ize((byte) 16);
        this.L = new z83(1, 0);
        this.X = new sk4((byte) 1, false);
        this.c0 = -9223372036854775807L;
        this.b0 = -9223372036854775807L;
    }

    @Override
    public final void B(long r23, long r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhb.B(long, long):void");
    }

    @Override
    public final int G(fm4 fm4Var) {
        int i;
        boolean equals = Objects.equals(fm4Var.t, "application/x-media3-cues");
        String str = fm4Var.t;
        if (!equals) {
            u39 u39Var = this.N;
            u39Var.getClass();
            if (!((eef) u39Var.b).h(fm4Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (ud7.l(str)) {
                    return ls6.a(1, 0, 0, 0);
                }
                return ls6.a(0, 0, 0, 0);
            }
        }
        if (fm4Var.X == 0) {
            i = 4;
        } else {
            i = 2;
        }
        return ls6.a(i, 0, 0, 0);
    }

    public final void K() {
        boolean z;
        if (!Objects.equals(this.a0.t, "application/cea-608") && !Objects.equals(this.a0.t, "application/x-mp4-cea-608") && !Objects.equals(this.a0.t, "application/cea-708")) {
            z = false;
        } else {
            z = true;
        }
        String str = this.a0.t;
        if (z) {
            return;
        }
        sc8.j(nue.a("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final void L() {
        km5 km5Var = mm5.b;
        v33 v33Var = new v33(N(this.b0), w59.e);
        Handler handler = this.V;
        if (handler != null) {
            handler.obtainMessage(1, v33Var).sendToTarget();
        } else {
            P(v33Var);
        }
    }

    public final long M() {
        if (this.U == -1) {
            return Long.MAX_VALUE;
        }
        this.S.getClass();
        if (this.U >= this.S.t()) {
            return Long.MAX_VALUE;
        }
        return this.S.h(this.U);
    }

    public final long N(long j) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        return j - this.w;
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhb.O():void");
    }

    public final void P(v33 v33Var) {
        w59 w59Var = v33Var.a;
        t54 t54Var = this.W;
        t54Var.a.m.e(27, new kx3(w59Var, (byte) 11));
        y54 y54Var = t54Var.a;
        y54Var.e0 = v33Var;
        y54Var.m.e(27, new kx3(v33Var, (byte) 8));
    }

    public final void Q() {
        this.R = null;
        this.U = -1;
        rab rabVar = this.S;
        if (rabVar != null) {
            rabVar.release();
            this.S = null;
        }
        rab rabVar2 = this.T;
        if (rabVar2 != null) {
            rabVar2.release();
            this.T = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            P((v33) message.obj);
            return true;
        }
        sdb.a();
        return false;
    }

    @Override
    public final String l() {
        return "TextRenderer";
    }

    @Override
    public final boolean n() {
        return this.Z;
    }

    @Override
    public final boolean o() {
        fm4 fm4Var = this.a0;
        if (fm4Var != null) {
            if (Objects.equals(fm4Var.t, "application/x-media3-cues")) {
                w33 w33Var = this.M;
                w33Var.getClass();
                if (w33Var.a(this.b0) == Long.MIN_VALUE) {
                    try {
                        ip9 ip9Var = this.r;
                        ip9Var.getClass();
                        ip9Var.b();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.Z) {
                if (this.Y) {
                    rab rabVar = this.S;
                    long j = this.b0;
                    if (rabVar == null || rabVar.t() <= 0 || rabVar.h(rabVar.t() - 1) <= j) {
                        rab rabVar2 = this.T;
                        long j2 = this.b0;
                        if ((rabVar2 == null || rabVar2.t() <= 0 || rabVar2.h(rabVar2.t() - 1) <= j2) && this.R != null) {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void q() {
        this.a0 = null;
        this.c0 = -9223372036854775807L;
        L();
        this.b0 = -9223372036854775807L;
        if (this.Q != null) {
            Q();
            lab labVar = this.Q;
            labVar.getClass();
            labVar.release();
            this.Q = null;
            this.P = (byte) 0;
        }
    }

    @Override
    public final void s(long j, boolean z, boolean z2) {
        this.b0 = j;
        w33 w33Var = this.M;
        if (w33Var != null) {
            w33Var.clear();
        }
        L();
        this.Y = false;
        this.Z = false;
        this.c0 = -9223372036854775807L;
        fm4 fm4Var = this.a0;
        if (fm4Var != null && !Objects.equals(fm4Var.t, "application/x-media3-cues")) {
            if (this.P != 0) {
                Q();
                lab labVar = this.Q;
                labVar.getClass();
                labVar.release();
                this.Q = null;
                this.P = (byte) 0;
                O();
                return;
            }
            Q();
            lab labVar2 = this.Q;
            labVar2.getClass();
            labVar2.flush();
            labVar2.a(this.x);
        }
    }

    @Override
    public final void y(fm4[] fm4VarArr, long j, long j2, rx6 rx6Var) {
        w33 yg2Var;
        fm4 fm4Var = fm4VarArr[0];
        this.a0 = fm4Var;
        if (!Objects.equals(fm4Var.t, "application/x-media3-cues")) {
            K();
            if (this.Q != null) {
                this.P = (byte) 1;
                return;
            } else {
                O();
                return;
            }
        }
        if (this.a0.U == 1) {
            yg2Var = new x07();
        } else {
            yg2Var = new yg2((byte) 3);
        }
        this.M = yg2Var;
    }
}
