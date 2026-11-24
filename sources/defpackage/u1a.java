package defpackage;

import android.content.Context;
import android.text.TextUtils;
public final class u1a extends lu9 {
    public il9 f;
    public final i2a h;

    public u1a(i2a i2aVar, Context context, r63 r63Var) {
        super(context, 13.0f, r63Var);
        this.h = i2aVar;
    }

    @Override
    public final void a(String str) {
        il9 il9Var = this.f;
        if (il9Var != null) {
            gm.r(il9Var);
        }
        this.f = new il9(this, str, (byte) 24);
        boolean isEmpty = TextUtils.isEmpty(str);
        il9 il9Var2 = this.f;
        if (!isEmpty) {
            gm.d3(il9Var2, 300L);
        } else {
            il9Var2.run();
        }
        if (this.f != null) {
            i2a i2aVar = this.h;
            if (!i2aVar.R) {
                i2aVar.R = true;
                i2aVar.x.E();
                i2aVar.y.g1(0, -i2aVar.r.getPaddingTop());
            }
        }
    }
}
