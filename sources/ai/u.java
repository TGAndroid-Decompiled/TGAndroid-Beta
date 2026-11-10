package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.wq;
public final class u extends View {
    public final h5 f1646a;
    public final Drawable f1647b;
    public float f1648c;
    public boolean d;

    public u(q0 q0Var, Context context, int i7, TLRPC.Document document) {
        super(context);
        int i10;
        if (document != null) {
            this.f1646a = h5.l(q0Var.f1671a, 5, document);
            this.f1647b = null;
            return;
        }
        this.f1646a = null;
        if (i7 == 0) {
            i10 = 2131231064;
        } else {
            i10 = 2131232125;
        }
        Drawable mutate = context.getDrawable(i10).mutate();
        this.f1647b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h5 h5Var = this.f1646a;
        if (h5Var != null) {
            h5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h5 h5Var = this.f1646a;
        if (h5Var != null) {
            h5Var.n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.d) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float f11 = this.f1648c;
        if (f11 != f10) {
            if (Math.abs(f11 - f10) >= 0.02f) {
                float f12 = this.f1648c;
                f10 = com.google.android.recaptcha.internal.a.z(f10, f12, 0.35f, f12);
            }
            this.f1648c = f10;
            invalidate();
        }
        float interpolation = (1.0f - (wq.f40047g.getInterpolation(this.f1648c) * 0.15f)) * org.telegram.messenger.g0.L(26.0f);
        float f13 = interpolation / 2.0f;
        int width = (int) ((getWidth() / 2.0f) - f13);
        int height = (int) ((getHeight() / 2.0f) - f13);
        Drawable drawable = this.f1646a;
        if (drawable == null) {
            drawable = this.f1647b;
        }
        if (drawable != null) {
            drawable.setBounds(width, height, (int) (width + interpolation), (int) (height + interpolation));
            x.b(canvas, drawable);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d = true;
            invalidate();
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.d = false;
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
