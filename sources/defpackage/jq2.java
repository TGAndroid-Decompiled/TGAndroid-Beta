package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class jq2 extends qg0 {
    public final HashMap i = new HashMap();
    public Handler j;

    @Override
    public final void e() {
        for (iq2 iq2Var : this.i.values()) {
            iq2Var.a.d(iq2Var.b);
        }
    }

    @Override
    public final void g() {
        for (iq2 iq2Var : this.i.values()) {
            iq2Var.a.f(iq2Var.b);
        }
    }

    @Override
    public void k() {
        for (iq2 iq2Var : this.i.values()) {
            iq2Var.a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.i;
        for (iq2 iq2Var : hashMap.values()) {
            qg0 qg0Var = iq2Var.a;
            hq2 hq2Var = iq2Var.c;
            qg0Var.p(iq2Var.b);
            qg0Var.s(hq2Var);
            qg0Var.r(hq2Var);
        }
        hashMap.clear();
    }

    public abstract rx6 u(Integer num, rx6 rx6Var);

    public abstract void x(Integer num, qg0 qg0Var, aob aobVar);

    public final void y(final Integer num, qg0 qg0Var) {
        HashMap hashMap = this.i;
        gre.f(!hashMap.containsKey(num));
        ?? r1 = new sx6() {
            @Override
            public final void a(qg0 qg0Var2, aob aobVar) {
                jq2.this.x(num, qg0Var2, aobVar);
            }
        };
        hq2 hq2Var = new hq2(this, num);
        hashMap.put(num, new iq2(qg0Var, r1, hq2Var));
        Handler handler = this.j;
        handler.getClass();
        qg0Var.getClass();
        ?? obj = new Object();
        obj.a = handler;
        obj.b = hq2Var;
        ((CopyOnWriteArrayList) qg0Var.c.d).add(obj);
        Handler handler2 = this.j;
        handler2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = qg0Var.d.c;
        ?? obj2 = new Object();
        obj2.a = handler2;
        obj2.b = hq2Var;
        copyOnWriteArrayList.add(obj2);
        uc8 uc8Var = this.g;
        uc8Var.getClass();
        s93 s93Var = this.h;
        s93Var.getClass();
        qg0Var.l(r1, uc8Var, s93Var);
        if (this.b.isEmpty()) {
            qg0Var.d(r1);
        }
    }

    public long v(long j, Integer num) {
        return j;
    }

    public int w(int i, Integer num) {
        return i;
    }
}
