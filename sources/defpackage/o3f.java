package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class o3f extends e23 {
    public final byte b;

    public o3f(byte b) {
        super((byte) 4);
        this.b = b;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                y0f y0fVar = (y0f) obj;
                kg7 c = kg7.c();
                return new j2f(c.b(), (lja) c.a(lja.class), new q1f(kg7.c().b(), y0fVar), y0fVar.a);
            case 1:
                kg7 c2 = kg7.c();
                return new w5f(c2.b(), (lja) c2.a(lja.class), new n5f(kg7.c().b(), (b5f) obj));
            case 2:
                kg7 c3 = kg7.c();
                return new q8f(c3.b(), (lja) c3.a(lja.class), new e8f(kg7.c().b(), (y7f) obj));
            case 3:
                kg7 c4 = kg7.c();
                Context b = kg7.c().b();
                ArrayList arrayList = new ArrayList();
                ((ahf) obj).getClass();
                Object obj2 = new Object();
                q51 q51Var = q51.e;
                h5c.b(b);
                h5c.a().c(q51Var);
                q51.d.contains(new n34("json"));
                arrayList.add(obj2);
                return new xhf(c4.b(), (lja) c4.a(lja.class));
            default:
                kg7 c5 = kg7.c();
                return new ijf(c5.b(), (lja) c5.a(lja.class), new djf(kg7.c().b(), (wif) obj));
        }
    }
}
