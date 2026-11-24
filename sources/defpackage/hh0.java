package defpackage;

import android.accounts.Account;
import android.content.AttributionSource;
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
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
public abstract class hh0 {
    public static final o94[] D = new o94[0];
    public boolean A;
    public volatile ape B;
    public final AtomicInteger C;
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public volatile String f;
    public ry g;
    public final Context h;
    public final Looper i;
    public final lbf j;
    public final rdd k;
    public final Object l;
    public final Object m;
    public h7d n;
    public fh0 o;
    public IInterface p;
    public final ArrayList q;
    public qvd r;
    public byte s;
    public final cf9 t;
    public final oo8 u;
    public final short v;
    public final String w;
    public volatile String x;
    public volatile gz y;
    public ot2 z;

    public hh0(Context context, Looper looper, lbf lbfVar, int i, cf9 cf9Var, oo8 oo8Var, String str) {
        Object obj = d05.d;
        this.f = null;
        this.l = new Object();
        this.m = new Object();
        this.q = new ArrayList();
        this.s = (byte) 1;
        this.z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        ite.i(context, "Context must not be null");
        this.h = context;
        ite.i(looper, "Looper must not be null");
        this.i = looper;
        ite.i(lbfVar, "Supervisor must not be null");
        this.j = lbfVar;
        this.k = new rdd(this, looper);
        this.v = i;
        this.t = cf9Var;
        this.u = oo8Var;
        this.w = str;
    }

