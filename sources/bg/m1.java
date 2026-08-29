package bg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import nh.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.zz0;
public final class m1 extends Drawable {
    public final int f2397a;
    public final Object f2398b;

    public m1(Object obj, int i10) {
        this.f2397a = i10;
        this.f2398b = obj;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f2397a) {
            case 0:
                canvas.save();
                Drawable drawable = (Drawable) this.f2398b;
                if (drawable.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                }
                drawable.draw(canvas);
                canvas.restore();
                return;
            case 1:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((f6) this.f2398b).draw(canvas);
                canvas.restore();
                return;
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f2398b;
                if (actionBarContainer.h) {
                    Drawable drawable2 = actionBarContainer.f949f;
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
                Drawable drawable4 = actionBarContainer.f948e;
                if (drawable4 != null && actionBarContainer.f950n) {
                    drawable4.draw(canvas);
                    return;
                }
                return;
            case 3:
                canvas.save();
                nh.t3 t3Var = (nh.t3) this.f2398b;
                canvas.drawPath(t3Var.f18605p0, t3Var.U);
                canvas.restore();
                return;
            case 4:
                cg.r1 r1Var = (cg.r1) this.f2398b;
                Rect bounds = getBounds();
                r1Var.getClass();
                r1Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, r1Var.f3319f);
                return;
            case 5:
                ImageReceiver imageReceiver = (ImageReceiver) this.f2398b;
                imageReceiver.setImageCoords(getBounds());
                imageReceiver.draw(canvas);
                return;
            case 6:
                Rect bounds2 = getBounds();
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), AndroidUtilities.dp(18.0f), ((Switch) this.f2398b).F);
                return;
            case 7:
                ((zz0) this.f2398b).c(getBounds().centerX() - (((zz0) this.f2398b).f35462c / 2.0f), getBounds().centerY(), 1.0f, g6.w0(null, g6.G6, false), canvas);
                return;
            default:
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                ph.p2 p2Var = (ph.p2) this.f2398b;
                p2Var.E0.setBounds(getBounds());
                p2Var.E0.draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f2397a) {
            case 1:
                return ((f6) this.f2398b).getHeight();
            case 5:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return AndroidUtilities.dp(20.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f2397a) {
            case 1:
                return ((f6) this.f2398b).getWidth();
            case 5:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return AndroidUtilities.dp(20.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f2397a) {
            case 0:
                return ((Drawable) this.f2398b).getOpacity();
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
                return 0;
            case 7:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f2397a) {
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f2398b;
                if (actionBarContainer.h) {
                    if (actionBarContainer.f949f != null) {
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
        switch (this.f2397a) {
            case 0:
                ((Drawable) this.f2398b).setAlpha(i10);
                return;
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                ((ImageReceiver) this.f2398b).setAlpha(i10 / 255.0f);
                return;
            case 6:
            case 7:
                return;
            default:
                ((ph.p2) this.f2398b).E0.setAlpha(i10);
                return;
        }
    }

    @Override
    public void setBounds(Rect rect) {
        switch (this.f2397a) {
            case 0:
                ((Drawable) this.f2398b).setBounds(rect);
                return;
            default:
                super.setBounds(rect);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f2397a) {
            case 0:
                ((Drawable) this.f2398b).setColorFilter(colorFilter);
                return;
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                ((ImageReceiver) this.f2398b).setColorFilter(colorFilter);
                return;
            case 6:
            case 7:
                return;
            default:
                ((ph.p2) this.f2398b).E0.setColorFilter(colorFilter);
                return;
        }
    }

    public m1(ActionBarContainer actionBarContainer) {
        this.f2397a = 2;
        this.f2398b = actionBarContainer;
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f2397a) {
            case 0:
                ((Drawable) this.f2398b).setBounds(i10, i11, i12, i13);
                return;
            default:
                super.setBounds(i10, i11, i12, i13);
                return;
        }
    }

    public m1(String str) {
        this.f2397a = 7;
        this.f2398b = new zz0(str.substring(0, !str.isEmpty()), 14.0f, AndroidUtilities.bold());
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
