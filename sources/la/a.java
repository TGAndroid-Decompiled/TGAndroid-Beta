package la;

import java.util.Map;
public final class a implements ja.d {
    public final int f15982a;

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f15982a) {
            case 0:
                ja.e eVar = (ja.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ja.e eVar2 = (ja.e) obj2;
                eVar2.d(ma.f.f16817g, entry.getKey());
                eVar2.d(ma.f.h, entry.getValue());
                return;
            default:
                ja.e eVar3 = (ja.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
