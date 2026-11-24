package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j$.util.Objects;
import java.io.IOException;
public final class bkb extends uh0 implements Handler.Callback {
    public final k1f K;
    public final la3 L;
    public h53 M;
    public final x59 N;
    public boolean O;
    public byte P;
    public mcb Q;
    public rcb R;
    public scb S;
    public scb T;
    public int U;
    public final Handler V;
    public final c74 W;
    public final mj4 X;
    public boolean Y;
    public boolean Z;
    public go4 a0;
    public long b0;
    public long c0;

    public bkb(c74 c74Var, Looper looper) {
        super(3);
        Handler handler;
        x59 x59Var = ocb.A;
        this.W = c74Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = hac.a;
            handler = new Handler(looper, this);
        }
        this.V = handler;
        this.N = x59Var;
        this.K = new k1f((byte) 16);
        this.L = new la3(1, 0);
        this.X = new mj4((byte) 3, false);
        this.c0 = -9223372036854775807L;
        this.b0 = -9223372036854775807L;
    }

    @Override
    public final void B(long r23, long r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.B(long, long):void");
    }

    @Override
    public final int G(go4 go4Var) {
        int i;
        boolean equals = Objects.equals(go4Var.t, "application/x-media3-cues");
        String str = go4Var.t;
        if (!equals) {
            x59 x59Var = this.N;
            x59Var.getClass();
            if (!((fgf) x59Var.b).h(go4Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                if (wf7.l(str)) {
                    return kt6.a(1, 0, 0, 0);
                }
                return kt6.a(0, 0, 0, 0);
            }
        }
        if (go4Var.X == 0) {
            i = 4;
        } else {
            i = 2;
        }
        return kt6.a(i, 0, 0, 0);
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
        dq9.m(pwe.a("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    public final void L() {
        ko5 ko5Var = mo5.b;
        g53 g53Var = new g53(N(this.b0), y79.e);
        Handler handler = this.V;
        if (handler != null) {
            handler.obtainMessage(1, g53Var).sendToTarget();
        } else {
            P(g53Var);
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
        return this.S.k(this.U);
    }

    public final long N(long j) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        jte.p(z);
        return j - this.w;
    }

    public final void O() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.O():void");
    }

    public final void P(g53 g53Var) {
        y79 y79Var = g53Var.a;
        c74 c74Var = this.W;
        c74Var.a.m.e(27, new yu3(y79Var, (byte) 14));
        h74 h74Var = c74Var.a;
        h74Var.e0 = g53Var;
        h74Var.m.e(27, new yu3(g53Var, (byte) 11));
    }

    public final void Q() {
        this.R = null;
        this.U = -1;
        scb scbVar = this.S;
        if (scbVar != null) {
            scbVar.release();
            this.S = null;
        }
        scb scbVar2 = this.T;
        if (scbVar2 != null) {
            scbVar2.release();
            this.T = null;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            P((g53) message.obj);
            return true;
        }
        rjb.h();
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
        go4 go4Var = this.a0;
        if (go4Var != null) {
            if (Objects.equals(go4Var.t, "application/x-media3-cues")) {
                h53 h53Var = this.M;
                h53Var.getClass();
                if (h53Var.a(this.b0) == Long.MIN_VALUE) {
                    try {
                        jr9 jr9Var = this.r;
                        jr9Var.getClass();
                        jr9Var.d();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else if (!this.Z) {
                if (this.Y) {
                    scb scbVar = this.S;
                    long j = this.b0;
                    if (scbVar == null || scbVar.q() <= 0 || scbVar.k(scbVar.q() - 1) <= j) {
                        scb scbVar2 = this.T;
                        long j2 = this.b0;
                        if ((scbVar2 == null || scbVar2.q() <= 0 || scbVar2.k(scbVar2.q() - 1) <= j2) && this.R != null) {
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
            mcb mcbVar = this.Q;
            mcbVar.getClass();
            mcbVar.release();
            this.Q = null;
            this.P = (byte) 0;
        }
    }

    @Override
    public final void s(long j, boolean z, boolean z2) {
        this.b0 = j;
        h53 h53Var = this.M;
        if (h53Var != null) {
            h53Var.clear();
        }
        L();
        this.Y = false;
        this.Z = false;
        this.c0 = -9223372036854775807L;
        go4 go4Var = this.a0;
        if (go4Var != null && !Objects.equals(go4Var.t, "application/x-media3-cues")) {
            if (this.P != 0) {
                Q();
                mcb mcbVar = this.Q;
                mcbVar.getClass();
                mcbVar.release();
                this.Q = null;
                this.P = (byte) 0;
                O();
                return;
            }
            Q();
            mcb mcbVar2 = this.Q;
            mcbVar2.getClass();
            mcbVar2.flush();
            mcbVar2.a(this.x);
        }
    }

    @Override
    public final void y(go4[] go4VarArr, long j, long j2, rz6 rz6Var) {
        h53 xv6Var;
        go4 go4Var = go4VarArr[0];
        this.a0 = go4Var;
        if (!Objects.equals(go4Var.t, "application/x-media3-cues")) {
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
            xv6Var = new x27();
        } else {
            xv6Var = new xv6((byte) 1);
        }
        this.M = xv6Var;
    }
}
