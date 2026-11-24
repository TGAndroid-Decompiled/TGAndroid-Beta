package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
public final class e13 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ghb ghbVar = (ghb) view;
        ghbVar.c(c4cVar.m, c4cVar.o, !c4cVar.j);
        wla wlaVar = ghbVar.a;
        if (c4cVar.m instanceof SpannableStringBuilder) {
            wlaVar.setTextSize(1, 13.0f);
            wlaVar.setTranslationY(gl.L(2.0f));
            wlaVar.setTypeface(gl.n1("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        ghb ghbVar = new ghb(wjbVar, context, true);
        zkb.h(bkb.c6, wjbVar, ghbVar);
        Drawable mutate = context.getDrawable(2131232108).mutate();
        zkb.x(ghbVar, mutate, bkb.K6, wjbVar, PorterDuff.Mode.MULTIPLY);
        ghbVar.setImage(mutate);
        ghbVar.setImageClickListener(new kb1(this, context, ghbVar));
        return ghbVar;
    }
}
