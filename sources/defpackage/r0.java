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
public final class r0 extends fy0 {
    public final FrameLayout S1;
    public final FrameLayout T1;
    public final be0 U1;
    public final it3 V1;
    public final it3 W1;
    public final FrameLayout X1;
    public final wf2 Y1;
    public final FrameLayout Z1;
    public final FrameLayout a2;
    public final u41 b2;
    public Long c2;
    public q0 d2;
    public TL_aicompose.TL_aiComposeTone e2;
    public h f2;
    public h g2;
    public int h2;
    public l5c i2;
    public int j2;

    public r0(Context context, wjb wjbVar) {
        super(context, null, true, false, 2, wjbVar);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231272);
        int i = bkb.F6;
        zkb.s(imageView, i, wjbVar, PorterDuff.Mode.SRC_ATOP);
        ff0 f0 = bkb.f0(bkb.p1(0.1f, bkb.v0(i, this.J0)), 1, -1);
        vkb K = zkb.K(0.1f, i);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, K, wjbVar);
        this.o1.addView(imageView, nme.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        ote.b(imageView, 0.1f, 1.5f);
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
                        wf2 wf2Var = r0Var.Y1;
                        wf2Var.a(!wf2Var.a.q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.T1 = frameLayout2;
        int L = gl.L(100.0f);
        int i2 = bkb.c6;
        ShapeDrawable K2 = bkb.K(L, bkb.v0(i2, wjbVar));
        vkb M = zkb.M(i2);
        frameLayout2.setBackground(K2);
        zkb.j(frameLayout2, K2, M, null, wjbVar);
        ote.a(frameLayout2);
        frameLayout.addView(frameLayout2, nme.e(100, 100, 17));
        be0 be0Var = new be0(context);
        this.U1 = be0Var;
        a1();
        frameLayout2.addView(be0Var, nme.e(64, 64, 17));
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
                        wf2 wf2Var = r0Var.Y1;
                        wf2Var.a(!wf2Var.a.q, true);
                        return;
                }
            }
        });
        it3 it3Var = new it3(context, k96.M0(2131754965, null), false, false, na7.q1(this.a).k4.U.f(), wjbVar);
        this.V1 = it3Var;
        it3Var.d.addTextChangedListener(new n0(this, (byte) 0));
        it3 it3Var2 = new it3(context, k96.M0(2131754972, null), true, false, na7.q1(this.a).k4.V.f(), wjbVar);
        this.W1 = it3Var2;
        it3Var2.setShowLimitWhenNear(Math.max(100, na7.q1(this.a).k4.V.f() / 2));
        it3Var2.d.addTextChangedListener(new n0(this, (byte) 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(12.0f), gl.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i3 = bkb.h6;
        ff0 Y = bkb.Y(bkb.v0(i3, wjbVar), 24, 24);
        vkb M2 = zkb.M(i3);
        linearLayout.setBackground(Y);
        zkb.j(linearLayout, Y, null, M2, wjbVar);
        wf2 wf2Var = new wf2(24, wjbVar, context);
        this.Y1 = wf2Var;
        wf2Var.b(bkb.g7, bkb.i7, bkb.j7);
        wf2Var.setDrawUnchecked(true);
        wf2Var.a(false, false);
        wf2Var.setDrawBackgroundAsArc(10);
        linearLayout.addView(wf2Var, nme.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        zkb.X(textView, bkb.p5, wjbVar);
        ir2.r(14.0f, 1, 2131754982, textView, null);
        linearLayout.addView(textView, nme.t(-2, -2, 16, 9, 0, 0, 0));
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
                        wf2 wf2Var2 = r0Var.Y1;
                        wf2Var2.a(!wf2Var2.a.q, true);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.X1 = frameLayout3;
        frameLayout3.addView(linearLayout, nme.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i4 = bkb.Z6;
        this.b0 = i4;
        s0(bkb.v0(i4, this.J0));
        o39 o39Var = this.n1;
        int i5 = this.u0;
        o39Var.setPadding(i5, 0, i5, gl.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.r1();
        this.n1.setOnItemClickListener(new k0(this, wjbVar, (byte) 0));
        this.F1 = false;
        this.E1 = gl.L(12.0f);
        this.u1 = 0.35f;
        this.Q0 = true;
        this.I1 = true;
        o0 o0Var = new o0(this);
        o0Var.m = false;
        o0Var.C = false;
        o0Var.o(s33.h);
        o0Var.n(350L);
        this.n1.setItemAnimator(o0Var);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Z1 = frameLayout4;
        frameLayout4.setPadding(gl.L(12.0f), gl.L(6.0f), gl.L(12.0f), gl.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.p1(0.0f, bkb.v0(i4, this.J0)), bkb.v0(i4, this.J0), bkb.v0(i4, this.J0)}));
        FrameLayout.LayoutParams e = nme.e(-1, -2, 80);
        int i6 = e.leftMargin;
        int i7 = this.u0;
        e.leftMargin = i6 + i7;
        e.rightMargin += i7;
        this.b.addView(frameLayout4, e);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.a2 = frameLayout5;
        FrameLayout.LayoutParams d = nme.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i8 = d.leftMargin;
        int i9 = this.u0;
        d.leftMargin = i8 + i9;
        d.rightMargin += i9;
        this.b.addView(frameLayout5, d);
        u41 i10 = yjb.i(24, wjbVar, context, true);
        this.b2 = i10;
        i10.setText(k96.M0(2131754981, null));
        i10.setOnClickListener(new t(this, wjbVar, (byte) 1));
        frameLayout4.addView(i10, nme.e(-1, 48, 119));
        Z0();
        this.i2.O(false);
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, true, new f(this, (byte) 2), this.J0);
        this.i2 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        int i;
        if (this.e2 != null) {
            i = 2131754996;
        } else {
            i = 2131754988;
        }
        return k96.M0(i, null);
    }

    public final void Y0() {
        if (this.d2 != null) {
            return;
        }
        p0 p0Var = new p0(this, getContext(), Integer.valueOf(gl.L(150.0f)), this.J0, r6);
        p0Var.setSelected(this.c2);
        p0Var.setSaveState(1);
        q0 q0Var = new q0(this, p0Var);
        this.d2 = q0Var;
        kx9[] kx9VarArr = {q0Var};
        q0Var.showAsDropDown(this.T1, gl.L(150.0f), -gl.L(390.0f), 80);
        kx9VarArr[0].a();
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
        be0 be0Var = this.U1;
        if (l == null) {
            be0Var.setImageResource(2131231891);
            be0Var.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.V5, this.J0), PorterDuff.Mode.SRC_IN));
            return;
        }
        be0Var.setAnimatedEmojiDrawable(new vl(4, this.a, this.c2.longValue()));
        be0Var.setColorFilter(null);
        be0Var.setEmojiColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.i5, this.J0), PorterDuff.Mode.SRC_IN));
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
            int v0 = bkb.v0(bkb.Z6, this.J0);
            if (v0 != this.j2) {
                this.j2 = v0;
                s0(v0);
                this.Z1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.p1(0.0f, v0), v0, v0}));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        be0 be0Var = this.U1;
        if (be0Var != null) {
            try {
                if (this.c2 == null) {
                    i = bkb.V5;
                } else {
                    i = bkb.i5;
                }
                int v02 = bkb.v0(i, this.J0);
                if (v02 != this.h2) {
                    this.h2 = v02;
                    if (this.c2 == null) {
                        be0Var.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
                    } else {
                        be0Var.setEmojiColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
    }
}
