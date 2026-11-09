package a8;

import android.content.Context;
import c8.qf;
import c8.sf;
import c8.uf;
import java.util.ArrayList;
public final class za extends bi.b1 {
    public final int f752b;

    public za(int i7) {
        super(4);
        this.f752b = i7;
    }

    @Override
    public final Object Q0(Object obj) {
        switch (this.f752b) {
            case 0:
                pb.g c10 = pb.g.c();
                return new ta(c10.b(), (pb.k) c10.a(pb.k.class), new na(pb.g.c().b(), (ma) obj));
            case 1:
                pb.g c11 = pb.g.c();
                return new uf(c11.b(), (pb.k) c11.a(pb.k.class), new sf(pb.g.c().b(), (qf) obj));
            case 2:
                pb.g c12 = pb.g.c();
                Context b10 = pb.g.c().b();
                ArrayList arrayList = new ArrayList();
                ((w7.o) obj).getClass();
                nb.a aVar = new nb.a(27);
                m5.a aVar2 = m5.a.f19872e;
                o5.s.b(b10);
                o5.s.a().c(aVar2);
                m5.a.d.contains(new l5.c("json"));
                arrayList.add(aVar);
                return new w7.p(c12.b(), (pb.k) c12.a(pb.k.class));
            case 3:
                y7.b9 b9Var = (y7.b9) obj;
                pb.g c13 = pb.g.c();
                return new y7.e9(c13.b(), (pb.k) c13.a(pb.k.class), new y7.c9(pb.g.c().b(), b9Var), b9Var.f58997a);
            default:
                pb.g c14 = pb.g.c();
                return new z7.ma(c14.b(), (pb.k) c14.a(pb.k.class), new z7.la(pb.g.c().b(), (z7.ja) obj));
        }
    }
}
