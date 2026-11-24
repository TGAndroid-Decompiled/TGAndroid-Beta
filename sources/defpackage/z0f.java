package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class z0f extends x23 {
    public final byte b;

    public z0f(byte b) {
        super((byte) 4);
        this.b = b;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                jye jyeVar = (jye) obj;
                cg7 c = cg7.c();
                return new uze(c.b(), (uha) c.a(uha.class), new bze(cg7.c().b(), jyeVar), jyeVar.a);
            case 1:
                cg7 c2 = cg7.c();
                return new h3f(c2.b(), (uha) c2.a(uha.class), new y2f(cg7.c().b(), (l2f) obj));
            case 2:
                cg7 c3 = cg7.c();
                return new b6f(c3.b(), (uha) c3.a(uha.class), new p5f(cg7.c().b(), (i5f) obj));
            case 3:
                cg7 c4 = cg7.c();
                Context b = cg7.c().b();
                ArrayList arrayList = new ArrayList();
                ((lef) obj).getClass();
                Object obj2 = new Object();
                p61 p61Var = p61.e;
                i3c.b(b);
                i3c.a().c(p61Var);
                p61.d.contains(new d44("json"));
                arrayList.add(obj2);
                return new iff(c4.b(), (uha) c4.a(uha.class));
            default:
                cg7 c5 = cg7.c();
                return new tgf(c5.b(), (uha) c5.a(uha.class), new ogf(cg7.c().b(), (hgf) obj));
        }
    }
}
