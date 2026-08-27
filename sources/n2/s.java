package n2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.internal.play_billing.z3;
import java.util.concurrent.TimeUnit;

public final class s implements ServiceConnection {

    public final c f18178a;

    public final com.google.android.gms.internal.play_billing.m f18179b;

    public final com.google.android.gms.internal.play_billing.m f18180c;
    public final b d;

    public s(b bVar, c cVar) {
        this.d = bVar;
        com.google.android.gms.internal.play_billing.h hVar = bVar.B;
        this.f18179b = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f18180c = new com.google.android.gms.internal.play_billing.m(hVar);
        this.f18178a = cVar;
    }

    public final Long a(boolean z10) {
        if (z10) {
            com.google.android.gms.internal.play_billing.m mVar = this.f18179b;
            if (!mVar.f4074b) {
                return null;
            }
            long jA = mVar.f4073a.a();
            if (!mVar.f4074b) {
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            mVar.f4074b = false;
            long j10 = (jA - mVar.d) + mVar.f4075c;
            mVar.f4075c = j10;
            return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
        }
        com.google.android.gms.internal.play_billing.m mVar2 = this.f18180c;
        if (!mVar2.f4074b) {
            return null;
        }
        long jA2 = mVar2.f4073a.a();
        if (!mVar2.f4074b) {
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        mVar2.f4074b = false;
        long j11 = (jA2 - mVar2.d) + mVar2.f4075c;
        mVar2.f4075c = j11;
        return Long.valueOf(TimeUnit.MILLISECONDS.convert(j11, TimeUnit.NANOSECONDS));
    }

    public final void b(g gVar, int i10, String str, boolean z10) {
        try {
            i3 i3VarS = j3.s();
            int i11 = gVar.f18147a;
            i3VarS.c();
            j3.r((j3) i3VarS.f4129b, i11);
            String str2 = gVar.f18149c;
            i3VarS.c();
            j3.o((j3) i3VarS.f4129b, str2);
            i3VarS.c();
            j3.q((j3) i3VarS.f4129b, i10);
            if (str != null) {
                i3VarS.c();
                j3.n((j3) i3VarS.f4129b, str);
            }
            Long lA = a(z10);
            b bVar = this.d;
            if (!z10) {
                y3 y3VarP = z3.p();
                y3VarP.c();
                z3.n((z3) y3VarP.f4129b, (j3) i3VarS.a());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    y3VarP.c();
                    z3.o((z3) y3VarP.f4129b, jLongValue);
                }
                bVar.h.B((z3) y3VarP.a());
                return;
            }
            b4 b4VarR = c4.r();
            b4VarR.d(false);
            b4VarR.e();
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                b4VarR.c();
                c4.p((c4) b4VarR.f4129b, jLongValue2);
            }
            e3 e3VarU = f3.u();
            e3VarU.d(i3VarS);
            e3VarU.c();
            f3.t((f3) e3VarU.f4129b, 6);
            e3VarU.e(b4VarR);
            bVar.h((f3) e3VarU.a());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void c(g gVar) {
        b bVar = this.d;
        synchronized (bVar.f18106a) {
            try {
                if (bVar.f18107b == 3) {
                    return;
                }
                try {
                    this.f18178a.onBillingSetupFinished(gVar);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing service died.");
        try {
            b bVar = this.d;
            if (b.q(bVar)) {
                g5.b bVar2 = bVar.h;
                e3 e3VarU = f3.u();
                e3VarU.c();
                f3.t((f3) e3VarU.f4129b, 6);
                i3 i3VarS = j3.s();
                i3VarS.c();
                j3.q((j3) i3VarS.f4129b, 110);
                e3VarU.d(i3VarS);
                b4 b4VarR = c4.r();
                b4VarR.d(false);
                b4VarR.e();
                e3VarU.e(b4VarR);
                bVar2.w((f3) e3VarU.a());
            } else {
                bVar.h.A(k3.n());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
        b bVar3 = this.d;
        synchronized (bVar3.f18106a) {
            if (bVar3.f18107b != 3 && bVar3.f18107b != 0) {
                bVar3.k(0);
                bVar3.m();
                try {
                    this.f18178a.onBillingServiceDisconnected();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.c aVar;
        com.google.android.gms.internal.play_billing.u.g("BillingClient", "Billing service connected.");
        b bVar = this.d;
        synchronized (bVar.f18106a) {
            try {
                if (bVar.f18107b == 3) {
                    return;
                }
                int i10 = com.google.android.gms.internal.play_billing.b.f3971b;
                if (iBinder == null) {
                    aVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    aVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.c ? (com.google.android.gms.internal.play_billing.c) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.a(iBinder, "com.android.vending.billing.IInAppBillingService", 2);
                }
                bVar.f18112i = aVar;
                if (b.f(new e7.p(this, 8), 30000L, new m.i3(this, 2), bVar.r(), bVar.e()) == null) {
                    g gVarU = bVar.u();
                    bVar.j(25, gVarU);
                    c(gVarU);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.u.h("BillingClient", "Billing service disconnected.");
        try {
            b bVar = this.d;
            if (b.q(bVar)) {
                g5.b bVar2 = bVar.h;
                e3 e3VarU = f3.u();
                e3VarU.c();
                f3.t((f3) e3VarU.f4129b, 6);
                i3 i3VarS = j3.s();
                i3VarS.c();
                j3.q((j3) i3VarS.f4129b, 109);
                e3VarU.d(i3VarS);
                b4 b4VarR = c4.r();
                b4VarR.d(false);
                b4VarR.e();
                e3VarU.e(b4VarR);
                bVar2.w((f3) e3VarU.a());
            } else {
                bVar.h.C(a4.n());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
        }
        com.google.android.gms.internal.play_billing.m mVar = this.f18180c;
        mVar.f4075c = 0L;
        mVar.f4074b = false;
        mVar.a();
        b bVar3 = this.d;
        synchronized (bVar3.f18106a) {
            try {
                if (bVar3.f18107b == 3) {
                    return;
                }
                bVar3.k(0);
                try {
                    this.f18178a.onBillingServiceDisconnected();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
