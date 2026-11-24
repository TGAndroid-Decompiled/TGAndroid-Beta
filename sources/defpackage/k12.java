package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.d;
public final class k12 extends cv3 {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final i22 d0;

    public k12(i22 i22Var, Context context, v12 v12Var, ylb ylbVar) {
        super(context, v12Var, null, 1, true, ylbVar);
        this.d0 = i22Var;
    }

    @Override
    public final void c(float f) {
        i22 i22Var = this.d0;
        i22Var.d4 = f;
        h12 h12Var = i22Var.A2;
        h12Var.setTranslationY(f);
        h12Var.invalidate();
        i22Var.N0();
        i22Var.H1(i22Var.v2, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            qu3 editText = this.d0.B2.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new pl(this, editText, (byte) 7));
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(d53.f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void e() {
        super/*my0*/.dismiss();
    }

    @Override
    public final void f() {
        super.f();
        e34 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(gm.n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        d dVar = this.d0.Z1;
        if (dVar instanceof yv1) {
            yv1.E6(menu, ((yv1) dVar).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        i22 i22Var = this.d0;
        k12 k12Var = i22Var.B2;
        if (!i22Var.r3) {
            if (motionEvent.getX() > k12Var.getEditText().getLeft() && motionEvent.getX() < k12Var.getEditText().getRight() && motionEvent.getY() > k12Var.getEditText().getTop() && motionEvent.getY() < k12Var.getEditText().getBottom()) {
                i22Var.c1(k12Var.getEditText(), true);
            } else {
                i22Var.c1(k12Var.getEditText(), false);
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
        i22 i22Var = this.d0;
        h12 h12Var = i22Var.A2;
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
        if (!i22Var.W1) {
            if (i2 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z = true;
            }
            i22Var.w1(z);
        }
        i22Var.T3 = h12Var.getTop() + i22Var.S3;
        h12Var.invalidate();
        i22Var.E1();
    }
}
