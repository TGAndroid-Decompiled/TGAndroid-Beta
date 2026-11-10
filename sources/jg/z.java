package jg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.yl0;
public final class z extends z1 {
    public final yl0 f16987t;

    public z(yl0 yl0Var) {
        super(false);
        this.f16987t = yl0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f16987t.F(tLObject);
    }
}
