package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class e9c extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        float f;
        f9c f9cVar = (f9c) view;
        int i = c6cVar.k;
        CharSequence charSequence = c6cVar.m;
        CharSequence charSequence2 = c6cVar.n;
        boolean z2 = c6cVar.r;
        boolean z3 = c6cVar.s;
        int i2 = c6cVar.A;
        TextView textView = f9cVar.e;
        f9cVar.h = z2;
        f9cVar.n = z3;
        f9cVar.b.setImageResource(i);
        ImageView imageView = f9cVar.f;
        int i3 = 8;
        if (i2 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i2);
        } else {
            imageView.setVisibility(8);
        }
        f9cVar.d.setText(charSequence);
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
        int L = gm.L(f);
        f9cVar.c.setPadding(0, L, 0, L);
        f9cVar.updateColors();
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new f9c(context, ylbVar);
    }
}
