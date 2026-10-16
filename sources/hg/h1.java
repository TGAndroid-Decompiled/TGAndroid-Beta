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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import org.telegram.ui.i10;
import w7.z5;
public final class h1 extends LinearLayout {
    public final c6 f10601a;
    public final z9 f10602b;
    public final k9 f10603c;
    public final TextView d;
    public final TextView e;

    public h1(Context context, c6 c6Var, boolean z10) {
        super(context);
        int w02;
        this.f10603c = new k9((c6) null);
        this.f10601a = c6Var;
        setOrientation(0);
        z9 z9Var = new z9(context);
        this.f10602b = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(z9Var, z5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, z5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = g6.G6;
        textView.setTextColor(g6.w0(i10, c6Var));
        TextView i11 = k3.i(linearLayout, textView, z5.n(-1, -2), context);
        this.e = i11;
        i11.setTextSize(1, 13.0f);
        if (z10) {
            w02 = g6.m1(0.5f, g6.w0(i10, c6Var));
        } else {
            w02 = g6.w0(g6.f20005z6, c6Var);
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
        z9 z9Var = this.f10602b;
        if (i10 == 0) {
            cr crVar = new cr(g6.c0(AndroidUtilities.dp(28.0f), g6.w0(g6.Oh, this.f10601a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            crVar.f23882s = AndroidUtilities.dp(-0.66f);
            crVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            crVar.e = dp;
            crVar.f23879f = dp2;
            z9Var.setImageDrawable(crVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        k9 k9Var = this.f10603c;
        k9Var.q(chat);
        z9Var.e(chat, k9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder i12 = t8.b.i(str, "@");
        i12.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, i12.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        i10 i10Var = new i10(8);
        i10Var.f36693f = g6.x0(null, g6.Lj, false);
        spannableStringBuilder.setSpan(i10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
