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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.hz;
public final class g1 extends LinearLayout implements c6 {
    public ShapeDrawable f16730a;
    public final h6 f16731b;
    public final k9 f16732c;
    public final v8 d;
    public final TextView f16733e;
    public final TextView f16734f;

    public g1(Context context, h6 h6Var, boolean z9) {
        super(context);
        p6 M;
        this.d = new v8((h6) null);
        this.f16731b = h6Var;
        setOrientation(0);
        k9 k9Var = new k9(context);
        this.f16732c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(k9Var, ha.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ha.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.f16733e = textView;
        textView.setTextSize(1, 15.0f);
        int i7 = m6.G6;
        t6.U(textView, i7, h6Var);
        linearLayout.addView(textView, ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f16734f = textView2;
        textView2.setTextSize(1, 13.0f);
        if (z9) {
            M = t6.K(0.5f, i7);
        } else {
            M = t6.M(m6.f28300z6);
        }
        t6.V(textView2, M, h6Var);
        linearLayout.addView(textView2, ha.o(-1, -2));
    }

    public final void a(int i7, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f16734f;
        TextView textView2 = this.f16733e;
        k9 k9Var = this.f16732c;
        if (i7 == 0) {
            ShapeDrawable d02 = m6.d0(org.telegram.messenger.g0.L(28.0f), m6.w0(m6.Ci, this.f16731b));
            this.f16730a = d02;
            xp xpVar = new xp(d02, getContext().getResources().getDrawable(2131231830).mutate());
            xpVar.f40381s = org.telegram.messenger.g0.L(-0.66f);
            xpVar.f40382w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            xpVar.f40377e = L;
            xpVar.f40378f = L2;
            k9Var.setImageDrawable(xpVar);
            textView2.setText(id.a0(null, null, 2131749344, str));
            textView.setText(id.M0(2131749345, null));
            return;
        }
        v8 v8Var = this.d;
        v8Var.q(chat);
        k9Var.e(chat, v8Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.a0(null, null, 2131749342, str + "@" + t3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        hz hzVar = new hz(8);
        hzVar.f46455f = m6.x0(null, m6.zk, false);
        hzVar.f46456n = false;
        spannableStringBuilder.setSpan(hzVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
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
                m6.C1(m6.w0(m6.Ci, this.f16731b), shapeDrawable);
                k9 k9Var = this.f16732c;
                if (k9Var != null) {
                    k9Var.invalidate();
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
