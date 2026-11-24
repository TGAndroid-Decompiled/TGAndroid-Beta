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
public final class r1d implements z1d, ey4 {
    public final ReentrantLock a;
    public final Condition b;
    public final Context c;
    public final dy4 d;
    public final k1d e;
    public final ps f;
    public final HashMap i = new HashMap();
    public final ntb j;
    public final ps k;
    public final op5 l;
    public volatile p1d m;
    public int n;
    public final m1d o;
    public final y1d p;

    public r1d(Context context, m1d m1dVar, ReentrantLock reentrantLock, Looper looper, dy4 dy4Var, ps psVar, ntb ntbVar, ps psVar2, op5 op5Var, ArrayList arrayList, y1d y1dVar) {
        this.c = context;
        this.a = reentrantLock;
        this.d = dy4Var;
        this.f = psVar;
        this.j = ntbVar;
        this.k = psVar2;
        this.l = op5Var;
        this.o = m1dVar;
        this.p = y1dVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((h3d) arrayList.get(i)).c = this;
        }
        this.e = new k1d(this, looper, (byte) 1);
        this.b = reentrantLock.newCondition();
        this.m = new v39(this, (byte) 21);
    }

    @Override
    public final void a() {
        this.m.a();
    }

    @Override
    public final boolean b(v3d v3dVar) {
        return false;
    }

    @Override
    public final void c() {
        if (this.m.S0()) {
            this.i.clear();
        }
    }

    @Override
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.m);
        Iterator it = ((ns) this.k.keySet()).iterator();
        while (it.hasNext()) {
            yn ynVar = (yn) it.next();
            printWriter.append((CharSequence) str).append((CharSequence) ynVar.c).println(":");
            xx4 xx4Var = (xx4) this.f.get(ynVar.b);
            fre.h(xx4Var);
            xx4Var.e(str.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    public final ig0 e(ig0 ig0Var) {
        ig0Var.l();
        return this.m.e(ig0Var);
    }

    @Override
    public final boolean g() {
        return this.m instanceof d1d;
    }

    public final void h() {
        this.a.lock();
        try {
            this.m = new v39(this, (byte) 21);
            this.m.g1();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override
    public final void onConnected(Bundle bundle) {
        this.a.lock();
        try {
            this.m.i(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override
    public final void onConnectionSuspended(int i) {
        this.a.lock();
        try {
            this.m.t0(i);
        } finally {
            this.a.unlock();
        }
    }

    @Override
    public final void f() {
    }
}
