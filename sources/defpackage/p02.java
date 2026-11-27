package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.e;
public final class p02 extends iu3 {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final n12 d0;

    public p02(n12 n12Var, Context context, a12 a12Var, vnb vnbVar) {
        super(context, a12Var, null, 1, true, vnbVar);
        this.d0 = n12Var;
    }

    @Override
    public final void c(float f) {
        n12 n12Var = this.d0;
        n12Var.d4 = f;
        m02 m02Var = n12Var.A2;
        m02Var.setTranslationY(f);
        m02Var.invalidate();
        n12Var.O0();
        n12Var.I1(n12Var.v2, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            xt3 editText = this.d0.B2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new lk(this, editText, (byte) 7));
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(k43.f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*nx0*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        o24 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(hl.n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        e eVar = this.d0.Z1;
        if (eVar instanceof zu1) {
            zu1.E6(menu, ((zu1) eVar).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        n12 n12Var = this.d0;
        p02 p02Var = n12Var.B2;
        if (!n12Var.r3) {
            if (motionEvent.getX() > p02Var.getEditText().getLeft() && motionEvent.getX() < p02Var.getEditText().getRight() && motionEvent.getY() > p02Var.getEditText().getTop() && motionEvent.getY() < p02Var.getEditText().getBottom()) {
                n12Var.d1(p02Var.getEditText(), true);
            } else {
                n12Var.d1(p02Var.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.d0.F1();
    }

    @Override
    public final void q(int i, int i2) {
        n12 n12Var = this.d0;
        m02 m02Var = n12Var.A2;
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
        if (!n12Var.W1) {
            if (i2 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z = true;
            }
            n12Var.x1(z);
        }
        n12Var.T3 = m02Var.getTop() + n12Var.S3;
        m02Var.invalidate();
        n12Var.F1();
    }
}
