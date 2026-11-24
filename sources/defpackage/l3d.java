package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
public final class l3d implements r3d {
    public boolean E;
    public ti5 F;
    public boolean G;
    public boolean H;
    public final ovb I;
    public final qt J;
    public final or5 K;
    public final t3d a;
    public final ReentrantLock b;
    public final Context c;
    public final e05 d;
    public ot2 e;
    public int f;
    public int n;
    public gja w;
    public boolean x;
    public boolean y;
    public boolean h = false;
    public final Bundle r = new Bundle();
    public final HashSet s = new HashSet();
    public final ArrayList L = new ArrayList();

    public l3d(t3d t3dVar, ovb ovbVar, qt qtVar, e05 e05Var, or5 or5Var, ReentrantLock reentrantLock, Context context) {
        this.a = t3dVar;
        this.I = ovbVar;
        this.J = qtVar;
        this.d = e05Var;
        this.K = or5Var;
        this.b = reentrantLock;
        this.c = context;
    }

    @Override
    public final void A1(ot2 ot2Var, zo zoVar, boolean z) {
        if (i(1)) {
            d(ot2Var, zoVar, z);
            if (j()) {
                c();
            }
        }
    }

    @Override
    public final void I0(int i) {
        g(new ot2(8, null, null));
    }

    @Override
    public final void J(Bundle bundle) {
        if (i(1)) {
            if (bundle != null) {
                this.r.putAll(bundle);
            }
            if (j()) {
                c();
            }
        }
    }

    @Override
    public final void K1() {
        t3d t3dVar = this.a;
        HashMap hashMap = t3dVar.i;
        qt qtVar = t3dVar.f;
        hashMap.clear();
        this.y = false;
        this.e = null;
        this.h = false;
        this.x = true;
        this.E = false;
        this.G = false;
        HashMap hashMap2 = new HashMap();
        qt qtVar2 = this.J;
        Iterator it = ((ot) qtVar2.keySet()).iterator();
        while (it.hasNext()) {
            zo zoVar = (zo) it.next();
            zz4 zz4Var = (zz4) qtVar.get(zoVar.b);
            ite.h(zz4Var);
            boolean booleanValue = ((Boolean) qtVar2.get(zoVar)).booleanValue();
            if (zz4Var.w()) {
                this.y = true;
                if (booleanValue) {
                    this.s.add(zoVar.b);
                } else {
                    this.x = false;
                }
            }
            hashMap2.put(zz4Var, new g3d(this, zoVar, booleanValue));
        }
        if (this.y) {
            ovb ovbVar = this.I;
            ite.h(ovbVar);
            or5 or5Var = this.K;
            ite.h(or5Var);
            o3d o3dVar = t3dVar.o;
            ovbVar.h = Integer.valueOf(System.identityHashCode(o3dVar));
            k3d k3dVar = new k3d(this);
            this.w = (gja) or5Var.a(this.c, o3dVar.h, ovbVar, (ija) ovbVar.f, k3dVar, k3dVar);
        }
        this.n = qtVar.c;
        this.L.add(u3d.a.submit(new i3d(this, hashMap2, (byte) 0)));
    }

