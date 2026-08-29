package la;

import bd.p;
import java.io.Serializable;
import java.util.Map;
import jd.c0;
import l3.g0;
import org.json.JSONObject;
public final class b extends uc.i implements p {
    public final int f15111a = 1;
    public int f15112b;
    public Object f15113c;
    public Object d;
    public Serializable f15114e;
    public final Object f15115f;

    public b(g0 g0Var, Map map, b bVar, c cVar, sc.c cVar2) {
        super(2, cVar2);
        this.d = g0Var;
        this.f15113c = map;
        this.f15114e = bVar;
        this.f15115f = cVar;
    }

    @Override
    public final sc.c create(Object obj, sc.c cVar) {
        switch (this.f15111a) {
            case 0:
                b bVar = new b((d) this.f15115f, cVar);
                bVar.f15113c = obj;
                return bVar;
            default:
                return new b((g0) this.d, this.f15113c, (b) this.f15114e, (c) this.f15115f, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15111a) {
            case 0:
                return ((b) create((JSONObject) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
            default:
                return ((b) create((c0) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: la.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public b(d dVar, sc.c cVar) {
        super(2, cVar);
        this.f15115f = dVar;
    }
}
