package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.u01;
public final class e4 extends Drawable {
    public final int f4596a;
    public final Object f4597b;

    public e4(Object obj, int i10) {
        this.f4596a = i10;
        this.f4597b = obj;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f4596a) {
            case 0:
                canvas.save();
                f4 f4Var = (f4) this.f4597b;
                canvas.drawPath(f4Var.f4649t0, f4Var.f4627b0);
                canvas.restore();
                return;
            case 1:
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                ei.k3 k3Var = (ei.k3) this.f4597b;
                k3Var.I0.setBounds(getBounds());
                k3Var.I0.draw(canvas);
                canvas.restore();
                return;
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f4597b;
                if (actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.f1970f;
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
                if (drawable3 != null && actionBarContainer.f1971n) {
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 3:
                rg.z0 z0Var = (rg.z0) this.f4597b;
                Rect bounds = getBounds();
                z0Var.getClass();
                z0Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, z0Var.f42854f);
                return;
            case 4:
                ImageReceiver imageReceiver = (ImageReceiver) this.f4597b;
                imageReceiver.setImageCoords(getBounds());
                imageReceiver.draw(canvas);
                return;
            case 5:
                Rect bounds2 = getBounds();
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), AndroidUtilities.dp(18.0f), ((Switch) this.f4597b).J);
                return;
            case 6:
                ((u01) this.f4597b).c(getBounds().centerX() - (((u01) this.f4597b).f28493c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), canvas);
                return;
            case 7:
                canvas.save();
                Drawable drawable4 = (Drawable) this.f4597b;
                if (drawable4.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, drawable4.getBounds().centerX(), drawable4.getBounds().centerY());
                }
                drawable4.draw(canvas);
                canvas.restore();
                return;
            default:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((d7) this.f4597b).draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f4596a) {
            case 1:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((d7) this.f4597b).getHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f4596a) {
            case 1:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((d7) this.f4597b).getWidth();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f4596a) {
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
                return ((Drawable) this.f4597b).getOpacity();
            default:
                return -2;
        }
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f4596a) {
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f4597b;
                if (actionBarContainer.h) {
                    if (actionBarContainer.f1970f != null) {
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
        switch (this.f4596a) {
            case 0:
                return;
            case 1:
                ((ei.k3) this.f4597b).I0.setAlpha(i10);
                return;
            case 2:
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f4597b).setAlpha(i10 / 255.0f);
                return;
            case 5:
            case 6:
                return;
            case 7:
                ((Drawable) this.f4597b).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public void setBounds(Rect rect) {
        switch (this.f4596a) {
            case 7:
                ((Drawable) this.f4597b).setBounds(rect);
                return;
            default:
                super.setBounds(rect);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f4596a) {
            case 0:
                return;
            case 1:
                ((ei.k3) this.f4597b).I0.setColorFilter(colorFilter);
                return;
            case 2:
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f4597b).setColorFilter(colorFilter);
                return;
            case 5:
            case 6:
                return;
            case 7:
                ((Drawable) this.f4597b).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public e4(ActionBarContainer actionBarContainer) {
        this.f4596a = 2;
        this.f4597b = actionBarContainer;
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f4596a) {
            case 7:
                ((Drawable) this.f4597b).setBounds(i10, i11, i12, i13);
                return;
            default:
                super.setBounds(i10, i11, i12, i13);
                return;
        }
    }

    public e4(String str) {
        this.f4596a = 6;
        this.f4597b = new u01(str.substring(0, !str.isEmpty()), 14.0f, AndroidUtilities.bold());
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
