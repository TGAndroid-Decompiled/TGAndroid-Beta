package di;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.f01;
public final class e4 extends Drawable {
    public final int f7162a;
    public final Object f7163b;

    public e4(Object obj, int i10) {
        this.f7162a = i10;
        this.f7163b = obj;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f7162a) {
            case 0:
                canvas.save();
                f4 f4Var = (f4) this.f7163b;
                canvas.drawPath(f4Var.f7220t0, f4Var.f7197b0);
                canvas.restore();
                return;
            case 1:
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                fi.k3 k3Var = (fi.k3) this.f7163b;
                k3Var.I0.setBounds(getBounds());
                k3Var.I0.draw(canvas);
                canvas.restore();
                return;
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f7163b;
                if (actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.f951f;
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
                Drawable drawable3 = actionBarContainer.f950e;
                if (drawable3 != null && actionBarContainer.f952n) {
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 3:
                sg.c1 c1Var = (sg.c1) this.f7163b;
                Rect bounds = getBounds();
                c1Var.getClass();
                c1Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, c1Var.f46035f);
                return;
            case 4:
                ImageReceiver imageReceiver = (ImageReceiver) this.f7163b;
                imageReceiver.setImageCoords(getBounds());
                imageReceiver.draw(canvas);
                return;
            case 5:
                Rect bounds2 = getBounds();
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), AndroidUtilities.dp(18.0f), ((Switch) this.f7163b).J);
                return;
            case 6:
                ((f01) this.f7163b).c(getBounds().centerX() - (((f01) this.f7163b).f25847c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), canvas);
                return;
            case 7:
                canvas.save();
                Drawable drawable4 = (Drawable) this.f7163b;
                if (drawable4.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, drawable4.getBounds().centerX(), drawable4.getBounds().centerY());
                }
                drawable4.draw(canvas);
                canvas.restore();
                return;
            default:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((d7) this.f7163b).draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f7162a) {
            case 1:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((d7) this.f7163b).getHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f7162a) {
            case 1:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((d7) this.f7163b).getWidth();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f7162a) {
            case 0:
                return -2;
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
                return ((Drawable) this.f7163b).getOpacity();
            default:
                return -2;
        }
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f7162a) {
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f7163b;
                if (actionBarContainer.h) {
                    if (actionBarContainer.f951f != null) {
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
        switch (this.f7162a) {
            case 0:
                return;
            case 1:
                ((fi.k3) this.f7163b).I0.setAlpha(i10);
                return;
            case 2:
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f7163b).setAlpha(i10 / 255.0f);
                return;
            case 5:
            case 6:
                return;
            case 7:
                ((Drawable) this.f7163b).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public void setBounds(Rect rect) {
        switch (this.f7162a) {
            case 7:
                ((Drawable) this.f7163b).setBounds(rect);
                return;
            default:
                super.setBounds(rect);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f7162a) {
            case 0:
                return;
            case 1:
                ((fi.k3) this.f7163b).I0.setColorFilter(colorFilter);
                return;
            case 2:
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f7163b).setColorFilter(colorFilter);
                return;
            case 5:
            case 6:
                return;
            case 7:
                ((Drawable) this.f7163b).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public e4(ActionBarContainer actionBarContainer) {
        this.f7162a = 2;
        this.f7163b = actionBarContainer;
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f7162a) {
            case 7:
                ((Drawable) this.f7163b).setBounds(i10, i11, i12, i13);
                return;
            default:
                super.setBounds(i10, i11, i12, i13);
                return;
        }
    }

    public e4(String str) {
        this.f7162a = 6;
        this.f7163b = new f01(str.substring(0, !str.isEmpty()), 14.0f, AndroidUtilities.bold());
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
