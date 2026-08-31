package h7;

import android.content.Context;
import j7.a9;
import j7.c9;
import j7.z8;
import java.util.ArrayList;
import k7.ha;
import k7.ja;
import k7.ka;
import l7.ia;
import l7.la;
import n7.tf;
import n7.vf;
import n7.xf;
public final class r extends cb.e {
    public final int f7345b;

    public r(int i10) {
        super(0);
        this.f7345b = i10;
    }

    @Override
    public final Object E(Object obj) {
        switch (this.f7345b) {
            case 0:
                cb.h c3 = cb.h.c();
                Context b10 = cb.h.c().b();
                ArrayList arrayList = new ArrayList();
                ((o) obj).getClass();
                cb.b bVar = new cb.b(8);
                w2.a aVar = w2.a.f49324e;
                y2.q.b(b10);
                y2.q.a().c(aVar);
                w2.a.d.contains(new v2.c("json"));
                arrayList.add(bVar);
                return new q(c3.b(), (cb.l) c3.a(cb.l.class));
            case 1:
                z8 z8Var = (z8) obj;
                cb.h c10 = cb.h.c();
                return new c9(c10.b(), (cb.l) c10.a(cb.l.class), new a9(cb.h.c().b(), z8Var), z8Var.f9865a);
            case 2:
                cb.h c11 = cb.h.c();
                return new ka(c11.b(), (cb.l) c11.a(cb.l.class), new ja(cb.h.c().b(), (ha) obj));
            case 3:
                cb.h c12 = cb.h.c();
                return new la(c12.b(), (cb.l) c12.a(cb.l.class), new ia(cb.h.c().b(), (l7.ha) obj));
            default:
                cb.h c13 = cb.h.c();
                return new xf(c13.b(), (cb.l) c13.a(cb.l.class), new vf(cb.h.c().b(), (tf) obj));
        }
    }
}
