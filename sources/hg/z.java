package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.rn0;
public final class z extends b2 {
    public final rn0 f11329t;

    public z(rn0 rn0Var) {
        super(false);
        this.f11329t = rn0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f11329t.F(tLObject);
    }
}
