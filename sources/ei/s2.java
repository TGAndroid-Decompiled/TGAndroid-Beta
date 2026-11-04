package ei;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.wm;
public final class s2 extends ChatActivityEnterView {
    public ValueAnimator f10984u5;
    public int f10985v5;
    public int f10986w5;
    public int f10987x5;
    public final j4 f10988y5;

    public s2(j4 j4Var, Activity activity, j4 j4Var2, q2 q2Var) {
        super(activity, j4Var2, null, true, q2Var);
        this.f10988y5 = j4Var;
    }

    @Override
    public final void B0(int i3, int i10) {
        j4 j4Var = this.f10988y5;
        if (j4Var.L1 != null) {
            this.f31170o3 = true;
            this.f10986w5 = this.F0.getMeasuredHeight();
            this.f10987x5 = this.F0.getScrollY();
            invalidate();
            j4Var.invalidate();
            this.f10985v5 = j4Var.L1.getBackgroundTop();
        }
    }

    @Override
    public final void M1(int i3, boolean z10) {
        super.M1(i3, z10);
        U1();
    }

    @Override
    public final void Q1(boolean z10) {
        boolean z11;
        j4 j4Var = this.f10988y5;
        if (!j4Var.f10491p1 && !j4Var.f10495q1) {
            z11 = false;
        } else {
            z11 = true;
        }
        R1(z11, z10);
    }

    @Override
    public final boolean R0() {
        long messageMinPrice;
        int i3;
        int i10;
        if (this.B1.getAlpha() < 0.5f) {
            G0();
            return false;
        }
        j4 j4Var = this.f10988y5;
        if (j4Var.f10527y1.f10362f) {
            long j10 = j4Var.f10517v3;
            messageMinPrice = j4Var.getMessageMinPrice();
            long max = Math.max(j10, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence j02 = zi.j0(textWithEntities, false, false, new TextPaint());
            int length = j02.length();
            int[] iArr = hp.s1(j4Var.f10480m2).X6;
            if (iArr != null && iArr.length > 2) {
                i3 = iArr[2];
            } else {
                i3 = 400;
            }
            if (length > i3) {
                NumberTextView numberTextView = this.f31098c0;
                if (numberTextView != null) {
                    org.telegram.messenger.g0.G3(3.5f, numberTextView, null);
                    try {
                        this.f31098c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!j4Var.B0(true)) {
                if (j02 instanceof Spannable) {
                    Spannable spannable = (Spannable) j02;
                    i10 = ((org.telegram.ui.Components.p5[]) spannable.getSpans(0, j02.length(), org.telegram.ui.Components.p5.class)).length + ((org.telegram.messenger.f6[]) spannable.getSpans(0, j02.length(), org.telegram.messenger.f6.class)).length;
                } else {
                    i10 = 0;
                }
                int i11 = (int) max;
                if (i10 > u.b(j4Var.f10480m2, i11, 2) || j02.length() > u.b(j4Var.f10480m2, i11, 1)) {
                    j4Var.M0();
                    return false;
                }
            }
            j4Var.f10514v0.o(textWithEntities, max);
            this.F0.setText("");
            org.telegram.messenger.g0.v1(this);
            j4Var.f10517v3 = 0L;
            j4Var.p0(true);
            E(true);
            return true;
        }
        return super.R0();
    }

    @Override
    public final boolean S0(boolean z10, int i3, int i10, long j10, boolean z11) {
        j4 j4Var = this.f10988y5;
        if (hp.s1(j4Var.f10480m2).v2()) {
            org.telegram.ui.b.b(j4Var.f10480m2);
            return false;
        }
        return super.S0(z10, i3, i10, j10, z11);
    }

    public final void U1() {
        throw new UnsupportedOperationException("Method not decompiled: ei.s2.U1():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f10;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = org.telegram.messenger.g0.P;
            float width = getWidth();
            j4 j4Var = this.f10988y5;
            if (j4Var.S1 != null) {
                f10 = this.E * 1.5f;
            } else {
                f10 = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f10, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = j4Var.S1) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = j4Var.S1;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        j4.f0(j4Var);
                    }
                    j4Var.S1.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = j4Var.S1) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = j4Var.S1;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e0(Menu menu) {
        wm.A8(menu, null, false, !this.f10988y5.f10527y1.f10362f, true, true);
    }

    @Override
    public final void g1(float f10, float f11, float f12, boolean z10) {
        LinearLayout linearLayout = this.f10988y5.Q1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.g1(f10, f11, f12, z10);
    }

    @Override
    public final int getMessagesCount() {
        if (this.f10988y5.f10527y1.f10362f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        j4 j4Var = this.f10988y5;
        if (j4Var.f10527y1.f10362f) {
            messageMinPrice = j4Var.getMessageMinPrice();
            return Math.max(messageMinPrice, j4Var.f10517v3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final boolean q() {
        return this.f10988y5.B0(true);
    }

    @Override
    public final boolean q1(Runnable runnable) {
        this.f10988y5.l0(runnable);
        return true;
    }

    @Override
    public final void v0() {
        U1();
    }
}
