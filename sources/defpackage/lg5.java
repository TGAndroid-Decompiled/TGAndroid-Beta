package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public class lg5 extends FrameLayout {
    public final xb a;
    public final ImageView b;
    public View c;
    public AnimatorSet d;
    public Runnable e;
    public final byte f;
    public final boolean h;
    public float n;
    public float r;
    public int s;
    public long w;
    public boolean x;

    public lg5(int i, vnb vnbVar, Context context, boolean z) {
        super(context);
        int i2;
        float f;
        float f2;
        float f3;
        int i3;
        int i4;
        float f4;
        float f5;
        this.w = 2000L;
        this.f = i;
        this.h = z;
        xb xbVar = new xb(context, (byte) 18);
        this.a = xbVar;
        int i5 = aob.gg;
        yob.X(xbVar, i5, vnbVar);
        xbVar.setTextSize(1, 14.0f);
        xbVar.setMaxLines(2);
        if (i != 7 && i != 8 && i != 9) {
            if (i == 4) {
                xbVar.setMaxWidth(hl.L(280.0f));
            } else {
                xbVar.setMaxWidth(hl.L(250.0f));
            }
        } else {
            xbVar.setMaxWidth(hl.L(310.0f));
        }
        if (i == 3) {
            xbVar.setGravity(19);
            int L = hl.L(5.0f);
            i2 = aob.hg;
            ShapeDrawable b0 = aob.b0(L, aob.v0(i2, vnbVar));
            uob M = yob.M(i2);
            xbVar.setBackground(b0);
            yob.j(xbVar, b0, M, null, vnbVar);
            xbVar.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
            if (z) {
                f4 = 6.0f;
            } else {
                f4 = 0.0f;
            }
            if (z) {
                f5 = 0.0f;
            } else {
                f5 = 6.0f;
            }
            addView(xbVar, tre.d(-2, 30.0f, 51, 0.0f, f4, 0.0f, f5));
        } else {
            xbVar.setGravity(51);
            int L2 = hl.L(10.0f);
            i2 = aob.hg;
            ShapeDrawable b02 = aob.b0(L2, aob.v0(i2, vnbVar));
            uob M2 = yob.M(i2);
            xbVar.setBackground(b02);
            yob.j(xbVar, b02, M2, null, vnbVar);
            if (i == 0) {
                f = 54.0f;
            } else {
                f = 12.0f;
            }
            xbVar.setPadding(hl.L(f), hl.L(9.0f), hl.L(12.0f), hl.L(10.0f));
            if (z) {
                f2 = 6.0f;
            } else {
                f2 = 0.0f;
            }
            if (z) {
                f3 = 0.0f;
            } else {
                f3 = 6.0f;
            }
            addView(xbVar, tre.d(-2, -2.0f, 51, 0.0f, f2, 0.0f, f3));
        }
        if (i == 0) {
            xbVar.setText(ob6.M0(2131753755, null));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232811);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            yob.s(imageView, i5, vnbVar, PorterDuff.Mode.MULTIPLY);
            addView(imageView, tre.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.b = imageView2;
        if (z) {
            i3 = 2131232808;
        } else {
            i3 = 2131232807;
        }
        imageView2.setImageResource(i3);
        yob.s(imageView2, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
        if (z) {
            i4 = 48;
        } else {
            i4 = 80;
        }
        addView(imageView2, tre.d(14, 6.0f, i4 | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.e;
        if (runnable != null) {
            hl.r(runnable);
            this.e = null;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.d = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.d = animatorSet2;
        boolean z = this.x;
        Property property = View.ALPHA;
        if (z) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f, 0.5f), ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f, 0.5f));
            this.d.setDuration(150L);
            this.d.setInterpolator(k43.f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new ig5(this, (byte) 1));
        this.d.start();
    }

    public final void b() {
        float f;
        xb xbVar = this.a;
        yob.q(xbVar);
        ImageView imageView = this.b;
        yob.q(imageView);
        xbVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        byte b = this.f;
        if (b != 7 && b != 8) {
            f = 3.0f;
        } else {
            f = 6.0f;
        }
        xbVar.setBackground(aob.b0(hl.L(f), -366530760));
    }

    public final void c(View view) {
        if (this.c != view && getTag() == null) {
            Runnable runnable = this.e;
            if (runnable != null) {
                hl.r(runnable);
                this.e = null;
            }
            d(view);
            this.c = view;
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.d = null;
            }
            setTag(1);
            setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.d = animatorSet2;
            boolean z = this.x;
            Property property = View.ALPHA;
            if (z) {
                ImageView imageView = this.b;
                setPivotX((imageView.getMeasuredWidth() / 2.0f) + imageView.getX());
                setPivotY((imageView.getMeasuredHeight() / 2.0f) + imageView.getY());
                this.d.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.5f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.5f, 1.0f));
                this.d.setDuration(350L);
                this.d.setInterpolator(k43.h);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                this.d.setDuration(300L);
            }
            this.d.addListener(new ig5(this, (byte) 0));
            this.d.start();
        } else if (getTag() != null) {
            d(view);
        }
    }

    public final void d(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg5.d(android.view.View):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getBaseTranslationY() {
        return this.n;
    }

    public wb2 getMessageCell() {
        return null;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setBottomOffset(int i) {
        this.s = i;
    }

    public void setExtraTranslationY(float f) {
        this.r = f;
        setTranslationY(f + this.n);
    }

    public void setOverrideText(String str) {
        this.a.setText(str);
    }

    public void setShowingDuration(long j) {
        this.w = j;
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setUseScale(boolean z) {
        this.x = z;
    }

    public void setVisibleListener(jg5 jg5Var) {
    }

    public lg5(Context context, int i) {
        this(i, null, context, false);
    }
}
