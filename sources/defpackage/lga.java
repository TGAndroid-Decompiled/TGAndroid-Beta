package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class lga extends FrameLayout implements vlb {
    public final ylb a;
    public final ut8 b;
    public final View c;

    public lga(int i, Context context, boolean z, ylb ylbVar, c0a c0aVar) {
        super(context);
        int i2;
        int i3;
        this.a = ylbVar;
        ut8 ut8Var = new ut8(context, ylbVar);
        this.b = ut8Var;
        int i4 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i4, ylbVar), 2, -1);
        wmb M = anb.M(i4);
        ut8Var.setBackground(f0);
        anb.j(ut8Var, f0, null, M, ylbVar);
        addView(ut8Var, qoe.c(-2.0f, -1));
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i5 = cmb.c6;
        view.setBackground(new GradientDrawable(orientation, new int[]{cmb.p1(0.4f, cmb.v0(i5, ylbVar)), cmb.v0(i5, ylbVar)}));
        addView(view, qoe.c(60.0f, -1));
        b61 b61Var = new b61(ylbVar, context, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            i2 = 2131748086;
        } else {
            i2 = 2131748084;
        }
        spannableStringBuilder.append((CharSequence) jb6.M0(i2, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new pn2(2131232248, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        b61Var.i(spannableStringBuilder, false, true);
        addView(b61Var, qoe.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        b61Var.setOnClickListener(new wk8(c0aVar, (byte) 29));
        l66 l66Var = new l66(context, ylbVar);
        l66Var.setTextSize(1, 13.0f);
        l66Var.setTextAlignment(4);
        l66Var.setGravity(17);
        anb.X(l66Var, cmb.F6, ylbVar);
        anb.G(l66Var, cmb.m6, ylbVar);
        l66Var.setLineSpacing(gm.L(3.0f), 1.0f);
        if (z) {
            i3 = 2131748085;
        } else {
            i3 = 2131748083;
        }
        SpannableStringBuilder N2 = gm.N2(jb6.M0(i3, null), -1, 2, new c0a(c0aVar, (byte) 15), null);
        SpannableString spannableString2 = new SpannableString(String.valueOf(oc7.r1(i).l4.R1.f()));
        spannableString2.setSpan(new z5c(gm.o()), 0, spannableString2.length(), 33);
        l66Var.setText(gm.G2(N2, spannableString2, "%s"));
        addView(l66Var, qoe.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(145.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        ylb ylbVar = this.a;
        View view = this.c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    int i = cmb.c6;
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{cmb.p1(0.4f, cmb.v0(i, ylbVar)), cmb.v0(i, ylbVar)});
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
