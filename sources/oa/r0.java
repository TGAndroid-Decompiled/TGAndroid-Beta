package oa;

import java.util.Currency;
public class r0 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        String v = aVar.v();
        try {
            return Currency.getInstance(v);
        } catch (IllegalArgumentException e10) {
            StringBuilder t10 = aa.d.t("Failed parsing '", v, "' as Currency; at path ");
            t10.append(aVar.j());
            throw new RuntimeException(t10.toString(), e10);
        }
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        cVar.r(((Currency) obj).getCurrencyCode());
    }
}
