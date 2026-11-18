package jg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.km0;
public final class z extends z1 {
    public final km0 f17725t;

    public z(km0 km0Var) {
        super(false);
        this.f17725t = km0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f17725t.F(tLObject);
    }
}
