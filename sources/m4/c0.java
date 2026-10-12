package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class c0 extends Handler {
    public boolean f15394a;
    public boolean f15395b;
    public final f0 f15396c;

    public c0(f0 f0Var, Looper looper) {
        super(looper);
        this.f15396c = f0Var;
        this.f15394a = true;
        this.f15395b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f15394a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f15394a = z12;
        if (this.f15395b && z11) {
            z13 = true;
        }
        this.f15395b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        w wVar;
        int i10;
        l1 l1Var;
        f0 f0Var = this.f15396c;
        j1 j1Var = f0Var.f15428g;
        if (message.what == 1) {
            l1 c10 = f0Var.f15439s.c(f0Var.f15440t.T0(), f0Var.f15440t.R0(), f0Var.f15439s.f15531k);
            f0Var.f15439s = c10;
            boolean z10 = this.f15394a;
            boolean z11 = this.f15395b;
            l1 Y0 = j1Var.Y0(c10);
            qi.e eVar = j1Var.f15475b;
            e9.n0 m10 = eVar.m();
            for (int i11 = 0; i11 < m10.size(); i11++) {
                w wVar2 = (w) m10.get(i11);
                try {
                    com.google.android.gms.common.api.internal.v q6 = eVar.q(wVar2);
                    if (q6 != null) {
                        i10 = q6.e();
                    } else if (!f0Var.h(wVar2)) {
                        break;
                    } else {
                        i10 = 0;
                    }
                    l1 p5 = eVar.p(wVar2);
                    if (p5 == null) {
                        eVar.o(wVar2);
                        b2.c1 a2 = w7.w.a(eVar.l(wVar2), f0Var.f15440t.s());
                        try {
                            v vVar = wVar2.d;
                            vVar.getClass();
                            if (p5 == null) {
                                wVar = wVar2;
                                l1Var = Y0;
                            } else {
                                wVar = wVar2;
                                l1Var = p5;
                            }
                            try {
                                vVar.h(i10, l1Var, a2, z10, z11);
                            } catch (DeadObjectException unused) {
                                j1Var.f15475b.C(wVar);
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
            this.f15394a = true;
            this.f15395b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
