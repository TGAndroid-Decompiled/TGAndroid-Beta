package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
public final class d6d extends m05 implements p6d {
    public qgb E;
    public final qs F;
    public Set G;
    public final oxb H;
    public final qs I;
    public final rr5 J;
    public final aj3 K;
    public final ArrayList L;
    public Integer M;
    public final qx6 N;
    public final ReentrantLock b;
    public final u7d c;
    public q6d d;
    public final int e;
    public final Context f;
    public final Looper h;
    public final LinkedList n;
    public volatile boolean r;
    public final int s;
    public final short w;
    public final b6d x;
    public final i05 y;

    public d6d(Context context, ReentrantLock reentrantLock, Looper looper, oxb oxbVar, qs qsVar, ArrayList arrayList, ArrayList arrayList2, qs qsVar2, int i, ArrayList arrayList3) {
        i05 i05Var = i05.e;
        rr5 rr5Var = e7d.a;
        this.d = null;
        this.n = new LinkedList();
        this.s = 120000;
        this.w = (short) 5000;
        this.G = new HashSet();
        this.K = new aj3((byte) 16);
        this.M = null;
        pq8 pq8Var = new pq8(this, (byte) 27);
        this.f = context;
        this.b = reentrantLock;
        this.c = new u7d(looper, pq8Var);
        this.h = looper;
        int i2 = 0;
        this.x = new b6d(this, looper, (byte) 0);
        this.y = i05Var;
        this.e = -1;
        this.I = qsVar;
        this.F = qsVar2;
        this.L = arrayList3;
        this.N = new qx6((byte) 2);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            k05 k05Var = (k05) obj;
            u7d u7dVar = this.c;
            u7dVar.getClass();
            xve.h(k05Var);
            synchronized (u7dVar.r) {
                ArrayList arrayList4 = u7dVar.b;
                if (arrayList4.contains(k05Var)) {
                    String valueOf = String.valueOf(k05Var);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    arrayList4.add(k05Var);
                }
            }
            if (u7dVar.a.s()) {
                b99 b99Var = u7dVar.n;
                b99Var.sendMessage(b99Var.obtainMessage(1, k05Var));
            }
        }
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            this.c.a((l05) obj2);
        }
        this.H = oxbVar;
        this.J = rr5Var;
    }

    public static int f(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            d05 d05Var = (d05) it.next();
            z2 |= d05Var.w();
            z3 |= d05Var instanceof q8d;
        }
        if (z2) {
            if (z3 && z) {
                return 2;
            }
            return 1;
        }
        return 3;
    }

    @Override
    public final boolean a(m8d m8dVar) {
        q6d q6dVar = this.d;
        if (q6dVar != null && q6dVar.b(m8dVar)) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        q6d q6dVar = this.d;
        if (q6dVar != null) {
            q6dVar.f();
        }
    }

    public final void c() {
        boolean z;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            int i = this.e;
            Integer num = this.M;
            int i2 = 2;
            boolean z2 = false;
            if (i >= 0) {
                if (num != null) {
                    z = true;
                } else {
                    z = false;
                }
                xve.j("Sign-in mode should have been set explicitly by auto-manage.", z);
            } else if (num == null) {
                this.M = Integer.valueOf(f(this.F.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            Integer num2 = this.M;
            xve.h(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            if (intValue != 3 && intValue != 1) {
                if (intValue != 2) {
                    i2 = intValue;
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(i2);
                    xve.a(sb.toString(), z2);
                    h(i2);
                    i();
                    reentrantLock.unlock();
                }
            } else {
                i2 = intValue;
            }
            z2 = true;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 22);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i2);
            xve.a(sb2.toString(), z2);
            h(i2);
            i();
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.N.R();
            q6d q6dVar = this.d;
            if (q6dVar != null) {
                q6dVar.d();
            }
            Set<a86> set = (Set) this.K.b;
            for (a86 a86Var : set) {
                a86Var.b = null;
            }
            set.clear();
            LinkedList<jg0> linkedList = this.n;
            for (jg0 jg0Var : linkedList) {
                jg0Var.g.set(null);
                jg0Var.c();
            }
            linkedList.clear();
            if (this.d != null) {
                e();
                u7d u7dVar = this.c;
                u7dVar.e = false;
                u7dVar.f.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    public final boolean e() {
        if (!this.r) {
            return false;
        }
        this.r = false;
        b6d b6dVar = this.x;
        b6dVar.removeMessages(2);
        b6dVar.removeMessages(1);
        qgb qgbVar = this.E;
        if (qgbVar != null) {
            qgbVar.b();
            this.E = null;
        }
        return true;
    }

    public final void g() {
        this.b.lock();
        try {
            if (this.r) {
                i();
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override
    public final void g1(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6d.g1(android.os.Bundle):void");
    }

    public final void h(int i) {
        String str;
        ReentrantLock reentrantLock;
        Integer num = this.M;
        if (num == null) {
            this.M = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            int intValue = this.M.intValue();
            String str2 = "SIGN_IN_MODE_REQUIRED";
            if (intValue == 1) {
                str = "SIGN_IN_MODE_REQUIRED";
            } else if (intValue == 2) {
                str = "SIGN_IN_MODE_OPTIONAL";
            } else if (intValue == 3) {
                str = "SIGN_IN_MODE_NONE";
            } else {
                str = "UNKNOWN";
            }
            if (i != 1) {
                if (i == 2) {
                    str2 = "SIGN_IN_MODE_OPTIONAL";
                } else if (i == 3) {
                    str2 = "SIGN_IN_MODE_NONE";
                } else {
                    str2 = "UNKNOWN";
                }
            }
            StringBuilder sb = new StringBuilder(str.length() + str2.length() + 51);
            sb.append("Cannot use sign-in mode: ");
            sb.append(str2);
            sb.append(". Mode was already set to ");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        if (this.d != null) {
            return;
        }
        qs qsVar = this.F;
        Iterator it = ((ks) qsVar.values()).iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            d05 d05Var = (d05) it.next();
            z |= d05Var.w();
            z2 |= d05Var instanceof q8d;
        }
        int intValue2 = this.M.intValue();
        ArrayList arrayList = this.L;
        ReentrantLock reentrantLock2 = this.b;
        if (intValue2 != 1) {
            if (intValue2 == 2 && z) {
                ?? vlaVar = new vla(0);
                ?? vlaVar2 = new vla(0);
                Iterator it2 = ((ms) qsVar.entrySet()).iterator();
                d05 d05Var2 = null;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    d05 d05Var3 = (d05) entry.getValue();
                    d05 d05Var4 = d05Var3;
                    d05Var4.getClass();
                    if (true == (d05Var4 instanceof q8d)) {
                        d05Var2 = d05Var3;
                    }
                    if (d05Var3.w()) {
                        vlaVar.put((xn) entry.getKey(), d05Var3);
                    } else {
                        vlaVar2.put((xn) entry.getKey(), d05Var3);
                    }
                }
                xve.j("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !vlaVar.isEmpty());
                ?? vlaVar3 = new vla(0);
                ?? vlaVar4 = new vla(0);
                qs qsVar2 = this.I;
                Iterator it3 = ((os) qsVar2.keySet()).iterator();
                while (it3.hasNext()) {
                    zn znVar = (zn) it3.next();
                    xn xnVar = znVar.b;
                    if (vlaVar.containsKey(xnVar)) {
                        vlaVar3.put(znVar, (Boolean) qsVar2.get(znVar));
                    } else if (vlaVar2.containsKey(xnVar)) {
                        vlaVar4.put(znVar, (Boolean) qsVar2.get(znVar));
                    } else {
                        grb.i("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        return;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    y7d y7dVar = (y7d) arrayList.get(i2);
                    zn znVar2 = y7dVar.a;
                    if (vlaVar3.containsKey(znVar2)) {
                        arrayList2.add(y7dVar);
                    } else if (vlaVar4.containsKey(znVar2)) {
                        arrayList3.add(y7dVar);
                    } else {
                        grb.i("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        return;
                    }
                }
                this.d = new b8d(this.f, this, reentrantLock2, this.h, this.y, vlaVar, vlaVar2, this.H, this.J, d05Var2, arrayList2, arrayList3, vlaVar3, vlaVar4);
                return;
            }
            reentrantLock = reentrantLock2;
        } else {
            reentrantLock = reentrantLock2;
            if (z) {
                if (!z2) {
                    qsVar = qsVar;
                } else {
                    grb.i("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    return;
                }
            } else {
                grb.i("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                return;
            }
        }
        this.d = new i6d(this.f, this, reentrantLock, this.h, this.y, qsVar, this.H, this.I, this.J, arrayList, this);
    }

    public final void i() {
        this.c.e = true;
        q6d q6dVar = this.d;
        xve.h(q6dVar);
        q6dVar.a();
    }

    @Override
    public final void w(ws2 ws2Var) {
        boolean z;
        i05 i05Var = this.y;
        Context context = this.f;
        int i = ws2Var.b;
        i05Var.getClass();
        int i2 = c15.e;
        if (i == 18) {
            z = true;
        } else if (i == 1) {
            z = c15.d(context);
        } else {
            z = false;
        }
        if (!z) {
            e();
        }
        if (!this.r) {
            u7d u7dVar = this.c;
            b99 b99Var = u7dVar.n;
            if (Looper.myLooper() == b99Var.getLooper()) {
                b99Var.removeMessages(1);
                synchronized (u7dVar.r) {
                    ArrayList arrayList = u7dVar.d;
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    AtomicInteger atomicInteger = u7dVar.f;
                    int i3 = atomicInteger.get();
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList2.get(i4);
                        i4++;
                        l05 l05Var = (l05) obj;
                        if (!u7dVar.e || atomicInteger.get() != i3) {
                            break;
                        } else if (arrayList.contains(l05Var)) {
                            l05Var.onConnectionFailed(ws2Var);
                        }
                    }
                }
                u7dVar.e = false;
                u7dVar.f.incrementAndGet();
                return;
            }
            grb.i("onConnectionFailure must only be called on the Handler thread");
        }
    }

    @Override
    public final void z0(int i) {
        if (i == 1) {
            if (!this.r) {
                this.r = true;
                if (this.E == null) {
                    try {
                        i05 i05Var = this.y;
                        Context applicationContext = this.f.getApplicationContext();
                        c6d c6dVar = new c6d(this);
                        i05Var.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        qgb qgbVar = new qgb(c6dVar);
                        sr.n(applicationContext, qgbVar, intentFilter);
                        qgbVar.b = applicationContext;
                        if (!c15.d(applicationContext)) {
                            c6dVar.a();
                            qgbVar.b();
                            qgbVar = null;
                        }
                        this.E = qgbVar;
                    } catch (SecurityException unused) {
                    }
                }
                b6d b6dVar = this.x;
                b6dVar.sendMessageDelayed(b6dVar.obtainMessage(1), this.s);
                b6dVar.sendMessageDelayed(b6dVar.obtainMessage(2), this.w);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) ((Set) this.N.b).toArray(new BasePendingResult[0])) {
            basePendingResult.e(qx6.f);
        }
        u7d u7dVar = this.c;
        b99 b99Var = u7dVar.n;
        if (Looper.myLooper() == b99Var.getLooper()) {
            b99Var.removeMessages(1);
            synchronized (u7dVar.r) {
                u7dVar.h = true;
                ArrayList arrayList = u7dVar.b;
                ArrayList arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = u7dVar.f;
                int i2 = atomicInteger.get();
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    k05 k05Var = (k05) obj;
                    if (!u7dVar.e || atomicInteger.get() != i2) {
                        break;
                    } else if (arrayList.contains(k05Var)) {
                        k05Var.onConnectionSuspended(i);
                    }
                }
                u7dVar.c.clear();
                u7dVar.h = false;
            }
            u7dVar.e = false;
            u7dVar.f.incrementAndGet();
            if (i == 2) {
                i();
                return;
            }
            return;
        }
        grb.i("onUnintentionalDisconnection must only be called on the Handler thread");
    }
}
