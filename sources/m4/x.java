package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class x extends Handler {
    public boolean f16134a;
    public boolean f16135b;
    public final a0 f16136c;

    public x(a0 a0Var, Looper looper) {
        super(looper);
        this.f16136c = a0Var;
        this.f16134a = true;
        this.f16135b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f16134a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f16134a = z12;
        if (this.f16135b && z11) {
            z13 = true;
        }
        this.f16135b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        r rVar;
        int i10;
        h1 h1Var;
        a0 a0Var = this.f16136c;
        f1 f1Var = a0Var.f15858g;
        if (message.what == 1) {
            h1 c10 = a0Var.f15869s.c(a0Var.f15870t.Q0(), a0Var.f15870t.O0(), a0Var.f15869s.f15968k);
            a0Var.f15869s = c10;
            boolean z10 = this.f16134a;
            boolean z11 = this.f16135b;
            h1 H0 = f1Var.H0(c10);
            fg.f fVar = f1Var.f15918b;
            e9.i0 t10 = fVar.t();
            for (int i11 = 0; i11 < t10.size(); i11++) {
                r rVar2 = (r) t10.get(i11);
                try {
                    com.google.android.gms.common.api.internal.v y3 = fVar.y(rVar2);
                    if (y3 != null) {
                        i10 = y3.e();
                    } else if (!a0Var.h(rVar2)) {
                        break;
                    } else {
                        i10 = 0;
                    }
                    h1 x10 = fVar.x(rVar2);
                    if (x10 == null) {
                        fVar.w(rVar2);
                        b2.x0 a2 = w7.t.a(fVar.s(rVar2), a0Var.f15870t.t());
                        try {
                            q qVar = rVar2.d;
                            e2.d.h(qVar);
                            if (x10 == null) {
                                rVar = rVar2;
                                h1Var = H0;
                            } else {
                                rVar = rVar2;
                                h1Var = x10;
                            }
                            try {
                                qVar.g(i10, h1Var, a2, z10, z11);
                            } catch (DeadObjectException unused) {
                                f1Var.f15918b.N(rVar);
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
            this.f16134a = true;
            this.f16135b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
