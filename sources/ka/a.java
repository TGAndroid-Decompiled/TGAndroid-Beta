package ka;

import java.util.Map;
public final class a implements ia.d {
    public final int f12407a;

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f12407a) {
            case 0:
                ia.e eVar = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar2 = (ia.e) obj2;
                eVar2.a(la.f.f12833g, entry.getKey());
                eVar2.a(la.f.h, entry.getValue());
                return;
            default:
                ia.e eVar3 = (ia.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
