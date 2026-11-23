package jg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.q9;
import org.telegram.ui.iz;
public final class f1 extends LinearLayout implements b6 {
    public ShapeDrawable f17481a;
    public final h6 f17482b;
    public final q9 f17483c;
    public final b9 d;
    public final TextView f17484e;
    public final TextView f17485f;

    public f1(Context context, h6 h6Var, boolean z10) {
        super(context);
        p6 M;
        this.d = new b9((h6) null);
        this.f17482b = h6Var;
        setOrientation(0);
        q9 q9Var = new q9(context);
        this.f17483c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(q9Var, ma.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ma.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.f17484e = textView;
        textView.setTextSize(1, 15.0f);
        int i7 = m6.G6;
        t6.U(textView, i7, h6Var);
        linearLayout.addView(textView, ma.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f17485f = textView2;
        textView2.setTextSize(1, 13.0f);
        if (z10) {
            M = t6.K(0.5f, i7);
        } else {
            M = t6.M(m6.f29792z6);
        }
        t6.V(textView2, M, h6Var);
        linearLayout.addView(textView2, ma.o(-1, -2));
    }

    public final void a(int i7, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f17485f;
        TextView textView2 = this.f17484e;
        q9 q9Var = this.f17483c;
        if (i7 == 0) {
            ShapeDrawable d02 = m6.d0(org.telegram.messenger.g0.L(28.0f), m6.w0(m6.Fi, this.f17482b));
            this.f17481a = d02;
            oq oqVar = new oq(d02, getContext().getResources().getDrawable(2131231831).mutate());
            oqVar.f38337s = org.telegram.messenger.g0.L(-0.66f);
            oqVar.f38338w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            oqVar.f38333e = L;
            oqVar.f38334f = L2;
            q9Var.setImageDrawable(oqVar);
            textView2.setText(hd.a0(null, null, 2131749151, str));
            textView.setText(hd.N0(2131749152, null));
            return;
        }
        b9 b9Var = this.d;
        b9Var.q(chat);
        q9Var.f(chat, b9Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.a0(null, null, 2131749149, str + "@" + v3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        iz izVar = new iz(8);
        izVar.f48847f = m6.x0(null, m6.Ck, false);
        izVar.f48848n = false;
        spannableStringBuilder.setSpan(izVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(hd.N0(2131749150, null));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f17481a;
            if (shapeDrawable != null) {
                m6.C1(m6.w0(m6.Fi, this.f17482b), shapeDrawable);
                q9 q9Var = this.f17483c;
                if (q9Var != null) {
                    q9Var.invalidate();
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
