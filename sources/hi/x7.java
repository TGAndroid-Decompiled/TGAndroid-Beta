package hi;

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
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.we;
public final class x7 extends FrameLayout {
    public final int f15753a = 0;
    public final Object f15754b;
    public final Object f15755c;
    public final Object d;
    public Object f15756e;
    public Object f15757f;
    public Object h;

    public x7(qc0 qc0Var, Context context) {
        super(context);
        this.h = qc0Var;
        this.f15754b = new ArrayList(4);
        this.f15755c = new ArrayList(4);
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
            addView(textView, c8.ma.e(50, 50, 51));
            ((ArrayList) this.f15754b).add(textView);
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-1);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextSize(1, 36.0f);
            textView2.setGravity(17);
            textView2.setAlpha(0.0f);
            textView2.setText("•");
            textView2.setPivotX(org.telegram.messenger.g0.L(25.0f));
            textView2.setPivotY(org.telegram.messenger.g0.L(25.0f));
            addView(textView2, c8.ma.e(50, 50, 51));
            ((ArrayList) this.f15755c).add(textView2);
        }
    }

    public static void a(x7 x7Var, boolean z10) {
        ArrayList arrayList = (ArrayList) x7Var.f15755c;
        ArrayList arrayList2 = (ArrayList) x7Var.f15754b;
        StringBuilder sb2 = (StringBuilder) x7Var.d;
        if (sb2.length() == 0) {
            return;
        }
        we weVar = (we) x7Var.f15757f;
        if (weVar != null) {
            org.telegram.messenger.g0.r(weVar);
            x7Var.f15757f = null;
        }
        AnimatorSet animatorSet = (AnimatorSet) x7Var.f15756e;
        if (animatorSet != null) {
            animatorSet.cancel();
            x7Var.f15756e = null;
        }
        sb2.delete(0, sb2.length());
        if (z10) {
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
            x7Var.f15756e = animatorSet2;
            animatorSet2.setDuration(150L);
            ((AnimatorSet) x7Var.f15756e).playTogether(arrayList3);
            ((AnimatorSet) x7Var.f15756e).addListener(new lc0(x7Var, 2));
            ((AnimatorSet) x7Var.f15756e).start();
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                ((TextView) arrayList2.get(i11)).setAlpha(0.0f);
                ((TextView) arrayList.get(i11)).setAlpha(0.0f);
            }
        }
        qc0.a((qc0) x7Var.h);
    }

    public void b(String str) {
        ArrayList arrayList = (ArrayList) this.f15755c;
        ArrayList arrayList2 = (ArrayList) this.f15754b;
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
        we weVar = (we) this.f15757f;
        if (weVar != null) {
            org.telegram.messenger.g0.r(weVar);
        }
        we weVar2 = new we(this, length, 2);
        this.f15757f = weVar2;
        org.telegram.messenger.g0.h3(weVar2, 1500L);
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
        AnimatorSet animatorSet = (AnimatorSet) this.f15756e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f15756e = animatorSet2;
        animatorSet2.setDuration(150L);
        ((AnimatorSet) this.f15756e).playTogether(arrayList3);
        ((AnimatorSet) this.f15756e).addListener(new lc0(this, 0));
        ((AnimatorSet) this.f15756e).start();
        qc0.a((qc0) this.h);
    }

    public int c(int i7) {
        return org.telegram.messenger.f3.D(30.0f, i7, (getMeasuredWidth() - (org.telegram.messenger.g0.L(30.0f) * ((StringBuilder) this.d).length())) / 2) - org.telegram.messenger.g0.L(10.0f);
    }

    public void d(boolean z10) {
        int i7;
        float f10;
        float f11;
        ImageView imageView = (ImageView) this.f15755c;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        TextView textView = (TextView) this.d;
        boolean z11 = gd.f24241a0;
        if (!z11 && z10) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        if (z11 && z10) {
            f11 = 53.0f;
        } else {
            f11 = 22.0f;
        }
        textView.setLayoutParams(c8.ma.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f15753a) {
            case 0:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f15757f;
                paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29379d7, (org.telegram.ui.ActionBar.h6) this.f15754b));
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
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f15753a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f15755c;
                ArrayList arrayList2 = (ArrayList) this.f15754b;
                we weVar = (we) this.f15757f;
                if (weVar != null) {
                    org.telegram.messenger.g0.r(weVar);
                    this.f15757f = null;
                }
                AnimatorSet animatorSet = (AnimatorSet) this.f15756e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f15756e = null;
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
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f15753a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public x7(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f15757f = new Paint(1);
        this.f15754b = h6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        n10.p(textView, 1, 20.0f);
        textView.setGravity(gd.f24241a0 ? 5 : 3);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29486j5, h6Var);
        boolean z10 = gd.f24241a0;
        addView(textView, c8.ma.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f15755c = imageView;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.f15756e = x1Var;
        imageView.setImageDrawable(x1Var);
        x1Var.a(-1);
        x1Var.b(-1);
        x1Var.f30252k = 220.0f;
        addView(imageView, c8.ma.d(24, 24.0f, (gd.f24241a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new o4(this, 2));
    }
}
