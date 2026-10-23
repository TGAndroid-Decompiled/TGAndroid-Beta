package cb;

import be.c0;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;
import td.p;
public final class b extends md.i implements p {
    public final int f5057a = 1;
    public int f5058b;
    public Object f5059c;
    public Object d;
    public Serializable e;
    public final Object f5060f;

    public b(androidx.biometric.e eVar, Map map, b bVar, c cVar, kd.c cVar2) {
        super(2, cVar2);
        this.d = eVar;
        this.f5059c = map;
        this.e = bVar;
        this.f5060f = cVar;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        switch (this.f5057a) {
            case 0:
                b bVar = new b((d) this.f5060f, cVar);
                bVar.f5059c = obj;
                return bVar;
            default:
                return new b((androidx.biometric.e) this.d, this.f5059c, (b) this.e, (c) this.f5060f, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5057a) {
            case 0:
                return ((b) create((JSONObject) obj, (kd.c) obj2)).invokeSuspend(id.i.f12807a);
            default:
                return ((b) create((c0) obj, (kd.c) obj2)).invokeSuspend(id.i.f12807a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: cb.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public b(d dVar, kd.c cVar) {
        super(2, cVar);
        this.f5060f = dVar;
    }
}
