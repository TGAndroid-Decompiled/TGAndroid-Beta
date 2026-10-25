package ib;

import java.math.BigInteger;
public class i0 extends fb.u {
    @Override
    public final Object read(nb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            hb.d.d(v);
            return new BigInteger(v);
        } catch (NumberFormatException e) {
            StringBuilder v10 = a1.g.v("Failed parsing '", v, "' as BigInteger; at path ");
            v10.append(aVar.j());
            throw new RuntimeException(v10.toString(), e);
        }
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        bVar.q((BigInteger) obj);
    }
}
