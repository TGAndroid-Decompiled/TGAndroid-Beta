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
public class ig5 extends FrameLayout {
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

    public ig5(int i, ylb ylbVar, Context context, boolean z) {
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
        int i5 = cmb.fg;
        anb.X(wbVar, i5, ylbVar);
        wbVar.setTextSize(1, 14.0f);
        wbVar.setMaxLines(2);
        if (i != 7 && i != 8 && i != 9) {
            if (i == 4) {
                wbVar.setMaxWidth(gm.L(280.0f));
            } else {
                wbVar.setMaxWidth(gm.L(250.0f));
            }
        } else {
            wbVar.setMaxWidth(gm.L(310.0f));
        }
        if (i == 3) {
            wbVar.setGravity(19);
            int L = gm.L(5.0f);
            i2 = cmb.gg;
            ShapeDrawable b0 = cmb.b0(L, cmb.v0(i2, ylbVar));
            wmb M = anb.M(i2);
            wbVar.setBackground(b0);
            anb.j(wbVar, b0, M, null, ylbVar);
            wbVar.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
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
            addView(wbVar, qoe.d(-2, 30.0f, 51, 0.0f, f4, 0.0f, f5));
        } else {
            wbVar.setGravity(51);
            int L2 = gm.L(10.0f);
            i2 = cmb.gg;
            ShapeDrawable b02 = cmb.b0(L2, cmb.v0(i2, ylbVar));
            wmb M2 = anb.M(i2);
            wbVar.setBackground(b02);
            anb.j(wbVar, b02, M2, null, ylbVar);
            if (i == 0) {
                f = 54.0f;
            } else {
                f = 12.0f;
            }
            wbVar.setPadding(gm.L(f), gm.L(9.0f), gm.L(12.0f), gm.L(10.0f));
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
            addView(wbVar, qoe.d(-2, -2.0f, 51, 0.0f, f2, 0.0f, f3));
        }
        if (i == 0) {
            wbVar.setText(jb6.M0(2131753727, null));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(2131232805);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            anb.s(imageView, i5, ylbVar, PorterDuff.Mode.MULTIPLY);
            addView(imageView, qoe.d(38, 34.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        }
        ImageView imageView2 = new ImageView(context);
        this.b = imageView2;
        if (z) {
            i3 = 2131232802;
        } else {
            i3 = 2131232801;
        }
        imageView2.setImageResource(i3);
        anb.s(imageView2, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
        if (z) {
            i4 = 48;
        } else {
            i4 = 80;
        }
        addView(imageView2, qoe.d(14, 6.0f, i4 | 3, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.e;
        if (runnable != null) {
            gm.r(runnable);
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
            this.d.setInterpolator(d53.f);
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f));
            this.d.setDuration(300L);
        }
        this.d.addListener(new fg5(this, (byte) 1));
        this.d.start();
    }

    public final void b() {
        float f;
        wb wbVar = this.a;
        anb.q(wbVar);
        ImageView imageView = this.b;
        anb.q(imageView);
        wbVar.setTextColor(-1);
        imageView.setColorFilter(new PorterDuffColorFilter(-366530760, PorterDuff.Mode.MULTIPLY));
        byte b = this.f;
        if (b != 7 && b != 8) {
            f = 3.0f;
        } else {
            f = 6.0f;
        }
        wbVar.setBackground(cmb.b0(gm.L(f), -366530760));
    }

    public final void c(View view) {
        if (this.c != view && getTag() == null) {
            Runnable runnable = this.e;
            if (runnable != null) {
                gm.r(runnable);
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
                this.d.setInterpolator(d53.h);
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f));
                this.d.setDuration(300L);
            }
            this.d.addListener(new fg5(this, (byte) 0));
            this.d.start();
        } else if (getTag() != null) {
            d(view);
        }
    }

    public final void d(android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig5.d(android.view.View):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getBaseTranslationY() {
        return this.n;
    }

    public rc2 getMessageCell() {
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

    public void setVisibleListener(gg5 gg5Var) {
    }

    public ig5(Context context, int i) {
        this(i, null, context, false);
    }
}
