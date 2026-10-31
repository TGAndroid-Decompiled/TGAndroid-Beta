package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.qz0;
import vh.k4;
public final class x0 extends Drawable {
    public final int f10354a;
    public Object f10355b;

    public x0() {
        this.f10354a = 3;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f10354a) {
            case 0:
                canvas.save();
                g6 g6Var = (g6) this.f10355b;
                if (g6Var.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, g6Var.getBounds().centerX(), g6Var.getBounds().centerY());
                }
                g6Var.draw(canvas);
                canvas.restore();
                return;
            case 1:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((k4) this.f10355b).draw(canvas);
                canvas.restore();
                return;
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f10355b;
                if (actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.f1017f;
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
                if (drawable3 != null && actionBarContainer.f1018n) {
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 3:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - org.telegram.messenger.i0.L(1.0f), (getBounds().width() - org.telegram.messenger.i0.L(8.0f)) / 2.0f, (Paint) this.f10355b);
                return;
            case 4:
                Drawable[] drawableArr = (Drawable[]) this.f10355b;
                for (int i10 = 0; i10 < drawableArr.length; i10++) {
                    drawableArr[i10].setBounds(getBounds());
                    drawableArr[i10].draw(canvas);
                }
                return;
            case 5:
                kg.k1 k1Var = (kg.k1) this.f10355b;
                Rect bounds = getBounds();
                k1Var.getClass();
                k1Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, k1Var.f11142f);
                return;
            case 6:
                ImageReceiver imageReceiver = (ImageReceiver) this.f10355b;
                imageReceiver.z0(getBounds());
                imageReceiver.h(canvas, null);
                return;
            case 7:
                ((qz0) this.f10355b).c(getBounds().centerX() - (((qz0) this.f10355b).f29774c / 2.0f), getBounds().centerY(), 1.0f, t6.x0(null, t6.G6, false), canvas);
                return;
            case 8:
                canvas.save();
                vh.p2 p2Var = (vh.p2) this.f10355b;
                canvas.drawPath(p2Var.f51750t0, p2Var.f51728b0);
                canvas.restore();
                return;
            default:
                canvas.save();
                canvas.translate(0.0f, org.telegram.messenger.i0.L(1.0f));
                xh.m2 m2Var = (xh.m2) this.f10355b;
                m2Var.M0.setBounds(getBounds());
                m2Var.M0.draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f10354a) {
            case 1:
                return ((k4) this.f10355b).getHeight();
            case 4:
                return ((Drawable[]) this.f10355b)[0].getIntrinsicHeight();
            case 6:
                return org.telegram.messenger.i0.L(30.0f);
            case 9:
                return org.telegram.messenger.i0.L(20.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f10354a) {
            case 1:
                return ((k4) this.f10355b).getWidth();
            case 4:
                return ((Drawable[]) this.f10355b)[0].getIntrinsicWidth();
            case 6:
                return org.telegram.messenger.i0.L(30.0f);
            case 9:
                return org.telegram.messenger.i0.L(20.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f10354a) {
            case 0:
                return ((g6) this.f10355b).getOpacity();
            case 1:
                return -2;
            case 2:
                return 0;
            case 3:
                return 0;
            case 4:
                return -2;
            case 5:
                return -2;
            case 6:
                return -2;
            case 7:
                return -2;
            case 8:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f10354a) {
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f10355b;
                if (actionBarContainer.h) {
                    if (actionBarContainer.f1017f != null) {
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
    public final void setAlpha(int i10) {
        switch (this.f10354a) {
            case 0:
                ((g6) this.f10355b).setAlpha(i10);
                return;
            case 1:
            case 2:
                return;
            case 3:
                ((Paint) this.f10355b).setAlpha(i10);
                return;
            case 4:
                int i11 = 0;
                while (true) {
                    Drawable[] drawableArr = (Drawable[]) this.f10355b;
                    if (i11 < drawableArr.length) {
                        drawableArr[i11].setAlpha(i10);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 5:
                return;
            case 6:
                ((ImageReceiver) this.f10355b).setAlpha(i10 / 255.0f);
                return;
            case 7:
            case 8:
                return;
            default:
                ((xh.m2) this.f10355b).M0.setAlpha(i10);
                return;
        }
    }

    @Override
    public void setBounds(Rect rect) {
        switch (this.f10354a) {
            case 0:
                ((g6) this.f10355b).setBounds(rect);
                return;
            default:
                super.setBounds(rect);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f10354a) {
            case 0:
                ((g6) this.f10355b).setColorFilter(colorFilter);
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                ((ImageReceiver) this.f10355b).f14397o1 = colorFilter;
                return;
            case 7:
            case 8:
                return;
            default:
                ((xh.m2) this.f10355b).M0.setColorFilter(colorFilter);
                return;
        }
    }

    public x0(Object obj, int i10) {
        this.f10354a = i10;
        this.f10355b = obj;
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f10354a) {
            case 0:
                ((g6) this.f10355b).setBounds(i10, i11, i12, i13);
                return;
            default:
                super.setBounds(i10, i11, i12, i13);
                return;
        }
    }

    public x0(ActionBarContainer actionBarContainer) {
        this.f10354a = 2;
        this.f10355b = actionBarContainer;
    }

    public x0(Context context) {
        this.f10354a = 4;
        this.f10355b = r0;
        Drawable f7 = i0.a.f(context, 2131232789);
        f7.setColorFilter(new PorterDuffColorFilter(-9063442, PorterDuff.Mode.MULTIPLY));
        Drawable[] drawableArr = {f7, context.getResources().getDrawable(2131232790).mutate()};
    }

    public x0(String str) {
        this.f10354a = 7;
        this.f10355b = new qz0(str.substring(0, !str.isEmpty()), 14.0f, org.telegram.messenger.i0.o());
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(int i10) {
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
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

    private final void l(ColorFilter colorFilter) {
    }
}
