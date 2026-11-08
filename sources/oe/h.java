package oe;

import a8.p0;
import hd.r;
import java.util.LinkedHashMap;
import java.util.Map;
public final class h implements ke.a {
    public final ke.a f20913a;
    public final g f20914b;

    public h(ke.a aVar) {
        p pVar = p.f20936a;
        this.f20913a = aVar;
        this.f20914b = new g(p.f20937b, aVar.d());
    }

    @Override
    public final void a(qe.h hVar, Object obj) {
        Map map = (Map) obj;
        kotlin.jvm.internal.j.e(map, "<this>");
        map.size();
        g descriptor = this.f20914b;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        qe.h a10 = hVar.a(descriptor);
        Map map2 = (Map) obj;
        kotlin.jvm.internal.j.e(map2, "<this>");
        int i7 = 0;
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i7 + 1;
            a10.h(descriptor, i7, p.f20936a, key);
            i7 += 2;
            a10.h(descriptor, i10, this.f20913a, value);
        }
        a10.l(descriptor);
    }

    @Override
    public Object b(h2.c decoder) {
        Object k10;
        kotlin.jvm.internal.j.e(decoder, "decoder");
        kotlin.jvm.internal.j.e(decoder, "decoder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlin.jvm.internal.j.e(linkedHashMap, "<this>");
        int size = linkedHashMap.size() * 2;
        h2.c c10 = decoder.c(d());
        while (true) {
            int d = c10.d(d());
            if (d != -1) {
                int i7 = d + size;
                LinkedHashMap builder = linkedHashMap;
                kotlin.jvm.internal.j.e(builder, "builder");
                p pVar = p.f20936a;
                g gVar = this.f20914b;
                Object k11 = c10.k(gVar, i7, pVar, null);
                int d2 = c10.d(gVar);
                if (d2 == i7 + 1) {
                    boolean containsKey = builder.containsKey(k11);
                    ke.a aVar = this.f20913a;
                    if (containsKey && !(aVar.d().e() instanceof me.c)) {
                        k10 = c10.k(gVar, d2, aVar, r.a(builder, k11));
                    } else {
                        k10 = c10.k(gVar, d2, aVar, null);
                    }
                    builder.put(k11, k10);
                } else {
                    throw new IllegalArgumentException(p0.m(i7, d2, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
                }
            } else {
                c10.p(d());
                kotlin.jvm.internal.j.e(linkedHashMap, "<this>");
                return linkedHashMap;
            }
        }
    }

    @Override
    public final me.d d() {
        return this.f20914b;
    }
}
