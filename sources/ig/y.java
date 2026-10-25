package ig;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.wo0;
public final class y extends a2 {
    public final wo0 f14303t;

    public y(wo0 wo0Var) {
        super(false);
        this.f14303t = wo0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f14303t.F(tLObject);
    }
}
