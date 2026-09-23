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
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.a10;
import w7.x5;
public final class i1 extends LinearLayout {
    public final d6 f9777a;
    public final w9 f9778b;
    public final h9 f9779c;
    public final TextView d;
    public final TextView e;

    public i1(Context context, d6 d6Var, boolean z10) {
        super(context);
        int v02;
        this.f9779c = new h9((d6) null);
        this.f9777a = d6Var;
        setOrientation(0);
        w9 w9Var = new w9(context);
        this.f9778b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(w9Var, x5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, x5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = h6.G6;
        textView.setTextColor(h6.v0(i10, d6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.n(-1, -2), context);
        this.e = h;
        h.setTextSize(1, 13.0f);
        if (z10) {
            v02 = h6.l1(0.5f, h6.v0(i10, d6Var));
        } else {
            v02 = h6.v0(h6.f19189z6, d6Var);
        }
        h.setTextColor(v02);
        linearLayout.addView(h, x5.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.e;
        TextView textView2 = this.d;
        w9 w9Var = this.f9778b;
        if (i10 == 0) {
            qq qqVar = new qq(h6.b0(AndroidUtilities.dp(28.0f), h6.v0(h6.Oh, this.f9777a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            qqVar.f27430s = AndroidUtilities.dp(-0.66f);
            qqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            qqVar.e = dp;
            qqVar.f27427f = dp2;
            w9Var.setImageDrawable(qqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        h9 h9Var = this.f9779c;
        h9Var.q(chat);
        w9Var.e(chat, h9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder h = w.c.h(str, "@");
        h.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, h.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        a10 a10Var = new a10(8);
        a10Var.f31635f = h6.w0(null, h6.Lj, false);
        spannableStringBuilder.setSpan(a10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
