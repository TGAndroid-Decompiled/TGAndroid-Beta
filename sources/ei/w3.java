package ei;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.d11;
public final class w3 extends Drawable {
    public final int f10038a;
    public final Object f10039b;

    public w3(Object obj, int i10) {
        this.f10038a = i10;
        this.f10039b = obj;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f10038a) {
            case 0:
                canvas.save();
                x3 x3Var = (x3) this.f10039b;
                canvas.drawPath(x3Var.f10091t0, x3Var.f10069b0);
                canvas.restore();
                return;
            case 1:
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                gi.d3 d3Var = (gi.d3) this.f10039b;
                d3Var.I0.setBounds(getBounds());
                d3Var.I0.draw(canvas);
                canvas.restore();
                return;
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f10039b;
                if (actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.f2736f;
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
                if (drawable3 != null && actionBarContainer.f2737n) {
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 3:
                sg.a1 a1Var = (sg.a1) this.f10039b;
                Rect bounds = getBounds();
                a1Var.getClass();
                a1Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, a1Var.f46184f);
                return;
            case 4:
                ImageReceiver imageReceiver = (ImageReceiver) this.f10039b;
                imageReceiver.setImageCoords(getBounds());
                imageReceiver.draw(canvas);
                return;
            case 5:
                ((d11) this.f10039b).c(getBounds().centerX() - (((d11) this.f10039b).f25437c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), canvas);
                return;
            case 6:
                canvas.save();
                Drawable drawable4 = (Drawable) this.f10039b;
                if (drawable4.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, drawable4.getBounds().centerX(), drawable4.getBounds().centerY());
                }
                drawable4.draw(canvas);
                canvas.restore();
                return;
            default:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((r6) this.f10039b).draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f10038a) {
            case 1:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 7:
                return ((r6) this.f10039b).getHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f10038a) {
            case 1:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 7:
                return ((r6) this.f10039b).getWidth();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f10038a) {
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
                return ((Drawable) this.f10039b).getOpacity();
            default:
                return -2;
        }
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f10038a) {
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f10039b;
                if (actionBarContainer.h) {
                    if (actionBarContainer.f2736f != null) {
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
        switch (this.f10038a) {
            case 0:
                return;
            case 1:
                ((gi.d3) this.f10039b).I0.setAlpha(i10);
                return;
            case 2:
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f10039b).setAlpha(i10 / 255.0f);
                return;
            case 5:
                return;
            case 6:
                ((Drawable) this.f10039b).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public void setBounds(Rect rect) {
        switch (this.f10038a) {
            case 6:
                ((Drawable) this.f10039b).setBounds(rect);
                return;
            default:
                super.setBounds(rect);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f10038a) {
            case 0:
                return;
            case 1:
                ((gi.d3) this.f10039b).I0.setColorFilter(colorFilter);
                return;
            case 2:
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f10039b).setColorFilter(colorFilter);
                return;
            case 5:
                return;
            case 6:
                ((Drawable) this.f10039b).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public w3(ActionBarContainer actionBarContainer) {
        this.f10038a = 2;
        this.f10039b = actionBarContainer;
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f10038a) {
            case 6:
                ((Drawable) this.f10039b).setBounds(i10, i11, i12, i13);
                return;
            default:
                super.setBounds(i10, i11, i12, i13);
                return;
        }
    }

    public w3(String str) {
        this.f10038a = 5;
        this.f10039b = new d11(str.substring(0, !str.isEmpty()), 14.0f, AndroidUtilities.bold());
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
