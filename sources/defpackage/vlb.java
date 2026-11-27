package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j$.util.Objects;
import java.io.IOException;
public final class vlb extends vg0 implements Handler.Callback {
    public final z3f K;
    public final s93 L;
    public o43 M;
    public final ve9 N;
    public boolean O;
    public byte P;
    public ieb Q;
    public neb R;
    public oeb S;
    public oeb T;
    public int U;
    public final Handler V;
    public final n64 W;
    public final ym4 X;
    public boolean Y;
    public boolean Z;
    public ko4 a0;
    public long b0;
    public long c0;

    public vlb(n64 n64Var, Looper looper) {
        super(3);
        Handler handler;
        ve9 ve9Var = keb.A;
        this.W = n64Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = gcc.a;
            handler = new Handler(looper, this);
        }
        this.V = handler;
        this.N = ve9Var;
        this.K = new z3f((byte) 16);
        this.L = new s93(1, 0);
        this.X = new ym4((byte) 1, false);
        this.c0 = -9223372036854775807L;
        this.b0 = -9223372036854775807L;
    }

    @Override
    public final void B(long r23, long r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlb.B(long, long):void");
    }

    @Override
    public final int G(ko4 ko4Var) {
        int i;
        boolean equals = Objects.equals(ko4Var.t, "application/x-media3-cues");
        String str = ko4Var.t;
        if (!equals) {
            ve9 ve9Var = this.N;
            ve9Var.getClass();
            if (!((uif) ve9Var.b).j(ko4Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (dg7.l(str)) {
                    return qu6.a(1, 0, 0, 0);
                }
                return qu6.a(0, 0, 0, 0);
            }
        }
        if (ko4Var.X == 0) {
            i = 4;
        } else {
            i = 2;
        }
        return qu6.a(i, 0, 0, 0);
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
        grb.i(fze.a("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final void L() {
        no5 no5Var = po5.b;
        n43 n43Var = new n43(N(this.b0), j99.e);
        Handler handler = this.V;
        if (handler != null) {
            handler.obtainMessage(1, n43Var).sendToTarget();
        } else {
            P(n43Var);
        }
    }

    public final long M() {
        if (this.U == -1) {
            return Long.MAX_VALUE;
        }
        this.S.getClass();
        if (this.U >= this.S.q()) {
            return Long.MAX_VALUE;
        }
        return this.S.i(this.U);
    }

    public final long N(long j) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        return j - this.w;
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlb.O():void");
    }

    public final void P(n43 n43Var) {
        j99 j99Var = n43Var.a;
        n64 n64Var = this.W;
        n64Var.a.m.e(27, new lu3(j99Var, (byte) 13));
        s64 s64Var = n64Var.a;
        s64Var.e0 = n43Var;
        s64Var.m.e(27, new lu3(n43Var, (byte) 10));
    }

    public final void Q() {
        this.R = null;
        this.U = -1;
        oeb oebVar = this.S;
        if (oebVar != null) {
            oebVar.release();
            this.S = null;
        }
        oeb oebVar2 = this.T;
        if (oebVar2 != null) {
            oebVar2.release();
            this.T = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            P((n43) message.obj);
            return true;
        }
        grb.g();
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
        ko4 ko4Var = this.a0;
        if (ko4Var != null) {
            if (Objects.equals(ko4Var.t, "application/x-media3-cues")) {
                o43 o43Var = this.M;
                o43Var.getClass();
                if (o43Var.a(this.b0) == Long.MIN_VALUE) {
                    try {
                        at9 at9Var = this.r;
                        at9Var.getClass();
                        at9Var.g();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.Z) {
                if (this.Y) {
                    oeb oebVar = this.S;
                    long j = this.b0;
                    if (oebVar == null || oebVar.q() <= 0 || oebVar.i(oebVar.q() - 1) <= j) {
                        oeb oebVar2 = this.T;
                        long j2 = this.b0;
                        if ((oebVar2 == null || oebVar2.q() <= 0 || oebVar2.i(oebVar2.q() - 1) <= j2) && this.R != null) {
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
            ieb iebVar = this.Q;
            iebVar.getClass();
            iebVar.release();
            this.Q = null;
            this.P = (byte) 0;
        }
    }

    @Override
    public final void s(long j, boolean z, boolean z2) {
        this.b0 = j;
        o43 o43Var = this.M;
        if (o43Var != null) {
            o43Var.clear();
        }
        L();
        this.Y = false;
        this.Z = false;
        this.c0 = -9223372036854775807L;
        ko4 ko4Var = this.a0;
        if (ko4Var != null && !Objects.equals(ko4Var.t, "application/x-media3-cues")) {
            if (this.P != 0) {
                Q();
                ieb iebVar = this.Q;
                iebVar.getClass();
                iebVar.release();
                this.Q = null;
                this.P = (byte) 0;
                O();
                return;
            }
            Q();
            ieb iebVar2 = this.Q;
            iebVar2.getClass();
            iebVar2.flush();
            iebVar2.a(this.x);
        }
    }

    @Override
    public final void y(ko4[] ko4VarArr, long j, long j2, vz6 vz6Var) {
        o43 qh2Var;
        ko4 ko4Var = ko4VarArr[0];
        this.a0 = ko4Var;
        if (!Objects.equals(ko4Var.t, "application/x-media3-cues")) {
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
            qh2Var = new e37();
        } else {
            qh2Var = new qh2((byte) 2);
        }
        this.M = qh2Var;
    }
}
