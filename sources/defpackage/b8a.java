package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
public final class b8a extends b4c {
    static {
        b4c.h(new b4c());
    }

    public static c4c i(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        c4c K = c4c.K(b8a.class);
        K.m = str;
        K.n = charSequence;
        K.o = str2;
        K.E = onClickListener;
        K.p = charSequence2;
        K.F = onClickListener2;
        return K;
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        c8a c8aVar = (c8a) view;
        CharSequence charSequence = c4cVar.m;
        CharSequence charSequence2 = c4cVar.n;
        CharSequence charSequence3 = c4cVar.o;
        View.OnClickListener onClickListener = c4cVar.E;
        CharSequence charSequence4 = c4cVar.p;
        View.OnClickListener onClickListener2 = c4cVar.F;
        u41 u41Var = c8aVar.e;
        l46 l46Var = c8aVar.b;
        int i = 0;
        l46Var.setText(vu3.m(charSequence, l46Var.getPaint().getFontMetricsInt(), false, null, 0));
        l46 l46Var2 = c8aVar.c;
        l46Var2.setText(vu3.m(charSequence2, l46Var2.getPaint().getFontMetricsInt(), false, null, 0));
        u41 u41Var2 = c8aVar.d;
        if (TextUtils.isEmpty(charSequence3)) {
            i = 8;
        }
        u41Var2.setVisibility(i);
        u41Var2.setText(charSequence3);
        u41Var2.setOnClickListener(onClickListener);
        u41Var.setText(charSequence4);
        u41Var.setOnClickListener(onClickListener2);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new c8a(context, wjbVar);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
