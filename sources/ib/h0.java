package ib;

import java.math.BigDecimal;
public class h0 extends fb.u {
    @Override
    public final Object read(nb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return hb.d.i(v);
        } catch (NumberFormatException e) {
            StringBuilder v10 = a1.g.v("Failed parsing '", v, "' as BigDecimal; at path ");
            v10.append(aVar.j());
            throw new RuntimeException(v10.toString(), e);
        }
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        bVar.q((BigDecimal) obj);
    }
}
