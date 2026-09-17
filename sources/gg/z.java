package gg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.sn0;
public final class z extends c2 {
    public final sn0 f10000t;

    public z(sn0 sn0Var) {
        super(false);
        this.f10000t = sn0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f10000t.F(tLObject);
    }
}
