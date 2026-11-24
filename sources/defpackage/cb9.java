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
public final class cb9 extends fy0 {
    public final LinearLayout S1;
    public final cm2 T1;
    public final l46 U1;
    public l5c V1;

    public cb9(Context context, boolean z, wjb wjbVar, x0 x0Var) {
        super(context, null, false, false, wjbVar);
        wjb wjbVar2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        K();
        this.u1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i8 = bkb.Ei;
        paint.setColor(bkb.v0(i8, wjbVar));
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        linearLayout.setPadding(gl.L(6.0f) + this.u0, 0, gl.L(6.0f) + this.u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231604);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable K = bkb.K(gl.L(80.0f), bkb.v0(i8, wjbVar));
        vkb M = zkb.M(i8);
        imageView.setBackground(K);
        zkb.j(imageView, K, M, null, wjbVar);
        frameLayout.addView(imageView, nme.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (x0Var != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageDrawable(context.getDrawable(2131231247));
            imageView2.setContentDescription(k96.M0(2131754838, null));
            imageView2.setScaleType(scaleType);
            zkb.s(imageView2, bkb.q5, null, PorterDuff.Mode.SRC_ATOP);
            int i9 = bkb.h6;
            ff0 f0 = bkb.f0(bkb.w0(null, i9, false), 1, -1);
            vkb M2 = zkb.M(i9);
            imageView2.setBackground(f0);
            zkb.j(imageView2, f0, null, M2, null);
            wjbVar2 = wjbVar;
            imageView2.setOnClickListener(new ee(this, x0Var, wjbVar, imageView2, (byte) 16));
            frameLayout.addView(imageView2, nme.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            wjbVar2 = wjbVar;
        }
        linearLayout.addView(frameLayout, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131754943, null));
        textView.setTypeface(gl.o());
        int i10 = bkb.F6;
        zkb.X(textView, i10, wjbVar2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView m = ug8.m(linearLayout, textView, nme.t(-2, -2, 1, 22, 14, 22, 0), context);
        m.setText(k96.M0(2131745851, null));
        zkb.X(m, i10, wjbVar2);
        m.setTextSize(1, 14.0f);
        m.setGravity(1);
        linearLayout.addView(m, nme.t(-2, -2, 1, 22, 8, 22, 0));
        if (z) {
            i = 2131745847;
        } else {
            i = 2131745848;
        }
        String M0 = k96.M0(i, null);
        if (z) {
            i2 = 2131745849;
        } else {
            i2 = 2131745850;
        }
        linearLayout.addView(new ar8(this, context, 2131231864, M0, k96.M0(i2, null)), nme.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        if (z) {
            i3 = 2131745843;
        } else {
            i3 = 2131745844;
        }
        String M02 = k96.M0(i3, null);
        if (z) {
            i4 = 2131745845;
        } else {
            i4 = 2131745846;
        }
        linearLayout.addView(new ar8(this, context, 2131231818, M02, k96.M0(i4, null)), nme.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        if (z) {
            i5 = 2131745841;
        } else {
            i5 = 2131745842;
        }
        String a0 = k96.a0(null, null, i5, Integer.valueOf(na7.q1(y6c.t0).k4.T1.f()));
        int i11 = bkb.Wc;
        linearLayout.addView(new ar8(this, context, 2131231811, k96.M0(2131745840, null), gl.N2(a0, i11, 0, new Runnable(this) {
            public final cb9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                cb9 cb9Var = this.b;
                switch (b) {
                    case 0:
                        d S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.o0(3)));
                            cb9Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        cb9Var.dismiss();
                        d01.t(cb9Var.getContext(), k96.M0(2131746425, null));
                        return;
                }
            }
        }, null)), nme.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        zkb.h(bkb.c7, wjbVar2, view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(gl.L(24.0f), gl.L(20.0f), gl.L(24.0f), gl.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        if (z) {
            i6 = 2131745835;
        } else {
            i6 = 2131745836;
        }
        textView2.setText(k96.M0(i6, null));
        textView2.setTypeface(gl.o());
        zkb.X(textView2, i10, wjbVar2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, nme.t(-2, -2, 1, 22, 0, 22, 0));
        if (z) {
            i7 = 2131745838;
        } else {
            i7 = 2131745839;
        }
        SpannableStringBuilder S2 = gl.S2(k96.M0(i7, null));
        SpannableStringBuilder N2 = gl.N2(k96.M0(2131745837, null), i11, 0, new Runnable(this) {
            public final cb9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                cb9 cb9Var = this.b;
                switch (b) {
                    case 0:
                        d S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.o0(3)));
                            cb9Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        cb9Var.dismiss();
                        d01.t(cb9Var.getContext(), k96.M0(2131746425, null));
                        return;
                }
            }
        }, null);
        SpannableString spannableString = new SpannableString(">");
        cm2 cm2Var = new cm2(2131230875, 0);
        this.T1 = cm2Var;
        cm2Var.y = bkb.w0(null, i11, false);
        cm2Var.I = 0.7f;
        cm2Var.J = 0.7f;
        cm2Var.F = gl.L(12.0f);
        cm2Var.s = 1.0f;
        spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder G2 = gl.G2(gl.G2(S2, N2, "%1$s"), spannableString, ">");
        l46 l46Var = new l46(context, null);
        this.U1 = l46Var;
        l46Var.setText(G2);
        zkb.X(l46Var, i10, wjbVar2);
        l46Var.setTextSize(1, 14.0f);
        l46Var.setGravity(1);
        l46Var.setLineSpacing(gl.L(2.0f), 1.0f);
        linearLayout.addView(l46Var, nme.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        zkb.X(textView3, bkb.Ii, wjbVar2);
        textView3.setTypeface(gl.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(k96.M0(2131745852, null));
        ff0 e = sjb.e(bkb.v0(i8, wjbVar2), 6.0f);
        vkb M3 = zkb.M(i8);
        vkb e2 = zkb.e(i8);
        textView3.setBackground(e);
        zkb.j(textView3, e, M3, e2, wjbVar2);
        textView3.setOnClickListener(new ik8(this, (byte) 8));
        linearLayout.addView(textView3, nme.t(-1, 48, 0, 14, 22, 14, 14));
        this.V1.O(false);
    }

    public static cb9 Y0(Context context, d dVar, boolean z, wjb wjbVar, x0 x0Var) {
        cb9 cb9Var = new cb9(context, z, wjbVar, x0Var);
        if (dVar != null) {
            if (dVar.getParentActivity() != null) {
                dVar.showDialog(cb9Var);
            }
            return cb9Var;
        }
        cb9Var.show();
        return cb9Var;
    }

    public static void Z0(mu1 mu1Var, wjb wjbVar, Context context) {
        Y0(context, mu1Var, false, wjbVar, null);
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, true, new tf8(this, (byte) 10), this.J0);
        this.V1 = l5cVar;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        return k96.M0(2131754943, null);
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            cm2 cm2Var = this.T1;
            if (cm2Var != null) {
                cm2Var.y = bkb.w0(null, bkb.Wc, false);
                l46 l46Var = this.U1;
                if (l46Var != null) {
                    l46Var.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
