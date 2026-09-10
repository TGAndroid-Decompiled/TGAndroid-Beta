package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class y extends Handler {
    public boolean f13556a;
    public boolean f13557b;
    public final b0 f13558c;

    public y(b0 b0Var, Looper looper) {
        super(looper);
        this.f13558c = b0Var;
        this.f13556a = true;
        this.f13557b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f13556a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f13556a = z12;
        if (this.f13557b && z11) {
            z13 = true;
        }
        this.f13557b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        r rVar;
        int i10;
        j1 j1Var;
        b0 b0Var = this.f13558c;
        h1 h1Var = b0Var.f13295g;
        if (message.what == 1) {
            j1 c10 = b0Var.f13306s.c(b0Var.f13307t.Q0(), b0Var.f13307t.O0(), b0Var.f13306s.f13402k);
            b0Var.f13306s = c10;
            boolean z10 = this.f13556a;
            boolean z11 = this.f13557b;
            j1 H0 = h1Var.H0(c10);
            ki.f fVar = h1Var.f13376b;
            e9.i0 r10 = fVar.r();
            for (int i11 = 0; i11 < r10.size(); i11++) {
                r rVar2 = (r) r10.get(i11);
                try {
                    com.google.android.gms.common.api.internal.v w10 = fVar.w(rVar2);
                    if (w10 != null) {
                        i10 = w10.e();
                    } else if (!b0Var.h(rVar2)) {
                        break;
                    } else {
                        i10 = 0;
                    }
                    j1 v = fVar.v(rVar2);
                    if (v == null) {
                        fVar.u(rVar2);
                        b2.x0 a2 = w7.u.a(fVar.q(rVar2), b0Var.f13307t.t());
                        try {
                            q qVar = rVar2.d;
                            e2.d.h(qVar);
                            if (v == null) {
                                rVar = rVar2;
                                j1Var = H0;
                            } else {
                                rVar = rVar2;
                                j1Var = v;
                            }
                            try {
                                qVar.g(i10, j1Var, a2, z10, z11);
                            } catch (DeadObjectException unused) {
                                h1Var.f13376b.K(rVar);
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
            this.f13556a = true;
            this.f13557b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
