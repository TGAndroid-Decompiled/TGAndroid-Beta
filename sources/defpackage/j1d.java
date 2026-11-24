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
public final class j1d implements p1d {
    public boolean E;
    public ug5 F;
    public boolean G;
    public boolean H;
    public final ntb I;
    public final ps J;
    public final op5 K;
    public final r1d a;
    public final ReentrantLock b;
    public final Context c;
    public final dy4 d;
    public ds2 e;
    public int f;
    public int n;
    public eha w;
    public boolean x;
    public boolean y;
    public boolean h = false;
    public final Bundle r = new Bundle();
    public final HashSet s = new HashSet();
    public final ArrayList L = new ArrayList();

    public j1d(r1d r1dVar, ntb ntbVar, ps psVar, dy4 dy4Var, op5 op5Var, ReentrantLock reentrantLock, Context context) {
        this.a = r1dVar;
        this.I = ntbVar;
        this.J = psVar;
        this.d = dy4Var;
        this.K = op5Var;
        this.b = reentrantLock;
        this.c = context;
    }

    @Override
    public final boolean S0() {
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
    public final void a1(ds2 ds2Var, yn ynVar, boolean z) {
        if (j(1)) {
            d(ds2Var, ynVar, z);
            if (k()) {
                c();
            }
        }
    }

    public final void b() {
        if (this.n == 0) {
            if (!this.y || this.E) {
                ArrayList arrayList = new ArrayList();
                this.h = true;
                r1d r1dVar = this.a;
                ps psVar = r1dVar.f;
                this.n = psVar.c;
                Iterator it = ((ns) psVar.keySet()).iterator();
                while (it.hasNext()) {
                    wn wnVar = (wn) it.next();
                    if (r1dVar.i.containsKey(wnVar)) {
                        if (k()) {
                            c();
                        }
                    } else {
                        arrayList.add((xx4) psVar.get(wnVar));
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.L.add(s1d.a.submit(new g1d(this, arrayList, (byte) 1)));
                }
            }
        }
    }

    public final void c() {
        r1d r1dVar = this.a;
        r1dVar.a.lock();
        try {
            r1dVar.o.e();
            r1dVar.m = new d1d(r1dVar);
            r1dVar.m.g1();
            r1dVar.b.signalAll();
            r1dVar.a.unlock();
            s1d.a.execute(new xia(this, (byte) 19));
            eha ehaVar = this.w;
            if (ehaVar != null) {
                if (this.G) {
                    ug5 ug5Var = this.F;
                    fre.h(ug5Var);
                    boolean z = this.H;
                    try {
                        r2d r2dVar = (r2d) ehaVar.k();
                        Integer num = ehaVar.I;
                        fre.h(num);
                        int intValue = num.intValue();
                        Parcel c = r2dVar.c();
                        e2d.c(c, ug5Var);
                        c.writeInt(intValue);
                        c.writeInt(z ? 1 : 0);
                        r2dVar.d(c, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                h(false);
            }
            for (wn wnVar : r1dVar.i.keySet()) {
                xx4 xx4Var = (xx4) r1dVar.f.get(wnVar);
                fre.h(xx4Var);
                xx4Var.c();
            }
            Bundle bundle = this.r;
            if (true == bundle.isEmpty()) {
                bundle = null;
            }
            r1dVar.p.R0(bundle);
        } catch (Throwable th) {
            r1dVar.a.unlock();
            throw th;
        }
    }

    public final void d(defpackage.ds2 r3, defpackage.yn r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j1d.d(ds2, yn, boolean):void");
    }

    @Override
    public final ig0 e(ig0 ig0Var) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void f() {
        this.y = false;
        r1d r1dVar = this.a;
        r1dVar.o.G = Collections.EMPTY_SET;
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            wn wnVar = (wn) it.next();
            HashMap hashMap = r1dVar.i;
            if (!hashMap.containsKey(wnVar)) {
                hashMap.put(wnVar, new ds2(17, null, null));
            }
        }
    }

    public final void g(ds2 ds2Var) {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        h(!ds2Var.b());
        r1d r1dVar = this.a;
        r1dVar.h();
        r1dVar.p.o(ds2Var);
    }

    @Override
    public final void g1() {
        r1d r1dVar = this.a;
        HashMap hashMap = r1dVar.i;
        ps psVar = r1dVar.f;
        hashMap.clear();
        this.y = false;
        this.e = null;
        this.h = false;
        this.x = true;
        this.E = false;
        this.G = false;
        HashMap hashMap2 = new HashMap();
        ps psVar2 = this.J;
        Iterator it = ((ns) psVar2.keySet()).iterator();
        while (it.hasNext()) {
            yn ynVar = (yn) it.next();
            xx4 xx4Var = (xx4) psVar.get(ynVar.b);
            fre.h(xx4Var);
            boolean booleanValue = ((Boolean) psVar2.get(ynVar)).booleanValue();
            if (xx4Var.w()) {
                this.y = true;
                if (booleanValue) {
                    this.s.add(ynVar.b);
                } else {
                    this.x = false;
                }
            }
            hashMap2.put(xx4Var, new e1d(this, ynVar, booleanValue));
        }
        if (this.y) {
            ntb ntbVar = this.I;
            fre.h(ntbVar);
            op5 op5Var = this.K;
            fre.h(op5Var);
            m1d m1dVar = r1dVar.o;
            ntbVar.h = Integer.valueOf(System.identityHashCode(m1dVar));
            i1d i1dVar = new i1d(this);
            this.w = (eha) op5Var.a(this.c, m1dVar.h, ntbVar, (gha) ntbVar.f, i1dVar, i1dVar);
        }
        this.n = psVar.c;
        this.L.add(s1d.a.submit(new g1d(this, hashMap2, (byte) 0)));
    }

    public final void h(boolean z) {
        eha ehaVar = this.w;
        if (ehaVar != null) {
            if (ehaVar.q() && z) {
                try {
                    r2d r2dVar = (r2d) ehaVar.k();
                    Integer num = ehaVar.I;
                    fre.h(num);
                    int intValue = num.intValue();
                    Parcel c = r2dVar.c();
                    c.writeInt(intValue);
                    r2dVar.d(c, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            ehaVar.c();
            fre.h(this.I);
            this.F = null;
        }
    }

    @Override
    public final void i(Bundle bundle) {
        if (j(1)) {
            if (bundle != null) {
                this.r.putAll(bundle);
            }
            if (k()) {
                c();
            }
        }
    }

    public final boolean j(int i) {
        String str;
        if (this.h != i) {
            m1d m1dVar = this.a.o;
            m1dVar.getClass();
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(m1dVar.f);
            printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(m1dVar.r);
            printWriter.append((CharSequence) " mWorkQueue.size()=").print(m1dVar.n.size());
            printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) m1dVar.N.b).size());
            z1d z1dVar = m1dVar.d;
            if (z1dVar != null) {
                z1dVar.d("", null, printWriter, null);
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
            g(new ds2(8, null, null));
            return false;
        }
        return true;
    }

    public final boolean k() {
        r1d r1dVar = this.a;
        int i = this.n - 1;
        this.n = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            m1d m1dVar = r1dVar.o;
            m1dVar.getClass();
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(m1dVar.f);
            printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(m1dVar.r);
            printWriter.append((CharSequence) " mWorkQueue.size()=").print(m1dVar.n.size());
            printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) m1dVar.N.b).size());
            z1d z1dVar = m1dVar.d;
            if (z1dVar != null) {
                z1dVar.d("", null, printWriter, null);
            }
            Log.w("GACConnecting", stringWriter.toString());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            g(new ds2(8, null, null));
            return false;
        }
        ds2 ds2Var = this.e;
        if (ds2Var != null) {
            r1dVar.n = this.f;
            g(ds2Var);
            return false;
        }
        return true;
    }

    @Override
    public final void t0(int i) {
        g(new ds2(8, null, null));
    }

    @Override
    public final void a() {
    }
}
