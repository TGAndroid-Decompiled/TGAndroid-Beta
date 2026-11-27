package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class p17 extends LinearLayout implements snb {
    public ShapeDrawable a;
    public final vnb b;
    public final de0 c;
    public final rb0 d;
    public final TextView e;
    public final TextView f;

    public p17(vnb vnbVar, Context context, boolean z) {
        super(context);
        uob M;
        this.d = new rb0((vnb) null);
        this.b = vnbVar;
        setOrientation(0);
        de0 de0Var = new de0(context);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(28.0f));
        addView(de0Var, tre.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 15.0f);
        int i = aob.G6;
        yob.X(textView, i, vnbVar);
        linearLayout.addView(textView, tre.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        if (z) {
            M = yob.K(0.5f, i);
        } else {
            M = yob.M(aob.z6);
        }
        yob.Y(textView2, M, vnbVar);
        linearLayout.addView(textView2, tre.o(-1, -2));
    }

    public final void a(int i, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f;
        TextView textView2 = this.e;
        de0 de0Var = this.c;
        if (i == 0) {
            ShapeDrawable b0 = aob.b0(hl.L(28.0f), aob.v0(aob.Fi, this.b));
            this.a = b0;
            zm2 zm2Var = new zm2(b0, getContext().getResources().getDrawable(2131231834).mutate());
            zm2Var.s = hl.L(-0.66f);
            zm2Var.w = 0;
            int L = hl.L(20.0f);
            int L2 = hl.L(20.0f);
            zm2Var.e = L;
            zm2Var.f = L2;
            de0Var.setImageDrawable(zm2Var);
            textView2.setText(ob6.a0(null, null, 2131749098, str));
            textView.setText(ob6.M0(2131749099, null));
            return;
        }
        rb0 rb0Var = this.d;
        rb0Var.p(chat);
        de0Var.f(chat, rb0Var);
        StringBuilder l = c00.l(str, "@");
        l.append(xc2.K(chat, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.a0(null, null, 2131749096, l.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        lf4 lf4Var = new lf4(8);
        lf4Var.f = aob.w0(null, aob.Ck, false);
        lf4Var.n = false;
        spannableStringBuilder.setSpan(lf4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(ob6.M0(2131749097, null));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.a;
            if (shapeDrawable != null) {
                aob.A1(aob.v0(aob.Fi, this.b), shapeDrawable);
                de0 de0Var = this.c;
                if (de0Var != null) {
                    de0Var.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
