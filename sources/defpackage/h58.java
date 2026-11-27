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
public final class h58 extends ChatActivityEnterView {
    public ValueAnimator Y7;
    public int Z7;
    public int a8;
    public int b8;
    public final o68 c8;

    public h58(o68 o68Var, Activity activity, o68 o68Var2, pu0 pu0Var) {
        super(activity, o68Var2, null, true, pu0Var);
        this.c8 = o68Var;
    }

    @Override
    public final void D2(int i, boolean z) {
        super.D2(i, z);
        X2();
    }

    @Override
    public final boolean E1() {
        long messageMinPrice;
        int i;
        int i2;
        if (this.p2.getAlpha() < 0.5f) {
            o1();
            return false;
        }
        o68 o68Var = this.c8;
        if (o68Var.y1.f) {
            long j = o68Var.u3;
            messageMinPrice = o68Var.getMessageMinPrice();
            long max = Math.max(j, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence j0 = r47.j0(textWithEntities, false, false, new TextPaint());
            int length = j0.length();
            int[] iArr = uc7.s1(o68Var.m2).U3;
            if (iArr != null && iArr.length > 2) {
                i = iArr[2];
            } else {
                i = 400;
            }
            if (length > i) {
                NumberTextView numberTextView = this.c0;
                if (numberTextView != null) {
                    hl.A3(3.5f, numberTextView, null);
                    try {
                        this.c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!o68Var.v0(true)) {
                if (j0 instanceof Spannable) {
                    Spannable spannable = (Spannable) j0;
                    i2 = ((hm[]) spannable.getSpans(0, j0.length(), hm.class)).length + ((mv3[]) spannable.getSpans(0, j0.length(), mv3.class)).length;
                } else {
                    i2 = 0;
                }
                int i3 = (int) max;
                if (i2 > eg5.b(o68Var.m2, i3, 2) || j0.length() > eg5.b(o68Var.m2, i3, 1)) {
                    o68Var.H0();
                    return false;
                }
            }
            o68Var.v0.n(textWithEntities, max);
            this.F0.setText("");
            hl.t1(this);
            o68Var.u3 = 0L;
            o68Var.h0(true);
            P(true);
            return true;
        }
        return super.E1();
    }

    @Override
    public final void F0(Menu menu) {
        zu1.E6(menu, null, false, !this.c8.y1.f, true, true);
    }

    @Override
    public final boolean F1(boolean z, int i, int i2, long j, boolean z2) {
        o68 o68Var = this.c8;
        if (uc7.s1(o68Var.m2).x2()) {
            i5.b(o68Var.m2);
            return false;
        }
        return super.F1(z, i, i2, j, z2);
    }

    @Override
    public final void I2(boolean z) {
        boolean z2;
        o68 o68Var = this.c8;
        if (!o68Var.p1 && !o68Var.q1) {
            z2 = false;
        } else {
            z2 = true;
        }
        J2(z2, z);
    }

    @Override
    public final void S1(float f, float f2, float f3, boolean z) {
        LinearLayout linearLayout = this.c8.Q1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f3) * f);
        }
        super.S1(f, f2, f3, z);
    }

    public final void X2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h58.X2():void");
    }

    @Override
    public final void Y0() {
        X2();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = hl.P;
            float width = getWidth();
            o68 o68Var = this.c8;
            if (o68Var.S1 != null) {
                f = this.E * 1.5f;
            } else {
                f = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = o68Var.S1) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = o68Var.S1;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        o68Var.Y0();
                    }
                    o68Var.S1.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = o68Var.S1) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = o68Var.S1;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean g2(Runnable runnable) {
        this.c8.d0(runnable);
        return true;
    }

    @Override
    public final int getMessagesCount() {
        if (this.c8.y1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        o68 o68Var = this.c8;
        if (o68Var.y1.f) {
            messageMinPrice = o68Var.getMessageMinPrice();
            return Math.max(messageMinPrice, o68Var.u3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final void h1(int i, int i2) {
        o68 o68Var = this.c8;
        if (o68Var.L1 != null) {
            this.c4 = true;
            this.a8 = this.F0.getMeasuredHeight();
            this.b8 = this.F0.getScrollY();
            invalidate();
            o68Var.invalidate();
            this.Z7 = o68Var.L1.getBackgroundTop();
        }
    }

    @Override
    public final boolean w() {
        return this.c8.v0(true);
    }
}
