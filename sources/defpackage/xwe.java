package defpackage;

import java.io.Serializable;
public abstract class xwe {
    public static sdb a(sdb sdbVar) {
        if (!(sdbVar instanceof udb)) {
            if (sdbVar instanceof tdb) {
                return sdbVar;
            }
            if (sdbVar instanceof Serializable) {
                return new tdb(sdbVar);
            }
            return new udb(sdbVar);
        }
        return sdbVar;
    }
}
