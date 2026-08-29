package lh;

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
import org.telegram.ui.tn;
public final class n2 extends ChatActivityEnterView {
    public ValueAnimator f15967j5;
    public int f15968k5;
    public int f15969l5;
    public int f15970m5;
    public final d4 f15971n5;

    public n2(d4 d4Var, Activity activity, d4 d4Var2, l2 l2Var) {
        super(activity, d4Var2, null, true, l2Var);
        this.f15971n5 = d4Var;
    }

    @Override
    public final void C0(int i10, int i11) {
        d4 d4Var = this.f15971n5;
        if (d4Var.X1 != null) {
            this.f26140i3 = true;
            this.f15969l5 = this.A0.getMeasuredHeight();
            this.f15970m5 = this.A0.getScrollY();
            invalidate();
            d4Var.invalidate();
            this.f15968k5 = d4Var.X1.getBackgroundTop();
        }
    }

    @Override
    public final void L1(int i10, boolean z10) {
        super.L1(i10, z10);
        T1();
    }

    @Override
    public final void P1(boolean z10) {
        boolean z11;
        d4 d4Var = this.f15971n5;
        if (!d4Var.B1 && !d4Var.C1) {
            z11 = false;
        } else {
            z11 = true;
        }
        Q1(z11, z10);
    }

    @Override
    public final boolean S0() {
        long messageMinPrice;
        int i10;
        int i11;
        if (this.f26204v1.getAlpha() < 0.5f) {
            H0();
            return false;
        }
        d4 d4Var = this.f15971n5;
        if (d4Var.K1.f15378f) {
            long j10 = d4Var.H3;
            messageMinPrice = d4Var.getMessageMinPrice();
            long max = Math.max(j10, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
            int length = formatTextWithEntities.length();
            int[] iArr = MessagesController.getInstance(d4Var.f15545y2).starsGroupcallMessageLimits;
            if (iArr != null && iArr.length > 2) {
                i10 = iArr[2];
            } else {
                i10 = 400;
            }
            if (length > i10) {
                NumberTextView numberTextView = this.U;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.U.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!d4Var.D0(true)) {
                if (formatTextWithEntities instanceof Spannable) {
                    Spannable spannable = (Spannable) formatTextWithEntities;
                    i11 = ((org.telegram.ui.Components.y5[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.y5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
                } else {
                    i11 = 0;
                }
                int i12 = (int) max;
                if (i11 > s.b(d4Var.f15545y2, i12, 2) || formatTextWithEntities.length() > s.b(d4Var.f15545y2, i12, 1)) {
                    d4Var.O0();
                    return false;
                }
            }
            d4Var.H0.o(textWithEntities, max);
            this.A0.setText("");
            AndroidUtilities.hideKeyboard(this);
            d4Var.H3 = 0L;
            d4Var.r0(true);
            J(true);
            return true;
        }
        return super.S0();
    }

    @Override
    public final boolean T0(int i10, boolean z10, int i11, boolean z11, long j10) {
        d4 d4Var = this.f15971n5;
        if (MessagesController.getInstance(d4Var.f15545y2).isFrozen()) {
            org.telegram.ui.c.b(d4Var.f15545y2);
            return false;
        }
        return super.T0(i10, z10, i11, z11, j10);
    }

    public final void T1() {
        throw new UnsupportedOperationException("Method not decompiled: lh.n2.T1():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f9;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = AndroidUtilities.rectTmp;
            float width = getWidth();
            d4 d4Var = this.f15971n5;
            if (d4Var.f15479e2 != null) {
                f9 = this.f26219y * 1.5f;
            } else {
                f9 = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f9, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = d4Var.f15479e2) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = d4Var.f15479e2;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        d4.h0(d4Var);
                    }
                    d4Var.f15479e2.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = d4Var.f15479e2) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = d4Var.f15479e2;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        if (this.f15971n5.K1.f15378f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        d4 d4Var = this.f15971n5;
        if (d4Var.K1.f15378f) {
            messageMinPrice = d4Var.getMessageMinPrice();
            return Math.max(messageMinPrice, d4Var.H3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final void h0(Menu menu) {
        tn.k8(menu, null, false, !this.f15971n5.K1.f15378f, true, true);
    }

    @Override
    public final void h1(float f9, float f10, float f11, boolean z10) {
        LinearLayout linearLayout = this.f15971n5.f15474c2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f11) * f9);
        }
        super.h1(f9, f10, f11, z10);
    }

    @Override
    public final boolean r1(Runnable runnable) {
        this.f15971n5.n0(runnable);
        return true;
    }

    @Override
    public final boolean t() {
        return this.f15971n5.D0(true);
    }

    @Override
    public final void x0() {
        T1();
    }
}
