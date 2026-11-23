package fi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.tl0;
public final class l4 extends tl0 {
    public di.w2 f12212f;
    public final a5 h;

    public l4(a5 a5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = a5Var;
    }

    @Override
    public final void a(String str) {
        di.w2 w2Var = this.f12212f;
        if (w2Var != null) {
            org.telegram.messenger.g0.r(w2Var);
        }
        this.f12212f = new di.w2(28, this, str);
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.g0.h3(this.f12212f, 300L);
        } else {
            this.f12212f.run();
        }
        if (this.f12212f != null) {
            a5 a5Var = this.h;
            if (!a5Var.R) {
                a5Var.R = true;
                a5Var.f11729x.E();
                a5Var.f11730y.h1(0, -a5Var.f11726r.getPaddingTop());
            }
        }
    }
}
