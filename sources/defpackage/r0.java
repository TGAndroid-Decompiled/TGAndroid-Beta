package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_aicompose;
public final class r0 extends mz0 {
    public final FrameLayout S1;
    public final FrameLayout T1;
    public final bf0 U1;
    public final su3 V1;
    public final su3 W1;
    public final FrameLayout X1;
    public final jh2 Y1;
    public final FrameLayout Z1;
    public final FrameLayout a2;
    public final b61 b2;
    public Long c2;
    public q0 d2;
    public TL_aicompose.TL_aiComposeTone e2;
    public h f2;
    public h g2;
    public int h2;
    public l7c i2;
    public int j2;

    public r0(Context context, ylb ylbVar) {
        super(context, null, true, false, 2, ylbVar);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231273);
        int i = cmb.F6;
        anb.s(imageView, i, ylbVar, PorterDuff.Mode.SRC_ATOP);
        fg0 f0 = cmb.f0(cmb.p1(0.1f, cmb.v0(i, this.J0)), 1, -1);
        wmb K = anb.K(0.1f, i);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, K, ylbVar);
        this.o1.addView(imageView, qoe.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        rve.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final r0 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                r0 r0Var = this.b;
                switch (b) {
                    case 0:
                        r0Var.dismiss();
                        return;
                    case 1:
                        r0Var.Y0();
                        return;
                    default:
                        jh2 jh2Var = r0Var.Y1;
                        jh2Var.a(!jh2Var.a.q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.T1 = frameLayout2;
        int L = gm.L(100.0f);
        int i2 = cmb.c6;
        ShapeDrawable K2 = cmb.K(L, cmb.v0(i2, ylbVar));
        wmb M = anb.M(i2);
        frameLayout2.setBackground(K2);
        anb.j(frameLayout2, K2, M, null, ylbVar);
        rve.a(frameLayout2);
        frameLayout.addView(frameLayout2, qoe.e(100, 100, 17));
        bf0 bf0Var = new bf0(context);
        this.U1 = bf0Var;
        a1();
        frameLayout2.addView(bf0Var, qoe.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final r0 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                r0 r0Var = this.b;
                switch (b) {
                    case 0:
                        r0Var.dismiss();
                        return;
                    case 1:
                        r0Var.Y0();
                        return;
                    default:
                        jh2 jh2Var = r0Var.Y1;
                        jh2Var.a(!jh2Var.a.q, true);
                        return;
                }
            }
        });
        su3 su3Var = new su3(context, jb6.M0(2131754965, null), false, false, oc7.r1(this.a).l4.U.f(), ylbVar);
        this.V1 = su3Var;
        su3Var.d.addTextChangedListener(new n0(this, (byte) 0));
        su3 su3Var2 = new su3(context, jb6.M0(2131754972, null), true, false, oc7.r1(this.a).l4.V.f(), ylbVar);
        this.W1 = su3Var2;
        su3Var2.setShowLimitWhenNear(Math.max(100, oc7.r1(this.a).l4.V.f() / 2));
        su3Var2.d.addTextChangedListener(new n0(this, (byte) 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(12.0f), gm.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i3 = cmb.h6;
        fg0 Y = cmb.Y(cmb.v0(i3, ylbVar), 24, 24);
        wmb M2 = anb.M(i3);
        linearLayout.setBackground(Y);
        anb.j(linearLayout, Y, null, M2, ylbVar);
        jh2 jh2Var = new jh2(24, ylbVar, context);
        this.Y1 = jh2Var;
        jh2Var.b(cmb.g7, cmb.i7, cmb.j7);
        jh2Var.setDrawUnchecked(true);
        jh2Var.a(false, false);
        jh2Var.setDrawBackgroundAsArc(10);
        linearLayout.addView(jh2Var, qoe.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        anb.X(textView, cmb.p5, ylbVar);
        ts2.q(14.0f, 1, 2131754982, textView, null);
        linearLayout.addView(textView, qoe.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final r0 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                r0 r0Var = this.b;
                switch (b) {
                    case 0:
                        r0Var.dismiss();
                        return;
                    case 1:
                        r0Var.Y0();
                        return;
                    default:
                        jh2 jh2Var2 = r0Var.Y1;
                        jh2Var2.a(!jh2Var2.a.q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.X1 = frameLayout3;
        frameLayout3.addView(linearLayout, qoe.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i4 = cmb.Z6;
        this.b0 = i4;
        s0(cmb.v0(i4, this.J0));
        r59 r59Var = this.n1;
        int i5 = this.u0;
        r59Var.setPadding(i5, 0, i5, gm.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.r1();
        this.n1.setOnItemClickListener(new k0(this, ylbVar, (byte) 0));
        this.F1 = false;
        this.E1 = gm.L(12.0f);
        this.u1 = 0.35f;
        this.Q0 = true;
        this.I1 = true;
        o0 o0Var = new o0(this);
        o0Var.m = false;
        o0Var.C = false;
        o0Var.o(d53.h);
        o0Var.n(350L);
        this.n1.setItemAnimator(o0Var);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Z1 = frameLayout4;
        frameLayout4.setPadding(gm.L(12.0f), gm.L(6.0f), gm.L(12.0f), gm.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, cmb.v0(i4, this.J0)), cmb.v0(i4, this.J0), cmb.v0(i4, this.J0)}));
        FrameLayout.LayoutParams e = qoe.e(-1, -2, 80);
        int i6 = e.leftMargin;
        int i7 = this.u0;
        e.leftMargin = i6 + i7;
        e.rightMargin += i7;
        this.b.addView(frameLayout4, e);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.a2 = frameLayout5;
        FrameLayout.LayoutParams d = qoe.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i8 = d.leftMargin;
        int i9 = this.u0;
        d.leftMargin = i8 + i9;
        d.rightMargin += i9;
        this.b.addView(frameLayout5, d);
        b61 i10 = mlb.i(24, ylbVar, context, true);
        this.b2 = i10;
        i10.setText(jb6.M0(2131754981, null));
        i10.setOnClickListener(new t(this, ylbVar, (byte) 1));
        frameLayout4.addView(i10, qoe.e(-1, 48, 119));
        Z0();
        this.i2.O(false);
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, true, new f(this, (byte) 2), this.J0);
        this.i2 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        int i;
        if (this.e2 != null) {
            i = 2131754996;
        } else {
            i = 2131754988;
        }
        return jb6.M0(i, null);
    }

    public final void Y0() {
        if (this.d2 != null) {
            return;
        }
        p0 p0Var = new p0(this, getContext(), Integer.valueOf(gm.L(150.0f)), this.J0, r6);
        p0Var.setSelected(this.c2);
        p0Var.setSaveState(1);
        q0 q0Var = new q0(this, p0Var);
        this.d2 = q0Var;
        mz9[] mz9VarArr = {q0Var};
        q0Var.showAsDropDown(this.T1, gm.L(150.0f), -gm.L(390.0f), 80);
        mz9VarArr[0].a();
    }

    public final void Z0() {
        boolean z;
        if (this.c2 != null && this.V1.getText().length() > 0 && this.W1.getText().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.b2.setEnabled(z);
    }

    public final void a1() {
        this.h2 = 0;
        Long l = this.c2;
        bf0 bf0Var = this.U1;
        if (l == null) {
            bf0Var.setImageResource(2131231892);
            bf0Var.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.V5, this.J0), PorterDuff.Mode.SRC_IN));
            return;
        }
        bf0Var.setAnimatedEmojiDrawable(new vm(4, this.a, this.c2.longValue()));
        bf0Var.setColorFilter(null);
        bf0Var.setEmojiColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.i5, this.J0), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void n0(float f) {
        super.n0(f);
        this.Z1.setTranslationY(f);
    }

    @Override
    public final void p0() {
        int i;
        try {
            super.p0();
            int v0 = cmb.v0(cmb.Z6, this.J0);
            if (v0 != this.j2) {
                this.j2 = v0;
                s0(v0);
                this.Z1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, v0), v0, v0}));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        bf0 bf0Var = this.U1;
        if (bf0Var != null) {
            try {
                if (this.c2 == null) {
                    i = cmb.V5;
                } else {
                    i = cmb.i5;
                }
                int v02 = cmb.v0(i, this.J0);
                if (v02 != this.h2) {
                    this.h2 = v02;
                    if (this.c2 == null) {
                        bf0Var.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
                    } else {
                        bf0Var.setEmojiColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
    }
}
