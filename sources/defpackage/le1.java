package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
public final class le1 extends FrameLayout {
    public static final int f = 0;
    public final l46 a;
    public final ke1 b;
    public Integer c;
    public ValueAnimator d;
    public final me1 e;

    public le1(me1 me1Var, Activity activity) {
        super(activity);
        int i;
        this.e = me1Var;
        me1Var.G = this;
        setPadding(gl.L(18.0f), gl.L(10.0f), gl.L(18.0f), gl.L(17.0f));
        setClipChildren(false);
        l46 l46Var = new l46(activity, null);
        this.a = l46Var;
        l46Var.setTextSize(1, 15.0f);
        int i2 = bkb.E6;
        zkb.X(l46Var, i2, null);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        l46Var.setGravity(i);
        int i3 = bkb.I6;
        zkb.G(l46Var, i3, null);
        int i4 = bkb.J6;
        zkb.C(l46Var, i4, null);
        l46Var.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
        ke1 ke1Var = new ke1((byte) 0, activity, this);
        me1Var.H = ke1Var;
        this.b = ke1Var;
        ke1Var.setTextSize(1, 15.0f);
        zkb.X(ke1Var, i2, null);
        ke1Var.setGravity(k96.a0 ? 5 : 3);
        zkb.G(ke1Var, i3, null);
        zkb.C(ke1Var, i4, null);
        ke1Var.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
        addView(l46Var, nme.e(-1, -2, 48));
        addView(ke1Var, nme.e(-1, -2, 48));
        if (me1Var.y != 0) {
            String M0 = k96.M0(2131752926, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
            int indexOf = M0.indexOf(42);
            int lastIndexOf = M0.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new g4c("https://fragment.com", (vib) null), indexOf, lastIndexOf - 1, 33);
            }
            l46Var.setText(spannableStringBuilder);
            return;
        }
        l46Var.setText(gl.T2(k96.M0(2131743421, null)));
    }

    public final void a() {
        int intValue;
        int i;
        float f2;
        ke1 ke1Var = this.b;
        if (ke1Var.getVisibility() == 0) {
            ke1Var.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), -2137483649);
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
        int L = gl.L(27.0f);
        l46 l46Var = this.a;
        int height = l46Var.getHeight() + L;
        if (ke1Var.getVisibility() == 0 && !TextUtils.isEmpty(ke1Var.getText())) {
            i = gl.L(8.0f) + ke1Var.getMeasuredHeight();
        } else {
            i = 0;
        }
        final int i3 = height + i;
        final float translationY = l46Var.getTranslationY();
        if (ke1Var.getVisibility() == 0 && !TextUtils.isEmpty(ke1Var.getText())) {
            f2 = gl.L(8.0f) + ke1Var.getMeasuredHeight();
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
                le1 le1Var = le1.this;
                le1Var.a.setTranslationY(gl.R1(translationY, f3, floatValue));
                le1Var.c = Integer.valueOf(gl.U1(floatValue, i2, i3));
                le1Var.requestLayout();
            }
        });
        this.d.setDuration(200L);
        this.d.setInterpolator(s33.h);
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
