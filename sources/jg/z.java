package jg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.mm0;
public final class z extends z1 {
    public final mm0 f17818t;

    public z(mm0 mm0Var) {
        super(false);
        this.f17818t = mm0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f17818t.F(tLObject);
    }
}
