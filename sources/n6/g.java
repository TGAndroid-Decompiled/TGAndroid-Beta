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
import m.p3;
public abstract class g implements com.google.android.gms.common.api.c {
    public static final k6.c[] T = new k6.c[0];
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
    public int f16534a;
    public long f16535b;
    public long f16536c;
    public int d;
    public long f16537e;
    public volatile String f16538f;
    public androidx.activity.o h;
    public final Context f16539n;
    public final Looper f16540r;
    public final j0 f16541s;
    public final a0 v;
    public final Object f16542w;
    public final Object f16543x;
    public y f16544y;

    public g(Context context, Looper looper, int i10, p3 p3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i11) {
        synchronized (j0.f16564g) {
            try {
                if (j0.h == null) {
                    j0.h = new j0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j0 j0Var = j0.h;
        Object obj = k6.d.f14814c;
        l.h(kVar);
        l.h(lVar);
        m mVar = new m(kVar);
        m mVar2 = new m(lVar);
        Object obj2 = k6.d.f14814c;
        this.f16538f = null;
        this.f16542w = new Object();
        this.f16543x = new Object();
        this.G = new ArrayList();
        this.I = 1;
        this.O = null;
        this.P = false;
        this.Q = null;
        this.R = new AtomicInteger(0);
        l.i(context, "Context must not be null");
        this.f16539n = context;
        l.i(looper, "Looper must not be null");
        this.f16540r = looper;
        l.i(j0Var, "Supervisor must not be null");
        this.f16541s = j0Var;
        this.v = new a0(this, looper);
        this.L = i10;
        this.J = mVar;
        this.K = mVar2;
        this.M = (String) p3Var.f15637e;
        Set<Scope> set = (Set) p3Var.f15635b;
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
        synchronized (gVar.f16542w) {
            i10 = gVar.I;
        }
        if (i10 == 3) {
            gVar.P = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        a0 a0Var = gVar.v;
        a0Var.sendMessage(a0Var.obtainMessage(i11, gVar.R.get(), 16));
    }

    public static boolean E(g gVar, int i10, int i11, IInterface iInterface) {
        synchronized (gVar.f16542w) {
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
        this.f16534a = i10;
        this.f16535b = System.currentTimeMillis();
    }

    public void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        d0 d0Var = new d0(this, i10, iBinder, bundle);
        a0 a0Var = this.v;
        a0Var.sendMessage(a0Var.obtainMessage(1, i11, -1, d0Var));
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
        synchronized (this.f16542w) {
            try {
                this.I = i10;
                this.F = iInterface;
                Bundle bundle = null;
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3) {
                        if (i10 == 4) {
                            l.h(iInterface);
                            IInterface iInterface2 = iInterface;
                            this.f16536c = System.currentTimeMillis();
                        }
                    } else {
                        c0 c0Var = this.H;
                        if (c0Var != null && (oVar = this.h) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) oVar.f884c) + " on " + ((String) oVar.d));
                            j0 j0Var = this.f16541s;
                            String str = (String) this.h.f884c;
                            l.h(str);
                            String str2 = (String) this.h.d;
                            if (this.M == null) {
                                this.f16539n.getClass();
                            }
                            j0Var.c(str, str2, c0Var, this.h.f883b);
                            this.R.incrementAndGet();
                        }
                        c0 c0Var2 = new c0(this, this.R.get());
                        this.H = c0Var2;
                        String x10 = x();
                        String w10 = w();
                        boolean y3 = y();
                        this.h = new androidx.activity.o(x10, w10, y3, 4);
                        if (y3 && l() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.h.f884c)));
                        }
                        j0 j0Var2 = this.f16541s;
                        String str3 = (String) this.h.f884c;
                        l.h(str3);
                        String str4 = (String) this.h.d;
                        String str5 = this.M;
                        if (str5 == null) {
                            str5 = this.f16539n.getClass().getName();
                        }
                        k6.a b10 = j0Var2.b(new g0(str3, str4, this.h.f883b), c0Var2, str5);
                        if (!b10.c()) {
                            androidx.activity.o oVar2 = this.h;
                            Log.w("GmsClient", "unable to connect to service: " + ((String) oVar2.f884c) + " on " + ((String) oVar2.d));
                            int i11 = b10.f14806b;
                            if (i11 == -1) {
                                i11 = 16;
                            }
                            if (b10.f14807c != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", b10.f14807c);
                            }
                            int i12 = this.R.get();
                            e0 e0Var = new e0(this, i11, bundle);
                            a0 a0Var = this.v;
                            a0Var.sendMessage(a0Var.obtainMessage(7, i12, -1, e0Var));
                        }
                    }
                } else {
                    c0 c0Var3 = this.H;
                    if (c0Var3 != null) {
                        j0 j0Var3 = this.f16541s;
                        String str6 = (String) this.h.f884c;
                        l.h(str6);
                        String str7 = (String) this.h.d;
                        if (this.M == null) {
                            this.f16539n.getClass();
                        }
                        j0Var3.c(str6, str7, c0Var3, this.h.f883b);
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
        int i11 = k6.e.f14815a;
        Scope[] scopeArr = f.E;
        Bundle bundle = new Bundle();
        k6.c[] cVarArr = f.F;
        f fVar = new f(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str2);
        fVar.d = this.f16539n.getPackageName();
        fVar.h = t10;
        if (set != null) {
            fVar.f16524f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (p()) {
            fVar.f16525n = new Account("<<default account>>", "com.google");
            if (hVar != null) {
                fVar.f16523e = hVar.asBinder();
            }
        } else if (this instanceof e8.b) {
            fVar.f16525n = null;
        }
        fVar.f16526r = T;
        fVar.f16527s = r();
        if (C()) {
            fVar.f16529x = true;
        }
        try {
            synchronized (this.f16543x) {
                try {
                    y yVar = this.f16544y;
                    if (yVar != null) {
                        yVar.G0(new b0(this, this.R.get()), fVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            int i12 = this.R.get();
            a0 a0Var = this.v;
            a0Var.sendMessage(a0Var.obtainMessage(6, i12, 3));
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.R.get());
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
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
        this.f16538f = str;
        disconnect();
    }

    @Override
    public void disconnect() {
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
        synchronized (this.f16543x) {
            this.f16544y = null;
        }
        F(1, null);
    }

    @Override
    public void e(b bVar) {
        l.i(bVar, "Connection progress callbacks cannot be null.");
        this.E = bVar;
        F(2, null);
    }

    @Override
    public final boolean f() {
        boolean z10;
        synchronized (this.f16542w) {
            int i10 = this.I;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override
    public final void g(String str, PrintWriter printWriter) {
        int i10;
        IInterface iInterface;
        y yVar;
        synchronized (this.f16542w) {
            i10 = this.I;
            iInterface = this.F;
        }
        synchronized (this.f16543x) {
            yVar = this.f16544y;
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
        if (yVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(yVar.f16613a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f16536c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j3 = this.f16536c;
            String format = simpleDateFormat.format(new Date(j3));
            append.println(j3 + " " + format);
        }
        if (this.f16535b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f16534a;
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
            long j10 = this.f16535b;
            String format2 = simpleDateFormat.format(new Date(j10));
            append2.println(j10 + " " + format2);
        }
        if (this.f16537e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) x8.j.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j11 = this.f16537e;
            String format3 = simpleDateFormat.format(new Date(j11));
            append3.println(j11 + " " + format3);
        }
    }

    @Override
    public final String h() {
        androidx.activity.o oVar;
        if (j() && (oVar = this.h) != null) {
            return (String) oVar.d;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @Override
    public final void i(a4.m mVar) {
        ((p0) mVar.f283b).f5088o.f5030x.post(new androidx.activity.i(mVar, 14));
    }

    @Override
    public final boolean j() {
        boolean z10;
        synchronized (this.f16542w) {
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
        f0 f0Var = this.Q;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f16532b;
    }

    @Override
    public final String n() {
        return this.f16538f;
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
        synchronized (this.f16542w) {
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
        this.d = aVar.f14806b;
        this.f16537e = System.currentTimeMillis();
    }
}
