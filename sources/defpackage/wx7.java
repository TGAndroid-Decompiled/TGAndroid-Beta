package defpackage;

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
public final class wx7 extends FrameLayout {
    public static final int n = 0;
    public final byte a = 1;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object h;

    public wx7(by7 by7Var, Context context) {
        super(context);
        this.h = by7Var;
        this.b = new ArrayList(4);
        this.c = new ArrayList(4);
        this.d = new StringBuilder(4);
        for (int i = 0; i < 4; i++) {
            TextView textView = new TextView(context);
            textView.setTextColor(-1);
            textView.setTypeface(gm.o());
            textView.setTextSize(1, 36.0f);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            textView.setPivotX(gm.L(25.0f));
            textView.setPivotY(gm.L(25.0f));
            addView(textView, qoe.e(50, 50, 51));
            ((ArrayList) this.b).add(textView);
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-1);
            textView2.setTypeface(gm.o());
            textView2.setTextSize(1, 36.0f);
            textView2.setGravity(17);
            textView2.setAlpha(0.0f);
            textView2.setText("•");
            textView2.setPivotX(gm.L(25.0f));
            textView2.setPivotY(gm.L(25.0f));
            addView(textView2, qoe.e(50, 50, 51));
            ((ArrayList) this.c).add(textView2);
        }
    }

    public final void a(String str) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        StringBuilder sb = (StringBuilder) this.d;
        if (sb.length() == 4) {
            return;
        }
        try {
            performHapticFeedback(3);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        ArrayList arrayList3 = new ArrayList();
        int length = sb.length();
        sb.append(str);
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
        arrayList3.add(ObjectAnimator.ofFloat(textView, property4, gm.L(20.0f), 0.0f));
        TextView textView2 = (TextView) arrayList.get(length);
        textView2.setTranslationX(c(length));
        textView2.setAlpha(0.0f);
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f, 1.0f));
        arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, gm.L(20.0f), 0.0f));
        for (int i = length + 1; i < 4; i++) {
            TextView textView3 = (TextView) arrayList2.get(i);
            if (textView3.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, 0.0f));
            }
            TextView textView4 = (TextView) arrayList.get(i);
            if (textView4.getAlpha() != 0.0f) {
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property2, 0.0f));
                arrayList3.add(ObjectAnimator.ofFloat(textView4, property3, 0.0f));
            }
        }
        eg0 eg0Var = (eg0) this.f;
        if (eg0Var != null) {
            gm.r(eg0Var);
        }
        eg0 eg0Var2 = new eg0(this, length, (byte) 3);
        this.f = eg0Var2;
        gm.d3(eg0Var2, 1500L);
        for (int i2 = 0; i2 < length; i2++) {
            TextView textView5 = (TextView) arrayList2.get(i2);
            Property property5 = View.TRANSLATION_X;
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property5, c(i2)));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property2, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property3, 0.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView5, property4, 0.0f));
            TextView textView6 = (TextView) arrayList.get(i2);
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property5, c(i2)));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property2, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property3, 1.0f));
            arrayList3.add(ObjectAnimator.ofFloat(textView6, property4, 0.0f));
        }
        AnimatorSet animatorSet = (AnimatorSet) this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.setDuration(150L);
        ((AnimatorSet) this.e).playTogether(arrayList3);
        ((AnimatorSet) this.e).addListener(new vx7(this, (byte) 0));
        ((AnimatorSet) this.e).start();
        ((by7) this.h).e();
    }

    public final void b(boolean z) {
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.b;
        StringBuilder sb = (StringBuilder) this.d;
        if (sb.length() == 0) {
            return;
        }
        eg0 eg0Var = (eg0) this.f;
        if (eg0Var != null) {
            gm.r(eg0Var);
            this.f = null;
        }
        AnimatorSet animatorSet = (AnimatorSet) this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.e = null;
        }
        sb.delete(0, sb.length());
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            for (int i = 0; i < 4; i++) {
                TextView textView = (TextView) arrayList2.get(i);
                int i2 = (textView.getAlpha() > 0.0f ? 1 : (textView.getAlpha() == 0.0f ? 0 : -1));
                Property property = View.ALPHA;
                Property property2 = View.SCALE_Y;
                Property property3 = View.SCALE_X;
                if (i2 != 0) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView, property, 0.0f));
                }
                TextView textView2 = (TextView) arrayList.get(i);
                if (textView2.getAlpha() != 0.0f) {
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(textView2, property, 0.0f));
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.e = animatorSet2;
            animatorSet2.setDuration(150L);
            ((AnimatorSet) this.e).playTogether(arrayList3);
            ((AnimatorSet) this.e).addListener(new vx7(this, (byte) 2));
            ((AnimatorSet) this.e).start();
        } else {
            for (int i3 = 0; i3 < 4; i3++) {
                ((TextView) arrayList2.get(i3)).setAlpha(0.0f);
                ((TextView) arrayList.get(i3)).setAlpha(0.0f);
            }
        }
        ((by7) this.h).e();
    }

    public final int c(int i) {
        return hg9.y(30.0f, i, (getMeasuredWidth() - (gm.L(30.0f) * ((StringBuilder) this.d).length())) / 2) - gm.L(10.0f);
    }

    public final void d(boolean z) {
        int i;
        float f;
        float f2;
        ImageView imageView = (ImageView) this.c;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        TextView textView = (TextView) this.d;
        boolean z2 = jb6.a0;
        if (!z2 && z) {
            f = 53.0f;
        } else {
            f = 22.0f;
        }
        if (z2 && z) {
            f2 = 53.0f;
        } else {
            f2 = 22.0f;
        }
        textView.setLayoutParams(qoe.d(-1, -2.0f, 23, f, 0.0f, f2, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f;
                paint.setColor(cmb.v0(cmb.c7, (ylb) this.b));
                canvas.drawRect(0.0f, getHeight() - gm.e1(), getWidth(), getHeight(), paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    public final void e(String str) {
        ((TextView) this.d).setText(str);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.c;
                eg0 eg0Var = (eg0) this.f;
                if (eg0Var != null) {
                    gm.r(eg0Var);
                    this.f = null;
                }
                AnimatorSet animatorSet = (AnimatorSet) this.e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.e = null;
                }
                for (int i5 = 0; i5 < 4; i5++) {
                    int length = ((StringBuilder) this.d).length();
                    ArrayList arrayList2 = (ArrayList) this.b;
                    if (i5 < length) {
                        TextView textView = (TextView) arrayList2.get(i5);
                        textView.setAlpha(0.0f);
                        textView.setScaleX(1.0f);
                        textView.setScaleY(1.0f);
                        textView.setTranslationY(0.0f);
                        textView.setTranslationX(c(i5));
                        TextView textView2 = (TextView) arrayList.get(i5);
                        textView2.setAlpha(1.0f);
                        textView2.setScaleX(1.0f);
                        textView2.setScaleY(1.0f);
                        textView2.setTranslationY(0.0f);
                        textView2.setTranslationX(c(i5));
                    } else {
                        ((TextView) arrayList2.get(i5)).setAlpha(0.0f);
                        ((TextView) arrayList.get(i5)).setAlpha(0.0f);
                    }
                }
                super.onLayout(z, i, i2, i3, i4);
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    public wx7(Context context, ylb ylbVar) {
        super(context);
        this.f = new Paint(1);
        this.b = ylbVar;
        TextView textView = new TextView(context);
        this.d = textView;
        wi8.v(textView, 1, 20.0f);
        textView.setGravity(jb6.a0 ? 5 : 3);
        anb.X(textView, cmb.i5, ylbVar);
        boolean z = jb6.a0;
        addView(textView, qoe.d(-1, -2.0f, 23, z ? 16.0f : 53.0f, 0.0f, z ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ee0 ee0Var = new ee0(false);
        this.e = ee0Var;
        imageView.setImageDrawable(ee0Var);
        ee0Var.a(-1);
        ee0Var.b(-1);
        ee0Var.k = 220.0f;
        addView(imageView, qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new oha(this, (byte) 17));
    }
}
