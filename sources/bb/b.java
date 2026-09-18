package bb;

import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;
import rd.p;
import zd.c0;
public final class b extends kd.j implements p {
    public final int f3458a = 1;
    public int f3459b;
    public Object f3460c;
    public Object d;
    public Serializable e;
    public final Object f3461f;

    public b(aa.a aVar, Map map, b bVar, c cVar, id.c cVar2) {
        super(2, cVar2);
        this.d = aVar;
        this.f3460c = map;
        this.e = bVar;
        this.f3461f = cVar;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        switch (this.f3458a) {
            case 0:
                b bVar = new b((d) this.f3461f, cVar);
                bVar.f3460c = obj;
                return bVar;
            default:
                return new b((aa.a) this.d, this.f3460c, (b) this.e, (c) this.f3461f, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3458a) {
            case 0:
                return ((b) create((JSONObject) obj, (id.c) obj2)).invokeSuspend(gd.i.f9620a);
            default:
                return ((b) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.f9620a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: bb.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public b(d dVar, id.c cVar) {
        super(2, cVar);
        this.f3461f = dVar;
    }
}
