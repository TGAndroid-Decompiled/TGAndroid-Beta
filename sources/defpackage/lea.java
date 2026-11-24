package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class lea extends FrameLayout implements tjb {
    public final wjb a;
    public final rr8 b;
    public final View c;

    public lea(int i, Context context, boolean z, wjb wjbVar, z6a z6aVar) {
        super(context);
        int i2;
        int i3;
        this.a = wjbVar;
        rr8 rr8Var = new rr8(context, wjbVar);
        this.b = rr8Var;
        int i4 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i4, wjbVar), 2, -1);
        vkb M = zkb.M(i4);
        rr8Var.setBackground(f0);
        zkb.j(rr8Var, f0, null, M, wjbVar);
        addView(rr8Var, nme.c(-2.0f, -1));
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i5 = bkb.c6;
        view.setBackground(new GradientDrawable(orientation, new int[]{bkb.p1(0.4f, bkb.v0(i5, wjbVar)), bkb.v0(i5, wjbVar)}));
        addView(view, nme.c(60.0f, -1));
        u41 u41Var = new u41(wjbVar, context, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            i2 = 2131748137;
        } else {
            i2 = 2131748135;
        }
        spannableStringBuilder.append((CharSequence) k96.M0(i2, null));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new cm2(2131232247, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        u41Var.i(spannableStringBuilder, false, true);
        addView(u41Var, nme.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        u41Var.setOnClickListener(new ik8(z6aVar, (byte) 26));
        l46 l46Var = new l46(context, wjbVar);
        l46Var.setTextSize(1, 13.0f);
        l46Var.setTextAlignment(4);
        l46Var.setGravity(17);
        zkb.X(l46Var, bkb.F6, wjbVar);
        zkb.G(l46Var, bkb.m6, wjbVar);
        l46Var.setLineSpacing(gl.L(3.0f), 1.0f);
        if (z) {
            i3 = 2131748136;
        } else {
            i3 = 2131748134;
        }
        SpannableStringBuilder O2 = gl.O2(k96.M0(i3, null), -1, 2, new z6a(z6aVar, (byte) 7), null);
        SpannableString spannableString2 = new SpannableString(String.valueOf(na7.q1(i).k4.R1.f()));
        spannableString2.setSpan(new z3c(gl.o()), 0, spannableString2.length(), 33);
        l46Var.setText(gl.H2(O2, spannableString2, "%s"));
        addView(l46Var, nme.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(145.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        wjb wjbVar = this.a;
        View view = this.c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    int i = bkb.c6;
                    ((GradientDrawable) view.getBackground()).setColors(new int[]{bkb.p1(0.4f, bkb.v0(i, wjbVar)), bkb.v0(i, wjbVar)});
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
