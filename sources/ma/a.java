package ma;

import java.util.Map;
public final class a implements ka.d {
    public final int f18395a;

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f18395a) {
            case 0:
                ka.e eVar = (ka.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ka.e eVar2 = (ka.e) obj2;
                eVar2.a(na.e.f18746g, entry.getKey());
                eVar2.a(na.e.h, entry.getValue());
                return;
            default:
                ka.e eVar3 = (ka.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
