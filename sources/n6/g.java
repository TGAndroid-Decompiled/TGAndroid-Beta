package n6;

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
import m.q3;
public abstract class g implements com.google.android.gms.common.api.c {
    public static final k6.c[] T = new k6.c[0];
    public b E;
    public IInterface F;
    public final ArrayList G;
    public d0 H;
    public int I;
    public final m J;
    public final m K;
    public final int L;
    public final String M;
    public volatile String N;
    public k6.a O;
    public boolean P;
    public volatile g0 Q;
    public final AtomicInteger R;
    public final Set S;
    public int f16084a;
    public long f16085b;
    public long f16086c;
    public int d;
    public long e;
    public volatile String f16087f;
    public androidx.activity.o h;
    public final Context f16088n;
    public final Looper f16089r;
    public final k0 f16090s;
    public final b0 v;
    public final Object f16091w;
    public final Object f16092x;
    public z f16093y;

    public g(Context context, Looper looper, int i10, q3 q3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i11) {
        synchronized (k0.f16114g) {
            try {
                if (k0.h == null) {
                    k0.h = new k0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k0 k0Var = k0.h;
        Object obj = k6.d.f14167c;
        l.h(kVar);
        l.h(lVar);
        m mVar = new m(kVar);
        m mVar2 = new m(lVar);
        Object obj2 = k6.d.f14167c;
        this.f16087f = null;
        this.f16091w = new Object();
        this.f16092x = new Object();
        this.G = new ArrayList();
        this.I = 1;
        this.O = null;
        this.P = false;
        this.Q = null;
        this.R = new AtomicInteger(0);
        l.i(context, "Context must not be null");
        this.f16088n = context;
        l.i(looper, "Looper must not be null");
        this.f16089r = looper;
        l.i(k0Var, "Supervisor must not be null");
        this.f16090s = k0Var;
        this.v = new b0(this, looper);
        this.L = i10;
        this.J = mVar;
        this.K = mVar2;
        this.M = (String) q3Var.e;
        Set<Scope> set = (Set) q3Var.f15220b;
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.S = set;
    }

    public static void D(g gVar) {
        int i10;
        int i11;
        synchronized (gVar.f16091w) {
            i10 = gVar.I;
        }
        if (i10 == 3) {
            gVar.P = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        b0 b0Var = gVar.v;
        b0Var.sendMessage(b0Var.obtainMessage(i11, gVar.R.get(), 16));
    }

    public static boolean E(g gVar, int i10, int i11, IInterface iInterface) {
        synchronized (gVar.f16091w) {
            try {
                if (gVar.I != i10) {
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
        this.f16084a = i10;
        this.f16085b = System.currentTimeMillis();
    }

    public void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        e0 e0Var = new e0(this, i10, iBinder, bundle);
        b0 b0Var = this.v;
        b0Var.sendMessage(b0Var.obtainMessage(1, i11, -1, e0Var));
    }

    public boolean C() {
        return this instanceof b6.a;
    }

    public final void F(int i10, IInterface iInterface) {
        boolean z10;
        boolean z11;
        androidx.activity.o oVar;
        boolean z12 = false;
        if (i10 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (iInterface == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 == z11) {
            z12 = true;
        }
        l.b(z12);
        synchronized (this.f16091w) {
            try {
                this.I = i10;
                this.F = iInterface;
                Bundle bundle = null;
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3) {
                        if (i10 == 4) {
                            l.h(iInterface);
                            IInterface iInterface2 = iInterface;
                            this.f16086c = System.currentTimeMillis();
                        }
                    } else {
                        d0 d0Var = this.H;
                        if (d0Var != null && (oVar = this.h) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) oVar.f1049b) + " on " + ((String) oVar.f1050c));
                            k0 k0Var = this.f16090s;
                            String str = (String) this.h.f1049b;
                            l.h(str);
                            String str2 = (String) this.h.f1050c;
                            if (this.M == null) {
                                this.f16088n.getClass();
                            }
                            k0Var.c(str, str2, d0Var, this.h.f1048a);
                            this.R.incrementAndGet();
                        }
                        d0 d0Var2 = new d0(this, this.R.get());
                        this.H = d0Var2;
                        String x10 = x();
                        String w9 = w();
                        boolean y3 = y();
                        ?? obj = new Object();
                        obj.f1050c = x10;
                        obj.f1049b = w9;
                        obj.f1048a = y3;
                        this.h = obj;
                        if (y3 && l() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.h.f1049b)));
                        }
                        k0 k0Var2 = this.f16090s;
                        String str3 = (String) this.h.f1049b;
                        l.h(str3);
                        String str4 = (String) this.h.f1050c;
                        String str5 = this.M;
                        if (str5 == null) {
                            str5 = this.f16088n.getClass().getName();
                        }
                        k6.a b10 = k0Var2.b(new h0(str3, str4, this.h.f1048a), d0Var2, str5);
                        if (!b10.c()) {
                            androidx.activity.o oVar2 = this.h;
                            Log.w("GmsClient", "unable to connect to service: " + ((String) oVar2.f1049b) + " on " + ((String) oVar2.f1050c));
                            int i11 = b10.f14159b;
                            if (i11 == -1) {
                                i11 = 16;
                            }
                            if (b10.f14160c != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", b10.f14160c);
                            }
                            int i12 = this.R.get();
                            f0 f0Var = new f0(this, i11, bundle);
                            b0 b0Var = this.v;
                            b0Var.sendMessage(b0Var.obtainMessage(7, i12, -1, f0Var));
                        }
                    }
                } else {
                    d0 d0Var3 = this.H;
                    if (d0Var3 != null) {
                        k0 k0Var3 = this.f16090s;
                        String str6 = (String) this.h.f1049b;
                        l.h(str6);
                        String str7 = (String) this.h.f1050c;
                        if (this.M == null) {
                            this.f16088n.getClass();
                        }
                        k0Var3.c(str6, str7, d0Var3, this.h.f1048a);
                        this.H = null;
                    }
                }
            } finally {
            }
        }
    }

    @Override
    public boolean a() {
        return this instanceof a6.e;
    }

    @Override
    public final void b(h hVar, Set set) {
        String str;
        Bundle t10 = t();
        if (Build.VERSION.SDK_INT < 31) {
            str = this.N;
        } else {
            str = this.N;
        }
        String str2 = str;
        int i10 = this.L;
        int i11 = k6.e.f14168a;
        Scope[] scopeArr = f.E;
        Bundle bundle = new Bundle();
        k6.c[] cVarArr = f.F;
        f fVar = new f(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str2);
        fVar.d = this.f16088n.getPackageName();
        fVar.h = t10;
        if (set != null) {
            fVar.f16076f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (p()) {
            fVar.f16077n = new Account("<<default account>>", "com.google");
            if (hVar != null) {
                fVar.e = hVar.asBinder();
            }
        } else if (this instanceof e8.b) {
            fVar.f16077n = null;
        }
        fVar.f16078r = T;
        fVar.f16079s = r();
        if (C()) {
            fVar.f16081x = true;
        }
        try {
            synchronized (this.f16092x) {
                try {
                    z zVar = this.f16093y;
                    if (zVar != null) {
                        zVar.F0(new c0(this, this.R.get()), fVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i12 = this.R.get();
            b0 b0Var = this.v;
            b0Var.sendMessage(b0Var.obtainMessage(6, i12, 3));
        } catch (RemoteException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.R.get());
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.R.get());
        }
    }

    @Override
    public final Set c() {
        if (p()) {
            return this.S;
        }
        return Collections.EMPTY_SET;
    }

    @Override
    public final void d(String str) {
        this.f16087f = str;
        disconnect();
    }

    @Override
    public void disconnect() {
        this.R.incrementAndGet();
        synchronized (this.G) {
            try {
                int size = this.G.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((x) this.G.get(i10)).c();
                }
                this.G.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f16092x) {
            this.f16093y = null;
        }
        F(1, null);
    }

    @Override
    public final void e(a6.i iVar) {
        ((p0) iVar.f305b).f5019o.f4964x.post(new androidx.activity.i((Object) iVar, 14));
    }

    @Override
    public void f(b bVar) {
        l.i(bVar, "Connection progress callbacks cannot be null.");
        this.E = bVar;
        F(2, null);
    }

    @Override
    public final boolean g() {
        boolean z10;
        synchronized (this.f16091w) {
            int i10 = this.I;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override
    public final void h(String str, PrintWriter printWriter) {
        int i10;
        IInterface iInterface;
        z zVar;
        synchronized (this.f16091w) {
            i10 = this.I;
            iInterface = this.F;
        }
        synchronized (this.f16092x) {
            zVar = this.f16093y;
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
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(zVar.f16161a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f16086c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f16086c;
            String format = simpleDateFormat.format(new Date(j10));
            append.println(j10 + " " + format);
        }
        if (this.f16085b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f16084a;
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
            long j11 = this.f16085b;
            String format2 = simpleDateFormat.format(new Date(j11));
            append2.println(j11 + " " + format2);
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) x8.j.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.e;
            String format3 = simpleDateFormat.format(new Date(j12));
            append3.println(j12 + " " + format3);
        }
    }

    @Override
    public final String i() {
        androidx.activity.o oVar;
        if (j() && (oVar = this.h) != null) {
            return (String) oVar.f1050c;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @Override
    public final boolean j() {
        boolean z10;
        synchronized (this.f16091w) {
            if (this.I == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override
    public boolean k() {
        return true;
    }

    @Override
    public abstract int l();

    @Override
    public final k6.c[] m() {
        g0 g0Var = this.Q;
        if (g0Var == null) {
            return null;
        }
        return g0Var.f16095b;
    }

    @Override
    public final String n() {
        return this.f16087f;
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

    public k6.c[] r() {
        return T;
    }

    public Bundle s() {
        return null;
    }

    public Bundle t() {
        return new Bundle();
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.f16091w) {
            try {
                if (this.I != 5) {
                    if (j()) {
                        IInterface iInterface2 = this.F;
                        l.i(iInterface2, "Client is connected but service is null");
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
        if (l() >= 211700000) {
            return true;
        }
        return false;
    }

    public void z(k6.a aVar) {
        this.d = aVar.f14159b;
        this.e = System.currentTimeMillis();
    }
}
