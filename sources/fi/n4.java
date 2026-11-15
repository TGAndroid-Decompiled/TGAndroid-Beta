package fi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.jl0;
public final class n4 extends jl0 {
    public di.s2 f12075f;
    public final c5 h;

    public n4(c5 c5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = c5Var;
    }

    @Override
    public final void a(String str) {
        di.s2 s2Var = this.f12075f;
        if (s2Var != null) {
            org.telegram.messenger.g0.r(s2Var);
        }
        this.f12075f = new di.s2(26, this, str);
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.g0.i3(this.f12075f, 300L);
        } else {
            this.f12075f.run();
        }
        if (this.f12075f != null) {
            c5 c5Var = this.h;
            if (!c5Var.R) {
                c5Var.R = true;
                c5Var.f11606x.E();
                c5Var.f11607y.h1(0, -c5Var.f11603r.getPaddingTop());
            }
        }
    }
}
