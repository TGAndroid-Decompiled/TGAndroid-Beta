package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
public final class axa extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    public static c6c i(int i, int i2, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String e;
        c6c K = c6c.K(axa.class);
        K.d = i;
        K.A = i2;
        long j = tL_starsTopupOption.stars;
        K.C = j;
        K.m = jb6.H(' ', "StarsCount", (int) j);
        if (tL_starsTopupOption.loadingStorePrice) {
            e = null;
        } else {
            e = cj0.h().e(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.n = e;
        K.H = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        float f;
        bxa bxaVar = (bxa) view;
        int i = c6cVar.A;
        CharSequence charSequence = c6cVar.m;
        CharSequence charSequence2 = c6cVar.n;
        io ioVar = bxaVar.e;
        TextView textView = bxaVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        bxaVar.n = i;
        if (!equals) {
            bxaVar.r.e(true, i);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (bxaVar.f == null) {
                SpannableString spannableString = new SpannableString("x");
                bxaVar.f = spannableString;
                spannableString.setSpan(new ta6(gm.L(55.0f), ioVar), 0, bxaVar.f.length(), 33);
            }
            charSequence2 = bxaVar.f;
        }
        ioVar.setText(charSequence2);
        if (jb6.a0) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f * (i - 1) * gm.L(2.66f)).setDuration(320L).setInterpolator(d53.h).start();
        } else {
            textView.setTranslationX(f * (i - 1) * gm.L(2.66f));
        }
        bxaVar.h = z;
        bxaVar.invalidate();
    }

    @Override
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        if (c6cVar.A == c6cVar2.A && c6cVar.d == c6cVar2.d && TextUtils.equals(c6cVar.n, c6cVar2.n)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new bxa(context, ylbVar);
    }

    @Override
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        if (c6cVar.d == c6cVar2.d) {
            return true;
        }
        return false;
    }
}
