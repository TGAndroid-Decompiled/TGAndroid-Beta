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
import org.telegram.ui.Components.f11;
public final class d4 extends Drawable {
    public final int f4905a;
    public final Object f4906b;

    public d4(Object obj, int i10) {
        this.f4905a = i10;
        this.f4906b = obj;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f4905a) {
            case 0:
                canvas.save();
                e4 e4Var = (e4) this.f4906b;
                canvas.drawPath(e4Var.f5008t0, e4Var.f4985b0);
                canvas.restore();
                return;
            case 1:
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                ei.l3 l3Var = (ei.l3) this.f4906b;
                l3Var.I0.setBounds(getBounds());
                l3Var.I0.draw(canvas);
                canvas.restore();
                return;
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f4906b;
                if (actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.f2135f;
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
                Drawable drawable3 = actionBarContainer.f2134e;
                if (drawable3 != null && actionBarContainer.f2136n) {
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 3:
                rg.a1 a1Var = (rg.a1) this.f4906b;
                Rect bounds = getBounds();
                a1Var.getClass();
                a1Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, a1Var.f46052f);
                return;
            case 4:
                ImageReceiver imageReceiver = (ImageReceiver) this.f4906b;
                imageReceiver.setImageCoords(getBounds());
                imageReceiver.draw(canvas);
                return;
            case 5:
                Rect bounds2 = getBounds();
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), AndroidUtilities.dp(18.0f), ((Switch) this.f4906b).J);
                return;
            case 6:
                ((f11) this.f4906b).c(getBounds().centerX() - (((f11) this.f4906b).f26266c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false), canvas);
                return;
            case 7:
                canvas.save();
                Drawable drawable4 = (Drawable) this.f4906b;
                if (drawable4.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, drawable4.getBounds().centerX(), drawable4.getBounds().centerY());
                }
                drawable4.draw(canvas);
                canvas.restore();
                return;
            default:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((b7) this.f4906b).draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f4905a) {
            case 1:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((b7) this.f4906b).getHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f4905a) {
            case 1:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((b7) this.f4906b).getWidth();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f4905a) {
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
                return ((Drawable) this.f4906b).getOpacity();
            default:
                return -2;
        }
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f4905a) {
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f4906b;
                if (actionBarContainer.h) {
                    if (actionBarContainer.f2135f != null) {
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
        switch (this.f4905a) {
            case 0:
                return;
            case 1:
                ((ei.l3) this.f4906b).I0.setAlpha(i10);
                return;
            case 2:
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f4906b).setAlpha(i10 / 255.0f);
                return;
            case 5:
            case 6:
                return;
            case 7:
                ((Drawable) this.f4906b).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public void setBounds(Rect rect) {
        switch (this.f4905a) {
            case 7:
                ((Drawable) this.f4906b).setBounds(rect);
                return;
            default:
                super.setBounds(rect);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f4905a) {
            case 0:
                return;
            case 1:
                ((ei.l3) this.f4906b).I0.setColorFilter(colorFilter);
                return;
            case 2:
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f4906b).setColorFilter(colorFilter);
                return;
            case 5:
            case 6:
                return;
            case 7:
                ((Drawable) this.f4906b).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public d4(ActionBarContainer actionBarContainer) {
        this.f4905a = 2;
        this.f4906b = actionBarContainer;
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f4905a) {
            case 7:
                ((Drawable) this.f4906b).setBounds(i10, i11, i12, i13);
                return;
            default:
                super.setBounds(i10, i11, i12, i13);
                return;
        }
    }

    public d4(String str) {
        this.f4905a = 6;
        this.f4906b = new f11(str.substring(0, !str.isEmpty()), 14.0f, AndroidUtilities.bold());
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
