package c8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class pd {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", qd.e(aVar.f56407a));
        hashMap2.put("cvc", qd.e(aVar.f56408b));
        hashMap2.put("exp_month", aVar.f56409c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", qd.e(aVar.f56410e));
        hashMap2.put("currency", qd.e(aVar.f56418n));
        hashMap2.put("address_line1", qd.e(aVar.f56411f));
        hashMap2.put("address_line2", qd.e(aVar.f56412g));
        hashMap2.put("address_city", qd.e(aVar.h));
        hashMap2.put("address_zip", qd.e(aVar.f56414j));
        hashMap2.put("address_state", qd.e(aVar.f56413i));
        hashMap2.put("address_country", qd.e(aVar.f56415k));
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
