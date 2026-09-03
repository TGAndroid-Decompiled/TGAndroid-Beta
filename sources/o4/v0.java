package o4;

import android.os.Handler;
import j3.c1;
import j3.o2;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class v0 extends a {
    public final HashMap h = new HashMap();
    public Handler f16585i;
    public g5.v0 f16586j;
    public final a f16587k;

    public v0(a aVar) {
        this.f16587k = aVar;
    }

    @Override
    public final void d() {
        for (f fVar : this.h.values()) {
            fVar.f16474a.c(fVar.f16475b);
        }
    }

    @Override
    public final void f() {
        for (f fVar : this.h.values()) {
            fVar.f16474a.e(fVar.f16475b);
        }
    }

    @Override
    public o2 g() {
        return this.f16587k.g();
    }

    @Override
    public final c1 h() {
        return this.f16587k.h();
    }

    @Override
    public boolean i() {
        return this.f16587k.i();
    }

    @Override
    public void j() {
        for (f fVar : this.h.values()) {
            fVar.f16474a.j();
        }
    }

    @Override
    public final void l(g5.v0 v0Var) {
        this.f16586j = v0Var;
        this.f16585i = h5.d0.l(null);
        w();
    }

    @Override
    public void p() {
        HashMap hashMap = this.h;
        for (f fVar : hashMap.values()) {
            a aVar = fVar.f16474a;
            sf.f fVar2 = fVar.f16476c;
            aVar.o(fVar.f16475b);
            aVar.r(fVar2);
            aVar.q(fVar2);
        }
        hashMap.clear();
    }

    public abstract v s(v vVar);

    public final long t(Object obj, long j10) {
        Void r12 = (Void) obj;
        return j10;
    }

    public abstract void u(o2 o2Var);

    public final void v(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        h5.a.f(!hashMap.containsKey(num));
        ?? r12 = new w() {
            @Override
            public final void a(a aVar2, o2 o2Var) {
                v0 v0Var = v0.this;
                v0Var.getClass();
                Void r02 = (Void) num;
                v0Var.u(o2Var);
            }
        };
        sf.f fVar = new sf.f(this, num);
        hashMap.put(num, new f(aVar, r12, fVar));
        Handler handler = this.f16585i;
        handler.getClass();
        aVar.getClass();
        b4.e0 e0Var = aVar.f16432c;
        e0Var.getClass();
        ?? obj = new Object();
        obj.f16592a = handler;
        obj.f16593b = fVar;
        ((CopyOnWriteArrayList) e0Var.d).add(obj);
        Handler handler2 = this.f16585i;
        handler2.getClass();
        o3.l lVar = aVar.d;
        lVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = lVar.f16414c;
        ?? obj2 = new Object();
        obj2.f16410a = handler2;
        obj2.f16411b = fVar;
        copyOnWriteArrayList.add(obj2);
        g5.v0 v0Var = this.f16586j;
        k3.k kVar = this.f16435g;
        h5.a.j(kVar);
        aVar.k(r12, v0Var, kVar);
        if (this.f16431b.isEmpty()) {
            aVar.c(r12);
        }
    }

    public void w() {
        v(null, this.f16587k);
    }
}
