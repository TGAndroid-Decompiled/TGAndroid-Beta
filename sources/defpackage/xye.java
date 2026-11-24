package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class xye extends l13 {
    public final byte b;

    public xye(byte b) {
        super((byte) 4);
        this.b = b;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                hwe hweVar = (hwe) obj;
                ae7 c = ae7.c();
                return new sxe(c.b(), (sfa) c.a(sfa.class), new zwe(ae7.c().b(), hweVar), hweVar.a);
            case 1:
                ae7 c2 = ae7.c();
                return new f1f(c2.b(), (sfa) c2.a(sfa.class), new w0f(ae7.c().b(), (j0f) obj));
            case 2:
                ae7 c3 = ae7.c();
                return new z3f(c3.b(), (sfa) c3.a(sfa.class), new n3f(ae7.c().b(), (g3f) obj));
            case 3:
                ae7 c4 = ae7.c();
                Context b = ae7.c().b();
                ArrayList arrayList = new ArrayList();
                ((kcf) obj).getClass();
                Object obj2 = new Object();
                i51 i51Var = i51.e;
                i1c.b(b);
                i1c.a().c(i51Var);
                i51.d.contains(new s24("json"));
                arrayList.add(obj2);
                return new hdf(c4.b(), (sfa) c4.a(sfa.class));
            default:
                ae7 c5 = ae7.c();
                return new sef(c5.b(), (sfa) c5.a(sfa.class), new nef(ae7.c().b(), (gef) obj));
        }
    }
}
