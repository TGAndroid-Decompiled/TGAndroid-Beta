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
public final class b8d implements q6d {
    public final Context a;
    public final d6d b;
    public final Looper c;
    public final i6d d;
    public final i6d e;
    public final Map f;
    public final d05 j;
    public Bundle k;
    public final ReentrantLock o;
    public final Set i = Collections.newSetFromMap(new WeakHashMap());
    public ws2 l = null;
    public ws2 m = null;
    public boolean n = false;
    public byte p = 0;

    public b8d(Context context, d6d d6dVar, ReentrantLock reentrantLock, Looper looper, j05 j05Var, qs qsVar, qs qsVar2, oxb oxbVar, rr5 rr5Var, d05 d05Var, ArrayList arrayList, ArrayList arrayList2, qs qsVar3, qs qsVar4) {
        this.a = context;
        this.b = d6dVar;
        this.o = reentrantLock;
        this.c = looper;
        this.j = d05Var;
        this.d = new i6d(context, d6dVar, reentrantLock, looper, j05Var, qsVar2, null, qsVar4, null, arrayList2, new k09(this, (byte) 23));
        this.e = new i6d(context, d6dVar, reentrantLock, looper, j05Var, qsVar, oxbVar, qsVar3, rr5Var, arrayList, new pq8(this, (byte) 29));
        ?? vlaVar = new vla(0);
        Iterator it = ((os) qsVar2.keySet()).iterator();
        while (it.hasNext()) {
            vlaVar.put((xn) it.next(), this.d);
        }
        Iterator it2 = ((os) qsVar.keySet()).iterator();
        while (it2.hasNext()) {
            vlaVar.put((xn) it2.next(), this.e);
        }
        this.f = DesugarCollections.unmodifiableMap(vlaVar);
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
    public final boolean b(m8d m8dVar) {
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
                i6d i6dVar = this.e;
                if (!(i6dVar.m instanceof u5d)) {
                    this.i.add(m8dVar);
                    if (this.p == 0) {
                        this.p = (byte) 1;
                    }
                    this.m = null;
                    i6dVar.a();
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
    public final jg0 c(jg0 jg0Var) {
        PendingIntent activity;
        i6d i6dVar = (i6d) this.f.get(jg0Var.o);
        xve.i(i6dVar, "GoogleApiClient is not configured to use the API required for this call.");
        if (i6dVar != this.e) {
            i6d i6dVar2 = this.d;
            i6dVar2.getClass();
            jg0Var.l();
            return i6dVar2.m.c(jg0Var);
        } else if (i()) {
            d05 d05Var = this.j;
            if (d05Var == null) {
                activity = null;
            } else {
                activity = PendingIntent.getActivity(this.a, System.identityHashCode(this.b), d05Var.m(), s7d.a | 134217728);
            }
            jg0Var.o(new Status(4, null, activity, null));
            return jg0Var;
        } else {
            i6d i6dVar3 = this.e;
            i6dVar3.getClass();
            jg0Var.l();
            return i6dVar3.m.c(jg0Var);
        }
    }

    @Override
    public final void d() {
        this.m = null;
        this.l = null;
        this.p = (byte) 0;
        this.d.d();
        this.e.d();
        h();
    }

    @Override
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.e(str.concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.e(str.concat("  "), fileDescriptor, printWriter, strArr);
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
            this.e.d();
            this.m = new ws2(4, null, null);
            if (z) {
                new b99(this.c, (byte) 1).post(new bva(this, (byte) 23));
            } else {
                h();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final boolean g() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8d.g():boolean");
    }

    public final void h() {
        Set<m8d> set = this.i;
        for (m8d m8dVar : set) {
            m8dVar.i.release();
        }
        set.clear();
    }

    public final boolean i() {
        ws2 ws2Var = this.m;
        if (ws2Var != null && ws2Var.b == 4) {
            return true;
        }
        return false;
    }

    public final void j() {
        ws2 ws2Var;
        ws2 ws2Var2;
        ws2 ws2Var3 = this.l;
        i6d i6dVar = this.d;
        if (ws2Var3 != null && ws2Var3.c()) {
            ws2 ws2Var4 = this.m;
            if ((ws2Var4 != null && ws2Var4.c()) || i()) {
                byte b = this.p;
                if (b != 1) {
                    if (b != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.p = (byte) 0;
                        return;
                    }
                    d6d d6dVar = this.b;
                    xve.h(d6dVar);
                    d6dVar.g1(this.k);
                }
                h();
                this.p = (byte) 0;
                return;
            }
            ws2 ws2Var5 = this.m;
            if (ws2Var5 != null) {
                if (this.p == 1) {
                    h();
                    return;
                }
                k(ws2Var5);
                i6dVar.d();
                return;
            }
            return;
        }
        ws2 ws2Var6 = this.l;
        i6d i6dVar2 = this.e;
        if (ws2Var6 != null && (ws2Var2 = this.m) != null && ws2Var2.c()) {
            i6dVar2.d();
            ws2 ws2Var7 = this.l;
            xve.h(ws2Var7);
            k(ws2Var7);
            return;
        }
        ws2 ws2Var8 = this.l;
        if (ws2Var8 != null && (ws2Var = this.m) != null) {
            if (i6dVar2.n < i6dVar.n) {
                ws2Var8 = ws2Var;
            }
            k(ws2Var8);
        }
    }

    public final void k(ws2 ws2Var) {
        byte b = this.p;
        if (b != 1) {
            if (b != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.p = (byte) 0;
            }
            this.b.w(ws2Var);
        }
        h();
        this.p = (byte) 0;
    }
}
