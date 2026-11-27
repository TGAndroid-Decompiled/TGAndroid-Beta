package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class cr2 extends rg0 {
    public final HashMap i = new HashMap();
    public Handler j;

    @Override
    public final void e() {
        for (br2 br2Var : this.i.values()) {
            br2Var.a.d(br2Var.b);
        }
    }

    @Override
    public final void g() {
        for (br2 br2Var : this.i.values()) {
            br2Var.a.f(br2Var.b);
        }
    }

    @Override
    public void k() {
        for (br2 br2Var : this.i.values()) {
            br2Var.a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.i;
        for (br2 br2Var : hashMap.values()) {
            rg0 rg0Var = br2Var.a;
            ar2 ar2Var = br2Var.c;
            rg0Var.p(br2Var.b);
            rg0Var.s(ar2Var);
            rg0Var.r(ar2Var);
        }
        hashMap.clear();
    }

    public abstract vz6 u(Integer num, vz6 vz6Var);

    public abstract void x(Integer num, rg0 rg0Var, asb asbVar);

    public final void y(final Integer num, rg0 rg0Var) {
        HashMap hashMap = this.i;
        yve.f(!hashMap.containsKey(num));
        ?? r1 = new wz6() {
            @Override
            public final void a(rg0 rg0Var2, asb asbVar) {
                cr2.this.x(num, rg0Var2, asbVar);
            }
        };
        ar2 ar2Var = new ar2(this, num);
        hashMap.put(num, new br2(rg0Var, r1, ar2Var));
        Handler handler = this.j;
        handler.getClass();
        rg0Var.getClass();
        ?? obj = new Object();
        obj.a = handler;
        obj.b = ar2Var;
        ((CopyOnWriteArrayList) rg0Var.c.d).add(obj);
        Handler handler2 = this.j;
        handler2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = rg0Var.d.c;
        ?? obj2 = new Object();
        obj2.a = handler2;
        obj2.b = ar2Var;
        copyOnWriteArrayList.add(obj2);
        ig8 ig8Var = this.g;
        ig8Var.getClass();
        la3 la3Var = this.h;
        la3Var.getClass();
        rg0Var.l(r1, ig8Var, la3Var);
        if (this.b.isEmpty()) {
            rg0Var.d(r1);
        }
    }

    public long v(long j, Integer num) {
        return j;
    }

    public int w(int i, Integer num) {
        return i;
    }
}
