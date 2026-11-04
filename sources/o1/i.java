package o1;

import b8.ib;
import b8.yf;
import dd.k;
import ed.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import od.q;
public final class i extends hd.j implements q {
    public n1.f f20501a;
    public p1.b f20502b;

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        ?? jVar = new hd.j(3, (fd.c) obj3);
        jVar.f20501a = (n1.f) obj;
        jVar.f20502b = (p1.b) obj2;
        return jVar.invokeSuspend(k.f8801a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.f12241a;
        ib.b(obj);
        n1.f fVar = this.f20501a;
        p1.b bVar = this.f20502b;
        Set<p1.e> keySet = bVar.a().keySet();
        ArrayList arrayList = new ArrayList(ed.i.d(keySet, 10));
        for (p1.e eVar : keySet) {
            arrayList.add(eVar.f53065a);
        }
        Map<String, ?> all = fVar.f20126a.getAll();
        kotlin.jvm.internal.j.d(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            Set set = fVar.f20127b;
            if (set != null) {
                z10 = set.contains(key);
            }
            if (z10) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(s.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = ed.g.o((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        p1.b bVar2 = new p1.b(new LinkedHashMap(bVar.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String name = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new p1.e(name), value2);
            } else if (value2 instanceof Float) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new p1.e(name), value2);
            } else if (value2 instanceof Integer) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new p1.e(name), value2);
            } else if (value2 instanceof Long) {
                kotlin.jvm.internal.j.e(name, "name");
                bVar2.e(new p1.e(name), value2);
            } else if (value2 instanceof String) {
                bVar2.e(yf.a(name), value2);
            } else if (value2 instanceof Set) {
                bVar2.e(yf.b(name), (Set) value2);
            }
        }
        return new p1.b(new LinkedHashMap(bVar2.a()), true);
    }
}
