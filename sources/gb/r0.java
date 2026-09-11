package gb;

import java.util.Currency;
public class r0 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        String v = aVar.v();
        try {
            return Currency.getInstance(v);
        } catch (IllegalArgumentException e7) {
            StringBuilder v9 = a4.a.v("Failed parsing '", v, "' as Currency; at path ");
            v9.append(aVar.j());
            throw new RuntimeException(v9.toString(), e7);
        }
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        bVar.r(((Currency) obj).getCurrencyCode());
    }
}
