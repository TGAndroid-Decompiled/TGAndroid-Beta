package bb;

import ae.d0;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;
import sd.p;
public final class b extends ld.j implements p {
    public final int f3808a = 1;
    public int f3809b;
    public Object f3810c;
    public Object d;
    public Serializable f3811e;
    public final Object f3812f;

    public b(aa.a aVar, Map map, b bVar, c cVar, jd.c cVar2) {
        super(2, cVar2);
        this.d = aVar;
        this.f3810c = map;
        this.f3811e = bVar;
        this.f3812f = cVar;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        switch (this.f3808a) {
            case 0:
                b bVar = new b((d) this.f3812f, cVar);
                bVar.f3810c = obj;
                return bVar;
            default:
                return new b((aa.a) this.d, this.f3810c, (b) this.f3811e, (c) this.f3812f, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3808a) {
            case 0:
                return ((b) create((JSONObject) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11092a);
            default:
                return ((b) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11092a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: bb.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public b(d dVar, jd.c cVar) {
        super(2, cVar);
        this.f3812f = dVar;
    }
}
