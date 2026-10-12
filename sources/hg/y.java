package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.so0;
public final class y extends a2 {
    public final so0 f10799t;

    public y(so0 so0Var) {
        super(false);
        this.f10799t = so0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f10799t.F(tLObject);
    }
}
