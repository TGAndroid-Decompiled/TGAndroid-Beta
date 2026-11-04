package oa;

import java.util.Map;
public final class a implements ma.d {
    public final int f20941a;

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f20941a) {
            case 0:
                ma.e eVar = (ma.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ma.e eVar2 = (ma.e) obj2;
                eVar2.a(pa.e.f53432g, entry.getKey());
                eVar2.a(pa.e.h, entry.getValue());
                return;
            default:
                ma.e eVar3 = (ma.e) obj2;
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
