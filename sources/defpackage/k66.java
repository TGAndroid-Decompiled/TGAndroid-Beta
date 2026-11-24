package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class k66 extends FrameLayout implements tjb {
    public final m66 E;
    public final ch0 a;
    public final SpannableStringBuilder b;
    public final yf2 c;
    public final TextView d;
    public final yf2 e;
    public final TextView f;
    public final av9 h;
    public final i66 n;
    public boolean r;
    public float s;
    public ValueAnimator w;
    public float x;
    public ValueAnimator y;

    public k66(m66 m66Var, Context context) {
        super(context);
        int i;
        int i2;
        this.E = m66Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        linearLayout.setGravity(i);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        ir2.t(textView, 1, 15.0f);
        int i3 = bkb.K6;
        zkb.X(textView, i3, null);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2);
        textView.setText(k96.N0("LiteBatteryTitle"));
        linearLayout.addView(textView, nme.r(-2, -2, 16));
        yf2 yf2Var = new yf2(context, true, false, false);
        yf2Var.w = bkb.b0(gl.L(4.0f), bkb.p1(0.15f, bkb.w0(null, i3, false)));
        this.c = yf2Var;
        yf2Var.setTypeface(gl.o());
        yf2Var.setPadding(gl.L(5.33f), gl.L(2.0f), gl.L(5.33f), gl.L(2.0f));
        yf2Var.setTextSize(gl.L(12.0f));
        zkb.U(yf2Var, i3, null);
        linearLayout.addView(yf2Var, nme.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, nme.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        av9 av9Var = new av9(null, context, true);
        this.h = av9Var;
        av9Var.setReportChanges(true);
        av9Var.setDelegate(new pj4(this, (byte) 10));
        av9Var.setProgress(e66.c() / 100.0f);
        av9Var.setImportantForAccessibility(2);
        addView(av9Var, nme.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i4 = bkb.x6;
        textView2.setTextColor(bkb.w0(null, i4, false));
        textView2.setGravity(3);
        textView2.setText(k96.M0(2131748682, null));
        frameLayout.addView(textView2, nme.e(-2, -2, 19));
        yf2 yf2Var2 = new yf2(this, context);
        this.e = yf2Var2;
        yf2Var2.b(0.45f, 240L, s33.h);
        yf2Var2.setGravity(1);
        yf2Var2.setTextSize(gl.L(13.0f));
        zkb.U(yf2Var2, bkb.m6, null);
        frameLayout.addView(yf2Var2, nme.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.b = spannableStringBuilder;
        ch0 ch0Var = new ch0();
        this.a = ch0Var;
        ch0Var.a = yf2Var2.getPaint();
        ch0Var.f = gl.L(1.5f);
        ch0Var.setBounds(gl.L(3.0f), gl.L(-20.0f), gl.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(ch0Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(bkb.w0(null, i4, false));
        textView3.setGravity(5);
        textView3.setText(k96.M0(2131748681, null));
        frameLayout.addView(textView3, nme.e(-2, -2, 21));
        addView(frameLayout, nme.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.n = new i66(this, (byte) 0);
        a();
    }

    public final void a() {
        int i;
        boolean z;
        float f;
        float f2;
        int c = e66.c();
        yf2 yf2Var = this.e;
        yf2Var.a();
        if (c <= 0) {
            yf2Var.c(k96.M0(2131748684, null), !k96.a0, true);
        } else if (c >= 100) {
            yf2Var.c(k96.M0(2131748683, null), !k96.a0, true);
        } else {
            float f3 = c;
            this.a.a(true, f3 / 100.0f);
            yf2Var.c(gl.G2(k96.M0(2131748675, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f3))), this.b), "%s"), !k96.a0, true);
        }
        if (e66.f()) {
            i = 2131748681;
        } else {
            i = 2131748682;
        }
        String upperCase = k96.M0(i, null).toUpperCase();
        yf2 yf2Var2 = this.c;
        yf2Var2.setText(upperCase);
        if (c > 0 && c < 100) {
            z = true;
        } else {
            z = false;
        }
        float f4 = 0.0f;
        if (z != this.r) {
            this.r = z;
            yf2Var2.clearAnimation();
            ViewPropertyAnimator animate = yf2Var2.animate();
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            ug8.t(animate.alpha(f2), s33.h, 220L);
        }
        if (c >= 100) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (this.s != f) {
            this.s = f;
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, f);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final k66 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    byte b = r2;
                    k66 k66Var = this.b;
                    switch (b) {
                        case 0:
                            TextView textView = k66Var.f;
                            int w0 = bkb.w0(null, bkb.x6, false);
                            int w02 = bkb.w0(null, bkb.m6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            k66Var.s = floatValue;
                            textView.setTextColor(bm2.f(floatValue, w0, w02));
                            return;
                        default:
                            TextView textView2 = k66Var.d;
                            int w03 = bkb.w0(null, bkb.x6, false);
                            int w04 = bkb.w0(null, bkb.m6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            k66Var.x = floatValue2;
                            textView2.setTextColor(bm2.f(floatValue2, w03, w04));
                            return;
                    }
                }
            });
            this.w.addListener(new j66(this, f, (byte) 0));
            this.w.setInterpolator(s33.h);
            this.w.setDuration(320L);
            this.w.start();
        }
        if (c <= 0) {
            f4 = 1.0f;
        }
        if (this.x != f4) {
            this.x = f4;
            ValueAnimator valueAnimator2 = this.y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.x, f4);
            this.y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final k66 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    byte b = r2;
                    k66 k66Var = this.b;
                    switch (b) {
                        case 0:
                            TextView textView = k66Var.f;
                            int w0 = bkb.w0(null, bkb.x6, false);
                            int w02 = bkb.w0(null, bkb.m6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            k66Var.s = floatValue;
                            textView.setTextColor(bm2.f(floatValue, w0, w02));
                            return;
                        default:
                            TextView textView2 = k66Var.d;
                            int w03 = bkb.w0(null, bkb.x6, false);
                            int w04 = bkb.w0(null, bkb.m6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            k66Var.x = floatValue2;
                            textView2.setTextColor(bm2.f(floatValue2, w03, w04));
                            return;
                    }
                }
            });
            this.y.addListener(new j66(this, f4, (byte) 1));
            this.y.setInterpolator(s33.h);
            this.y.setDuration(320L);
            this.y.start();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.x6));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        return this.n.performAccessibilityAction(this, i, bundle);
    }

    @Override
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.w;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    textView.setTextColor(bm2.f(this.s, bkb.w0(null, bkb.x6, false), bkb.w0(null, bkb.m6, false)));
                }
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(bm2.f(this.x, bkb.w0(null, bkb.x6, false), bkb.w0(null, bkb.m6, false)));
        }
        yf2 yf2Var = this.c;
        if (yf2Var != null) {
            yf2Var.invalidate();
        }
    }
}
