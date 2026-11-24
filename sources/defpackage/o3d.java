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
public final class o3d extends h05 implements a4d {
    public web E;
    public final qt F;
    public Set G;
    public final ovb H;
    public final qt I;
    public final or5 J;
    public final fk3 K;
    public final ArrayList L;
    public Integer M;
    public final lx6 N;
    public final ReentrantLock b;
    public final f5d c;
    public b4d d;
    public final int e;
    public final Context f;
    public final Looper h;
    public final LinkedList n;
    public volatile boolean r;
    public final int s;
    public final short w;
    public final m3d x;
    public final d05 y;

    public o3d(Context context, ReentrantLock reentrantLock, Looper looper, ovb ovbVar, qt qtVar, ArrayList arrayList, ArrayList arrayList2, qt qtVar2, int i, ArrayList arrayList3) {
        d05 d05Var = d05.e;
        or5 or5Var = p4d.a;
        this.d = null;
        this.n = new LinkedList();
        this.s = 120000;
        this.w = (short) 5000;
        this.G = new HashSet();
        this.K = new fk3((byte) 14);
        this.M = null;
        et8 et8Var = new et8(this, (byte) 24);
        this.f = context;
        this.b = reentrantLock;
        this.c = new f5d(looper, et8Var);
        this.h = looper;
        int i2 = 0;
        this.x = new m3d(this, looper, (byte) 0);
        this.y = d05Var;
        this.e = -1;
        this.I = qtVar;
        this.F = qtVar2;
        this.L = arrayList3;
        this.N = new lx6((byte) 2);
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            f05 f05Var = (f05) obj;
            f5d f5dVar = this.c;
            f5dVar.getClass();
            ite.h(f05Var);
            synchronized (f5dVar.r) {
                ArrayList arrayList4 = f5dVar.b;
                if (arrayList4.contains(f05Var)) {
                    String valueOf = String.valueOf(f05Var);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                } else {
                    arrayList4.add(f05Var);
                }
            }
            if (f5dVar.a.q()) {
                q79 q79Var = f5dVar.n;
                q79Var.sendMessage(q79Var.obtainMessage(1, f05Var));
            }
        }
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            this.c.a((g05) obj2);
        }
        this.H = ovbVar;
        this.J = or5Var;
    }

    public static int f(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            zz4 zz4Var = (zz4) it.next();
            z2 |= zz4Var.w();
            z3 |= zz4Var instanceof b6d;
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
    public final void C0(int i) {
        if (i == 1) {
            if (!this.r) {
                this.r = true;
                if (this.E == null) {
                    try {
                        d05 d05Var = this.y;
                        Context applicationContext = this.f.getApplicationContext();
                        n3d n3dVar = new n3d(this);
                        d05Var.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        web webVar = new web(n3dVar);
                        rs.n(applicationContext, webVar, intentFilter);
                        webVar.b = applicationContext;
                        if (!x05.d(applicationContext)) {
                            n3dVar.a();
                            webVar.b();
                            webVar = null;
                        }
                        this.E = webVar;
                    } catch (SecurityException unused) {
                    }
                }
                m3d m3dVar = this.x;
                m3dVar.sendMessageDelayed(m3dVar.obtainMessage(1), this.s);
                m3dVar.sendMessageDelayed(m3dVar.obtainMessage(2), this.w);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) ((Set) this.N.b).toArray(new BasePendingResult[0])) {
            basePendingResult.e(lx6.f);
        }
        f5d f5dVar = this.c;
        q79 q79Var = f5dVar.n;
        if (Looper.myLooper() == q79Var.getLooper()) {
            q79Var.removeMessages(1);
            synchronized (f5dVar.r) {
                f5dVar.h = true;
                ArrayList arrayList = f5dVar.b;
                ArrayList arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = f5dVar.f;
                int i2 = atomicInteger.get();
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    f05 f05Var = (f05) obj;
                    if (!f5dVar.e || atomicInteger.get() != i2) {
                        break;
                    } else if (arrayList.contains(f05Var)) {
                        f05Var.onConnectionSuspended(i);
                    }
                }
                f5dVar.c.clear();
                f5dVar.h = false;
            }
            f5dVar.e = false;
            f5dVar.f.incrementAndGet();
            if (i == 2) {
                i();
                return;
            }
            return;
        }
        dq9.m("onUnintentionalDisconnection must only be called on the Handler thread");
    }

    @Override
    public final boolean a(x5d x5dVar) {
        b4d b4dVar = this.d;
        if (b4dVar != null && b4dVar.b(x5dVar)) {
            return true;
        }
        return false;
    }

    @Override
    public final void b() {
        b4d b4dVar = this.d;
        if (b4dVar != null) {
            b4dVar.f();
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
                ite.j("Sign-in mode should have been set explicitly by auto-manage.", z);
            } else if (num == null) {
                this.M = Integer.valueOf(f(this.F.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            Integer num2 = this.M;
            ite.h(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            if (intValue != 3 && intValue != 1) {
                if (intValue != 2) {
                    i2 = intValue;
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(i2);
                    ite.a(sb.toString(), z2);
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
            ite.a(sb2.toString(), z2);
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
            this.N.S();
            b4d b4dVar = this.d;
            if (b4dVar != null) {
                b4dVar.c();
            }
            Set<w76> set = (Set) this.K.a;
            for (w76 w76Var : set) {
                w76Var.b = null;
            }
            set.clear();
            LinkedList<jh0> linkedList = this.n;
            for (jh0 jh0Var : linkedList) {
                jh0Var.g.set(null);
                jh0Var.c();
            }
            linkedList.clear();
            if (this.d != null) {
                e();
                f5d f5dVar = this.c;
                f5dVar.e = false;
                f5dVar.f.incrementAndGet();
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
        m3d m3dVar = this.x;
        m3dVar.removeMessages(2);
        m3dVar.removeMessages(1);
        web webVar = this.E;
        if (webVar != null) {
            webVar.b();
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
        qt qtVar = this.F;
        Iterator it = ((kt) qtVar.values()).iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            zz4 zz4Var = (zz4) it.next();
            z |= zz4Var.w();
            z2 |= zz4Var instanceof b6d;
        }
        int intValue2 = this.M.intValue();
        ArrayList arrayList = this.L;
        ReentrantLock reentrantLock2 = this.b;
        if (intValue2 != 1) {
            if (intValue2 == 2 && z) {
                ?? ckaVar = new cka(0);
                ?? ckaVar2 = new cka(0);
                Iterator it2 = ((mt) qtVar.entrySet()).iterator();
                zz4 zz4Var2 = null;
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    zz4 zz4Var3 = (zz4) entry.getValue();
                    zz4 zz4Var4 = zz4Var3;
                    zz4Var4.getClass();
                    if (true == (zz4Var4 instanceof b6d)) {
                        zz4Var2 = zz4Var3;
                    }
                    if (zz4Var3.w()) {
                        ckaVar.put((xo) entry.getKey(), zz4Var3);
                    } else {
                        ckaVar2.put((xo) entry.getKey(), zz4Var3);
                    }
                }
                ite.j("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !ckaVar.isEmpty());
                ?? ckaVar3 = new cka(0);
                ?? ckaVar4 = new cka(0);
                qt qtVar2 = this.I;
                Iterator it3 = ((ot) qtVar2.keySet()).iterator();
                while (it3.hasNext()) {
                    zo zoVar = (zo) it3.next();
                    xo xoVar = zoVar.b;
                    if (ckaVar.containsKey(xoVar)) {
                        ckaVar3.put(zoVar, (Boolean) qtVar2.get(zoVar));
                    } else if (ckaVar2.containsKey(xoVar)) {
                        ckaVar4.put(zoVar, (Boolean) qtVar2.get(zoVar));
                    } else {
                        dq9.m("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        return;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    j5d j5dVar = (j5d) arrayList.get(i2);
                    zo zoVar2 = j5dVar.a;
                    if (ckaVar3.containsKey(zoVar2)) {
                        arrayList2.add(j5dVar);
                    } else if (ckaVar4.containsKey(zoVar2)) {
                        arrayList3.add(j5dVar);
                    } else {
                        dq9.m("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        return;
                    }
                }
                this.d = new m5d(this.f, this, reentrantLock2, this.h, this.y, ckaVar, ckaVar2, this.H, this.J, zz4Var2, arrayList2, arrayList3, ckaVar3, ckaVar4);
                return;
            }
            reentrantLock = reentrantLock2;
        } else {
            reentrantLock = reentrantLock2;
            if (z) {
                if (!z2) {
                    qtVar = qtVar;
                } else {
                    dq9.m("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    return;
                }
            } else {
                dq9.m("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                return;
            }
        }
        this.d = new t3d(this.f, this, reentrantLock, this.h, this.y, qtVar, this.H, this.I, this.J, arrayList, this);
    }

    public final void i() {
        this.c.e = true;
        b4d b4dVar = this.d;
        ite.h(b4dVar);
        b4dVar.a();
    }

    @Override
    public final void j1(android.os.Bundle r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o3d.j1(android.os.Bundle):void");
    }

    @Override
    public final void v(ot2 ot2Var) {
        boolean z;
        d05 d05Var = this.y;
        Context context = this.f;
        int i = ot2Var.b;
        d05Var.getClass();
        int i2 = x05.e;
        if (i == 18) {
            z = true;
        } else if (i == 1) {
            z = x05.d(context);
        } else {
            z = false;
        }
        if (!z) {
            e();
        }
        if (!this.r) {
            f5d f5dVar = this.c;
            q79 q79Var = f5dVar.n;
            if (Looper.myLooper() == q79Var.getLooper()) {
                q79Var.removeMessages(1);
                synchronized (f5dVar.r) {
                    ArrayList arrayList = f5dVar.d;
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    AtomicInteger atomicInteger = f5dVar.f;
                    int i3 = atomicInteger.get();
                    int size = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList2.get(i4);
                        i4++;
                        g05 g05Var = (g05) obj;
                        if (!f5dVar.e || atomicInteger.get() != i3) {
                            break;
                        } else if (arrayList.contains(g05Var)) {
                            g05Var.onConnectionFailed(ot2Var);
                        }
                    }
                }
                f5dVar.e = false;
                f5dVar.f.incrementAndGet();
                return;
            }
            dq9.m("onConnectionFailure must only be called on the Handler thread");
        }
    }
}
