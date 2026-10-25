package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.t5;
public final class v extends View {
    public final t5 f1948a;
    public final Drawable f1949b;
    public float f1950c;
    public boolean d;

    public v(x0 x0Var, Context context, int i10, TLRPC.Document document) {
        super(context);
        int i11;
        if (document != null) {
            this.f1948a = t5.m(x0Var.f1970a, 5, document);
            this.f1949b = null;
            return;
        }
        this.f1948a = null;
        if (i10 == 0) {
            i11 = R.drawable.emoji_tabs_faves;
        } else {
            i11 = R.drawable.msg_emoji_recent;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        this.f1949b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t5 t5Var = this.f1948a;
        if (t5Var != null) {
            t5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t5 t5Var = this.f1948a;
        if (t5Var != null) {
            t5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        if (this.d) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float f10 = this.f1950c;
        if (f10 != f7) {
            if (Math.abs(f10 - f7) >= 0.02f) {
                float f11 = this.f1950c;
                f7 = c3.h0.z(f7, f11, 0.35f, f11);
            }
            this.f1950c = f7;
            invalidate();
        }
        float interpolation = (1.0f - (ds.f27585g.getInterpolation(this.f1950c) * 0.15f)) * AndroidUtilities.dp(26.0f);
        float f12 = interpolation / 2.0f;
        int width = (int) ((getWidth() / 2.0f) - f12);
        int height = (int) ((getHeight() / 2.0f) - f12);
        Drawable drawable = this.f1948a;
        if (drawable == null) {
            drawable = this.f1949b;
        }
        if (drawable != null) {
            drawable.setBounds(width, height, (int) (width + interpolation), (int) (height + interpolation));
            y.b(canvas, drawable);
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
