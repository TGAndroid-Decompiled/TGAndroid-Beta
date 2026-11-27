package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
public final class l6d implements k05, l05 {
    public final d05 b;
    public final ho c;
    public final zhc d;
    public final int i;
    public final z6d j;
    public boolean k;
    public final n05 o;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList l = new ArrayList();
    public ws2 m = null;
    public int n = 0;

    public l6d(n05 n05Var, h05 h05Var) {
        this.o = n05Var;
        Looper looper = n05Var.y.getLooper();
        rx6 a = h05Var.a();
        zka zkaVar = zka.a;
        oxb oxbVar = new oxb((ss) a.b, null, (String) a.c, (String) a.d, zkaVar);
        d05 a2 = h05Var.d.a.a(h05Var.a, looper, oxbVar, h05Var.e, this, this);
        hy hyVar = h05Var.c;
        if (hyVar != null && (a2 instanceof hg0)) {
            a2.y = hyVar;
        } else {
            String str = h05Var.b;
            if (str != null && (a2 instanceof hg0)) {
                a2.x = str;
            }
        }
        this.b = a2;
        this.c = h05Var.f;
        this.d = new zhc((byte) 4);
        this.i = h05Var.h;
        if (a2.w()) {
            Context context = n05Var.e;
            b99 b99Var = n05Var.y;
            rx6 a3 = h05Var.a();
            this.j = new z6d(context, b99Var, new oxb((ss) a3.b, null, (String) a3.c, (String) a3.d, zkaVar));
            return;
        }
        this.j = null;
    }

