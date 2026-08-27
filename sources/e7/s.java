package e7;

import android.content.Context;
import g7.b9;
import g7.y8;
import g7.z8;
import h7.ha;
import h7.ja;
import h7.ka;
import i7.ga;
import java.util.ArrayList;
import k7.sf;
import k7.uf;
import k7.wf;

public final class s extends b8.a {

    public final int f5342b;

    public s(int i10) {
        super(8);
        this.f5342b = i10;
    }

    @Override
    public final Object F(Object obj) {
        switch (this.f5342b) {
            case 0:
                za.g gVarC = za.g.c();
                Context contextB = za.g.c().b();
                ArrayList arrayList = new ArrayList();
                ((o) obj).getClass();
                xa.a aVar = new xa.a(5);
                u2.a aVar2 = u2.a.f48257e;
                w2.q.b(contextB);
                w2.q.a().c(aVar2);
                u2.a.d.contains(new t2.c("json"));
                arrayList.add(aVar);
                return new r(gVarC.b(), (za.k) gVarC.a(za.k.class));
            case 1:
                y8 y8Var = (y8) obj;
                za.g gVarC2 = za.g.c();
                return new b9(gVarC2.b(), (za.k) gVarC2.a(za.k.class), new z8(za.g.c().b(), y8Var), y8Var.f6699a);
            case 2:
                za.g gVarC3 = za.g.c();
                return new ka(gVarC3.b(), (za.k) gVarC3.a(za.k.class), new ja(za.g.c().b(), (ha) obj));
            case 3:
                za.g gVarC4 = za.g.c();
                return new i7.ka(gVarC4.b(), (za.k) gVarC4.a(za.k.class), new i7.ha(za.g.c().b(), (ga) obj));
            default:
                za.g gVarC5 = za.g.c();
                return new wf(gVarC5.b(), (za.k) gVarC5.a(za.k.class), new uf(za.g.c().b(), (sf) obj));
        }
    }
}
