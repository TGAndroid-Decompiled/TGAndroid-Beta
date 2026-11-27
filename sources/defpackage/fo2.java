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
public final class fo2 extends FrameLayout implements snb {
    public static final int I = 0;
    public int E;
    public co2 F;
    public long G;
    public long H;
    public final vnb a;
    public final int b;
    public final de0 c;
    public final TextView d;
    public final de0 e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final c51 r;
    public final wm2 s;
    public final rz4 w;
    public final jl0 x;
    public boolean y;

    public fo2(int i, vnb vnbVar, Context context) {
        super(context);
        ll0 ll0Var;
        this.E = yob.b;
        this.a = vnbVar;
        this.b = i;
        if (Build.VERSION.SDK_INT >= 31) {
            rz4 rz4Var = new rz4(null);
            this.w = rz4Var;
            rz4Var.m(hl.L(7.0f), zz.e());
            rz4Var.n = true;
            ll0Var = new ll0(rz4Var, rz4Var, rz4Var);
        } else {
            this.w = null;
            oz4 oz4Var = new oz4();
            oz4Var.a(-16777216);
            ll0Var = new ll0(oz4Var, oz4Var, oz4Var);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        de0 de0Var = new de0(context);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(52.0f) / 2);
        addView(de0Var, tre.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        wm2 wm2Var = new wm2(2131231982, 0);
        this.s = wm2Var;
        wm2Var.r = hl.L(2.0f);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(hl.o());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(hl.L(1.0f), 0, hl.L(5.0f), 0);
        frameLayout.addView(textView, tre.e(-2, -1, 81));
        addView(frameLayout, tre.n(14.33f, 52, 48, 11, 48, 0, 0));
        jl0 c = ll0Var.c(textView, null, false);
        ol0 ol0Var = new ol0(vnbVar);
        ol0Var.e = new xz((byte) 22);
        ol0Var.f(1627389951, 1358954495);
        ol0Var.e(603979776, 603979776);
        ol0Var.d(0, 0);
        ol0Var.n = 0.0f;
        ol0Var.r = 0.0f;
        float N = hl.N(0.43f);
        float N2 = hl.N(0.43f);
        ol0Var.f = N;
        ol0Var.h = N2;
        c.p(ol0Var);
        c.r(hl.L(7.0f));
        this.x = c;
        textView.setBackground(c);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTypeface(hl.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, tre.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        de0 de0Var2 = new de0(context);
        this.e = de0Var2;
        de0Var2.setRoundRadius(hl.L(8.0f));
        de0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final fo2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                fo2 fo2Var = this.b;
                switch (b) {
                    case 0:
                        co2 co2Var = fo2Var.F;
                        if (co2Var != null) {
                            long j = fo2Var.H;
                            ep2 ep2Var = ((fp2) co2Var).h;
                            if (ep2Var != null) {
                                ep2Var.I(j);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        co2 co2Var2 = fo2Var.F;
                        if (co2Var2 != null) {
                            long j2 = fo2Var.H;
                            ep2 ep2Var2 = ((fp2) co2Var2).h;
                            if (ep2Var2 != null) {
                                ep2Var2.I(j2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        co2 co2Var3 = fo2Var.F;
                        if (co2Var3 != null) {
                            ((fp2) co2Var3).g(fo2Var.G, false);
                            return;
                        }
                        return;
                    default:
                        co2 co2Var4 = fo2Var.F;
                        if (co2Var4 != null) {
                            ((fp2) co2Var4).g(fo2Var.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        addView(de0Var2, tre.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final fo2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                fo2 fo2Var = this.b;
                switch (b) {
                    case 0:
                        co2 co2Var = fo2Var.F;
                        if (co2Var != null) {
                            long j = fo2Var.H;
                            ep2 ep2Var = ((fp2) co2Var).h;
                            if (ep2Var != null) {
                                ep2Var.I(j);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        co2 co2Var2 = fo2Var.F;
                        if (co2Var2 != null) {
                            long j2 = fo2Var.H;
                            ep2 ep2Var2 = ((fp2) co2Var2).h;
                            if (ep2Var2 != null) {
                                ep2Var2.I(j2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        co2 co2Var3 = fo2Var.F;
                        if (co2Var3 != null) {
                            ((fp2) co2Var3).g(fo2Var.G, false);
                            return;
                        }
                        return;
                    default:
                        co2 co2Var4 = fo2Var.F;
                        if (co2Var4 != null) {
                            ((fp2) co2Var4).g(fo2Var.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        TextView m = ik8.m(linearLayout, textView3, tre.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.n = m;
        m.setTextSize(1, 13.0f);
        int L = hl.L(12.0f);
        int i2 = aob.D6;
        ShapeDrawable b0 = aob.b0(L, aob.p1(0.14f, aob.v0(i2, vnbVar)));
        uob K = yob.K(0.14f, i2);
        m.setBackground(b0);
        yob.j(m, b0, K, null, vnbVar);
        m.setPadding(hl.L(4.0f), hl.L(1.0f), hl.L(8.0f), hl.L(1.66f));
        m.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new wm2(2131231946, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) ob6.M0(2131751864, null));
        m.setText(spannableStringBuilder);
        m.setVisibility(8);
        linearLayout.addView(m, tre.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        c51 c51Var = new c51(vnbVar, context, true);
        this.r = c51Var;
        c51Var.setUseWrapContent(true);
        c51Var.setPadding(hl.L(15.0f), 0, hl.L(15.0f), 0);
        c51Var.f();
        c51Var.e();
        int i3 = aob.z6;
        c51Var.setColor(aob.p1(0.14f, aob.v0(i3, vnbVar)));
        c51Var.setTextColor(aob.w0(null, aob.G6, false));
        if (c51Var.getBackground() != null) {
            Drawable background = c51Var.getBackground();
            uob K2 = yob.K(0.14f, i3);
            c51Var.setBackground(background);
            yob.j(c51Var, background, K2, null, vnbVar);
        }
        c51Var.i(ob6.M0(2131751569, null), false, true);
        c51Var.setOnClickListener(new View.OnClickListener(this) {
            public final fo2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                fo2 fo2Var = this.b;
                switch (b) {
                    case 0:
                        co2 co2Var = fo2Var.F;
                        if (co2Var != null) {
                            long j = fo2Var.H;
                            ep2 ep2Var = ((fp2) co2Var).h;
                            if (ep2Var != null) {
                                ep2Var.I(j);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        co2 co2Var2 = fo2Var.F;
                        if (co2Var2 != null) {
                            long j2 = fo2Var.H;
                            ep2 ep2Var2 = ((fp2) co2Var2).h;
                            if (ep2Var2 != null) {
                                ep2Var2.I(j2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        co2 co2Var3 = fo2Var.F;
                        if (co2Var3 != null) {
                            ((fp2) co2Var3).g(fo2Var.G, false);
                            return;
                        }
                        return;
                    default:
                        co2 co2Var4 = fo2Var.F;
                        if (co2Var4 != null) {
                            ((fp2) co2Var4).g(fo2Var.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(c51Var, tre.q(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        c51 c51Var2 = new c51(vnbVar, context, true);
        c51Var2.setUseWrapContent(true);
        c51Var2.setPadding(hl.L(15.0f), 0, hl.L(15.0f), 0);
        c51Var2.f();
        c51Var2.i(ob6.M0(2131754479, null), false, true);
        c51Var2.setOnClickListener(new View.OnClickListener(this) {
            public final fo2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                fo2 fo2Var = this.b;
                switch (b) {
                    case 0:
                        co2 co2Var = fo2Var.F;
                        if (co2Var != null) {
                            long j = fo2Var.H;
                            ep2 ep2Var = ((fp2) co2Var).h;
                            if (ep2Var != null) {
                                ep2Var.I(j);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        co2 co2Var2 = fo2Var.F;
                        if (co2Var2 != null) {
                            long j2 = fo2Var.H;
                            ep2 ep2Var2 = ((fp2) co2Var2).h;
                            if (ep2Var2 != null) {
                                ep2Var2.I(j2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        co2 co2Var3 = fo2Var.F;
                        if (co2Var3 != null) {
                            ((fp2) co2Var3).g(fo2Var.G, false);
                            return;
                        }
                        return;
                    default:
                        co2 co2Var4 = fo2Var.F;
                        if (co2Var4 != null) {
                            ((fp2) co2Var4).g(fo2Var.G, true);
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(c51Var2, tre.q(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, tre.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, tre.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i = this.E;
        int i2 = yob.b;
        if (i != i2) {
            this.E = i2;
            try {
                c51 c51Var = this.r;
                if (c51Var != null) {
                    c51Var.setTextColor(aob.w0(null, aob.G6, false));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        if (this.y) {
            canvas2 = canvas;
            canvas2.drawLine(hl.L(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, aob.j0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        rz4 rz4Var;
        de0 de0Var;
        if (Build.VERSION.SDK_INT >= 31 && (rz4Var = this.w) != null && view == (de0Var = this.c)) {
            int L = hl.L(9.0f);
            int left = de0Var.getLeft() - L;
            int top = de0Var.getTop() - L;
            int L2 = hl.L(52.0f) + (L << 1);
            RecordingCanvas i = rz4Var.i(L2, L2);
            i.translate(-left, -top);
            i.drawColor(aob.v0(aob.d6, this.a));
            i.save();
            float f = L2 / 2.0f;
            i.scale(1.125f, 1.125f, f, f);
            super.drawChild(i, view, j);
            i.restore();
            i.drawColor(536870912);
            rz4Var.j();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int left = this.d.getLeft();
        this.x.i(hl.L(9.0f) + left, hl.L(48.0f));
    }

    @Override
    public final void updateColors() {
        int i = aob.G6;
        vnb vnbVar = this.a;
        this.f.setTextColor(aob.v0(i, vnbVar));
        int i2 = aob.z6;
        this.h.setTextColor(aob.v0(i2, vnbVar));
        this.n.setTextColor(aob.v0(i2, vnbVar));
    }
}
