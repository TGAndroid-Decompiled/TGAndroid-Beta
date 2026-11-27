package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class pba extends a8c {
    static {
        a8c.h(new a8c());
    }

    public static b8c i(int i, int i2, int i3, int i4, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        b8c K = b8c.K(pba.class);
        K.d = i;
        K.k = i4;
        K.m = charSequence;
        K.n = charSequence2;
        K.o = charSequence3;
        K.C = (i3 << 32) | (i2 & 4294967295L);
        return K;
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        boolean z2;
        int i;
        float f;
        long j = b8cVar.C;
        int i2 = (int) j;
        int i3 = (int) (j >>> 32);
        qba qbaVar = (qba) view;
        int i4 = b8cVar.k;
        CharSequence charSequence = b8cVar.m;
        CharSequence charSequence2 = b8cVar.n;
        CharSequence charSequence3 = b8cVar.o;
        TextView textView = qbaVar.e;
        TextView textView2 = qbaVar.f;
        int i5 = 0;
        if (i2 == 0 && i3 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        qbaVar.n = z2;
        FrameLayout frameLayout = qbaVar.c;
        if (i4 != 0) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        float f2 = 0.0f;
        if (i4 == 0) {
            f = hl.L(2.0f);
        } else {
            f = 0.0f;
        }
        textView.setTranslationX(f);
        if (i4 == 0) {
            f2 = hl.L(2.0f);
        }
        textView2.setTranslationX(f2);
        qbaVar.b.b(i2, i3);
        qbaVar.d.setImageResource(i4);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        qbaVar.r = !isEmpty;
        if (isEmpty) {
            i5 = 8;
        }
        textView2.setVisibility(i5);
        textView2.setText(charSequence2);
        qbaVar.setValue(charSequence3);
        qbaVar.updateColors();
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new qba(context, vnbVar);
    }
}
