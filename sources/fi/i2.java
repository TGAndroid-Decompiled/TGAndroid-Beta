package fi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.bn;
public final class i2 extends ChatActivityEnterView {
    public ValueAnimator f12085o7;
    public int f12086p7;
    public int f12087q7;
    public int f12088r7;
    public final z3 f12089s7;

    public i2(z3 z3Var, Activity activity, z3 z3Var2, g2 g2Var) {
        super(activity, z3Var2, null, true, g2Var);
        this.f12089s7 = z3Var;
    }

    @Override
    public final void F1(float f10, float f11, float f12, boolean z10) {
        LinearLayout linearLayout = this.f12089s7.Q1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.F1(f10, f11, f12, z10);
    }

    public final void F2() {
        throw new UnsupportedOperationException("Method not decompiled: fi.i2.F2():void");
    }

    @Override
    public final boolean R1(Runnable runnable) {
        this.f12089s7.l0(runnable);
        return true;
    }

    @Override
    public final void S0() {
        F2();
    }

    @Override
    public final void Z0(int i7, int i10) {
        z3 z3Var = this.f12089s7;
        if (z3Var.L1 != null) {
            this.f32553b4 = true;
            this.f12087q7 = this.F0.getMeasuredHeight();
            this.f12088r7 = this.F0.getScrollY();
            invalidate();
            z3Var.invalidate();
            this.f12086p7 = z3Var.L1.getBackgroundTop();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f10;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = org.telegram.messenger.g0.P;
            float width = getWidth();
            z3 z3Var = this.f12089s7;
            if (z3Var.S1 != null) {
                f10 = this.E * 1.5f;
            } else {
                f10 = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f10, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = z3Var.S1) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = z3Var.S1;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        z3.f0(z3Var);
                    }
                    z3Var.S1.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = z3Var.S1) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = z3Var.S1;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        if (this.f12089s7.f12893y1.f12724f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        z3 z3Var = this.f12089s7;
        if (z3Var.f12893y1.f12724f) {
            messageMinPrice = z3Var.getMessageMinPrice();
            return Math.max(messageMinPrice, z3Var.f12883v3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final void o2(int i7, boolean z10) {
        super.o2(i7, z10);
        F2();
    }

    @Override
    public final boolean r1() {
        long messageMinPrice;
        int i7;
        int i10;
        if (this.f32651o2.getAlpha() < 0.5f) {
            e1();
            return false;
        }
        z3 z3Var = this.f12089s7;
        if (z3Var.f12893y1.f12724f) {
            long j3 = z3Var.f12883v3;
            messageMinPrice = z3Var.getMessageMinPrice();
            long max = Math.max(j3, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence j02 = fj.j0(textWithEntities, false, false, new TextPaint());
            int length = j02.length();
            int[] iArr = mp.u1(z3Var.f12847m2).f25601a7;
            if (iArr != null && iArr.length > 2) {
                i7 = iArr[2];
            } else {
                i7 = 400;
            }
            if (length > i7) {
                NumberTextView numberTextView = this.f32558c0;
                if (numberTextView != null) {
                    org.telegram.messenger.g0.E3(3.5f, numberTextView, null);
                    try {
                        this.f32558c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!z3Var.B0(true)) {
                if (j02 instanceof Spannable) {
                    Spannable spannable = (Spannable) j02;
                    i10 = ((org.telegram.ui.Components.x5[]) spannable.getSpans(0, j02.length(), org.telegram.ui.Components.x5.class)).length + ((org.telegram.messenger.g6[]) spannable.getSpans(0, j02.length(), org.telegram.messenger.g6.class)).length;
                } else {
                    i10 = 0;
                }
                int i11 = (int) max;
                if (i10 > t.b(z3Var.f12847m2, i11, 2) || j02.length() > t.b(z3Var.f12847m2, i11, 1)) {
                    z3Var.M0();
                    return false;
                }
            }
            z3Var.f12880v0.o(textWithEntities, max);
            this.F0.setText("");
            org.telegram.messenger.g0.v1(this);
            z3Var.f12883v3 = 0L;
            z3Var.p0(true);
            P(true);
            return true;
        }
        return super.r1();
    }

    @Override
    public final boolean s1(boolean z10, int i7, int i10, long j3, boolean z11) {
        z3 z3Var = this.f12089s7;
        if (mp.u1(z3Var.f12847m2).A2()) {
            org.telegram.ui.b.b(z3Var.f12847m2);
            return false;
        }
        return super.s1(z10, i7, i10, j3, z11);
    }

    @Override
    public final void t2(boolean z10) {
        boolean z11;
        z3 z3Var = this.f12089s7;
        if (!z3Var.f12857p1 && !z3Var.f12861q1) {
            z11 = false;
        } else {
            z11 = true;
        }
        u2(z11, z10);
    }

    @Override
    public final boolean x() {
        return this.f12089s7.B0(true);
    }

    @Override
    public final void y0(Menu menu) {
        bn.C8(menu, null, false, !this.f12089s7.f12893y1.f12724f, true, true);
    }
}
