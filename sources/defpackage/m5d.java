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
public final class m5d implements b4d {
    public final Context a;
    public final o3d b;
    public final Looper c;
    public final t3d d;
    public final t3d e;
    public final Map f;
    public final zz4 j;
    public Bundle k;
    public final ReentrantLock o;
    public final Set i = Collections.newSetFromMap(new WeakHashMap());
    public ot2 l = null;
    public ot2 m = null;
    public boolean n = false;
    public byte p = 0;

    public m5d(Context context, o3d o3dVar, ReentrantLock reentrantLock, Looper looper, e05 e05Var, qt qtVar, qt qtVar2, ovb ovbVar, or5 or5Var, zz4 zz4Var, ArrayList arrayList, ArrayList arrayList2, qt qtVar3, qt qtVar4) {
        this.a = context;
        this.b = o3dVar;
        this.o = reentrantLock;
        this.c = looper;
        this.j = zz4Var;
        this.d = new t3d(context, o3dVar, reentrantLock, looper, e05Var, qtVar2, null, qtVar4, null, arrayList2, new oo8(this, (byte) 26));
        this.e = new t3d(context, o3dVar, reentrantLock, looper, e05Var, qtVar, ovbVar, qtVar3, or5Var, arrayList, new et8(this, (byte) 26));
        ?? ckaVar = new cka(0);
        Iterator it = ((ot) qtVar2.keySet()).iterator();
        while (it.hasNext()) {
            ckaVar.put((xo) it.next(), this.d);
        }
        Iterator it2 = ((ot) qtVar.keySet()).iterator();
        while (it2.hasNext()) {
            ckaVar.put((xo) it2.next(), this.e);
        }
        this.f = DesugarCollections.unmodifiableMap(ckaVar);
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
    public final boolean b(x5d x5dVar) {
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
                t3d t3dVar = this.e;
                if (!(t3dVar.m instanceof f3d)) {
                    this.i.add(x5dVar);
                    if (this.p == 0) {
                        this.p = (byte) 1;
                    }
                    this.m = null;
                    t3dVar.a();
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
    public final jh0 e(jh0 jh0Var) {
        PendingIntent activity;
        t3d t3dVar = (t3d) this.f.get(jh0Var.o);
        ite.i(t3dVar, "GoogleApiClient is not configured to use the API required for this call.");
        if (t3dVar != this.e) {
            t3d t3dVar2 = this.d;
            t3dVar2.getClass();
            jh0Var.l();
            return t3dVar2.m.e(jh0Var);
        } else if (i()) {
            zz4 zz4Var = this.j;
            if (zz4Var == null) {
                activity = null;
            } else {
                activity = PendingIntent.getActivity(this.a, System.identityHashCode(this.b), zz4Var.m(), d5d.a | 134217728);
            }
            jh0Var.o(new Status(4, null, activity, null));
            return jh0Var;
        } else {
            t3d t3dVar3 = this.e;
            t3dVar3.getClass();
            jh0Var.l();
            return t3dVar3.m.e(jh0Var);
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
            this.m = new ot2(4, null, null);
            if (z) {
                new q79(this.c, (byte) 1).post(new zka(this, (byte) 24));
            } else {
                h();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final boolean g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5d.g():boolean");
    }

    public final void h() {
        Set<x5d> set = this.i;
        for (x5d x5dVar : set) {
            x5dVar.i.release();
        }
        set.clear();
    }

    public final boolean i() {
        ot2 ot2Var = this.m;
        if (ot2Var != null && ot2Var.b == 4) {
            return true;
        }
        return false;
    }

    public final void j() {
        ot2 ot2Var;
        ot2 ot2Var2;
        ot2 ot2Var3 = this.l;
        t3d t3dVar = this.d;
        if (ot2Var3 != null && ot2Var3.c()) {
            ot2 ot2Var4 = this.m;
            if ((ot2Var4 != null && ot2Var4.c()) || i()) {
                byte b = this.p;
                if (b != 1) {
                    if (b != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.p = (byte) 0;
                        return;
                    }
                    o3d o3dVar = this.b;
                    ite.h(o3dVar);
                    o3dVar.j1(this.k);
                }
                h();
                this.p = (byte) 0;
                return;
            }
            ot2 ot2Var5 = this.m;
            if (ot2Var5 != null) {
                if (this.p == 1) {
                    h();
                    return;
                }
                k(ot2Var5);
                t3dVar.c();
                return;
            }
            return;
        }
        ot2 ot2Var6 = this.l;
        t3d t3dVar2 = this.e;
        if (ot2Var6 != null && (ot2Var2 = this.m) != null && ot2Var2.c()) {
            t3dVar2.c();
            ot2 ot2Var7 = this.l;
            ite.h(ot2Var7);
            k(ot2Var7);
            return;
        }
        ot2 ot2Var8 = this.l;
        if (ot2Var8 != null && (ot2Var = this.m) != null) {
            if (t3dVar2.n < t3dVar.n) {
                ot2Var8 = ot2Var;
            }
            k(ot2Var8);
        }
    }

    public final void k(ot2 ot2Var) {
        byte b = this.p;
        if (b != 1) {
            if (b != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.p = (byte) 0;
            }
            this.b.v(ot2Var);
        }
        h();
        this.p = (byte) 0;
    }
}
