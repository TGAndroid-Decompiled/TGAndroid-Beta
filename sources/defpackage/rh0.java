package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class rh0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final kq c = new kq(new CopyOnWriteArrayList(), 0, (rz6) null);
    public final fs3 d = new fs3(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public bqb f;
    public we8 g;
    public eb3 h;

    public abstract boolean a(bt6 bt6Var);

    public final kq b(rz6 rz6Var) {
        return new kq((CopyOnWriteArrayList) this.c.d, 0, rz6Var);
    }

    public abstract tt6 c(rz6 rz6Var, mx6 mx6Var, long j);

    public final void d(sz6 sz6Var) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(sz6Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(sz6 sz6Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(sz6Var);
        if (isEmpty) {
            g();
        }
    }

    public bqb h() {
        return null;
    }

    public abstract bt6 i();

    public boolean j() {
        return true;
    }

    public final void l(sz6 sz6Var, we8 we8Var, eb3 eb3Var) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z = false;
        } else {
            z = true;
        }
        jte.f(z);
        this.g = we8Var;
        this.h = eb3Var;
        bqb bqbVar = this.f;
        this.a.add(sz6Var);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(sz6Var);
            eb3Var.getClass();
            m(eb3Var);
        } else if (bqbVar != null) {
            f(sz6Var);
            sz6Var.a(this, bqbVar);
        }
    }

    public abstract void m(w0c w0cVar);

    public final void n(bqb bqbVar) {
        this.f = bqbVar;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((sz6) obj).a(this, bqbVar);
        }
    }

    public void o(tt6 tt6Var) {
        sh5[] sh5VarArr;
        rh5[] rh5VarArr;
        tg5 tg5Var = (tg5) tt6Var;
        tg5Var.b.e.remove(tg5Var);
        for (sh5 sh5Var : tg5Var.K) {
            if (sh5Var.U) {
                for (rh5 rh5Var : sh5Var.M) {
                    rh5Var.l();
                    cs3 cs3Var = rh5Var.h;
                    if (cs3Var != null) {
                        cs3Var.c(rh5Var.e);
                        rh5Var.h = null;
                        rh5Var.g = null;
                    }
                }
            }
            qg5 qg5Var = sh5Var.d;
            int n = qg5Var.s.n();
            fc3 fc3Var = qg5Var.g;
            Uri b = qg5Var.e[n].b();
            ec3 ec3Var = (ec3) fc3Var.d.get(b);
            if (ec3Var != null) {
                HashMap hashMap = ec3Var.b;
                jte.p(hashMap.containsKey(b));
                dc3 dc3Var = (dc3) hashMap.get(b);
                dc3Var.getClass();
                dc3Var.x = false;
            }
            qg5Var.o = null;
            sh5Var.s.e0(sh5Var);
            sh5Var.I.removeCallbacksAndMessages(null);
            sh5Var.Y = true;
            sh5Var.J.clear();
        }
        tg5Var.H = null;
    }

    public final void p(sz6 sz6Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(sz6Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            q();
            return;
        }
        d(sz6Var);
    }

    public abstract void q();

    public final void r(gs3 gs3Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            es3 es3Var = (es3) it.next();
            if (es3Var.b == gs3Var) {
                copyOnWriteArrayList.remove(es3Var);
            }
        }
    }

    public final void s(vz6 vz6Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            uz6 uz6Var = (uz6) it.next();
            if (uz6Var.b == vz6Var) {
                copyOnWriteArrayList.remove(uz6Var);
            }
        }
    }

    public abstract void t(bt6 bt6Var);

    public void e() {
    }

    public void g() {
    }

    public void k() {
    }
}
