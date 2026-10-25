package a8;

import android.content.Context;
import java.util.ArrayList;
public final class qg extends b2.h {
    public final int f758b;

    public qg(int i10) {
        super(6);
        this.f758b = i10;
    }

    @Override
    public final Object Q0(Object obj) {
        switch (this.f758b) {
            case 0:
                sb.g c10 = sb.g.c();
                return new kg(c10.b(), (sb.k) c10.a(sb.k.class), new eg(sb.g.c().b(), (cg) obj));
            case 1:
                sb.g c11 = sb.g.c();
                Context b10 = sb.g.c().b();
                ArrayList arrayList = new ArrayList();
                ((u7.o) obj).getClass();
                qb.a aVar = new qb.a(23);
                k5.a aVar2 = k5.a.e;
                m5.t.b(b10);
                m5.t.a().c(aVar2);
                k5.a.d.contains(new j5.c("json"));
                arrayList.add(aVar);
                return new u7.p(c11.b(), (sb.k) c11.a(sb.k.class));
            case 2:
                w7.a9 a9Var = (w7.a9) obj;
                sb.g c12 = sb.g.c();
                return new w7.d9(c12.b(), (sb.k) c12.a(sb.k.class), new w7.b9(sb.g.c().b(), a9Var), a9Var.f50811a);
            case 3:
                sb.g c13 = sb.g.c();
                return new x7.ma(c13.b(), (sb.k) c13.a(sb.k.class), new x7.la(sb.g.c().b(), (x7.ja) obj));
            default:
                sb.g c14 = sb.g.c();
                return new y7.ca(c14.b(), (sb.k) c14.a(sb.k.class), new y7.aa(sb.g.c().b(), (y7.z9) obj));
        }
    }
}
