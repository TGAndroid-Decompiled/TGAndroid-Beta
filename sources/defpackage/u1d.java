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
public final class u1d implements ey4, fy4 {
    public final xx4 b;
    public final go c;
    public final aec d;
    public final int i;
    public final i2d j;
    public boolean k;
    public final hy4 o;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList l = new ArrayList();
    public ds2 m = null;
    public int n = 0;

    public u1d(hy4 hy4Var, by4 by4Var) {
        this.o = hy4Var;
        Looper looper = hy4Var.y.getLooper();
        mv6 a = by4Var.a();
        gha ghaVar = gha.a;
        ntb ntbVar = new ntb((rs) a.b, null, (String) a.c, (String) a.d, ghaVar);
        xx4 a2 = by4Var.d.a.a(by4Var.a, looper, ntbVar, by4Var.e, this, this);
        gy gyVar = by4Var.c;
        if (gyVar != null && (a2 instanceof gg0)) {
            a2.y = gyVar;
        } else {
            String str = by4Var.b;
            if (str != null && (a2 instanceof gg0)) {
                a2.x = str;
            }
        }
        this.b = a2;
        this.c = by4Var.f;
        this.d = new aec((byte) 4);
        this.i = by4Var.h;
        if (a2.w()) {
            Context context = hy4Var.e;
            o59 o59Var = hy4Var.y;
            mv6 a3 = by4Var.a();
            this.j = new i2d(context, o59Var, new ntb((rs) a3.b, null, (String) a3.c, (String) a3.d, ghaVar));
            return;
        }
        this.j = null;
    }

