package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class dbc extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        float f;
        ebc ebcVar = (ebc) view;
        int i = b8cVar.k;
        CharSequence charSequence = b8cVar.m;
        CharSequence charSequence2 = b8cVar.n;
        boolean z2 = b8cVar.r;
        boolean z3 = b8cVar.s;
        int i2 = b8cVar.A;
        TextView textView = ebcVar.e;
        ebcVar.h = z2;
        ebcVar.n = z3;
        ebcVar.b.setImageResource(i);
        ImageView imageView = ebcVar.f;
        int i3 = 8;
        if (i2 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i2);
        } else {
            imageView.setVisibility(8);
        }
        ebcVar.d.setText(charSequence);
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
        int L = hl.L(f);
        ebcVar.c.setPadding(0, L, 0, L);
        ebcVar.updateColors();
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new ebc(context, vnbVar);
    }
}
