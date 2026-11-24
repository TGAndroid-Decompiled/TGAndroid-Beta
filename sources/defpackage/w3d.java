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
public final class w3d implements f05, g05 {
    public final zz4 b;
    public final gp c;
    public final rhb d;
    public final int i;
    public final k4d j;
    public boolean k;
    public final i05 o;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList l = new ArrayList();
    public ot2 m = null;
    public int n = 0;

    public w3d(i05 i05Var, c05 c05Var) {
        this.o = i05Var;
        Looper looper = i05Var.y.getLooper();
        mx6 a = c05Var.a();
        ija ijaVar = ija.a;
        ovb ovbVar = new ovb((st) a.b, null, (String) a.c, (String) a.d, ijaVar);
        zz4 a2 = c05Var.d.a.a(c05Var.a, looper, ovbVar, c05Var.e, this, this);
        gz gzVar = c05Var.c;
        if (gzVar != null && (a2 instanceof hh0)) {
            a2.y = gzVar;
        } else {
            String str = c05Var.b;
            if (str != null && (a2 instanceof hh0)) {
                a2.x = str;
            }
        }
        this.b = a2;
        this.c = c05Var.f;
        this.d = new rhb((byte) 6);
        this.i = c05Var.h;
        if (a2.w()) {
            Context context = i05Var.e;
            q79 q79Var = i05Var.y;
            mx6 a3 = c05Var.a();
            this.j = new k4d(context, q79Var, new ovb((st) a3.b, null, (String) a3.c, (String) a3.d, ijaVar));
            return;
        }
        this.j = null;
    }

