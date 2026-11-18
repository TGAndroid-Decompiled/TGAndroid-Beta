package c8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class sd {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", td.e(aVar.f58572a));
        hashMap2.put("cvc", td.e(aVar.f58573b));
        hashMap2.put("exp_month", aVar.f58574c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", td.e(aVar.f58575e));
        hashMap2.put("currency", td.e(aVar.f58583n));
        hashMap2.put("address_line1", td.e(aVar.f58576f));
        hashMap2.put("address_line2", td.e(aVar.f58577g));
        hashMap2.put("address_city", td.e(aVar.h));
        hashMap2.put("address_zip", td.e(aVar.f58579j));
        hashMap2.put("address_state", td.e(aVar.f58578i));
        hashMap2.put("address_country", td.e(aVar.f58580k));
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
