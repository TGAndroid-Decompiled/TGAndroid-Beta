package hg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zq;
import org.telegram.ui.l00;
import w7.z5;
public final class h1 extends LinearLayout {
    public final d6 f11905a;
    public final w9 f11906b;
    public final h9 f11907c;
    public final TextView d;
    public final TextView e;

    public h1(Context context, d6 d6Var, boolean z10) {
        super(context);
        int w02;
        this.f11907c = new h9((d6) null);
        this.f11905a = d6Var;
        setOrientation(0);
        w9 w9Var = new w9(context);
        this.f11906b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(w9Var, z5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, z5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = h6.G6;
        textView.setTextColor(h6.w0(i10, d6Var));
        TextView i11 = k3.i(linearLayout, textView, z5.n(-1, -2), context);
        this.e = i11;
        i11.setTextSize(1, 13.0f);
        if (z10) {
            w02 = h6.m1(0.5f, h6.w0(i10, d6Var));
        } else {
            w02 = h6.w0(h6.f21398z6, d6Var);
        }
        i11.setTextColor(w02);
        linearLayout.addView(i11, z5.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.e;
        TextView textView2 = this.d;
        w9 w9Var = this.f11906b;
        if (i10 == 0) {
            zq zqVar = new zq(h6.c0(AndroidUtilities.dp(28.0f), h6.w0(h6.Oh, this.f11905a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            zqVar.f33026s = AndroidUtilities.dp(-0.66f);
            zqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            zqVar.e = dp;
            zqVar.f33023f = dp2;
            w9Var.setImageDrawable(zqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        h9 h9Var = this.f11907c;
        h9Var.q(chat);
        w9Var.e(chat, h9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder i12 = r4.c.i(str, "@");
        i12.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, i12.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        l00 l00Var = new l00(8);
        l00Var.f38714f = h6.x0(null, h6.Lj, false);
        spannableStringBuilder.setSpan(l00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
