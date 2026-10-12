package gg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cp0;
public final class y extends b2 {
    public final cp0 f10871t;

    public y(cp0 cp0Var) {
        super(false);
        this.f10871t = cp0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f10871t.F(tLObject);
    }
}
