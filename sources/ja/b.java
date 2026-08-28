package ja;

import hd.c0;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;
import zc.p;
public final class b extends sc.i implements p {
    public final int f14253a = 1;
    public int f14254b;
    public Object f14255c;
    public Object d;
    public Serializable f14256e;
    public final Object f14257f;

    public b(j4.c cVar, Map map, b bVar, c cVar2, qc.c cVar3) {
        super(2, cVar3);
        this.d = cVar;
        this.f14255c = map;
        this.f14256e = bVar;
        this.f14257f = cVar2;
    }

    @Override
    public final qc.c create(Object obj, qc.c cVar) {
        switch (this.f14253a) {
            case 0:
                b bVar = new b((d) this.f14257f, cVar);
                bVar.f14255c = obj;
                return bVar;
            default:
                return new b((j4.c) this.d, this.f14255c, (b) this.f14256e, (c) this.f14257f, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14253a) {
            case 0:
                return ((b) create((JSONObject) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
            default:
                return ((b) create((c0) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: ja.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public b(d dVar, qc.c cVar) {
        super(2, cVar);
        this.f14257f = dVar;
    }
}
