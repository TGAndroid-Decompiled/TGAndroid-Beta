package ai;

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
import org.telegram.ui.zn;
public final class a4 extends ChatActivityEnterView {
    public ValueAnimator f510o5;
    public int p5;
    public int f511q5;
    public int f512r5;
    public final f6 f513s5;

    public a4(f6 f6Var, Activity activity, f6 f6Var2, x3 x3Var) {
        super(activity, f6Var2, null, true, x3Var);
        this.f513s5 = f6Var;
    }

    @Override
    public final void C0(int i10, int i11) {
        f6 f6Var = this.f513s5;
        if (f6Var.f797b2 != null) {
            this.f22049n3 = true;
            this.f511q5 = this.E0.getMeasuredHeight();
            this.f512r5 = this.E0.getScrollY();
            invalidate();
            f6Var.invalidate();
            this.p5 = f6Var.f797b2.getBackgroundTop();
        }
    }

    @Override
    public final void K1(int i10, boolean z10) {
        super.K1(i10, z10);
        T1();
    }

    @Override
    public final void P1(boolean z10) {
        boolean z11;
        f6 f6Var = this.f513s5;
        if (!f6Var.F1 && !f6Var.G1) {
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
        if (this.A1.getAlpha() < 0.5f) {
            H0();
            return false;
        }
        f6 f6Var = this.f513s5;
        if (f6Var.O1.f706f) {
            long j3 = f6Var.L3;
            messageMinPrice = f6Var.getMessageMinPrice();
            long max = Math.max(j3, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
            int length = formatTextWithEntities.length();
            int[] iArr = MessagesController.getInstance(f6Var.C2).starsGroupcallMessageLimits;
            if (iArr != null && iArr.length > 2) {
                i10 = iArr[2];
            } else {
                i10 = 400;
            }
            if (length > i10) {
                NumberTextView numberTextView = this.f21975b0;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.f21975b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!f6Var.D0(true)) {
                if (formatTextWithEntities instanceof Spannable) {
                    Spannable spannable = (Spannable) formatTextWithEntities;
                    i11 = ((org.telegram.ui.Components.y5[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.y5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
                } else {
                    i11 = 0;
                }
                int i12 = (int) max;
                if (i11 > g0.b(f6Var.C2, i12, 2) || formatTextWithEntities.length() > g0.b(f6Var.C2, i12, 1)) {
                    f6Var.O0();
                    return false;
                }
            }
            f6Var.L0.o(textWithEntities, max);
            this.E0.setText("");
            AndroidUtilities.hideKeyboard(this);
            f6Var.L3 = 0L;
            f6Var.r0(true);
            K(true);
            return true;
        }
        return super.S0();
    }

    @Override
    public final boolean T0(int i10, boolean z10, int i11, boolean z11, long j3) {
        f6 f6Var = this.f513s5;
        if (MessagesController.getInstance(f6Var.C2).isFrozen()) {
            org.telegram.ui.b.b(f6Var.C2);
            return false;
        }
        return super.T0(i10, z10, i11, z11, j3);
    }

    public final void T1() {
        throw new UnsupportedOperationException("Method not decompiled: ai.a4.T1():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f7;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = AndroidUtilities.rectTmp;
            float width = getWidth();
            f6 f6Var = this.f513s5;
            if (f6Var.f821i2 != null) {
                f7 = this.f22105y * 1.5f;
            } else {
                f7 = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f7, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = f6Var.f821i2) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = f6Var.f821i2;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        f6.h0(f6Var);
                    }
                    f6Var.f821i2.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = f6Var.f821i2) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = f6Var.f821i2;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void g1(float f7, float f10, float f11, boolean z10) {
        LinearLayout linearLayout = this.f513s5.f815g2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f11) * f7);
        }
        super.g1(f7, f10, f11, z10);
    }

    @Override
    public final int getMessagesCount() {
        if (this.f513s5.O1.f706f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        f6 f6Var = this.f513s5;
        if (f6Var.O1.f706f) {
            messageMinPrice = f6Var.getMessageMinPrice();
            return Math.max(messageMinPrice, f6Var.L3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final void h0(Menu menu) {
        zn.k8(menu, null, false, !this.f513s5.O1.f706f, true, true);
    }

    @Override
    public final boolean q1(Runnable runnable) {
        this.f513s5.n0(runnable);
        return true;
    }

    @Override
    public final boolean t() {
        return this.f513s5.D0(true);
    }

    @Override
    public final void x0() {
        T1();
    }
}
