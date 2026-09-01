package b6;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.p0;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import m.r3;
public abstract class g implements com.google.android.gms.common.api.c {
    public static final y5.c[] Q = new y5.c[0];
    public b B;
    public IInterface C;
    public final ArrayList D;
    public d0 E;
    public int F;
    public final n G;
    public final n H;
    public final int I;
    public final String J;
    public volatile String K;
    public y5.a L;
    public boolean M;
    public volatile g0 N;
    public final AtomicInteger O;
    public final Set P;
    public int f1713a;
    public long f1714b;
    public long f1715c;
    public int d;
    public long f1716e;
    public volatile String f1717f;
    public androidx.activity.o h;
    public final Context f1718n;
    public final Looper f1719r;
    public final k0 f1720s;
    public final b0 v;
    public final Object f1721w;
    public final Object f1722x;
    public z f1723y;

    public g(Context context, Looper looper, int i10, r3 r3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i11) {
        synchronized (k0.f1749g) {
            try {
                if (k0.h == null) {
                    k0.h = new k0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k0 k0Var = k0.h;
        Object obj = y5.d.f50767c;
        m.h(kVar);
        m.h(lVar);
        n nVar = new n(kVar);
        n nVar2 = new n(lVar);
        Object obj2 = y5.d.f50767c;
        this.f1717f = null;
        this.f1721w = new Object();
        this.f1722x = new Object();
        this.D = new ArrayList();
        this.F = 1;
        this.L = null;
        this.M = false;
        this.N = null;
        this.O = new AtomicInteger(0);
        m.i(context, "Context must not be null");
        this.f1718n = context;
        m.i(looper, "Looper must not be null");
        this.f1719r = looper;
        m.i(k0Var, "Supervisor must not be null");
        this.f1720s = k0Var;
        this.v = new b0(this, looper);
        this.I = i10;
        this.G = nVar;
        this.H = nVar2;
        this.J = (String) r3Var.f13330e;
        Set<Scope> set = (Set) r3Var.f13328b;
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.P = set;
    }

    public static void D(g gVar) {
        int i10;
        int i11;
        synchronized (gVar.f1721w) {
            i10 = gVar.F;
        }
        if (i10 == 3) {
            gVar.M = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        b0 b0Var = gVar.v;
        b0Var.sendMessage(b0Var.obtainMessage(i11, gVar.O.get(), 16));
    }

    public static boolean E(g gVar, int i10, int i11, IInterface iInterface) {
        synchronized (gVar.f1721w) {
            try {
                if (gVar.F != i10) {
                    return false;
                }
                gVar.F(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void A(int i10) {
        this.f1713a = i10;
        this.f1714b = System.currentTimeMillis();
    }

    public void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        e0 e0Var = new e0(this, i10, iBinder, bundle);
        b0 b0Var = this.v;
        b0Var.sendMessage(b0Var.obtainMessage(1, i11, -1, e0Var));
    }

    public boolean C() {
        return this instanceof p5.a;
    }

    public final void F(int i10, IInterface iInterface) {
        boolean z4;
        boolean z10;
        androidx.activity.o oVar;
        boolean z11 = false;
        if (i10 != 4) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (iInterface == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z4 == z10) {
            z11 = true;
        }
        m.b(z11);
        synchronized (this.f1721w) {
            try {
                this.F = i10;
                this.C = iInterface;
                Bundle bundle = null;
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3) {
                        if (i10 == 4) {
                            m.h(iInterface);
                            IInterface iInterface2 = iInterface;
                            this.f1715c = System.currentTimeMillis();
                        }
                    } else {
                        d0 d0Var = this.E;
                        if (d0Var != null && (oVar = this.h) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) oVar.f356b) + " on " + ((String) oVar.f357c));
                            k0 k0Var = this.f1720s;
                            String str = (String) this.h.f356b;
                            m.h(str);
                            String str2 = (String) this.h.f357c;
                            if (this.J == null) {
                                this.f1718n.getClass();
                            }
                            k0Var.c(str, str2, d0Var, this.h.f355a);
                            this.O.incrementAndGet();
                        }
                        d0 d0Var2 = new d0(this, this.O.get());
                        this.E = d0Var2;
                        String x10 = x();
                        String w10 = w();
                        boolean y10 = y();
                        ?? obj = new Object();
                        obj.f357c = x10;
                        obj.f356b = w10;
                        obj.f355a = y10;
                        this.h = obj;
                        if (y10 && k() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.h.f356b)));
                        }
                        k0 k0Var2 = this.f1720s;
                        String str3 = (String) this.h.f356b;
                        m.h(str3);
                        String str4 = (String) this.h.f357c;
                        String str5 = this.J;
                        if (str5 == null) {
                            str5 = this.f1718n.getClass().getName();
                        }
                        y5.a b10 = k0Var2.b(new h0(str3, str4, this.h.f355a), d0Var2, str5);
                        if (!b10.f()) {
                            androidx.activity.o oVar2 = this.h;
                            Log.w("GmsClient", "unable to connect to service: " + ((String) oVar2.f356b) + " on " + ((String) oVar2.f357c));
                            int i11 = b10.f50759b;
                            if (i11 == -1) {
                                i11 = 16;
                            }
                            if (b10.f50760c != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", b10.f50760c);
                            }
                            int i12 = this.O.get();
                            f0 f0Var = new f0(this, i11, bundle);
                            b0 b0Var = this.v;
                            b0Var.sendMessage(b0Var.obtainMessage(7, i12, -1, f0Var));
                        }
                    }
                } else {
                    d0 d0Var3 = this.E;
                    if (d0Var3 != null) {
                        k0 k0Var3 = this.f1720s;
                        String str6 = (String) this.h.f356b;
                        m.h(str6);
                        String str7 = (String) this.h.f357c;
                        if (this.J == null) {
                            this.f1718n.getClass();
                        }
                        k0Var3.c(str6, str7, d0Var3, this.h.f355a);
                        this.E = null;
                    }
                }
            } finally {
            }
        }
    }

    @Override
    public boolean a() {
        return this instanceof o5.e;
    }

    @Override
    public final Set b() {
        if (p()) {
            return this.P;
        }
        return Collections.EMPTY_SET;
    }

    @Override
    public final void c(String str) {
        this.f1717f = str;
        disconnect();
    }

    @Override
    public final void d(o5.i iVar) {
        ((p0) iVar.f16615b).f2791o.f2731x.post(new androidx.activity.i(iVar, 11));
    }

    @Override
    public void disconnect() {
        this.O.incrementAndGet();
        synchronized (this.D) {
            try {
                int size = this.D.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((x) this.D.get(i10)).c();
                }
                this.D.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f1722x) {
            this.f1723y = null;
        }
        F(1, null);
    }

    @Override
    public final boolean e() {
        boolean z4;
        synchronized (this.f1721w) {
            int i10 = this.F;
            z4 = true;
            if (i10 != 2 && i10 != 3) {
                z4 = false;
            }
        }
        return z4;
    }

    @Override
    public final void f(String str, PrintWriter printWriter) {
        int i10;
        IInterface iInterface;
        z zVar;
        synchronized (this.f1721w) {
            i10 = this.F;
            iInterface = this.C;
        }
        synchronized (this.f1722x) {
            zVar = this.f1723y;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            printWriter.print("UNKNOWN");
                        } else {
                            printWriter.print("DISCONNECTING");
                        }
                    } else {
                        printWriter.print("CONNECTED");
                    }
                } else {
                    printWriter.print("LOCAL_CONNECTING");
                }
            } else {
                printWriter.print("REMOTE_CONNECTING");
            }
        } else {
            printWriter.print("DISCONNECTED");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) v()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (zVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(zVar.f1798a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f1715c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f1715c;
            String format = simpleDateFormat.format(new Date(j10));
            append.println(j10 + " " + format);
        }
        if (this.f1714b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f1713a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        printWriter.append((CharSequence) String.valueOf(i11));
                    } else {
                        printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    }
                } else {
                    printWriter.append("CAUSE_NETWORK_LOST");
                }
            } else {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.f1714b;
            String format2 = simpleDateFormat.format(new Date(j11));
            append2.println(j11 + " " + format2);
        }
        if (this.f1716e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) l8.j.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f1716e;
            String format3 = simpleDateFormat.format(new Date(j12));
            append3.println(j12 + " " + format3);
        }
    }

    @Override
    public final String g() {
        androidx.activity.o oVar;
        if (h() && (oVar = this.h) != null) {
            return (String) oVar.f357c;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @Override
    public final boolean h() {
        boolean z4;
        synchronized (this.f1721w) {
            if (this.F == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return z4;
    }

    @Override
    public final void i(i iVar, Set set) {
        String str;
        Bundle t6 = t();
        if (Build.VERSION.SDK_INT < 31) {
            str = this.K;
        } else {
            str = this.K;
        }
        String str2 = str;
        int i10 = this.I;
        int i11 = y5.e.f50768a;
        Scope[] scopeArr = f.B;
        Bundle bundle = new Bundle();
        y5.c[] cVarArr = f.C;
        f fVar = new f(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str2);
        fVar.d = this.f1718n.getPackageName();
        fVar.h = t6;
        if (set != null) {
            fVar.f1705f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (p()) {
            fVar.f1706n = new Account("<<default account>>", "com.google");
            if (iVar != null) {
                fVar.f1704e = iVar.asBinder();
            }
        } else if (this instanceof s7.b) {
            fVar.f1706n = null;
        }
        fVar.f1707r = Q;
        fVar.f1708s = r();
        if (C()) {
            fVar.f1710x = true;
        }
        try {
            synchronized (this.f1722x) {
                try {
                    z zVar = this.f1723y;
                    if (zVar != null) {
                        zVar.E0(new c0(this, this.O.get()), fVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e6) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e6);
            int i12 = this.O.get();
            b0 b0Var = this.v;
            b0Var.sendMessage(b0Var.obtainMessage(6, i12, 3));
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.O.get());
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.O.get());
        }
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public abstract int k();

    @Override
    public final y5.c[] l() {
        g0 g0Var = this.N;
        if (g0Var == null) {
            return null;
        }
        return g0Var.f1725b;
    }

    @Override
    public final String m() {
        return this.f1717f;
    }

    @Override
    public void n(b bVar) {
        m.i(bVar, "Connection progress callbacks cannot be null.");
        this.B = bVar;
        F(2, null);
    }

    @Override
    public Intent o() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @Override
    public boolean p() {
        return false;
    }

    public abstract IInterface q(IBinder iBinder);

    public y5.c[] r() {
        return Q;
    }

    public Bundle s() {
        return null;
    }

    public Bundle t() {
        return new Bundle();
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.f1721w) {
            try {
                if (this.F != 5) {
                    if (h()) {
                        IInterface iInterface2 = this.C;
                        m.i(iInterface2, "Client is connected but service is null");
                        iInterface = iInterface2;
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public abstract String v();

    public abstract String w();

    public String x() {
        return "com.google.android.gms";
    }

    public boolean y() {
        if (k() >= 211700000) {
            return true;
        }
        return false;
    }

    public void z(y5.a aVar) {
        this.d = aVar.f50759b;
        this.f1716e = System.currentTimeMillis();
    }
}
