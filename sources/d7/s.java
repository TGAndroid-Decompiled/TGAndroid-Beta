package d7;

import android.content.Context;
import f7.a9;
import f7.c9;
import f7.z8;
import g7.ha;
import g7.ja;
import g7.ka;
import h7.ga;
import j7.sf;
import j7.uf;
import j7.wf;
import java.util.ArrayList;
public final class s extends a8.a {
    public final int f4447b;

    public s(int i9) {
        super(8);
        this.f4447b = i9;
    }

    @Override
    public final Object F(Object obj) {
        switch (this.f4447b) {
            case 0:
                ya.g c10 = ya.g.c();
                Context b10 = ya.g.c().b();
                ArrayList arrayList = new ArrayList();
                ((o) obj).getClass();
                za.a aVar = new za.a(4);
                u2.a aVar2 = u2.a.f47963e;
                w2.q.b(b10);
                w2.q.a().c(aVar2);
                u2.a.d.contains(new t2.c("json"));
                arrayList.add(aVar);
                return new r(c10.b(), (ya.k) c10.a(ya.k.class));
            case 1:
                z8 z8Var = (z8) obj;
                ya.g c11 = ya.g.c();
                return new c9(c11.b(), (ya.k) c11.a(ya.k.class), new a9(ya.g.c().b(), z8Var), z8Var.f5910a);
            case 2:
                ya.g c12 = ya.g.c();
                return new ka(c12.b(), (ya.k) c12.a(ya.k.class), new ja(ya.g.c().b(), (ha) obj));
            case 3:
                ya.g c13 = ya.g.c();
                return new h7.ka(c13.b(), (ya.k) c13.a(ya.k.class), new h7.ha(ya.g.c().b(), (ga) obj));
            default:
                ya.g c14 = ya.g.c();
                return new wf(c14.b(), (ya.k) c14.a(ya.k.class), new uf(ya.g.c().b(), (sf) obj));
        }
    }
}
