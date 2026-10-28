package a8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class s0 {
    public static HashMap a(xc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", t0.e(aVar.f51774a));
        hashMap2.put("cvc", t0.e(aVar.f51775b));
        hashMap2.put("exp_month", aVar.f51776c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", t0.e(aVar.e));
        hashMap2.put("currency", t0.e(aVar.f51784n));
        hashMap2.put("address_line1", t0.e(aVar.f51777f));
        hashMap2.put("address_line2", t0.e(aVar.f51778g));
        hashMap2.put("address_city", t0.e(aVar.h));
        hashMap2.put("address_zip", t0.e(aVar.f51780j));
        hashMap2.put("address_state", t0.e(aVar.f51779i));
        hashMap2.put("address_country", t0.e(aVar.f51781k));
        Iterator it = new HashSet(hashMap2.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashMap2.get(str) == null) {
                hashMap2.remove(str);
            }
        }
        hashMap.put("card", hashMap2);
        return hashMap;
    }
}
