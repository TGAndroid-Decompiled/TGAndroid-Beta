package fi;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.tl0;
public final class m4 extends tl0 {
    public l4 f12307f;
    public final b5 h;

    public m4(b5 b5Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = b5Var;
    }

    @Override
    public final void a(String str) {
        l4 l4Var = this.f12307f;
        if (l4Var != null) {
            org.telegram.messenger.g0.r(l4Var);
        }
        this.f12307f = new l4(0, this, str);
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.g0.h3(this.f12307f, 300L);
        } else {
            this.f12307f.run();
        }
        if (this.f12307f != null) {
            b5 b5Var = this.h;
            if (!b5Var.R) {
                b5Var.R = true;
                b5Var.f11818x.E();
                b5Var.f11819y.h1(0, -b5Var.f11815r.getPaddingTop());
            }
        }
    }
}
