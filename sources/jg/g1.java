package jg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.ez;
public final class g1 extends LinearLayout implements a6 {
    public ShapeDrawable f16727a;
    public final f6 f16728b;
    public final l9 f16729c;
    public final w8 d;
    public final TextView f16730e;
    public final TextView f16731f;

    public g1(Context context, f6 f6Var, boolean z9) {
        super(context);
        n6 N;
        this.d = new w8((f6) null);
        this.f16728b = f6Var;
        setOrientation(0);
        l9 l9Var = new l9(context);
        this.f16729c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(l9Var, ha.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ha.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.f16730e = textView;
        textView.setTextSize(1, 15.0f);
        int i7 = k6.G6;
        r6.V(textView, i7, f6Var);
        linearLayout.addView(textView, ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f16731f = textView2;
        textView2.setTextSize(1, 13.0f);
        if (z9) {
            N = r6.L(0.5f, i7);
        } else {
            N = r6.N(k6.f28258z6);
        }
        r6.W(textView2, N, f6Var);
        linearLayout.addView(textView2, ha.o(-1, -2));
    }

    public final void a(int i7, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f16731f;
        TextView textView2 = this.f16730e;
        l9 l9Var = this.f16729c;
        if (i7 == 0) {
            ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(28.0f), k6.w0(k6.Ci, this.f16728b));
            this.f16727a = d02;
            xp xpVar = new xp(d02, getContext().getResources().getDrawable(2131231830).mutate());
            xpVar.f40322s = org.telegram.messenger.g0.L(-0.66f);
            xpVar.f40323w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            xpVar.f40318e = L;
            xpVar.f40319f = L2;
            l9Var.setImageDrawable(xpVar);
            textView2.setText(hd.a0(null, null, 2131749343, str));
            textView.setText(hd.M0(2131749344, null));
            return;
        }
        w8 w8Var = this.d;
        w8Var.q(chat);
        l9Var.e(chat, w8Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.a0(null, null, 2131749341, str + "@" + t3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        ez ezVar = new ez(8);
        ezVar.f45443f = k6.x0(null, k6.zk, false);
        ezVar.f45444n = false;
        spannableStringBuilder.setSpan(ezVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(hd.M0(2131749342, null));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f16727a;
            if (shapeDrawable != null) {
                k6.C1(k6.w0(k6.Ci, this.f16728b), shapeDrawable);
                l9 l9Var = this.f16729c;
                if (l9Var != null) {
                    l9Var.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
