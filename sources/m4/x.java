package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class x extends Handler {
    public boolean f14694a;
    public boolean f14695b;
    public final a0 f14696c;

    public x(a0 a0Var, Looper looper) {
        super(looper);
        this.f14696c = a0Var;
        this.f14694a = true;
        this.f14695b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f14694a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f14694a = z12;
        if (this.f14695b && z11) {
            z13 = true;
        }
        this.f14695b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        r rVar;
        int i10;
        d1 d1Var;
        a0 a0Var = this.f14696c;
        b1 b1Var = a0Var.f14442g;
        if (message.what == 1) {
            d1 c10 = a0Var.f14453s.c(a0Var.f14454t.Q0(), a0Var.f14454t.O0(), a0Var.f14453s.f14496k);
            a0Var.f14453s = c10;
            boolean z10 = this.f14694a;
            boolean z11 = this.f14695b;
            d1 H0 = b1Var.H0(c10);
            ni.f fVar = b1Var.f14466b;
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
                    d1 w10 = fVar.w(rVar2);
                    if (w10 == null) {
                        fVar.v(rVar2);
                        b2.x0 a2 = w7.t.a(fVar.r(rVar2), a0Var.f14454t.t());
                        try {
                            q qVar = rVar2.d;
                            e2.d.h(qVar);
                            if (w10 == null) {
                                rVar = rVar2;
                                d1Var = H0;
                            } else {
                                rVar = rVar2;
                                d1Var = w10;
                            }
                            try {
                                qVar.g(i10, d1Var, a2, z10, z11);
                            } catch (DeadObjectException unused) {
                                b1Var.f14466b.M(rVar);
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
            this.f14694a = true;
            this.f14695b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
