package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
public final class qda extends iu3 {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final kea d0;

    public qda(kea keaVar, Context context, xda xdaVar, vnb vnbVar) {
        super(context, xdaVar, null, 1, true, vnbVar);
        this.d0 = keaVar;
    }

    @Override
    public final void c(float f) {
        this.d0.U0();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            xt3 editText = this.d0.n1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new b49(editText, (byte) 27));
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
    public final void f() {
        super.f();
        o24 emojiView = getEmojiView();
        kea keaVar = this.d0;
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(keaVar.B2.d);
        }
        FrameLayout frameLayout = keaVar.X1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        pda pdaVar = keaVar.m1;
        if (pdaVar != null) {
            pdaVar.bringToFront();
        }
        pda pdaVar2 = keaVar.p1;
        if (pdaVar2 != null) {
            pdaVar2.bringToFront();
        }
    }

    @Override
    public final void q(int i, int i2) {
        kea keaVar = this.d0;
        pda pdaVar = keaVar.m1;
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
        keaVar.q2 = pdaVar.getTop() + keaVar.p2;
        pdaVar.invalidate();
    }
}
