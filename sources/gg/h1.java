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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import org.telegram.ui.d10;
import w7.x5;
public final class h1 extends LinearLayout {
    public final e6 f10649a;
    public final y9 f10650b;
    public final j9 f10651c;
    public final TextView d;
    public final TextView f10652e;

    public h1(Context context, e6 e6Var, boolean z10) {
        super(context);
        int w02;
        this.f10651c = new j9((e6) null);
        this.f10649a = e6Var;
        setOrientation(0);
        y9 y9Var = new y9(context);
        this.f10650b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(y9Var, x5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, x5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = i6.G6;
        textView.setTextColor(i6.w0(i10, e6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.n(-1, -2), context);
        this.f10652e = h;
        h.setTextSize(1, 13.0f);
        if (z10) {
            w02 = i6.m1(0.5f, i6.w0(i10, e6Var));
        } else {
            w02 = i6.w0(i6.f21199z6, e6Var);
        }
        h.setTextColor(w02);
        linearLayout.addView(h, x5.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f10652e;
        TextView textView2 = this.d;
        y9 y9Var = this.f10650b;
        if (i10 == 0) {
            fr frVar = new fr(i6.c0(AndroidUtilities.dp(28.0f), i6.w0(i6.Oh, this.f10649a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            frVar.f26470s = AndroidUtilities.dp(-0.66f);
            frVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            frVar.f26466e = dp;
            frVar.f26467f = dp2;
            y9Var.setImageDrawable(frVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        j9 j9Var = this.f10651c;
        j9Var.q(chat);
        y9Var.e(chat, j9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder j3 = sc.v.j(str, "@");
        j3.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, j3.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        d10 d10Var = new d10(8);
        d10Var.f36787f = i6.x0(null, i6.Lj, false);
        spannableStringBuilder.setSpan(d10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
