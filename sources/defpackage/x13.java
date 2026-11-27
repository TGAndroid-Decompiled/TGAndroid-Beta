package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
public final class x13 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        clb clbVar = (clb) view;
        clbVar.c(b8cVar.m, b8cVar.o, !b8cVar.j);
        tpa tpaVar = clbVar.a;
        if (b8cVar.m instanceof SpannableStringBuilder) {
            tpaVar.setTextSize(1, 13.0f);
            tpaVar.setTranslationY(hl.L(2.0f));
            tpaVar.setTypeface(hl.n1("fonts/rmono.ttf"));
        }
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        clb clbVar = new clb(vnbVar, context, true);
        yob.h(aob.d6, vnbVar, clbVar);
        Drawable mutate = context.getDrawable(2131232108).mutate();
        yob.x(clbVar, mutate, aob.L6, vnbVar, PorterDuff.Mode.MULTIPLY);
        clbVar.setImage(mutate);
        clbVar.setImageClickListener(new sb1(this, context, clbVar));
        return clbVar;
    }
}
