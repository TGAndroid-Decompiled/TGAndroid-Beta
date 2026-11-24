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
public final class ob8 extends FrameLayout implements jm7 {
    public final FrameLayout a;
    public final a6 b;
    public final lka[] c;
    public final io d;
    public AnimatorSet e;
    public AnimatorSet f;
    public boolean h;
    public ValueAnimator n;
    public float r;
    public int s;

    public ob8(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a = frameLayout;
        frameLayout.setPadding(gm.L(56.0f), 0, 0, 0);
        addView(frameLayout, qoe.e(-1, -1, 119));
        a6 a6Var = new a6(activity, (byte) 24);
        this.b = a6Var;
        a6Var.setPivotX(gm.L(16.0f));
        a6Var.setPadding(gm.L(16.0f), 0, 0, 0);
        a6Var.setClipToPadding(false);
        frameLayout.addView(a6Var, qoe.e(-1, -1, 119));
        this.c = new lka[2];
        for (int i = 0; i < 2; i++) {
            this.c[i] = new lka(activity);
            this.c[i].setGravity(19);
            this.c[i].setTextColor(-1);
            this.c[i].setTextSize(20);
            this.c[i].setTypeface(gm.o());
            this.c[i].setDrawablePadding(gm.L(4.0f));
            this.c[i].setScrollNonFitText(true);
            this.b.addView(this.c[i], qoe.e(-1, -2, 19));
        }
        io ioVar = new io(activity, true, false, false);
        this.d = ioVar;
        ioVar.b(0.4f, 320L, d53.h);
        ioVar.setTextSize(gm.L(14.0f));
        ioVar.setGravity(19);
        ioVar.setTextColor(-1);
        ioVar.setEllipsizeByGradient(true);
        ioVar.setImportantForAccessibility(1);
        ioVar.setAccessibilityLiveRegion(1);
        this.a.addView(ioVar, qoe.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
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
        io ioVar = this.d;
        if (z3 != z4) {
            this.h = z3;
            AnimatorSet animatorSet = this.f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = gm.q;
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
            int L = gm.L(i - i2);
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
                arrayList.add(ObjectAnimator.ofFloat(ioVar, View.ALPHA, f3));
                float[] fArr = {L};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(ioVar, property, fArr));
                if (!isEmpty) {
                    f6 = gm.L(-12.0f);
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
                this.f.setInterpolator(d53.h);
                this.f.start();
            } else {
                if (!isEmpty) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ioVar.setAlpha(f);
                ioVar.setTranslationY(L);
                if (!isEmpty) {
                    f6 = gm.L(-12.0f);
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
        ioVar.c(charSequence, z, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        ioVar.setContentDescription(charSequence);
    }

    public final void b(boolean z) {
        int i;
        int i2;
        lka[] lkaVarArr = this.c;
        int i3 = 0;
        TextPaint paint = lkaVarArr[0].getPaint();
        float N = gm.N(0.66f);
        if (z) {
            i = 1912602624;
        } else {
            i = 0;
        }
        paint.setShadowLayer(N, 0.0f, 1.0f, i);
        TextPaint paint2 = lkaVarArr[1].getPaint();
        float N2 = gm.N(0.66f);
        if (z) {
            i2 = 1912602624;
        } else {
            i2 = 0;
        }
        paint2.setShadowLayer(N2, 0.0f, 1.0f, i2);
        ho drawable = this.d.getDrawable();
        float N3 = gm.N(0.66f);
        if (z) {
            i3 = 1912602624;
        }
        drawable.s(N3, 1.0f, i3);
    }

    public final void c(CharSequence charSequence) {
        boolean equals;
        lka[] lkaVarArr = this.c;
        lkaVarArr[1].setAlpha(0.0f);
        lkaVarArr[1].setVisibility(8);
        CharSequence text = lkaVarArr[0].getText();
        if (text == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (!equals) {
            lka lkaVar = lkaVarArr[0];
            lkaVar.S = 0.0f;
            lkaVar.b();
        }
        lkaVarArr[0].k(charSequence);
        lkaVarArr[0].setAlpha(1.0f);
        lkaVarArr[0].setTranslationX(0.0f);
        lkaVarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z, boolean z2) {
        boolean equals;
        int i;
        Property property;
        lka[] lkaVarArr = this.c;
        CharSequence text = lkaVarArr[0].getText();
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
        lka lkaVar = lkaVarArr[1];
        lka lkaVar2 = lkaVarArr[0];
        lkaVar.getClass();
        lkaVar.S = lkaVar2.S;
        lkaVar.b();
        lkaVarArr[1].k(lkaVarArr[0].getText());
        lkaVarArr[1].setRightPadding((int) this.r);
        lka lkaVar3 = lkaVarArr[0];
        lkaVar3.S = 0.0f;
        lkaVar3.b();
        lkaVarArr[0].k(charSequence);
        int L = gm.L(8.0f);
        if (z2) {
            i = 1;
        } else {
            i = -1;
        }
        float f = L * i;
        lkaVarArr[1].setTranslationX(0.0f);
        lkaVarArr[1].setTranslationY(0.0f);
        if (z) {
            lkaVarArr[0].setTranslationX(0.0f);
            lkaVarArr[0].setTranslationY(-f);
        } else {
            lkaVarArr[0].setTranslationX(-f);
            lkaVarArr[0].setTranslationY(0.0f);
        }
        lkaVarArr[0].setAlpha(0.0f);
        lkaVarArr[1].setAlpha(1.0f);
        lkaVarArr[0].setVisibility(0);
        lkaVarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property2 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(lkaVarArr[1], property2, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(lkaVarArr[0], property2, 1.0f));
        lka lkaVar4 = lkaVarArr[1];
        Property property3 = View.TRANSLATION_X;
        Property property4 = View.TRANSLATION_Y;
        if (z) {
            property = property4;
        } else {
            property = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(lkaVar4, property, f));
        lka lkaVar5 = lkaVarArr[0];
        if (z) {
            property3 = property4;
        }
        arrayList.add(ObjectAnimator.ofFloat(lkaVar5, property3, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.e.addListener(new s38(this, (byte) 14));
        this.e.setDuration(320L);
        this.e.setInterpolator(d53.h);
        this.e.start();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            lka[] lkaVarArr = this.c;
            lkaVarArr[0].invalidate();
            lkaVarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.m4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.layout(0, gm.m, i3 - i, i4 - i2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = gm.m;
        int i4 = this.s;
        int i5 = gm.q.y;
        if (i4 != i5) {
            this.s = i5;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i3, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
