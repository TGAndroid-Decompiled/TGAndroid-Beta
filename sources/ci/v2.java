package ci;

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
import org.telegram.ui.sn;
public final class v2 extends ChatActivityEnterView {
    public ValueAnimator f6073o5;
    public int p5;
    public int f6074q5;
    public int f6075r5;
    public final q4 f6076s5;

    public v2(q4 q4Var, Activity activity, q4 q4Var2, t2 t2Var) {
        super(activity, q4Var2, null, true, t2Var);
        this.f6076s5 = q4Var;
    }

    @Override
    public final void A0(int i10, int i11) {
        q4 q4Var = this.f6076s5;
        if (q4Var.f5768b2 != null) {
            this.f23987n3 = true;
            this.f6074q5 = this.E0.getMeasuredHeight();
            this.f6075r5 = this.E0.getScrollY();
            invalidate();
            q4Var.invalidate();
            this.p5 = q4Var.f5768b2.getBackgroundTop();
        }
    }

    @Override
    public final void J1(int i10, boolean z10) {
        super.J1(i10, z10);
        S1();
    }

    @Override
    public final void O1(boolean z10) {
        boolean z11;
        q4 q4Var = this.f6076s5;
        if (!q4Var.F1 && !q4Var.G1) {
            z11 = false;
        } else {
            z11 = true;
        }
        P1(z11, z10);
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
        q4 q4Var = this.f6076s5;
        if (q4Var.O1.f5693f) {
            long j10 = q4Var.L3;
            messageMinPrice = q4Var.getMessageMinPrice();
            long max = Math.max(j10, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
            int length = formatTextWithEntities.length();
            int[] iArr = MessagesController.getInstance(q4Var.C2).starsGroupcallMessageLimits;
            if (iArr != null && iArr.length > 2) {
                i10 = iArr[2];
            } else {
                i10 = 400;
            }
            if (length > i10) {
                NumberTextView numberTextView = this.f23912b0;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.f23912b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!q4Var.D0(true)) {
                if (formatTextWithEntities instanceof Spannable) {
                    Spannable spannable = (Spannable) formatTextWithEntities;
                    i11 = ((org.telegram.ui.Components.a6[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.a6.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
                } else {
                    i11 = 0;
                }
                int i12 = (int) max;
                if (i11 > u.b(q4Var.C2, i12, 2) || formatTextWithEntities.length() > u.b(q4Var.C2, i12, 1)) {
                    q4Var.O0();
                    return false;
                }
            }
            q4Var.L0.o(textWithEntities, max);
            this.E0.setText("");
            AndroidUtilities.hideKeyboard(this);
            q4Var.L3 = 0L;
            q4Var.r0(true);
            I(true);
            return true;
        }
        return super.Q0();
    }

    @Override
    public final boolean R0(int i10, boolean z10, int i11, boolean z11, long j10) {
        q4 q4Var = this.f6076s5;
        if (MessagesController.getInstance(q4Var.C2).isFrozen()) {
            org.telegram.ui.b.b(q4Var.C2);
            return false;
        }
        return super.R0(i10, z10, i11, z11, j10);
    }

    public final void S1() {
        throw new UnsupportedOperationException("Method not decompiled: ci.v2.S1():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f7;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = AndroidUtilities.rectTmp;
            float width = getWidth();
            q4 q4Var = this.f6076s5;
            if (q4Var.f5792i2 != null) {
                f7 = this.f24043y * 1.5f;
            } else {
                f7 = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f7, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = q4Var.f5792i2) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = q4Var.f5792i2;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        q4.h0(q4Var);
                    }
                    q4Var.f5792i2.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = q4Var.f5792i2) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = q4Var.f5792i2;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e1(float f7, float f10, float f11, boolean z10) {
        LinearLayout linearLayout = this.f6076s5.f5786g2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f11) * f7);
        }
        super.e1(f7, f10, f11, z10);
    }

    @Override
    public final void f0(Menu menu) {
        sn.n8(menu, null, false, !this.f6076s5.O1.f5693f, true, true);
    }

    @Override
    public final int getMessagesCount() {
        if (this.f6076s5.O1.f5693f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        q4 q4Var = this.f6076s5;
        if (q4Var.O1.f5693f) {
            messageMinPrice = q4Var.getMessageMinPrice();
            return Math.max(messageMinPrice, q4Var.L3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final boolean p1(Runnable runnable) {
        this.f6076s5.n0(runnable);
        return true;
    }

    @Override
    public final boolean r() {
        return this.f6076s5.D0(true);
    }

    @Override
    public final void v0() {
        S1();
    }
}
