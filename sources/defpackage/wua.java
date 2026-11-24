package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
public final class wua extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    public static c4c i(int i, int i2, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String e;
        c4c K = c4c.K(wua.class);
        K.d = i;
        K.A = i2;
        long j = tL_starsTopupOption.stars;
        K.C = j;
        K.m = k96.H(' ', "StarsCount", (int) j);
        if (tL_starsTopupOption.loadingStorePrice) {
            e = null;
        } else {
            e = ci0.h().e(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.n = e;
        K.H = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        float f;
        xua xuaVar = (xua) view;
        int i = c4cVar.A;
        CharSequence charSequence = c4cVar.m;
        CharSequence charSequence2 = c4cVar.n;
        hn hnVar = xuaVar.e;
        TextView textView = xuaVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        xuaVar.n = i;
        if (!equals) {
            xuaVar.r.e(true, i);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (xuaVar.f == null) {
                SpannableString spannableString = new SpannableString("x");
                xuaVar.f = spannableString;
                spannableString.setSpan(new u86(gl.L(55.0f), hnVar), 0, xuaVar.f.length(), 33);
            }
            charSequence2 = xuaVar.f;
        }
        hnVar.setText(charSequence2);
        if (k96.a0) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f * (i - 1) * gl.L(2.66f)).setDuration(320L).setInterpolator(s33.h).start();
        } else {
            textView.setTranslationX(f * (i - 1) * gl.L(2.66f));
        }
        xuaVar.h = z;
        xuaVar.invalidate();
    }

    @Override
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.A == c4cVar2.A && c4cVar.d == c4cVar2.d && TextUtils.equals(c4cVar.n, c4cVar2.n)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new xua(context, wjbVar);
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        if (c4cVar.d == c4cVar2.d) {
            return true;
        }
        return false;
    }
}
