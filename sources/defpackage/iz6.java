package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class iz6 extends LinearLayout implements tjb {
    public ShapeDrawable a;
    public final wjb b;
    public final be0 c;
    public final pb0 d;
    public final TextView e;
    public final TextView f;

    public iz6(wjb wjbVar, Context context, boolean z) {
        super(context);
        vkb M;
        this.d = new pb0((wjb) null);
        this.b = wjbVar;
        setOrientation(0);
        be0 be0Var = new be0(context);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(28.0f));
        addView(be0Var, nme.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 15.0f);
        int i = bkb.F6;
        zkb.X(textView, i, wjbVar);
        linearLayout.addView(textView, nme.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        if (z) {
            M = zkb.K(0.5f, i);
        } else {
            M = zkb.M(bkb.y6);
        }
        zkb.Y(textView2, M, wjbVar);
        linearLayout.addView(textView2, nme.o(-1, -2));
    }

    public final void a(int i, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f;
        TextView textView2 = this.e;
        be0 be0Var = this.c;
        if (i == 0) {
            ShapeDrawable b0 = bkb.b0(gl.L(28.0f), bkb.v0(bkb.Ei, this.b));
            this.a = b0;
            fm2 fm2Var = new fm2(b0, getContext().getResources().getDrawable(2131231834).mutate());
            fm2Var.s = gl.L(-0.66f);
            fm2Var.w = 0;
            int L = gl.L(20.0f);
            int L2 = gl.L(20.0f);
            fm2Var.e = L;
            fm2Var.f = L2;
            be0Var.setImageDrawable(fm2Var);
            textView2.setText(k96.a0(null, null, 2131749152, str));
            textView.setText(k96.M0(2131749153, null));
            return;
        }
        pb0 pb0Var = this.d;
        pb0Var.p(chat);
        be0Var.f(chat, pb0Var);
        StringBuilder k = b00.k(str, "@");
        k.append(hc2.K(chat, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.a0(null, null, 2131749150, k.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        nd4 nd4Var = new nd4(8);
        nd4Var.f = bkb.w0(null, bkb.Bk, false);
        nd4Var.n = false;
        spannableStringBuilder.setSpan(nd4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(k96.M0(2131749151, null));
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
                bkb.A1(bkb.v0(bkb.Ei, this.b), shapeDrawable);
                be0 be0Var = this.c;
                if (be0Var != null) {
                    be0Var.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
