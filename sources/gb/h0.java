package gb;

import java.math.BigDecimal;
public class h0 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return fb.d.i(v);
        } catch (NumberFormatException e) {
            StringBuilder w10 = a4.a.w("Failed parsing '", v, "' as BigDecimal; at path ");
            w10.append(aVar.j());
            throw new RuntimeException(w10.toString(), e);
        }
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        bVar.q((BigDecimal) obj);
    }
}
