package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.vision.e2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.o5;
public final class p extends View {
    public final o5 f5742a;
    public final Drawable f5743b;
    public float f5744c;
    public boolean d;

    public p(h0 h0Var, Context context, int i7, TLRPC.Document document) {
        super(context);
        int i10;
        if (document != null) {
            this.f5742a = o5.l(h0Var.f5760a, 5, document);
            this.f5743b = null;
            return;
        }
        this.f5742a = null;
        if (i7 == 0) {
            i10 = 2131231064;
        } else {
            i10 = 2131232127;
        }
        Drawable mutate = context.getDrawable(i10).mutate();
        this.f5743b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o5 o5Var = this.f5742a;
        if (o5Var != null) {
            o5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o5 o5Var = this.f5742a;
        if (o5Var != null) {
            o5Var.n(this);
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
        float f11 = this.f5744c;
        if (f11 != f10) {
            if (Math.abs(f11 - f10) >= 0.02f) {
                float f12 = this.f5744c;
                f10 = e2.z(f10, f12, 0.35f, f12);
            }
            this.f5744c = f10;
            invalidate();
        }
        float interpolation = (1.0f - (lr.f37209g.getInterpolation(this.f5744c) * 0.15f)) * org.telegram.messenger.g0.L(26.0f);
        float f13 = interpolation / 2.0f;
        int width = (int) ((getWidth() / 2.0f) - f13);
        int height = (int) ((getHeight() / 2.0f) - f13);
        Drawable drawable = this.f5742a;
        if (drawable == null) {
            drawable = this.f5743b;
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
