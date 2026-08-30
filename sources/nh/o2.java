package nh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.xn;
public final class o2 extends ChatActivityEnterView {
    public ValueAnimator f15698k5;
    public int f15699l5;
    public int f15700m5;
    public int f15701n5;
    public final d4 f15702o5;

    public o2(d4 d4Var, Activity activity, d4 d4Var2, m2 m2Var) {
        super(activity, d4Var2, null, true, m2Var);
        this.f15702o5 = d4Var;
    }

    @Override
    public final void C0(int i10, int i11) {
        d4 d4Var = this.f15702o5;
        if (d4Var.Y1 != null) {
            this.f22789j3 = true;
            this.f15700m5 = this.B0.getMeasuredHeight();
            this.f15701n5 = this.B0.getScrollY();
            invalidate();
            d4Var.invalidate();
            this.f15699l5 = d4Var.Y1.getBackgroundTop();
        }
    }

    @Override
    public final void L1(int i10, boolean z4) {
        super.L1(i10, z4);
        T1();
    }

    @Override
    public final void P1(boolean z4) {
        boolean z10;
        d4 d4Var = this.f15702o5;
        if (!d4Var.C1 && !d4Var.D1) {
            z10 = false;
        } else {
            z10 = true;
        }
        Q1(z10, z4);
    }

    @Override
    public final boolean S0() {
        long messageMinPrice;
        int i10;
        int i11;
        if (this.f22854w1.getAlpha() < 0.5f) {
            H0();
            return false;
        }
        d4 d4Var = this.f15702o5;
        if (d4Var.L1.f15114f) {
            long j10 = d4Var.I3;
            messageMinPrice = d4Var.getMessageMinPrice();
            long max = Math.max(j10, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
            int length = formatTextWithEntities.length();
            int[] iArr = MessagesController.getInstance(d4Var.f15263z2).starsGroupcallMessageLimits;
            if (iArr != null && iArr.length > 2) {
                i10 = iArr[2];
            } else {
                i10 = 400;
            }
            if (length > i10) {
                NumberTextView numberTextView = this.V;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.V.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!d4Var.D0(true)) {
                if (formatTextWithEntities instanceof Spannable) {
                    Spannable spannable = (Spannable) formatTextWithEntities;
                    i11 = ((org.telegram.ui.Components.u5[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.u5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
                } else {
                    i11 = 0;
                }
                int i12 = (int) max;
                if (i11 > t.b(d4Var.f15263z2, i12, 2) || formatTextWithEntities.length() > t.b(d4Var.f15263z2, i12, 1)) {
                    d4Var.O0();
                    return false;
                }
            }
            d4Var.I0.o(textWithEntities, max);
            this.B0.setText("");
            AndroidUtilities.hideKeyboard(this);
            d4Var.I3 = 0L;
            d4Var.r0(true);
            J(true);
            return true;
        }
        return super.S0();
    }

    @Override
    public final boolean T0(int i10, boolean z4, int i11, boolean z10, long j10) {
        d4 d4Var = this.f15702o5;
        if (MessagesController.getInstance(d4Var.f15263z2).isFrozen()) {
            org.telegram.ui.c.b(d4Var.f15263z2);
            return false;
        }
        return super.T0(i10, z4, i11, z10, j10);
    }

    public final void T1() {
        throw new UnsupportedOperationException("Method not decompiled: nh.o2.T1():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f10;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = AndroidUtilities.rectTmp;
            float width = getWidth();
            d4 d4Var = this.f15702o5;
            if (d4Var.f15197f2 != null) {
                f10 = this.f22864y * 1.5f;
            } else {
                f10 = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f10, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = d4Var.f15197f2) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = d4Var.f15197f2;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        d4.h0(d4Var);
                    }
                    d4Var.f15197f2.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = d4Var.f15197f2) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = d4Var.f15197f2;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        if (this.f15702o5.L1.f15114f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        d4 d4Var = this.f15702o5;
        if (d4Var.L1.f15114f) {
            messageMinPrice = d4Var.getMessageMinPrice();
            return Math.max(messageMinPrice, d4Var.I3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final void h0(Menu menu) {
        xn.k8(menu, null, false, !this.f15702o5.L1.f15114f, true, true);
    }

    @Override
    public final void h1(float f10, float f11, float f12, boolean z4) {
        LinearLayout linearLayout = this.f15702o5.f15191d2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.h1(f10, f11, f12, z4);
    }

    @Override
    public final boolean r1(Runnable runnable) {
        this.f15702o5.n0(runnable);
        return true;
    }

    @Override
    public final boolean t() {
        return this.f15702o5.D0(true);
    }

    @Override
    public final void x0() {
        T1();
    }
}
