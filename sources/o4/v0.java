package o4;

import android.os.Handler;
import j3.c1;
import j3.o2;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class v0 extends a {
    public final HashMap h = new HashMap();
    public Handler f16427i;
    public g5.v0 f16428j;
    public final a f16429k;

    public v0(a aVar) {
        this.f16429k = aVar;
    }

    @Override
    public final void d() {
        for (f fVar : this.h.values()) {
            fVar.f16327a.c(fVar.f16328b);
        }
    }

    @Override
    public final void f() {
        for (f fVar : this.h.values()) {
            fVar.f16327a.e(fVar.f16328b);
        }
    }

    @Override
    public o2 g() {
        return this.f16429k.g();
    }

    @Override
    public final c1 h() {
        return this.f16429k.h();
    }

    @Override
    public boolean i() {
        return this.f16429k.i();
    }

    @Override
    public void j() {
        for (f fVar : this.h.values()) {
            fVar.f16327a.j();
        }
    }

    @Override
    public final void l(g5.v0 v0Var) {
        this.f16428j = v0Var;
        this.f16427i = h5.d0.l(null);
        w();
    }

    @Override
    public void p() {
        HashMap hashMap = this.h;
        for (f fVar : hashMap.values()) {
            a aVar = fVar.f16327a;
            com.google.firebase.messaging.r rVar = fVar.f16329c;
            aVar.o(fVar.f16328b);
            aVar.r(rVar);
            aVar.q(rVar);
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
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(this, num);
        hashMap.put(num, new f(aVar, r12, rVar));
        Handler handler = this.f16427i;
        handler.getClass();
        aVar.getClass();
        b4.e0 e0Var = aVar.f16289c;
        e0Var.getClass();
        ?? obj = new Object();
        obj.f16433a = handler;
        obj.f16434b = rVar;
        ((CopyOnWriteArrayList) e0Var.d).add(obj);
        Handler handler2 = this.f16427i;
        handler2.getClass();
        o3.l lVar = aVar.d;
        lVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = lVar.f16271c;
        ?? obj2 = new Object();
        obj2.f16267a = handler2;
        obj2.f16268b = rVar;
        copyOnWriteArrayList.add(obj2);
        g5.v0 v0Var = this.f16428j;
        k3.k kVar = this.f16291g;
        h5.a.j(kVar);
        aVar.k(r12, v0Var, kVar);
        if (this.f16288b.isEmpty()) {
            aVar.c(r12);
        }
    }

    public void w() {
        v(null, this.f16429k);
    }
}
