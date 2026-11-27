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
public final class i6d implements q6d, k05 {
    public final ReentrantLock a;
    public final Condition b;
    public final Context c;
    public final j05 d;
    public final b6d e;
    public final qs f;
    public final HashMap i = new HashMap();
    public final oxb j;
    public final qs k;
    public final rr5 l;
    public volatile g6d m;
    public int n;
    public final d6d o;
    public final p6d p;

    public i6d(Context context, d6d d6dVar, ReentrantLock reentrantLock, Looper looper, j05 j05Var, qs qsVar, oxb oxbVar, qs qsVar2, rr5 rr5Var, ArrayList arrayList, p6d p6dVar) {
        this.c = context;
        this.a = reentrantLock;
        this.d = j05Var;
        this.f = qsVar;
        this.j = oxbVar;
        this.k = qsVar2;
        this.l = rr5Var;
        this.o = d6dVar;
        this.p = p6dVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((y7d) arrayList.get(i)).c = this;
        }
        this.e = new b6d(this, looper, (byte) 1);
        this.b = reentrantLock.newCondition();
        this.m = new k09(this, (byte) 21);
    }

    @Override
    public final void a() {
        this.m.a();
    }

    @Override
    public final boolean b(m8d m8dVar) {
        return false;
    }

    @Override
    public final jg0 c(jg0 jg0Var) {
        jg0Var.l();
        return this.m.c(jg0Var);
    }

    @Override
    public final void d() {
        if (this.m.m1()) {
            this.i.clear();
        }
    }

    @Override
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.m);
        Iterator it = ((os) this.k.keySet()).iterator();
        while (it.hasNext()) {
            zn znVar = (zn) it.next();
            printWriter.append((CharSequence) str).append((CharSequence) znVar.c).println(":");
            d05 d05Var = (d05) this.f.get(znVar.b);
            xve.h(d05Var);
            d05Var.e(str.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    public final boolean g() {
        return this.m instanceof u5d;
    }

    public final void h() {
        this.a.lock();
        try {
            this.m = new k09(this, (byte) 21);
            this.m.H1();
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
            this.m.F0(i);
        } finally {
            this.a.unlock();
        }
    }

    @Override
    public final void f() {
    }
}
