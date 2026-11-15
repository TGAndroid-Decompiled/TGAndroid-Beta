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
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.an;
public final class k2 extends ChatActivityEnterView {
    public ValueAnimator O6;
    public int P6;
    public int Q6;
    public int R6;
    public final b4 S6;

    public k2(b4 b4Var, Activity activity, b4 b4Var2, i2 i2Var) {
        super(activity, b4Var2, null, true, i2Var);
        this.S6 = b4Var;
    }

    @Override
    public final boolean J1(Runnable runnable) {
        this.S6.l0(runnable);
        return true;
    }

    @Override
    public final void K0() {
        v2();
    }

    @Override
    public final void R0(int i7, int i10) {
        b4 b4Var = this.S6;
        if (b4Var.L1 != null) {
            this.V3 = true;
            this.Q6 = this.F0.getMeasuredHeight();
            this.R6 = this.F0.getScrollY();
            invalidate();
            b4Var.invalidate();
            this.P6 = b4Var.L1.getBackgroundTop();
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
            b4 b4Var = this.S6;
            if (b4Var.S1 != null) {
                f10 = this.E * 1.5f;
            } else {
                f10 = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f10, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = b4Var.S1) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = b4Var.S1;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        b4.f0(b4Var);
                    }
                    b4Var.S1.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = b4Var.S1) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = b4Var.S1;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f2(int i7, boolean z10) {
        super.f2(i7, z10);
        v2();
    }

    @Override
    public final int getMessagesCount() {
        if (this.S6.f11543y1.f12583f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        b4 b4Var = this.S6;
        if (b4Var.f11543y1.f12583f) {
            messageMinPrice = b4Var.getMessageMinPrice();
            return Math.max(messageMinPrice, b4Var.f11533v3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final boolean j1() {
        long messageMinPrice;
        int i7;
        int i10;
        if (this.f32215i2.getAlpha() < 0.5f) {
            W0();
            return false;
        }
        b4 b4Var = this.S6;
        if (b4Var.f11543y1.f12583f) {
            long j3 = b4Var.f11533v3;
            messageMinPrice = b4Var.getMessageMinPrice();
            long max = Math.max(j3, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence j02 = gj.j0(textWithEntities, false, false, new TextPaint());
            int length = j02.length();
            int[] iArr = np.s1(b4Var.f11497m2).Y6;
            if (iArr != null && iArr.length > 2) {
                i7 = iArr[2];
            } else {
                i7 = 400;
            }
            if (length > i7) {
                NumberTextView numberTextView = this.f32170c0;
                if (numberTextView != null) {
                    org.telegram.messenger.g0.F3(3.5f, numberTextView, null);
                    try {
                        this.f32170c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!b4Var.B0(true)) {
                if (j02 instanceof Spannable) {
                    Spannable spannable = (Spannable) j02;
                    i10 = ((org.telegram.ui.Components.p5[]) spannable.getSpans(0, j02.length(), org.telegram.ui.Components.p5.class)).length + ((org.telegram.messenger.g6[]) spannable.getSpans(0, j02.length(), org.telegram.messenger.g6.class)).length;
                } else {
                    i10 = 0;
                }
                int i11 = (int) max;
                if (i10 > t.b(b4Var.f11497m2, i11, 2) || j02.length() > t.b(b4Var.f11497m2, i11, 1)) {
                    b4Var.M0();
                    return false;
                }
            }
            b4Var.f11530v0.o(textWithEntities, max);
            this.F0.setText("");
            org.telegram.messenger.g0.v1(this);
            b4Var.f11533v3 = 0L;
            b4Var.p0(true);
            N(true);
            return true;
        }
        return super.j1();
    }

    @Override
    public final void j2(boolean z10) {
        boolean z11;
        b4 b4Var = this.S6;
        if (!b4Var.f11507p1 && !b4Var.f11511q1) {
            z11 = false;
        } else {
            z11 = true;
        }
        k2(z11, z10);
    }

    @Override
    public final boolean k1(boolean z10, int i7, int i10, long j3, boolean z11) {
        b4 b4Var = this.S6;
        if (np.s1(b4Var.f11497m2).v2()) {
            org.telegram.ui.b.b(b4Var.f11497m2);
            return false;
        }
        return super.k1(z10, i7, i10, j3, z11);
    }

    @Override
    public final void q0(Menu menu) {
        an.C8(menu, null, false, !this.S6.f11543y1.f12583f, true, true);
    }

    @Override
    public final boolean v() {
        return this.S6.B0(true);
    }

    public final void v2() {
        throw new UnsupportedOperationException("Method not decompiled: fi.k2.v2():void");
    }

    @Override
    public final void x1(float f10, float f11, float f12, boolean z10) {
        LinearLayout linearLayout = this.S6.Q1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.x1(f10, f11, f12, z10);
    }
}
