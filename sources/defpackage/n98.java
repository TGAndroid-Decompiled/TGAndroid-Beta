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
public final class n98 extends FrameLayout implements gk7 {
    public final FrameLayout a;
    public final a6 b;
    public final jia[] c;
    public final hn d;
    public AnimatorSet e;
    public AnimatorSet f;
    public boolean h;
    public ValueAnimator n;
    public float r;
    public int s;

    public n98(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setPadding(gl.L(56.0f), 0, 0, 0);
        addView(frameLayout, nme.e(-1, -1, 119));
        a6 a6Var = new a6(activity, (byte) 24);
        this.b = a6Var;
        a6Var.setPivotX(gl.L(16.0f));
        a6Var.setPadding(gl.L(16.0f), 0, 0, 0);
        a6Var.setClipToPadding(false);
        frameLayout.addView(a6Var, nme.e(-1, -1, 119));
        this.c = new jia[2];
        for (int i = 0; i < 2; i++) {
            this.c[i] = new jia(activity);
            this.c[i].setGravity(19);
            this.c[i].setTextColor(-1);
            this.c[i].setTextSize(20);
            this.c[i].setTypeface(gl.o());
            this.c[i].setDrawablePadding(gl.L(4.0f));
            this.c[i].setScrollNonFitText(true);
            this.b.addView(this.c[i], nme.e(-1, -2, 19));
        }
        hn hnVar = new hn(activity, true, false, false);
        this.d = hnVar;
        hnVar.b(0.4f, 320L, s33.h);
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setGravity(19);
        hnVar.setTextColor(-1);
        hnVar.setEllipsizeByGradient(true);
        hnVar.setImportantForAccessibility(1);
        hnVar.setAccessibilityLiveRegion(1);
        this.a.addView(hnVar, nme.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
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
        hn hnVar = this.d;
        if (z3 != z4) {
            this.h = z3;
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = gl.q;
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
            int L = gl.L(i - i2);
            float f5 = 0.87f;
            float f6 = 0.0f;
            a6 a6Var = this.b;
            if (z) {
                ArrayList arrayList = new ArrayList();
                if (!isEmpty) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(hnVar, View.ALPHA, f3));
                float[] fArr = {L};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(hnVar, property, fArr));
                if (!isEmpty) {
                    f6 = gl.L(-12.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(a6Var, property, f6));
                if (!isEmpty) {
                    f4 = 0.87f;
                } else {
                    f4 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(a6Var, View.SCALE_X, f4));
                if (isEmpty) {
                    f5 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(a6Var, View.SCALE_Y, f5));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f.setInterpolator(s33.h);
                this.f.start();
            } else {
                if (!isEmpty) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                hnVar.setAlpha(f);
                hnVar.setTranslationY(L);
                if (!isEmpty) {
                    f6 = gl.L(-12.0f);
                }
                a6Var.setTranslationY(f6);
                if (!isEmpty) {
                    f2 = 0.87f;
                } else {
                    f2 = 1.0f;
                }
                a6Var.setScaleX(f2);
                if (isEmpty) {
                    f5 = 1.0f;
                }
                a6Var.setScaleY(f5);
            }
        }
        hnVar.c(charSequence, z, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        hnVar.setContentDescription(charSequence);
    }

    public final void b(boolean z) {
        int i;
        int i2;
        jia[] jiaVarArr = this.c;
        int i3 = 0;
        TextPaint paint = jiaVarArr[0].getPaint();
        float N = gl.N(0.66f);
        if (z) {
            i = 1912602624;
        } else {
            i = 0;
        }
        paint.setShadowLayer(N, 0.0f, 1.0f, i);
        TextPaint paint2 = jiaVarArr[1].getPaint();
        float N2 = gl.N(0.66f);
        if (z) {
            i2 = 1912602624;
        } else {
            i2 = 0;
        }
        paint2.setShadowLayer(N2, 0.0f, 1.0f, i2);
        gn drawable = this.d.getDrawable();
        float N3 = gl.N(0.66f);
        if (z) {
            i3 = 1912602624;
        }
        drawable.s(N3, 1.0f, i3);
    }

    public final void c(CharSequence charSequence) {
        boolean equals;
        jia[] jiaVarArr = this.c;
        jiaVarArr[1].setAlpha(0.0f);
        jiaVarArr[1].setVisibility(8);
        CharSequence text = jiaVarArr[0].getText();
        if (text == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (!equals) {
            jia jiaVar = jiaVarArr[0];
            jiaVar.S = 0.0f;
            jiaVar.b();
        }
        jiaVarArr[0].k(charSequence);
        jiaVarArr[0].setAlpha(1.0f);
        jiaVarArr[0].setTranslationX(0.0f);
        jiaVarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z, boolean z2) {
        boolean equals;
        int i;
        Property property;
        jia[] jiaVarArr = this.c;
        CharSequence text = jiaVarArr[0].getText();
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
        jia jiaVar = jiaVarArr[1];
        jia jiaVar2 = jiaVarArr[0];
        jiaVar.getClass();
        jiaVar.S = jiaVar2.S;
        jiaVar.b();
        jiaVarArr[1].k(jiaVarArr[0].getText());
        jiaVarArr[1].setRightPadding((int) this.r);
        jia jiaVar3 = jiaVarArr[0];
        jiaVar3.S = 0.0f;
        jiaVar3.b();
        jiaVarArr[0].k(charSequence);
        int L = gl.L(8.0f);
        if (z2) {
            i = 1;
        } else {
            i = -1;
        }
        float f = L * i;
        jiaVarArr[1].setTranslationX(0.0f);
        jiaVarArr[1].setTranslationY(0.0f);
        if (z) {
            jiaVarArr[0].setTranslationX(0.0f);
            jiaVarArr[0].setTranslationY(-f);
        } else {
            jiaVarArr[0].setTranslationX(-f);
            jiaVarArr[0].setTranslationY(0.0f);
        }
        jiaVarArr[0].setAlpha(0.0f);
        jiaVarArr[1].setAlpha(1.0f);
        jiaVarArr[0].setVisibility(0);
        jiaVarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property2 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(jiaVarArr[1], property2, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(jiaVarArr[0], property2, 1.0f));
        jia jiaVar4 = jiaVarArr[1];
        Property property3 = View.TRANSLATION_X;
        Property property4 = View.TRANSLATION_Y;
        if (z) {
            property = property4;
        } else {
            property = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(jiaVar4, property, f));
        jia jiaVar5 = jiaVarArr[0];
        if (z) {
            property3 = property4;
        }
        arrayList.add(ObjectAnimator.ofFloat(jiaVar5, property3, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.e.addListener(new l48(this, (byte) 12));
        this.e.setDuration(320L);
        this.e.setInterpolator(s33.h);
        this.e.start();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            jia[] jiaVarArr = this.c;
            jiaVarArr[0].invalidate();
            jiaVarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.k4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, gl.m, i3 - i, i4 - i2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = gl.m;
        int i4 = this.s;
        int i5 = gl.q.y;
        if (i4 != i5) {
            this.s = i5;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i3, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
