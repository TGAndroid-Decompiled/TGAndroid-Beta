package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class y extends Handler {
    public boolean f16252a;
    public boolean f16253b;
    public final b0 f16254c;

    public y(b0 b0Var, Looper looper) {
        super(looper);
        this.f16254c = b0Var;
        this.f16252a = true;
        this.f16253b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f16252a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f16252a = z12;
        if (this.f16253b && z11) {
            z13 = true;
        }
        this.f16253b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        r rVar;
        int i10;
        d1 d1Var;
        b0 b0Var = this.f16254c;
        b1 b1Var = b0Var.f15985g;
        if (message.what == 1) {
            d1 c10 = b0Var.f15996s.c(b0Var.f15997t.Q0(), b0Var.f15997t.O0(), b0Var.f15996s.f16035k);
            b0Var.f15996s = c10;
            boolean z10 = this.f16252a;
            boolean z11 = this.f16253b;
            d1 G0 = b1Var.G0(c10);
            oi.f fVar = b1Var.f16004b;
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
                    d1 w10 = fVar.w(rVar2);
                    if (w10 == null) {
                        fVar.v(rVar2);
                        b2.x0 a2 = w7.s.a(fVar.r(rVar2), b0Var.f15997t.t());
                        try {
                            q qVar = rVar2.d;
                            e2.d.h(qVar);
                            if (w10 == null) {
                                rVar = rVar2;
                                d1Var = G0;
                            } else {
                                rVar = rVar2;
                                d1Var = w10;
                            }
                            try {
                                qVar.g(i10, d1Var, a2, z10, z11);
                            } catch (DeadObjectException unused) {
                                b1Var.f16004b.M(rVar);
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
            this.f16252a = true;
            this.f16253b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