    public final void b() {
        if (this.n == 0) {
            if (!this.y || this.E) {
                ArrayList arrayList = new ArrayList();
                this.h = true;
                t3d t3dVar = this.a;
                qt qtVar = t3dVar.f;
                this.n = qtVar.c;
                Iterator it = ((ot) qtVar.keySet()).iterator();
                while (it.hasNext()) {
                    xo xoVar = (xo) it.next();
                    if (t3dVar.i.containsKey(xoVar)) {
                        if (j()) {
                            c();
                        }
                    } else {
                        arrayList.add((zz4) qtVar.get(xoVar));
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.L.add(u3d.a.submit(new i3d(this, arrayList, (byte) 1)));
                }
            }
        }
    }

    public final void c() {
        t3d t3dVar = this.a;
        t3dVar.a.lock();
        try {
            t3dVar.o.e();
            t3dVar.m = new f3d(t3dVar);
            t3dVar.m.K1();
            t3dVar.b.signalAll();
            t3dVar.a.unlock();
            u3d.a.execute(new zka(this, (byte) 19));
            gja gjaVar = this.w;
            if (gjaVar != null) {
                if (this.G) {
                    ti5 ti5Var = this.F;
                    ite.h(ti5Var);
                    boolean z = this.H;
                    try {
                        t4d t4dVar = (t4d) gjaVar.k();
                        Integer num = gjaVar.I;
                        ite.h(num);
                        int intValue = num.intValue();
                        Parcel c = t4dVar.c();
                        g4d.c(c, ti5Var);
                        c.writeInt(intValue);
                        c.writeInt(z ? 1 : 0);
                        t4dVar.d(c, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                h(false);
            }
            for (xo xoVar : t3dVar.i.keySet()) {
                zz4 zz4Var = (zz4) t3dVar.f.get(xoVar);
                ite.h(zz4Var);
                zz4Var.c();
            }
            Bundle bundle = this.r;
            if (true == bundle.isEmpty()) {
                bundle = null;
            }
            t3dVar.p.j1(bundle);
        } catch (Throwable th) {
            t3dVar.a.unlock();
            throw th;
        }
    }

    public final void d(defpackage.ot2 r3, defpackage.zo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l3d.d(ot2, zo, boolean):void");
    }

    @Override
    public final jh0 e(jh0 jh0Var) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void f() {
        this.y = false;
        t3d t3dVar = this.a;
        t3dVar.o.G = Collections.EMPTY_SET;
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            xo xoVar = (xo) it.next();
            HashMap hashMap = t3dVar.i;
            if (!hashMap.containsKey(xoVar)) {
                hashMap.put(xoVar, new ot2(17, null, null));
            }
        }
    }

    public final void g(ot2 ot2Var) {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        h(!ot2Var.b());
        t3d t3dVar = this.a;
        t3dVar.h();
        t3dVar.p.v(ot2Var);
    }

    public final void h(boolean z) {
        gja gjaVar = this.w;
        if (gjaVar != null) {
            if (gjaVar.q() && z) {
                try {
                    t4d t4dVar = (t4d) gjaVar.k();
                    Integer num = gjaVar.I;
                    ite.h(num);
                    int intValue = num.intValue();
                    Parcel c = t4dVar.c();
                    c.writeInt(intValue);
                    t4dVar.d(c, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            gjaVar.c();
            ite.h(this.I);
            this.F = null;
        }
    }

    public final boolean i(int i) {
        String str;
        if (this.h != i) {
            o3d o3dVar = this.a.o;
            o3dVar.getClass();
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(o3dVar.f);
            printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(o3dVar.r);
            printWriter.append((CharSequence) " mWorkQueue.size()=").print(o3dVar.n.size());
            printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) o3dVar.N.b).size());
            b4d b4dVar = o3dVar.d;
            if (b4dVar != null) {
                b4dVar.d("", null, printWriter, null);
            }
            Log.w("GACConnecting", stringWriter.toString());
            Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
            int i2 = this.n;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
            sb.append("mRemainingConnections=");
            sb.append(i2);
            Log.w("GACConnecting", sb.toString());
            String str2 = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            if (!this.h) {
                str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            } else {
                str = "STEP_GETTING_REMOTE_SERVICE";
            }
            if (i != 0) {
                str2 = "STEP_GETTING_REMOTE_SERVICE";
            }
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 70);
            sb2.append("GoogleApiClient connecting is in step ");
            sb2.append(str);
            sb2.append(" but received callback for step ");
            sb2.append(str2);
            Log.e("GACConnecting", sb2.toString(), new Exception());
            g(new ot2(8, null, null));
            return false;
        }
        return true;
    }

    public final boolean j() {
        t3d t3dVar = this.a;
        int i = this.n - 1;
        this.n = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            o3d o3dVar = t3dVar.o;
            o3dVar.getClass();
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(o3dVar.f);
            printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(o3dVar.r);
            printWriter.append((CharSequence) " mWorkQueue.size()=").print(o3dVar.n.size());
            printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) o3dVar.N.b).size());
            b4d b4dVar = o3dVar.d;
            if (b4dVar != null) {
                b4dVar.d("", null, printWriter, null);
            }
            Log.w("GACConnecting", stringWriter.toString());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            g(new ot2(8, null, null));
            return false;
        }
        ot2 ot2Var = this.e;
        if (ot2Var != null) {
            t3dVar.n = this.f;
            g(ot2Var);
            return false;
        }
        return true;
    }

    @Override
    public final boolean p1() {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        h(true);
        this.a.h();
        return true;
    }

    @Override
    public final void a() {
    }
}
