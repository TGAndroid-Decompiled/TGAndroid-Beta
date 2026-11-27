package defpackage;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class wx6 extends Handler {
    public boolean a;
    public boolean b;
    public final yx6 c;

    public wx6(yx6 yx6Var, Looper looper) {
        super(looper);
        this.c = yx6Var;
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
        yx6 yx6Var;
        boolean z;
        po5 po5Var;
        qs qsVar;
        int i;
        xw6 xw6Var;
        boolean z2;
        f2c f2cVar;
        boolean z3;
        int i2;
        zf8 zf8Var;
        asb asbVar;
        f2c f2cVar2;
        yx6 yx6Var2 = this.c;
        sz6 sz6Var = yx6Var2.g;
        boolean z4 = true;
        if (message.what == 1) {
            kg8 kg8Var = yx6Var2.s;
            yx6Var2.t();
            asb T0 = yx6Var2.t.T0();
            yx6Var2.t();
            kg8 c = kg8Var.c(T0, yx6Var2.t.R0(), yx6Var2.s.k);
            yx6Var2.s = c;
            boolean z5 = this.a;
            boolean z6 = this.b;
            kg8 b0 = sz6Var.b0(c);
            rx6 rx6Var = sz6Var.b;
            kg8 a0 = sz6Var.a0(b0);
            f2c f2cVar3 = a0.F;
            asb asbVar2 = a0.j;
            po5 L = rx6Var.L();
            qs qsVar2 = (qs) rx6Var.c;
            int i3 = 0;
            while (i3 < L.size()) {
                xw6 xw6Var2 = (xw6) L.get(i3);
                try {
                    if (!rx6Var.Y(xw6Var2)) {
                        yx6Var = yx6Var2;
                        z = z5;
                        po5Var = L;
                        qsVar = qsVar2;
                        i = i3;
                    } else {
                        rx6Var.D0();
                        us2 us2Var = (us2) qsVar2.get(xw6Var2);
                        us2Var.getClass();
                        asb asbVar3 = us2Var.h;
                        rx6Var.D0();
                        us2 us2Var2 = (us2) qsVar2.get(xw6Var2);
                        us2Var2.getClass();
                        f2c f2cVar4 = us2Var2.i;
                        if (z5 && asbVar2.equals(asbVar3)) {
                            z2 = z4;
                        } else {
                            z2 = false;
                        }
                        if (z6 && f2cVar3.equals(f2cVar4)) {
                            f2cVar = f2cVar4;
                            z3 = z4;
                        } else {
                            f2cVar = f2cVar4;
                            z3 = false;
                        }
                        vy0 Q = rx6Var.Q(xw6Var2);
                        if (Q != null) {
                            i2 = Q.d();
                        } else if (!yx6Var2.g(xw6Var2)) {
                            break;
                        } else {
                            i2 = 0;
                        }
                        rx6Var.D0();
                        us2 us2Var3 = (us2) qsVar2.get(xw6Var2);
                        rx6Var.D0();
                        us2 us2Var4 = (us2) qsVar2.get(xw6Var2);
                        rx6Var.D0();
                        us2 us2Var5 = (us2) qsVar2.get(xw6Var2);
                        if (us2Var5 != null) {
                            zf8Var = us2Var5.e;
                        } else {
                            zf8Var = null;
                        }
                        yx6Var2.t();
                        zf8 a = ote.a(zf8Var, yx6Var2.t.q());
                        po5Var = L;
                        try {
                            ww6 ww6Var = xw6Var2.e;
                            ww6Var.getClass();
                            z = z5;
                            xw6Var = xw6Var2;
                            boolean z7 = z2;
                            yx6Var = yx6Var2;
                            qsVar = qsVar2;
                            int i4 = i2;
                            i = i3;
                            try {
                                ww6Var.h(i4, a0, a, z7, z3);
                                if (z7) {
                                    asbVar = asbVar3;
                                } else {
                                    asbVar = asbVar2;
                                }
                                if (z3) {
                                    f2cVar2 = f2cVar;
                                } else {
                                    f2cVar2 = f2cVar3;
                                }
                                rx6Var.D0();
                                us2 us2Var6 = (us2) qsVar.get(xw6Var);
                                if (us2Var6 != null) {
                                    us2Var6.h = asbVar;
                                    us2Var6.i = f2cVar2;
                                }
                            } catch (DeadObjectException unused) {
                                sz6Var.b.k0(xw6Var);
                                i3 = i + 1;
                                z5 = z;
                                qsVar2 = qsVar;
                                L = po5Var;
                                yx6Var2 = yx6Var;
                                z4 = true;
                            } catch (RemoteException e) {
                                e = e;
                                efd.g("MediaSessionImpl", "Exception in " + xw6Var, e);
                                i3 = i + 1;
                                z5 = z;
                                qsVar2 = qsVar;
                                L = po5Var;
                                yx6Var2 = yx6Var;
                                z4 = true;
                            }
                        } catch (DeadObjectException unused2) {
                            yx6Var = yx6Var2;
                            z = z5;
                            qsVar = qsVar2;
                            i = i3;
                            xw6Var = xw6Var2;
                            sz6Var.b.k0(xw6Var);
                            i3 = i + 1;
                            z5 = z;
                            qsVar2 = qsVar;
                            L = po5Var;
                            yx6Var2 = yx6Var;
                            z4 = true;
                        } catch (RemoteException e2) {
                            e = e2;
                            yx6Var = yx6Var2;
                            z = z5;
                            qsVar = qsVar2;
                            i = i3;
                            xw6Var = xw6Var2;
                            efd.g("MediaSessionImpl", "Exception in " + xw6Var, e);
                            i3 = i + 1;
                            z5 = z;
                            qsVar2 = qsVar;
                            L = po5Var;
                            yx6Var2 = yx6Var;
                            z4 = true;
                        }
                    }
                } catch (DeadObjectException unused3) {
                    yx6Var = yx6Var2;
                    z = z5;
                    po5Var = L;
                } catch (RemoteException e3) {
                    e = e3;
                    yx6Var = yx6Var2;
                    z = z5;
                    po5Var = L;
                }
                i3 = i + 1;
                z5 = z;
                qsVar2 = qsVar;
                L = po5Var;
                yx6Var2 = yx6Var;
                z4 = true;
            }
            boolean z8 = z4;
            this.a = z8;
            this.b = z8;
            return;
        }
        p3d.e(message.what, "Invalid message what=");
    }
}