    public final void a() {
        zz4 zz4Var = this.b;
        i05 i05Var = this.o;
        ite.d(i05Var.y);
        this.m = null;
        i(ot2.f);
        if (this.k) {
            q79 q79Var = i05Var.y;
            gp gpVar = this.c;
            q79Var.removeMessages(11, gpVar);
            i05Var.y.removeMessages(9, gpVar);
            this.k = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            j4d j4dVar = ((i4d) it.next()).a;
            if (j(j4dVar.b) != null) {
                it.remove();
            } else {
                try {
                    j4dVar.e.a.accept(zz4Var, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    zz4Var.d("DeadObjectException thrown while calling register listener method.");
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
        ite.d(this.o.y);
        this.m = null;
        this.k = true;
        String str = this.b.f;
        rhb rhbVar = this.d;
        rhbVar.getClass();
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
        rhbVar.s(new Status(20, sb.toString(), null, null), true);
        gp gpVar = this.c;
        i05 i05Var = this.o;
        q79 q79Var = i05Var.y;
        q79Var.sendMessageDelayed(Message.obtain(q79Var, 9, gpVar), 5000L);
        q79 q79Var2 = i05Var.y;
        q79Var2.sendMessageDelayed(Message.obtain(q79Var2, 11, gpVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) i05Var.h.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        for (i4d i4dVar : this.f.values()) {
            i4dVar.getClass();
        }
    }

    public final boolean c(ot2 ot2Var) {
        synchronized (i05.H) {
            this.o.getClass();
        }
        return false;
    }

    public final void d() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            z4d z4dVar = (z4d) arrayList.get(i);
            if (this.b.q()) {
                if (e(z4dVar)) {
                    linkedList.remove(z4dVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean e(z4d z4dVar) {
        if (!(z4dVar instanceof e4d)) {
            rhb rhbVar = this.d;
            zz4 zz4Var = this.b;
            z4dVar.c(rhbVar, zz4Var.w());
            try {
                z4dVar.d(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                zz4Var.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        e4d e4dVar = (e4d) z4dVar;
        o94 j = j(e4dVar.f(this));
        if (j == null) {
            rhb rhbVar2 = this.d;
            zz4 zz4Var2 = this.b;
            z4dVar.c(rhbVar2, zz4Var2.w());
            try {
                z4dVar.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                zz4Var2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.b.getClass().getName();
        String str = j.a;
        long b = j.b();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(b).length() + 2);
        kt6.v(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(b);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        i05 i05Var = this.o;
        if (i05Var.E && e4dVar.g(this)) {
            int h = e4dVar.h(this);
            x3d x3dVar = new x3d(this.c, j);
            ArrayList arrayList = this.l;
            int indexOf = arrayList.indexOf(x3dVar);
            if (indexOf >= 0) {
                x3d x3dVar2 = (x3d) arrayList.get(indexOf);
                i05Var.y.removeMessages(15, x3dVar2);
                i05Var.y.sendMessageDelayed(Message.obtain(i05Var.y, 15, x3dVar2), 5000L);
                return false;
            }
            arrayList.add(x3dVar);
            i05Var.y.sendMessageDelayed(Message.obtain(i05Var.y, 15, x3dVar), 5000L);
            i05Var.y.sendMessageDelayed(Message.obtain(i05Var.y, 16, x3dVar), 120000L);
            ot2 ot2Var = new ot2(1, 2, null, null, Integer.valueOf(h));
            if (!c(ot2Var)) {
                if (i05Var.g(ot2Var, this.i)) {
                    String str2 = j.a;
                    long b2 = j.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 55 + String.valueOf(b2).length());
                    wi8.z("Notification displayed for missing feature: ", str2, ", version: ", sb2);
                    sb2.append(b2);
                    Log.w("GoogleApiManager", sb2.toString());
                    return false;
                }
                return false;
            }
            String str3 = j.a;
            long b3 = j.b();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 61 + String.valueOf(b3).length());
            wi8.z("A dialog should be displayed for missing feature: ", str3, ", version: ", sb3);
            sb3.append(b3);
            Log.w("GoogleApiManager", sb3.toString());
            return false;
        }
        e4dVar.b(new e8c(j));
        return true;
    }

    public final void f(Status status, RuntimeException runtimeException, boolean z) {
        boolean z2;
        ite.d(this.o.y);
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
                z4d z4dVar = (z4d) it.next();
                if (!z || z4dVar.a == 2) {
                    if (status != null) {
                        z4dVar.a(status);
                    } else {
                        z4dVar.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        u36.j("Status XOR exception should be null");
    }

    public final void g(Status status) {
        ite.d(this.o.y);
        f(status, null, false);
    }

    public final void h() {
        i05 i05Var = this.o;
        q79 q79Var = i05Var.y;
        gp gpVar = this.c;
        q79Var.removeMessages(12, gpVar);
        q79 q79Var2 = i05Var.y;
        q79Var2.sendMessageDelayed(q79Var2.obtainMessage(12, gpVar), i05Var.a);
    }

    public final void i(ot2 ot2Var) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (fse.a(ot2Var, ot2.f)) {
                    zz4 zz4Var = this.b;
                    if (!zz4Var.q() || zz4Var.g == null) {
                        zo4.k("Failed to connect when checking package");
                        return;
                    }
                }
                throw null;
            }
            rjb.p();
            return;
        }
        hashSet.clear();
    }

    public final o94 j(o94[] o94VarArr) {
        o94[] o94VarArr2;
        if (o94VarArr != null && o94VarArr.length != 0) {
            ape apeVar = this.b.B;
            if (apeVar == null) {
                o94VarArr2 = null;
            } else {
                o94VarArr2 = apeVar.b;
            }
            if (o94VarArr2 == null) {
                o94VarArr2 = new o94[0];
            }
            cka ckaVar = new cka(o94VarArr2.length);
            for (o94 o94Var : o94VarArr2) {
                ckaVar.put(o94Var.a, Long.valueOf(o94Var.b()));
            }
            for (o94 o94Var2 : o94VarArr) {
                Long l = (Long) ckaVar.get(o94Var2.a);
                if (l == null || l.longValue() < o94Var2.b()) {
                    return o94Var2;
                }
            }
        }
        return null;
    }

    public final void k(ot2 ot2Var) {
        ite.d(this.o.y);
        zz4 zz4Var = this.b;
        String name = zz4Var.getClass().getName();
        String valueOf = String.valueOf(ot2Var);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        zz4Var.d(sb.toString());
        l(ot2Var, null);
    }

    public final void l(ot2 ot2Var, RuntimeException runtimeException) {
        gja gjaVar;
        i05 i05Var = this.o;
        ite.d(i05Var.y);
        k4d k4dVar = this.j;
        if (k4dVar != null && (gjaVar = k4dVar.j) != null) {
            gjaVar.c();
        }
        ite.d(this.o.y);
        this.m = null;
        SparseIntArray sparseIntArray = (SparseIntArray) i05Var.h.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        i(ot2Var);
        if ((this.b instanceof k5d) && ot2Var.b != 24) {
            i05Var.b = true;
            q79 q79Var = i05Var.y;
            q79Var.sendMessageDelayed(q79Var.obtainMessage(19), 300000L);
        }
        int i = ot2Var.b;
        if (i == 4) {
            g(i05.G);
        } else if (i == 25) {
            g(i05.d(this.c, ot2Var));
        } else {
            LinkedList linkedList = this.a;
            if (linkedList.isEmpty()) {
                this.m = ot2Var;
            } else if (runtimeException != null) {
                ite.d(i05Var.y);
                f(null, runtimeException, false);
            } else {
                boolean z = i05Var.E;
                gp gpVar = this.c;
                if (z) {
                    f(i05.d(gpVar, ot2Var), null, true);
                    if (!linkedList.isEmpty() && !c(ot2Var) && !i05Var.g(ot2Var, this.i)) {
                        if (ot2Var.b == 18) {
                            this.k = true;
                        }
                        if (this.k) {
                            q79 q79Var2 = i05Var.y;
                            q79Var2.sendMessageDelayed(Message.obtain(q79Var2, 9, gpVar), 5000L);
                            return;
                        }
                        g(i05.d(gpVar, ot2Var));
                        return;
                    }
                    return;
                }
                g(i05.d(gpVar, ot2Var));
            }
        }
    }

    public final void m(z4d z4dVar) {
        ite.d(this.o.y);
        boolean q = this.b.q();
        LinkedList linkedList = this.a;
        if (q) {
            if (e(z4dVar)) {
                h();
                return;
            } else {
                linkedList.add(z4dVar);
                return;
            }
        }
        linkedList.add(z4dVar);
        ot2 ot2Var = this.m;
        if (ot2Var != null && ot2Var.b()) {
            l(this.m, null);
        } else {
            o();
        }
    }

    public final void n() {
        i05 i05Var = this.o;
        ite.d(i05Var.y);
        Status status = i05.F;
        g(status);
        this.d.s(status, false);
        for (u76 u76Var : (u76[]) this.f.keySet().toArray(new u76[0])) {
            m(new u4d(u76Var, new TaskCompletionSource()));
        }
        i(new ot2(4, null, null));
        if (this.b.q()) {
            i05Var.y.post(new zka(new x59(this, (byte) 24), (byte) 21));
        }
    }

    public final void o() {
        i05 i05Var = this.o;
        ite.d(i05Var.y);
        zz4 zz4Var = this.b;
        if (!zz4Var.q() && !zz4Var.r()) {
            try {
                int n = i05Var.h.n(i05Var.e, zz4Var);
                if (n != 0) {
                    ot2 ot2Var = new ot2(n, null, null);
                    String name = zz4Var.getClass().getName();
                    String ot2Var2 = ot2Var.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + ot2Var2.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(ot2Var2);
                    Log.w("GoogleApiManager", sb.toString());
                    l(ot2Var, null);
                    return;
                }
                y3d y3dVar = new y3d(i05Var, zz4Var, this.c);
                if (zz4Var.w()) {
                    k4d k4dVar = this.j;
                    ite.h(k4dVar);
                    gja gjaVar = k4dVar.j;
                    if (gjaVar != null) {
                        gjaVar.c();
                    }
                    ovb ovbVar = k4dVar.i;
                    ovbVar.h = Integer.valueOf(System.identityHashCode(k4dVar));
                    or5 or5Var = k4dVar.e;
                    Context context = k4dVar.c;
                    q79 q79Var = k4dVar.d;
                    k4dVar.j = (gja) or5Var.a(context, q79Var.getLooper(), ovbVar, (ija) ovbVar.f, k4dVar, k4dVar);
                    k4dVar.k = y3dVar;
                    Set set = k4dVar.f;
                    if (set != null && !set.isEmpty()) {
                        gja gjaVar2 = k4dVar.j;
                        gjaVar2.getClass();
                        gjaVar2.a(new gh0(gjaVar2));
                    } else {
                        q79Var.post(new zka(k4dVar));
                    }
                }
                try {
                    zz4Var.a(y3dVar);
                } catch (SecurityException e) {
                    l(new ot2(10, null, null), e);
                }
            } catch (IllegalStateException e2) {
                l(new ot2(10, null, null), e2);
            }
        }
    }

    @Override
    public final void onConnected(Bundle bundle) {
        i05 i05Var = this.o;
        if (Looper.myLooper() == i05Var.y.getLooper()) {
            a();
            return;
        }
        i05Var.y.post(new zka(this, (byte) 20));
    }

    @Override
    public final void onConnectionFailed(ot2 ot2Var) {
        l(ot2Var, null);
    }

    @Override
    public final void onConnectionSuspended(int i) {
        i05 i05Var = this.o;
        if (Looper.myLooper() == i05Var.y.getLooper()) {
            b(i);
            return;
        }
        i05Var.y.post(new eg0(this, i, (byte) 5));
    }
}
