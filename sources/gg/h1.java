package gg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.c10;
import w7.x5;
public final class h1 extends LinearLayout {
    public final d6 f10648a;
    public final y9 f10649b;
    public final j9 f10650c;
    public final TextView d;
    public final TextView f10651e;

    public h1(Context context, d6 d6Var, boolean z10) {
        super(context);
        int w02;
        this.f10650c = new j9((d6) null);
        this.f10648a = d6Var;
        setOrientation(0);
        y9 y9Var = new y9(context);
        this.f10649b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(y9Var, x5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, x5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = h6.G6;
        textView.setTextColor(h6.w0(i10, d6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.n(-1, -2), context);
        this.f10651e = h;
        h.setTextSize(1, 13.0f);
        if (z10) {
            w02 = h6.m1(0.5f, h6.w0(i10, d6Var));
        } else {
            w02 = h6.w0(h6.f21189z6, d6Var);
        }
        h.setTextColor(w02);
        linearLayout.addView(h, x5.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f10651e;
        TextView textView2 = this.d;
        y9 y9Var = this.f10649b;
        if (i10 == 0) {
            fr frVar = new fr(h6.c0(AndroidUtilities.dp(28.0f), h6.w0(h6.Oh, this.f10648a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            frVar.f26474s = AndroidUtilities.dp(-0.66f);
            frVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            frVar.f26470e = dp;
            frVar.f26471f = dp2;
            y9Var.setImageDrawable(frVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        j9 j9Var = this.f10650c;
        j9Var.q(chat);
        y9Var.e(chat, j9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder j3 = sc.v.j(str, "@");
        j3.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, j3.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        c10 c10Var = new c10(8);
        c10Var.f36505f = h6.x0(null, h6.Lj, false);
        spannableStringBuilder.setSpan(c10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
