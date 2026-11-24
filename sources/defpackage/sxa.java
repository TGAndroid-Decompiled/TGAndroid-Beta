package defpackage;

import android.content.Context;
public final class sxa extends dxa {
    public fo1 E;
    public final int w;
    public final int x;
    public int y;

    public sxa(Context context, int i, int i2, mf0 mf0Var, int i3) {
        super(context, i2, mf0Var, null);
        this.w = i;
        this.x = i3;
    }

    @Override
    public final void b(gxa gxaVar) {
        int i;
        if (gxaVar != null && (i = this.y) >= 0) {
            gxaVar.a(this.w, this.x, i, this.E);
        }
    }
}
