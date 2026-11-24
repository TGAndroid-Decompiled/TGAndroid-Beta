package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class kd8 extends View {
    public final Drawable a;
    public final fm0 b;
    public final byte c;
    public ld8 d;

    public kd8(Context context, int i) {
        super(context);
        this.b = new fm0(380L, this, s33.h);
        this.c = i;
        Drawable d = b00.d(context, 2131232494);
        this.a = d;
        zkb.x(this, d, bkb.n7, null, PorterDuff.Mode.SRC_IN);
    }

    public final void a(ld8 ld8Var, boolean z) {
        boolean z2;
        ld8 ld8Var2;
        ld8 ld8Var3;
        if (ld8Var != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.b.a(z2, z);
        if (isAttachedToWindow() && (ld8Var3 = this.d) != null) {
            ld8Var3.b();
        }
        this.d = ld8Var;
        if (isAttachedToWindow() && (ld8Var2 = this.d) != null) {
            ld8Var2.a(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ld8 ld8Var = this.d;
        if (ld8Var != null) {
            ld8Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ld8 ld8Var = this.d;
        if (ld8Var != null) {
            ld8Var.b();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f = this.b.e;
        if (f < 1.0f) {
            canvas.save();
            float f2 = 1.0f - f;
            canvas.scale(f2, f2, width, height);
            this.a.draw(canvas);
            canvas.restore();
        }
        if (f > 0.0f) {
            float f3 = this.c;
            int L = gl.L(f3);
            canvas.save();
            canvas.translate((getWidth() - L) / 2, (getHeight() - L) / 2);
            canvas.scale(f, f, gl.L(f3) / 2.0f, gl.L(f3) / 2.0f);
            ld8 ld8Var = this.d;
            if (ld8Var != null) {
                ld8Var.c(canvas, gl.L(f3), gl.L(f3));
            }
            canvas.restore();
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int L = gl.L(24.0f);
        int i5 = (i - L) / 2;
        int i6 = (i2 - L) / 2;
        this.a.setBounds(i5, i6, i5 + L, L + i6);
    }
}
