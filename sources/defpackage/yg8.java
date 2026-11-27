package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class yg8 extends View {
    public final Drawable a;
    public final fm0 b;
    public final byte c;
    public zg8 d;

    public yg8(Context context, int i) {
        super(context);
        this.b = new fm0(380L, this, k43.h);
        this.c = i;
        Drawable e = c00.e(context, 2131232505);
        this.a = e;
        yob.x(this, e, aob.o7, null, PorterDuff.Mode.SRC_IN);
    }

    public final void a(zg8 zg8Var, boolean z) {
        boolean z2;
        zg8 zg8Var2;
        zg8 zg8Var3;
        if (zg8Var != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.b.a(z2, z);
        if (isAttachedToWindow() && (zg8Var3 = this.d) != null) {
            zg8Var3.b();
        }
        this.d = zg8Var;
        if (isAttachedToWindow() && (zg8Var2 = this.d) != null) {
            zg8Var2.a(this);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zg8 zg8Var = this.d;
        if (zg8Var != null) {
            zg8Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zg8 zg8Var = this.d;
        if (zg8Var != null) {
            zg8Var.b();
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
            int L = hl.L(f3);
            canvas.save();
            canvas.translate((getWidth() - L) / 2, (getHeight() - L) / 2);
            canvas.scale(f, f, hl.L(f3) / 2.0f, hl.L(f3) / 2.0f);
            zg8 zg8Var = this.d;
            if (zg8Var != null) {
                zg8Var.c(canvas, hl.L(f3), hl.L(f3));
            }
            canvas.restore();
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int L = hl.L(24.0f);
        int i5 = (i - L) / 2;
        int i6 = (i2 - L) / 2;
        this.a.setBounds(i5, i6, i5 + L, L + i6);
    }
}
