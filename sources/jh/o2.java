package jh;

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
import org.telegram.ui.Components.wd;
import org.telegram.ui.rn;

public final class o2 extends ChatActivityEnterView {

    public ValueAnimator f13738j5;

    public int f13739k5;

    public int f13740l5;

    public int f13741m5;

    public final e4 f13742n5;

    public o2(e4 e4Var, Activity activity, e4 e4Var2, m2 m2Var) {
        super(activity, e4Var2, null, true, m2Var);
        this.f13742n5 = e4Var;
    }

    @Override
    public final void C0(int i10, int i11) {
        e4 e4Var = this.f13742n5;
        if (e4Var.X1 != null) {
            this.f26125i3 = true;
            this.f13740l5 = this.A0.getMeasuredHeight();
            this.f13741m5 = this.A0.getScrollY();
            invalidate();
            e4Var.invalidate();
            this.f13739k5 = e4Var.X1.getBackgroundTop();
        }
    }

    @Override
    public final void K1(int i10, boolean z10) {
        super.K1(i10, z10);
        S1();
    }

    @Override
    public final void O1(boolean z10) {
        e4 e4Var = this.f13742n5;
        P1(e4Var.B1 || e4Var.C1, z10);
    }

    @Override
    public final boolean S0() {
        int length;
        if (this.f26189v1.getAlpha() < 0.5f) {
            H0();
            return false;
        }
        e4 e4Var = this.f13742n5;
        if (!e4Var.K1.f13145f) {
            return super.S0();
        }
        long jMax = Math.max(e4Var.H3, e4Var.getMessageMinPrice());
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence textWithEntities2 = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        int length2 = textWithEntities2.length();
        int[] iArr = MessagesController.getInstance(e4Var.f13296y2).starsGroupcallMessageLimits;
        if (length2 > ((iArr == null || iArr.length <= 2) ? 400 : iArr[2])) {
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
        if (!e4Var.D0(true)) {
            if (textWithEntities2 instanceof Spannable) {
                Spannable spannable = (Spannable) textWithEntities2;
                length = ((org.telegram.ui.Components.t5[]) spannable.getSpans(0, textWithEntities2.length(), org.telegram.ui.Components.t5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, textWithEntities2.length(), Emoji.EmojiSpan.class)).length;
            } else {
                length = 0;
            }
            int i10 = (int) jMax;
            if (length > s.b(e4Var.f13296y2, i10, 2) || textWithEntities2.length() > s.b(e4Var.f13296y2, i10, 1)) {
                e4Var.O0();
                return false;
            }
        }
        e4Var.H0.o(textWithEntities, jMax);
        this.A0.setText("");
        AndroidUtilities.hideKeyboard(this);
        e4Var.H3 = 0L;
        e4Var.r0(true);
        K(true);
        return true;
    }

    public final void S1() {
        boolean z10;
        wd wdVar;
        e4 e4Var = this.f13742n5;
        boolean z11 = e4Var.C2;
        if (e4Var.X1.w0()) {
            z10 = true;
        } else {
            o2 o2Var = e4Var.X1;
            if ((o2Var.f26106f2 || o2Var.f26136k4 <= 0.0f) && ((wdVar = this.f26073a1) == null || wdVar.getVisibility() != 0)) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        e4Var.C2 = z10;
        if (z11 != z10) {
            if (e4Var.G1) {
                i9 i9Var = ((z8) e4Var.M1).d;
                i9Var.E0 = z10;
                i9Var.P();
            }
            invalidate();
            e4Var.Y0.invalidate();
        }
    }

    @Override
    public final boolean T0(int i10, boolean z10, int i11, boolean z11, long j10) {
        e4 e4Var = this.f13742n5;
        if (!MessagesController.getInstance(e4Var.f13296y2).isFrozen()) {
            return super.T0(i10, z10, i11, z11, j10);
        }
        org.telegram.ui.b.b(e4Var.f13296y2);
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        TextView textView;
        TextView textView2;
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        float width = getWidth();
        e4 e4Var = this.f13742n5;
        rectF.set(0.0f, 0.0f, width + (e4Var.f13230e2 != null ? this.f26204y * 1.5f : 0.0f), getHeight());
        boolean zContains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (zContains && (textView2 = e4Var.f13230e2) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = e4Var.f13230e2;
            if (textView3 != null) {
                if (zContains && textView3.isPressed()) {
                    e4.h0(e4Var);
                }
                e4Var.f13230e2.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = e4Var.f13230e2) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = e4Var.f13230e2;
        return textView4 != null && textView4.isPressed();
    }

    @Override
    public final void g1(float f10, float f11, float f12, boolean z10) {
        LinearLayout linearLayout = this.f13742n5.f13224c2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.g1(f10, f11, f12, z10);
    }

    @Override
    public final int getMessagesCount() {
        if (this.f13742n5.K1.f13145f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        e4 e4Var = this.f13742n5;
        return e4Var.K1.f13145f ? Math.max(e4Var.getMessageMinPrice(), e4Var.H3) : super.getStarsPrice();
    }

    @Override
    public final void h0(Menu menu) {
        rn.k8(menu, null, false, !this.f13742n5.K1.f13145f, true, true);
    }

    @Override
    public final boolean q1(Runnable runnable) {
        this.f13742n5.n0(runnable);
        return true;
    }

    @Override
    public final boolean u() {
        return this.f13742n5.D0(true);
    }

    @Override
    public final void x0() {
        S1();
    }
}
