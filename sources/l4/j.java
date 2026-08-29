package l4;

import ag.j2;
import android.os.Handler;
import j3.r2;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class j extends a {
    public final HashMap h = new HashMap();
    public Handler f14340i;
    public com.google.android.exoplayer2.upstream.y0 f14341j;

    @Override
    public final void d() {
        for (i iVar : this.h.values()) {
            iVar.f14325a.c(iVar.f14326b);
        }
    }

    @Override
    public final void f() {
        for (i iVar : this.h.values()) {
            iVar.f14325a.e(iVar.f14326b);
        }
    }

    @Override
    public void j() {
        for (i iVar : this.h.values()) {
            iVar.f14325a.j();
        }
    }

    @Override
    public void p() {
        HashMap hashMap = this.h;
        for (i iVar : hashMap.values()) {
            a aVar = iVar.f14325a;
            com.google.firebase.messaging.s sVar = iVar.f14327c;
            aVar.o(iVar.f14326b);
            aVar.r(sVar);
            aVar.q(sVar);
        }
        hashMap.clear();
    }

    public abstract c0 s(Object obj, c0 c0Var);

    public abstract void v(Object obj, a aVar, r2 r2Var);

    public final void w(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        f5.a.f(!hashMap.containsKey(num));
        ?? r12 = new d0() {
            @Override
            public final void a(a aVar2, r2 r2Var) {
                j.this.v(num, aVar2, r2Var);
            }
        };
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(this, num);
        hashMap.put(num, new i(aVar, r12, sVar));
        Handler handler = this.f14340i;
        handler.getClass();
        aVar.getClass();
        g0 g0Var = aVar.f14258c;
        g0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = g0Var.f14321c;
        ?? obj = new Object();
        obj.f14304a = handler;
        obj.f14305b = sVar;
        copyOnWriteArrayList.add(obj);
        this.f14340i.getClass();
        j2 j2Var = aVar.d;
        j2Var.getClass();
        ?? obj2 = new Object();
        obj2.f17104a = sVar;
        ((CopyOnWriteArrayList) j2Var.d).add(obj2);
        com.google.android.exoplayer2.upstream.y0 y0Var = this.f14341j;
        k3.k kVar = this.f14261g;
        f5.a.j(kVar);
        aVar.k(r12, y0Var, kVar);
        if (this.f14257b.isEmpty()) {
            aVar.c(r12);
        }
    }

    public long t(Object obj, long j10) {
        return j10;
    }

    public int u(int i10, Object obj) {
        return i10;
    }
}
