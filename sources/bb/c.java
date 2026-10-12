package bb;

import ae.d0;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;
import sd.p;
public final class c extends ld.j implements p {
    public final int f3807a = 1;
    public int f3808b;
    public Object f3809c;
    public Object d;
    public Serializable f3810e;
    public final Object f3811f;

    public c(aa.a aVar, Map map, c cVar, d dVar, jd.c cVar2) {
        super(2, cVar2);
        this.d = aVar;
        this.f3809c = map;
        this.f3810e = cVar;
        this.f3811f = dVar;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        switch (this.f3807a) {
            case 0:
                c cVar2 = new c((e) this.f3811f, cVar);
                cVar2.f3809c = obj;
                return cVar2;
            default:
                return new c((aa.a) this.d, this.f3809c, (c) this.f3810e, (d) this.f3811f, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3807a) {
            case 0:
                return ((c) create((JSONObject) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11090a);
            default:
                return ((c) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11090a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: bb.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public c(e eVar, jd.c cVar) {
        super(2, cVar);
        this.f3811f = eVar;
    }
}
