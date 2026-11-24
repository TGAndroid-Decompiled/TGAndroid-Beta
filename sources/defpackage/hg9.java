package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class hg9 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ig9 ig9Var = (ig9) view;
        ig9Var.set((TL_iv.RichMessage) c4cVar.H);
        ig9Var.setTranslationLoading(c4cVar.e);
    }

    @Override
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.d == c4cVar2.d && c4cVar.H == c4cVar2.H && c4cVar.e == c4cVar2.e) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        ig9 ig9Var = new ig9(i, wjbVar, context);
        ig9Var.setPadding(gl.L(20.0f), 0, gl.L(20.0f), gl.L(16.0f));
        return ig9Var;
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.d == c4cVar2.d) {
            return true;
        }
        return false;
    }
}
