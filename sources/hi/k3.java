package hi;

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
import org.telegram.ui.Components.xy0;
public final class k3 extends Drawable {
    public final int f14809a;
    public Object f14810b;

    public k3() {
        this.f14809a = 3;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f14809a) {
            case 0:
                canvas.save();
                l3 l3Var = (l3) this.f14810b;
                canvas.drawPath(l3Var.F0, l3Var.f14850c0);
                canvas.restore();
                return;
            case 1:
                canvas.save();
                canvas.translate(0.0f, org.telegram.messenger.g0.L(1.0f));
                ki.s2 s2Var = (ki.s2) this.f14810b;
                s2Var.N0.setBounds(getBounds());
                s2Var.N0.draw(canvas);
                canvas.restore();
                return;
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f14810b;
                if (actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.f1826f;
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
                Drawable drawable3 = actionBarContainer.f1825e;
                if (drawable3 != null && actionBarContainer.f1827n) {
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 3:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - org.telegram.messenger.g0.L(1.0f), (getBounds().width() - org.telegram.messenger.g0.L(8.0f)) / 2.0f, (Paint) this.f14810b);
                return;
            case 4:
                Drawable[] drawableArr = (Drawable[]) this.f14810b;
                for (int i7 = 0; i7 < drawableArr.length; i7++) {
                    drawableArr[i7].setBounds(getBounds());
                    drawableArr[i7].draw(canvas);
                }
                return;
            case 5:
                ug.a1 a1Var = (ug.a1) this.f14810b;
                Rect bounds = getBounds();
                a1Var.getClass();
                a1Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, a1Var.f58612f);
                return;
            case 6:
                ImageReceiver imageReceiver = (ImageReceiver) this.f14810b;
                imageReceiver.z0(getBounds());
                imageReceiver.h(canvas, null);
                return;
            case 7:
                ((xy0) this.f14810b).c(getBounds().centerX() - (((xy0) this.f14810b).f42224c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false), canvas);
                return;
            case 8:
                canvas.save();
                org.telegram.messenger.f6 f6Var = (org.telegram.messenger.f6) this.f14810b;
                if (f6Var.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, f6Var.getBounds().centerX(), f6Var.getBounds().centerY());
                }
                f6Var.draw(canvas);
                canvas.restore();
                return;
            default:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((w5) this.f14810b).draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f14809a) {
            case 1:
                return org.telegram.messenger.g0.L(20.0f);
            case 4:
                return ((Drawable[]) this.f14810b)[0].getIntrinsicHeight();
            case 6:
                return org.telegram.messenger.g0.L(30.0f);
            case 9:
                return ((w5) this.f14810b).getHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f14809a) {
            case 1:
                return org.telegram.messenger.g0.L(20.0f);
            case 4:
                return ((Drawable[]) this.f14810b)[0].getIntrinsicWidth();
            case 6:
                return org.telegram.messenger.g0.L(30.0f);
            case 9:
                return ((w5) this.f14810b).getWidth();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f14809a) {
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
                return ((org.telegram.messenger.f6) this.f14810b).getOpacity();
            default:
                return -2;
        }
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f14809a) {
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f14810b;
                if (actionBarContainer.h) {
                    if (actionBarContainer.f1826f != null) {
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
        switch (this.f14809a) {
            case 0:
                return;
            case 1:
                ((ki.s2) this.f14810b).N0.setAlpha(i7);
                return;
            case 2:
                return;
            case 3:
                ((Paint) this.f14810b).setAlpha(i7);
                return;
            case 4:
                int i10 = 0;
                while (true) {
                    Drawable[] drawableArr = (Drawable[]) this.f14810b;
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
                ((ImageReceiver) this.f14810b).setAlpha(i7 / 255.0f);
                return;
            case 7:
                return;
            case 8:
                ((org.telegram.messenger.f6) this.f14810b).setAlpha(i7);
                return;
            default:
                return;
        }
    }

    @Override
    public void setBounds(Rect rect) {
        switch (this.f14809a) {
            case 8:
                ((org.telegram.messenger.f6) this.f14810b).setBounds(rect);
                return;
            default:
                super.setBounds(rect);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f14809a) {
            case 0:
                return;
            case 1:
                ((ki.s2) this.f14810b).N0.setColorFilter(colorFilter);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                ((ImageReceiver) this.f14810b).f22648p1 = colorFilter;
                return;
            case 7:
                return;
            case 8:
                ((org.telegram.messenger.f6) this.f14810b).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public k3(Object obj, int i7) {
        this.f14809a = i7;
        this.f14810b = obj;
    }

    @Override
    public void setBounds(int i7, int i10, int i11, int i12) {
        switch (this.f14809a) {
            case 8:
                ((org.telegram.messenger.f6) this.f14810b).setBounds(i7, i10, i11, i12);
                return;
            default:
                super.setBounds(i7, i10, i11, i12);
                return;
        }
    }

    public k3(ActionBarContainer actionBarContainer) {
        this.f14809a = 2;
        this.f14810b = actionBarContainer;
    }

    public k3(Context context) {
        this.f14809a = 4;
        this.f14810b = r0;
        Drawable g10 = i5.c.g(context, 2131232793);
        g10.setColorFilter(new PorterDuffColorFilter(-9063442, PorterDuff.Mode.MULTIPLY));
        Drawable[] drawableArr = {g10, context.getResources().getDrawable(2131232794).mutate()};
    }

    public k3(String str) {
        this.f14809a = 7;
        this.f14810b = new xy0(str.substring(0, !str.isEmpty()), 14.0f, org.telegram.messenger.g0.o());
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
