package gb;

import java.util.UUID;
public class q0 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return UUID.fromString(v);
        } catch (IllegalArgumentException e) {
            StringBuilder v9 = a4.a.v("Failed parsing '", v, "' as UUID; at path ");
            v9.append(aVar.j());
            throw new RuntimeException(v9.toString(), e);
        }
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        String uuid;
        UUID uuid2 = (UUID) obj;
        if (uuid2 == null) {
            uuid = null;
        } else {
            uuid = uuid2.toString();
        }
        bVar.r(uuid);
    }
}
