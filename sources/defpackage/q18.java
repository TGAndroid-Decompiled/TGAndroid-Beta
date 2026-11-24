package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
public final class q18 extends ChatActivityEnterView {
    public ValueAnimator s7;
    public int t7;
    public int u7;
    public int v7;
    public final y28 w7;

    public q18(y28 y28Var, Activity activity, y28 y28Var2, gu0 gu0Var) {
        super(activity, y28Var2, null, true, gu0Var);
        this.w7 = y28Var;
    }

    @Override
    public final void B0(Menu menu) {
        mu1.x6(menu, null, false, !this.w7.E1.f, true, true);
    }

    public final void H2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q18.H2():void");
    }

    @Override
    public final void I1(float f, float f2, float f3, boolean z) {
        LinearLayout linearLayout = this.w7.W1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f3) * f);
        }
        super.I1(f, f2, f3, z);
    }

    @Override
    public final void U0() {
        H2();
    }

    @Override
    public final boolean U1(Runnable runnable) {
        this.w7.d0(runnable);
        return true;
    }

    @Override
    public final void c1(int i, int i2) {
        y28 y28Var = this.w7;
        if (y28Var.R1 != null) {
            this.d4 = true;
            this.u7 = this.F0.getMeasuredHeight();
            this.v7 = this.F0.getScrollY();
            invalidate();
            y28Var.invalidate();
            this.t7 = y28Var.R1.getBackgroundTop();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = gl.P;
            float width = getWidth();
            y28 y28Var = this.w7;
            if (y28Var.Y1 != null) {
                f = this.E * 1.5f;
            } else {
                f = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = y28Var.Y1) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = y28Var.Y1;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        y28Var.Y0();
                    }
                    y28Var.Y1.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = y28Var.Y1) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = y28Var.Y1;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        if (this.w7.E1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        y28 y28Var = this.w7;
        if (y28Var.E1.f) {
            messageMinPrice = y28Var.getMessageMinPrice();
            return Math.max(messageMinPrice, y28Var.A3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final void r2(int i, boolean z) {
        super.r2(i, z);
        H2();
    }

    @Override
    public final boolean u1() {
        long messageMinPrice;
        int i;
        int i2;
        if (this.q2.getAlpha() < 0.5f) {
            h1();
            return false;
        }
        y28 y28Var = this.w7;
        if (y28Var.E1.f) {
            long j = y28Var.A3;
            messageMinPrice = y28Var.getMessageMinPrice();
            long max = Math.max(j, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence j0 = k27.j0(textWithEntities, false, false, new TextPaint());
            int length = j0.length();
            int[] iArr = na7.q1(y28Var.s2).T3;
            if (iArr != null && iArr.length > 2) {
                i = iArr[2];
            } else {
                i = 400;
            }
            if (length > i) {
                NumberTextView numberTextView = this.c0;
                if (numberTextView != null) {
                    gl.A3(3.5f, numberTextView, null);
                    try {
                        this.c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!y28Var.v0(true)) {
                if (j0 instanceof Spannable) {
                    Spannable spannable = (Spannable) j0;
                    i2 = ((gm[]) spannable.getSpans(0, j0.length(), gm.class)).length + ((su3[]) spannable.getSpans(0, j0.length(), su3.class)).length;
                } else {
                    i2 = 0;
                }
                int i3 = (int) max;
                if (i2 > de5.b(y28Var.s2, i3, 2) || j0.length() > de5.b(y28Var.s2, i3, 1)) {
                    y28Var.H0();
                    return false;
                }
            }
            y28Var.B0.n(textWithEntities, max);
            this.F0.setText("");
            gl.t1(this);
            y28Var.A3 = 0L;
            y28Var.h0(true);
            N(true);
            return true;
        }
        return super.u1();
    }

    @Override
    public final boolean v1(boolean z, int i, int i2, long j, boolean z2) {
        y28 y28Var = this.w7;
        if (na7.q1(y28Var.s2).t2()) {
            h5.b(y28Var.s2);
            return false;
        }
        return super.v1(z, i, i2, j, z2);
    }

    @Override
    public final void v2(boolean z) {
        boolean z2;
        y28 y28Var = this.w7;
        if (!y28Var.v1 && !y28Var.w1) {
            z2 = false;
        } else {
            z2 = true;
        }
        w2(z2, z);
    }

    @Override
    public final boolean w() {
        return this.w7.v0(true);
    }
}
