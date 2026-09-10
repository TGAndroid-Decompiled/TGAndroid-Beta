package fg;

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
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.f10;
import w7.a6;
public final class j1 extends LinearLayout {
    public final f6 f8083a;
    public final w9 f8084b;
    public final g9 f8085c;
    public final TextView d;
    public final TextView e;

    public j1(Context context, f6 f6Var, boolean z10) {
        super(context);
        int v02;
        this.f8085c = new g9((f6) null);
        this.f8083a = f6Var;
        setOrientation(0);
        w9 w9Var = new w9(context);
        this.f8084b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(w9Var, a6.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, a6.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = j6.G6;
        textView.setTextColor(j6.v0(i10, f6Var));
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, a6.n(-1, -2), context);
        this.e = g10;
        g10.setTextSize(1, 13.0f);
        if (z10) {
            v02 = j6.l1(0.5f, j6.v0(i10, f6Var));
        } else {
            v02 = j6.v0(j6.f18325z6, f6Var);
        }
        g10.setTextColor(v02);
        linearLayout.addView(g10, a6.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.e;
        TextView textView2 = this.d;
        w9 w9Var = this.f8084b;
        if (i10 == 0) {
            vq vqVar = new vq(j6.b0(AndroidUtilities.dp(28.0f), j6.v0(j6.Oh, this.f8083a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            vqVar.f28579s = AndroidUtilities.dp(-0.66f);
            vqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            vqVar.e = dp;
            vqVar.f28576f = dp2;
            w9Var.setImageDrawable(vqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        g9 g9Var = this.f8085c;
        g9Var.q(chat);
        w9Var.e(chat, g9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder g10 = w.f.g(str, "@");
        g10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, g10.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        f10 f10Var = new f10(8);
        f10Var.f32667f = j6.w0(null, j6.Lj, false);
        spannableStringBuilder.setSpan(f10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
