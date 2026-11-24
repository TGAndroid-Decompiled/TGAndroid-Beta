package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
public final class g57 extends Drawable {
    public final byte a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    public g57(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                return;
        }
    }

    public final void b(int i, int i2) {
        ((Paint) this.c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(28.0f), new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        p09 p09Var;
        switch (this.a) {
            case 0:
                p09 p09Var2 = (p09) this.d;
                p09 p09Var3 = (p09) this.c;
                Rect rect = gm.Q;
                rect.set(getBounds().centerX() - gm.L(12.0f), getBounds().centerY() - gm.L(12.0f), gm.L(12.0f) + getBounds().centerX(), gm.L(12.0f) + getBounds().centerY());
                if (((p09) this.e).v()) {
                    p09 p09Var4 = (p09) this.e;
                    boolean z = this.b;
                    if (z) {
                        p09Var = p09Var3;
                    } else {
                        p09Var = p09Var2;
                    }
                    if (p09Var4 != p09Var) {
                        if (z) {
                            p09Var2 = p09Var3;
                        }
                        this.e = p09Var2;
                        p09Var2.H(p09Var2.e[0] - 1);
                    }
                }
                ((p09) this.e).setBounds(rect);
                ((p09) this.e).draw(canvas);
                return;
            default:
                Paint paint = (Paint) this.d;
                float L = gm.L(10.0f);
                RectF rectF = gm.P;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, L, L, (Paint) this.c);
                if (this.b) {
                    float L2 = gm.L(1.0f);
                    paint.setStrokeWidth(L2);
                    matrix.reset();
                    matrix.postTranslate(rectF.left, rectF.top);
                    float f = L2 / 2.0f;
                    rectF.inset(f, f);
                    canvas.drawRoundRect(rectF, L, L, paint);
                    return;
                }
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return gm.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return gm.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        byte b = this.a;
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                ((p09) this.c).setAlpha(i);
                ((p09) this.d).setAlpha(i);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                ((p09) this.c).setColorFilter(colorFilter);
                ((p09) this.d).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    private final void a(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
