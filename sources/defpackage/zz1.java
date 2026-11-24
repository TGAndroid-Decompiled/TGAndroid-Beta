package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.d;
public final class zz1 extends rt3 {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final x02 d0;

    public zz1(x02 x02Var, Context context, k02 k02Var, wjb wjbVar) {
        super(context, k02Var, null, 1, true, wjbVar);
        this.d0 = x02Var;
    }

    @Override
    public final void c(float f) {
        x02 x02Var = this.d0;
        x02Var.d4 = f;
        wz1 wz1Var = x02Var.A2;
        wz1Var.setTranslationY(f);
        wz1Var.invalidate();
        x02Var.N0();
        x02Var.H1(x02Var.v2, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            gt3 editText = this.d0.B2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new pk(this, editText, (byte) 7));
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(s33.f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*fx0*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        t14 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(gl.n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        d dVar = this.d0.Z1;
        if (dVar instanceof mu1) {
            mu1.v6(menu, ((mu1) dVar).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        x02 x02Var = this.d0;
        zz1 zz1Var = x02Var.B2;
        if (!x02Var.r3) {
            if (motionEvent.getX() > zz1Var.getEditText().getLeft() && motionEvent.getX() < zz1Var.getEditText().getRight() && motionEvent.getY() > zz1Var.getEditText().getTop() && motionEvent.getY() < zz1Var.getEditText().getBottom()) {
                x02Var.c1(zz1Var.getEditText(), true);
            } else {
                x02Var.c1(zz1Var.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.d0.E1();
    }

    @Override
    public final void q(int i, int i2) {
        x02 x02Var = this.d0;
        wz1 wz1Var = x02Var.A2;
        boolean z = false;
        if (!TextUtils.isEmpty(getEditText().getText())) {
            this.W = true;
            this.a0 = getEditText().getMeasuredHeight();
            this.b0 = getEditText().getScrollY();
            invalidate();
        } else {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        }
        if (!x02Var.W1) {
            if (i2 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z = true;
            }
            x02Var.w1(z);
        }
        x02Var.T3 = wz1Var.getTop() + x02Var.S3;
        wz1Var.invalidate();
        x02Var.E1();
    }
}
