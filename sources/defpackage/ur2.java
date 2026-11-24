package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class ur2 extends rh0 {
    public final HashMap i = new HashMap();
    public Handler j;

    @Override
    public final void e() {
        for (tr2 tr2Var : this.i.values()) {
            tr2Var.a.d(tr2Var.b);
        }
    }

    @Override
    public final void g() {
        for (tr2 tr2Var : this.i.values()) {
            tr2Var.a.f(tr2Var.b);
        }
    }

    @Override
    public void k() {
        for (tr2 tr2Var : this.i.values()) {
            tr2Var.a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.i;
        for (tr2 tr2Var : hashMap.values()) {
            rh0 rh0Var = tr2Var.a;
            sr2 sr2Var = tr2Var.c;
            rh0Var.p(tr2Var.b);
            rh0Var.s(sr2Var);
            rh0Var.r(sr2Var);
        }
        hashMap.clear();
    }

    public abstract rz6 u(Integer num, rz6 rz6Var);

    public abstract void x(Integer num, rh0 rh0Var, bqb bqbVar);

    public final void y(final Integer num, rh0 rh0Var) {
        HashMap hashMap = this.i;
        jte.f(!hashMap.containsKey(num));
        ?? r1 = new sz6() {
            @Override
            public final void a(rh0 rh0Var2, bqb bqbVar) {
                ur2.this.x(num, rh0Var2, bqbVar);
            }
        };
        sr2 sr2Var = new sr2(this, num);
        hashMap.put(num, new tr2(rh0Var, r1, sr2Var));
        Handler handler = this.j;
        handler.getClass();
        rh0Var.getClass();
        ?? obj = new Object();
        obj.a = handler;
        obj.b = sr2Var;
        ((CopyOnWriteArrayList) rh0Var.c.d).add(obj);
        Handler handler2 = this.j;
        handler2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = rh0Var.d.c;
        ?? obj2 = new Object();
        obj2.a = handler2;
        obj2.b = sr2Var;
        copyOnWriteArrayList.add(obj2);
        we8 we8Var = this.g;
        we8Var.getClass();
        eb3 eb3Var = this.h;
        eb3Var.getClass();
        rh0Var.l(r1, we8Var, eb3Var);
        if (this.b.isEmpty()) {
            rh0Var.d(r1);
        }
    }

    public long v(long j, Integer num) {
        return j;
    }

    public int w(int i, Integer num) {
        return i;
    }
}
