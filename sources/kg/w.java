package kg;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bm0;
public final class w extends v1 {
    public final bm0 f17223t;

    public w(bm0 bm0Var) {
        super(false);
        this.f17223t = bm0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f17223t.F(tLObject);
    }
}
