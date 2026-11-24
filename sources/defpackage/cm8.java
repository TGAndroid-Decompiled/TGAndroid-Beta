package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PrivacyControlActivity;
public final class cm8 extends FrameLayout {
    public ve0 a;
    public final rc2 b;
    public Drawable c;
    public final Drawable d;
    public final k47 e;
    public final PrivacyControlActivity f;

    public cm8(PrivacyControlActivity privacyControlActivity, Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        this.f = privacyControlActivity;
        setWillNotDraw(false);
        setClipToPadding(false);
        this.d = cmb.W0(context, 2131231234, cmb.a7);
        setPadding(0, gm.L(11.0f), 0, gm.L(11.0f));
        i = ((d) privacyControlActivity).currentAccount;
        oc7 r1 = oc7.r1(i);
        i2 = ((d) privacyControlActivity).currentAccount;
        TLRPC.User W1 = r1.W1(Long.valueOf(z8c.h(i2).e()));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = jb6.M0(2131746567, null);
        tL_message.date = ((int) (System.currentTimeMillis() / 1000)) - 3540;
        tL_message.dialog_id = 1L;
        tL_message.flags = 261;
        tL_message.from_id = new TLRPC.TL_peerUser();
        tL_message.id = 1;
        TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
        tL_message.fwd_from = tL_messageFwdHeader;
        tL_messageFwdHeader.from_name = bw2.m(0, W1.first_name, W1.last_name);
        tL_message.media = new TLRPC.TL_messageMediaEmpty();
        tL_message.out = false;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        i3 = ((d) privacyControlActivity).currentAccount;
        tL_peerUser.user_id = z8c.h(i3).e();
        i4 = ((d) privacyControlActivity).currentAccount;
        k47 k47Var = new k47(i4, tL_message, true, false);
        this.e = k47Var;
        k47Var.T = 1L;
        k47Var.S1 = false;
        i5 = ((d) privacyControlActivity).currentAccount;
        rc2 rc2Var = new rc2(context, i5);
        this.b = rc2Var;
        rc2Var.setDelegate(new q7f((byte) 23));
        rc2Var.f6 = false;
        rc2Var.setFullyDraw(true);
        rc2Var.z3(k47Var, null, false, false, false, false);
        addView(rc2Var, qoe.o(-1, -2));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f.P0();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.b.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.P0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.P0();
        ve0 ve0Var = this.a;
        if (ve0Var != null) {
            ve0Var.dispose();
            this.a = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable s0 = cmb.s0();
        if (s0 != null && this.c != s0) {
            ve0 ve0Var = this.a;
            if (ve0Var != null) {
                ve0Var.dispose();
                this.a = null;
            }
            this.c = s0;
        }
        Drawable drawable = this.c;
        if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof ah7)) {
            if (drawable instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f = 2.0f / gm.p;
                    canvas.scale(f, f);
                    this.c.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.c.getIntrinsicWidth(), measuredHeight / this.c.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.c.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(this.c.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i = (measuredHeight - ceil2) / 2;
                    canvas.save();
                    canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                    this.c.setBounds(measuredWidth, i, ceil + measuredWidth, ceil2 + i);
                }
                this.c.draw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
        } else {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Drawable drawable2 = this.c;
            if (drawable2 instanceof we0) {
                this.a = ((we0) drawable2).b(canvas, this);
            } else {
                drawable2.draw(canvas);
            }
        }
        if ((getParent() instanceof r59) && ((r59) getParent()).c1()) {
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable3 = this.d;
        drawable3.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable3.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void dispatchSetPressed(boolean z) {
    }
}
