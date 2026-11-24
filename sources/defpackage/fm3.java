package defpackage;

import org.telegram.tgnet.TLObject;
public final class fm3 extends bu9 {
    public final ov9 t;

    public fm3(ov9 ov9Var) {
        super(false);
        this.t = ov9Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.t.F(tLObject);
    }
}
