package a8;

import java.io.Serializable;
public abstract class la {
    public static g9.t a(g9.t tVar) {
        if (!(tVar instanceof g9.v)) {
            if (tVar instanceof g9.u) {
                return tVar;
            }
            if (tVar instanceof Serializable) {
                return new g9.u(tVar);
            }
            return new g9.v(tVar);
        }
        return tVar;
    }
}
