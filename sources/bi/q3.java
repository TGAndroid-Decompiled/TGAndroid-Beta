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
import org.telegram.ui.fo;
public final class q3 extends ChatActivityEnterView {
    public ValueAnimator f3501o5;
    public int p5;
    public int f3502q5;
    public int f3503r5;
    public final q5 f3504s5;

    public q3(q5 q5Var, Activity activity, q5 q5Var2, n3 n3Var) {
        super(activity, q5Var2, null, true, n3Var);
        this.f3504s5 = q5Var;
    }

    @Override
    public final void A0(int i10, int i11) {
        q5 q5Var = this.f3504s5;
        if (q5Var.f3512b2 != null) {
            this.f22632n3 = true;
            this.f3502q5 = this.E0.getMeasuredHeight();
            this.f3503r5 = this.E0.getScrollY();
            invalidate();
            q5Var.invalidate();
            this.p5 = q5Var.f3512b2.getBackgroundTop();
        }
    }

    @Override
    public final void I1(int i10, boolean z10) {
        super.I1(i10, z10);
        Q1();
    }

    @Override
    public final void M1(boolean z10) {
        boolean z11;
        q5 q5Var = this.f3504s5;
        if (!q5Var.F1 && !q5Var.G1) {
            z11 = false;
        } else {
            z11 = true;
        }
        N1(z11, z10);
    }

    @Override
    public final boolean Q0() {
        long messageMinPrice;
        int i10;
        int i11;
        if (this.A1.getAlpha() < 0.5f) {
            F0();
            return false;
        }
        q5 q5Var = this.f3504s5;
        if (q5Var.O1.f3420f) {
            long j10 = q5Var.L3;
            messageMinPrice = q5Var.getMessageMinPrice();
            long max = Math.max(j10, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
            int length = formatTextWithEntities.length();
            int[] iArr = MessagesController.getInstance(q5Var.C2).starsGroupcallMessageLimits;
            if (iArr != null && iArr.length > 2) {
                i10 = iArr[2];
            } else {
                i10 = 400;
            }
            if (length > i10) {
                NumberTextView numberTextView = this.f22557b0;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.f22557b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!q5Var.D0(true)) {
                if (formatTextWithEntities instanceof Spannable) {
                    Spannable spannable = (Spannable) formatTextWithEntities;
                    i11 = ((org.telegram.ui.Components.b6[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.b6.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
                } else {
                    i11 = 0;
                }
                int i12 = (int) max;
                if (i11 > z.b(q5Var.C2, i12, 2) || formatTextWithEntities.length() > z.b(q5Var.C2, i12, 1)) {
                    q5Var.O0();
                    return false;
                }
            }
            q5Var.L0.o(textWithEntities, max);
            this.E0.setText("");
            AndroidUtilities.hideKeyboard(this);
            q5Var.L3 = 0L;
            q5Var.r0(true);
            I(true);
            return true;
        }
        return super.Q0();
    }

    public final void Q1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.q3.Q1():void");
    }

    @Override
    public final boolean R0(int i10, boolean z10, int i11, boolean z11, long j10) {
        q5 q5Var = this.f3504s5;
        if (MessagesController.getInstance(q5Var.C2).isFrozen()) {
            org.telegram.ui.b.b(q5Var.C2);
            return false;
        }
        return super.R0(i10, z10, i11, z11, j10);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f7;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = AndroidUtilities.rectTmp;
            float width = getWidth();
            q5 q5Var = this.f3504s5;
            if (q5Var.f3536i2 != null) {
                f7 = this.f22688y * 1.5f;
            } else {
                f7 = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f7, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = q5Var.f3536i2) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = q5Var.f3536i2;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        q5.h0(q5Var);
                    }
                    q5Var.f3536i2.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = q5Var.f3536i2) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = q5Var.f3536i2;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e1(float f7, float f10, float f11, boolean z10) {
        LinearLayout linearLayout = this.f3504s5.f3530g2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f11) * f7);
        }
        super.e1(f7, f10, f11, z10);
    }

    @Override
    public final void f0(Menu menu) {
        fo.n8(menu, null, false, !this.f3504s5.O1.f3420f, true, true);
    }

    @Override
    public final int getMessagesCount() {
        if (this.f3504s5.O1.f3420f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        q5 q5Var = this.f3504s5;
        if (q5Var.O1.f3420f) {
            messageMinPrice = q5Var.getMessageMinPrice();
            return Math.max(messageMinPrice, q5Var.L3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final boolean o1(Runnable runnable) {
        this.f3504s5.n0(runnable);
        return true;
    }

    @Override
    public final boolean s() {
        return this.f3504s5.D0(true);
    }

    @Override
    public final void v0() {
        Q1();
    }
}
