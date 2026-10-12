package hb;

import java.math.BigDecimal;
public class h0 extends eb.u {
    @Override
    public final Object read(mb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return gb.d.i(v);
        } catch (NumberFormatException e) {
            StringBuilder v10 = a1.g.v("Failed parsing '", v, "' as BigDecimal; at path ");
            v10.append(aVar.j());
            throw new RuntimeException(v10.toString(), e);
        }
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        bVar.q((BigDecimal) obj);
    }
}
