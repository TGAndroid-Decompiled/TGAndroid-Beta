package ei;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.il0;
public final class v4 extends il0 {
    public b0 f11124f;
    public final k5 h;

    public v4(k5 k5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = k5Var;
    }

    @Override
    public final void a(String str) {
        b0 b0Var = this.f11124f;
        if (b0Var != null) {
            org.telegram.messenger.g0.r(b0Var);
        }
        this.f11124f = new b0(8, this, str);
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.g0.i3(this.f11124f, 300L);
        } else {
            this.f11124f.run();
        }
        if (this.f11124f != null) {
            k5 k5Var = this.h;
            if (!k5Var.R) {
                k5Var.R = true;
                k5Var.f10580x.E();
                k5Var.f10581y.h1(0, -k5Var.f10577r.getPaddingTop());
            }
        }
    }
}
