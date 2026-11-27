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
public final class n57 extends Drawable {
    public final byte a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    public n57(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = new Paint(1);
                Paint paint = new Paint(1);
                this.d = paint;
                this.e = new Matrix();
                paint.setStyle(Paint.Style.STROKE);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                return;
            default:
                return;
        }
    }

    public final void b(int i, int i2) {
        ((Paint) this.c).setShader(new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(28.0f), new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override
    public final void draw(Canvas canvas) {
        b29 b29Var;
        switch (this.a) {
            case 0:
                b29 b29Var2 = (b29) this.d;
                b29 b29Var3 = (b29) this.c;
                Rect rect = hl.Q;
                rect.set(getBounds().centerX() - hl.L(12.0f), getBounds().centerY() - hl.L(12.0f), hl.L(12.0f) + getBounds().centerX(), hl.L(12.0f) + getBounds().centerY());
                if (((b29) this.e).v()) {
                    b29 b29Var4 = (b29) this.e;
                    boolean z = this.b;
                    if (z) {
                        b29Var = b29Var3;
                    } else {
                        b29Var = b29Var2;
                    }
                    if (b29Var4 != b29Var) {
                        if (z) {
                            b29Var2 = b29Var3;
                        }
                        this.e = b29Var2;
                        b29Var2.H(b29Var2.e[0] - 1);
                    }
                }
                ((b29) this.e).setBounds(rect);
                ((b29) this.e).draw(canvas);
                return;
            default:
                Paint paint = (Paint) this.d;
                float L = hl.L(10.0f);
                RectF rectF = hl.P;
                rectF.set(getBounds());
                Matrix matrix = (Matrix) this.e;
                matrix.reset();
                matrix.postTranslate(rectF.left, rectF.top);
                canvas.drawRoundRect(rectF, L, L, (Paint) this.c);
                if (this.b) {
                    float L2 = hl.L(1.0f);
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
                return hl.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return hl.L(24.0f);
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
                ((b29) this.c).setAlpha(i);
                ((b29) this.d).setAlpha(i);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                ((b29) this.c).setColorFilter(colorFilter);
                ((b29) this.d).setColorFilter(colorFilter);
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
