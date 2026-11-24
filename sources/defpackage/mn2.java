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
public final class mn2 extends FrameLayout implements tjb {
    public static final int I = 0;
    public int E;
    public jn2 F;
    public long G;
    public long H;
    public final wjb a;
    public final int b;
    public final be0 c;
    public final TextView d;
    public final be0 e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final u41 r;
    public final cm2 s;
    public final lx4 w;
    public final il0 x;
    public boolean y;

    public mn2(int i, wjb wjbVar, Context context) {
        super(context);
        kl0 kl0Var;
        this.E = zkb.b;
        this.a = wjbVar;
        this.b = i;
        if (Build.VERSION.SDK_INT >= 31) {
            lx4 lx4Var = new lx4(null);
            this.w = lx4Var;
            lx4Var.m(gl.L(7.0f), yz.e());
            lx4Var.n = true;
            kl0Var = new kl0(lx4Var, lx4Var, lx4Var);
        } else {
            this.w = null;
            ix4 ix4Var = new ix4();
            ix4Var.a(-16777216);
            kl0Var = new kl0(ix4Var, ix4Var, ix4Var);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        be0 be0Var = new be0(context);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(52.0f) / 2);
        addView(be0Var, nme.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        cm2 cm2Var = new cm2(2131231982, 0);
        this.s = cm2Var;
        cm2Var.r = gl.L(2.0f);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(gl.o());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(gl.L(1.0f), 0, gl.L(5.0f), 0);
        frameLayout.addView(textView, nme.e(-2, -1, 81));
        addView(frameLayout, nme.n(14.33f, 52, 48, 11, 48, 0, 0));
        il0 c = kl0Var.c(textView, null, false);
        nl0 nl0Var = new nl0(wjbVar);
        nl0Var.e = new wz((byte) 19);
        nl0Var.f(1627389951, 1358954495);
        nl0Var.e(603979776, 603979776);
        nl0Var.d(0, 0);
        nl0Var.n = 0.0f;
        nl0Var.r = 0.0f;
        float N = gl.N(0.43f);
        float N2 = gl.N(0.43f);
        nl0Var.f = N;
        nl0Var.h = N2;
        c.p(nl0Var);
        c.r(gl.L(7.0f));
        this.x = c;
        textView.setBackground(c);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTypeface(gl.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, nme.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        be0 be0Var2 = new be0(context);
        this.e = be0Var2;
        be0Var2.setRoundRadius(gl.L(8.0f));
        be0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final mn2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                mn2 mn2Var = this.b;
                switch (b) {
                    case 0:
                        jn2 jn2Var = mn2Var.F;
                        if (jn2Var != null) {
                            long j = mn2Var.H;
                            lo2 lo2Var = ((mo2) jn2Var).h;
                            if (lo2Var != null) {
                                lo2Var.h0(j);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        jn2 jn2Var2 = mn2Var.F;
                        if (jn2Var2 != null) {
                            long j2 = mn2Var.H;
                            lo2 lo2Var2 = ((mo2) jn2Var2).h;
                            if (lo2Var2 != null) {
                                lo2Var2.h0(j2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        jn2 jn2Var3 = mn2Var.F;
                        if (jn2Var3 != null) {
                            ((mo2) jn2Var3).g(mn2Var.G, false);
                            return;
                        }
                        return;
                    default:
                        jn2 jn2Var4 = mn2Var.F;
                        if (jn2Var4 != null) {
                            ((mo2) jn2Var4).g(mn2Var.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(be0Var2, nme.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final mn2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                mn2 mn2Var = this.b;
                switch (b) {
                    case 0:
                        jn2 jn2Var = mn2Var.F;
                        if (jn2Var != null) {
                            long j = mn2Var.H;
                            lo2 lo2Var = ((mo2) jn2Var).h;
                            if (lo2Var != null) {
                                lo2Var.h0(j);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        jn2 jn2Var2 = mn2Var.F;
                        if (jn2Var2 != null) {
                            long j2 = mn2Var.H;
                            lo2 lo2Var2 = ((mo2) jn2Var2).h;
                            if (lo2Var2 != null) {
                                lo2Var2.h0(j2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        jn2 jn2Var3 = mn2Var.F;
                        if (jn2Var3 != null) {
                            ((mo2) jn2Var3).g(mn2Var.G, false);
                            return;
                        }
                        return;
                    default:
                        jn2 jn2Var4 = mn2Var.F;
                        if (jn2Var4 != null) {
                            ((mo2) jn2Var4).g(mn2Var.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView m = ug8.m(linearLayout, textView3, nme.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.n = m;
        m.setTextSize(1, 13.0f);
        int L = gl.L(12.0f);
        int i2 = bkb.C6;
        ShapeDrawable b0 = bkb.b0(L, bkb.p1(0.14f, bkb.v0(i2, wjbVar)));
        vkb K = zkb.K(0.14f, i2);
        m.setBackground(b0);
        zkb.j(m, b0, K, null, wjbVar);
        m.setPadding(gl.L(4.0f), gl.L(1.0f), gl.L(8.0f), gl.L(1.66f));
        m.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new cm2(2131231946, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) k96.M0(2131751887, null));
        m.setText(spannableStringBuilder);
        m.setVisibility(8);
        linearLayout.addView(m, nme.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        u41 u41Var = new u41(wjbVar, context, true);
        this.r = u41Var;
        u41Var.setUseWrapContent(true);
        u41Var.setPadding(gl.L(15.0f), 0, gl.L(15.0f), 0);
        u41Var.f();
        u41Var.e();
        int i3 = bkb.y6;
        u41Var.setColor(bkb.p1(0.14f, bkb.v0(i3, wjbVar)));
        u41Var.setTextColor(bkb.w0(null, bkb.F6, false));
        if (u41Var.getBackground() != null) {
            Drawable background = u41Var.getBackground();
            vkb K2 = zkb.K(0.14f, i3);
            u41Var.setBackground(background);
            zkb.j(u41Var, background, K2, null, wjbVar);
        }
        u41Var.i(k96.M0(2131751592, null), false, true);
        u41Var.setOnClickListener(new View.OnClickListener(this) {
            public final mn2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                mn2 mn2Var = this.b;
                switch (b) {
                    case 0:
                        jn2 jn2Var = mn2Var.F;
                        if (jn2Var != null) {
                            long j = mn2Var.H;
                            lo2 lo2Var = ((mo2) jn2Var).h;
                            if (lo2Var != null) {
                                lo2Var.h0(j);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        jn2 jn2Var2 = mn2Var.F;
                        if (jn2Var2 != null) {
                            long j2 = mn2Var.H;
                            lo2 lo2Var2 = ((mo2) jn2Var2).h;
                            if (lo2Var2 != null) {
                                lo2Var2.h0(j2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        jn2 jn2Var3 = mn2Var.F;
                        if (jn2Var3 != null) {
                            ((mo2) jn2Var3).g(mn2Var.G, false);
                            return;
                        }
                        return;
                    default:
                        jn2 jn2Var4 = mn2Var.F;
                        if (jn2Var4 != null) {
                            ((mo2) jn2Var4).g(mn2Var.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(u41Var, nme.q(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        u41 u41Var2 = new u41(wjbVar, context, true);
        u41Var2.setUseWrapContent(true);
        u41Var2.setPadding(gl.L(15.0f), 0, gl.L(15.0f), 0);
        u41Var2.f();
        u41Var2.i(k96.M0(2131754483, null), false, true);
        u41Var2.setOnClickListener(new View.OnClickListener(this) {
            public final mn2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                mn2 mn2Var = this.b;
                switch (b) {
                    case 0:
                        jn2 jn2Var = mn2Var.F;
                        if (jn2Var != null) {
                            long j = mn2Var.H;
                            lo2 lo2Var = ((mo2) jn2Var).h;
                            if (lo2Var != null) {
                                lo2Var.h0(j);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        jn2 jn2Var2 = mn2Var.F;
                        if (jn2Var2 != null) {
                            long j2 = mn2Var.H;
                            lo2 lo2Var2 = ((mo2) jn2Var2).h;
                            if (lo2Var2 != null) {
                                lo2Var2.h0(j2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        jn2 jn2Var3 = mn2Var.F;
                        if (jn2Var3 != null) {
                            ((mo2) jn2Var3).g(mn2Var.G, false);
                            return;
                        }
                        return;
                    default:
                        jn2 jn2Var4 = mn2Var.F;
                        if (jn2Var4 != null) {
                            ((mo2) jn2Var4).g(mn2Var.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(u41Var2, nme.q(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, nme.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, nme.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i = this.E;
        int i2 = zkb.b;
        if (i != i2) {
            this.E = i2;
            try {
                u41 u41Var = this.r;
                if (u41Var != null) {
                    u41Var.setTextColor(bkb.w0(null, bkb.F6, false));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        if (this.y) {
            canvas2 = canvas;
            canvas2.drawLine(gl.L(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, bkb.j0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        lx4 lx4Var;
        be0 be0Var;
        if (Build.VERSION.SDK_INT >= 31 && (lx4Var = this.w) != null && view == (be0Var = this.c)) {
            int L = gl.L(9.0f);
            int left = be0Var.getLeft() - L;
            int top = be0Var.getTop() - L;
            int L2 = gl.L(52.0f) + (L << 1);
            RecordingCanvas i = lx4Var.i(L2, L2);
            i.translate(-left, -top);
            i.drawColor(bkb.v0(bkb.c6, this.a));
            i.save();
            float f = L2 / 2.0f;
            i.scale(1.125f, 1.125f, f, f);
            super.drawChild(i, view, j);
            i.restore();
            i.drawColor(536870912);
            lx4Var.j();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int left = this.d.getLeft();
        this.x.i(gl.L(9.0f) + left, gl.L(48.0f));
    }

    @Override
    public final void updateColors() {
        int i = bkb.F6;
        wjb wjbVar = this.a;
        this.f.setTextColor(bkb.v0(i, wjbVar));
        int i2 = bkb.y6;
        this.h.setTextColor(bkb.v0(i2, wjbVar));
        this.n.setTextColor(bkb.v0(i2, wjbVar));
    }
}
