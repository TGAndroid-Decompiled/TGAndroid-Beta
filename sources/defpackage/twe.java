package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class twe {
    public static HashMap a(zd1 zd1Var) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", uwe.e((String) zd1Var.a));
        hashMap2.put("cvc", uwe.e((String) zd1Var.b));
        hashMap2.put("exp_month", (Integer) zd1Var.m);
        hashMap2.put("exp_year", (Integer) zd1Var.n);
        hashMap2.put("name", uwe.e((String) zd1Var.c));
        hashMap2.put("currency", uwe.e((String) zd1Var.l));
        hashMap2.put("address_line1", uwe.e((String) zd1Var.d));
        hashMap2.put("address_line2", uwe.e((String) zd1Var.e));
        hashMap2.put("address_city", uwe.e((String) zd1Var.f));
        hashMap2.put("address_zip", uwe.e((String) zd1Var.h));
        hashMap2.put("address_state", uwe.e((String) zd1Var.g));
        hashMap2.put("address_country", uwe.e((String) zd1Var.i));
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
