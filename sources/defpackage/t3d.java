package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
public final class t3d implements b4d, f05 {
    public final ReentrantLock a;
    public final Condition b;
    public final Context c;
    public final e05 d;
    public final m3d e;
    public final qt f;
    public final HashMap i = new HashMap();
    public final ovb j;
    public final qt k;
    public final or5 l;
    public volatile r3d m;
    public int n;
    public final o3d o;
    public final a4d p;

    public t3d(Context context, o3d o3dVar, ReentrantLock reentrantLock, Looper looper, e05 e05Var, qt qtVar, ovb ovbVar, qt qtVar2, or5 or5Var, ArrayList arrayList, a4d a4dVar) {
        this.c = context;
        this.a = reentrantLock;
        this.d = e05Var;
        this.f = qtVar;
        this.j = ovbVar;
        this.k = qtVar2;
        this.l = or5Var;
        this.o = o3dVar;
        this.p = a4dVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((j5d) arrayList.get(i)).c = this;
        }
        this.e = new m3d(this, looper, (byte) 1);
        this.b = reentrantLock.newCondition();
        this.m = new oo8(this, (byte) 24);
    }

    @Override
    public final void a() {
        this.m.a();
    }

    @Override
    public final boolean b(x5d x5dVar) {
        return false;
    }

    @Override
    public final void c() {
        if (this.m.p1()) {
            this.i.clear();
        }
    }

    @Override
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.m);
        Iterator it = ((ot) this.k.keySet()).iterator();
        while (it.hasNext()) {
            zo zoVar = (zo) it.next();
            printWriter.append((CharSequence) str).append((CharSequence) zoVar.c).println(":");
            zz4 zz4Var = (zz4) this.f.get(zoVar.b);
            ite.h(zz4Var);
            zz4Var.e(str.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    public final jh0 e(jh0 jh0Var) {
        jh0Var.l();
        return this.m.e(jh0Var);
    }

    @Override
    public final boolean g() {
        return this.m instanceof f3d;
    }

    public final void h() {
        this.a.lock();
        try {
            this.m = new oo8(this, (byte) 24);
            this.m.K1();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override
    public final void onConnected(Bundle bundle) {
        this.a.lock();
        try {
            this.m.J(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override
    public final void onConnectionSuspended(int i) {
        this.a.lock();
        try {
            this.m.I0(i);
        } finally {
            this.a.unlock();
        }
    }

    @Override
    public final void f() {
    }
}
