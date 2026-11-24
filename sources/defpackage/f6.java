package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.ImageReceiver;
public final class f6 extends Drawable {
    public final byte a;
    public final Object b;

    public f6(Context context) {
        this.a = (byte) 2;
        this.b = r0;
        Drawable d = b00.d(context, 2131232796);
        d.setColorFilter(new PorterDuffColorFilter(-9063442, PorterDuff.Mode.MULTIPLY));
        Drawable[] drawableArr = {d, context.getResources().getDrawable(2131232797).mutate()};
    }

    @Override
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) obj;
                if (actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.f;
                    if (drawable != null) {
                        drawable.draw(canvas);
                        return;
                    }
                    return;
                }
                Drawable drawable2 = actionBarContainer.d;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
                Drawable drawable3 = actionBarContainer.e;
                if (drawable3 != null && actionBarContainer.n) {
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 1:
                canvas.save();
                canvas.translate(0.0f, gl.L(1.0f));
                ow0 ow0Var = (ow0) obj;
                ow0Var.N0.setBounds(getBounds());
                ow0Var.N0.draw(canvas);
                canvas.restore();
                return;
            case 2:
                Drawable[] drawableArr = (Drawable[]) obj;
                for (int i = 0; i < drawableArr.length; i++) {
                    drawableArr[i].setBounds(getBounds());
                    drawableArr[i].draw(canvas);
                }
                return;
            case 3:
                mh8 mh8Var = (mh8) obj;
                Rect bounds = getBounds();
                mh8Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, mh8Var.f);
                return;
            case 4:
                canvas.save();
                je5 je5Var = (je5) obj;
                canvas.drawPath(je5Var.F0, je5Var.c0);
                canvas.restore();
                return;
            case 5:
                canvas.save();
                ru3 ru3Var = (ru3) obj;
                if (ru3Var.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, ru3Var.getBounds().centerX(), ru3Var.getBounds().centerY());
                }
                ru3Var.draw(canvas);
                canvas.restore();
                return;
            case 6:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((i7b) obj).draw(canvas);
                canvas.restore();
                return;
            case 7:
                ImageReceiver imageReceiver = (ImageReceiver) obj;
                imageReceiver.j0(getBounds());
                imageReceiver.h(canvas, null);
                return;
            default:
                ((tgb) obj).c(getBounds().centerX() - (((tgb) obj).c / 2.0f), getBounds().centerY(), 1.0f, bkb.w0(null, bkb.F6, false), canvas);
                return;
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return gl.L(20.0f);
            case 2:
                return ((Drawable[]) this.b)[0].getIntrinsicHeight();
            case 3:
            case 4:
            case 5:
            default:
                return super.getIntrinsicHeight();
            case 6:
                return ((i7b) this.b).getHeight();
            case 7:
                return gl.L(30.0f);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return gl.L(20.0f);
            case 2:
                return ((Drawable[]) this.b)[0].getIntrinsicWidth();
            case 3:
            case 4:
            case 5:
            default:
                return super.getIntrinsicWidth();
            case 6:
                return ((i7b) this.b).getWidth();
            case 7:
                return gl.L(30.0f);
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 3:
            case 4:
                return -2;
            case 5:
                return ((ru3) this.b).getOpacity();
            case 6:
            case 7:
            default:
                return -2;
        }
    }

    @Override
    public final void getOutline(Outline outline) {
        switch (this.a) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.b;
                if (actionBarContainer.h) {
                    if (actionBarContainer.f != null) {
                        actionBarContainer.d.getOutline(outline);
                        return;
                    }
                    return;
                }
                Drawable drawable = actionBarContainer.d;
                if (drawable != null) {
                    drawable.getOutline(outline);
                    return;
                }
                return;
            default:
                super.getOutline(outline);
                return;
        }
    }

    @Override
    public final void setAlpha(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return;
            case 1:
                ((ow0) obj).N0.setAlpha(i);
                return;
            case 2:
                int i2 = 0;
                while (true) {
                    Drawable[] drawableArr = (Drawable[]) obj;
                    if (i2 < drawableArr.length) {
                        drawableArr[i2].setAlpha(i);
                        i2++;
                    } else {
                        return;
                    }
                }
            case 3:
            case 4:
                return;
            case 5:
                ((ru3) obj).setAlpha(i);
                return;
            case 6:
                return;
            case 7:
                ((ImageReceiver) obj).setAlpha(i / 255.0f);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setBounds(Rect rect) {
        switch (this.a) {
            case 5:
                ((ru3) this.b).setBounds(rect);
                return;
            default:
                super.setBounds(rect);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return;
            case 1:
                ((ow0) obj).N0.setColorFilter(colorFilter);
                return;
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                ((ru3) obj).setColorFilter(colorFilter);
                return;
            case 6:
                return;
            case 7:
                ((ImageReceiver) obj).p1 = colorFilter;
                return;
            default:
                return;
        }
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 5:
                ((ru3) this.b).setBounds(i, i2, i3, i4);
                return;
            default:
                super.setBounds(i, i2, i3, i4);
                return;
        }
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }

    private final void f(ColorFilter colorFilter) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(ColorFilter colorFilter) {
    }

    private final void j(ColorFilter colorFilter) {
    }

    private final void k(ColorFilter colorFilter) {
    }

    public f6(ActionBarContainer actionBarContainer) {
        this.a = (byte) 0;
        this.b = actionBarContainer;
    }

    public f6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public f6(String str) {
        this.a = (byte) 8;
        this.b = new tgb(str.substring(0, !str.isEmpty()), 14.0f, gl.o());
    }
}
