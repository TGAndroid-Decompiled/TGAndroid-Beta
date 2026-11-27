package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
public final class pja extends yfb implements ks4 {
    public sja a;
    public rj7 b;

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        ?? yfbVar = new yfb(3, (zw2) obj3);
        yfbVar.a = (sja) obj;
        yfbVar.b = (rj7) obj2;
        return yfbVar.invokeSuspend(f9c.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ixe.b(obj);
        sja sjaVar = this.a;
        rj7 rj7Var = this.b;
        Set<zj8> keySet = rj7Var.a().keySet();
        ArrayList arrayList = new ArrayList(ul2.c(keySet, 10));
        for (zj8 zj8Var : keySet) {
            arrayList.add(zj8Var.a);
        }
        Map<String, ?> all = sjaVar.a.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            LinkedHashSet linkedHashSet = sjaVar.b;
            if (linkedHashSet != null) {
                z = linkedHashSet.contains(key);
            }
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(uk6.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = sl2.m((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        rj7 rj7Var2 = new rj7(new LinkedHashMap(rj7Var.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                rj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                rj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                rj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                rj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                rj7Var2.d(new zj8(str), value2);
            } else if (value2 instanceof Set) {
                str.getClass();
                rj7Var2.d(new zj8(str), (Set) value2);
            }
        }
        return new rj7(new LinkedHashMap(rj7Var2.a()), true);
    }
}
