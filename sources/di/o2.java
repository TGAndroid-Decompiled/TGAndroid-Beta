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
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.cn;
public final class o2 extends ChatActivityEnterView {
    public ValueAnimator f9430t5;
    public int f9431u5;
    public int f9432v5;
    public int f9433w5;
    public final j4 f9434x5;

    public o2(j4 j4Var, Activity activity, j4 j4Var2, m2 m2Var) {
        super(activity, j4Var2, null, true, m2Var);
        this.f9434x5 = j4Var;
    }

    @Override
    public final void C0(int i7, int i10) {
        j4 j4Var = this.f9434x5;
        if (j4Var.K1 != null) {
            this.f31111n3 = true;
            this.f9432v5 = this.E0.getMeasuredHeight();
            this.f9433w5 = this.E0.getScrollY();
            invalidate();
            j4Var.invalidate();
            this.f9431u5 = j4Var.K1.getBackgroundTop();
        }
    }

    @Override
    public final void N1(int i7, boolean z9) {
        super.N1(i7, z9);
        V1();
    }

    @Override
    public final void R1(boolean z9) {
        boolean z10;
        j4 j4Var = this.f9434x5;
        if (!j4Var.f9214o1 && !j4Var.f9218p1) {
            z10 = false;
        } else {
            z10 = true;
        }
        S1(z10, z9);
    }

    @Override
    public final boolean S0() {
        long messageMinPrice;
        int i7;
        int i10;
        if (this.A1.getAlpha() < 0.5f) {
            H0();
            return false;
        }
        j4 j4Var = this.f9434x5;
        if (j4Var.f9250x1.f9073f) {
            long j3 = j4Var.f9240u3;
            messageMinPrice = j4Var.getMessageMinPrice();
            long max = Math.max(j3, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence j02 = ij.j0(textWithEntities, false, false, new TextPaint());
            int length = j02.length();
            int[] iArr = qp.s1(j4Var.f9205l2).X6;
            if (iArr != null && iArr.length > 2) {
                i7 = iArr[2];
            } else {
                i7 = 400;
            }
            if (length > i7) {
                NumberTextView numberTextView = this.f31037b0;
                if (numberTextView != null) {
                    org.telegram.messenger.g0.G3(3.5f, numberTextView, null);
                    try {
                        this.f31037b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!j4Var.B0(true)) {
                if (j02 instanceof Spannable) {
                    Spannable spannable = (Spannable) j02;
                    i10 = ((org.telegram.ui.Components.q5[]) spannable.getSpans(0, j02.length(), org.telegram.ui.Components.q5.class)).length + ((org.telegram.messenger.f6[]) spannable.getSpans(0, j02.length(), org.telegram.messenger.f6.class)).length;
                } else {
                    i10 = 0;
                }
                int i11 = (int) max;
                if (i10 > t.b(j4Var.f9205l2, i11, 2) || j02.length() > t.b(j4Var.f9205l2, i11, 1)) {
                    j4Var.M0();
                    return false;
                }
            }
            j4Var.f9237u0.o(textWithEntities, max);
            this.E0.setText("");
            org.telegram.messenger.g0.v1(this);
            j4Var.f9240u3 = 0L;
            j4Var.p0(true);
            E(true);
            return true;
        }
        return super.S0();
    }

    @Override
    public final boolean T0(boolean z9, int i7, int i10, long j3, boolean z10) {
        j4 j4Var = this.f9434x5;
        if (qp.s1(j4Var.f9205l2).v2()) {
            org.telegram.ui.b.b(j4Var.f9205l2);
            return false;
        }
        return super.T0(z9, i7, i10, j3, z10);
    }

    public final void V1() {
        throw new UnsupportedOperationException("Method not decompiled: di.o2.V1():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f10;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = org.telegram.messenger.g0.P;
            float width = getWidth();
            j4 j4Var = this.f9434x5;
            if (j4Var.R1 != null) {
                f10 = this.D * 1.5f;
            } else {
                f10 = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f10, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = j4Var.R1) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = j4Var.R1;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        j4.f0(j4Var);
                    }
                    j4Var.R1.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = j4Var.R1) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = j4Var.R1;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e0(Menu menu) {
        cn.B8(menu, null, false, !this.f9434x5.f9250x1.f9073f, true, true);
    }

    @Override
    public final int getMessagesCount() {
        if (this.f9434x5.f9250x1.f9073f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        j4 j4Var = this.f9434x5;
        if (j4Var.f9250x1.f9073f) {
            messageMinPrice = j4Var.getMessageMinPrice();
            return Math.max(messageMinPrice, j4Var.f9240u3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final void h1(float f10, float f11, float f12, boolean z9) {
        LinearLayout linearLayout = this.f9434x5.P1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.h1(f10, f11, f12, z9);
    }

    @Override
    public final boolean q() {
        return this.f9434x5.B0(true);
    }

    @Override
    public final boolean r1(Runnable runnable) {
        this.f9434x5.l0(runnable);
        return true;
    }

    @Override
    public final void w0() {
        V1();
    }
}
