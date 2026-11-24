package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class yb1 extends Drawable {
    public final byte a;
    public final Object b;
    public final Object c;

    public yb1(boolean z) {
        this.a = (byte) 2;
        Paint paint = new Paint();
        this.b = paint;
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStrokeWidth(gm.L(1.0f));
        if (z) {
            paint.setColor(-14865331);
            paint2.setColor(-15854042);
            return;
        }
        paint.setColor(-2172970);
        paint2.setColor(-3752002);
    }

    @Override
    public final void draw(Canvas canvas) {
        float offsetY;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                zb1 zb1Var = (zb1) obj;
                if (zb1Var.c > 1) {
                    zb1Var.c(canvas, zb1Var.o);
                    return;
                } else {
                    zb1Var.c(canvas, (Paint) obj2);
                    return;
                }
            case 1:
                Paint paint = (Paint) obj2;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (chatActivityEnterView.V0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.s4 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y = (chatActivityEnterView.V0.getY() - chatActivityEnterView.getHeight()) + cmb.h3.getIntrinsicHeight();
                    sy1 sy1Var = chatActivityEnterView.F0;
                    if (sy1Var == null) {
                        offsetY = 0.0f;
                    } else {
                        offsetY = sy1Var.getOffsetY();
                    }
                    canvas.drawRect(0.0f, 0.0f, width, y + offsetY, paint);
                    return;
                }
                return;
            case 2:
                Paint paint2 = (Paint) obj;
                canvas.drawRect(getBounds(), (Paint) obj2);
                int L = gm.L(9.0f);
                int width2 = getBounds().width() / L;
                int height = getBounds().height() / L;
                int i = getBounds().left;
                int i2 = getBounds().top;
                int i3 = 0;
                int i4 = 0;
                while (i4 < width2) {
                    int i5 = i4 + 1;
                    float f = (L * i5) + i;
                    canvas.drawLine(f, i2, f, getBounds().height() + i2, paint2);
                    i4 = i5;
                }
                while (i3 < height) {
                    i3++;
                    float f2 = (L * i3) + i2;
                    canvas.drawLine(i, f2, getBounds().width() + i, f2, paint2);
                }
                return;
            case 3:
                uib uibVar = (uib) obj2;
                uibVar.c(getBounds().centerX() - (uibVar.c / 2.0f), getBounds().centerY(), 1.0f, cmb.v0(cmb.F6, (ylb) obj), canvas);
                return;
            default:
                ImageReceiver imageReceiver = (ImageReceiver) obj2;
                imageReceiver.h(canvas, null);
                Drawable drawable = (Drawable) obj;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int z = (int) aq1.z(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - d53.k.getInterpolation(imageReceiver.i1)) * gm.L(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.i1 * 5.0f) * 255.0f));
                drawable.setBounds(z, interpolation, intrinsicWidth + z, intrinsicHeight + interpolation);
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public final int getAlpha() {
        switch (this.a) {
            case 4:
                return (int) (((ImageReceiver) this.b).getAlpha() * 255.0f);
            default:
                return super.getAlpha();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 2:
                return 0;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 2:
                return 0;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.a) {
            case 0:
            case 1:
            case 3:
                return -2;
            case 2:
            default:
                return 0;
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 4:
                ((ImageReceiver) this.b).i0(gm.L(2.0f) + rect.left, gm.L(2.0f) + rect.top, wi8.B(2.0f, rect.left, rect.right - gm.L(2.0f)), wi8.B(2.0f, rect.top, rect.bottom - gm.L(2.0f)));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            default:
                ((ImageReceiver) this.b).setAlpha(i / 255.0f);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }

    private final void e(ColorFilter colorFilter) {
    }

    private final void f(ColorFilter colorFilter) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(ColorFilter colorFilter) {
    }

    public yb1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public yb1(zb1 zb1Var, Paint paint) {
        this.a = (byte) 0;
        this.c = zb1Var;
        this.b = paint;
    }

    public yb1(ChatActivityEnterView chatActivityEnterView) {
        this.a = (byte) 1;
        this.c = chatActivityEnterView;
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(0);
    }
}
