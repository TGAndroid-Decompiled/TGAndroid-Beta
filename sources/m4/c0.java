package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class c0 extends Handler {
    public boolean f16488a;
    public boolean f16489b;
    public final f0 f16490c;

    public c0(f0 f0Var, Looper looper) {
        super(looper);
        this.f16490c = f0Var;
        this.f16488a = true;
        this.f16489b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f16488a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f16488a = z12;
        if (this.f16489b && z11) {
            z13 = true;
        }
        this.f16489b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        v vVar;
        int i10;
        k1 k1Var;
        f0 f0Var = this.f16490c;
        i1 i1Var = f0Var.f16516g;
        if (message.what == 1) {
            k1 c10 = f0Var.f16527s.c(f0Var.f16528t.T0(), f0Var.f16528t.R0(), f0Var.f16527s.f16613k);
            f0Var.f16527s = c10;
            boolean z10 = this.f16488a;
            boolean z11 = this.f16489b;
            k1 Y0 = i1Var.Y0(c10);
            qi.e eVar = i1Var.f16558b;
            e9.n0 p5 = eVar.p();
            for (int i11 = 0; i11 < p5.size(); i11++) {
                v vVar2 = (v) p5.get(i11);
                try {
                    com.google.android.gms.common.api.internal.u t10 = eVar.t(vVar2);
                    if (t10 != null) {
                        i10 = t10.e();
                    } else if (!f0Var.h(vVar2)) {
                        break;
                    } else {
                        i10 = 0;
                    }
                    k1 s10 = eVar.s(vVar2);
                    if (s10 == null) {
                        eVar.r(vVar2);
                        b2.b1 a2 = w7.v.a(eVar.o(vVar2), f0Var.f16528t.s());
                        try {
                            u uVar = vVar2.d;
                            uVar.getClass();
                            if (s10 == null) {
                                vVar = vVar2;
                                k1Var = Y0;
                            } else {
                                vVar = vVar2;
                                k1Var = s10;
                            }
                            try {
                                uVar.h(i10, k1Var, a2, z10, z11);
                            } catch (DeadObjectException unused) {
                                i1Var.f16558b.E(vVar);
                            } catch (RemoteException e) {
                                e = e;
                                e2.a.m("MediaSessionImpl", "Exception in " + vVar, e);
                            }
                        } catch (DeadObjectException unused2) {
                            vVar = vVar2;
                        } catch (RemoteException e7) {
                            e = e7;
                            vVar = vVar2;
                        }
                    }
                } catch (DeadObjectException unused3) {
                    vVar = vVar2;
                } catch (RemoteException e10) {
                    e = e10;
                    vVar = vVar2;
                }
            }
            this.f16488a = true;
            this.f16489b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
