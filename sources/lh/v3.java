package lh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.pz0;

public final class v3 extends Drawable {

    public final int f16936a;

    public final Object f16937b;

    public v3(Object obj, int i10) {
        this.f16936a = i10;
        this.f16937b = obj;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f16936a) {
            case 0:
                canvas.save();
                w3 w3Var = (w3) this.f16937b;
                canvas.drawPath(w3Var.f16992p0, w3Var.U);
                canvas.restore();
                break;
            case 1:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f16937b;
                if (actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.f962f;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    break;
                } else {
                    Drawable drawable2 = actionBarContainer.d;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.f961e;
                    if (drawable3 != null && actionBarContainer.f963n) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
            case 2:
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                nh.b3 b3Var = (nh.b3) this.f16937b;
                b3Var.E0.setBounds(getBounds());
                b3Var.E0.draw(canvas);
                canvas.restore();
                break;
            case 3:
                ag.i2 i2Var = (ag.i2) this.f16937b;
                Rect bounds = getBounds();
                i2Var.getClass();
                i2Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, i2Var.f458f);
                break;
            case 4:
                ImageReceiver imageReceiver = (ImageReceiver) this.f16937b;
                imageReceiver.setImageCoords(getBounds());
                imageReceiver.draw(canvas);
                break;
            case 5:
                Rect bounds2 = getBounds();
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), AndroidUtilities.dp(18.0f), ((Switch) this.f16937b).F);
                break;
            case 6:
                ((pz0) this.f16937b).c(getBounds().centerX() - (((pz0) this.f16937b).f31697c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), canvas);
                break;
            case 7:
                canvas.save();
                Drawable drawable4 = (Drawable) this.f16937b;
                if (drawable4.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, drawable4.getBounds().centerX(), drawable4.getBounds().centerY());
                }
                drawable4.draw(canvas);
                canvas.restore();
                break;
            default:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((q6) this.f16937b).draw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f16936a) {
            case 2:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((q6) this.f16937b).getHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f16936a) {
            case 2:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((q6) this.f16937b).getWidth();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f16936a) {
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
                return ((Drawable) this.f16937b).getOpacity();
            default:
                return -2;
        }
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f16936a) {
            case 1:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f16937b;
                if (!actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.d;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                    }
                } else if (actionBarContainer.f962f != null) {
                    actionBarContainer.d.getOutline(outline);
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f16936a) {
            case 2:
                ((nh.b3) this.f16937b).E0.setAlpha(i10);
                break;
            case 4:
                ((ImageReceiver) this.f16937b).setAlpha(i10 / 255.0f);
                break;
            case 7:
                ((Drawable) this.f16937b).setAlpha(i10);
                break;
        }
    }

    @Override
    public void setBounds(Rect rect) {
        switch (this.f16936a) {
            case 7:
                ((Drawable) this.f16937b).setBounds(rect);
                break;
            default:
                super.setBounds(rect);
                break;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f16936a) {
            case 2:
                ((nh.b3) this.f16937b).E0.setColorFilter(colorFilter);
                break;
            case 4:
                ((ImageReceiver) this.f16937b).setColorFilter(colorFilter);
                break;
            case 7:
                ((Drawable) this.f16937b).setColorFilter(colorFilter);
                break;
        }
    }

    public v3(ActionBarContainer actionBarContainer) {
        this.f16936a = 1;
        this.f16937b = actionBarContainer;
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f16936a) {
            case 7:
                ((Drawable) this.f16937b).setBounds(i10, i11, i12, i13);
                break;
            default:
                super.setBounds(i10, i11, i12, i13);
                break;
        }
    }

    public v3(String str) {
        this.f16936a = 6;
        this.f16937b = new pz0(str.substring(0, !str.isEmpty() ? 1 : 0), 14.0f, AndroidUtilities.bold());
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
