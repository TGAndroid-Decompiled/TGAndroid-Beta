package defpackage;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class rx6 extends Handler {
    public boolean a;
    public boolean b;
    public final tx6 c;

    public rx6(tx6 tx6Var, Looper looper) {
        super(looper);
        this.c = tx6Var;
        this.a = true;
        this.b = true;
    }

    public final void a(boolean z, boolean z2) {
        boolean z3;
        boolean z4 = false;
        if (this.a && z) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.a = z3;
        if (this.b && z2) {
            z4 = true;
        }
        this.b = z4;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        tx6 tx6Var;
        boolean z;
        mo5 mo5Var;
        qt qtVar;
        int i;
        sw6 sw6Var;
        boolean z2;
        g0c g0cVar;
        boolean z3;
        int i2;
        ne8 ne8Var;
        bqb bqbVar;
        g0c g0cVar2;
        tx6 tx6Var2 = this.c;
        oz6 oz6Var = tx6Var2.g;
        boolean z4 = true;
        if (message.what == 1) {
            ye8 ye8Var = tx6Var2.s;
            tx6Var2.t();
            bqb T0 = tx6Var2.t.T0();
            tx6Var2.t();
            ye8 c = ye8Var.c(T0, tx6Var2.t.R0(), tx6Var2.s.k);
            tx6Var2.s = c;
            boolean z5 = this.a;
            boolean z6 = this.b;
            ye8 b0 = oz6Var.b0(c);
            mx6 mx6Var = oz6Var.b;
            ye8 a0 = oz6Var.a0(b0);
            g0c g0cVar3 = a0.F;
            bqb bqbVar2 = a0.j;
            mo5 M = mx6Var.M();
            qt qtVar2 = (qt) mx6Var.c;
            int i3 = 0;
            while (i3 < M.size()) {
                sw6 sw6Var2 = (sw6) M.get(i3);
                try {
                    if (!mx6Var.X(sw6Var2)) {
                        tx6Var = tx6Var2;
                        z = z5;
                        mo5Var = M;
                        qtVar = qtVar2;
                        i = i3;
                    } else {
                        mx6Var.C0();
                        mt2 mt2Var = (mt2) qtVar2.get(sw6Var2);
                        mt2Var.getClass();
                        bqb bqbVar3 = mt2Var.h;
                        mx6Var.C0();
                        mt2 mt2Var2 = (mt2) qtVar2.get(sw6Var2);
                        mt2Var2.getClass();
                        g0c g0cVar4 = mt2Var2.i;
                        if (z5 && bqbVar2.equals(bqbVar3)) {
                            z2 = z4;
                        } else {
                            z2 = false;
                        }
                        if (z6 && g0cVar3.equals(g0cVar4)) {
                            g0cVar = g0cVar4;
                            z3 = z4;
                        } else {
                            g0cVar = g0cVar4;
                            z3 = false;
                        }
                        uz0 R = mx6Var.R(sw6Var2);
                        if (R != null) {
                            i2 = R.d();
                        } else if (!tx6Var2.g(sw6Var2)) {
                            break;
                        } else {
                            i2 = 0;
                        }
                        mx6Var.C0();
                        mt2 mt2Var3 = (mt2) qtVar2.get(sw6Var2);
                        mx6Var.C0();
                        mt2 mt2Var4 = (mt2) qtVar2.get(sw6Var2);
                        mx6Var.C0();
                        mt2 mt2Var5 = (mt2) qtVar2.get(sw6Var2);
                        if (mt2Var5 != null) {
                            ne8Var = mt2Var5.e;
                        } else {
                            ne8Var = null;
                        }
                        tx6Var2.t();
                        ne8 a = zqe.a(ne8Var, tx6Var2.t.q());
                        mo5Var = M;
                        try {
                            rw6 rw6Var = sw6Var2.e;
                            rw6Var.getClass();
                            z = z5;
                            sw6Var = sw6Var2;
                            boolean z7 = z2;
                            tx6Var = tx6Var2;
                            qtVar = qtVar2;
                            int i4 = i2;
                            i = i3;
                            try {
                                rw6Var.h(i4, a0, a, z7, z3);
                                if (z7) {
                                    bqbVar = bqbVar3;
                                } else {
                                    bqbVar = bqbVar2;
                                }
                                if (z3) {
                                    g0cVar2 = g0cVar;
                                } else {
                                    g0cVar2 = g0cVar3;
                                }
                                mx6Var.C0();
                                mt2 mt2Var6 = (mt2) qtVar.get(sw6Var);
                                if (mt2Var6 != null) {
                                    mt2Var6.h = bqbVar;
                                    mt2Var6.i = g0cVar2;
                                }
                            } catch (DeadObjectException unused) {
                                oz6Var.b.i0(sw6Var);
                                i3 = i + 1;
                                z5 = z;
                                qtVar2 = qtVar;
                                M = mo5Var;
                                tx6Var2 = tx6Var;
                                z4 = true;
                            } catch (RemoteException e) {
                                e = e;
                                ncd.g("MediaSessionImpl", "Exception in " + sw6Var, e);
                                i3 = i + 1;
                                z5 = z;
                                qtVar2 = qtVar;
                                M = mo5Var;
                                tx6Var2 = tx6Var;
                                z4 = true;
                            }
                        } catch (DeadObjectException unused2) {
                            tx6Var = tx6Var2;
                            z = z5;
                            qtVar = qtVar2;
                            i = i3;
                            sw6Var = sw6Var2;
                            oz6Var.b.i0(sw6Var);
                            i3 = i + 1;
                            z5 = z;
                            qtVar2 = qtVar;
                            M = mo5Var;
                            tx6Var2 = tx6Var;
                            z4 = true;
                        } catch (RemoteException e2) {
                            e = e2;
                            tx6Var = tx6Var2;
                            z = z5;
                            qtVar = qtVar2;
                            i = i3;
                            sw6Var = sw6Var2;
                            ncd.g("MediaSessionImpl", "Exception in " + sw6Var, e);
                            i3 = i + 1;
                            z5 = z;
                            qtVar2 = qtVar;
                            M = mo5Var;
                            tx6Var2 = tx6Var;
                            z4 = true;
                        }
                    }
                } catch (DeadObjectException unused3) {
                    tx6Var = tx6Var2;
                    z = z5;
                    mo5Var = M;
                } catch (RemoteException e3) {
                    e = e3;
                    tx6Var = tx6Var2;
                    z = z5;
                    mo5Var = M;
                }
                i3 = i + 1;
                z5 = z;
                qtVar2 = qtVar;
                M = mo5Var;
                tx6Var2 = tx6Var;
                z4 = true;
            }
            boolean z8 = z4;
            this.a = z8;
            this.b = z8;
            return;
        }
        i2d.e(message.what, "Invalid message what=");
    }
}
