package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.xq;
public final class p extends View {
    public final g5 f3817a;
    public final Drawable f3818b;
    public float f3819c;
    public boolean d;

    public p(h0 h0Var, Context context, int i3, TLRPC.Document document) {
        super(context);
        int i10;
        if (document != null) {
            this.f3817a = g5.l(h0Var.f3838a, 5, document);
            this.f3818b = null;
            return;
        }
        this.f3817a = null;
        if (i3 == 0) {
            i10 = 2131231064;
        } else {
            i10 = 2131232125;
        }
        Drawable mutate = context.getDrawable(i10).mutate();
        this.f3818b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g5 g5Var = this.f3817a;
        if (g5Var != null) {
            g5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g5 g5Var = this.f3817a;
        if (g5Var != null) {
            g5Var.n(this);
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
        float f11 = this.f3819c;
        if (f11 != f10) {
            if (Math.abs(f11 - f10) >= 0.02f) {
                float f12 = this.f3819c;
                f10 = com.google.android.recaptcha.internal.a.y(f10, f12, 0.35f, f12);
            }
            this.f3819c = f10;
            invalidate();
        }
        float interpolation = (1.0f - (xq.f40453g.getInterpolation(this.f3819c) * 0.15f)) * org.telegram.messenger.g0.L(26.0f);
        float f13 = interpolation / 2.0f;
        int width = (int) ((getWidth() / 2.0f) - f13);
        int height = (int) ((getHeight() / 2.0f) - f13);
        Drawable drawable = this.f3817a;
        if (drawable == null) {
            drawable = this.f3818b;
        }
        if (drawable != null) {
            drawable.setBounds(width, height, (int) (width + interpolation), (int) (height + interpolation));
            s.b(canvas, drawable);
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
