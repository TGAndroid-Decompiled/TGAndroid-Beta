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
public final class w3c extends FrameLayout implements snb {
    public final vnb a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final LinearLayout h;
    public final og2 n;
    public final LinearLayout r;
    public final ImageView s;
    public final TextView w;

    public w3c(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        setClipToPadding(false);
        setPadding(hl.L(20.0f), hl.L(12.0f), hl.L(20.0f), hl.L(6.0f));
        LinearLayout j = uh9.j(context, 0);
        addView(j, tre.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.n1("fonts/rextrabold.ttf"));
        j.addView(textView, tre.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(hl.L(6.0f), hl.L(1.0f), hl.L(2.0f), hl.L(1.0f));
        iye.a(linearLayout);
        j.addView(linearLayout, tre.d(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.n1("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, tre.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(2131230873);
        linearLayout.addView(imageView, tre.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(hl.L(1.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(hl.n1("fonts/rextrabold.ttf"));
        j.addView(textView3, tre.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(hl.L(4.0f), hl.L(3.0f), hl.L(4.0f), hl.L(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        og2 og2Var = new og2(20, vnbVar, context);
        this.n = og2Var;
        og2Var.b(aob.h7, aob.j7, aob.k7);
        og2Var.setDrawUnchecked(true);
        og2Var.a(false, false);
        og2Var.setDrawBackgroundAsArc(10);
        linearLayout2.addView(og2Var, tre.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        qd4.w(textView4, aob.j5, vnbVar, 1, 14.0f);
        textView4.setText(ob6.M0(2131754992, null));
        linearLayout2.addView(textView4, tre.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, tre.d(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        iye.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.r = linearLayout3;
        linearLayout3.setPadding(hl.L(6.0f), hl.L(3.0f), hl.L(6.0f), hl.L(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, tre.d(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        iye.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.s = imageView2;
        imageView2.setImageResource(2131231971);
        linearLayout3.addView(imageView2, tre.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.w = textView5;
        textView5.setTextSize(1, 14.0f);
        textView5.setTypeface(hl.o());
        textView5.setText(ob6.M0(2131755000, null));
        linearLayout3.addView(textView5, tre.r(-2, -2, 16));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.Fi));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        hf0 hf0Var;
        int i = aob.G6;
        vnb vnbVar = this.a;
        this.c.setTextColor(aob.v0(i, vnbVar));
        int i2 = aob.L6;
        this.d.setTextColor(aob.v0(i2, vnbVar));
        this.e.setTextColor(aob.v0(i, vnbVar));
        this.f.setColorFilter(new PorterDuffColorFilter(aob.v0(i2, vnbVar), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.b;
        if (linearLayout.isClickable()) {
            hf0Var = aob.Y(aob.p1(0.1f, aob.w0(null, i2, false)), hl.L(10.0f), hl.L(10.0f));
        } else {
            hf0Var = null;
        }
        linearLayout.setBackground(hf0Var);
        if (linearLayout.isClickable()) {
            iye.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(aob.Y(aob.v0(aob.i6, vnbVar), 24, 24));
        int i3 = aob.Fi;
        this.s.setColorFilter(new PorterDuffColorFilter(aob.v0(i3, vnbVar), PorterDuff.Mode.SRC_IN));
        this.w.setTextColor(aob.v0(i3, vnbVar));
        this.r.setBackground(aob.Y(aob.p1(0.1f, aob.v0(i3, vnbVar)), hl.L(8.0f), hl.L(8.0f)));
    }
}
