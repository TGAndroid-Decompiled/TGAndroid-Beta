package j7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class o8 {
    public static HashMap a(gc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", p8.e(aVar.f6508a));
        hashMap2.put("cvc", p8.e(aVar.f6509b));
        hashMap2.put("exp_month", aVar.f6510c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", p8.e(aVar.e));
        hashMap2.put("currency", p8.e(aVar.f6518n));
        hashMap2.put("address_line1", p8.e(aVar.f6511f));
        hashMap2.put("address_line2", p8.e(aVar.f6512g));
        hashMap2.put("address_city", p8.e(aVar.h));
        hashMap2.put("address_zip", p8.e(aVar.f6514j));
        hashMap2.put("address_state", p8.e(aVar.f6513i));
        hashMap2.put("address_country", p8.e(aVar.f6515k));
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
