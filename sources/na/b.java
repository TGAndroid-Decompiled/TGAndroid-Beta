package na;

import dd.p;
import java.io.Serializable;
import java.util.Map;
import l7.w0;
import ld.c0;
import org.json.JSONObject;
public final class b extends wc.i implements p {
    public final int f15880a = 1;
    public int f15881b;
    public Object f15882c;
    public Object d;
    public Serializable f15883e;
    public final Object f15884f;

    public b(w0 w0Var, Map map, b bVar, c cVar, uc.c cVar2) {
        super(2, cVar2);
        this.d = w0Var;
        this.f15882c = map;
        this.f15883e = bVar;
        this.f15884f = cVar;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        switch (this.f15880a) {
            case 0:
                b bVar = new b((d) this.f15884f, cVar);
                bVar.f15882c = obj;
                return bVar;
            default:
                return new b((w0) this.d, this.f15882c, (b) this.f15883e, (c) this.f15884f, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15880a) {
            case 0:
                return ((b) create((JSONObject) obj, (uc.c) obj2)).invokeSuspend(sc.i.f47243a);
            default:
                return ((b) create((c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.f47243a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: na.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public b(d dVar, uc.c cVar) {
        super(2, cVar);
        this.f15884f = dVar;
    }
}
