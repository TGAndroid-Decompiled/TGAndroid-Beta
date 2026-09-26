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
import org.telegram.ui.z00;
import w7.y5;
public final class i1 extends LinearLayout {
    public final d6 f9776a;
    public final w9 f9777b;
    public final h9 f9778c;
    public final TextView d;
    public final TextView e;

    public i1(Context context, d6 d6Var, boolean z10) {
        super(context);
        int v02;
        this.f9778c = new h9((d6) null);
        this.f9776a = d6Var;
        setOrientation(0);
        w9 w9Var = new w9(context);
        this.f9777b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(w9Var, y5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, y5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = h6.G6;
        textView.setTextColor(h6.v0(i10, d6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, y5.n(-1, -2), context);
        this.e = h;
        h.setTextSize(1, 13.0f);
        if (z10) {
            v02 = h6.l1(0.5f, h6.v0(i10, d6Var));
        } else {
            v02 = h6.v0(h6.f19461z6, d6Var);
        }
        h.setTextColor(v02);
        linearLayout.addView(h, y5.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.e;
        TextView textView2 = this.d;
        w9 w9Var = this.f9777b;
        if (i10 == 0) {
            qq qqVar = new qq(h6.b0(AndroidUtilities.dp(28.0f), h6.v0(h6.Oh, this.f9776a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            qqVar.f27738s = AndroidUtilities.dp(-0.66f);
            qqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            qqVar.e = dp;
            qqVar.f27735f = dp2;
            w9Var.setImageDrawable(qqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        h9 h9Var = this.f9778c;
        h9Var.q(chat);
        w9Var.e(chat, h9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder h = v7.j.h(str, "@");
        h.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, h.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        z00 z00Var = new z00(8);
        z00Var.f40304f = h6.w0(null, h6.Lj, false);
        spannableStringBuilder.setSpan(z00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
