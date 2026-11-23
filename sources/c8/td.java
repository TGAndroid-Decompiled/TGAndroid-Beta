package c8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class td {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", ud.e(aVar.f58583a));
        hashMap2.put("cvc", ud.e(aVar.f58584b));
        hashMap2.put("exp_month", aVar.f58585c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", ud.e(aVar.f58586e));
        hashMap2.put("currency", ud.e(aVar.f58594n));
        hashMap2.put("address_line1", ud.e(aVar.f58587f));
        hashMap2.put("address_line2", ud.e(aVar.f58588g));
        hashMap2.put("address_city", ud.e(aVar.h));
        hashMap2.put("address_zip", ud.e(aVar.f58590j));
        hashMap2.put("address_state", ud.e(aVar.f58589i));
        hashMap2.put("address_country", ud.e(aVar.f58591k));
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
