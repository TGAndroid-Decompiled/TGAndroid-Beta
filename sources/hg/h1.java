package hg;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.wq;
import org.telegram.ui.o00;
import w7.z5;
public final class h1 extends LinearLayout implements b6 {
    public ShapeDrawable f11932a;
    public final g6 f11933b;
    public final u9 f11934c;
    public final f9 d;
    public final TextView e;
    public final TextView f11935f;

    public h1(Context context, g6 g6Var, boolean z10) {
        super(context);
        n6 O;
        this.d = new f9((g6) null);
        this.f11933b = g6Var;
        setOrientation(0);
        u9 u9Var = new u9(context);
        this.f11934c = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(u9Var, z5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, z5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = k6.G6;
        r6.W(textView, i10, g6Var);
        linearLayout.addView(textView, z5.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.f11935f = textView2;
        textView2.setTextSize(1, 13.0f);
        if (z10) {
            O = r6.M(0.5f, i10);
        } else {
            O = r6.O(k6.f21589z6);
        }
        r6.X(textView2, O, g6Var);
        linearLayout.addView(textView2, z5.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f11935f;
        TextView textView2 = this.e;
        u9 u9Var = this.f11934c;
        if (i10 == 0) {
            ShapeDrawable c02 = k6.c0(AndroidUtilities.dp(28.0f), k6.w0(k6.Oh, this.f11933b));
            this.f11932a = c02;
            wq wqVar = new wq(c02, getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            wqVar.f32328s = AndroidUtilities.dp(-0.66f);
            wqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            wqVar.e = dp;
            wqVar.f32325f = dp2;
            u9Var.setImageDrawable(wqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        f9 f9Var = this.d;
        f9Var.q(chat);
        u9Var.e(chat, f9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder i12 = si.o0.i(str, "@");
        i12.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, i12.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        o00 o00Var = new o00(8);
        o00Var.f40046f = k6.x0(null, k6.Lj, false);
        o00Var.f40047n = false;
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
            ShapeDrawable shapeDrawable = this.f11932a;
            if (shapeDrawable != null) {
                k6.z1(k6.w0(k6.Oh, this.f11933b), shapeDrawable);
                u9 u9Var = this.f11934c;
                if (u9Var != null) {
                    u9Var.invalidate();
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
