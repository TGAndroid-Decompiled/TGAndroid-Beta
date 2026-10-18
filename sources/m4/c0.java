package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class c0 extends Handler {
    public boolean f16495a;
    public boolean f16496b;
    public final f0 f16497c;

    public c0(f0 f0Var, Looper looper) {
        super(looper);
        this.f16497c = f0Var;
        this.f16495a = true;
        this.f16496b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f16495a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f16495a = z12;
        if (this.f16496b && z11) {
            z13 = true;
        }
        this.f16496b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        v vVar;
        int i10;
        k1 k1Var;
        f0 f0Var = this.f16497c;
        i1 i1Var = f0Var.f16523g;
        if (message.what == 1) {
            k1 c10 = f0Var.f16534s.c(f0Var.f16535t.T0(), f0Var.f16535t.R0(), f0Var.f16534s.f16620k);
            f0Var.f16534s = c10;
            boolean z10 = this.f16495a;
            boolean z11 = this.f16496b;
            k1 Y0 = i1Var.Y0(c10);
            qi.e eVar = i1Var.f16565b;
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
                        b2.b1 a2 = w7.v.a(eVar.o(vVar2), f0Var.f16535t.s());
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
                                i1Var.f16565b.E(vVar);
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
            this.f16495a = true;
            this.f16496b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
