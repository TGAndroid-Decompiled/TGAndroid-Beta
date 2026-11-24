package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
public final class k3d implements z1d {
    public final Context a;
    public final m1d b;
    public final Looper c;
    public final r1d d;
    public final r1d e;
    public final Map f;
    public final xx4 j;
    public Bundle k;
    public final ReentrantLock o;
    public final Set i = Collections.newSetFromMap(new WeakHashMap());
    public ds2 l = null;
    public ds2 m = null;
    public boolean n = false;
    public byte p = 0;

    public k3d(Context context, m1d m1dVar, ReentrantLock reentrantLock, Looper looper, dy4 dy4Var, ps psVar, ps psVar2, ntb ntbVar, op5 op5Var, xx4 xx4Var, ArrayList arrayList, ArrayList arrayList2, ps psVar3, ps psVar4) {
        this.a = context;
        this.b = m1dVar;
        this.o = reentrantLock;
        this.c = looper;
        this.j = xx4Var;
        this.d = new r1d(context, m1dVar, reentrantLock, looper, dy4Var, psVar2, null, psVar4, null, arrayList2, new v39(this, (byte) 23));
        this.e = new r1d(context, m1dVar, reentrantLock, looper, dy4Var, psVar, ntbVar, psVar3, op5Var, arrayList, new g29(this, (byte) 24));
        ?? aiaVar = new aia(0);
        Iterator it = ((ns) psVar2.keySet()).iterator();
        while (it.hasNext()) {
            aiaVar.put((wn) it.next(), this.d);
        }
        Iterator it2 = ((ns) psVar.keySet()).iterator();
        while (it2.hasNext()) {
            aiaVar.put((wn) it2.next(), this.e);
        }
        this.f = DesugarCollections.unmodifiableMap(aiaVar);
    }

    @Override
    public final void a() {
        this.p = (byte) 2;
        this.n = false;
        this.m = null;
        this.l = null;
        this.d.a();
        this.e.a();
    }

    @Override
    public final boolean b(v3d v3dVar) {
        boolean z;
        this.o.lock();
        try {
            ReentrantLock reentrantLock = this.o;
            reentrantLock.lock();
            boolean z2 = true;
            if (this.p == 2) {
                z = true;
            } else {
                z = false;
            }
            reentrantLock.unlock();
            if (z || g()) {
                r1d r1dVar = this.e;
                if (!(r1dVar.m instanceof d1d)) {
                    this.i.add(v3dVar);
                    if (this.p == 0) {
                        this.p = (byte) 1;
                    }
                    this.m = null;
                    r1dVar.a();
                    return z2;
                }
            }
            z2 = false;
            return z2;
        } finally {
            this.o.unlock();
        }
    }

    @Override
    public final void c() {
        this.m = null;
        this.l = null;
        this.p = (byte) 0;
        this.d.c();
        this.e.c();
        h();
    }

    @Override
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.d(str.concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.d(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override
    public final ig0 e(ig0 ig0Var) {
        PendingIntent activity;
        r1d r1dVar = (r1d) this.f.get(ig0Var.o);
        fre.i(r1dVar, "GoogleApiClient is not configured to use the API required for this call.");
        if (r1dVar != this.e) {
            r1d r1dVar2 = this.d;
            r1dVar2.getClass();
            ig0Var.l();
            return r1dVar2.m.e(ig0Var);
        } else if (i()) {
            xx4 xx4Var = this.j;
            if (xx4Var == null) {
                activity = null;
            } else {
                activity = PendingIntent.getActivity(this.a, System.identityHashCode(this.b), xx4Var.m(), b3d.a | 134217728);
            }
            ig0Var.o(new Status(4, null, activity, null));
            return ig0Var;
        } else {
            r1d r1dVar3 = this.e;
            r1dVar3.getClass();
            ig0Var.l();
            return r1dVar3.m.e(ig0Var);
        }
    }

    @Override
    public final void f() {
        boolean z;
        ReentrantLock reentrantLock = this.o;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            if (this.p == 2) {
                z = true;
            } else {
                z = false;
            }
            reentrantLock.unlock();
            this.e.c();
            this.m = new ds2(4, null, null);
            if (z) {
                new o59(this.c, (byte) 1).post(new xia(this, (byte) 24));
            } else {
                h();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final boolean g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3d.g():boolean");
    }

    public final void h() {
        Set<v3d> set = this.i;
        for (v3d v3dVar : set) {
            v3dVar.i.release();
        }
        set.clear();
    }

    public final boolean i() {
        ds2 ds2Var = this.m;
        if (ds2Var != null && ds2Var.b == 4) {
            return true;
        }
        return false;
    }

    public final void j() {
        ds2 ds2Var;
        ds2 ds2Var2;
        ds2 ds2Var3 = this.l;
        r1d r1dVar = this.d;
        if (ds2Var3 != null && ds2Var3.c()) {
            ds2 ds2Var4 = this.m;
            if ((ds2Var4 != null && ds2Var4.c()) || i()) {
                byte b = this.p;
                if (b != 1) {
                    if (b != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.p = (byte) 0;
                        return;
                    }
                    m1d m1dVar = this.b;
                    fre.h(m1dVar);
                    m1dVar.R0(this.k);
                }
                h();
                this.p = (byte) 0;
                return;
            }
            ds2 ds2Var5 = this.m;
            if (ds2Var5 != null) {
                if (this.p == 1) {
                    h();
                    return;
                }
                k(ds2Var5);
                r1dVar.c();
                return;
            }
            return;
        }
        ds2 ds2Var6 = this.l;
        r1d r1dVar2 = this.e;
        if (ds2Var6 != null && (ds2Var2 = this.m) != null && ds2Var2.c()) {
            r1dVar2.c();
            ds2 ds2Var7 = this.l;
            fre.h(ds2Var7);
            k(ds2Var7);
            return;
        }
        ds2 ds2Var8 = this.l;
        if (ds2Var8 != null && (ds2Var = this.m) != null) {
            if (r1dVar2.n < r1dVar.n) {
                ds2Var8 = ds2Var;
            }
            k(ds2Var8);
        }
    }

    public final void k(ds2 ds2Var) {
        byte b = this.p;
        if (b != 1) {
            if (b != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.p = (byte) 0;
            }
            this.b.o(ds2Var);
        }
        h();
        this.p = (byte) 0;
    }
}
