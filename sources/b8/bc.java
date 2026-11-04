package b8;

import java.io.Serializable;
public abstract class bc {
    public static f9.t a(f9.t tVar) {
        if (!(tVar instanceof f9.v)) {
            if (tVar instanceof f9.u) {
                return tVar;
            }
            if (tVar instanceof Serializable) {
                return new f9.u(tVar);
            }
            return new f9.v(tVar);
        }
        return tVar;
    }
}
