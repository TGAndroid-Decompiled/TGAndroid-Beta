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
public final class k86 extends FrameLayout implements vlb {
    public final m86 E;
    public final ci0 a;
    public final SpannableStringBuilder b;
    public final mh2 c;
    public final TextView d;
    public final mh2 e;
    public final TextView f;
    public final dx9 h;
    public final i86 n;
    public boolean r;
    public float s;
    public ValueAnimator w;
    public float x;
    public ValueAnimator y;

    public k86(m86 m86Var, Context context) {
        super(context);
        int i;
        int i2;
        this.E = m86Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        linearLayout.setGravity(i);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        ts2.s(textView, 1, 15.0f);
        int i3 = cmb.K6;
        anb.X(textView, i3, null);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2);
        textView.setText(jb6.N0("LiteBatteryTitle"));
        linearLayout.addView(textView, qoe.r(-2, -2, 16));
        mh2 mh2Var = new mh2(context, true, false, false);
        mh2Var.w = cmb.b0(gm.L(4.0f), cmb.p1(0.15f, cmb.w0(null, i3, false)));
        this.c = mh2Var;
        mh2Var.setTypeface(gm.o());
        mh2Var.setPadding(gm.L(5.33f), gm.L(2.0f), gm.L(5.33f), gm.L(2.0f));
        mh2Var.setTextSize(gm.L(12.0f));
        anb.U(mh2Var, i3, null);
        linearLayout.addView(mh2Var, qoe.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, qoe.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        dx9 dx9Var = new dx9(null, context, true);
        this.h = dx9Var;
        dx9Var.setReportChanges(true);
        dx9Var.setDelegate(new k44(this, (byte) 12));
        dx9Var.setProgress(e86.c() / 100.0f);
        dx9Var.setImportantForAccessibility(2);
        addView(dx9Var, qoe.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i4 = cmb.x6;
        textView2.setTextColor(cmb.w0(null, i4, false));
        textView2.setGravity(3);
        textView2.setText(jb6.M0(2131748631, null));
        frameLayout.addView(textView2, qoe.e(-2, -2, 19));
        mh2 mh2Var2 = new mh2(this, context);
        this.e = mh2Var2;
        mh2Var2.b(0.45f, 240L, d53.h);
        mh2Var2.setGravity(1);
        mh2Var2.setTextSize(gm.L(13.0f));
        anb.U(mh2Var2, cmb.m6, null);
        frameLayout.addView(mh2Var2, qoe.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.b = spannableStringBuilder;
        ci0 ci0Var = new ci0();
        this.a = ci0Var;
        ci0Var.a = mh2Var2.getPaint();
        ci0Var.f = gm.L(1.5f);
        ci0Var.setBounds(gm.L(3.0f), gm.L(-20.0f), gm.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(ci0Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(cmb.w0(null, i4, false));
        textView3.setGravity(5);
        textView3.setText(jb6.M0(2131748630, null));
        frameLayout.addView(textView3, qoe.e(-2, -2, 21));
        addView(frameLayout, qoe.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.n = new i86(this, (byte) 0);
        a();
    }

    public final void a() {
        int i;
        boolean z;
        float f;
        float f2;
        int c = e86.c();
        mh2 mh2Var = this.e;
        mh2Var.a();
        if (c <= 0) {
            mh2Var.c(jb6.M0(2131748633, null), !jb6.a0, true);
        } else if (c >= 100) {
            mh2Var.c(jb6.M0(2131748632, null), !jb6.a0, true);
        } else {
            float f3 = c;
            this.a.a(true, f3 / 100.0f);
            mh2Var.c(gm.G2(jb6.M0(2131748624, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f3))), this.b), "%s"), !jb6.a0, true);
        }
        if (e86.f()) {
            i = 2131748630;
        } else {
            i = 2131748631;
        }
        String upperCase = jb6.M0(i, null).toUpperCase();
        mh2 mh2Var2 = this.c;
        mh2Var2.setText(upperCase);
        if (c > 0 && c < 100) {
            z = true;
        } else {
            z = false;
        }
        float f4 = 0.0f;
        if (z != this.r) {
            this.r = z;
            mh2Var2.clearAnimation();
            ViewPropertyAnimator animate = mh2Var2.animate();
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            wi8.t(animate.alpha(f2), d53.h, 220L);
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
                public final k86 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    byte b = r2;
                    k86 k86Var = this.b;
                    switch (b) {
                        case 0:
                            TextView textView = k86Var.f;
                            int w0 = cmb.w0(null, cmb.x6, false);
                            int w02 = cmb.w0(null, cmb.m6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            k86Var.s = floatValue;
                            textView.setTextColor(on2.f(floatValue, w0, w02));
                            return;
                        default:
                            TextView textView2 = k86Var.d;
                            int w03 = cmb.w0(null, cmb.x6, false);
                            int w04 = cmb.w0(null, cmb.m6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            k86Var.x = floatValue2;
                            textView2.setTextColor(on2.f(floatValue2, w03, w04));
                            return;
                    }
                }
            });
            this.w.addListener(new j86(this, f, (byte) 0));
            this.w.setInterpolator(d53.h);
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
                public final k86 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    byte b = r2;
                    k86 k86Var = this.b;
                    switch (b) {
                        case 0:
                            TextView textView = k86Var.f;
                            int w0 = cmb.w0(null, cmb.x6, false);
                            int w02 = cmb.w0(null, cmb.m6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            k86Var.s = floatValue;
                            textView.setTextColor(on2.f(floatValue, w0, w02));
                            return;
                        default:
                            TextView textView2 = k86Var.d;
                            int w03 = cmb.w0(null, cmb.x6, false);
                            int w04 = cmb.w0(null, cmb.m6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            k86Var.x = floatValue2;
                            textView2.setTextColor(on2.f(floatValue2, w03, w04));
                            return;
                    }
                }
            });
            this.y.addListener(new j86(this, f4, (byte) 1));
            this.y.setInterpolator(d53.h);
            this.y.setDuration(320L);
            this.y.start();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.x6));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(112.0f), 1073741824));
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
                    textView.setTextColor(on2.f(this.s, cmb.w0(null, cmb.x6, false), cmb.w0(null, cmb.m6, false)));
                }
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(on2.f(this.x, cmb.w0(null, cmb.x6, false), cmb.w0(null, cmb.m6, false)));
        }
        mh2 mh2Var = this.c;
        if (mh2Var != null) {
            mh2Var.invalidate();
        }
    }
}
