package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class dd8 extends FrameLayout implements fn7 {
    public final FrameLayout a;
    public final b6 b;
    public final ema[] c;
    public final in d;
    public AnimatorSet e;
    public AnimatorSet f;
    public boolean h;
    public ValueAnimator n;
    public float r;
    public int s;

    public dd8(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setPadding(hl.L(56.0f), 0, 0, 0);
        addView(frameLayout, tre.e(-1, -1, 119));
        b6 b6Var = new b6(activity, (byte) 25);
        this.b = b6Var;
        b6Var.setPivotX(hl.L(16.0f));
        b6Var.setPadding(hl.L(16.0f), 0, 0, 0);
        b6Var.setClipToPadding(false);
        frameLayout.addView(b6Var, tre.e(-1, -1, 119));
        this.c = new ema[2];
        for (int i = 0; i < 2; i++) {
            this.c[i] = new ema(activity);
            this.c[i].setGravity(19);
            this.c[i].setTextColor(-1);
            this.c[i].setTextSize(20);
            this.c[i].setTypeface(hl.o());
            this.c[i].setDrawablePadding(hl.L(4.0f));
            this.c[i].setScrollNonFitText(true);
            this.b.addView(this.c[i], tre.e(-1, -2, 19));
        }
        in inVar = new in(activity, true, false, false);
        this.d = inVar;
        inVar.b(0.4f, 320L, k43.h);
        inVar.setTextSize(hl.L(14.0f));
        inVar.setGravity(19);
        inVar.setTextColor(-1);
        inVar.setEllipsizeByGradient(true);
        inVar.setImportantForAccessibility(1);
        inVar.setAccessibilityLiveRegion(1);
        this.a.addView(inVar, tre.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z) {
        boolean z2;
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z3 = !isEmpty;
        boolean z4 = this.h;
        in inVar = this.d;
        if (z3 != z4) {
            this.h = z3;
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = hl.q;
            if (point.x > point.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!isEmpty) {
                i = 30;
            } else {
                i = 33;
            }
            if (z2) {
                i2 = 6;
            } else {
                i2 = 0;
            }
            int L = hl.L(i - i2);
            float f5 = 0.87f;
            float f6 = 0.0f;
            b6 b6Var = this.b;
            if (z) {
                ArrayList arrayList = new ArrayList();
                if (!isEmpty) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(inVar, View.ALPHA, f3));
                float[] fArr = {L};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(inVar, property, fArr));
                if (!isEmpty) {
                    f6 = hl.L(-12.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(b6Var, property, f6));
                if (!isEmpty) {
                    f4 = 0.87f;
                } else {
                    f4 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(b6Var, View.SCALE_X, f4));
                if (isEmpty) {
                    f5 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(b6Var, View.SCALE_Y, f5));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f.setInterpolator(k43.h);
                this.f.start();
            } else {
                if (!isEmpty) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                inVar.setAlpha(f);
                inVar.setTranslationY(L);
                if (!isEmpty) {
                    f6 = hl.L(-12.0f);
                }
                b6Var.setTranslationY(f6);
                if (!isEmpty) {
                    f2 = 0.87f;
                } else {
                    f2 = 1.0f;
                }
                b6Var.setScaleX(f2);
                if (isEmpty) {
                    f5 = 1.0f;
                }
                b6Var.setScaleY(f5);
            }
        }
        inVar.c(charSequence, z, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        inVar.setContentDescription(charSequence);
    }

    public final void b(boolean z) {
        int i;
        int i2;
        ema[] emaVarArr = this.c;
        int i3 = 0;
        TextPaint paint = emaVarArr[0].getPaint();
        float N = hl.N(0.66f);
        if (z) {
            i = 1912602624;
        } else {
            i = 0;
        }
        paint.setShadowLayer(N, 0.0f, 1.0f, i);
        TextPaint paint2 = emaVarArr[1].getPaint();
        float N2 = hl.N(0.66f);
        if (z) {
            i2 = 1912602624;
        } else {
            i2 = 0;
        }
        paint2.setShadowLayer(N2, 0.0f, 1.0f, i2);
        hn drawable = this.d.getDrawable();
        float N3 = hl.N(0.66f);
        if (z) {
            i3 = 1912602624;
        }
        drawable.s(N3, 1.0f, i3);
    }

    public final void c(CharSequence charSequence) {
        boolean equals;
        ema[] emaVarArr = this.c;
        emaVarArr[1].setAlpha(0.0f);
        emaVarArr[1].setVisibility(8);
        CharSequence text = emaVarArr[0].getText();
        if (text == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (!equals) {
            ema emaVar = emaVarArr[0];
            emaVar.S = 0.0f;
            emaVar.b();
        }
        emaVarArr[0].k(charSequence);
        emaVarArr[0].setAlpha(1.0f);
        emaVarArr[0].setTranslationX(0.0f);
        emaVarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z, boolean z2) {
        boolean equals;
        int i;
        Property property;
        ema[] emaVarArr = this.c;
        CharSequence text = emaVarArr[0].getText();
        if (text == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (equals) {
            return;
        }
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.e = null;
        }
        ema emaVar = emaVarArr[1];
        ema emaVar2 = emaVarArr[0];
        emaVar.getClass();
        emaVar.S = emaVar2.S;
        emaVar.b();
        emaVarArr[1].k(emaVarArr[0].getText());
        emaVarArr[1].setRightPadding((int) this.r);
        ema emaVar3 = emaVarArr[0];
        emaVar3.S = 0.0f;
        emaVar3.b();
        emaVarArr[0].k(charSequence);
        int L = hl.L(8.0f);
        if (z2) {
            i = 1;
        } else {
            i = -1;
        }
        float f = L * i;
        emaVarArr[1].setTranslationX(0.0f);
        emaVarArr[1].setTranslationY(0.0f);
        if (z) {
            emaVarArr[0].setTranslationX(0.0f);
            emaVarArr[0].setTranslationY(-f);
        } else {
            emaVarArr[0].setTranslationX(-f);
            emaVarArr[0].setTranslationY(0.0f);
        }
        emaVarArr[0].setAlpha(0.0f);
        emaVarArr[1].setAlpha(1.0f);
        emaVarArr[0].setVisibility(0);
        emaVarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property2 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(emaVarArr[1], property2, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(emaVarArr[0], property2, 1.0f));
        ema emaVar4 = emaVarArr[1];
        Property property3 = View.TRANSLATION_X;
        Property property4 = View.TRANSLATION_Y;
        if (z) {
            property = property4;
        } else {
            property = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(emaVar4, property, f));
        ema emaVar5 = emaVarArr[0];
        if (z) {
            property3 = property4;
        }
        arrayList.add(ObjectAnimator.ofFloat(emaVar5, property3, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.e.addListener(new n88(this, (byte) 11));
        this.e.setDuration(320L);
        this.e.setInterpolator(k43.h);
        this.e.start();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            ema[] emaVarArr = this.c;
            emaVarArr[0].invalidate();
            emaVarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.l4);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, hl.m, i3 - i, i4 - i2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = hl.m;
        int i4 = this.s;
        int i5 = hl.q.y;
        if (i4 != i5) {
            this.s = i5;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i3, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
