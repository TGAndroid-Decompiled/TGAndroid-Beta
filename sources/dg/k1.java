package dg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.k01;
import ph.l5;
public final class k1 extends Drawable {
    public final int f4616a;
    public final Object f4617b;

    public k1(Object obj, int i10) {
        this.f4616a = i10;
        this.f4617b = obj;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f4616a) {
            case 0:
                canvas.save();
                Drawable drawable = (Drawable) this.f4617b;
                if (drawable.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                }
                drawable.draw(canvas);
                canvas.restore();
                return;
            case 1:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((l5) this.f4617b).draw(canvas);
                canvas.restore();
                return;
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f4617b;
                if (actionBarContainer.h) {
                    Drawable drawable2 = actionBarContainer.f382f;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                        return;
                    }
                    return;
                }
                Drawable drawable3 = actionBarContainer.d;
                if (drawable3 != null) {
                    drawable3.draw(canvas);
                }
                Drawable drawable4 = actionBarContainer.e;
                if (drawable4 != null && actionBarContainer.f383n) {
                    drawable4.draw(canvas);
                    return;
                }
                return;
            case 3:
                eg.q1 q1Var = (eg.q1) this.f4617b;
                Rect bounds = getBounds();
                q1Var.getClass();
                q1Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, q1Var.f5457f);
                return;
            case 4:
                ImageReceiver imageReceiver = (ImageReceiver) this.f4617b;
                imageReceiver.setImageCoords(getBounds());
                imageReceiver.draw(canvas);
                return;
            case 5:
                Rect bounds2 = getBounds();
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), AndroidUtilities.dp(18.0f), ((Switch) this.f4617b).G);
                return;
            case 6:
                ((k01) this.f4617b).c(getBounds().centerX() - (((k01) this.f4617b).f26084c / 2.0f), getBounds().centerY(), 1.0f, j6.w0(null, j6.G6, false), canvas);
                return;
            case 7:
                canvas.save();
                ph.f3 f3Var = (ph.f3) this.f4617b;
                canvas.drawPath(f3Var.f41625q0, f3Var.V);
                canvas.restore();
                return;
            default:
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                rh.q2 q2Var = (rh.q2) this.f4617b;
                q2Var.F0.setBounds(getBounds());
                q2Var.F0.draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f4616a) {
            case 1:
                return ((l5) this.f4617b).getHeight();
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return AndroidUtilities.dp(20.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f4616a) {
            case 1:
                return ((l5) this.f4617b).getWidth();
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return AndroidUtilities.dp(20.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f4616a) {
            case 0:
                return ((Drawable) this.f4617b).getOpacity();
            case 1:
                return -2;
            case 2:
                return 0;
            case 3:
                return -2;
            case 4:
                return -2;
            case 5:
                return 0;
            case 6:
                return -2;
            case 7:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f4616a) {
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f4617b;
                if (actionBarContainer.h) {
                    if (actionBarContainer.f382f != null) {
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
        switch (this.f4616a) {
            case 0:
                ((Drawable) this.f4617b).setAlpha(i10);
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f4617b).setAlpha(i10 / 255.0f);
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                ((rh.q2) this.f4617b).F0.setAlpha(i10);
                return;
        }
    }

    @Override
    public void setBounds(Rect rect) {
        switch (this.f4616a) {
            case 0:
                ((Drawable) this.f4617b).setBounds(rect);
                return;
            default:
                super.setBounds(rect);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f4616a) {
            case 0:
                ((Drawable) this.f4617b).setColorFilter(colorFilter);
                return;
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f4617b).setColorFilter(colorFilter);
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                ((rh.q2) this.f4617b).F0.setColorFilter(colorFilter);
                return;
        }
    }

    public k1(ActionBarContainer actionBarContainer) {
        this.f4616a = 2;
        this.f4617b = actionBarContainer;
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f4616a) {
            case 0:
                ((Drawable) this.f4617b).setBounds(i10, i11, i12, i13);
                return;
            default:
                super.setBounds(i10, i11, i12, i13);
                return;
        }
    }

    public k1(String str) {
        this.f4616a = 6;
        this.f4617b = new k01(str.substring(0, !str.isEmpty()), 14.0f, AndroidUtilities.bold());
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

    private final void f(int i10) {
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
