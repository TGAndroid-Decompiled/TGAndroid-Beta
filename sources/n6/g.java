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
import com.google.android.gms.common.api.internal.q0;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import m.p3;
public abstract class g implements com.google.android.gms.common.api.c {
    public static final k6.c[] T = new k6.c[0];
    public y D;
    public b E;
    public IInterface F;
    public final ArrayList G;
    public c0 H;
    public int I;
    public final m J;
    public final m K;
    public final int L;
    public final String M;
    public volatile String N;
    public k6.a O;
    public boolean P;
    public volatile f0 Q;
    public final AtomicInteger R;
    public final Set S;
    public int f13582a;
    public long f13583b;
    public long f13584c;
    public int d;
    public long e;
    public volatile String f13585f;
    public androidx.activity.o h;
    public final Context f13586n;
    public final Looper f13587r;
    public final j0 f13588s;
    public final a0 f13589w;
    public final Object f13590x;
    public final Object f13591y;

    public g(Context context, Looper looper, int i10, p3 p3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i11) {
        synchronized (j0.f13609g) {
            try {
                if (j0.h == null) {
                    j0.h = new j0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j0 j0Var = j0.h;
        Object obj = k6.d.f10935c;
        l.g(kVar);
        l.g(lVar);
        m mVar = new m(kVar);
        m mVar2 = new m(lVar);
        Object obj2 = k6.d.f10935c;
        this.f13585f = null;
        this.f13590x = new Object();
        this.f13591y = new Object();
        this.G = new ArrayList();
        this.I = 1;
        this.O = null;
        this.P = false;
        this.Q = null;
        this.R = new AtomicInteger(0);
        l.h(context, "Context must not be null");
        this.f13586n = context;
        l.h(looper, "Looper must not be null");
        this.f13587r = looper;
        l.h(j0Var, "Supervisor must not be null");
        this.f13588s = j0Var;
        this.f13589w = new a0(this, looper);
        this.L = i10;
        this.J = mVar;
        this.K = mVar2;
        this.M = (String) p3Var.e;
        Set<Scope> set = (Set) p3Var.f12520b;
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.S = set;
    }

    public static void E(g gVar) {
        int i10;
        int i11;
        synchronized (gVar.f13590x) {
            i10 = gVar.I;
        }
        if (i10 == 3) {
            gVar.P = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        a0 a0Var = gVar.f13589w;
        a0Var.sendMessage(a0Var.obtainMessage(i11, gVar.R.get(), 16));
    }

    public static boolean F(g gVar, int i10, int i11, IInterface iInterface) {
        synchronized (gVar.f13590x) {
            try {
                if (gVar.I != i10) {
                    return false;
                }
                gVar.G(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void A(k6.a aVar) {
        this.d = aVar.f10927b;
        this.e = System.currentTimeMillis();
    }

    public void B(int i10) {
        this.f13582a = i10;
        this.f13583b = System.currentTimeMillis();
    }

    public void C(int i10, IBinder iBinder, Bundle bundle, int i11) {
        d0 d0Var = new d0(this, i10, iBinder, bundle);
        a0 a0Var = this.f13589w;
        a0Var.sendMessage(a0Var.obtainMessage(1, i11, -1, d0Var));
    }

    public boolean D() {
        return this instanceof b6.a;
    }

    public final void G(int i10, IInterface iInterface) {
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
        synchronized (this.f13590x) {
            try {
                this.I = i10;
                this.F = iInterface;
                Bundle bundle = null;
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3) {
                        if (i10 == 4) {
                            l.g(iInterface);
                            IInterface iInterface2 = iInterface;
                            this.f13584c = System.currentTimeMillis();
                        }
                    } else {
                        c0 c0Var = this.H;
                        if (c0Var != null && (oVar = this.h) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) oVar.f954c) + " on " + ((String) oVar.d));
                            j0 j0Var = this.f13588s;
                            String str = (String) this.h.f954c;
                            l.g(str);
                            String str2 = (String) this.h.d;
                            if (this.M == null) {
                                this.f13586n.getClass();
                            }
                            j0Var.c(str, str2, c0Var, this.h.f953b);
                            this.R.incrementAndGet();
                        }
                        c0 c0Var2 = new c0(this, this.R.get());
                        this.H = c0Var2;
                        String y3 = y();
                        String x10 = x();
                        boolean z13 = z();
                        this.h = new androidx.activity.o(y3, x10, z13);
                        if (z13 && m() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.h.f954c)));
                        }
                        j0 j0Var2 = this.f13588s;
                        String str3 = (String) this.h.f954c;
                        l.g(str3);
                        String str4 = (String) this.h.d;
                        String str5 = this.M;
                        if (str5 == null) {
                            str5 = this.f13586n.getClass().getName();
                        }
                        k6.a b10 = j0Var2.b(new g0(str3, str4, this.h.f953b), c0Var2, str5);
                        if (!b10.c()) {
                            androidx.activity.o oVar2 = this.h;
                            Log.w("GmsClient", "unable to connect to service: " + ((String) oVar2.f954c) + " on " + ((String) oVar2.d));
                            int i11 = b10.f10927b;
                            if (i11 == -1) {
                                i11 = 16;
                            }
                            if (b10.f10928c != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", b10.f10928c);
                            }
                            int i12 = this.R.get();
                            e0 e0Var = new e0(this, i11, bundle);
                            a0 a0Var = this.f13589w;
                            a0Var.sendMessage(a0Var.obtainMessage(7, i12, -1, e0Var));
                        }
                    }
                } else {
                    c0 c0Var3 = this.H;
                    if (c0Var3 != null) {
                        j0 j0Var3 = this.f13588s;
                        String str6 = (String) this.h.f954c;
                        l.g(str6);
                        String str7 = (String) this.h.d;
                        if (this.M == null) {
                            this.f13586n.getClass();
                        }
                        j0Var3.c(str6, str7, c0Var3, this.h.f953b);
                        this.H = null;
                    }
                }
            } finally {
            }
        }
    }

