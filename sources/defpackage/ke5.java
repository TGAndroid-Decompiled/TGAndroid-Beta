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
public class ke5 extends FrameLayout {
    public final wb a;
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

    public ke5(int i, wjb wjbVar, Context context, boolean z) {
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
        wb wbVar = new wb(context, (byte) 18);
        this.a = wbVar;
        int i5 = bkb.fg;
        zkb.X(wbVar, i5, wjbVar);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setMaxLines(2);
        if (i != 7 && i != 8 && i != 9) {
            if (i == 4) {
                wbVar.setMaxWidth(gl.L(280.0f));
            } else {
                wbVar.setMaxWidth(gl.L(250.0f));
            }
        } else {
            wbVar.setMaxWidth(gl.L(310.0f));
        }
        if (i == 3) {
            wbVar.setGravity(19);
            int L = gl.L(5.0f);
            i2 = bkb.gg;
            ShapeDrawable b0 = bkb.b0(L, bkb.v0(i2, wjbVar));
            vkb M = zkb.M(i2);
            wbVar.setBackground(b0);
            zkb.j(wbVar, b0, M, null, wjbVar);
            wbVar.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
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
            addView(wbVar, nme.d(-2, 30.0f, 51, 0.0f, f4, 0.0f, f5));
        } else {
            wbVar.setGravity(51);
            int L2 = gl.L(10.0f);
            i2 = bkb.gg;
            ShapeDrawable b02 = bkb.b0(L2, bkb.v0(i2, wjbVar));
            vkb M2 = zkb.M(i2);
            wbVar.setBackground(b02);
            zkb.j(wbVar, b02, M2, null, wjbVar);
            if (i == 0) {
                f = 54.0f;
            } else {
                f = 12.0f;
            }
            wbVar.setPadding(gl.L(f), gl.L(9.0f), gl.L(12.0f), gl.L(10.0f));
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
            addView(wbVar, nme.d(-2, -2.0f, 51, 0.0f, f2, 0.0f, f3));
        }
        if (i == 0) {
            wbVar.setText(k96.M0(2131753759, null));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232792);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            zkb.s(imageView, i5, wjbVar, PorterDuff.Mode.MULTIPLY);
            addView(imageView, nme.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.b = imageView2;
        if (z) {
            i3 = 2131232789;
        } else {
            i3 = 2131232788;
        }
        imageView2.setImageResource(i3);
        zkb.s(imageView2, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
        if (z) {
            i4 = 48;
        } else {
            i4 = 80;
        }
        addView(imageView2, nme.d(14, 6.0f, i4 | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.e;
        if (runnable != null) {
            gl.r(runnable);
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
            this.d.setInterpolator(s33.f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new he5(this, (byte) 1));
        this.d.start();
    }

    public final void b() {
        float f;
        wb wbVar = this.a;
        zkb.q(wbVar);
        ImageView imageView = this.b;
        zkb.q(imageView);
        wbVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        byte b = this.f;
        if (b != 7 && b != 8) {
            f = 3.0f;
        } else {
            f = 6.0f;
        }
        wbVar.setBackground(bkb.b0(gl.L(f), -366530760));
    }

    public final void c(View view) {
        if (this.c != view && getTag() == null) {
            Runnable runnable = this.e;
            if (runnable != null) {
                gl.r(runnable);
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
                this.d.setInterpolator(s33.h);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                this.d.setDuration(300L);
            }
            this.d.addListener(new he5(this, (byte) 0));
            this.d.start();
        } else if (getTag() != null) {
            d(view);
        }
    }

    public final void d(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke5.d(android.view.View):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getBaseTranslationY() {
        return this.n;
    }

    public gb2 getMessageCell() {
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

    public void setVisibleListener(ie5 ie5Var) {
    }

    public ke5(Context context, int i) {
        this(i, null, context, false);
    }
}
