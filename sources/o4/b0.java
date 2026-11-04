package o4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import b8.xe;
public final class b0 extends Handler {
    public boolean f20586a;
    public boolean f20587b;
    public final e0 f20588c;

    public b0(e0 e0Var, Looper looper) {
        super(looper);
        this.f20588c = e0Var;
        this.f20586a = true;
        this.f20587b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f20586a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f20586a = z12;
        if (this.f20587b && z11) {
            z13 = true;
        }
        this.f20587b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        v vVar;
        int i3;
        j1 j1Var;
        e0 e0Var = this.f20588c;
        h1 h1Var = e0Var.f20624g;
        if (message.what == 1) {
            j1 c2 = e0Var.f20635s.c(e0Var.f20636t.T0(), e0Var.f20636t.R0(), e0Var.f20635s.f20727k);
            e0Var.f20635s = c2;
            boolean z10 = this.f20586a;
            boolean z11 = this.f20587b;
            j1 a12 = h1Var.a1(c2);
            ui.f fVar = h1Var.f20661b;
            g9.i0 n4 = fVar.n();
            for (int i10 = 0; i10 < n4.size(); i10++) {
                v vVar2 = (v) n4.get(i10);
                try {
                    com.google.android.gms.common.api.internal.s s6 = fVar.s(vVar2);
                    if (s6 != null) {
                        i3 = s6.e();
                    } else if (!e0Var.h(vVar2)) {
                        break;
                    } else {
                        i3 = 0;
                    }
                    j1 q10 = fVar.q(vVar2);
                    if (q10 == null) {
                        fVar.p(vVar2);
                        d2.a1 a10 = xe.a(fVar.m(vVar2), e0Var.f20636t.t());
                        try {
                            u uVar = vVar2.d;
                            uVar.getClass();
                            if (q10 == null) {
                                vVar = vVar2;
                                j1Var = a12;
                            } else {
                                vVar = vVar2;
                                j1Var = q10;
                            }
                            try {
                                uVar.f(i3, j1Var, a10, z10, z11);
                            } catch (DeadObjectException unused) {
                                h1Var.f20661b.K(vVar);
                            } catch (RemoteException e10) {
                                e = e10;
                                g2.a.m("MediaSessionImpl", "Exception in " + vVar, e);
                            }
                        } catch (DeadObjectException unused2) {
                            vVar = vVar2;
                        } catch (RemoteException e11) {
                            e = e11;
                            vVar = vVar2;
                        }
                    }
                } catch (DeadObjectException unused3) {
                    vVar = vVar2;
                } catch (RemoteException e12) {
                    e = e12;
                    vVar = vVar2;
                }
            }
            this.f20586a = true;
            this.f20587b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
