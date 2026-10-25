package db;

import a8.h0;
import ce.c0;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;
import ud.p;
public final class b extends nd.i implements p {
    public final int f8280a = 1;
    public int f8281b;
    public Object f8282c;
    public Object d;
    public Serializable e;
    public final Object f8283f;

    public b(h0 h0Var, Map map, b bVar, c cVar, ld.c cVar2) {
        super(2, cVar2);
        this.d = h0Var;
        this.f8282c = map;
        this.e = bVar;
        this.f8283f = cVar;
    }

    @Override
    public final ld.c create(Object obj, ld.c cVar) {
        switch (this.f8280a) {
            case 0:
                b bVar = new b((d) this.f8283f, cVar);
                bVar.f8282c = obj;
                return bVar;
            default:
                return new b((h0) this.d, this.f8282c, (b) this.e, (c) this.f8283f, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8280a) {
            case 0:
                return ((b) create((JSONObject) obj, (ld.c) obj2)).invokeSuspend(jd.i.f15580a);
            default:
                return ((b) create((c0) obj, (ld.c) obj2)).invokeSuspend(jd.i.f15580a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: db.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public b(d dVar, ld.c cVar) {
        super(2, cVar);
        this.f8283f = dVar;
    }
}
