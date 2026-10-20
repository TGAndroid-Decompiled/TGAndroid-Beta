package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.po0;
public final class y extends a2 {
    public final po0 f12107t;

    public y(po0 po0Var) {
        super(false);
        this.f12107t = po0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f12107t.F(tLObject);
    }
}
