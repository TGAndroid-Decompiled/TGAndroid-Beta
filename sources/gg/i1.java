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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.v9;
import org.telegram.ui.d10;
import w7.y5;
public final class i1 extends LinearLayout {
    public final f6 f9795a;
    public final v9 f9796b;
    public final g9 f9797c;
    public final TextView d;
    public final TextView e;

    public i1(Context context, f6 f6Var, boolean z10) {
        super(context);
        int v02;
        this.f9797c = new g9((f6) null);
        this.f9795a = f6Var;
        setOrientation(0);
        v9 v9Var = new v9(context);
        this.f9796b = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(v9Var, y5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, y5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = j6.G6;
        textView.setTextColor(j6.v0(i10, f6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, y5.n(-1, -2), context);
        this.e = h;
        h.setTextSize(1, 13.0f);
        if (z10) {
            v02 = j6.l1(0.5f, j6.v0(i10, f6Var));
        } else {
            v02 = j6.v0(j6.f19496z6, f6Var);
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
        v9 v9Var = this.f9796b;
        if (i10 == 0) {
            pq pqVar = new pq(j6.b0(AndroidUtilities.dp(28.0f), j6.v0(j6.Oh, this.f9795a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            pqVar.f27425s = AndroidUtilities.dp(-0.66f);
            pqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            pqVar.e = dp;
            pqVar.f27422f = dp2;
            v9Var.setImageDrawable(pqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        g9 g9Var = this.f9797c;
        g9Var.q(chat);
        v9Var.e(chat, g9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder h = v7.j0.h(str, "@");
        h.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, h.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        d10 d10Var = new d10(8);
        d10Var.f32905f = j6.w0(null, j6.Lj, false);
        spannableStringBuilder.setSpan(d10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