    public final void A(int i, IInterface iInterface) {
        boolean z;
        boolean z2;
        ry ryVar;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (iInterface == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        ite.b(z3);
        synchronized (this.l) {
            this.s = i;
            this.p = iInterface;
            Bundle bundle = null;
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        ite.h(iInterface);
                        IInterface iInterface2 = iInterface;
                        this.c = System.currentTimeMillis();
                    }
                } else {
                    qvd qvdVar = this.r;
                    if (qvdVar != null && (ryVar = this.g) != null) {
                        String str = (String) ryVar.c;
                        String str2 = (String) ryVar.d;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 70 + String.valueOf(str2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str);
                        sb.append(" on ");
                        sb.append(str2);
                        Log.e("GmsClient", sb.toString());
                        lbf lbfVar = this.j;
                        String str3 = (String) this.g.c;
                        ite.h(str3);
                        String str4 = (String) this.g.d;
                        if (this.w == null) {
                            this.h.getClass();
                        }
                        lbfVar.c(str3, str4, qvdVar, this.g.b);
                        this.C.incrementAndGet();
                    }
                    qvd qvdVar2 = new qvd(this, this.C.get());
                    this.r = qvdVar2;
                    String o = o();
                    String n = n();
                    boolean p = p();
                    this.g = new ry(o, n, p);
                    if (p && i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.g.c)));
                    }
                    lbf lbfVar2 = this.j;
                    String str5 = (String) this.g.c;
                    ite.h(str5);
                    String str6 = (String) this.g.d;
                    String str7 = this.w;
                    if (str7 == null) {
                        str7 = this.h.getClass().getName();
                    }
                    ot2 b = lbfVar2.b(new z4f(str5, str6, this.g.b), qvdVar2, str7);
                    if (!b.c()) {
                        ry ryVar2 = this.g;
                        String str8 = (String) ryVar2.c;
                        String str9 = (String) ryVar2.d;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str8);
                        sb2.append(" on ");
                        sb2.append(str9);
                        Log.w("GmsClient", sb2.toString());
                        int i2 = b.b;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (b.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b.c);
                        }
                        int i3 = this.C.get();
                        h8e h8eVar = new h8e(this, i2, bundle);
                        rdd rddVar = this.k;
                        rddVar.sendMessage(rddVar.obtainMessage(7, i3, -1, h8eVar));
                    }
                }
            } else {
                qvd qvdVar3 = this.r;
                if (qvdVar3 != null) {
                    lbf lbfVar3 = this.j;
                    String str10 = (String) this.g.c;
                    ite.h(str10);
                    String str11 = (String) this.g.d;
                    if (this.w == null) {
                        this.h.getClass();
                    }
                    lbfVar3.c(str10, str11, qvdVar3, this.g.b);
                    this.r = null;
                }
            }
        }
    }

    public void a(fh0 fh0Var) {
        ite.i(fh0Var, "Connection progress callbacks cannot be null.");
        this.o = fh0Var;
        A(2, null);
    }

    public IInterface b(IBinder iBinder) {
        iBinder.getClass();
        int i = ij5.b;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        if (queryLocalInterface instanceof jj5) {
            return (jj5) queryLocalInterface;
        }
        return new hj5(iBinder);
    }

    public void c() {
        this.C.incrementAndGet();
        ArrayList arrayList = this.q;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((p6d) arrayList.get(i)).d();
            }
            arrayList.clear();
        }
        synchronized (this.m) {
            this.n = null;
        }
        A(1, null);
    }

    public final void d(String str) {
        this.f = str;
        c();
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        byte b;
        IInterface iInterface;
        h7d h7dVar;
        long j;
        synchronized (this.l) {
            b = this.s;
            iInterface = this.p;
        }
        synchronized (this.m) {
            h7dVar = this.n;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    if (b != 4) {
                        if (b != 5) {
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
            printWriter.append((CharSequence) l()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (h7dVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(h7dVar.a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.c;
            String format = simpleDateFormat.format(new Date(j2));
            j = 0;
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 1 + String.valueOf(format).length());
            sb.append(j2);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        } else {
            j = 0;
        }
        if (this.b > j) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i = this.a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        printWriter.append((CharSequence) String.valueOf(i));
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
            long j3 = this.b;
            String format2 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j3).length() + 1 + String.valueOf(format2).length());
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.e > j) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) dud.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.e;
            String format3 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j4).length() + 1 + String.valueOf(format3).length());
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public o94[] f() {
        return D;
    }

    public Bundle g() {
        return null;
    }

    public Bundle h() {
        return new Bundle();
    }

    public int i() {
        return 17895000;
    }

    public void j(ti5 ti5Var, Set set) {
        String attributionTag;
        Bundle h = h();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag = this.x;
        } else if (this.y == null) {
            attributionTag = this.x;
        } else {
            AttributionSource attributionSource = this.y.a;
            if (attributionSource == null) {
                attributionTag = this.x;
            } else if (attributionSource.getAttributionTag() == null) {
                attributionTag = this.x;
            } else {
                attributionTag = attributionSource.getAttributionTag();
            }
        }
        String str = attributionTag;
        short s = this.v;
        int i = e05.a;
        Scope[] scopeArr = dv4.F;
        Bundle bundle = new Bundle();
        o94[] o94VarArr = dv4.G;
        dv4 dv4Var = new dv4(6, s, i, null, null, scopeArr, bundle, null, o94VarArr, o94VarArr, true, 0, false, str);
        dv4Var.d = this.h.getPackageName();
        dv4Var.h = h;
        if (set != null) {
            dv4Var.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (w()) {
            dv4Var.n = new Account("<<default account>>", "com.google");
            if (ti5Var != null) {
                dv4Var.e = ti5Var.asBinder();
            }
        } else if (this instanceof w7d) {
            dv4Var.n = null;
        }
        dv4Var.r = D;
        dv4Var.s = f();
        if (x()) {
            dv4Var.y = true;
        }
        try {
            synchronized (this.m) {
                h7d h7dVar = this.n;
                if (h7dVar != null) {
                    h7dVar.a(new qpd(this, this.C.get()), dv4Var);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i2 = this.C.get();
            rdd rddVar = this.k;
            rddVar.sendMessage(rddVar.obtainMessage(6, i2, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            u(8, null, null, this.C.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            u(8, null, null, this.C.get());
        }
    }

    public final IInterface k() {
        IInterface iInterface;
        synchronized (this.l) {
            if (this.s != 5) {
                if (q()) {
                    IInterface iInterface2 = this.p;
                    ite.i(iInterface2, "Client is connected but service is null");
                    iInterface = iInterface2;
                } else {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    public String l() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    public Intent m() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public String n() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    public String o() {
        return "com.google.android.gms";
    }

    public boolean p() {
        if (i() >= 211700000) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.l) {
            if (this.s == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean r() {
        boolean z;
        synchronized (this.l) {
            byte b = this.s;
            z = true;
            if (b != 2 && b != 3) {
                z = false;
            }
        }
        return z;
    }

    public void s(ot2 ot2Var) {
        this.d = ot2Var.b;
        this.e = System.currentTimeMillis();
    }

    public void t(int i) {
        this.a = i;
        this.b = System.currentTimeMillis();
    }

    public void u(int i, IBinder iBinder, Bundle bundle, int i2) {
        x0e x0eVar = new x0e(this, i, iBinder, bundle);
        rdd rddVar = this.k;
        rddVar.sendMessage(rddVar.obtainMessage(1, i2, -1, x0eVar));
    }

    public boolean v() {
        return true;
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return this instanceof nc9;
    }

    public final boolean y(int i, int i2, IInterface iInterface) {
        synchronized (this.l) {
            if (this.s != i) {
                return false;
            }
            A(i2, iInterface);
            return true;
        }
    }

    public final void z() {
        byte b;
        int i;
        synchronized (this.l) {
            b = this.s;
        }
        if (b == 3) {
            this.A = true;
            i = 5;
        } else {
            i = 4;
        }
        rdd rddVar = this.k;
        rddVar.sendMessage(rddVar.obtainMessage(i, this.C.get(), 16));
    }
}
