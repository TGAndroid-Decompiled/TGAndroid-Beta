package defpackage;

import java.io.Serializable;
public abstract class vue {
    public static qbb a(qbb qbbVar) {
        if (!(qbbVar instanceof sbb)) {
            if (qbbVar instanceof rbb) {
                return qbbVar;
            }
            if (qbbVar instanceof Serializable) {
                return new rbb(qbbVar);
            }
            return new sbb(qbbVar);
        }
        return qbbVar;
    }
}
