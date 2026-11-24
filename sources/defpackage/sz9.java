package defpackage;

import android.content.Context;
import android.text.TextUtils;
public final class sz9 extends js9 {
    public tj9 f;
    public final g0a h;

    public sz9(g0a g0aVar, Context context, f53 f53Var) {
        super(context, 13.0f, f53Var);
        this.h = g0aVar;
    }

    @Override
    public final void a(String str) {
        tj9 tj9Var = this.f;
        if (tj9Var != null) {
            gl.r(tj9Var);
        }
        this.f = new tj9(this, str, (byte) 22);
        boolean isEmpty = TextUtils.isEmpty(str);
        tj9 tj9Var2 = this.f;
        if (!isEmpty) {
            gl.e3(tj9Var2, 300L);
        } else {
            tj9Var2.run();
        }
        if (this.f != null) {
            g0a g0aVar = this.h;
            if (!g0aVar.R) {
                g0aVar.R = true;
                g0aVar.x.E();
                g0aVar.y.g1(0, -g0aVar.r.getPaddingTop());
            }
        }
    }
}
