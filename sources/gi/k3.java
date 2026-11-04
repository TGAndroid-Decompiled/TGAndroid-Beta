package gi;

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
import org.telegram.ui.Components.ly0;
public final class k3 extends Drawable {
    public final int f13030a;
    public Object f13031b;

    public k3() {
        this.f13030a = 3;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f13030a) {
            case 0:
                canvas.save();
                l3 l3Var = (l3) this.f13031b;
                canvas.drawPath(l3Var.F0, l3Var.f13082c0);
                canvas.restore();
                return;
            case 1:
                canvas.save();
                canvas.translate(0.0f, org.telegram.messenger.g0.L(1.0f));
                ii.a3 a3Var = (ii.a3) this.f13031b;
                a3Var.N0.setBounds(getBounds());
                a3Var.N0.draw(canvas);
                canvas.restore();
                return;
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f13031b;
                if (actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.f1336f;
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
                Drawable drawable3 = actionBarContainer.f1335e;
                if (drawable3 != null && actionBarContainer.f1337n) {
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 3:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - org.telegram.messenger.g0.L(1.0f), (getBounds().width() - org.telegram.messenger.g0.L(8.0f)) / 2.0f, (Paint) this.f13031b);
                return;
            case 4:
                Drawable[] drawableArr = (Drawable[]) this.f13031b;
                for (int i3 = 0; i3 < drawableArr.length; i3++) {
                    drawableArr[i3].setBounds(getBounds());
                    drawableArr[i3].draw(canvas);
                }
                return;
            case 5:
                vg.x0 x0Var = (vg.x0) this.f13031b;
                Rect bounds = getBounds();
                x0Var.getClass();
                x0Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, x0Var.f56911f);
                return;
            case 6:
                ImageReceiver imageReceiver = (ImageReceiver) this.f13031b;
                imageReceiver.z0(getBounds());
                imageReceiver.h(canvas, null);
                return;
            case 7:
                ((ly0) this.f13031b).c(getBounds().centerX() - (((ly0) this.f13031b).f35918c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false), canvas);
                return;
            case 8:
                canvas.save();
                org.telegram.messenger.e6 e6Var = (org.telegram.messenger.e6) this.f13031b;
                if (e6Var.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, e6Var.getBounds().centerX(), e6Var.getBounds().centerY());
                }
                e6Var.draw(canvas);
                canvas.restore();
                return;
            default:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((y5) this.f13031b).draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f13030a) {
            case 1:
                return org.telegram.messenger.g0.L(20.0f);
            case 4:
                return ((Drawable[]) this.f13031b)[0].getIntrinsicHeight();
            case 6:
                return org.telegram.messenger.g0.L(30.0f);
            case 9:
                return ((y5) this.f13031b).getHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f13030a) {
            case 1:
                return org.telegram.messenger.g0.L(20.0f);
            case 4:
                return ((Drawable[]) this.f13031b)[0].getIntrinsicWidth();
            case 6:
                return org.telegram.messenger.g0.L(30.0f);
            case 9:
                return ((y5) this.f13031b).getWidth();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f13030a) {
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
                return ((org.telegram.messenger.e6) this.f13031b).getOpacity();
            default:
                return -2;
        }
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f13030a) {
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f13031b;
                if (actionBarContainer.h) {
                    if (actionBarContainer.f1336f != null) {
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
    public final void setAlpha(int i3) {
        switch (this.f13030a) {
            case 0:
                return;
            case 1:
                ((ii.a3) this.f13031b).N0.setAlpha(i3);
                return;
            case 2:
                return;
            case 3:
                ((Paint) this.f13031b).setAlpha(i3);
                return;
            case 4:
                int i10 = 0;
                while (true) {
                    Drawable[] drawableArr = (Drawable[]) this.f13031b;
                    if (i10 < drawableArr.length) {
                        drawableArr[i10].setAlpha(i3);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 5:
                return;
            case 6:
                ((ImageReceiver) this.f13031b).setAlpha(i3 / 255.0f);
                return;
            case 7:
                return;
            case 8:
                ((org.telegram.messenger.e6) this.f13031b).setAlpha(i3);
                return;
            default:
                return;
        }
    }

    @Override
    public void setBounds(Rect rect) {
        switch (this.f13030a) {
            case 8:
                ((org.telegram.messenger.e6) this.f13031b).setBounds(rect);
                return;
            default:
                super.setBounds(rect);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f13030a) {
            case 0:
                return;
            case 1:
                ((ii.a3) this.f13031b).N0.setColorFilter(colorFilter);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                ((ImageReceiver) this.f13031b).f21261p1 = colorFilter;
                return;
            case 7:
                return;
            case 8:
                ((org.telegram.messenger.e6) this.f13031b).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public k3(Object obj, int i3) {
        this.f13030a = i3;
        this.f13031b = obj;
    }

    @Override
    public void setBounds(int i3, int i10, int i11, int i12) {
        switch (this.f13030a) {
            case 8:
                ((org.telegram.messenger.e6) this.f13031b).setBounds(i3, i10, i11, i12);
                return;
            default:
                super.setBounds(i3, i10, i11, i12);
                return;
        }
    }

    public k3(ActionBarContainer actionBarContainer) {
        this.f13030a = 2;
        this.f13031b = actionBarContainer;
    }

    public k3(Context context) {
        this.f13030a = 4;
        this.f13031b = r0;
        Drawable g7 = k2.p1.g(context, 2131232789);
        g7.setColorFilter(new PorterDuffColorFilter(-9063442, PorterDuff.Mode.MULTIPLY));
        Drawable[] drawableArr = {g7, context.getResources().getDrawable(2131232790).mutate()};
    }

    public k3(String str) {
        this.f13030a = 7;
        this.f13031b = new ly0(str.substring(0, !str.isEmpty()), 14.0f, org.telegram.messenger.g0.o());
    }

    private final void a(int i3) {
    }

    private final void b(int i3) {
    }

    private final void c(int i3) {
    }

    private final void d(int i3) {
    }

    private final void e(int i3) {
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
