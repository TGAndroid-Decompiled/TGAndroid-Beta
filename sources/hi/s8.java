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
import org.telegram.messenger.m10;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.xe;
public final class s8 extends FrameLayout {
    public final int f15400a = 0;
    public final Object f15401b;
    public final Object f15402c;
    public final Object d;
    public Object f15403e;
    public Object f15404f;
    public Object h;

    public s8(oc0 oc0Var, Context context) {
        super(context);
        this.h = oc0Var;
        this.f15401b = new ArrayList(4);
        this.f15402c = new ArrayList(4);
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
            addView(textView, c8.na.e(50, 50, 51));
            ((ArrayList) this.f15401b).add(textView);
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-1);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextSize(1, 36.0f);
            textView2.setGravity(17);
            textView2.setAlpha(0.0f);
            textView2.setText("•");
            textView2.setPivotX(org.telegram.messenger.g0.L(25.0f));
            textView2.setPivotY(org.telegram.messenger.g0.L(25.0f));
            addView(textView2, c8.na.e(50, 50, 51));
            ((ArrayList) this.f15402c).add(textView2);
        }
    }

    public static void a(s8 s8Var, boolean z10) {
        ArrayList arrayList = (ArrayList) s8Var.f15402c;
        ArrayList arrayList2 = (ArrayList) s8Var.f15401b;
        StringBuilder sb2 = (StringBuilder) s8Var.d;
        if (sb2.length() == 0) {
            return;
        }
        xe xeVar = (xe) s8Var.f15404f;
        if (xeVar != null) {
            org.telegram.messenger.g0.r(xeVar);
            s8Var.f15404f = null;
        }
        AnimatorSet animatorSet = (AnimatorSet) s8Var.f15403e;
        if (animatorSet != null) {
            animatorSet.cancel();
            s8Var.f15403e = null;
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
            s8Var.f15403e = animatorSet2;
            animatorSet2.setDuration(150L);
            ((AnimatorSet) s8Var.f15403e).playTogether(arrayList3);
            ((AnimatorSet) s8Var.f15403e).addListener(new jc0(s8Var, 2));
            ((AnimatorSet) s8Var.f15403e).start();
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                ((TextView) arrayList2.get(i11)).setAlpha(0.0f);
                ((TextView) arrayList.get(i11)).setAlpha(0.0f);
            }
        }
        oc0.a((oc0) s8Var.h);
    }

    public void b(String str) {
        ArrayList arrayList = (ArrayList) this.f15402c;
        ArrayList arrayList2 = (ArrayList) this.f15401b;
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
        xe xeVar = (xe) this.f15404f;
        if (xeVar != null) {
            org.telegram.messenger.g0.r(xeVar);
        }
        xe xeVar2 = new xe(this, length, 2);
        this.f15404f = xeVar2;
        org.telegram.messenger.g0.h3(xeVar2, 1500L);
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
        AnimatorSet animatorSet = (AnimatorSet) this.f15403e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f15403e = animatorSet2;
        animatorSet2.setDuration(150L);
        ((AnimatorSet) this.f15403e).playTogether(arrayList3);
        ((AnimatorSet) this.f15403e).addListener(new jc0(this, 0));
        ((AnimatorSet) this.f15403e).start();
        oc0.a((oc0) this.h);
    }

    public int c(int i7) {
        return org.telegram.messenger.f3.D(30.0f, i7, (getMeasuredWidth() - (org.telegram.messenger.g0.L(30.0f) * ((StringBuilder) this.d).length())) / 2) - org.telegram.messenger.g0.L(10.0f);
    }

    public void d(boolean z10) {
        int i7;
        float f10;
        float f11;
        ImageView imageView = (ImageView) this.f15402c;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        TextView textView = (TextView) this.d;
        boolean z11 = gd.f24314a0;
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
        textView.setLayoutParams(c8.na.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f15400a) {
            case 0:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f15404f;
                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29452d7, (org.telegram.ui.ActionBar.i6) this.f15401b));
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
        switch (this.f15400a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f15402c;
                ArrayList arrayList2 = (ArrayList) this.f15401b;
                xe xeVar = (xe) this.f15404f;
                if (xeVar != null) {
                    org.telegram.messenger.g0.r(xeVar);
                    this.f15404f = null;
                }
                AnimatorSet animatorSet = (AnimatorSet) this.f15403e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f15403e = null;
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
        switch (this.f15400a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public s8(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f15404f = new Paint(1);
        this.f15401b = i6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        m10.p(textView, 1, 20.0f);
        textView.setGravity(gd.f24314a0 ? 5 : 3);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, i6Var);
        boolean z10 = gd.f24314a0;
        addView(textView, c8.na.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f15402c = imageView;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        this.f15403e = x1Var;
        imageView.setImageDrawable(x1Var);
        x1Var.a(-1);
        x1Var.b(-1);
        x1Var.f30314k = 220.0f;
        addView(imageView, c8.na.d(24, 24.0f, (gd.f24314a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new z4(this, 2));
    }
}
