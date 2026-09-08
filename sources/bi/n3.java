package bi;

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
import org.telegram.ui.co;
public final class n3 extends ChatActivityEnterView {
    public ValueAnimator f3383n5;
    public int f3384o5;
    public int p5;
    public int f3385q5;
    public final o5 f3386r5;

    public n3(o5 o5Var, Activity activity, o5 o5Var2, k3 k3Var) {
        super(activity, o5Var2, null, true, k3Var);
        this.f3386r5 = o5Var;
    }

    @Override
    public final void C0(int i10, int i11) {
        o5 o5Var = this.f3386r5;
        if (o5Var.f3433b2 != null) {
            this.f23764m3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.f3385q5 = this.E0.getScrollY();
            invalidate();
            o5Var.invalidate();
            this.f3384o5 = o5Var.f3433b2.getBackgroundTop();
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
        o5 o5Var = this.f3386r5;
        if (!o5Var.F1 && !o5Var.G1) {
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
        if (this.f23832z1.getAlpha() < 0.5f) {
            H0();
            return false;
        }
        o5 o5Var = this.f3386r5;
        if (o5Var.O1.f3341f) {
            long j3 = o5Var.L3;
            messageMinPrice = o5Var.getMessageMinPrice();
            long max = Math.max(j3, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
            int length = formatTextWithEntities.length();
            int[] iArr = MessagesController.getInstance(o5Var.C2).starsGroupcallMessageLimits;
            if (iArr != null && iArr.length > 2) {
                i10 = iArr[2];
            } else {
                i10 = 400;
            }
            if (length > i10) {
                NumberTextView numberTextView = this.f23696b0;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.f23696b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!o5Var.D0(true)) {
                if (formatTextWithEntities instanceof Spannable) {
                    Spannable spannable = (Spannable) formatTextWithEntities;
                    i11 = ((org.telegram.ui.Components.z5[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.z5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
                } else {
                    i11 = 0;
                }
                int i12 = (int) max;
                if (i11 > z.b(o5Var.C2, i12, 2) || formatTextWithEntities.length() > z.b(o5Var.C2, i12, 1)) {
                    o5Var.O0();
                    return false;
                }
            }
            o5Var.L0.o(textWithEntities, max);
            this.E0.setText("");
            AndroidUtilities.hideKeyboard(this);
            o5Var.L3 = 0L;
            o5Var.r0(true);
            K(true);
            return true;
        }
        return super.S0();
    }

    @Override
    public final boolean T0(int i10, boolean z10, int i11, boolean z11, long j3) {
        o5 o5Var = this.f3386r5;
        if (MessagesController.getInstance(o5Var.C2).isFrozen()) {
            org.telegram.ui.b.b(o5Var.C2);
            return false;
        }
        return super.T0(i10, z10, i11, z11, j3);
    }

    public final void T1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.n3.T1():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f7;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = AndroidUtilities.rectTmp;
            float width = getWidth();
            o5 o5Var = this.f3386r5;
            if (o5Var.f3457i2 != null) {
                f7 = this.f23826y * 1.5f;
            } else {
                f7 = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f7, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = o5Var.f3457i2) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = o5Var.f3457i2;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        o5.h0(o5Var);
                    }
                    o5Var.f3457i2.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = o5Var.f3457i2) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = o5Var.f3457i2;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        if (this.f3386r5.O1.f3341f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        o5 o5Var = this.f3386r5;
        if (o5Var.O1.f3341f) {
            messageMinPrice = o5Var.getMessageMinPrice();
            return Math.max(messageMinPrice, o5Var.L3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final void h0(Menu menu) {
        co.k8(menu, null, false, !this.f3386r5.O1.f3341f, true, true);
    }

    @Override
    public final void h1(float f7, float f10, float f11, boolean z10) {
        LinearLayout linearLayout = this.f3386r5.f3451g2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f11) * f7);
        }
        super.h1(f7, f10, f11, z10);
    }

    @Override
    public final boolean r1(Runnable runnable) {
        this.f3386r5.n0(runnable);
        return true;
    }

    @Override
    public final boolean t() {
        return this.f3386r5.D0(true);
    }

    @Override
    public final void x0() {
        T1();
    }
}
