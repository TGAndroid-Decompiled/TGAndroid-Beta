package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class xo2 extends FrameLayout implements vlb {
    public static final int I = 0;
    public int E;
    public uo2 F;
    public long G;
    public long H;
    public final ylb a;
    public final int b;
    public final bf0 c;
    public final TextView d;
    public final bf0 e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final b61 r;
    public final pn2 s;
    public final nz4 w;
    public final im0 x;
    public boolean y;

    public xo2(int i, ylb ylbVar, Context context) {
        super(context);
        km0 km0Var;
        this.E = anb.b;
        this.a = ylbVar;
        this.b = i;
        if (Build.VERSION.SDK_INT >= 31) {
            nz4 nz4Var = new nz4(null);
            this.w = nz4Var;
            nz4Var.m(gm.L(7.0f), y00.e());
            nz4Var.n = true;
            km0Var = new km0(nz4Var, nz4Var, nz4Var);
        } else {
            this.w = null;
            kz4 kz4Var = new kz4();
            kz4Var.a(-16777216);
            km0Var = new km0(kz4Var, kz4Var, kz4Var);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(52.0f) / 2);
        addView(bf0Var, qoe.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        pn2 pn2Var = new pn2(2131231983, 0);
        this.s = pn2Var;
        pn2Var.r = gm.L(2.0f);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(gm.o());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(gm.L(1.0f), 0, gm.L(5.0f), 0);
        frameLayout.addView(textView, qoe.e(-2, -1, 81));
        addView(frameLayout, qoe.n(14.33f, 52, 48, 11, 48, 0, 0));
        im0 c = km0Var.c(textView, null, false);
        nm0 nm0Var = new nm0(ylbVar);
        nm0Var.e = new w00((byte) 19);
        nm0Var.f(1627389951, 1358954495);
        nm0Var.e(603979776, 603979776);
        nm0Var.d(0, 0);
        nm0Var.n = 0.0f;
        nm0Var.r = 0.0f;
        float N = gm.N(0.43f);
        float N2 = gm.N(0.43f);
        nm0Var.f = N;
        nm0Var.h = N2;
        c.p(nm0Var);
        c.r(gm.L(7.0f));
        this.x = c;
        textView.setBackground(c);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTypeface(gm.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, qoe.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        bf0 bf0Var2 = new bf0(context);
        this.e = bf0Var2;
        bf0Var2.setRoundRadius(gm.L(8.0f));
        bf0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final xo2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                xo2 xo2Var = this.b;
                switch (b) {
                    case 0:
                        uo2 uo2Var = xo2Var.F;
                        if (uo2Var != null) {
                            long j = xo2Var.H;
                            wp2 wp2Var = ((xp2) uo2Var).h;
                            if (wp2Var != null) {
                                wp2Var.H(j);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        uo2 uo2Var2 = xo2Var.F;
                        if (uo2Var2 != null) {
                            long j2 = xo2Var.H;
                            wp2 wp2Var2 = ((xp2) uo2Var2).h;
                            if (wp2Var2 != null) {
                                wp2Var2.H(j2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        uo2 uo2Var3 = xo2Var.F;
                        if (uo2Var3 != null) {
                            ((xp2) uo2Var3).g(xo2Var.G, false);
                            return;
                        }
                        return;
                    default:
                        uo2 uo2Var4 = xo2Var.F;
                        if (uo2Var4 != null) {
                            ((xp2) uo2Var4).g(xo2Var.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(bf0Var2, qoe.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final xo2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                xo2 xo2Var = this.b;
                switch (b) {
                    case 0:
                        uo2 uo2Var = xo2Var.F;
                        if (uo2Var != null) {
                            long j = xo2Var.H;
                            wp2 wp2Var = ((xp2) uo2Var).h;
                            if (wp2Var != null) {
                                wp2Var.H(j);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        uo2 uo2Var2 = xo2Var.F;
                        if (uo2Var2 != null) {
                            long j2 = xo2Var.H;
                            wp2 wp2Var2 = ((xp2) uo2Var2).h;
                            if (wp2Var2 != null) {
                                wp2Var2.H(j2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        uo2 uo2Var3 = xo2Var.F;
                        if (uo2Var3 != null) {
                            ((xp2) uo2Var3).g(xo2Var.G, false);
                            return;
                        }
                        return;
                    default:
                        uo2 uo2Var4 = xo2Var.F;
                        if (uo2Var4 != null) {
                            ((xp2) uo2Var4).g(xo2Var.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView m = wi8.m(linearLayout, textView3, qoe.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.n = m;
        m.setTextSize(1, 13.0f);
        int L = gm.L(12.0f);
        int i2 = cmb.C6;
        ShapeDrawable b0 = cmb.b0(L, cmb.p1(0.14f, cmb.v0(i2, ylbVar)));
        wmb K = anb.K(0.14f, i2);
        m.setBackground(b0);
        anb.j(m, b0, K, null, ylbVar);
        m.setPadding(gm.L(4.0f), gm.L(1.0f), gm.L(8.0f), gm.L(1.66f));
        m.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new pn2(2131231947, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) jb6.M0(2131751836, null));
        m.setText(spannableStringBuilder);
        m.setVisibility(8);
        linearLayout.addView(m, qoe.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        b61 b61Var = new b61(ylbVar, context, true);
        this.r = b61Var;
        b61Var.setUseWrapContent(true);
        b61Var.setPadding(gm.L(15.0f), 0, gm.L(15.0f), 0);
        b61Var.f();
        b61Var.e();
        int i3 = cmb.y6;
        b61Var.setColor(cmb.p1(0.14f, cmb.v0(i3, ylbVar)));
        b61Var.setTextColor(cmb.w0(null, cmb.F6, false));
        if (b61Var.getBackground() != null) {
            Drawable background = b61Var.getBackground();
            wmb K2 = anb.K(0.14f, i3);
            b61Var.setBackground(background);
            anb.j(b61Var, background, K2, null, ylbVar);
        }
        b61Var.i(jb6.M0(2131751541, null), false, true);
        b61Var.setOnClickListener(new View.OnClickListener(this) {
            public final xo2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                xo2 xo2Var = this.b;
                switch (b) {
                    case 0:
                        uo2 uo2Var = xo2Var.F;
                        if (uo2Var != null) {
                            long j = xo2Var.H;
                            wp2 wp2Var = ((xp2) uo2Var).h;
                            if (wp2Var != null) {
                                wp2Var.H(j);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        uo2 uo2Var2 = xo2Var.F;
                        if (uo2Var2 != null) {
                            long j2 = xo2Var.H;
                            wp2 wp2Var2 = ((xp2) uo2Var2).h;
                            if (wp2Var2 != null) {
                                wp2Var2.H(j2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        uo2 uo2Var3 = xo2Var.F;
                        if (uo2Var3 != null) {
                            ((xp2) uo2Var3).g(xo2Var.G, false);
                            return;
                        }
                        return;
                    default:
                        uo2 uo2Var4 = xo2Var.F;
                        if (uo2Var4 != null) {
                            ((xp2) uo2Var4).g(xo2Var.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(b61Var, qoe.q(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        b61 b61Var2 = new b61(ylbVar, context, true);
        b61Var2.setUseWrapContent(true);
        b61Var2.setPadding(gm.L(15.0f), 0, gm.L(15.0f), 0);
        b61Var2.f();
        b61Var2.i(jb6.M0(2131754483, null), false, true);
        b61Var2.setOnClickListener(new View.OnClickListener(this) {
            public final xo2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                xo2 xo2Var = this.b;
                switch (b) {
                    case 0:
                        uo2 uo2Var = xo2Var.F;
                        if (uo2Var != null) {
                            long j = xo2Var.H;
                            wp2 wp2Var = ((xp2) uo2Var).h;
                            if (wp2Var != null) {
                                wp2Var.H(j);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        uo2 uo2Var2 = xo2Var.F;
                        if (uo2Var2 != null) {
                            long j2 = xo2Var.H;
                            wp2 wp2Var2 = ((xp2) uo2Var2).h;
                            if (wp2Var2 != null) {
                                wp2Var2.H(j2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        uo2 uo2Var3 = xo2Var.F;
                        if (uo2Var3 != null) {
                            ((xp2) uo2Var3).g(xo2Var.G, false);
                            return;
                        }
                        return;
                    default:
                        uo2 uo2Var4 = xo2Var.F;
                        if (uo2Var4 != null) {
                            ((xp2) uo2Var4).g(xo2Var.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(b61Var2, qoe.q(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, qoe.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, qoe.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i = this.E;
        int i2 = anb.b;
        if (i != i2) {
            this.E = i2;
            try {
                b61 b61Var = this.r;
                if (b61Var != null) {
                    b61Var.setTextColor(cmb.w0(null, cmb.F6, false));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        if (this.y) {
            canvas2 = canvas;
            canvas2.drawLine(gm.L(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, cmb.j0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        nz4 nz4Var;
        bf0 bf0Var;
        if (Build.VERSION.SDK_INT >= 31 && (nz4Var = this.w) != null && view == (bf0Var = this.c)) {
            int L = gm.L(9.0f);
            int left = bf0Var.getLeft() - L;
            int top = bf0Var.getTop() - L;
            int L2 = gm.L(52.0f) + (L << 1);
            RecordingCanvas i = nz4Var.i(L2, L2);
            i.translate(-left, -top);
            i.drawColor(cmb.v0(cmb.c6, this.a));
            i.save();
            float f = L2 / 2.0f;
            i.scale(1.125f, 1.125f, f, f);
            super.drawChild(i, view, j);
            i.restore();
            i.drawColor(536870912);
            nz4Var.j();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int left = this.d.getLeft();
        this.x.i(gm.L(9.0f) + left, gm.L(48.0f));
    }

    @Override
    public final void updateColors() {
        int i = cmb.F6;
        ylb ylbVar = this.a;
        this.f.setTextColor(cmb.v0(i, ylbVar));
        int i2 = cmb.y6;
        this.h.setTextColor(cmb.v0(i2, ylbVar));
        this.n.setTextColor(cmb.v0(i2, ylbVar));
    }
}
