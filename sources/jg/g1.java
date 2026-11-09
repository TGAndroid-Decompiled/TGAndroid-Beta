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
import org.telegram.messenger.id;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.gz;
public final class g1 extends LinearLayout implements b6 {
    public ShapeDrawable f16730a;
    public final g6 f16731b;
    public final l9 f16732c;
    public final w8 d;
    public final TextView f16733e;
    public final TextView f16734f;

    public g1(Context context, g6 g6Var, boolean z9) {
        super(context);
        o6 M;
        this.d = new w8((g6) null);
        this.f16731b = g6Var;
        setOrientation(0);
        l9 l9Var = new l9(context);
        this.f16732c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(l9Var, ha.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ha.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.f16733e = textView;
        textView.setTextSize(1, 15.0f);
        int i7 = l6.G6;
        s6.U(textView, i7, g6Var);
        linearLayout.addView(textView, ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f16734f = textView2;
        textView2.setTextSize(1, 13.0f);
        if (z9) {
            M = s6.K(0.5f, i7);
        } else {
            M = s6.M(l6.f28275z6);
        }
        s6.V(textView2, M, g6Var);
        linearLayout.addView(textView2, ha.o(-1, -2));
    }

    public final void a(int i7, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f16734f;
        TextView textView2 = this.f16733e;
        l9 l9Var = this.f16732c;
        if (i7 == 0) {
            ShapeDrawable d02 = l6.d0(org.telegram.messenger.g0.L(28.0f), l6.w0(l6.Ci, this.f16731b));
            this.f16730a = d02;
            xp xpVar = new xp(d02, getContext().getResources().getDrawable(2131231830).mutate());
            xpVar.f40451s = org.telegram.messenger.g0.L(-0.66f);
            xpVar.f40452w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            xpVar.f40447e = L;
            xpVar.f40448f = L2;
            l9Var.setImageDrawable(xpVar);
            textView2.setText(id.a0(null, null, 2131749344, str));
            textView.setText(id.M0(2131749345, null));
            return;
        }
        w8 w8Var = this.d;
        w8Var.q(chat);
        l9Var.e(chat, w8Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.a0(null, null, 2131749342, str + "@" + t3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        gz gzVar = new gz(8);
        gzVar.f46100f = l6.x0(null, l6.zk, false);
        gzVar.f46101n = false;
        spannableStringBuilder.setSpan(gzVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(id.M0(2131749343, null));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f16730a;
            if (shapeDrawable != null) {
                l6.C1(l6.w0(l6.Ci, this.f16731b), shapeDrawable);
                l9 l9Var = this.f16732c;
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
