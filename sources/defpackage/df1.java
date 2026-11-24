package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class df1 extends Drawable {
    public final byte a;
    public float b;
    public Object c;
    public Object d;

    public df1(Context context, int i) {
        this.a = (byte) 2;
        this.b = 0.75f;
        this.c = b10.d(context, 2131231177);
        uib uibVar = new uib(String.valueOf(i), 8.0f, gm.n1("fonts/num.otf"));
        this.d = uibVar;
        uibVar.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas) {
        float min;
        switch (this.a) {
            case 0:
                ef1 ef1Var = (ef1) this.d;
                int i = ef1Var.e;
                Matrix matrix = ef1Var.i;
                ef1Var.f = getBounds().width();
                RectF rectF = gm.P;
                rectF.set(getBounds());
                ef1Var.a(this.b, canvas, rectF, null);
                meb mebVar = (meb) this.c;
                if (mebVar != null) {
                    mebVar.c = ef1Var.a;
                    int i2 = ef1Var.f;
                    float f = (((i << 1) + i2) * ef1Var.g) - i;
                    int i3 = (int) (i2 * 0.5f);
                    int width = getBounds().width();
                    int height = getBounds().height();
                    float f2 = width / mebVar.e;
                    float f3 = height / mebVar.f;
                    if (mebVar.s) {
                        min = Math.max(f2, f3);
                    } else {
                        min = Math.min(f2, f3);
                    }
                    matrix.reset();
                    matrix.setScale(1.0f / min, 0.0f, i / 2.0f, 0.0f);
                    matrix.setTranslate((f - mebVar.getBounds().left) - (i / min), 0.0f);
                    ef1Var.b.setLocalMatrix(matrix);
                    int i4 = i3 / 2;
                    mebVar.setBounds(getBounds().centerX() - i4, getBounds().centerY() - i4, getBounds().centerX() + i4, getBounds().centerY() + i4);
                    mebVar.draw(canvas);
                }
                ef1Var.o.invalidate();
                return;
            case 1:
                float f4 = this.b;
                canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, f4, f4, (Paint) this.d);
                ur3.e((Drawable) this.c, getBounds().exactCenterX(), getBounds().exactCenterY(), gm.L(36.0f), gm.L(36.0f), 17);
                ((Drawable) this.c).draw(canvas);
                return;
            case 2:
                Rect bounds = getBounds();
                canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                ((uib) this.d).c(bounds.centerX() - (((uib) this.d).c / 2.0f), gm.L(0.15f) + bounds.centerY(), drawable.getAlpha() / 255.0f, -1, canvas);
                canvas.restore();
                return;
            default:
                Paint paint = (Paint) this.d;
                if (this.b != gm.p) {
                    f();
                }
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                canvas.drawPath((Path) this.c, paint);
                canvas.drawRect(gm.N(7.56f), gm.N(8.0f), gm.L(18.0f) - gm.N(7.56f), gm.N(11.1f), paint);
                canvas.restore();
                return;
        }
    }

    public final void f() {
        int L = gm.L(18.0f);
        Path path = (Path) this.c;
        path.reset();
        float f = L >> 1;
        path.moveTo(f, gm.N(4.98f));
        path.lineTo(gm.N(4.95f), gm.N(9.0f));
        path.lineTo(L - gm.N(4.95f), gm.N(9.0f));
        path.lineTo(f, gm.N(4.98f));
        Paint paint = (Paint) this.d;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gm.N(1.0f));
        this.b = gm.p;
    }

    @Override
    public final int getAlpha() {
        switch (this.a) {
            case 2:
                return ((Drawable) this.c).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 2:
                return (int) (((Drawable) this.c).getIntrinsicHeight() * this.b);
            case 3:
                return gm.L(18.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 2:
                return (int) (((Drawable) this.c).getIntrinsicWidth() * this.b);
            case 3:
                return gm.L(18.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.a) {
            case 0:
            case 1:
                return -3;
            case 2:
                return -2;
            default:
                return 0;
        }
    }

    @Override
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                ef1 ef1Var = (ef1) this.d;
                ef1Var.a.setAlpha(i);
                ef1Var.c.setAlpha(i);
                return;
            case 1:
                return;
            case 2:
                ((Drawable) this.c).setAlpha(i);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                ((Drawable) this.c).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }

    public df1(Context context, float f) {
        this.a = (byte) 1;
        Paint paint = new Paint(1);
        this.d = paint;
        this.c = context.getResources().getDrawable(2131232154);
        paint.setColor(cmb.p1(0.1552f, -16777216));
        this.b = f;
    }

    public df1(ef1 ef1Var, meb mebVar) {
        this.a = (byte) 0;
        this.d = ef1Var;
        this.c = mebVar;
    }

    public df1() {
        this.a = (byte) 3;
    }
}
