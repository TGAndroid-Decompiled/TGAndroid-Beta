package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public abstract class jze {
    public static HashMap a(zc1 zc1Var) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("number", lze.e((String) zc1Var.a));
        hashMap2.put("cvc", lze.e((String) zc1Var.b));
        hashMap2.put("exp_month", (Integer) zc1Var.m);
        hashMap2.put("exp_year", (Integer) zc1Var.n);
        hashMap2.put("name", lze.e((String) zc1Var.c));
        hashMap2.put("currency", lze.e((String) zc1Var.l));
        hashMap2.put("address_line1", lze.e((String) zc1Var.d));
        hashMap2.put("address_line2", lze.e((String) zc1Var.e));
        hashMap2.put("address_city", lze.e((String) zc1Var.f));
        hashMap2.put("address_zip", lze.e((String) zc1Var.h));
        hashMap2.put("address_state", lze.e((String) zc1Var.g));
        hashMap2.put("address_country", lze.e((String) zc1Var.i));
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
