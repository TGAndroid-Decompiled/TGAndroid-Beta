package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class d7c extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        float f;
        e7c e7cVar = (e7c) view;
        int i = c4cVar.k;
        CharSequence charSequence = c4cVar.m;
        CharSequence charSequence2 = c4cVar.n;
        boolean z2 = c4cVar.r;
        boolean z3 = c4cVar.s;
        int i2 = c4cVar.A;
        TextView textView = e7cVar.e;
        e7cVar.h = z2;
        e7cVar.n = z3;
        e7cVar.b.setImageResource(i);
        ImageView imageView = e7cVar.f;
        int i3 = 8;
        if (i2 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i2);
        } else {
            imageView.setVisibility(8);
        }
        e7cVar.d.setText(charSequence);
        textView.setText(charSequence2);
        if (!TextUtils.isEmpty(charSequence2)) {
            i3 = 0;
        }
        textView.setVisibility(i3);
        if (TextUtils.isEmpty(charSequence2)) {
            f = 15.0f;
        } else {
            f = 10.0f;
        }
        int L = gl.L(f);
        e7cVar.c.setPadding(0, L, 0, L);
        e7cVar.updateColors();
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new e7c(context, wjbVar);
    }
}
