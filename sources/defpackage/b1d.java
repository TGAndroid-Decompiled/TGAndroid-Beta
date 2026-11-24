package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class b1d extends View {
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public float K;
    public AnimatorSet L;
    public a1d M;
    public boolean N;
    public final v20 O;
    public final Drawable a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public b1d(Context context) {
        super(context);
        this.N = true;
        this.O = new v20(this);
        this.a = context.getResources().getDrawable(2131232883);
        this.b = context.getResources().getDrawable(2131232884);
        this.c = context.getResources().getDrawable(2131232887);
        this.d = context.getResources().getDrawable(2131232888);
        this.e = context.getResources().getDrawable(2131232885);
        this.f = context.getResources().getDrawable(2131232886);
    }

    public final boolean a(float f) {
        if (f < 0.0f || f > 1.0f) {
            return false;
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.K = f;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.L = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.O, f));
        this.L.setDuration(180L);
        this.L.addListener(new koc(this, (byte) 6));
        this.L.start();
        return true;
    }

    public final void b(boolean r3, float r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1d.b(boolean, float):void");
    }

    public float getZoom() {
        if (this.L != null) {
            return this.K;
        }
        return this.F;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        Drawable drawable;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        if (getMeasuredWidth() > getMeasuredHeight()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.h = gm.L(41.0f);
            this.n = measuredHeight;
            this.r = getMeasuredWidth() - gm.L(41.0f);
            this.s = measuredHeight;
            this.w = gm.L(18.0f) + this.h;
            this.x = measuredHeight;
            this.y = this.r - gm.L(18.0f);
            this.E = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.n = gm.L(41.0f);
            this.r = measuredWidth;
            this.s = getMeasuredHeight() - gm.L(41.0f);
            this.w = measuredWidth;
            this.x = gm.L(18.0f) + this.n;
            this.y = measuredWidth;
            this.E = this.s - gm.L(18.0f);
        }
        int L = this.h - gm.L(7.0f);
        int L2 = this.n - gm.L(7.0f);
        int L3 = gm.L(7.0f) + this.h;
        int L4 = gm.L(7.0f) + this.n;
        Drawable drawable2 = this.a;
        drawable2.setBounds(L, L2, L3, L4);
        drawable2.draw(canvas);
        int L5 = this.r - gm.L(7.0f);
        int L6 = this.s - gm.L(7.0f);
        int L7 = gm.L(7.0f) + this.r;
        int L8 = gm.L(7.0f) + this.s;
        Drawable drawable3 = this.b;
        drawable3.setBounds(L5, L6, L7, L8);
        drawable3.draw(canvas);
        int i = this.y;
        int i2 = this.w;
        int i3 = this.E;
        int i4 = this.x;
        float f = this.F;
        int i5 = (int) (((i - i2) * f) + i2);
        int i6 = (int) (((i3 - i4) * f) + i4);
        Drawable drawable4 = this.c;
        Drawable drawable5 = this.d;
        if (z) {
            drawable4.setBounds(i2, i4 - gm.L(3.0f), this.y, gm.L(3.0f) + this.x);
            drawable5.setBounds(this.w, this.x - gm.L(3.0f), i5, gm.L(3.0f) + this.x);
        } else {
            drawable4.setBounds(i4, 0, i3, gm.L(6.0f));
            drawable5.setBounds(this.x, 0, i6, gm.L(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.w) - gm.L(3.0f));
        }
        drawable4.draw(canvas);
        drawable5.draw(canvas);
        if (!z) {
            canvas.restore();
        }
        if (this.H) {
            drawable = this.f;
        } else {
            drawable = this.e;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i5 - intrinsicWidth, i6 - intrinsicWidth, i5 + intrinsicWidth, i6 + intrinsicWidth);
        drawable.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(a1d a1dVar) {
        this.M = a1dVar;
    }
}
