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
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.c10;
import w7.y5;
public final class i1 extends LinearLayout {
    public final e6 f9782a;
    public final w9 f9783b;
    public final h9 f9784c;
    public final TextView d;
    public final TextView e;

    public i1(Context context, e6 e6Var, boolean z10) {
        super(context);
        int v02;
        this.f9784c = new h9((e6) null);
        this.f9782a = e6Var;
        setOrientation(0);
        w9 w9Var = new w9(context);
        this.f9783b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(w9Var, y5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, y5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = i6.G6;
        textView.setTextColor(i6.v0(i10, e6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, y5.n(-1, -2), context);
        this.e = h;
        h.setTextSize(1, 13.0f);
        if (z10) {
            v02 = i6.l1(0.5f, i6.v0(i10, e6Var));
        } else {
            v02 = i6.v0(i6.f19461z6, e6Var);
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
        w9 w9Var = this.f9783b;
        if (i10 == 0) {
            rq rqVar = new rq(i6.b0(AndroidUtilities.dp(28.0f), i6.v0(i6.Oh, this.f9782a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            rqVar.f28068s = AndroidUtilities.dp(-0.66f);
            rqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            rqVar.e = dp;
            rqVar.f28065f = dp2;
            w9Var.setImageDrawable(rqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        h9 h9Var = this.f9784c;
        h9Var.q(chat);
        w9Var.e(chat, h9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder h = v7.k0.h(str, "@");
        h.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, h.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        c10 c10Var = new c10(8);
        c10Var.f32481f = i6.w0(null, i6.Lj, false);
        spannableStringBuilder.setSpan(c10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
