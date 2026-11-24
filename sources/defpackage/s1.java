package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public abstract class s1 extends FrameLayout implements vlb {
    public static final int d0 = gm.L(76.0f);
    public static final int e0 = -2146483649;
    public StaticLayout E;
    public final i66 F;
    public p1 G;
    public qa6 H;
    public final d I;
    public final ylb J;
    public final FrameLayout K;
    public final fg0 L;
    public StaticLayout M;
    public StaticLayout[] N;
    public int O;
    public Point[] P;
    public boolean Q;
    public boolean R;
    public int S;
    public final Paint T;
    public final float U;
    public final o1 V;
    public float W;
    public StaticLayout a;
    public ValueAnimator a0;
    public String b;
    public int b0;
    public int c;
    public boolean c0;
    public int d;
    public SpannableStringBuilder e;
    public SpannableStringBuilder f;
    public final TextView h;
    public final l1 n;
    public final FrameLayout r;
    public final FrameLayout s;
    public final Drawable w;
    public m66 x;
    public float y;

    public s1(Context context, d dVar, ylb ylbVar) {
        super(context);
        int i;
        new b66(0);
        this.N = null;
        this.O = -1;
        this.Q = false;
        Paint paint = new Paint();
        this.T = paint;
        this.U = gm.L(3.0f);
        this.V = new o1(this, (byte) 0);
        this.W = 0.0f;
        this.b0 = 0;
        this.c0 = false;
        this.J = ylbVar;
        this.I = dVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.F = new i66(frameLayout);
        this.L = cmb.Y(cmb.v0(cmb.h6, ylbVar), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        anb.X(textView, cmb.y6, ylbVar);
        wi8.w(textView, 1, 13.0f, 1, 1);
        textView.setSingleLine(true);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i);
        textView.setImportantForAccessibility(2);
        textView.setFocusable(false);
        frameLayout.addView(textView, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        Drawable d = b10.d(context, 2131231229);
        int i2 = cmb.c6;
        anb.x(this, d, i2, ylbVar, PorterDuff.Mode.SRC_ATOP);
        frameLayout2.setBackground(d);
        addView(frameLayout2, qoe.d(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, qoe.e(-1, -1, 55));
        ?? textView2 = new TextView(context);
        textView2.a = false;
        this.n = textView2;
        anb.X(textView2, cmb.m6, ylbVar);
        textView2.setTextSize(1, 16.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setText(jb6.M0(2131751398, null));
        textView2.setOnClickListener(new j1(this, (byte) 0));
        textView2.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.r = frameLayout3;
        Drawable d2 = b10.d(context, 2131231230);
        this.w = d2;
        anb.x(this, d2, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
        frameLayout3.setBackground(d2);
        frameLayout3.setPadding(gm.L(4.0f) + frameLayout3.getPaddingLeft(), gm.L(1.0f), 0, gm.L(3.0f));
        frameLayout3.addView((View) textView2, qoe.c(-2.0f, -2));
        addView(frameLayout3, qoe.d(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / gm.p), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / gm.p), 6.0f));
        paint.setColor(cmb.v0(i2, ylbVar));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), cmb.O1, Math.max(1, i)).setBreakStrategy(0).setHyphenationFrequency(0);
            if (jb6.a0) {
                alignment = oya.a();
            } else {
                Layout.Alignment[] alignmentArr = oya.a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, cmb.O1, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    private void setHeight(int i) {
        g69 g69Var = (g69) getLayoutParams();
        boolean z = true;
        if (g69Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            g69Var = new g69(-1, i);
        } else {
            if (((ViewGroup.MarginLayoutParams) g69Var).height == i) {
                z = false;
            }
            ((ViewGroup.MarginLayoutParams) g69Var).height = i;
        }
        if (z) {
            setLayoutParams(g69Var);
        }
    }

    private void setShowMoreMarginBottom(int i) {
        FrameLayout frameLayout = this.r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.bottomMargin != i) {
            layoutParams.bottomMargin = i;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void a(int i, boolean z) {
        boolean z2;
        int i2;
        int height;
        boolean z3;
        float f;
        int i3 = 0;
        if (this.R) {
            this.c0 = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.e;
        FrameLayout frameLayout = this.K;
        l1 l1Var = this.n;
        if (spannableStringBuilder != null && (i != this.b0 || z)) {
            StaticLayout c = c(i, spannableStringBuilder);
            this.a = c;
            if (c.getLineCount() >= 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.c0 = z2;
            int lineCount = this.a.getLineCount();
            FrameLayout frameLayout2 = this.r;
            if (lineCount >= 3 && this.c0) {
                int max = Math.max(this.a.getLineStart(2), this.a.getLineEnd(2));
                if (this.e.charAt(max - 1) == '\n') {
                    max--;
                }
                int i4 = max - 1;
                if (this.e.charAt(i4) != ' ' && this.e.charAt(i4) != '\n') {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.Q = z3;
                this.M = c(i, this.e.subSequence(0, max));
                this.N = new StaticLayout[this.a.getLineCount() - 3];
                this.P = new Point[this.a.getLineCount() - 3];
                float lineRight = this.M.getLineRight(this.M.getLineCount() - 1);
                boolean z4 = this.Q;
                float f2 = this.U;
                if (z4) {
                    f = f2;
                } else {
                    f = 0.0f;
                }
                float f3 = lineRight + f;
                this.O = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i5 = e0;
                    frameLayout2.measure(i5, i5);
                }
                for (int i6 = 3; i6 < this.a.getLineCount(); i6++) {
                    int lineStart = this.a.getLineStart(i6);
                    int lineEnd = this.a.getLineEnd(i6);
                    StaticLayout c2 = c(i, this.e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i7 = i6 - 3;
                    this.N[i7] = c2;
                    this.P[i7] = new Point();
                    if (this.O == -1) {
                        if (f3 > frameLayout2.getPaddingLeft() + (i - frameLayout2.getMeasuredWidth())) {
                            this.O = i7;
                        }
                    }
                    f3 += c2.getLineRight(0) + f2;
                }
                if (f3 < frameLayout2.getPaddingLeft() + (i - frameLayout2.getMeasuredWidth())) {
                    this.c0 = false;
                }
            }
            if (!this.c0) {
                this.M = null;
                this.N = null;
            }
            this.b0 = i;
            frameLayout.setMinimumHeight(g());
            if (this.c0 && this.M != null) {
                if (this.h.getVisibility() == 0) {
                    i2 = gm.L(20.0f);
                } else {
                    i2 = 0;
                }
                int min = Math.min(d0 + i2, g()) - gm.L(8.0f);
                StaticLayout staticLayout = this.M;
                int lineBottom = ((min - staticLayout.getLineBottom(staticLayout.getLineCount() - 1)) - frameLayout2.getPaddingBottom()) - l1Var.getPaddingBottom();
                if (l1Var.getLayout() == null) {
                    height = 0;
                } else {
                    height = l1Var.getLayout().getHeight() - l1Var.getLayout().getLineBottom(l1Var.getLineCount() - 1);
                }
                setShowMoreMarginBottom(lineBottom - height);
            }
        }
        if (!this.c0) {
            i3 = 8;
        }
        l1Var.setVisibility(i3);
        if (!this.c0 && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.L);
        }
        if (this.c0 && this.W < 1.0f && frameLayout.getBackground() != null) {
            frameLayout.setBackground(null);
        }
    }

    public final m66 b(StaticLayout staticLayout, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        try {
            int lineForVertical = staticLayout.getLineForVertical(i6);
            float f = i5;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f);
            float lineLeft = staticLayout.getLineLeft(lineForVertical);
            if (lineLeft <= f && lineLeft + staticLayout.getLineWidth(lineForVertical) >= f && i6 >= 0 && i6 <= staticLayout.getHeight()) {
                Spannable spannable = (Spannable) staticLayout.getText();
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0 && !gm.A1()) {
                    m66 m66Var = new m66(clickableSpanArr[0], this.J, i3, i4, 0);
                    int v0 = cmb.v0(cmb.Be, this.J);
                    RectF rectF = ProfileActivity.e7;
                    m66Var.d(v0);
                    int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                    int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
                    b66 b = m66Var.b();
                    float f2 = i2;
                    this.y = f2;
                    b.d(staticLayout, spanStart, f2);
                    staticLayout.getSelectionPath(spanStart, spanEnd, b);
                    return m66Var;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public final void d(ClickableSpan clickableSpan, Layout layout, float f) {
        p1 p1Var = this.G;
        p1 p1Var2 = null;
        if (p1Var != null) {
            p1Var.a(false);
            this.G = null;
        }
        if (layout != null && clickableSpan != null) {
            p1Var2 = new p1(this, layout, clickableSpan, f);
        }
        this.G = p1Var2;
        if (clickableSpan instanceof g6c) {
            String url = ((g6c) clickableSpan).getURL();
            if (!url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$") && !url.startsWith("/")) {
                return;
            }
            p1 p1Var3 = this.G;
            ProfileActivity profileActivity = ((fq8) this).f0.e;
            RectF rectF = ProfileActivity.e7;
            profileActivity.i3(url, p1Var3);
        } else if (clickableSpan instanceof URLSpan) {
            String url2 = ((URLSpan) clickableSpan).getURL();
            if (gm.D3(url2)) {
                ik.o0(this.I, url2, true, true, true, false, this.G, null, null);
                return;
            }
            l11.s(getContext(), Uri.parse(url2), true, true, this.G);
        } else {
            clickableSpan.onClick(this);
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s1.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public final void e() {
        this.F.e(true);
        this.x = null;
        gm.r(this.V);
        invalidate();
    }

    public final void f(String str, String str2, boolean z) {
        String str3;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.b)) {
            try {
                str3 = gm.U.matcher(str).replaceAll("\u200c");
            } catch (Throwable unused) {
                str3 = str;
            }
            try {
                this.b = str3;
            } catch (Throwable unused2) {
                this.b = str;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            this.e = spannableStringBuilder;
            this.f = null;
            k47.e(false, spannableStringBuilder, false, false, !z);
            gw3.l(this.e, cmb.O1.getFontMetricsInt(), false);
            int i = this.b0;
            if (i <= 0) {
                i = gm.q.x - gm.L(36.0f);
                this.b0 = i;
            }
            a(i, true);
            i();
            TextView textView = this.h;
            int visibility = textView.getVisibility();
            if (TextUtils.isEmpty(str2)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str2);
                textView.setVisibility(0);
            }
            if (visibility != textView.getVisibility()) {
                a(this.b0, true);
            }
            requestLayout();
        }
    }

    public final int g() {
        int L;
        StaticLayout staticLayout = this.a;
        if (staticLayout != null) {
            L = staticLayout.getHeight();
        } else {
            L = gm.L(20.0f);
        }
        int L2 = gm.L(16.0f) + L;
        if (this.h.getVisibility() == 0) {
            return gm.L(23.0f) + L2;
        }
        return L2;
    }

    public final void h() {
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.a0 = null;
        }
        float f = this.W;
        g();
        Typeface typeface = gm.a;
        this.a0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ?? obj = new Object();
        obj.a = 0.0f;
        obj.b = 0.0f;
        this.a0.addUpdateListener(new k1(this, new AtomicReference(Float.valueOf(f)), f, 1.0f, (r1) obj));
        this.a0.addListener(new g0(this, (byte) 1));
        this.a0.setDuration(Math.abs(f - 1.0f) * 1250.0f * 2.0f);
        this.a0.start();
    }

    public final int i() {
        int i;
        int g = g();
        if (this.h.getVisibility() == 0) {
            i = gm.L(20.0f);
        } else {
            i = 0;
        }
        float min = Math.min(d0 + i, g());
        if (this.c0) {
            g = (int) gm.R1(min, g, this.W);
        }
        setHeight(g);
        return g;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.a != null) {
            SpannableStringBuilder spannableStringBuilder = this.f;
            if (spannableStringBuilder == null) {
                SpannableStringBuilder spannableStringBuilder2 = this.e;
                if (spannableStringBuilder2 == null) {
                    spannableStringBuilder = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class);
                    if (clickableSpanArr != null && clickableSpanArr.length != 0) {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.e);
                        for (ClickableSpan clickableSpan : clickableSpanArr) {
                            int spanStart = spannableStringBuilder3.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder3.getSpanEnd(clickableSpan);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                spannableStringBuilder3.removeSpan(clickableSpan);
                                spannableStringBuilder3.setSpan(new q1(this, clickableSpan, (byte) 0), spanStart, spanEnd, 33);
                            }
                        }
                        this.f = spannableStringBuilder3;
                        spannableStringBuilder = spannableStringBuilder3;
                    } else {
                        spannableStringBuilder = this.e;
                        this.f = spannableStringBuilder;
                    }
                }
            }
            CharSequence text = this.h.getText();
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(spannableStringBuilder);
            } else {
                accessibilityNodeInfo.setText(TextUtils.concat(text, ": ", spannableStringBuilder));
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        a(View.MeasureSpec.getSize(i) - gm.L(36.0f), false);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i(), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMoreButtonDisabled(boolean z) {
        this.R = z;
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = cmb.O1;
        int i = cmb.Wc;
        ylb ylbVar = this.J;
        int v0 = cmb.v0(i, ylbVar);
        RectF rectF = ProfileActivity.e7;
        textPaint.linkColor = v0;
        try {
            int v02 = cmb.v0(cmb.h6, ylbVar);
            fg0 fg0Var = this.L;
            if (fg0Var != null && v02 != this.S) {
                this.S = v02;
                cmb.F1(fg0Var, v02, true);
            }
            this.T.setColor(cmb.v0(cmb.c6, ylbVar));
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
