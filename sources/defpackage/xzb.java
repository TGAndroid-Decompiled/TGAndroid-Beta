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
public final class xzb extends FrameLayout implements tjb {
    public final wjb a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final LinearLayout h;
    public final wf2 n;
    public final LinearLayout r;
    public final ImageView s;
    public final TextView w;

    public xzb(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        setClipToPadding(false);
        setPadding(gl.L(20.0f), gl.L(12.0f), gl.L(20.0f), gl.L(6.0f));
        LinearLayout j = de9.j(context, 0);
        addView(j, nme.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.n1("fonts/rextrabold.ttf"));
        j.addView(textView, nme.t(-2, -2, 19, 0, 0, 0, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(gl.L(6.0f), gl.L(1.0f), gl.L(2.0f), gl.L(1.0f));
        ote.a(linearLayout);
        j.addView(linearLayout, nme.d(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.n1("fonts/rextrabold.ttf"));
        linearLayout.addView(textView2, nme.t(-2, -2, 19, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(2131230873);
        linearLayout.addView(imageView, nme.t(16, 16, 19, 1, 0, 0, 0));
        imageView.setTranslationY(gl.L(1.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(gl.n1("fonts/rextrabold.ttf"));
        j.addView(textView3, nme.t(-2, -2, 19, -6, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.h = linearLayout2;
        linearLayout2.setPadding(gl.L(4.0f), gl.L(3.0f), gl.L(4.0f), gl.L(3.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        wf2 wf2Var = new wf2(20, wjbVar, context);
        this.n = wf2Var;
        wf2Var.b(bkb.g7, bkb.i7, bkb.j7);
        wf2Var.setDrawUnchecked(true);
        wf2Var.a(false, false);
        wf2Var.setDrawBackgroundAsArc(10);
        linearLayout2.addView(wf2Var, nme.t(22, 22, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        tb4.w(textView4, bkb.i5, wjbVar, 1, 14.0f);
        textView4.setText(k96.M0(2131754995, null));
        linearLayout2.addView(textView4, nme.t(-2, -2, 16, 3, -1, 2, 0));
        addView(linearLayout2, nme.d(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
        ote.b(linearLayout2, 0.025f, 1.5f);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.r = linearLayout3;
        linearLayout3.setPadding(gl.L(6.0f), gl.L(3.0f), gl.L(6.0f), gl.L(3.0f));
        linearLayout3.setOrientation(0);
        linearLayout3.setVisibility(8);
        addView(linearLayout3, nme.d(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
        ote.b(linearLayout3, 0.025f, 1.5f);
        ImageView imageView2 = new ImageView(context);
        this.s = imageView2;
        imageView2.setImageResource(2131231971);
        linearLayout3.addView(imageView2, nme.t(-2, -2, 16, 0, 0, 4, 0));
        TextView textView5 = new TextView(context);
        this.w = textView5;
        textView5.setTextSize(1, 14.0f);
        textView5.setTypeface(gl.o());
        textView5.setText(k96.M0(2131755003, null));
        linearLayout3.addView(textView5, nme.r(-2, -2, 16));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.Ei));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        ff0 ff0Var;
        int i = bkb.F6;
        wjb wjbVar = this.a;
        this.c.setTextColor(bkb.v0(i, wjbVar));
        int i2 = bkb.K6;
        this.d.setTextColor(bkb.v0(i2, wjbVar));
        this.e.setTextColor(bkb.v0(i, wjbVar));
        this.f.setColorFilter(new PorterDuffColorFilter(bkb.v0(i2, wjbVar), PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = this.b;
        if (linearLayout.isClickable()) {
            ff0Var = bkb.Y(bkb.p1(0.1f, bkb.w0(null, i2, false)), gl.L(10.0f), gl.L(10.0f));
        } else {
            ff0Var = null;
        }
        linearLayout.setBackground(ff0Var);
        if (linearLayout.isClickable()) {
            ote.a(linearLayout);
        } else {
            linearLayout.setStateListAnimator(null);
        }
        this.h.setBackground(bkb.Y(bkb.v0(bkb.h6, wjbVar), 24, 24));
        int i3 = bkb.Ei;
        this.s.setColorFilter(new PorterDuffColorFilter(bkb.v0(i3, wjbVar), PorterDuff.Mode.SRC_IN));
        this.w.setTextColor(bkb.v0(i3, wjbVar));
        this.r.setBackground(bkb.Y(bkb.p1(0.1f, bkb.v0(i3, wjbVar)), gl.L(8.0f), gl.L(8.0f)));
    }
}