    public final void a() {
        xx4 xx4Var = this.b;
        hy4 hy4Var = this.o;
        fre.d(hy4Var.y);
        this.m = null;
        i(ds2.f);
        if (this.k) {
            o59 o59Var = hy4Var.y;
            go goVar = this.c;
            o59Var.removeMessages(11, goVar);
            hy4Var.y.removeMessages(9, goVar);
            this.k = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            h2d h2dVar = ((g2d) it.next()).a;
            if (j(h2dVar.b) != null) {
                it.remove();
            } else {
                try {
                    h2dVar.e.a.accept(xx4Var, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    xx4Var.d("DeadObjectException thrown while calling register listener method.");
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
        fre.d(this.o.y);
        this.m = null;
        this.k = true;
        String str = this.b.f;
        aec aecVar = this.d;
        aecVar.getClass();
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
        aecVar.h(new Status(20, sb.toString(), null, null), true);
        go goVar = this.c;
        hy4 hy4Var = this.o;
        o59 o59Var = hy4Var.y;
        o59Var.sendMessageDelayed(Message.obtain(o59Var, 9, goVar), 5000L);
        o59 o59Var2 = hy4Var.y;
        o59Var2.sendMessageDelayed(Message.obtain(o59Var2, 11, goVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) hy4Var.h.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        for (g2d g2dVar : this.f.values()) {
            g2dVar.getClass();
        }
    }

    public final boolean c(ds2 ds2Var) {
        synchronized (hy4.H) {
            this.o.getClass();
        }
        return false;
    }

    public final void d() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x2d x2dVar = (x2d) arrayList.get(i);
            if (this.b.q()) {
                if (e(x2dVar)) {
                    linkedList.remove(x2dVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean e(x2d x2dVar) {
        if (!(x2dVar instanceof c2d)) {
            aec aecVar = this.d;
            xx4 xx4Var = this.b;
            x2dVar.c(aecVar, xx4Var.w());
            try {
                x2dVar.d(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                xx4Var.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        c2d c2dVar = (c2d) x2dVar;
        f84 j = j(c2dVar.f(this));
        if (j == null) {
            aec aecVar2 = this.d;
            xx4 xx4Var2 = this.b;
            x2dVar.c(aecVar2, xx4Var2.w());
            try {
                x2dVar.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                xx4Var2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.b.getClass().getName();
        String str = j.a;
        long b = j.b();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(b).length() + 2);
        ls6.u(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(b);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        hy4 hy4Var = this.o;
        if (hy4Var.E && c2dVar.g(this)) {
            int h = c2dVar.h(this);
            v1d v1dVar = new v1d(this.c, j);
            ArrayList arrayList = this.l;
            int indexOf = arrayList.indexOf(v1dVar);
            if (indexOf >= 0) {
                v1d v1dVar2 = (v1d) arrayList.get(indexOf);
                hy4Var.y.removeMessages(15, v1dVar2);
                hy4Var.y.sendMessageDelayed(Message.obtain(hy4Var.y, 15, v1dVar2), 5000L);
                return false;
            }
            arrayList.add(v1dVar);
            hy4Var.y.sendMessageDelayed(Message.obtain(hy4Var.y, 15, v1dVar), 5000L);
            hy4Var.y.sendMessageDelayed(Message.obtain(hy4Var.y, 16, v1dVar), 120000L);
            ds2 ds2Var = new ds2(1, 2, null, null, Integer.valueOf(h));
            if (!c(ds2Var)) {
                if (hy4Var.g(ds2Var, this.i)) {
                    String str2 = j.a;
                    long b2 = j.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 55 + String.valueOf(b2).length());
                    ug8.z("Notification displayed for missing feature: ", str2, ", version: ", sb2);
                    sb2.append(b2);
                    Log.w("GoogleApiManager", sb2.toString());
                    return false;
                }
                return false;
            }
            String str3 = j.a;
            long b3 = j.b();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 61 + String.valueOf(b3).length());
            ug8.z("A dialog should be displayed for missing feature: ", str3, ", version: ", sb3);
            sb3.append(b3);
            Log.w("GoogleApiManager", sb3.toString());
            return false;
        }
        c2dVar.b(new e6c(j));
        return true;
    }

    public final void f(Status status, RuntimeException runtimeException, boolean z) {
        boolean z2;
        fre.d(this.o.y);
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
                x2d x2dVar = (x2d) it.next();
                if (!z || x2dVar.a == 2) {
                    if (status != null) {
                        x2dVar.a(status);
                    } else {
                        x2dVar.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        w26.j("Status XOR exception should be null");
    }

    public final void g(Status status) {
        fre.d(this.o.y);
        f(status, null, false);
    }

    public final void h() {
        hy4 hy4Var = this.o;
        o59 o59Var = hy4Var.y;
        go goVar = this.c;
        o59Var.removeMessages(12, goVar);
        o59 o59Var2 = hy4Var.y;
        o59Var2.sendMessageDelayed(o59Var2.obtainMessage(12, goVar), hy4Var.a);
    }

    public final void i(ds2 ds2Var) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (cqe.a(ds2Var, ds2.f)) {
                    xx4 xx4Var = this.b;
                    if (!xx4Var.q() || xx4Var.g == null) {
                        wn4.j("Failed to connect when checking package");
                        return;
                    }
                }
                throw null;
            }
            fyb.g();
            return;
        }
        hashSet.clear();
    }

    public final f84 j(f84[] f84VarArr) {
        f84[] f84VarArr2;
        if (f84VarArr != null && f84VarArr.length != 0) {
            xme xmeVar = this.b.B;
            if (xmeVar == null) {
                f84VarArr2 = null;
            } else {
                f84VarArr2 = xmeVar.b;
            }
            if (f84VarArr2 == null) {
                f84VarArr2 = new f84[0];
            }
            aia aiaVar = new aia(f84VarArr2.length);
            for (f84 f84Var : f84VarArr2) {
                aiaVar.put(f84Var.a, Long.valueOf(f84Var.b()));
            }
            for (f84 f84Var2 : f84VarArr) {
                Long l = (Long) aiaVar.get(f84Var2.a);
                if (l == null || l.longValue() < f84Var2.b()) {
                    return f84Var2;
                }
            }
        }
        return null;
    }

    public final void k(ds2 ds2Var) {
        fre.d(this.o.y);
        xx4 xx4Var = this.b;
        String name = xx4Var.getClass().getName();
        String valueOf = String.valueOf(ds2Var);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        xx4Var.d(sb.toString());
        l(ds2Var, null);
    }

    public final void l(ds2 ds2Var, RuntimeException runtimeException) {
        eha ehaVar;
        hy4 hy4Var = this.o;
        fre.d(hy4Var.y);
        i2d i2dVar = this.j;
        if (i2dVar != null && (ehaVar = i2dVar.j) != null) {
            ehaVar.c();
        }
        fre.d(this.o.y);
        this.m = null;
        SparseIntArray sparseIntArray = (SparseIntArray) hy4Var.h.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        i(ds2Var);
        if ((this.b instanceof i3d) && ds2Var.b != 24) {
            hy4Var.b = true;
            o59 o59Var = hy4Var.y;
            o59Var.sendMessageDelayed(o59Var.obtainMessage(19), 300000L);
        }
        int i = ds2Var.b;
        if (i == 4) {
            g(hy4.G);
        } else if (i == 25) {
            g(hy4.d(this.c, ds2Var));
        } else {
            LinkedList linkedList = this.a;
            if (linkedList.isEmpty()) {
                this.m = ds2Var;
            } else if (runtimeException != null) {
                fre.d(hy4Var.y);
                f(null, runtimeException, false);
            } else {
                boolean z = hy4Var.E;
                go goVar = this.c;
                if (z) {
                    f(hy4.d(goVar, ds2Var), null, true);
                    if (!linkedList.isEmpty() && !c(ds2Var) && !hy4Var.g(ds2Var, this.i)) {
                        if (ds2Var.b == 18) {
                            this.k = true;
                        }
                        if (this.k) {
                            o59 o59Var2 = hy4Var.y;
                            o59Var2.sendMessageDelayed(Message.obtain(o59Var2, 9, goVar), 5000L);
                            return;
                        }
                        g(hy4.d(goVar, ds2Var));
                        return;
                    }
                    return;
                }
                g(hy4.d(goVar, ds2Var));
            }
        }
    }

    public final void m(x2d x2dVar) {
        fre.d(this.o.y);
        boolean q = this.b.q();
        LinkedList linkedList = this.a;
        if (q) {
            if (e(x2dVar)) {
                h();
                return;
            } else {
                linkedList.add(x2dVar);
                return;
            }
        }
        linkedList.add(x2dVar);
        ds2 ds2Var = this.m;
        if (ds2Var != null && ds2Var.b()) {
            l(this.m, null);
        } else {
            o();
        }
    }

    public final void n() {
        hy4 hy4Var = this.o;
        fre.d(hy4Var.y);
        Status status = hy4.F;
        g(status);
        this.d.h(status, false);
        for (u56 u56Var : (u56[]) this.f.keySet().toArray(new u56[0])) {
            m(new s2d(u56Var, new TaskCompletionSource()));
        }
        i(new ds2(4, null, null));
        if (this.b.q()) {
            hy4Var.y.post(new xia(new u39(this, (byte) 24), (byte) 21));
        }
    }

    public final void o() {
        hy4 hy4Var = this.o;
        fre.d(hy4Var.y);
        xx4 xx4Var = this.b;
        if (!xx4Var.q() && !xx4Var.r()) {
            try {
                int e = hy4Var.h.e(hy4Var.e, xx4Var);
                if (e != 0) {
                    ds2 ds2Var = new ds2(e, null, null);
                    String name = xx4Var.getClass().getName();
                    String ds2Var2 = ds2Var.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + ds2Var2.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(ds2Var2);
                    Log.w("GoogleApiManager", sb.toString());
                    l(ds2Var, null);
                    return;
                }
                w1d w1dVar = new w1d(hy4Var, xx4Var, this.c);
                if (xx4Var.w()) {
                    i2d i2dVar = this.j;
                    fre.h(i2dVar);
                    eha ehaVar = i2dVar.j;
                    if (ehaVar != null) {
                        ehaVar.c();
                    }
                    ntb ntbVar = i2dVar.i;
                    ntbVar.h = Integer.valueOf(System.identityHashCode(i2dVar));
                    op5 op5Var = i2dVar.e;
                    Context context = i2dVar.c;
                    o59 o59Var = i2dVar.d;
                    i2dVar.j = (eha) op5Var.a(context, o59Var.getLooper(), ntbVar, (gha) ntbVar.f, i2dVar, i2dVar);
                    i2dVar.k = w1dVar;
                    Set set = i2dVar.f;
                    if (set != null && !set.isEmpty()) {
                        eha ehaVar2 = i2dVar.j;
                        ehaVar2.getClass();
                        ehaVar2.a(new fg0(ehaVar2));
                    } else {
                        o59Var.post(new xia(i2dVar));
                    }
                }
                try {
                    xx4Var.a(w1dVar);
                } catch (SecurityException e2) {
                    l(new ds2(10, null, null), e2);
                }
            } catch (IllegalStateException e3) {
                l(new ds2(10, null, null), e3);
            }
        }
    }

    @Override
    public final void onConnected(Bundle bundle) {
        hy4 hy4Var = this.o;
        if (Looper.myLooper() == hy4Var.y.getLooper()) {
            a();
            return;
        }
        hy4Var.y.post(new xia(this, (byte) 20));
    }

    @Override
    public final void onConnectionFailed(ds2 ds2Var) {
        l(ds2Var, null);
    }

    @Override
    public final void onConnectionSuspended(int i) {
        hy4 hy4Var = this.o;
        if (Looper.myLooper() == hy4Var.y.getLooper()) {
            b(i);
            return;
        }
        hy4Var.y.post(new ef0(this, i, (byte) 5));
    }
}
