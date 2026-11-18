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
import org.telegram.messenger.gd;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.q9;
import org.telegram.ui.iz;
public final class f1 extends LinearLayout implements c6 {
    public ShapeDrawable f17456a;
    public final i6 f17457b;
    public final q9 f17458c;
    public final b9 d;
    public final TextView f17459e;
    public final TextView f17460f;

    public f1(Context context, i6 i6Var, boolean z10) {
        super(context);
        q6 M;
        this.d = new b9((i6) null);
        this.f17457b = i6Var;
        setOrientation(0);
        q9 q9Var = new q9(context);
        this.f17458c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(q9Var, ma.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ma.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.f17459e = textView;
        textView.setTextSize(1, 15.0f);
        int i7 = n6.G6;
        u6.U(textView, i7, i6Var);
        linearLayout.addView(textView, ma.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f17460f = textView2;
        textView2.setTextSize(1, 13.0f);
        if (z10) {
            M = u6.K(0.5f, i7);
        } else {
            M = u6.M(n6.f29807z6);
        }
        u6.V(textView2, M, i6Var);
        linearLayout.addView(textView2, ma.o(-1, -2));
    }

    public final void a(int i7, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f17460f;
        TextView textView2 = this.f17459e;
        q9 q9Var = this.f17458c;
        if (i7 == 0) {
            ShapeDrawable d02 = n6.d0(org.telegram.messenger.g0.L(28.0f), n6.w0(n6.Fi, this.f17457b));
            this.f17456a = d02;
            mq mqVar = new mq(d02, getContext().getResources().getDrawable(2131231831).mutate());
            mqVar.f37614s = org.telegram.messenger.g0.L(-0.66f);
            mqVar.f37615w = 0;
            int L = org.telegram.messenger.g0.L(20.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            mqVar.f37610e = L;
            mqVar.f37611f = L2;
            q9Var.setImageDrawable(mqVar);
            textView2.setText(gd.a0(null, null, 2131749152, str));
            textView.setText(gd.M0(2131749153, null));
            return;
        }
        b9 b9Var = this.d;
        b9Var.q(chat);
        q9Var.f(chat, b9Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.a0(null, null, 2131749150, str + "@" + v3.K(chat, false)));
        spannableStringBuilder.append((CharSequence) "  d");
        iz izVar = new iz(8);
        izVar.f48821f = n6.x0(null, n6.Ck, false);
        izVar.f48822n = false;
        spannableStringBuilder.setSpan(izVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(gd.M0(2131749151, null));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.f17456a;
            if (shapeDrawable != null) {
                n6.C1(n6.w0(n6.Fi, this.f17457b), shapeDrawable);
                q9 q9Var = this.f17458c;
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
