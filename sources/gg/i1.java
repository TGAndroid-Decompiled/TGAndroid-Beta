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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.d10;
import w7.z5;
public final class i1 extends LinearLayout {
    public final d6 f10644a;
    public final w9 f10645b;
    public final h9 f10646c;
    public final TextView d;
    public final TextView f10647e;

    public i1(Context context, d6 d6Var, boolean z10) {
        super(context);
        int v02;
        this.f10646c = new h9((d6) null);
        this.f10644a = d6Var;
        setOrientation(0);
        w9 w9Var = new w9(context);
        this.f10645b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(w9Var, z5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, z5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = i6.G6;
        textView.setTextColor(i6.v0(i10, d6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, z5.n(-1, -2), context);
        this.f10647e = h;
        h.setTextSize(1, 13.0f);
        if (z10) {
            v02 = i6.l1(0.5f, i6.v0(i10, d6Var));
        } else {
            v02 = i6.v0(i6.f21228z6, d6Var);
        }
        h.setTextColor(v02);
        linearLayout.addView(h, z5.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f10647e;
        TextView textView2 = this.d;
        w9 w9Var = this.f10645b;
        if (i10 == 0) {
            sq sqVar = new sq(i6.b0(AndroidUtilities.dp(28.0f), i6.v0(i6.Oh, this.f10644a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            sqVar.f30862s = AndroidUtilities.dp(-0.66f);
            sqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            sqVar.f30858e = dp;
            sqVar.f30859f = dp2;
            w9Var.setImageDrawable(sqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        h9 h9Var = this.f10646c;
        h9Var.q(chat);
        w9Var.e(chat, h9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder j3 = sa.e.j(str, "@");
        j3.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, j3.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        d10 d10Var = new d10(8);
        d10Var.f35609f = i6.w0(null, i6.Lj, false);
        spannableStringBuilder.setSpan(d10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
