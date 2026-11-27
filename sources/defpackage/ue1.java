package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
public final class ue1 extends FrameLayout {
    public static final int f = 0;
    public final p66 a;
    public final te1 b;
    public Integer c;
    public ValueAnimator d;
    public final ve1 e;

    public ue1(ve1 ve1Var, Activity activity) {
        super(activity);
        int i;
        this.e = ve1Var;
        ve1Var.G = this;
        setPadding(hl.L(18.0f), hl.L(10.0f), hl.L(18.0f), hl.L(17.0f));
        setClipChildren(false);
        p66 p66Var = new p66(activity, null);
        this.a = p66Var;
        p66Var.setTextSize(1, 15.0f);
        int i2 = aob.F6;
        yob.X(p66Var, i2, null);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        p66Var.setGravity(i);
        int i3 = aob.J6;
        yob.G(p66Var, i3, null);
        int i4 = aob.K6;
        yob.C(p66Var, i4, null);
        p66Var.setPadding(hl.L(3.0f), 0, hl.L(3.0f), 0);
        te1 te1Var = new te1((byte) 0, activity, this);
        ve1Var.H = te1Var;
        this.b = te1Var;
        te1Var.setTextSize(1, 15.0f);
        yob.X(te1Var, i2, null);
        te1Var.setGravity(ob6.a0 ? 5 : 3);
        yob.G(te1Var, i3, null);
        yob.C(te1Var, i4, null);
        te1Var.setPadding(hl.L(3.0f), 0, hl.L(3.0f), 0);
        addView(p66Var, tre.e(-1, -2, 48));
        addView(te1Var, tre.e(-1, -2, 48));
        if (ve1Var.y != 0) {
            String M0 = ob6.M0(2131752919, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            int indexOf = M0.indexOf(42);
            int lastIndexOf = M0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new f8c("https://fragment.com", (rmb) null), indexOf, lastIndexOf - 1, 33);
            }
            p66Var.setText(spannableStringBuilder);
            return;
        }
        p66Var.setText(hl.S2(ob6.M0(2131743315, null)));
    }

    public final void a() {
        int intValue;
        int i;
        float f2;
        te1 te1Var = this.b;
        if (te1Var.getVisibility() == 0) {
            te1Var.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), -2137483649);
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = this.c;
        if (num == null) {
            intValue = getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i2 = intValue;
        int L = hl.L(27.0f);
        p66 p66Var = this.a;
        int height = p66Var.getHeight() + L;
        if (te1Var.getVisibility() == 0 && !TextUtils.isEmpty(te1Var.getText())) {
            i = hl.L(8.0f) + te1Var.getMeasuredHeight();
        } else {
            i = 0;
        }
        final int i3 = height + i;
        final float translationY = p66Var.getTranslationY();
        if (te1Var.getVisibility() == 0 && !TextUtils.isEmpty(te1Var.getText())) {
            f2 = hl.L(8.0f) + te1Var.getMeasuredHeight();
        } else {
            f2 = 0.0f;
        }
        final float f3 = f2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                ue1 ue1Var = ue1.this;
                ue1Var.a.setTranslationY(hl.R1(translationY, f3, floatValue));
                ue1Var.c = Integer.valueOf(hl.U1(floatValue, i2, i3));
                ue1Var.requestLayout();
            }
        });
        this.d.setDuration(200L);
        this.d.setInterpolator(k43.h);
        this.d.start();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        Integer num = this.c;
        if (num != null) {
            i2 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
