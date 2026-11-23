package jg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.hz;
public final class f1 extends LinearLayout implements c6 {
    public ShapeDrawable f17549a;
    public final i6 f17550b;
    public final p9 f17551c;
    public final a9 d;
    public final TextView f17552e;
    public final TextView f17553f;

    public f1(Context context, i6 i6Var, boolean z10) {
        super(context);
        q6 M;
        this.d = new a9((i6) null);
        this.f17550b = i6Var;
        setOrientation(0);
        p9 p9Var = new p9(context);
        this.f17551c = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(p9Var, na.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, na.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.f17552e = textView;
        textView.setTextSize(1, 15.0f);
        int i7 = n6.G6;
        u6.U(textView, i7, i6Var);
        linearLayout.addView(textView, na.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f17553f = textView2;
        textView2.setTextSize(1, 13.0f);
        if (z10) {
            M = u6.K(0.5f, i7);
        } else {
            M = u6.M(n6.f29862z6);
        }
        u6.V(textView2, M, i6Var);
        linearLayout.addView(textView2, na.o(-1, -2));
    }

    public final void a(int i7, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f17553f;
        TextView textView2 = this.f17552e;
        p9 p9Var = this.f17551c;
        if (i7 == 0) {
            ShapeDrawable d02 = n6.d0(org.telegram.messenger.g0.L(28.0f), n6.w0(n6.Fi, this.f17550b));
            this.f17549a = d02;
            lq lqVar = new lq(d02, getContext().getResources().getDrawable(2131231834).mutate());
            lqVar.f37202s = org.telegram.messenger.g0.L(-0.66f);
            lqVar.f37203w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            lqVar.f37198e = L;
            lqVar.f37199f = L2;
            p9Var.setImageDrawable(lqVar);
            textView2.setText(gd.a0(null, null, 2131749151, str));
            textView.setText(gd.N0(2131749152, null));
            return;
        }
        a9 a9Var = this.d;
        a9Var.q(chat);
        p9Var.f(chat, a9Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.a0(null, null, 2131749149, str + "@" + v3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        hz hzVar = new hz(8);
        hzVar.f48668f = n6.x0(null, n6.Ck, false);
        hzVar.f48669n = false;
        spannableStringBuilder.setSpan(hzVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(gd.N0(2131749150, null));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f17549a;
            if (shapeDrawable != null) {
                n6.C1(n6.w0(n6.Fi, this.f17550b), shapeDrawable);
                p9 p9Var = this.f17551c;
                if (p9Var != null) {
                    p9Var.invalidate();
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
