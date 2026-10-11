package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.m11;
public final class c4 extends Drawable {
    public final int f4833a;
    public final Object f4834b;

    public c4(Object obj, int i10) {
        this.f4833a = i10;
        this.f4834b = obj;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f4833a) {
            case 0:
                canvas.save();
                d4 d4Var = (d4) this.f4834b;
                canvas.drawPath(d4Var.f4927t0, d4Var.f4904b0);
                canvas.restore();
                return;
            case 1:
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                ei.k3 k3Var = (ei.k3) this.f4834b;
                k3Var.I0.setBounds(getBounds());
                k3Var.I0.draw(canvas);
                canvas.restore();
                return;
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f4834b;
                if (actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.f2214f;
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
                Drawable drawable3 = actionBarContainer.f2213e;
                if (drawable3 != null && actionBarContainer.f2215n) {
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 3:
                rg.a1 a1Var = (rg.a1) this.f4834b;
                Rect bounds = getBounds();
                a1Var.getClass();
                a1Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, a1Var.f47303f);
                return;
            case 4:
                ImageReceiver imageReceiver = (ImageReceiver) this.f4834b;
                imageReceiver.setImageCoords(getBounds());
                imageReceiver.draw(canvas);
                return;
            case 5:
                ((m11) this.f4834b).c(getBounds().centerX() - (((m11) this.f4834b).f28678c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), canvas);
                return;
            case 6:
                canvas.save();
                Drawable drawable4 = (Drawable) this.f4834b;
                if (drawable4.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, drawable4.getBounds().centerX(), drawable4.getBounds().centerY());
                }
                drawable4.draw(canvas);
                canvas.restore();
                return;
            default:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((b7) this.f4834b).draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f4833a) {
            case 1:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 7:
                return ((b7) this.f4834b).getHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f4833a) {
            case 1:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 7:
                return ((b7) this.f4834b).getWidth();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f4833a) {
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
                return -2;
            case 6:
                return ((Drawable) this.f4834b).getOpacity();
            default:
                return -2;
        }
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f4833a) {
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f4834b;
                if (actionBarContainer.h) {
                    if (actionBarContainer.f2214f != null) {
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
        switch (this.f4833a) {
            case 0:
                return;
            case 1:
                ((ei.k3) this.f4834b).I0.setAlpha(i10);
                return;
            case 2:
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f4834b).setAlpha(i10 / 255.0f);
                return;
            case 5:
                return;
            case 6:
                ((Drawable) this.f4834b).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public void setBounds(Rect rect) {
        switch (this.f4833a) {
            case 6:
                ((Drawable) this.f4834b).setBounds(rect);
                return;
            default:
                super.setBounds(rect);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f4833a) {
            case 0:
                return;
            case 1:
                ((ei.k3) this.f4834b).I0.setColorFilter(colorFilter);
                return;
            case 2:
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f4834b).setColorFilter(colorFilter);
                return;
            case 5:
                return;
            case 6:
                ((Drawable) this.f4834b).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public c4(ActionBarContainer actionBarContainer) {
        this.f4833a = 2;
        this.f4834b = actionBarContainer;
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f4833a) {
            case 6:
                ((Drawable) this.f4834b).setBounds(i10, i11, i12, i13);
                return;
            default:
                super.setBounds(i10, i11, i12, i13);
                return;
        }
    }

    public c4(String str) {
        this.f4833a = 5;
        this.f4834b = new m11(str.substring(0, !str.isEmpty()), 14.0f, AndroidUtilities.bold());
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
}
