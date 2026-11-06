package fi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.qe;
import org.telegram.ui.Components.zb0;
public final class a8 extends FrameLayout {
    public final int f11611a = 0;
    public final Object f11612b;
    public final Object f11613c;
    public final Object d;
    public Object f11614e;
    public Object f11615f;
    public Object h;

    public a8(ec0 ec0Var, Context context) {
        super(context);
        this.h = ec0Var;
        this.f11612b = new ArrayList(4);
        this.f11613c = new ArrayList(4);
        this.d = new StringBuilder(4);
        for (int i7 = 0; i7 < 4; i7++) {
            TextView textView = new TextView(context);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 36.0f);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            textView.setPivotX(org.telegram.messenger.g0.L(25.0f));
            textView.setPivotY(org.telegram.messenger.g0.L(25.0f));
            addView(textView, c8.ha.e(50, 50, 51));
            ((ArrayList) this.f11612b).add(textView);
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-1);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextSize(1, 36.0f);
            textView2.setGravity(17);
            textView2.setAlpha(0.0f);
            textView2.setText("•");
            textView2.setPivotX(org.telegram.messenger.g0.L(25.0f));
            textView2.setPivotY(org.telegram.messenger.g0.L(25.0f));
            addView(textView2, c8.ha.e(50, 50, 51));
            ((ArrayList) this.f11613c).add(textView2);
        }
    }

    public static void a(a8 a8Var, boolean z9) {
        ArrayList arrayList = (ArrayList) a8Var.f11613c;
        ArrayList arrayList2 = (ArrayList) a8Var.f11612b;
        StringBuilder sb2 = (StringBuilder) a8Var.d;
        if (sb2.length() == 0) {
            return;
        }
        qe qeVar = (qe) a8Var.f11615f;
        if (qeVar != null) {
            org.telegram.messenger.g0.r(qeVar);
            a8Var.f11615f = null;
        }
        AnimatorSet animatorSet = (AnimatorSet) a8Var.f11614e;
        if (animatorSet != null) {
            animatorSet.cancel();
            a8Var.f11614e = null;
        }
        sb2.delete(0, sb2.length());
        if (z9) {
            ArrayList arrayList3 = new ArrayList();
            for (int i7 = 0; i7 < 4; i7++) {
                TextView textView = (TextView) arrayList2.get(i7);
                int i10 = (textView.getAlpha() > 0.0f ? 1 : (textView.getAlpha() == 0.0f ? 0 : -1));
                Property property = View.ALPHA;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                if (i10 != 0) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                }
                TextView textView2 = (TextView) arrayList.get(i7);
                if (textView2.getAlpha() != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f));
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            a8Var.f11614e = animatorSet2;
            animatorSet2.setDuration(150L);
            ((AnimatorSet) a8Var.f11614e).playTogether(arrayList3);
            ((AnimatorSet) a8Var.f11614e).addListener(new zb0(a8Var, 2));
            ((AnimatorSet) a8Var.f11614e).start();
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                ((TextView) arrayList2.get(i11)).setAlpha(0.0f);
                ((TextView) arrayList.get(i11)).setAlpha(0.0f);
            }
        }
        ec0.a((ec0) a8Var.h);
    }

    public void b(String str) {
        ArrayList arrayList = (ArrayList) this.f11613c;
        ArrayList arrayList2 = (ArrayList) this.f11612b;
        StringBuilder sb2 = (StringBuilder) this.d;
        if (sb2.length() == 4) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ArrayList arrayList3 = new ArrayList();
        int length = sb2.length();
        sb2.append(str);
        TextView textView = (TextView) arrayList2.get(length);
        textView.setText(str);
        textView.setTranslationX(c(length));
        Property property = View.SCALE_X;
        arrayList3.add(ObjectAnimator.ofFloat(textView, property, 0.0f, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList3.add(ObjectAnimator.ofFloat(textView, property2, 0.0f, 1.0f));
        Property property3 = View.ALPHA;
        arrayList3.add(ObjectAnimator.ofFloat(textView, property3, 0.0f, 1.0f));
        Property property4 = View.TRANSLATION_Y;
        arrayList3.add(ObjectAnimator.ofFloat(textView, property4, org.telegram.messenger.g0.L(20.0f), 0.0f));
        TextView textView2 = (TextView) arrayList.get(length);
        textView2.setTranslationX(c(length));
        textView2.setAlpha(0.0f);
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, org.telegram.messenger.g0.L(20.0f), 0.0f));
        for (int i7 = length + 1; i7 < 4; i7++) {
            TextView textView3 = (TextView) arrayList2.get(i7);
            if (textView3.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, 0.0f));
            }
            TextView textView4 = (TextView) arrayList.get(i7);
            if (textView4.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property3, 0.0f));
            }
        }
        qe qeVar = (qe) this.f11615f;
        if (qeVar != null) {
            org.telegram.messenger.g0.r(qeVar);
        }
        qe qeVar2 = new qe(this, length, 2);
        this.f11615f = qeVar2;
        org.telegram.messenger.g0.i3(qeVar2, 1500L);
        for (int i10 = 0; i10 < length; i10++) {
            TextView textView5 = (TextView) arrayList2.get(i10);
            Property property5 = View.TRANSLATION_X;
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property5, c(i10)));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property2, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property3, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property4, 0.0f));
            TextView textView6 = (TextView) arrayList.get(i10);
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property5, c(i10)));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property2, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property3, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property4, 0.0f));
        }
        AnimatorSet animatorSet = (AnimatorSet) this.f11614e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f11614e = animatorSet2;
        animatorSet2.setDuration(150L);
        ((AnimatorSet) this.f11614e).playTogether(arrayList3);
        ((AnimatorSet) this.f11614e).addListener(new zb0(this, 0));
        ((AnimatorSet) this.f11614e).start();
        ec0.a((ec0) this.h);
    }

    public int c(int i7) {
        return org.telegram.messenger.k5.D(30.0f, i7, (getMeasuredWidth() - (org.telegram.messenger.g0.L(30.0f) * ((StringBuilder) this.d).length())) / 2) - org.telegram.messenger.g0.L(10.0f);
    }

    public void d(boolean z9) {
        int i7;
        float f10;
        float f11;
        ImageView imageView = (ImageView) this.f11613c;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        TextView textView = (TextView) this.d;
        boolean z10 = hd.f22878a0;
        if (!z10 && z9) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        if (z10 && z9) {
            f11 = 53.0f;
        } else {
            f11 = 22.0f;
        }
        textView.setLayoutParams(c8.ha.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f11611a) {
            case 0:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f11615f;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27850d7, (org.telegram.ui.ActionBar.f6) this.f11612b));
                canvas.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.f1(), getWidth(), getHeight(), paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    public void e(String str) {
        ((TextView) this.d).setText(str);
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f11611a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f11613c;
                ArrayList arrayList2 = (ArrayList) this.f11612b;
                qe qeVar = (qe) this.f11615f;
                if (qeVar != null) {
                    org.telegram.messenger.g0.r(qeVar);
                    this.f11615f = null;
                }
                AnimatorSet animatorSet = (AnimatorSet) this.f11614e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f11614e = null;
                }
                for (int i13 = 0; i13 < 4; i13++) {
                    if (i13 < ((StringBuilder) this.d).length()) {
                        TextView textView = (TextView) arrayList2.get(i13);
                        textView.setAlpha(0.0f);
                        textView.setScaleX(1.0f);
                        textView.setScaleY(1.0f);
                        textView.setTranslationY(0.0f);
                        textView.setTranslationX(c(i13));
                        TextView textView2 = (TextView) arrayList.get(i13);
                        textView2.setAlpha(1.0f);
                        textView2.setScaleX(1.0f);
                        textView2.setScaleY(1.0f);
                        textView2.setTranslationY(0.0f);
                        textView2.setTranslationX(c(i13));
                    } else {
                        ((TextView) arrayList2.get(i13)).setAlpha(0.0f);
                        ((TextView) arrayList.get(i13)).setAlpha(0.0f);
                    }
                }
                super.onLayout(z9, i7, i10, i11, i12);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f11611a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public a8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f11615f = new Paint(1);
        this.f11612b = f6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        textView.setGravity(hd.f22878a0 ? 5 : 3);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27957j5, f6Var);
        boolean z9 = hd.f22878a0;
        addView(textView, c8.ha.d(-1, -2.0f, 23, z9 ? 16.0f : 53.0f, 0.0f, z9 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f11613c = imageView;
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        this.f11614e = y1Var;
        imageView.setImageDrawable(y1Var);
        y1Var.a(-1);
        y1Var.b(-1);
        y1Var.f28772k = 220.0f;
        addView(imageView, c8.ha.d(24, 24.0f, (hd.f22878a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new ah.d(this, 25));
    }
}
