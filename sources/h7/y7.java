package h7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class y7 {
    public static HashMap a(ec.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", z7.e(aVar.f5863a));
        hashMap2.put("cvc", z7.e(aVar.f5864b));
        hashMap2.put("exp_month", aVar.f5865c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", z7.e(aVar.f5866e));
        hashMap2.put("currency", z7.e(aVar.f5874n));
        hashMap2.put("address_line1", z7.e(aVar.f5867f));
        hashMap2.put("address_line2", z7.e(aVar.f5868g));
        hashMap2.put("address_city", z7.e(aVar.h));
        hashMap2.put("address_zip", z7.e(aVar.f5870j));
        hashMap2.put("address_state", z7.e(aVar.f5869i));
        hashMap2.put("address_country", z7.e(aVar.f5871k));
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
