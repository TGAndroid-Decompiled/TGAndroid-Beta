package hb;

import java.math.BigInteger;
public class i0 extends eb.u {
    @Override
    public final Object read(mb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            gb.d.d(v);
            return new BigInteger(v);
        } catch (NumberFormatException e) {
            StringBuilder v10 = a1.g.v("Failed parsing '", v, "' as BigInteger; at path ");
            v10.append(aVar.j());
            throw new RuntimeException(v10.toString(), e);
        }
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        bVar.q((BigInteger) obj);
    }
}
