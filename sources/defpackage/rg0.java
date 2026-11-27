package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class rg0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final lp c = new lp(new CopyOnWriteArrayList(), 0, (Object) null, (byte) 9);
    public final mr3 d = new mr3(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public asb f;
    public ig8 g;
    public la3 h;

    public abstract boolean a(ft6 ft6Var);

    public final lp b(vz6 vz6Var) {
        return new lp((CopyOnWriteArrayList) this.c.d, 0, vz6Var, (byte) 9);
    }

    public abstract xt6 c(vz6 vz6Var, rx6 rx6Var, long j);

    public final void d(wz6 wz6Var) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(wz6Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(wz6 wz6Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(wz6Var);
        if (isEmpty) {
            g();
        }
    }

    public asb h() {
        return null;
    }

    public abstract ft6 i();

    public boolean j() {
        return true;
    }

    public final void l(wz6 wz6Var, ig8 ig8Var, la3 la3Var) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z = false;
        } else {
            z = true;
        }
        yve.f(z);
        this.g = ig8Var;
        this.h = la3Var;
        asb asbVar = this.f;
        this.a.add(wz6Var);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(wz6Var);
            la3Var.getClass();
            m(la3Var);
        } else if (asbVar != null) {
            f(wz6Var);
            wz6Var.a(this, asbVar);
        }
    }

    public abstract void m(v2c v2cVar);

    public final void n(asb asbVar) {
        this.f = asbVar;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((wz6) obj).a(this, asbVar);
        }
    }

    public void o(xt6 xt6Var) {
        vh5[] vh5VarArr;
        uh5[] uh5VarArr;
        wg5 wg5Var = (wg5) xt6Var;
        wg5Var.b.e.remove(wg5Var);
        for (vh5 vh5Var : wg5Var.K) {
            if (vh5Var.U) {
                for (uh5 uh5Var : vh5Var.M) {
                    uh5Var.l();
                    jr3 jr3Var = uh5Var.h;
                    if (jr3Var != null) {
                        jr3Var.c(uh5Var.e);
                        uh5Var.h = null;
                        uh5Var.g = null;
                    }
                }
            }
            sg5 sg5Var = vh5Var.d;
            int m = sg5Var.s.m();
            mb3 mb3Var = sg5Var.g;
            Uri b = sg5Var.e[m].b();
            lb3 lb3Var = (lb3) mb3Var.d.get(b);
            if (lb3Var != null) {
                HashMap hashMap = lb3Var.b;
                yve.p(hashMap.containsKey(b));
                kb3 kb3Var = (kb3) hashMap.get(b);
                kb3Var.getClass();
                kb3Var.x = false;
            }
            sg5Var.o = null;
            vh5Var.s.g0(vh5Var);
            vh5Var.I.removeCallbacksAndMessages(null);
            vh5Var.Y = true;
            vh5Var.J.clear();
        }
        wg5Var.H = null;
    }

    public final void p(wz6 wz6Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(wz6Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            q();
            return;
        }
        d(wz6Var);
    }

    public abstract void q();

    public final void r(nr3 nr3Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            lr3 lr3Var = (lr3) it.next();
            if (lr3Var.b == nr3Var) {
                copyOnWriteArrayList.remove(lr3Var);
            }
        }
    }

    public final void s(zz6 zz6Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            yz6 yz6Var = (yz6) it.next();
            if (yz6Var.b == zz6Var) {
                copyOnWriteArrayList.remove(yz6Var);
            }
        }
    }

    public abstract void t(ft6 ft6Var);

    public void e() {
    }

    public void g() {
    }

    public void k() {
    }
}
