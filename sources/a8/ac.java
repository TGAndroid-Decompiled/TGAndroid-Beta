package a8;

import java.io.Serializable;
public abstract class ac {
    public static e9.t a(e9.t tVar) {
        if (!(tVar instanceof e9.v)) {
            if (tVar instanceof e9.u) {
                return tVar;
            }
            if (tVar instanceof Serializable) {
                return new e9.u(tVar);
            }
            return new e9.v(tVar);
        }
        return tVar;
    }
}
