package kh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.nz0;
public final class w3 extends Drawable {
    public final int f16234a;
    public final Object f16235b;

    public w3(Object obj, int i9) {
        this.f16234a = i9;
        this.f16235b = obj;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f16234a) {
            case 0:
                canvas.save();
                x3 x3Var = (x3) this.f16235b;
                canvas.drawPath(x3Var.f16360p0, x3Var.U);
                canvas.restore();
                return;
            case 1:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f16235b;
                if (actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.f457f;
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
                Drawable drawable3 = actionBarContainer.f456e;
                if (drawable3 != null && actionBarContainer.f458n) {
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 2:
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                mh.c3 c3Var = (mh.c3) this.f16235b;
                c3Var.E0.setBounds(getBounds());
                c3Var.E0.draw(canvas);
                canvas.restore();
                return;
            case 3:
                zf.z0 z0Var = (zf.z0) this.f16235b;
                Rect bounds = getBounds();
                z0Var.getClass();
                z0Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, z0Var.f50792f);
                return;
            case 4:
                ImageReceiver imageReceiver = (ImageReceiver) this.f16235b;
                imageReceiver.setImageCoords(getBounds());
                imageReceiver.draw(canvas);
                return;
            case 5:
                Rect bounds2 = getBounds();
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), AndroidUtilities.dp(18.0f), ((Switch) this.f16235b).F);
                return;
            case 6:
                ((nz0) this.f16235b).c(getBounds().centerX() - (((nz0) this.f16235b).f31223c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), canvas);
                return;
            case 7:
                canvas.save();
                Drawable drawable4 = (Drawable) this.f16235b;
                if (drawable4.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, drawable4.getBounds().centerX(), drawable4.getBounds().centerY());
                }
                drawable4.draw(canvas);
                canvas.restore();
                return;
            default:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((r6) this.f16235b).draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f16234a) {
            case 2:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((r6) this.f16235b).getHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f16234a) {
            case 2:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((r6) this.f16235b).getWidth();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f16234a) {
            case 0:
                return -2;
            case 1:
                return 0;
            case 2:
                return -2;
            case 3:
                return -2;
            case 4:
                return -2;
            case 5:
                return 0;
            case 6:
                return -2;
            case 7:
                return ((Drawable) this.f16235b).getOpacity();
            default:
                return -2;
        }
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f16234a) {
            case 1:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f16235b;
                if (actionBarContainer.h) {
                    if (actionBarContainer.f457f != null) {
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
    public final void setAlpha(int i9) {
        switch (this.f16234a) {
            case 0:
            case 1:
                return;
            case 2:
                ((mh.c3) this.f16235b).E0.setAlpha(i9);
                return;
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f16235b).setAlpha(i9 / 255.0f);
                return;
            case 5:
            case 6:
                return;
            case 7:
                ((Drawable) this.f16235b).setAlpha(i9);
                return;
            default:
                return;
        }
    }

    @Override
    public void setBounds(Rect rect) {
        switch (this.f16234a) {
            case 7:
                ((Drawable) this.f16235b).setBounds(rect);
                return;
            default:
                super.setBounds(rect);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f16234a) {
            case 0:
            case 1:
                return;
            case 2:
                ((mh.c3) this.f16235b).E0.setColorFilter(colorFilter);
                return;
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f16235b).setColorFilter(colorFilter);
                return;
            case 5:
            case 6:
                return;
            case 7:
                ((Drawable) this.f16235b).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public w3(ActionBarContainer actionBarContainer) {
        this.f16234a = 1;
        this.f16235b = actionBarContainer;
    }

    @Override
    public void setBounds(int i9, int i10, int i11, int i12) {
        switch (this.f16234a) {
            case 7:
                ((Drawable) this.f16235b).setBounds(i9, i10, i11, i12);
                return;
            default:
                super.setBounds(i9, i10, i11, i12);
                return;
        }
    }

    public w3(String str) {
        this.f16234a = 6;
        this.f16235b = new nz0(str.substring(0, !str.isEmpty()), 14.0f, AndroidUtilities.bold());
    }

    private final void a(int i9) {
    }

    private final void b(int i9) {
    }

    private final void c(int i9) {
    }

    private final void d(int i9) {
    }

    private final void e(int i9) {
    }

    private final void f(int i9) {
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
