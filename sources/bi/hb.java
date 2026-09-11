package bi;

import android.content.Context;
public final class hb extends d0 {
    public final pb f3077a;

    public hb(Context context, pb pbVar) {
        super(context);
        this.f3077a = pbVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        n5 n5Var = this.f3077a.G0;
        if (n5Var != null) {
            n5Var.b();
        }
    }
}
