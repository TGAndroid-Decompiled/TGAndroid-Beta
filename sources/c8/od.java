package c8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class od {
    public static HashMap a(uc.a aVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", pd.e(aVar.f56383a));
        hashMap2.put("cvc", pd.e(aVar.f56384b));
        hashMap2.put("exp_month", aVar.f56385c);
        hashMap2.put("exp_year", aVar.d);
        hashMap2.put("name", pd.e(aVar.f56386e));
        hashMap2.put("currency", pd.e(aVar.f56394n));
        hashMap2.put("address_line1", pd.e(aVar.f56387f));
        hashMap2.put("address_line2", pd.e(aVar.f56388g));
        hashMap2.put("address_city", pd.e(aVar.h));
        hashMap2.put("address_zip", pd.e(aVar.f56390j));
        hashMap2.put("address_state", pd.e(aVar.f56389i));
        hashMap2.put("address_country", pd.e(aVar.f56391k));
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
