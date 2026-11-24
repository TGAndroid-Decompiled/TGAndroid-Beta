package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class z7a extends b4c {
    static {
        b4c.h(new b4c());
    }

    public static c4c i(int i, int i2, int i3, int i4, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        c4c K = c4c.K(z7a.class);
        K.d = i;
        K.k = i4;
        K.m = charSequence;
        K.n = charSequence2;
        K.o = charSequence3;
        K.C = (i3 << 32) | (i2 & 4294967295L);
        return K;
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        boolean z2;
        int i;
        float f;
        long j = c4cVar.C;
        int i2 = (int) j;
        int i3 = (int) (j >>> 32);
        a8a a8aVar = (a8a) view;
        int i4 = c4cVar.k;
        CharSequence charSequence = c4cVar.m;
        CharSequence charSequence2 = c4cVar.n;
        CharSequence charSequence3 = c4cVar.o;
        TextView textView = a8aVar.e;
        TextView textView2 = a8aVar.f;
        int i5 = 0;
        if (i2 == 0 && i3 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        a8aVar.n = z2;
        FrameLayout frameLayout = a8aVar.c;
        if (i4 != 0) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        float f2 = 0.0f;
        if (i4 == 0) {
            f = gl.L(2.0f);
        } else {
            f = 0.0f;
        }
        textView.setTranslationX(f);
        if (i4 == 0) {
            f2 = gl.L(2.0f);
        }
        textView2.setTranslationX(f2);
        a8aVar.b.b(i2, i3);
        a8aVar.d.setImageResource(i4);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        a8aVar.r = !isEmpty;
        if (isEmpty) {
            i5 = 8;
        }
        textView2.setVisibility(i5);
        textView2.setText(charSequence2);
        a8aVar.setValue(charSequence3);
        a8aVar.updateColors();
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new a8a(context, wjbVar);
    }
}
