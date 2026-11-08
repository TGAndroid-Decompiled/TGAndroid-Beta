package fi;

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
import org.telegram.ui.Components.my0;
public final class l3 extends Drawable {
    public final int f12314a;
    public Object f12315b;

    public l3() {
        this.f12314a = 3;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f12314a) {
            case 0:
                canvas.save();
                m3 m3Var = (m3) this.f12315b;
                canvas.drawPath(m3Var.E0, m3Var.f12418b0);
                canvas.restore();
                return;
            case 1:
                canvas.save();
                canvas.translate(0.0f, org.telegram.messenger.g0.L(1.0f));
                hi.a3 a3Var = (hi.a3) this.f12315b;
                a3Var.M0.setBounds(getBounds());
                a3Var.M0.draw(canvas);
                canvas.restore();
                return;
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f12315b;
                if (actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.f1914f;
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
                Drawable drawable3 = actionBarContainer.f1913e;
                if (drawable3 != null && actionBarContainer.f1915n) {
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 3:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - org.telegram.messenger.g0.L(1.0f), (getBounds().width() - org.telegram.messenger.g0.L(8.0f)) / 2.0f, (Paint) this.f12315b);
                return;
            case 4:
                Drawable[] drawableArr = (Drawable[]) this.f12315b;
                for (int i7 = 0; i7 < drawableArr.length; i7++) {
                    drawableArr[i7].setBounds(getBounds());
                    drawableArr[i7].draw(canvas);
                }
                return;
            case 5:
                ug.y0 y0Var = (ug.y0) this.f12315b;
                Rect bounds = getBounds();
                y0Var.getClass();
                y0Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, y0Var.f56869f);
                return;
            case 6:
                ImageReceiver imageReceiver = (ImageReceiver) this.f12315b;
                imageReceiver.z0(getBounds());
                imageReceiver.h(canvas, null);
                return;
            case 7:
                ((my0) this.f12315b).c(getBounds().centerX() - (((my0) this.f12315b).f36147c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false), canvas);
                return;
            case 8:
                canvas.save();
                org.telegram.messenger.e6 e6Var = (org.telegram.messenger.e6) this.f12315b;
                if (e6Var.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, e6Var.getBounds().centerX(), e6Var.getBounds().centerY());
                }
                e6Var.draw(canvas);
                canvas.restore();
                return;
            default:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((y5) this.f12315b).draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f12314a) {
            case 1:
                return org.telegram.messenger.g0.L(20.0f);
            case 4:
                return ((Drawable[]) this.f12315b)[0].getIntrinsicHeight();
            case 6:
                return org.telegram.messenger.g0.L(30.0f);
            case 9:
                return ((y5) this.f12315b).getHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f12314a) {
            case 1:
                return org.telegram.messenger.g0.L(20.0f);
            case 4:
                return ((Drawable[]) this.f12315b)[0].getIntrinsicWidth();
            case 6:
                return org.telegram.messenger.g0.L(30.0f);
            case 9:
                return ((y5) this.f12315b).getWidth();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f12314a) {
            case 0:
                return -2;
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
                return ((org.telegram.messenger.e6) this.f12315b).getOpacity();
            default:
                return -2;
        }
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f12314a) {
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f12315b;
                if (actionBarContainer.h) {
                    if (actionBarContainer.f1914f != null) {
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
    public final void setAlpha(int i7) {
        switch (this.f12314a) {
            case 0:
                return;
            case 1:
                ((hi.a3) this.f12315b).M0.setAlpha(i7);
                return;
            case 2:
                return;
            case 3:
                ((Paint) this.f12315b).setAlpha(i7);
                return;
            case 4:
                int i10 = 0;
                while (true) {
                    Drawable[] drawableArr = (Drawable[]) this.f12315b;
                    if (i10 < drawableArr.length) {
                        drawableArr[i10].setAlpha(i7);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 5:
                return;
            case 6:
                ((ImageReceiver) this.f12315b).setAlpha(i7 / 255.0f);
                return;
            case 7:
                return;
            case 8:
                ((org.telegram.messenger.e6) this.f12315b).setAlpha(i7);
                return;
            default:
                return;
        }
    }

    @Override
    public void setBounds(Rect rect) {
        switch (this.f12314a) {
            case 8:
                ((org.telegram.messenger.e6) this.f12315b).setBounds(rect);
                return;
            default:
                super.setBounds(rect);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f12314a) {
            case 0:
                return;
            case 1:
                ((hi.a3) this.f12315b).M0.setColorFilter(colorFilter);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                ((ImageReceiver) this.f12315b).f21209o1 = colorFilter;
                return;
            case 7:
                return;
            case 8:
                ((org.telegram.messenger.e6) this.f12315b).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public l3(Object obj, int i7) {
        this.f12314a = i7;
        this.f12315b = obj;
    }

    @Override
    public void setBounds(int i7, int i10, int i11, int i12) {
        switch (this.f12314a) {
            case 8:
                ((org.telegram.messenger.e6) this.f12315b).setBounds(i7, i10, i11, i12);
                return;
            default:
                super.setBounds(i7, i10, i11, i12);
                return;
        }
    }

    public l3(ActionBarContainer actionBarContainer) {
        this.f12314a = 2;
        this.f12315b = actionBarContainer;
    }

    public l3(Context context) {
        this.f12314a = 4;
        this.f12315b = r0;
        Drawable h = jg.g.h(context, 2131232791);
        h.setColorFilter(new PorterDuffColorFilter(-9063442, PorterDuff.Mode.MULTIPLY));
        Drawable[] drawableArr = {h, context.getResources().getDrawable(2131232792).mutate()};
    }

    public l3(String str) {
        this.f12314a = 7;
        this.f12315b = new my0(str.substring(0, !str.isEmpty()), 14.0f, org.telegram.messenger.g0.o());
    }

    private final void a(int i7) {
    }

    private final void b(int i7) {
    }

    private final void c(int i7) {
    }

    private final void d(int i7) {
    }

    private final void e(int i7) {
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
