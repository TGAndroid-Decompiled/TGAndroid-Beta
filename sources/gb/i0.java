package gb;

import java.math.BigInteger;
public class i0 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            fb.d.d(v);
            return new BigInteger(v);
        } catch (NumberFormatException e) {
            StringBuilder w10 = a4.a.w("Failed parsing '", v, "' as BigInteger; at path ");
            w10.append(aVar.j());
            throw new RuntimeException(w10.toString(), e);
        }
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        bVar.q((BigInteger) obj);
    }
}
