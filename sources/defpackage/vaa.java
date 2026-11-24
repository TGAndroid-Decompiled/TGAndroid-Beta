package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class vaa extends Drawable {
    public final Paint a;
    public final oy8 b;
    public final Drawable c;
    public final wjb d;
    public int e;
    public int f;
    public int g;

    public vaa(Context context, View view, boolean z, int i, wjb wjbVar) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.g = 255;
        this.d = wjbVar;
        this.e = bkb.v0(bkb.Xk, wjbVar);
        this.f = bkb.v0(bkb.Yk, wjbVar);
        paint.setShader(new LinearGradient(0.0f, 0.0f, gl.L(56.0f), gl.L(56.0f), new int[]{this.e, this.f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (z) {
            oy8 oy8Var = new oy8(2131624232, gl.L(42.0f), gl.L(42.0f), true, null);
            this.b = oy8Var;
            oy8Var.M(view);
            gl.d3(new pk1(oy8Var, (byte) 8), 450L);
            this.c = null;
            return;
        }
        this.b = null;
        Drawable d = b00.d(context, i);
        this.c = d;
        d.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        Paint paint = this.a;
        wjb wjbVar = this.d;
        try {
            int v0 = bkb.v0(bkb.Xk, wjbVar);
            int v02 = bkb.v0(bkb.Yk, wjbVar);
            if (v0 != this.e || v02 != this.f) {
                this.e = v0;
                this.f = v02;
                paint.setShader(new LinearGradient(0.0f, 0.0f, gl.L(56.0f), gl.L(56.0f), new int[]{v0, v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
        paint.setAlpha(this.g);
        float min = (this.g / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
        canvas.drawRoundRect(rectF, min, min, paint);
        canvas.restore();
        Drawable drawable = this.b;
        if (drawable != null) {
            f = 20.0f;
        } else {
            f = 15.0f;
        }
        int L = gl.L(f);
        Rect rect = gl.Q;
        rect.set(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
        if (drawable == null) {
            drawable = this.c;
        }
        if (drawable != null) {
            drawable.setBounds(rect);
            drawable.setAlpha(this.g);
            drawable.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return gl.L(56.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gl.L(56.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.g = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
