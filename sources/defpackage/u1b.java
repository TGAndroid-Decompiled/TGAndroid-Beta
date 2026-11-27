package defpackage;

import android.content.Context;
public final class u1b extends g1b {
    public vo1 E;
    public final int w;
    public final int x;
    public int y;

    public u1b(Context context, int i, int i2, of0 of0Var, int i3) {
        super(context, i2, of0Var, null);
        this.w = i;
        this.x = i3;
    }

    @Override
    public final void b(i1b i1bVar) {
        int i;
        if (i1bVar != null && (i = this.y) >= 0) {
            i1bVar.a(this.w, this.x, i, this.E);
        }
    }
}
