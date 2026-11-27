package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.Wallet.c;
public final class etc extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        float f;
        float f2;
        ftc ftcVar = (ftc) view;
        String charSequence = b8cVar.m.toString();
        long j = b8cVar.C;
        int i = b8cVar.A;
        boolean z2 = b8cVar.r;
        TextView textView = ftcVar.c;
        TextView textView2 = ftcVar.b;
        textView2.setText(atc.Z(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j < 0) {
            spannableStringBuilder.append((CharSequence) ob6.M0(2131748533, null));
            spannableStringBuilder.setSpan(new ya6(hl.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) c.w(j, false));
        }
        if (i > 0) {
            spannableStringBuilder = new SpannableStringBuilder(ob6.V(null, null, 2131742681, spannableStringBuilder, ob6.Q(i)));
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
        ImageView imageView = ftcVar.d;
        if (z2) {
            f3 = 0.5f;
        }
        imageView.setAlpha(f3);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new ftc(context, vnbVar);
    }
}
