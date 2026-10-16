package m4;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
public final class b0 extends Handler {
    public boolean f15124a;
    public boolean f15125b;
    public final e0 f15126c;

    public b0(e0 e0Var, Looper looper) {
        super(looper);
        this.f15126c = e0Var;
        this.f15124a = true;
        this.f15125b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        boolean z13 = false;
        if (this.f15124a && z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f15124a = z12;
        if (this.f15125b && z11) {
            z13 = true;
        }
        this.f15125b = z13;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override
    public final void handleMessage(Message message) {
        v vVar;
        int i10;
        k1 k1Var;
        e0 e0Var = this.f15126c;
        i1 i1Var = e0Var.f15158g;
        if (message.what == 1) {
            k1 c10 = e0Var.f15169s.c(e0Var.f15170t.T0(), e0Var.f15170t.R0(), e0Var.f15169s.f15261k);
            e0Var.f15169s = c10;
            boolean z10 = this.f15124a;
            boolean z11 = this.f15125b;
            k1 Y0 = i1Var.Y0(c10);
            pi.e eVar = i1Var.f15205b;
            e9.n0 m10 = eVar.m();
            for (int i11 = 0; i11 < m10.size(); i11++) {
                v vVar2 = (v) m10.get(i11);
                try {
                    com.google.android.gms.common.api.internal.v q6 = eVar.q(vVar2);
                    if (q6 != null) {
                        i10 = q6.e();
                    } else if (!e0Var.h(vVar2)) {
                        break;
                    } else {
                        i10 = 0;
                    }
                    k1 p5 = eVar.p(vVar2);
                    if (p5 == null) {
                        eVar.o(vVar2);
                        b2.c1 a2 = w7.v.a(eVar.l(vVar2), e0Var.f15170t.s());
                        try {
                            u uVar = vVar2.d;
                            uVar.getClass();
                            if (p5 == null) {
                                vVar = vVar2;
                                k1Var = Y0;
                            } else {
                                vVar = vVar2;
                                k1Var = p5;
                            }
                            try {
                                uVar.h(i10, k1Var, a2, z10, z11);
                            } catch (DeadObjectException unused) {
                                i1Var.f15205b.C(vVar);
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
            this.f15124a = true;
            this.f15125b = true;
            return;
        }
        throw new IllegalStateException("Invalid message what=" + message.what);
    }
}
