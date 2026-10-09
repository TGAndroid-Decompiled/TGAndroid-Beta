package gg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.wo0;
public final class y extends b2 {
    public final wo0 f10873t;

    public y(wo0 wo0Var) {
        super(false);
        this.f10873t = wo0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f10873t.F(tLObject);
    }
}
