package le;

import ed.s;
import java.util.LinkedHashMap;
import java.util.Map;
public final class h implements he.a {
    public final he.a f18191a;
    public final g f18192b;

    public h(he.a aVar) {
        p pVar = p.f18214a;
        this.f18191a = aVar;
        this.f18192b = new g(p.f18215b, aVar.d());
    }

    @Override
    public Object a(g2.d decoder) {
        Object k10;
        kotlin.jvm.internal.j.e(decoder, "decoder");
        kotlin.jvm.internal.j.e(decoder, "decoder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlin.jvm.internal.j.e(linkedHashMap, "<this>");
        int size = linkedHashMap.size() * 2;
        g2.d c2 = decoder.c(d());
        while (true) {
            int d = c2.d(d());
            if (d != -1) {
                int i3 = d + size;
                LinkedHashMap builder = linkedHashMap;
                kotlin.jvm.internal.j.e(builder, "builder");
                p pVar = p.f18214a;
                g gVar = this.f18192b;
                Object k11 = c2.k(gVar, i3, pVar, null);
                int d10 = c2.d(gVar);
                if (d10 == i3 + 1) {
                    boolean containsKey = builder.containsKey(k11);
                    he.a aVar = this.f18191a;
                    if (containsKey && !(aVar.d().e() instanceof je.c)) {
                        k10 = c2.k(gVar, d10, aVar, s.a(builder, k11));
                    } else {
                        k10 = c2.k(gVar, d10, aVar, null);
                    }
                    builder.put(k11, k10);
                } else {
                    throw new IllegalArgumentException(a1.g.n(i3, d10, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
                }
            } else {
                c2.p(d());
                kotlin.jvm.internal.j.e(linkedHashMap, "<this>");
                return linkedHashMap;
            }
        }
    }

    @Override
    public final void c(ne.h hVar, Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.j.e(map, "<this>");
        map.size();
        g descriptor = this.f18192b;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        ne.h a10 = hVar.a(descriptor);
        Map map2 = (Map) obj;
        kotlin.jvm.internal.j.e(map2, "<this>");
        int i3 = 0;
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i3 + 1;
            a10.h(descriptor, i3, p.f18214a, key);
            i3 += 2;
            a10.h(descriptor, i10, this.f18191a, value);
        }
        a10.l(descriptor);
    }

    @Override
    public final je.d d() {
        return this.f18192b;
    }
}
