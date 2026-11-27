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
public final class o86 extends FrameLayout implements snb {
    public final q86 E;
    public final dh0 a;
    public final SpannableStringBuilder b;
    public final qg2 c;
    public final TextView d;
    public final qg2 e;
    public final TextView f;
    public final uy9 h;
    public final m86 n;
    public boolean r;
    public float s;
    public ValueAnimator w;
    public float x;
    public ValueAnimator y;

    public o86(q86 q86Var, Context context) {
        super(context);
        int i;
        int i2;
        this.E = q86Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        linearLayout.setGravity(i);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        bs2.t(textView, 1, 15.0f);
        int i3 = aob.L6;
        yob.X(textView, i3, null);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView.setGravity(i2);
        textView.setText(ob6.N0("LiteBatteryTitle"));
        linearLayout.addView(textView, tre.r(-2, -2, 16));
        qg2 qg2Var = new qg2(context, true, false, false);
        qg2Var.w = aob.b0(hl.L(4.0f), aob.p1(0.15f, aob.w0(null, i3, false)));
        this.c = qg2Var;
        qg2Var.setTypeface(hl.o());
        qg2Var.setPadding(hl.L(5.33f), hl.L(2.0f), hl.L(5.33f), hl.L(2.0f));
        qg2Var.setTextSize(hl.L(12.0f));
        yob.U(qg2Var, i3, null);
        linearLayout.addView(qg2Var, tre.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, tre.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        uy9 uy9Var = new uy9(null, context, true);
        this.h = uy9Var;
        uy9Var.setReportChanges(true);
        uy9Var.setDelegate(new v34(this, (byte) 11));
        uy9Var.setProgress(i86.c() / 100.0f);
        uy9Var.setImportantForAccessibility(2);
        addView(uy9Var, tre.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i4 = aob.y6;
        textView2.setTextColor(aob.w0(null, i4, false));
        textView2.setGravity(3);
        textView2.setText(ob6.M0(2131748628, null));
        frameLayout.addView(textView2, tre.e(-2, -2, 19));
        qg2 qg2Var2 = new qg2(this, context);
        this.e = qg2Var2;
        qg2Var2.b(0.45f, 240L, k43.h);
        qg2Var2.setGravity(1);
        qg2Var2.setTextSize(hl.L(13.0f));
        yob.U(qg2Var2, aob.n6, null);
        frameLayout.addView(qg2Var2, tre.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.b = spannableStringBuilder;
        dh0 dh0Var = new dh0();
        this.a = dh0Var;
        dh0Var.a = qg2Var2.getPaint();
        dh0Var.f = hl.L(1.5f);
        dh0Var.setBounds(hl.L(3.0f), hl.L(-20.0f), hl.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(dh0Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(aob.w0(null, i4, false));
        textView3.setGravity(5);
        textView3.setText(ob6.M0(2131748627, null));
        frameLayout.addView(textView3, tre.e(-2, -2, 21));
        addView(frameLayout, tre.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.n = new m86(this, (byte) 0);
        a();
    }

    public final void a() {
        int i;
        boolean z;
        float f;
        float f2;
        int c = i86.c();
        qg2 qg2Var = this.e;
        qg2Var.a();
        if (c <= 0) {
            qg2Var.c(ob6.M0(2131748630, null), !ob6.a0, true);
        } else if (c >= 100) {
            qg2Var.c(ob6.M0(2131748629, null), !ob6.a0, true);
        } else {
            float f3 = c;
            this.a.a(true, f3 / 100.0f);
            qg2Var.c(hl.G2(ob6.M0(2131748621, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f3))), this.b), "%s"), !ob6.a0, true);
        }
        if (i86.f()) {
            i = 2131748627;
        } else {
            i = 2131748628;
        }
        String upperCase = ob6.M0(i, null).toUpperCase();
        qg2 qg2Var2 = this.c;
        qg2Var2.setText(upperCase);
        if (c > 0 && c < 100) {
            z = true;
        } else {
            z = false;
        }
        float f4 = 0.0f;
        if (z != this.r) {
            this.r = z;
            qg2Var2.clearAnimation();
            ViewPropertyAnimator animate = qg2Var2.animate();
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            ik8.t(animate.alpha(f2), k43.h, 220L);
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
                public final o86 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    byte b = r2;
                    o86 o86Var = this.b;
                    switch (b) {
                        case 0:
                            TextView textView = o86Var.f;
                            int w0 = aob.w0(null, aob.y6, false);
                            int w02 = aob.w0(null, aob.n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            o86Var.s = floatValue;
                            textView.setTextColor(vm2.f(floatValue, w0, w02));
                            return;
                        default:
                            TextView textView2 = o86Var.d;
                            int w03 = aob.w0(null, aob.y6, false);
                            int w04 = aob.w0(null, aob.n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            o86Var.x = floatValue2;
                            textView2.setTextColor(vm2.f(floatValue2, w03, w04));
                            return;
                    }
                }
            });
            this.w.addListener(new n86(this, f, (byte) 0));
            this.w.setInterpolator(k43.h);
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
                public final o86 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    byte b = r2;
                    o86 o86Var = this.b;
                    switch (b) {
                        case 0:
                            TextView textView = o86Var.f;
                            int w0 = aob.w0(null, aob.y6, false);
                            int w02 = aob.w0(null, aob.n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            o86Var.s = floatValue;
                            textView.setTextColor(vm2.f(floatValue, w0, w02));
                            return;
                        default:
                            TextView textView2 = o86Var.d;
                            int w03 = aob.w0(null, aob.y6, false);
                            int w04 = aob.w0(null, aob.n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            o86Var.x = floatValue2;
                            textView2.setTextColor(vm2.f(floatValue2, w03, w04));
                            return;
                    }
                }
            });
            this.y.addListener(new n86(this, f4, (byte) 1));
            this.y.setInterpolator(k43.h);
            this.y.setDuration(320L);
            this.y.start();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.y6));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(112.0f), 1073741824));
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
                    textView.setTextColor(vm2.f(this.s, aob.w0(null, aob.y6, false), aob.w0(null, aob.n6, false)));
                }
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(vm2.f(this.x, aob.w0(null, aob.y6, false), aob.w0(null, aob.n6, false)));
        }
        qg2 qg2Var = this.c;
        if (qg2Var != null) {
            qg2Var.invalidate();
        }
    }
}
