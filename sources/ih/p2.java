package ih;

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
import org.telegram.ui.qn;
public final class p2 extends ChatActivityEnterView {
    public ValueAnimator f11939j5;
    public int f11940k5;
    public int f11941l5;
    public int f11942m5;
    public final i4 f11943n5;

    public p2(i4 i4Var, Activity activity, i4 i4Var2, n2 n2Var) {
        super(activity, i4Var2, null, true, n2Var);
        this.f11943n5 = i4Var;
    }

    @Override
    public final void B0(int i9, int i10) {
        i4 i4Var = this.f11943n5;
        if (i4Var.X1 != null) {
            this.f26129i3 = true;
            this.f11941l5 = this.A0.getMeasuredHeight();
            this.f11942m5 = this.A0.getScrollY();
            invalidate();
            i4Var.invalidate();
            this.f11940k5 = i4Var.X1.getBackgroundTop();
        }
    }

    @Override
    public final void L1(int i9, boolean z10) {
        super.L1(i9, z10);
        T1();
    }

    @Override
    public final void P1(boolean z10) {
        boolean z11;
        i4 i4Var = this.f11943n5;
        if (!i4Var.B1 && !i4Var.C1) {
            z11 = false;
        } else {
            z11 = true;
        }
        Q1(z11, z10);
    }

    @Override
    public final boolean S0() {
        long messageMinPrice;
        int i9;
        int i10;
        if (this.f26193v1.getAlpha() < 0.5f) {
            G0();
            return false;
        }
        i4 i4Var = this.f11943n5;
        if (i4Var.K1.f11470f) {
            long j10 = i4Var.H3;
            messageMinPrice = i4Var.getMessageMinPrice();
            long max = Math.max(j10, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
            int length = formatTextWithEntities.length();
            int[] iArr = MessagesController.getInstance(i4Var.f11609y2).starsGroupcallMessageLimits;
            if (iArr != null && iArr.length > 2) {
                i9 = iArr[2];
            } else {
                i9 = 400;
            }
            if (length > i9) {
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
            if (!i4Var.D0(true)) {
                if (formatTextWithEntities instanceof Spannable) {
                    Spannable spannable = (Spannable) formatTextWithEntities;
                    i10 = ((org.telegram.ui.Components.t5[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.t5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
                } else {
                    i10 = 0;
                }
                int i11 = (int) max;
                if (i10 > u.b(i4Var.f11609y2, i11, 2) || formatTextWithEntities.length() > u.b(i4Var.f11609y2, i11, 1)) {
                    i4Var.O0();
                    return false;
                }
            }
            i4Var.H0.o(textWithEntities, max);
            this.A0.setText("");
            AndroidUtilities.hideKeyboard(this);
            i4Var.H3 = 0L;
            i4Var.r0(true);
            J(true);
            return true;
        }
        return super.S0();
    }

    @Override
    public final boolean T0(int i9, boolean z10, int i10, boolean z11, long j10) {
        i4 i4Var = this.f11943n5;
        if (MessagesController.getInstance(i4Var.f11609y2).isFrozen()) {
            org.telegram.ui.b.b(i4Var.f11609y2);
            return false;
        }
        return super.T0(i9, z10, i10, z11, j10);
    }

    public final void T1() {
        throw new UnsupportedOperationException("Method not decompiled: ih.p2.T1():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f10;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = AndroidUtilities.rectTmp;
            float width = getWidth();
            i4 i4Var = this.f11943n5;
            if (i4Var.f11543e2 != null) {
                f10 = this.f26208y * 1.5f;
            } else {
                f10 = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f10, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = i4Var.f11543e2) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = i4Var.f11543e2;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        i4.h0(i4Var);
                    }
                    i4Var.f11543e2.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = i4Var.f11543e2) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = i4Var.f11543e2;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void g0(Menu menu) {
        qn.k8(menu, null, false, !this.f11943n5.K1.f11470f, true, true);
    }

    @Override
    public final int getMessagesCount() {
        if (this.f11943n5.K1.f11470f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        i4 i4Var = this.f11943n5;
        if (i4Var.K1.f11470f) {
            messageMinPrice = i4Var.getMessageMinPrice();
            return Math.max(messageMinPrice, i4Var.H3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final void h1(float f10, float f11, float f12, boolean z10) {
        LinearLayout linearLayout = this.f11943n5.f11537c2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.h1(f10, f11, f12, z10);
    }

    @Override
    public final boolean r1(Runnable runnable) {
        this.f11943n5.n0(runnable);
        return true;
    }

    @Override
    public final boolean t() {
        return this.f11943n5.D0(true);
    }

    @Override
    public final void w0() {
        T1();
    }
}
