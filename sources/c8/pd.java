package c8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class pd {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", qd.e(aVar.f56511a));
        hashMap2.put("cvc", qd.e(aVar.f56512b));
        hashMap2.put("exp_month", aVar.f56513c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", qd.e(aVar.f56514e));
        hashMap2.put("currency", qd.e(aVar.f56522n));
        hashMap2.put("address_line1", qd.e(aVar.f56515f));
        hashMap2.put("address_line2", qd.e(aVar.f56516g));
        hashMap2.put("address_city", qd.e(aVar.h));
        hashMap2.put("address_zip", qd.e(aVar.f56518j));
        hashMap2.put("address_state", qd.e(aVar.f56517i));
        hashMap2.put("address_country", qd.e(aVar.f56519k));
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
