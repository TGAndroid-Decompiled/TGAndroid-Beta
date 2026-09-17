package bb;

import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;
import rd.p;
import zd.c0;
public final class c extends kd.j implements p {
    public final int f2563a = 1;
    public int f2564b;
    public Object f2565c;
    public Object d;
    public Serializable f2566e;
    public final Object f2567f;

    public c(aa.a aVar, Map map, c cVar, d dVar, id.c cVar2) {
        super(2, cVar2);
        this.d = aVar;
        this.f2565c = map;
        this.f2566e = cVar;
        this.f2567f = dVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f2563a) {
            case 0:
                c cVar2 = new c((e) this.f2567f, cVar);
                cVar2.f2565c = obj;
                return cVar2;
            default:
                return new c((aa.a) this.d, this.f2565c, (c) this.f2566e, (d) this.f2567f, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2563a) {
            case 0:
                return ((c) create((JSONObject) obj, (id.c) obj2)).invokeSuspend(gd.i.f10616a);
            default:
                return ((c) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f10616a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: bb.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public c(e eVar, id.c cVar) {
        super(2, cVar);
        this.f2567f = eVar;
    }
}
