package oa;

import java.math.BigInteger;
public class i0 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            na.d.d(v);
            return new BigInteger(v);
        } catch (NumberFormatException e10) {
            StringBuilder t10 = aa.d.t("Failed parsing '", v, "' as BigInteger; at path ");
            t10.append(aVar.j());
            throw new RuntimeException(t10.toString(), e10);
        }
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        cVar.q((BigInteger) obj);
    }
}
