package bd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
public abstract class t {
    public static int a(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map b(ad.e... eVarArr) {
        if (eVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(a(eVarArr.length));
            c(linkedHashMap, eVarArr);
            return linkedHashMap;
        }
        return r.f2661a;
    }

    public static final void c(LinkedHashMap linkedHashMap, ad.e[] eVarArr) {
        for (ad.e eVar : eVarArr) {
            linkedHashMap.put(eVar.f393a, eVar.f394b);
        }
    }

    public static Map d(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(a(arrayList.size()));
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ad.e eVar = (ad.e) obj;
                    linkedHashMap.put(eVar.f393a, eVar.f394b);
                }
                return linkedHashMap;
            }
            ad.e pair = (ad.e) arrayList.get(0);
            kotlin.jvm.internal.i.e(pair, "pair");
            Map singletonMap = Collections.singletonMap(pair.f393a, pair.f394b);
            kotlin.jvm.internal.i.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        return r.f2661a;
    }
}
