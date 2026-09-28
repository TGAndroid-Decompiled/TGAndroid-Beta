package gb;

import java.util.Currency;
public class r0 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        String v = aVar.v();
        try {
            return Currency.getInstance(v);
        } catch (IllegalArgumentException e) {
            StringBuilder w10 = a4.a.w("Failed parsing '", v, "' as Currency; at path ");
            w10.append(aVar.j());
            throw new RuntimeException(w10.toString(), e);
        }
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        bVar.r(((Currency) obj).getCurrencyCode());
    }
}
