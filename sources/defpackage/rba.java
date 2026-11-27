package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class rba extends a8c {
    static {
        a8c.h(new a8c());
    }

    public static b8c i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        b8c K = b8c.K(rba.class);
        K.m = str;
        K.n = charSequence;
        K.o = str2;
        K.E = onClickListener;
        K.p = charSequence2;
        K.F = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        sba sbaVar = (sba) view;
        CharSequence charSequence = b8cVar.m;
        CharSequence charSequence2 = b8cVar.n;
        CharSequence charSequence3 = b8cVar.o;
        View.OnClickListener onClickListener = b8cVar.E;
        CharSequence charSequence4 = b8cVar.p;
        View.OnClickListener onClickListener2 = b8cVar.F;
        c51 c51Var = sbaVar.e;
        p66 p66Var = sbaVar.b;
        int i = 0;
        p66Var.setText(pv3.m(charSequence, p66Var.getPaint().getFontMetricsInt(), false, null, 0));
        p66 p66Var2 = sbaVar.c;
        p66Var2.setText(pv3.m(charSequence2, p66Var2.getPaint().getFontMetricsInt(), false, null, 0));
        c51 c51Var2 = sbaVar.d;
        if (TextUtils.isEmpty(charSequence3)) {
            i = 8;
        }
        c51Var2.setVisibility(i);
        c51Var2.setText(charSequence3);
        c51Var2.setOnClickListener(onClickListener);
        c51Var.setText(charSequence4);
        c51Var.setOnClickListener(onClickListener2);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new sba(context, vnbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
