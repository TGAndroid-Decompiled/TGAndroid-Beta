package defpackage;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class rv6 extends Handler {
    public boolean a;
    public boolean b;
    public final tv6 c;

    public rv6(tv6 tv6Var, Looper looper) {
        super(looper);
        this.c = tv6Var;
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
        tv6 tv6Var;
        boolean z;
        mm5 mm5Var;
        ps psVar;
        int i;
        su6 su6Var;
        boolean z2;
        eyb eybVar;
        boolean z3;
        int i2;
        kc8 kc8Var;
        aob aobVar;
        eyb eybVar2;
        tv6 tv6Var2 = this.c;
        ox6 ox6Var = tv6Var2.g;
        boolean z4 = true;
        if (message.what == 1) {
            wc8 wc8Var = tv6Var2.s;
            tv6Var2.t();
            aob T0 = tv6Var2.t.T0();
            tv6Var2.t();
            wc8 c = wc8Var.c(T0, tv6Var2.t.R0(), tv6Var2.s.k);
            tv6Var2.s = c;
            boolean z5 = this.a;
            boolean z6 = this.b;
            wc8 b0 = ox6Var.b0(c);
            mv6 mv6Var = ox6Var.b;
            wc8 a0 = ox6Var.a0(b0);
            eyb eybVar3 = a0.F;
            aob aobVar2 = a0.j;
            mm5 K = mv6Var.K();
            ps psVar2 = (ps) mv6Var.c;
            int i3 = 0;
            while (i3 < K.size()) {
                su6 su6Var2 = (su6) K.get(i3);
                try {
                    if (!mv6Var.V(su6Var2)) {
                        tv6Var = tv6Var2;
                        z = z5;
                        mm5Var = K;
                        psVar = psVar2;
                        i = i3;
                    } else {
                        mv6Var.x0();
                        bs2 bs2Var = (bs2) psVar2.get(su6Var2);
                        bs2Var.getClass();
                        aob aobVar3 = bs2Var.h;
                        mv6Var.x0();
                        bs2 bs2Var2 = (bs2) psVar2.get(su6Var2);
                        bs2Var2.getClass();
                        eyb eybVar4 = bs2Var2.i;
                        if (z5 && aobVar2.equals(aobVar3)) {
                            z2 = z4;
                        } else {
                            z2 = false;
                        }
                        if (z6 && eybVar3.equals(eybVar4)) {
                            eybVar = eybVar4;
                            z3 = z4;
                        } else {
                            eybVar = eybVar4;
                            z3 = false;
                        }
                        ny0 P = mv6Var.P(su6Var2);
                        if (P != null) {
                            i2 = P.d();
                        } else if (!tv6Var2.g(su6Var2)) {
                            break;
                        } else {
                            i2 = 0;
                        }
                        mv6Var.x0();
                        bs2 bs2Var3 = (bs2) psVar2.get(su6Var2);
                        mv6Var.x0();
                        bs2 bs2Var4 = (bs2) psVar2.get(su6Var2);
                        mv6Var.x0();
                        bs2 bs2Var5 = (bs2) psVar2.get(su6Var2);
                        if (bs2Var5 != null) {
                            kc8Var = bs2Var5.e;
                        } else {
                            kc8Var = null;
                        }
                        tv6Var2.t();
                        kc8 a = woe.a(kc8Var, tv6Var2.t.q());
                        mm5Var = K;
                        try {
                            ru6 ru6Var = su6Var2.e;
                            ru6Var.getClass();
                            z = z5;
                            su6Var = su6Var2;
                            boolean z7 = z2;
                            tv6Var = tv6Var2;
                            psVar = psVar2;
                            int i4 = i2;
                            i = i3;
                            try {
                                ru6Var.h(i4, a0, a, z7, z3);
                                if (z7) {
                                    aobVar = aobVar3;
                                } else {
                                    aobVar = aobVar2;
                                }
                                if (z3) {
                                    eybVar2 = eybVar;
                                } else {
                                    eybVar2 = eybVar3;
                                }
                                mv6Var.x0();
                                bs2 bs2Var6 = (bs2) psVar.get(su6Var);
                                if (bs2Var6 != null) {
                                    bs2Var6.h = aobVar;
                                    bs2Var6.i = eybVar2;
                                }
                            } catch (DeadObjectException unused) {
                                ox6Var.b.e0(su6Var);
                                i3 = i + 1;
                                z5 = z;
                                psVar2 = psVar;
                                K = mm5Var;
                                tv6Var2 = tv6Var;
                                z4 = true;
                            } catch (RemoteException e) {
                                e = e;
                                lad.g("MediaSessionImpl", "Exception in " + su6Var, e);
                                i3 = i + 1;
                                z5 = z;
                                psVar2 = psVar;
                                K = mm5Var;
                                tv6Var2 = tv6Var;
                                z4 = true;
                            }
                        } catch (DeadObjectException unused2) {
                            tv6Var = tv6Var2;
                            z = z5;
                            psVar = psVar2;
                            i = i3;
                            su6Var = su6Var2;
                            ox6Var.b.e0(su6Var);
                            i3 = i + 1;
                            z5 = z;
                            psVar2 = psVar;
                            K = mm5Var;
                            tv6Var2 = tv6Var;
                            z4 = true;
                        } catch (RemoteException e2) {
                            e = e2;
                            tv6Var = tv6Var2;
                            z = z5;
                            psVar = psVar2;
                            i = i3;
                            su6Var = su6Var2;
                            lad.g("MediaSessionImpl", "Exception in " + su6Var, e);
                            i3 = i + 1;
                            z5 = z;
                            psVar2 = psVar;
                            K = mm5Var;
                            tv6Var2 = tv6Var;
                            z4 = true;
                        }
                    }
                } catch (DeadObjectException unused3) {
                    tv6Var = tv6Var2;
                    z = z5;
                    mm5Var = K;
                } catch (RemoteException e3) {
                    e = e3;
                    tv6Var = tv6Var2;
                    z = z5;
                    mm5Var = K;
                }
                i3 = i + 1;
                z5 = z;
                psVar2 = psVar;
                K = mm5Var;
                tv6Var2 = tv6Var;
                z4 = true;
            }
            boolean z8 = z4;
            this.a = z8;
            this.b = z8;
            return;
        }
        fvc.d(message.what, "Invalid message what=");
    }
}
