package f7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class k7 {
    public static HashMap a(cc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", l7.e(aVar.f2351a));
        hashMap2.put("cvc", l7.e(aVar.f2352b));
        hashMap2.put("exp_month", aVar.f2353c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", l7.e(aVar.f2354e));
        hashMap2.put("currency", l7.e(aVar.f2362n));
        hashMap2.put("address_line1", l7.e(aVar.f2355f));
        hashMap2.put("address_line2", l7.e(aVar.f2356g));
        hashMap2.put("address_city", l7.e(aVar.h));
        hashMap2.put("address_zip", l7.e(aVar.f2358j));
        hashMap2.put("address_state", l7.e(aVar.f2357i));
        hashMap2.put("address_country", l7.e(aVar.f2359k));
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
