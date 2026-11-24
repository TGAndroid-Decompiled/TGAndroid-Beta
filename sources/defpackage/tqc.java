package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.Wallet.c;
public final class tqc extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        float f;
        float f2;
        uqc uqcVar = (uqc) view;
        String charSequence = c6cVar.m.toString();
        long j = c6cVar.C;
        int i = c6cVar.A;
        boolean z2 = c6cVar.r;
        TextView textView = uqcVar.c;
        TextView textView2 = uqcVar.b;
        textView2.setText(pqc.a0(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j < 0) {
            spannableStringBuilder.append((CharSequence) jb6.M0(2131748536, null));
            spannableStringBuilder.setSpan(new ta6(gm.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) c.w(j, false));
        }
        if (i > 0) {
            spannableStringBuilder = new SpannableStringBuilder(jb6.V(null, null, 2131742713, spannableStringBuilder, jb6.Q(i)));
        }
        textView.setText(spannableStringBuilder);
        float f3 = 1.0f;
        if (z2) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        textView2.setAlpha(f);
        if (z2) {
            f2 = 0.5f;
        } else {
            f2 = 1.0f;
        }
        textView.setAlpha(f2);
        ImageView imageView = uqcVar.d;
        if (z2) {
            f3 = 0.5f;
        }
        imageView.setAlpha(f3);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new uqc(context, ylbVar);
    }
}