    public final void a() {
        d05 d05Var = this.b;
        n05 n05Var = this.o;
        xve.d(n05Var.y);
        this.m = null;
        i(ws2.f);
        if (this.k) {
            b99 b99Var = n05Var.y;
            ho hoVar = this.c;
            b99Var.removeMessages(11, hoVar);
            n05Var.y.removeMessages(9, hoVar);
            this.k = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            y6d y6dVar = ((x6d) it.next()).a;
            if (j(y6dVar.b) != null) {
                it.remove();
            } else {
                try {
                    y6dVar.e.a.accept(d05Var, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    d05Var.d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        d();
        h();
    }

    public final void b(int i) {
        xve.d(this.o.y);
        this.m = null;
        this.k = true;
        String str = this.b.f;
        zhc zhcVar = this.d;
        zhcVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        zhcVar.g(new Status(20, sb.toString(), null, null), true);
        ho hoVar = this.c;
        n05 n05Var = this.o;
        b99 b99Var = n05Var.y;
        b99Var.sendMessageDelayed(Message.obtain(b99Var, 9, hoVar), 5000L);
        b99 b99Var2 = n05Var.y;
        b99Var2.sendMessageDelayed(Message.obtain(b99Var2, 11, hoVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) n05Var.h.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        for (x6d x6dVar : this.f.values()) {
            x6dVar.getClass();
        }
    }

    public final boolean c(ws2 ws2Var) {
        synchronized (n05.H) {
            this.o.getClass();
        }
        return false;
    }

    public final void d() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o7d o7dVar = (o7d) arrayList.get(i);
            if (this.b.q()) {
                if (e(o7dVar)) {
                    linkedList.remove(o7dVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean e(o7d o7dVar) {
        if (!(o7dVar instanceof t6d)) {
            zhc zhcVar = this.d;
            d05 d05Var = this.b;
            o7dVar.c(zhcVar, d05Var.w());
            try {
                o7dVar.d(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                d05Var.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        t6d t6dVar = (t6d) o7dVar;
        a94 j = j(t6dVar.f(this));
        if (j == null) {
            zhc zhcVar2 = this.d;
            d05 d05Var2 = this.b;
            o7dVar.c(zhcVar2, d05Var2.w());
            try {
                o7dVar.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                d05Var2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.b.getClass().getName();
        String str = j.a;
        long b = j.b();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(b).length() + 2);
        qu6.u(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(b);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        n05 n05Var = this.o;
        if (n05Var.E && t6dVar.g(this)) {
            int h = t6dVar.h(this);
            m6d m6dVar = new m6d(this.c, j);
            ArrayList arrayList = this.l;
            int indexOf = arrayList.indexOf(m6dVar);
            if (indexOf >= 0) {
                m6d m6dVar2 = (m6d) arrayList.get(indexOf);
                n05Var.y.removeMessages(15, m6dVar2);
                n05Var.y.sendMessageDelayed(Message.obtain(n05Var.y, 15, m6dVar2), 5000L);
                return false;
            }
            arrayList.add(m6dVar);
            n05Var.y.sendMessageDelayed(Message.obtain(n05Var.y, 15, m6dVar), 5000L);
            n05Var.y.sendMessageDelayed(Message.obtain(n05Var.y, 16, m6dVar), 120000L);
            ws2 ws2Var = new ws2(1, 2, null, null, Integer.valueOf(h));
            if (!c(ws2Var)) {
                if (n05Var.g(ws2Var, this.i)) {
                    String str2 = j.a;
                    long b2 = j.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 55 + String.valueOf(b2).length());
                    ik8.z("Notification displayed for missing feature: ", str2, ", version: ", sb2);
                    sb2.append(b2);
                    Log.w("GoogleApiManager", sb2.toString());
                    return false;
                }
                return false;
            }
            String str3 = j.a;
            long b3 = j.b();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 61 + String.valueOf(b3).length());
            ik8.z("A dialog should be displayed for missing feature: ", str3, ", version: ", sb3);
            sb3.append(b3);
            Log.w("GoogleApiManager", sb3.toString());
            return false;
        }
        t6dVar.b(new eac(j));
        return true;
    }

    public final void f(Status status, RuntimeException runtimeException, boolean z) {
        boolean z2;
        xve.d(this.o.y);
        boolean z3 = true;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (runtimeException != null) {
            z3 = false;
        }
        if (z2 != z3) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                o7d o7dVar = (o7d) it.next();
                if (!z || o7dVar.a == 2) {
                    if (status != null) {
                        o7dVar.a(status);
                    } else {
                        o7dVar.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        lq5.j("Status XOR exception should be null");
    }

    public final void g(Status status) {
        xve.d(this.o.y);
        f(status, null, false);
    }

    public final void h() {
        n05 n05Var = this.o;
        b99 b99Var = n05Var.y;
        ho hoVar = this.c;
        b99Var.removeMessages(12, hoVar);
        b99 b99Var2 = n05Var.y;
        b99Var2.sendMessageDelayed(b99Var2.obtainMessage(12, hoVar), n05Var.a);
    }

    public final void i(ws2 ws2Var) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (vue.a(ws2Var, ws2.f)) {
                    d05 d05Var = this.b;
                    if (!d05Var.q() || d05Var.g == null) {
                        xi4.l("Failed to connect when checking package");
                        return;
                    }
                }
                throw null;
            }
            grb.o();
            return;
        }
        hashSet.clear();
    }

    public final a94 j(a94[] a94VarArr) {
        a94[] a94VarArr2;
        if (a94VarArr != null && a94VarArr.length != 0) {
            ore oreVar = this.b.B;
            if (oreVar == null) {
                a94VarArr2 = null;
            } else {
                a94VarArr2 = oreVar.b;
            }
            if (a94VarArr2 == null) {
                a94VarArr2 = new a94[0];
            }
            vla vlaVar = new vla(a94VarArr2.length);
            for (a94 a94Var : a94VarArr2) {
                vlaVar.put(a94Var.a, Long.valueOf(a94Var.b()));
            }
            for (a94 a94Var2 : a94VarArr) {
                Long l = (Long) vlaVar.get(a94Var2.a);
                if (l == null || l.longValue() < a94Var2.b()) {
                    return a94Var2;
                }
            }
        }
        return null;
    }

    public final void k(ws2 ws2Var) {
        xve.d(this.o.y);
        d05 d05Var = this.b;
        String name = d05Var.getClass().getName();
        String valueOf = String.valueOf(ws2Var);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        d05Var.d(sb.toString());
        l(ws2Var, null);
    }

    public final void l(ws2 ws2Var, RuntimeException runtimeException) {
        xka xkaVar;
        n05 n05Var = this.o;
        xve.d(n05Var.y);
        z6d z6dVar = this.j;
        if (z6dVar != null && (xkaVar = z6dVar.j) != null) {
            xkaVar.c();
        }
        xve.d(this.o.y);
        this.m = null;
        SparseIntArray sparseIntArray = (SparseIntArray) n05Var.h.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        i(ws2Var);
        if ((this.b instanceof z7d) && ws2Var.b != 24) {
            n05Var.b = true;
            b99 b99Var = n05Var.y;
            b99Var.sendMessageDelayed(b99Var.obtainMessage(19), 300000L);
        }
        int i = ws2Var.b;
        if (i == 4) {
            g(n05.G);
        } else if (i == 25) {
            g(n05.d(this.c, ws2Var));
        } else {
            LinkedList linkedList = this.a;
            if (linkedList.isEmpty()) {
                this.m = ws2Var;
            } else if (runtimeException != null) {
                xve.d(n05Var.y);
                f(null, runtimeException, false);
            } else {
                boolean z = n05Var.E;
                ho hoVar = this.c;
                if (z) {
                    f(n05.d(hoVar, ws2Var), null, true);
                    if (!linkedList.isEmpty() && !c(ws2Var) && !n05Var.g(ws2Var, this.i)) {
                        if (ws2Var.b == 18) {
                            this.k = true;
                        }
                        if (this.k) {
                            b99 b99Var2 = n05Var.y;
                            b99Var2.sendMessageDelayed(Message.obtain(b99Var2, 9, hoVar), 5000L);
                            return;
                        }
                        g(n05.d(hoVar, ws2Var));
                        return;
                    }
                    return;
                }
                g(n05.d(hoVar, ws2Var));
            }
        }
    }

    public final void m(o7d o7dVar) {
        xve.d(this.o.y);
        boolean q = this.b.q();
        LinkedList linkedList = this.a;
        if (q) {
            if (e(o7dVar)) {
                h();
                return;
            } else {
                linkedList.add(o7dVar);
                return;
            }
        }
        linkedList.add(o7dVar);
        ws2 ws2Var = this.m;
        if (ws2Var != null && ws2Var.b()) {
            l(this.m, null);
        } else {
            o();
        }
    }

    public final void n() {
        n05 n05Var = this.o;
        xve.d(n05Var.y);
        Status status = n05.F;
        g(status);
        this.d.g(status, false);
        for (y76 y76Var : (y76[]) this.f.keySet().toArray(new y76[0])) {
            m(new j7d(y76Var, new TaskCompletionSource()));
        }
        i(new ws2(4, null, null));
        if (this.b.q()) {
            n05Var.y.post(new bva(new ve9(this, (byte) 21), (byte) 20));
        }
    }

    public final void o() {
        n05 n05Var = this.o;
        xve.d(n05Var.y);
        d05 d05Var = this.b;
        if (!d05Var.q() && !d05Var.r()) {
            try {
                int e = n05Var.h.e(n05Var.e, d05Var);
                if (e != 0) {
                    ws2 ws2Var = new ws2(e, null, null);
                    String name = d05Var.getClass().getName();
                    String ws2Var2 = ws2Var.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + ws2Var2.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(ws2Var2);
                    Log.w("GoogleApiManager", sb.toString());
                    l(ws2Var, null);
                    return;
                }
                n6d n6dVar = new n6d(n05Var, d05Var, this.c);
                if (d05Var.w()) {
                    z6d z6dVar = this.j;
                    xve.h(z6dVar);
                    xka xkaVar = z6dVar.j;
                    if (xkaVar != null) {
                        xkaVar.c();
                    }
                    oxb oxbVar = z6dVar.i;
                    oxbVar.h = Integer.valueOf(System.identityHashCode(z6dVar));
                    rr5 rr5Var = z6dVar.e;
                    Context context = z6dVar.c;
                    b99 b99Var = z6dVar.d;
                    z6dVar.j = (xka) rr5Var.a(context, b99Var.getLooper(), oxbVar, (zka) oxbVar.f, z6dVar, z6dVar);
                    z6dVar.k = n6dVar;
                    Set set = z6dVar.f;
                    if (set != null && !set.isEmpty()) {
                        xka xkaVar2 = z6dVar.j;
                        xkaVar2.getClass();
                        xkaVar2.a(new gg0(xkaVar2));
                    } else {
                        b99Var.post(new bva(z6dVar));
                    }
                }
                try {
                    d05Var.a(n6dVar);
                } catch (SecurityException e2) {
                    l(new ws2(10, null, null), e2);
                }
            } catch (IllegalStateException e3) {
                l(new ws2(10, null, null), e3);
            }
        }
    }

    @Override
    public final void onConnected(Bundle bundle) {
        n05 n05Var = this.o;
        if (Looper.myLooper() == n05Var.y.getLooper()) {
            a();
            return;
        }
        n05Var.y.post(new bva(this, (byte) 19));
    }

    @Override
    public final void onConnectionFailed(ws2 ws2Var) {
        l(ws2Var, null);
    }

    @Override
    public final void onConnectionSuspended(int i) {
        n05 n05Var = this.o;
        if (Looper.myLooper() == n05Var.y.getLooper()) {
            b(i);
            return;
        }
        n05Var.y.post(new gf0(this, i, (byte) 5));
    }
}
