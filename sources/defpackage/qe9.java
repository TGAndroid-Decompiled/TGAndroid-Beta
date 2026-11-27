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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class qe9 extends ny0 {
    public final LinearLayout S1;
    public final wm2 T1;
    public final p66 U1;
    public l9c V1;

    public qe9(Context context, boolean z, vnb vnbVar, y0 y0Var) {
        super(context, null, false, false, vnbVar);
        vnb vnbVar2;
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
        int i8 = aob.Fi;
        paint.setColor(aob.v0(i8, vnbVar));
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        linearLayout.setPadding(hl.L(6.0f) + this.u0, 0, hl.L(6.0f) + this.u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231604);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable K = aob.K(hl.L(80.0f), aob.v0(i8, vnbVar));
        uob M = yob.M(i8);
        imageView.setBackground(K);
        yob.j(imageView, K, M, null, vnbVar);
        frameLayout.addView(imageView, tre.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (y0Var != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageDrawable(context.getDrawable(2131231247));
            imageView2.setContentDescription(ob6.M0(2131754834, null));
            imageView2.setScaleType(scaleType);
            yob.s(imageView2, aob.r5, null, PorterDuff.Mode.SRC_ATOP);
            int i9 = aob.i6;
            hf0 f0 = aob.f0(aob.w0(null, i9, false), 1, -1);
            uob M2 = yob.M(i9);
            imageView2.setBackground(f0);
            yob.j(imageView2, f0, null, M2, null);
            vnbVar2 = vnbVar;
            imageView2.setOnClickListener(new cg(this, y0Var, vnbVar, imageView2, (byte) 16));
            frameLayout.addView(imageView2, tre.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            vnbVar2 = vnbVar;
        }
        linearLayout.addView(frameLayout, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131754939, null));
        textView.setTypeface(hl.o());
        int i10 = aob.G6;
        yob.X(textView, i10, vnbVar2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView m = ik8.m(linearLayout, textView, tre.t(-2, -2, 1, 22, 14, 22, 0), context);
        m.setText(ob6.M0(2131745771, null));
        yob.X(m, i10, vnbVar2);
        m.setTextSize(1, 14.0f);
        m.setGravity(1);
        linearLayout.addView(m, tre.t(-2, -2, 1, 22, 8, 22, 0));
        if (z) {
            i = 2131745767;
        } else {
            i = 2131745768;
        }
        String M0 = ob6.M0(i, null);
        if (z) {
            i2 = 2131745769;
        } else {
            i2 = 2131745770;
        }
        linearLayout.addView(new ir8(this, context, 2131231864, M0, ob6.M0(i2, null)), tre.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        if (z) {
            i3 = 2131745763;
        } else {
            i3 = 2131745764;
        }
        String M02 = ob6.M0(i3, null);
        if (z) {
            i4 = 2131745765;
        } else {
            i4 = 2131745766;
        }
        linearLayout.addView(new ir8(this, context, 2131231818, M02, ob6.M0(i4, null)), tre.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        if (z) {
            i5 = 2131745761;
        } else {
            i5 = 2131745762;
        }
        String a0 = ob6.a0(null, null, i5, Integer.valueOf(uc7.s1(yac.t0).l4.b2.f()));
        int i11 = aob.Xc;
        linearLayout.addView(new ir8(this, context, 2131231811, ob6.M0(2131745760, null), hl.N2(a0, i11, 0, new Runnable(this) {
            public final qe9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                qe9 qe9Var = this.b;
                switch (b) {
                    case 0:
                        e S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.o0(3)));
                            qe9Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        qe9Var.dismiss();
                        m01.u(qe9Var.getContext(), ob6.M0(2131746345, null));
                        return;
                }
            }
        }, null)), tre.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        yob.h(aob.d7, vnbVar2, view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(hl.L(24.0f), hl.L(20.0f), hl.L(24.0f), hl.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        if (z) {
            i6 = 2131745755;
        } else {
            i6 = 2131745756;
        }
        textView2.setText(ob6.M0(i6, null));
        textView2.setTypeface(hl.o());
        yob.X(textView2, i10, vnbVar2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, tre.t(-2, -2, 1, 22, 0, 22, 0));
        if (z) {
            i7 = 2131745758;
        } else {
            i7 = 2131745759;
        }
        SpannableStringBuilder S2 = hl.S2(ob6.M0(i7, null));
        SpannableStringBuilder N2 = hl.N2(ob6.M0(2131745757, null), i11, 0, new Runnable(this) {
            public final qe9 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                qe9 qe9Var = this.b;
                switch (b) {
                    case 0:
                        e S = LaunchActivity.S();
                        if (S != null) {
                            S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.o0(3)));
                            qe9Var.dismiss();
                            return;
                        }
                        return;
                    default:
                        qe9Var.dismiss();
                        m01.u(qe9Var.getContext(), ob6.M0(2131746345, null));
                        return;
                }
            }
        }, null);
        SpannableString spannableString = new SpannableString(">");
        wm2 wm2Var = new wm2(2131230875, 0);
        this.T1 = wm2Var;
        wm2Var.y = aob.w0(null, i11, false);
        wm2Var.I = 0.7f;
        wm2Var.J = 0.7f;
        wm2Var.F = hl.L(12.0f);
        wm2Var.s = 1.0f;
        spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder G2 = hl.G2(hl.G2(S2, N2, "%1$s"), spannableString, ">");
        p66 p66Var = new p66(context, null);
        this.U1 = p66Var;
        p66Var.setText(G2);
        yob.X(p66Var, i10, vnbVar2);
        p66Var.setTextSize(1, 14.0f);
        p66Var.setGravity(1);
        p66Var.setLineSpacing(hl.L(2.0f), 1.0f);
        linearLayout.addView(p66Var, tre.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        yob.X(textView3, aob.Ji, vnbVar2);
        textView3.setTypeface(hl.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(ob6.M0(2131745772, null));
        hf0 e = rnb.e(aob.v0(i8, vnbVar2), 6.0f);
        uob M3 = yob.M(i8);
        uob e2 = yob.e(i8);
        textView3.setBackground(e);
        yob.j(textView3, e, M3, e2, vnbVar2);
        textView3.setOnClickListener(new jn8(this, (byte) 10));
        linearLayout.addView(textView3, tre.t(-1, 48, 0, 14, 22, 14, 14));
        this.V1.O(false);
    }

    public static qe9 Z0(Context context, e eVar, boolean z, vnb vnbVar, y0 y0Var) {
        qe9 qe9Var = new qe9(context, z, vnbVar, y0Var);
        if (eVar != null) {
            if (eVar.getParentActivity() != null) {
                eVar.showDialog(qe9Var);
            }
            return qe9Var;
        }
        qe9Var.show();
        return qe9Var;
    }

    public static void a1(zu1 zu1Var, vnb vnbVar, Context context) {
        Z0(context, zu1Var, false, vnbVar, null);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, true, new hj8(this, (byte) 10), this.J0);
        this.V1 = l9cVar;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131754939, null);
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            wm2 wm2Var = this.T1;
            if (wm2Var != null) {
                wm2Var.y = aob.w0(null, aob.Xc, false);
                p66 p66Var = this.U1;
                if (p66Var != null) {
                    p66Var.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
