package defpackage;

import android.content.Context;
public final class vza extends gza {
    public sp1 E;
    public final int w;
    public final int x;
    public int y;

    public vza(Context context, int i, int i2, mg0 mg0Var, int i3) {
        super(context, i2, mg0Var, null);
        this.w = i;
        this.x = i3;
    }

    @Override
    public final void b(jza jzaVar) {
        int i;
        if (jzaVar != null && (i = this.y) >= 0) {
            jzaVar.a(this.w, this.x, i, this.E);
        }
    }
}
