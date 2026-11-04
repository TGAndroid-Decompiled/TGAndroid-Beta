package b8;

import android.content.Context;
import java.util.ArrayList;
public final class ng extends ci.u0 {
    public final int f2850b;

    public ng(int i3) {
        super(4);
        this.f2850b = i3;
    }

    @Override
    public final Object Q0(Object obj) {
        switch (this.f2850b) {
            case 0:
                mb.g c2 = mb.g.c();
                return new hg(c2.b(), (mb.k) c2.a(mb.k.class), new bg(mb.g.c().b(), (zf) obj));
            case 1:
                mb.g c10 = mb.g.c();
                Context b10 = mb.g.c().b();
                ArrayList arrayList = new ArrayList();
                ((v7.o) obj).getClass();
                ra.e eVar = new ra.e(25);
                l5.a aVar = l5.a.f18036e;
                n5.s.b(b10);
                n5.s.a().c(aVar);
                l5.a.d.contains(new k5.c("json"));
                arrayList.add(eVar);
                return new v7.p(c10.b(), (mb.k) c10.a(mb.k.class));
            case 2:
                x7.y8 y8Var = (x7.y8) obj;
                mb.g c11 = mb.g.c();
                return new x7.b9(c11.b(), (mb.k) c11.a(mb.k.class), new x7.z8(mb.g.c().b(), y8Var), y8Var.f58504a);
            case 3:
                mb.g c12 = mb.g.c();
                return new y7.ma(c12.b(), (mb.k) c12.a(mb.k.class), new y7.la(mb.g.c().b(), (y7.ja) obj));
            default:
                mb.g c13 = mb.g.c();
                return new z7.da(c13.b(), (mb.k) c13.a(mb.k.class), new z7.ba(mb.g.c().b(), (z7.aa) obj));
        }
    }
}
