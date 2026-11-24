package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class qg0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final kp c = new kp(new CopyOnWriteArrayList(), 0, (rx6) null);
    public final vq3 d = new vq3(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public aob f;
    public uc8 g;
    public s93 h;

    public abstract boolean a(br6 br6Var);

    public final kp b(rx6 rx6Var) {
        return new kp((CopyOnWriteArrayList) this.c.d, 0, rx6Var);
    }

    public abstract sr6 c(rx6 rx6Var, mv6 mv6Var, long j);

    public final void d(sx6 sx6Var) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(sx6Var);
        if (!isEmpty && hashSet.isEmpty()) {
            e();
        }
    }

    public final void f(sx6 sx6Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(sx6Var);
        if (isEmpty) {
            g();
        }
    }

    public aob h() {
        return null;
    }

    public abstract br6 i();

    public boolean j() {
        return true;
    }

    public final void l(sx6 sx6Var, uc8 uc8Var, s93 s93Var) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z = false;
        } else {
            z = true;
        }
        gre.f(z);
        this.g = uc8Var;
        this.h = s93Var;
        aob aobVar = this.f;
        this.a.add(sx6Var);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(sx6Var);
            s93Var.getClass();
            m(s93Var);
        } else if (aobVar != null) {
            f(sx6Var);
            sx6Var.a(this, aobVar);
        }
    }

    public abstract void m(vyb vybVar);

    public final void n(aob aobVar) {
        this.f = aobVar;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((sx6) obj).a(this, aobVar);
        }
    }

    public void o(sr6 sr6Var) {
        tf5[] tf5VarArr;
        sf5[] sf5VarArr;
        ue5 ue5Var = (ue5) sr6Var;
        ue5Var.b.e.remove(ue5Var);
        for (tf5 tf5Var : ue5Var.K) {
            if (tf5Var.U) {
                for (sf5 sf5Var : tf5Var.M) {
                    sf5Var.l();
                    sq3 sq3Var = sf5Var.h;
                    if (sq3Var != null) {
                        sq3Var.c(sf5Var.e);
                        sf5Var.h = null;
                        sf5Var.g = null;
                    }
                }
            }
            re5 re5Var = tf5Var.d;
            int n = re5Var.s.n();
            ta3 ta3Var = re5Var.g;
            Uri b = re5Var.e[n].b();
            sa3 sa3Var = (sa3) ta3Var.d.get(b);
            if (sa3Var != null) {
                HashMap hashMap = sa3Var.b;
                gre.p(hashMap.containsKey(b));
                ra3 ra3Var = (ra3) hashMap.get(b);
                ra3Var.getClass();
                ra3Var.x = false;
            }
            re5Var.o = null;
            tf5Var.s.b0(tf5Var);
            tf5Var.I.removeCallbacksAndMessages(null);
            tf5Var.Y = true;
            tf5Var.J.clear();
        }
        ue5Var.H = null;
    }

    public final void p(sx6 sx6Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(sx6Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            q();
            return;
        }
        d(sx6Var);
    }

    public abstract void q();

    public final void r(wq3 wq3Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            uq3 uq3Var = (uq3) it.next();
            if (uq3Var.b == wq3Var) {
                copyOnWriteArrayList.remove(uq3Var);
            }
        }
    }

    public final void s(vx6 vx6Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ux6 ux6Var = (ux6) it.next();
            if (ux6Var.b == vx6Var) {
                copyOnWriteArrayList.remove(ux6Var);
            }
        }
    }

    public abstract void t(br6 br6Var);

    public void e() {
    }

    public void g() {
    }

    public void k() {
    }
}
