package j4;

import android.os.Handler;
import h3.r2;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class k extends a {
    public final HashMap h = new HashMap();
    public Handler f13494i;
    public com.google.android.exoplayer2.upstream.y0 f13495j;

    @Override
    public final void d() {
        for (j jVar : this.h.values()) {
            jVar.f13485a.c(jVar.f13486b);
        }
    }

    @Override
    public final void f() {
        for (j jVar : this.h.values()) {
            jVar.f13485a.e(jVar.f13486b);
        }
    }

    @Override
    public void j() {
        for (j jVar : this.h.values()) {
            jVar.f13485a.j();
        }
    }

    @Override
    public void p() {
        HashMap hashMap = this.h;
        for (j jVar : hashMap.values()) {
            a aVar = jVar.f13485a;
            com.google.firebase.messaging.t tVar = jVar.f13487c;
            aVar.o(jVar.f13486b);
            aVar.r(tVar);
            aVar.q(tVar);
        }
        hashMap.clear();
    }

    public abstract d0 s(Object obj, d0 d0Var);

    public abstract void v(Object obj, a aVar, r2 r2Var);

    public final void w(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        d5.a.f(!hashMap.containsKey(num));
        ?? r12 = new e0() {
            @Override
            public final void a(a aVar2, r2 r2Var) {
                k.this.v(num, aVar2, r2Var);
            }
        };
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(this, num);
        hashMap.put(num, new j(aVar, r12, tVar));
        Handler handler = this.f13494i;
        handler.getClass();
        aVar.getClass();
        h0 h0Var = aVar.f13399c;
        h0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = h0Var.f13466c;
        ?? obj = new Object();
        obj.f13452a = handler;
        obj.f13453b = tVar;
        copyOnWriteArrayList.add(obj);
        this.f13494i.getClass();
        a6.a aVar2 = aVar.d;
        aVar2.getClass();
        ?? obj2 = new Object();
        obj2.f16637a = tVar;
        ((CopyOnWriteArrayList) aVar2.d).add(obj2);
        com.google.android.exoplayer2.upstream.y0 y0Var = this.f13495j;
        i3.l lVar = this.f13402g;
        d5.a.j(lVar);
        aVar.k(r12, y0Var, lVar);
        if (this.f13398b.isEmpty()) {
            aVar.c(r12);
        }
    }

    public long t(Object obj, long j10) {
        return j10;
    }

    public int u(int i9, Object obj) {
        return i9;
    }
}
