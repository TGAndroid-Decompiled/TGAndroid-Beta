package di;

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
import org.telegram.ui.wn;
public final class u2 extends ChatActivityEnterView {
    public ValueAnimator f9222s5;
    public int f9223t5;
    public int f9224u5;
    public int f9225v5;
    public final q4 f9226w5;

    public u2(q4 q4Var, Activity activity, q4 q4Var2, s2 s2Var) {
        super(activity, q4Var2, null, true, s2Var);
        this.f9226w5 = q4Var;
    }

    @Override
    public final void I1(int i10, boolean z10) {
        super.I1(i10, z10);
        Q1();
    }

    @Override
    public final void M1(boolean z10) {
        boolean z11;
        q4 q4Var = this.f9226w5;
        if (!q4Var.f9031u1 && !q4Var.f9035v1) {
            z11 = false;
        } else {
            z11 = true;
        }
        N1(z11, z10);
    }

    @Override
    public final boolean P0() {
        long messageMinPrice;
        int i10;
        int i11;
        if (this.A1.getAlpha() < 0.5f) {
            E0();
            return false;
        }
        q4 q4Var = this.f9226w5;
        if (q4Var.D1.f8873f) {
            long j10 = q4Var.A3;
            messageMinPrice = q4Var.getMessageMinPrice();
            long max = Math.max(j10, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
            int length = formatTextWithEntities.length();
            int[] iArr = MessagesController.getInstance(q4Var.f9020r2).starsGroupcallMessageLimits;
            if (iArr != null && iArr.length > 2) {
                i10 = iArr[2];
            } else {
                i10 = 400;
            }
            if (length > i10) {
                NumberTextView numberTextView = this.f25853b0;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.f25853b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!q4Var.B0(true)) {
                if (formatTextWithEntities instanceof Spannable) {
                    Spannable spannable = (Spannable) formatTextWithEntities;
                    i11 = ((org.telegram.ui.Components.c6[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.c6.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
                } else {
                    i11 = 0;
                }
                int i12 = (int) max;
                if (i11 > u.b(q4Var.f9020r2, i12, 2) || formatTextWithEntities.length() > u.b(q4Var.f9020r2, i12, 1)) {
                    q4Var.M0();
                    return false;
                }
            }
            q4Var.A0.o(textWithEntities, max);
            this.E0.setText("");
            AndroidUtilities.hideKeyboard(this);
            q4Var.A3 = 0L;
            q4Var.p0(true);
            F(true);
            return true;
        }
        return super.P0();
    }

    @Override
    public final boolean Q0(int i10, boolean z10, int i11, boolean z11, long j10) {
        q4 q4Var = this.f9226w5;
        if (MessagesController.getInstance(q4Var.f9020r2).isFrozen()) {
            org.telegram.ui.b.b(q4Var.f9020r2);
            return false;
        }
        return super.Q0(i10, z10, i11, z11, j10);
    }

    public final void Q1() {
        throw new UnsupportedOperationException("Method not decompiled: di.u2.Q1():void");
    }

    @Override
    public final void d0(Menu menu) {
        wn.t8(menu, null, false, !this.f9226w5.D1.f8873f, true, true);
    }

    @Override
    public final void d1(float f7, float f10, float f11, boolean z10) {
        LinearLayout linearLayout = this.f9226w5.V1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f11) * f7);
        }
        super.d1(f7, f10, f11, z10);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f7;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = AndroidUtilities.rectTmp;
            float width = getWidth();
            q4 q4Var = this.f9226w5;
            if (q4Var.X1 != null) {
                f7 = this.f25987y * 1.5f;
            } else {
                f7 = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f7, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = q4Var.X1) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = q4Var.X1;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        q4.f0(q4Var);
                    }
                    q4Var.X1.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = q4Var.X1) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = q4Var.X1;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        if (this.f9226w5.D1.f8873f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        q4 q4Var = this.f9226w5;
        if (q4Var.D1.f8873f) {
            messageMinPrice = q4Var.getMessageMinPrice();
            return Math.max(messageMinPrice, q4Var.A3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final boolean n1(Runnable runnable) {
        this.f9226w5.l0(runnable);
        return true;
    }

    @Override
    public final boolean p() {
        return this.f9226w5.B0(true);
    }

    @Override
    public final void t0() {
        Q1();
    }

    @Override
    public final void z0(int i10, int i11) {
        q4 q4Var = this.f9226w5;
        if (q4Var.Q1 != null) {
            this.f25928n3 = true;
            this.f9224u5 = this.E0.getMeasuredHeight();
            this.f9225v5 = this.E0.getScrollY();
            invalidate();
            q4Var.invalidate();
            this.f9223t5 = q4Var.Q1.getBackgroundTop();
        }
    }
}
