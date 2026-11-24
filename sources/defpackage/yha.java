package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
public final class yha extends eeb implements hs4 {
    public bia a;
    public lj7 b;

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        ?? eebVar = new eeb(3, (px2) obj3);
        eebVar.a = (bia) obj;
        eebVar.b = (lj7) obj2;
        return eebVar.invokeSuspend(g7c.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        tue.b(obj);
        bia biaVar = this.a;
        lj7 lj7Var = this.b;
        Set<ni8> keySet = lj7Var.a().keySet();
        ArrayList arrayList = new ArrayList(mm2.c(keySet, 10));
        for (ni8 ni8Var : keySet) {
            arrayList.add(ni8Var.a);
        }
        Map<String, ?> all = biaVar.a.getAll();
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
            LinkedHashSet linkedHashSet = biaVar.b;
            if (linkedHashSet != null) {
                z = linkedHashSet.contains(key);
            }
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(sk6.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = km2.m((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        lj7 lj7Var2 = new lj7(new LinkedHashMap(lj7Var.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                str.getClass();
                lj7Var2.d(new ni8(str), value2);
            } else if (value2 instanceof Float) {
                str.getClass();
                lj7Var2.d(new ni8(str), value2);
            } else if (value2 instanceof Integer) {
                str.getClass();
                lj7Var2.d(new ni8(str), value2);
            } else if (value2 instanceof Long) {
                str.getClass();
                lj7Var2.d(new ni8(str), value2);
            } else if (value2 instanceof String) {
                str.getClass();
                lj7Var2.d(new ni8(str), value2);
            } else if (value2 instanceof Set) {
                str.getClass();
                lj7Var2.d(new ni8(str), (Set) value2);
            }
        }
        return new lj7(new LinkedHashMap(lj7Var2.a()), true);
    }
}
