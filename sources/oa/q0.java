package oa;

import java.util.UUID;
public class q0 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return UUID.fromString(v);
        } catch (IllegalArgumentException e10) {
            StringBuilder t10 = aa.d.t("Failed parsing '", v, "' as UUID; at path ");
            t10.append(aVar.j());
            throw new RuntimeException(t10.toString(), e10);
        }
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        String uuid;
        UUID uuid2 = (UUID) obj;
        if (uuid2 == null) {
            uuid = null;
        } else {
            uuid = uuid2.toString();
        }
        cVar.r(uuid);
    }
}