    @Override
    public final void a(k6.h hVar) {
        ((q0) hVar.f10944b).f4474o.f4414y.post(new androidx.activity.i(hVar, 13));
    }

    @Override
    public boolean b() {
        return this instanceof a6.e;
    }

    @Override
    public final void c(h hVar, Set set) {
        String str;
        Bundle u10 = u();
        if (Build.VERSION.SDK_INT < 31) {
            str = this.N;
        } else {
            str = this.N;
        }
        String str2 = str;
        int i10 = this.L;
        int i11 = k6.e.f10936a;
        Scope[] scopeArr = f.E;
        Bundle bundle = new Bundle();
        k6.c[] cVarArr = f.F;
        f fVar = new f(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str2);
        fVar.d = this.f13586n.getPackageName();
        fVar.h = u10;
        if (set != null) {
            fVar.f13572f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (q()) {
            fVar.f13573n = new Account("<<default account>>", "com.google");
            if (hVar != null) {
                fVar.e = hVar.asBinder();
            }
        } else if (this instanceof e8.b) {
            fVar.f13573n = null;
        }
        fVar.f13574r = T;
        fVar.f13575s = s();
        if (D()) {
            fVar.f13578y = true;
        }
        try {
            synchronized (this.f13591y) {
                try {
                    y yVar = this.D;
                    if (yVar != null) {
                        yVar.H0(new b0(this, this.R.get()), fVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i12 = this.R.get();
            a0 a0Var = this.f13589w;
            a0Var.sendMessage(a0Var.obtainMessage(6, i12, 3));
        } catch (RemoteException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            C(8, null, null, this.R.get());
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            C(8, null, null, this.R.get());
        }
    }

    @Override
    public final Set d() {
        if (q()) {
            return this.S;
        }
        return Collections.EMPTY_SET;
    }

    @Override
    public final void e(String str) {
        this.f13585f = str;
        j();
    }

    @Override
    public void f(b bVar) {
        l.h(bVar, "Connection progress callbacks cannot be null.");
        this.E = bVar;
        G(2, null);
    }

    @Override
    public final boolean g() {
        boolean z10;
        synchronized (this.f13590x) {
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
        y yVar;
        synchronized (this.f13590x) {
            i10 = this.I;
            iInterface = this.F;
        }
        synchronized (this.f13591y) {
            yVar = this.D;
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
            printWriter.append((CharSequence) w()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (yVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(yVar.f13653a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f13584c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f13584c;
            String format = simpleDateFormat.format(new Date(j10));
            append.println(j10 + " " + format);
        }
        if (this.f13583b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f13582a;
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
            long j11 = this.f13583b;
            String format2 = simpleDateFormat.format(new Date(j11));
            append2.println(j11 + " " + format2);
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) x8.c.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.e;
            String format3 = simpleDateFormat.format(new Date(j12));
            append3.println(j12 + " " + format3);
        }
    }

    @Override
    public final String i() {
        androidx.activity.o oVar;
        if (k() && (oVar = this.h) != null) {
            return (String) oVar.d;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @Override
    public void j() {
        this.R.incrementAndGet();
        synchronized (this.G) {
            try {
                int size = this.G.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((w) this.G.get(i10)).c();
                }
                this.G.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f13591y) {
            this.D = null;
        }
        G(1, null);
    }

    @Override
    public final boolean k() {
        boolean z10;
        synchronized (this.f13590x) {
            if (this.I == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override
    public boolean l() {
        return true;
    }

    @Override
    public abstract int m();

    @Override
    public final k6.c[] n() {
        f0 f0Var = this.Q;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f13580b;
    }

    @Override
    public final String o() {
        return this.f13585f;
    }

    @Override
    public Intent p() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @Override
    public boolean q() {
        return false;
    }

    public abstract IInterface r(IBinder iBinder);

    public k6.c[] s() {
        return T;
    }

    public Bundle t() {
        return null;
    }

    public Bundle u() {
        return new Bundle();
    }

    public final IInterface v() {
        IInterface iInterface;
        synchronized (this.f13590x) {
            try {
                if (this.I != 5) {
                    if (k()) {
                        IInterface iInterface2 = this.F;
                        l.h(iInterface2, "Client is connected but service is null");
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

    public abstract String w();

    public abstract String x();

    public String y() {
        return "com.google.android.gms";
    }

    public boolean z() {
        if (m() >= 211700000) {
            return true;
        }
        return false;
    }
}
