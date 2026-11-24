package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class cd9 extends mz0 {
    public final LinearLayout S1;
    public final pn2 T1;
    public final l66 U1;
    public l7c V1;

    public cd9(Context context, boolean z, ylb ylbVar, x0 x0Var) {
        super(context, null, false, false, ylbVar);
        ylb ylbVar2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        J();
        this.u1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i8 = cmb.Ei;
        paint.setColor(cmb.v0(i8, ylbVar));
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        linearLayout.setPadding(gm.L(6.0f) + this.u0, 0, gm.L(6.0f) + this.u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231605);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable K = cmb.K(gm.L(80.0f), cmb.v0(i8, ylbVar));
        wmb M = anb.M(i8);
        imageView.setBackground(K);
        anb.j(imageView, K, M, null, ylbVar);
        frameLayout.addView(imageView, qoe.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (x0Var != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageDrawable(context.getDrawable(2131231248));
            imageView2.setContentDescription(jb6.M0(2131754838, null));
            imageView2.setScaleType(scaleType);
            anb.s(imageView2, cmb.q5, null, PorterDuff.Mode.SRC_ATOP);
            int i9 = cmb.h6;
            fg0 f0 = cmb.f0(cmb.w0(null, i9, false), 1, -1);
            wmb M2 = anb.M(i9);
            imageView2.setBackground(f0);
            anb.j(imageView2, f0, null, M2, null);
            ylbVar2 = ylbVar;
            imageView2.setOnClickListener(new ef(this, x0Var, ylbVar, imageView2, (byte) 16));
            frameLayout.addView(imageView2, qoe.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            ylbVar2 = ylbVar;
        }
        linearLayout.addView(frameLayout, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131754943, null));
        textView.setTypeface(gm.o());
        int i10 = cmb.F6;
        anb.X(textView, i10, ylbVar2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView m = wi8.m(linearLayout, textView, qoe.t(-2, -2, 1, 22, 14, 22, 0), context);
        m.setText(jb6.M0(2131745777, null));
        anb.X(m, i10, ylbVar2);
        m.setTextSize(1, 14.0f);
        m.setGravity(1);
        linearLayout.addView(m, qoe.t(-2, -2, 1, 22, 8, 22, 0));
        if (z) {
            i = 2131745773;
        } else {
            i = 2131745774;
        }
        String M0 = jb6.M0(i, null);
        if (z) {
            i2 = 2131745775;
        } else {
            i2 = 2131745776;
        }
        linearLayout.addView(new ct8(this, context, 2131231865, M0, jb6.M0(i2, null)), qoe.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        if (z) {
            i3 = 2131745769;
        } else {
            i3 = 2131745770;
        }
        String M02 = jb6.M0(i3, null);
        if (z) {
            i4 = 2131745771;
        } else {
            i4 = 2131745772;
        }
        linearLayout.addView(new ct8(this, context, 2131231819, M02, jb6.M0(i4, null)), qoe.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        if (z) {
            i5 = 2131745767;
        } else {
            i5 = 2131745768;
        }
        String a0 = jb6.a0(null, null, i5, Integer.valueOf(oc7.r1(z8c.t0).l4.T1.f()));
        int i11 = cmb.Wc;
        linearLayout.addView(new ct8(this, context, 2131231812, jb6.M0(2131745766, null), gm.N2(a0, i11, 0, new Runnable(this) {
            public final cd9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                cd9 cd9Var = this.b;
                switch (b) {
                    case 0:
                        d S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.p0(3)));
                            cd9Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        cd9Var.dismiss();
                        l11.u(cd9Var.getContext(), jb6.M0(2131746351, null));
                        return;
                }
            }
        }, null)), qoe.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        anb.h(cmb.c7, ylbVar2, view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(gm.L(24.0f), gm.L(20.0f), gm.L(24.0f), gm.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        if (z) {
            i6 = 2131745761;
        } else {
            i6 = 2131745762;
        }
        textView2.setText(jb6.M0(i6, null));
        textView2.setTypeface(gm.o());
        anb.X(textView2, i10, ylbVar2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, qoe.t(-2, -2, 1, 22, 0, 22, 0));
        if (z) {
            i7 = 2131745764;
        } else {
            i7 = 2131745765;
        }
        SpannableStringBuilder S2 = gm.S2(jb6.M0(i7, null));
        SpannableStringBuilder N2 = gm.N2(jb6.M0(2131745763, null), i11, 0, new Runnable(this) {
            public final cd9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                cd9 cd9Var = this.b;
                switch (b) {
                    case 0:
                        d S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.p0(3)));
                            cd9Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        cd9Var.dismiss();
                        l11.u(cd9Var.getContext(), jb6.M0(2131746351, null));
                        return;
                }
            }
        }, null);
        SpannableString spannableString = new SpannableString(">");
        pn2 pn2Var = new pn2(2131230876, 0);
        this.T1 = pn2Var;
        pn2Var.y = cmb.w0(null, i11, false);
        pn2Var.I = 0.7f;
        pn2Var.J = 0.7f;
        pn2Var.F = gm.L(12.0f);
        pn2Var.s = 1.0f;
        spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder G2 = gm.G2(gm.G2(S2, N2, "%1$s"), spannableString, ">");
        l66 l66Var = new l66(context, null);
        this.U1 = l66Var;
        l66Var.setText(G2);
        anb.X(l66Var, i10, ylbVar2);
        l66Var.setTextSize(1, 14.0f);
        l66Var.setGravity(1);
        l66Var.setLineSpacing(gm.L(2.0f), 1.0f);
        linearLayout.addView(l66Var, qoe.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        anb.X(textView3, cmb.Ii, ylbVar2);
        textView3.setTypeface(gm.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(jb6.M0(2131745778, null));
        fg0 e = ulb.e(cmb.v0(i8, ylbVar2), 6.0f);
        wmb M3 = anb.M(i8);
        wmb e2 = anb.e(i8);
        textView3.setBackground(e);
        anb.j(textView3, e, M3, e2, ylbVar2);
        textView3.setOnClickListener(new wk8(this, (byte) 11));
        linearLayout.addView(textView3, qoe.t(-1, 48, 0, 14, 22, 14, 14));
        this.V1.O(false);
    }

    public static cd9 Y0(Context context, d dVar, boolean z, ylb ylbVar, x0 x0Var) {
        cd9 cd9Var = new cd9(context, z, ylbVar, x0Var);
        if (dVar != null) {
            if (dVar.getParentActivity() != null) {
                dVar.showDialog(cd9Var);
            }
            return cd9Var;
        }
        cd9Var.show();
        return cd9Var;
    }

    public static void Z0(yv1 yv1Var, ylb ylbVar, Context context) {
        Y0(context, yv1Var, false, ylbVar, null);
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, true, new vh8(this, (byte) 10), this.J0);
        this.V1 = l7cVar;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return jb6.M0(2131754943, null);
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            pn2 pn2Var = this.T1;
            if (pn2Var != null) {
                pn2Var.y = cmb.w0(null, cmb.Wc, false);
                l66 l66Var = this.U1;
                if (l66Var != null) {
                    l66Var.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
