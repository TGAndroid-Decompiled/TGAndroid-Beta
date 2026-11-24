package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class x1c extends FrameLayout implements vlb {
    public final ylb a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final LinearLayout h;
    public final jh2 n;
    public final LinearLayout r;
    public final ImageView s;
    public final TextView w;

    public x1c(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        setClipToPadding(false);
        setPadding(gm.L(20.0f), gm.L(12.0f), gm.L(20.0f), gm.L(6.0f));
        LinearLayout i = hg9.i(context, 0);
        addView(i, qoe.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.n1("fonts/rextrabold.ttf"));
        i.addView(textView, qoe.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(gm.L(6.0f), gm.L(1.0f), gm.L(2.0f), gm.L(1.0f));
        rve.a(linearLayout);
        i.addView(linearLayout, qoe.d(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gm.n1("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, qoe.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(2131230874);
        linearLayout.addView(imageView, qoe.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(gm.L(1.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(gm.n1("fonts/rextrabold.ttf"));
        i.addView(textView3, qoe.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(gm.L(4.0f), gm.L(3.0f), gm.L(4.0f), gm.L(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        jh2 jh2Var = new jh2(20, ylbVar, context);
        this.n = jh2Var;
        jh2Var.b(cmb.g7, cmb.i7, cmb.j7);
        jh2Var.setDrawUnchecked(true);
        jh2Var.a(false, false);
        jh2Var.setDrawBackgroundAsArc(10);
        linearLayout2.addView(jh2Var, qoe.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        td4.x(textView4, cmb.i5, ylbVar, 1, 14.0f);
        textView4.setText(jb6.M0(2131754995, null));
        linearLayout2.addView(textView4, qoe.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, qoe.d(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        rve.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.r = linearLayout3;
        linearLayout3.setPadding(gm.L(6.0f), gm.L(3.0f), gm.L(6.0f), gm.L(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, qoe.d(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        rve.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.s = imageView2;
        imageView2.setImageResource(2131231972);
        linearLayout3.addView(imageView2, qoe.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.w = textView5;
        textView5.setTextSize(1, 14.0f);
        textView5.setTypeface(gm.o());
        textView5.setText(jb6.M0(2131755003, null));
        linearLayout3.addView(textView5, qoe.r(-2, -2, 16));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.Ei));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        fg0 fg0Var;
        int i = cmb.F6;
        ylb ylbVar = this.a;
        this.c.setTextColor(cmb.v0(i, ylbVar));
        int i2 = cmb.K6;
        this.d.setTextColor(cmb.v0(i2, ylbVar));
        this.e.setTextColor(cmb.v0(i, ylbVar));
        this.f.setColorFilter(new PorterDuffColorFilter(cmb.v0(i2, ylbVar), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.b;
        if (linearLayout.isClickable()) {
            fg0Var = cmb.Y(cmb.p1(0.1f, cmb.w0(null, i2, false)), gm.L(10.0f), gm.L(10.0f));
        } else {
            fg0Var = null;
        }
        linearLayout.setBackground(fg0Var);
        if (linearLayout.isClickable()) {
            rve.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(cmb.Y(cmb.v0(cmb.h6, ylbVar), 24, 24));
        int i3 = cmb.Ei;
        this.s.setColorFilter(new PorterDuffColorFilter(cmb.v0(i3, ylbVar), PorterDuff.Mode.SRC_IN));
        this.w.setTextColor(cmb.v0(i3, ylbVar));
        this.r.setBackground(cmb.Y(cmb.p1(0.1f, cmb.v0(i3, ylbVar)), gm.L(8.0f), gm.L(8.0f)));
    }
}
