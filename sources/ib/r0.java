package ib;

import java.util.Currency;
public class r0 extends fb.u {
    @Override
    public final Object read(nb.a aVar) {
        String v = aVar.v();
        try {
            return Currency.getInstance(v);
        } catch (IllegalArgumentException e) {
            StringBuilder v10 = a1.g.v("Failed parsing '", v, "' as Currency; at path ");
            v10.append(aVar.j());
            throw new RuntimeException(v10.toString(), e);
        }
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        bVar.r(((Currency) obj).getCurrencyCode());
    }
}
