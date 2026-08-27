package j4;

import android.os.Handler;
import h3.s2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class j extends a {
    public final HashMap h = new HashMap();

    public Handler f12587i;

    public com.google.android.exoplayer2.upstream.y0 f12588j;

    @Override
    public final void d() {
        for (i iVar : this.h.values()) {
            iVar.f12576a.c(iVar.f12577b);
        }
    }

    @Override
    public final void f() {
        for (i iVar : this.h.values()) {
            iVar.f12576a.e(iVar.f12577b);
        }
    }

    @Override
    public void j() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).f12576a.j();
        }
    }

    @Override
    public void p() {
        HashMap map = this.h;
        for (i iVar : map.values()) {
            a aVar = iVar.f12576a;
            com.google.firebase.messaging.t tVar = iVar.f12578c;
            aVar.o(iVar.f12577b);
            aVar.r(tVar);
            aVar.q(tVar);
        }
        map.clear();
    }

    public abstract c0 s(Object obj, c0 c0Var);

    public abstract void v(Object obj, a aVar, s2 s2Var);

    public final void w(final Object obj, a aVar) {
        HashMap map = this.h;
        d5.a.f(!map.containsKey(obj));
        ?? r10 = new d0() {
            @Override
            public final void a(a aVar2, s2 s2Var) {
                this.f12564a.v(obj, aVar2, s2Var);
            }
        };
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(this, obj);
        map.put(obj, new i(aVar, r10, tVar));
        Handler handler = this.f12587i;
        handler.getClass();
        aVar.getClass();
        g0 g0Var = aVar.f12499c;
        g0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = g0Var.f12563c;
        f0 f0Var = new f0();
        f0Var.f12548a = handler;
        f0Var.f12549b = tVar;
        copyOnWriteArrayList.add(f0Var);
        this.f12587i.getClass();
        b6.a aVar2 = aVar.d;
        aVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) aVar2.d;
        l3.g gVar = new l3.g();
        gVar.f15394a = tVar;
        copyOnWriteArrayList2.add(gVar);
        com.google.android.exoplayer2.upstream.y0 y0Var = this.f12588j;
        i3.k kVar = this.f12502g;
        d5.a.j(kVar);
        aVar.k(r10, y0Var, kVar);
        if (this.f12498b.isEmpty()) {
            aVar.c(r10);
        }
    }

    public long t(Object obj, long j10) {
        return j10;
    }

    public int u(int i10, Object obj) {
        return i10;
    }
}
