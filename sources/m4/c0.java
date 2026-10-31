package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class c0 extends Handler {
    public boolean f12707a;
    public boolean f12708b;
    public final f0 f12709c;

    public c0(f0 f0Var, Looper looper) {
        super(looper);
        this.f12709c = f0Var;
        this.f12707a = true;
        this.f12708b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f12707a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f12707a = z12;
        if (this.f12708b && z11) {
            z13 = true;
        }
        this.f12708b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        w wVar;
        int i10;
        l1 l1Var;
        f0 f0Var = this.f12709c;
        j1 j1Var = f0Var.f12742g;
        if (message.what == 1) {
            l1 c10 = f0Var.f12753s.c(f0Var.f12754t.T0(), f0Var.f12754t.R0(), f0Var.f12753s.f12843k);
            f0Var.f12753s = c10;
            boolean z10 = this.f12707a;
            boolean z11 = this.f12708b;
            l1 a12 = j1Var.a1(c10);
            xa.n nVar = j1Var.f12789b;
            e9.n0 A = nVar.A();
            for (int i11 = 0; i11 < A.size(); i11++) {
                w wVar2 = (w) A.get(i11);
                try {
                    com.google.android.gms.common.api.internal.v G = nVar.G(wVar2);
                    if (G != null) {
                        i10 = G.e();
                    } else if (!f0Var.h(wVar2)) {
                        break;
                    } else {
                        i10 = 0;
                    }
                    l1 F = nVar.F(wVar2);
                    if (F == null) {
                        nVar.E(wVar2);
                        b2.b1 a2 = w7.y.a(nVar.y(wVar2), f0Var.f12754t.s());
                        try {
                            v vVar = wVar2.d;
                            vVar.getClass();
                            if (F == null) {
                                wVar = wVar2;
                                l1Var = a12;
                            } else {
                                wVar = wVar2;
                                l1Var = F;
                            }
                            try {
                                vVar.h(i10, l1Var, a2, z10, z11);
                            } catch (DeadObjectException unused) {
                                j1Var.f12789b.U(wVar);
                            } catch (RemoteException e) {
                                e = e;
                                e2.a.m("MediaSessionImpl", "Exception in " + wVar, e);
                            }
                        } catch (DeadObjectException unused2) {
                            wVar = wVar2;
                        } catch (RemoteException e7) {
                            e = e7;
                            wVar = wVar2;
                        }
                    }
                } catch (DeadObjectException unused3) {
                    wVar = wVar2;
                } catch (RemoteException e10) {
                    e = e10;
                    wVar = wVar2;
                }
            }
            this.f12707a = true;
            this.f12708b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
