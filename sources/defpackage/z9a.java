package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class z9a extends b6c {
    static {
        b6c.h(new b6c());
    }

    public static c6c i(int i, int i2, int i3, int i4, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        c6c K = c6c.K(z9a.class);
        K.d = i;
        K.k = i4;
        K.m = charSequence;
        K.n = charSequence2;
        K.o = charSequence3;
        K.C = (i3 << 32) | (i2 & 4294967295L);
        return K;
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        boolean z2;
        int i;
        float f;
        long j = c6cVar.C;
        int i2 = (int) j;
        int i3 = (int) (j >>> 32);
        aaa aaaVar = (aaa) view;
        int i4 = c6cVar.k;
        CharSequence charSequence = c6cVar.m;
        CharSequence charSequence2 = c6cVar.n;
        CharSequence charSequence3 = c6cVar.o;
        TextView textView = aaaVar.e;
        TextView textView2 = aaaVar.f;
        int i5 = 0;
        if (i2 == 0 && i3 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        aaaVar.n = z2;
        FrameLayout frameLayout = aaaVar.c;
        if (i4 != 0) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        float f2 = 0.0f;
        if (i4 == 0) {
            f = gm.L(2.0f);
        } else {
            f = 0.0f;
        }
        textView.setTranslationX(f);
        if (i4 == 0) {
            f2 = gm.L(2.0f);
        }
        textView2.setTranslationX(f2);
        aaaVar.b.b(i2, i3);
        aaaVar.d.setImageResource(i4);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        aaaVar.r = !isEmpty;
        if (isEmpty) {
            i5 = 8;
        }
        textView2.setVisibility(i5);
        textView2.setText(charSequence2);
        aaaVar.setValue(charSequence3);
        aaaVar.updateColors();
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new aaa(context, ylbVar);
    }
}
