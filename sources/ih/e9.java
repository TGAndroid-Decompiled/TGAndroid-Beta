package ih;

import android.content.Context;
public final class e9 extends x {
    public final m9 f11393a;

    public e9(Context context, m9 m9Var) {
        super(context);
        this.f11393a = m9Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        h4 h4Var = this.f11393a.C0;
        if (h4Var != null) {
            h4Var.a();
        }
    }
}
