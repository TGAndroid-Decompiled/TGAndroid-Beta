package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vo9 extends s96 {
    public static final ArrayList Z = new ArrayList();
    public static final ArrayList a0 = new ArrayList();
    public bq9 O;
    public boolean P;
    public so9 Q;
    public long R;
    public long S;
    public long T;
    public aq9 U;
    public uo9 V;
    public volatile int W;
    public volatile int X;
    public u96 Y;

    public static void I(aq9 aq9Var, Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            ArrayList arrayList3 = Z;
            if (i >= arrayList3.size()) {
                break;
            }
            vo9 vo9Var = (vo9) arrayList3.get(i);
            if (vo9Var.U == aq9Var) {
                vo9Var.V = new uo9(vo9Var, aq9Var);
            }
            bq9 bq9Var = vo9Var.O;
            if (bq9Var != null) {
                arrayList.add(bq9Var);
                arrayList2.add(vo9Var.V);
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
        qo9 qo9Var = new qo9(new int[]{size}, runnable, (byte) 0);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((bq9) arrayList.get(i2)).l((aq9) arrayList2.get(i2), qo9Var);
        }
        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
            bq9 bq9Var2 = (bq9) arrayList4.get(i3);
            bq9Var2.getClass();
            if (!bq9Var2.b.post(new up9(bq9Var2, qo9Var, (byte) 1))) {
                qo9Var.run();
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
                    fc4.b("[LivePlayer] rejoin in " + elapsedRealtime + " ms");
                    so9 so9Var = new so9(this, (byte) 1);
                    this.Q = so9Var;
                    gm.d3(so9Var, elapsedRealtime);
                    return;
                }
                J();
            }
        }
    }

    public final void L(aq9 aq9Var) {
        uo9 uo9Var;
        if (this.U != aq9Var) {
            this.U = aq9Var;
            if (aq9Var != null) {
                uo9Var = new uo9(this, aq9Var);
            } else {
                uo9Var = null;
            }
            this.V = uo9Var;
            bq9 bq9Var = this.O;
            if (bq9Var != null) {
                bq9Var.l(uo9Var, null);
            }
        }
    }

    @Override
    public final void a() {
        bq9 bq9Var = this.O;
        if (bq9Var != null) {
            bq9Var.b.post(new ku(bq9Var, this.H, (byte) 5));
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
        so9 so9Var = this.Q;
        if (so9Var != null) {
            gm.r(so9Var);
            this.Q = null;
        }
        this.P = false;
        bq9 bq9Var = this.O;
        if (bq9Var != null) {
            this.O = null;
            this.V = null;
            a0.add(bq9Var);
            ro9 ro9Var = new ro9(bq9Var, (byte) 0);
            if (!bq9Var.b.post(new up9(bq9Var, ro9Var, (byte) 1))) {
                ro9Var.run();
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
        gm.c3(new il9(this, tL_error, (byte) 10));
    }

    @Override
    public final void x() {
        K();
    }

    @Override
    public final void y(TLRPC.TL_dataJSON tL_dataJSON, boolean z) {
        gm.c3(new so9(this, (byte) 0));
    }

    @Override
    public final void z(boolean z) {
        bq9 bq9Var = this.O;
        if (bq9Var != null) {
            bq9Var.k(z);
        }
    }
}
