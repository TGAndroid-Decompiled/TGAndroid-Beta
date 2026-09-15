package gg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.rn0;
public final class z extends c2 {
    public final rn0 f9995t;

    public z(rn0 rn0Var) {
        super(false);
        this.f9995t = rn0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f9995t.F(tLObject);
    }
}
