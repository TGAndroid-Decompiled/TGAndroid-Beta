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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.d10;
import w7.y5;
public final class i1 extends LinearLayout {
    public final e6 f9794a;
    public final w9 f9795b;
    public final h9 f9796c;
    public final TextView d;
    public final TextView e;

    public i1(Context context, e6 e6Var, boolean z10) {
        super(context);
        int v02;
        this.f9796c = new h9((e6) null);
        this.f9794a = e6Var;
        setOrientation(0);
        w9 w9Var = new w9(context);
        this.f9795b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(w9Var, y5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, y5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = j6.G6;
        textView.setTextColor(j6.v0(i10, e6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, y5.n(-1, -2), context);
        this.e = h;
        h.setTextSize(1, 13.0f);
        if (z10) {
            v02 = j6.l1(0.5f, j6.v0(i10, e6Var));
        } else {
            v02 = j6.v0(j6.f19464z6, e6Var);
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
        w9 w9Var = this.f9795b;
        if (i10 == 0) {
            pq pqVar = new pq(j6.b0(AndroidUtilities.dp(28.0f), j6.v0(j6.Oh, this.f9794a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            pqVar.f27302s = AndroidUtilities.dp(-0.66f);
            pqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            pqVar.e = dp;
            pqVar.f27299f = dp2;
            w9Var.setImageDrawable(pqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        h9 h9Var = this.f9796c;
        h9Var.q(chat);
        w9Var.e(chat, h9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder j3 = t8.b.j(str, "@");
        j3.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, j3.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        d10 d10Var = new d10(8);
        d10Var.f32835f = j6.w0(null, j6.Lj, false);
        spannableStringBuilder.setSpan(d10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
