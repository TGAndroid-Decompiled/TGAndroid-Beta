package m4;

import a8.ie;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class c0 extends Handler {
    public boolean f18010a;
    public boolean f18011b;
    public final f0 f18012c;

    public c0(f0 f0Var, Looper looper) {
        super(looper);
        this.f18012c = f0Var;
        this.f18010a = true;
        this.f18011b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f18010a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f18010a = z12;
        if (this.f18011b && z11) {
            z13 = true;
        }
        this.f18011b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        w wVar;
        int i10;
        l1 l1Var;
        f0 f0Var = this.f18012c;
        j1 j1Var = f0Var.f18044g;
        if (message.what == 1) {
            l1 c10 = f0Var.f18055s.c(f0Var.f18056t.T0(), f0Var.f18056t.R0(), f0Var.f18055s.f18145k);
            f0Var.f18055s = c10;
            boolean z10 = this.f18010a;
            boolean z11 = this.f18011b;
            l1 Y0 = j1Var.Y0(c10);
            com.google.firebase.messaging.q qVar = j1Var.f18091b;
            f9.i0 k10 = qVar.k();
            for (int i11 = 0; i11 < k10.size(); i11++) {
                w wVar2 = (w) k10.get(i11);
                try {
                    com.google.android.gms.common.api.internal.u p10 = qVar.p(wVar2);
                    if (p10 != null) {
                        i10 = p10.e();
                    } else if (!f0Var.h(wVar2)) {
                        break;
                    } else {
                        i10 = 0;
                    }
                    l1 o10 = qVar.o(wVar2);
                    if (o10 == null) {
                        qVar.n(wVar2);
                        b2.c1 a2 = ie.a(qVar.j(wVar2), f0Var.f18056t.s());
                        try {
                            v vVar = wVar2.d;
                            vVar.getClass();
                            if (o10 == null) {
                                wVar = wVar2;
                                l1Var = Y0;
                            } else {
                                wVar = wVar2;
                                l1Var = o10;
                            }
                            try {
                                vVar.h(i10, l1Var, a2, z10, z11);
                            } catch (DeadObjectException unused) {
                                j1Var.f18091b.B(wVar);
                            } catch (RemoteException e) {
                                e = e;
                                e2.a.m("MediaSessionImpl", "Exception in " + wVar, e);
                            }
                        } catch (DeadObjectException unused2) {
                            wVar = wVar2;
                        } catch (RemoteException e10) {
                            e = e10;
                            wVar = wVar2;
                        }
                    }
                } catch (DeadObjectException unused3) {
                    wVar = wVar2;
                } catch (RemoteException e11) {
                    e = e11;
                    wVar = wVar2;
                }
            }
            this.f18010a = true;
            this.f18011b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
