package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class x extends Handler {
    public boolean f14946a;
    public boolean f14947b;
    public final a0 f14948c;

    public x(a0 a0Var, Looper looper) {
        super(looper);
        this.f14948c = a0Var;
        this.f14946a = true;
        this.f14947b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f14946a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f14946a = z12;
        if (this.f14947b && z11) {
            z13 = true;
        }
        this.f14947b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        r rVar;
        int i10;
        c1 c1Var;
        a0 a0Var = this.f14948c;
        a1 a1Var = a0Var.f14695g;
        if (message.what == 1) {
            c1 c10 = a0Var.f14706s.c(a0Var.f14707t.Q0(), a0Var.f14707t.O0(), a0Var.f14706s.f14746k);
            a0Var.f14706s = c10;
            boolean z10 = this.f14946a;
            boolean z11 = this.f14947b;
            c1 H0 = a1Var.H0(c10);
            oi.f fVar = a1Var.f14714b;
            e9.i0 s10 = fVar.s();
            for (int i11 = 0; i11 < s10.size(); i11++) {
                r rVar2 = (r) s10.get(i11);
                try {
                    com.google.android.gms.common.api.internal.v x10 = fVar.x(rVar2);
                    if (x10 != null) {
                        i10 = x10.e();
                    } else if (!a0Var.h(rVar2)) {
                        break;
                    } else {
                        i10 = 0;
                    }
                    c1 w10 = fVar.w(rVar2);
                    if (w10 == null) {
                        fVar.v(rVar2);
                        b2.x0 a2 = w7.u.a(fVar.r(rVar2), a0Var.f14707t.t());
                        try {
                            q qVar = rVar2.d;
                            e2.d.h(qVar);
                            if (w10 == null) {
                                rVar = rVar2;
                                c1Var = H0;
                            } else {
                                rVar = rVar2;
                                c1Var = w10;
                            }
                            try {
                                qVar.g(i10, c1Var, a2, z10, z11);
                            } catch (DeadObjectException unused) {
                                a1Var.f14714b.M(rVar);
                            } catch (RemoteException e) {
                                e = e;
                                e2.a.o("MediaSessionImpl", "Exception in " + rVar, e);
                            }
                        } catch (DeadObjectException unused2) {
                            rVar = rVar2;
                        } catch (RemoteException e7) {
                            e = e7;
                            rVar = rVar2;
                        }
                    }
                } catch (DeadObjectException unused3) {
                    rVar = rVar2;
                } catch (RemoteException e10) {
                    e = e10;
                    rVar = rVar2;
                }
            }
            this.f14946a = true;
            this.f14947b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
