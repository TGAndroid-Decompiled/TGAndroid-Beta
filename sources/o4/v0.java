package o4;

import android.os.Handler;
import j3.c1;
import j3.o2;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class v0 extends a {
    public final HashMap h = new HashMap();
    public Handler f16583i;
    public g5.v0 f16584j;
    public final a f16585k;

    public v0(a aVar) {
        this.f16585k = aVar;
    }

    @Override
    public final void d() {
        for (f fVar : this.h.values()) {
            fVar.f16472a.c(fVar.f16473b);
        }
    }

    @Override
    public final void f() {
        for (f fVar : this.h.values()) {
            fVar.f16472a.e(fVar.f16473b);
        }
    }

    @Override
    public o2 g() {
        return this.f16585k.g();
    }

    @Override
    public final c1 h() {
        return this.f16585k.h();
    }

    @Override
    public boolean i() {
        return this.f16585k.i();
    }

    @Override
    public void j() {
        for (f fVar : this.h.values()) {
            fVar.f16472a.j();
        }
    }

    @Override
    public final void l(g5.v0 v0Var) {
        this.f16584j = v0Var;
        this.f16583i = h5.d0.l(null);
        w();
    }

    @Override
    public void p() {
        HashMap hashMap = this.h;
        for (f fVar : hashMap.values()) {
            a aVar = fVar.f16472a;
            sf.e eVar = fVar.f16474c;
            aVar.o(fVar.f16473b);
            aVar.r(eVar);
            aVar.q(eVar);
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
        sf.e eVar = new sf.e(this, num);
        hashMap.put(num, new f(aVar, r12, eVar));
        Handler handler = this.f16583i;
        handler.getClass();
        aVar.getClass();
        b4.e0 e0Var = aVar.f16430c;
        e0Var.getClass();
        ?? obj = new Object();
        obj.f16590a = handler;
        obj.f16591b = eVar;
        ((CopyOnWriteArrayList) e0Var.d).add(obj);
        Handler handler2 = this.f16583i;
        handler2.getClass();
        o3.l lVar = aVar.d;
        lVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = lVar.f16412c;
        ?? obj2 = new Object();
        obj2.f16408a = handler2;
        obj2.f16409b = eVar;
        copyOnWriteArrayList.add(obj2);
        g5.v0 v0Var = this.f16584j;
        k3.k kVar = this.f16433g;
        h5.a.j(kVar);
        aVar.k(r12, v0Var, kVar);
        if (this.f16429b.isEmpty()) {
            aVar.c(r12);
        }
    }

    public void w() {
        v(null, this.f16585k);
    }
}
