package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kq9 extends w96 {
    public static final ArrayList Z = new ArrayList();
    public static final ArrayList a0 = new ArrayList();
    public rr9 O;
    public boolean P;
    public fq9 Q;
    public long R;
    public long S;
    public long T;
    public qr9 U;
    public jq9 V;
    public volatile int W;
    public volatile int X;
    public y96 Y;

    public static void I(qr9 qr9Var, Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            ArrayList arrayList3 = Z;
            if (i >= arrayList3.size()) {
                break;
            }
            kq9 kq9Var = (kq9) arrayList3.get(i);
            if (kq9Var.U == qr9Var) {
                kq9Var.V = new jq9(kq9Var, qr9Var);
            }
            rr9 rr9Var = kq9Var.O;
            if (rr9Var != null) {
                arrayList.add(rr9Var);
                arrayList2.add(kq9Var.V);
            }
            i++;
        }
        ArrayList arrayList4 = new ArrayList(a0);
        int size = arrayList4.size() + arrayList.size();
        if (size == 0) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        gq9 gq9Var = new gq9(new int[]{size}, runnable, (byte) 0);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((rr9) arrayList.get(i2)).l((qr9) arrayList2.get(i2), gq9Var);
        }
        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
            rr9 rr9Var2 = (rr9) arrayList4.get(i3);
            rr9Var2.getClass();
            if (!rr9Var2.b.post(new kr9(rr9Var2, gq9Var, (byte) 1))) {
                gq9Var.run();
            }
        }
    }

    public final void J() {
        long min;
        if (this.w) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.R;
        if (j == 0) {
            min = 4000;
        } else {
            min = Math.min(j << 1, 60000L);
        }
        this.R = min;
        this.S = min + elapsedRealtime;
        this.T = elapsedRealtime;
        n();
    }

    public final void K() {
        if (!this.w) {
            this.P = true;
            if (this.Q == null && !this.F) {
                long elapsedRealtime = this.S - SystemClock.elapsedRealtime();
                if (elapsedRealtime > 0) {
                    cc4.b("[LivePlayer] rejoin in " + elapsedRealtime + " ms");
                    fq9 fq9Var = new fq9(this, (byte) 0);
                    this.Q = fq9Var;
                    hl.d3(fq9Var, elapsedRealtime);
                    return;
                }
                J();
            }
        }
    }

    public final void L(qr9 qr9Var) {
        jq9 jq9Var;
        if (this.U != qr9Var) {
            this.U = qr9Var;
            if (qr9Var != null) {
                jq9Var = new jq9(this, qr9Var);
            } else {
                jq9Var = null;
            }
            this.V = jq9Var;
            rr9 rr9Var = this.O;
            if (rr9Var != null) {
                rr9Var.l(jq9Var, null);
            }
        }
    }

    @Override
    public final void a() {
        rr9 rr9Var = this.O;
        if (rr9Var != null) {
            rr9Var.b.post(new jt(rr9Var, this.H, (byte) 5));
        }
    }

    @Override
    public final void d() {
        L(null);
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final void t() {
        fq9 fq9Var = this.Q;
        if (fq9Var != null) {
            hl.r(fq9Var);
            this.Q = null;
        }
        this.P = false;
        rr9 rr9Var = this.O;
        if (rr9Var != null) {
            this.O = null;
            this.V = null;
            a0.add(rr9Var);
            hq9 hq9Var = new hq9(rr9Var, (byte) 0);
            if (!rr9Var.b.post(new kr9(rr9Var, hq9Var, (byte) 1))) {
                hq9Var.run();
            }
        }
        Z.remove(this);
    }

    @Override
    public final void v() {
        if (this.R != 0 && SystemClock.elapsedRealtime() - this.T >= 60000) {
            this.R = 0L;
            this.S = 0L;
        }
    }

    @Override
    public final void w(TLRPC.TL_error tL_error) {
        hl.c3(new dn9(this, tL_error, (byte) 8));
    }

    @Override
    public final void x() {
        K();
    }

    @Override
    public final void y(TLRPC.TL_dataJSON tL_dataJSON, boolean z) {
        hl.c3(new fq9(this, (byte) 1));
    }

    @Override
    public final void z(boolean z) {
        rr9 rr9Var = this.O;
        if (rr9Var != null) {
            rr9Var.k(z);
        }
    }
}
