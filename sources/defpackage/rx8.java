package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class rx8 extends View {
    public final vm a;
    public final Drawable b;
    public float c;
    public boolean d;

    public rx8(gy8 gy8Var, Context context, int i, TLRPC.Document document) {
        super(context);
        int i2;
        if (document != null) {
            this.a = vm.l(gy8Var.a, 5, document);
            this.b = null;
            return;
        }
        this.a = null;
        if (i == 0) {
            i2 = 2131231067;
        } else {
            i2 = 2131232131;
        }
        Drawable mutate = context.getDrawable(i2).mutate();
        this.b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vm vmVar = this.a;
        if (vmVar != null) {
            vmVar.b(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vm vmVar = this.a;
        if (vmVar != null) {
            vmVar.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        if (this.d) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        float f2 = this.c;
        if (f2 != f) {
            if (Math.abs(f2 - f) >= 0.02f) {
                float f3 = this.c;
                f = td4.A(f, f3, 0.35f, f3);
            }
            this.c = f;
            invalidate();
        }
        float interpolation = (1.0f - (d53.g.getInterpolation(this.c) * 0.15f)) * gm.L(26.0f);
        float f4 = interpolation / 2.0f;
        int width = (int) ((getWidth() / 2.0f) - f4);
        int height = (int) ((getHeight() / 2.0f) - f4);
        Drawable drawable = this.a;
        if (drawable == null) {
            drawable = this.b;
        }
        if (drawable != null) {
            drawable.setBounds(width, height, (int) (width + interpolation), (int) (height + interpolation));
            tx8.b(canvas, drawable);
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
