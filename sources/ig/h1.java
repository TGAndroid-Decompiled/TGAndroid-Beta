package ig;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.y9;
import org.telegram.ui.o00;
public final class h1 extends LinearLayout implements p6 {
    public ShapeDrawable f14066a;
    public final u6 f14067b;
    public final y9 f14068c;
    public final j9 d;
    public final TextView e;
    public final TextView f14069f;

    public h1(Context context, u6 u6Var, boolean z10) {
        super(context);
        b7 N;
        this.d = new j9((u6) null);
        this.f14067b = u6Var;
        setOrientation(0);
        y9 y9Var = new y9(context);
        this.f14068c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(y9Var, kb1.x(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, kb1.x(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = y6.G6;
        f7.V(textView, i10, u6Var);
        linearLayout.addView(textView, kb1.r(-1, -2));
        TextView textView2 = new TextView(context);
        this.f14069f = textView2;
        textView2.setTextSize(1, 13.0f);
        if (z10) {
            N = f7.L(0.5f, i10);
        } else {
            N = f7.N(y6.f23768z6);
        }
        f7.W(textView2, N, u6Var);
        linearLayout.addView(textView2, kb1.r(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f14069f;
        TextView textView2 = this.e;
        y9 y9Var = this.f14068c;
        if (i10 == 0) {
            ShapeDrawable c02 = y6.c0(AndroidUtilities.dp(28.0f), y6.w0(y6.Oh, this.f14067b));
            this.f14066a = c02;
            ar arVar = new ar(c02, getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            arVar.f26645s = AndroidUtilities.dp(-0.66f);
            arVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            arVar.e = dp;
            arVar.f26642f = dp2;
            y9Var.setImageDrawable(arVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        j9 j9Var = this.d;
        j9Var.q(chat);
        y9Var.f(chat, j9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder l4 = b10.l(str, "@");
        l4.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, l4.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        o00 o00Var = new o00(8);
        o00Var.f41942f = y6.x0(null, y6.Lj, false);
        o00Var.f41943n = false;
        spannableStringBuilder.setSpan(o00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f14066a;
            if (shapeDrawable != null) {
                y6.z1(y6.w0(y6.Oh, this.f14067b), shapeDrawable);
                y9 y9Var = this.f14068c;
                if (y9Var != null) {
                    y9Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
