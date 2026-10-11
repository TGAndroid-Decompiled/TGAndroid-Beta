package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class y extends Handler {
    public boolean f16278a;
    public boolean f16279b;
    public final b0 f16280c;

    public y(b0 b0Var, Looper looper) {
        super(looper);
        this.f16280c = b0Var;
        this.f16278a = true;
        this.f16279b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f16278a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f16278a = z12;
        if (this.f16279b && z11) {
            z13 = true;
        }
        this.f16279b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        r rVar;
        int i10;
        e1 e1Var;
        b0 b0Var = this.f16280c;
        c1 c1Var = b0Var.f16010g;
        if (message.what == 1) {
            e1 c10 = b0Var.f16021s.c(b0Var.f16022t.Q0(), b0Var.f16022t.O0(), b0Var.f16021s.f16069k);
            b0Var.f16021s = c10;
            boolean z10 = this.f16278a;
            boolean z11 = this.f16279b;
            e1 G0 = c1Var.G0(c10);
            pi.f fVar = c1Var.f16033b;
            e9.i0 s10 = fVar.s();
            for (int i11 = 0; i11 < s10.size(); i11++) {
                r rVar2 = (r) s10.get(i11);
                try {
                    com.google.android.gms.common.api.internal.v x10 = fVar.x(rVar2);
                    if (x10 != null) {
                        i10 = x10.e();
                    } else if (!b0Var.h(rVar2)) {
                        break;
                    } else {
                        i10 = 0;
                    }
                    e1 w10 = fVar.w(rVar2);
                    if (w10 == null) {
                        fVar.v(rVar2);
                        b2.x0 a2 = w7.s.a(fVar.r(rVar2), b0Var.f16022t.t());
                        try {
                            q qVar = rVar2.d;
                            e2.d.h(qVar);
                            if (w10 == null) {
                                rVar = rVar2;
                                e1Var = G0;
                            } else {
                                rVar = rVar2;
                                e1Var = w10;
                            }
                            try {
                                qVar.g(i10, e1Var, a2, z10, z11);
                            } catch (DeadObjectException unused) {
                                c1Var.f16033b.M(rVar);
                            } catch (RemoteException e7) {
                                e = e7;
                                e2.a.o("MediaSessionImpl", "Exception in " + rVar, e);
                            }
                        } catch (DeadObjectException unused2) {
                            rVar = rVar2;
                        } catch (RemoteException e10) {
                            e = e10;
                            rVar = rVar2;
                        }
                    }
                } catch (DeadObjectException unused3) {
                    rVar = rVar2;
                } catch (RemoteException e11) {
                    e = e11;
                    rVar = rVar2;
                }
            }
            this.f16278a = true;
            this.f16279b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
