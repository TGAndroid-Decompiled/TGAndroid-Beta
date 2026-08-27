package g7;

import java.util.HashMap;
import java.util.HashSet;

public abstract class l7 {
    public static HashMap a(dc.a aVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put("number", m7.e(aVar.f4895a));
        map2.put("cvc", m7.e(aVar.f4896b));
        map2.put("exp_month", aVar.f4897c);
        map2.put("exp_year", aVar.d);
        map2.put("name", m7.e(aVar.f4898e));
        map2.put("currency", m7.e(aVar.f4906n));
        map2.put("address_line1", m7.e(aVar.f4899f));
        map2.put("address_line2", m7.e(aVar.f4900g));
        map2.put("address_city", m7.e(aVar.h));
        map2.put("address_zip", m7.e(aVar.f4902j));
        map2.put("address_state", m7.e(aVar.f4901i));
        map2.put("address_country", m7.e(aVar.f4903k));
        for (String str : new HashSet(map2.keySet())) {
            if (map2.get(str) == null) {
                map2.remove(str);
            }
        }
        map.put("card", map2);
        return map;
    }
}
