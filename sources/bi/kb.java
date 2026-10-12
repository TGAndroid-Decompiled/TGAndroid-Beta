package bi;

import android.content.Context;
public final class kb extends d0 {
    public final sb f3255a;

    public kb(Context context, sb sbVar) {
        super(context);
        this.f3255a = sbVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        p5 p5Var = this.f3255a.G0;
        if (p5Var != null) {
            p5Var.b();
        }
    }
}
