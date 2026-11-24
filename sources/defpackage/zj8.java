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
public final class zj8 extends FrameLayout {
    public vd0 a;
    public final gb2 b;
    public Drawable c;
    public final Drawable d;
    public final k27 e;
    public final PrivacyControlActivity f;

    public zj8(PrivacyControlActivity privacyControlActivity, Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        this.f = privacyControlActivity;
        setWillNotDraw(false);
        setClipToPadding(false);
        this.d = bkb.W0(context, 2131231233, bkb.a7);
        setPadding(0, gl.L(11.0f), 0, gl.L(11.0f));
        i = ((d) privacyControlActivity).currentAccount;
        na7 q1 = na7.q1(i);
        i2 = ((d) privacyControlActivity).currentAccount;
        TLRPC.User V1 = q1.V1(Long.valueOf(y6c.h(i2).e()));
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = k96.M0(2131746641, null);
        tL_message.date = ((int) (System.currentTimeMillis() / 1000)) - 3540;
        tL_message.dialog_id = 1L;
        tL_message.flags = 261;
        tL_message.from_id = new TLRPC.TL_peerUser();
        tL_message.id = 1;
        TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
        tL_message.fwd_from = tL_messageFwdHeader;
        tL_messageFwdHeader.from_name = qu2.m(0, V1.first_name, V1.last_name);
        tL_message.media = new TLRPC.TL_messageMediaEmpty();
        tL_message.out = false;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_message.peer_id = tL_peerUser;
        i3 = ((d) privacyControlActivity).currentAccount;
        tL_peerUser.user_id = y6c.h(i3).e();
        i4 = ((d) privacyControlActivity).currentAccount;
        k27 k27Var = new k27(i4, tL_message, true, false);
        this.e = k27Var;
        k27Var.T = 1L;
        k27Var.S1 = false;
        i5 = ((d) privacyControlActivity).currentAccount;
        gb2 gb2Var = new gb2(context, i5);
        this.b = gb2Var;
        gb2Var.setDelegate(new o5f((byte) 23));
        gb2Var.f6 = false;
        gb2Var.setFullyDraw(true);
        gb2Var.z3(k27Var, null, false, false, false, false);
        addView(gb2Var, nme.o(-1, -2));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f.O0();
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
        this.f.O0();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.O0();
        vd0 vd0Var = this.a;
        if (vd0Var != null) {
            vd0Var.dispose();
            this.a = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable s0 = bkb.s0();
        if (s0 != null && this.c != s0) {
            vd0 vd0Var = this.a;
            if (vd0Var != null) {
                vd0Var.dispose();
                this.a = null;
            }
            this.c = s0;
        }
        Drawable drawable = this.c;
        if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof ye7)) {
            if (drawable instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f = 2.0f / gl.p;
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
            if (drawable2 instanceof wd0) {
                this.a = ((wd0) drawable2).b(canvas, this);
            } else {
                drawable2.draw(canvas);
            }
        }
        if ((getParent() instanceof o39) && ((o39) getParent()).c1()) {
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
