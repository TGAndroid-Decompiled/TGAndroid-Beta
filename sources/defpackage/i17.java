package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class i17 extends LinearLayout implements vlb {
    public ShapeDrawable a;
    public final ylb b;
    public final bf0 c;
    public final pc0 d;
    public final TextView e;
    public final TextView f;

    public i17(ylb ylbVar, Context context, boolean z) {
        super(context);
        wmb M;
        this.d = new pc0((ylb) null);
        this.b = ylbVar;
        setOrientation(0);
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(28.0f));
        addView(bf0Var, qoe.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 15.0f);
        int i = cmb.F6;
        anb.X(textView, i, ylbVar);
        linearLayout.addView(textView, qoe.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        if (z) {
            M = anb.K(0.5f, i);
        } else {
            M = anb.M(cmb.y6);
        }
        anb.Y(textView2, M, ylbVar);
        linearLayout.addView(textView2, qoe.o(-1, -2));
    }

    public final void a(int i, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f;
        TextView textView2 = this.e;
        bf0 bf0Var = this.c;
        if (i == 0) {
            ShapeDrawable b0 = cmb.b0(gm.L(28.0f), cmb.v0(cmb.Ei, this.b));
            this.a = b0;
            sn2 sn2Var = new sn2(b0, getContext().getResources().getDrawable(2131231835).mutate());
            sn2Var.s = gm.L(-0.66f);
            sn2Var.w = 0;
            int L = gm.L(20.0f);
            int L2 = gm.L(20.0f);
            sn2Var.e = L;
            sn2Var.f = L2;
            bf0Var.setImageDrawable(sn2Var);
            textView2.setText(jb6.a0(null, null, 2131749101, str));
            textView.setText(jb6.M0(2131749102, null));
            return;
        }
        pc0 pc0Var = this.d;
        pc0Var.p(chat);
        bf0Var.f(chat, pc0Var);
        StringBuilder k = b10.k(str, "@");
        k.append(sd2.K(chat, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.a0(null, null, 2131749099, k.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        of4 of4Var = new of4(8);
        of4Var.f = cmb.w0(null, cmb.Bk, false);
        of4Var.n = false;
        spannableStringBuilder.setSpan(of4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(jb6.M0(2131749100, null));
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
                cmb.A1(cmb.v0(cmb.Ei, this.b), shapeDrawable);
                bf0 bf0Var = this.c;
                if (bf0Var != null) {
                    bf0Var.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
