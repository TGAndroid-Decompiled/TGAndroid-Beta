package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class rue {
    public static HashMap a(rc1 rc1Var) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", sue.e((String) rc1Var.a));
        hashMap2.put("cvc", sue.e((String) rc1Var.b));
        hashMap2.put("exp_month", (Integer) rc1Var.m);
        hashMap2.put("exp_year", (Integer) rc1Var.n);
        hashMap2.put("name", sue.e((String) rc1Var.c));
        hashMap2.put("currency", sue.e((String) rc1Var.l));
        hashMap2.put("address_line1", sue.e((String) rc1Var.d));
        hashMap2.put("address_line2", sue.e((String) rc1Var.e));
        hashMap2.put("address_city", sue.e((String) rc1Var.f));
        hashMap2.put("address_zip", sue.e((String) rc1Var.h));
        hashMap2.put("address_state", sue.e((String) rc1Var.g));
        hashMap2.put("address_country", sue.e((String) rc1Var.i));
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
