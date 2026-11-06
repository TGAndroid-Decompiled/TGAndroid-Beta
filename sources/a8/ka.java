package a8;

import java.io.Serializable;
public abstract class ka {
    public static g9.u a(g9.u uVar) {
        if (!(uVar instanceof g9.w)) {
            if (uVar instanceof g9.v) {
                return uVar;
            }
            if (uVar instanceof Serializable) {
                return new g9.v(uVar);
            }
            return new g9.w(uVar);
        }
        return uVar;
    }
}
