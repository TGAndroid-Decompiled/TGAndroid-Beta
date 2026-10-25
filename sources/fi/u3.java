package fi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.q11;
public final class u3 extends Drawable {
    public final int f11747a;
    public Object f11748b;

    public u3() {
        this.f11747a = 3;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f11747a) {
            case 0:
                canvas.save();
                v3 v3Var = (v3) this.f11748b;
                canvas.drawPath(v3Var.f11808t0, v3Var.f11786b0);
                canvas.restore();
                return;
            case 1:
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                hi.m3 m3Var = (hi.m3) this.f11748b;
                m3Var.M0.setBounds(getBounds());
                m3Var.M0.draw(canvas);
                canvas.restore();
                return;
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f11748b;
                if (actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.f2185f;
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
                if (drawable3 != null && actionBarContainer.f2186n) {
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 3:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - AndroidUtilities.dp(1.0f), (getBounds().width() - AndroidUtilities.dp(8.0f)) / 2.0f, (Paint) this.f11748b);
                return;
            case 4:
                tg.a1 a1Var = (tg.a1) this.f11748b;
                Rect bounds = getBounds();
                a1Var.getClass();
                a1Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, a1Var.f48794f);
                return;
            case 5:
                ImageReceiver imageReceiver = (ImageReceiver) this.f11748b;
                imageReceiver.setImageCoords(getBounds());
                imageReceiver.draw(canvas);
                return;
            case 6:
                ((q11) this.f11748b).c(getBounds().centerX() - (((q11) this.f11748b).f31788c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false), canvas);
                return;
            case 7:
                canvas.save();
                Drawable drawable4 = (Drawable) this.f11748b;
                if (drawable4.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, drawable4.getBounds().centerX(), drawable4.getBounds().centerY());
                }
                drawable4.draw(canvas);
                canvas.restore();
                return;
            default:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((o6) this.f11748b).draw(canvas);
                canvas.restore();
                return;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f11747a) {
            case 1:
                return AndroidUtilities.dp(20.0f);
            case 5:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((o6) this.f11748b).getHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f11747a) {
            case 1:
                return AndroidUtilities.dp(20.0f);
            case 5:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((o6) this.f11748b).getWidth();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f11747a) {
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
                return ((Drawable) this.f11748b).getOpacity();
            default:
                return -2;
        }
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f11747a) {
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f11748b;
                if (actionBarContainer.h) {
                    if (actionBarContainer.f2185f != null) {
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
        switch (this.f11747a) {
            case 0:
                return;
            case 1:
                ((hi.m3) this.f11748b).M0.setAlpha(i10);
                return;
            case 2:
                return;
            case 3:
                ((Paint) this.f11748b).setAlpha(i10);
                return;
            case 4:
                return;
            case 5:
                ((ImageReceiver) this.f11748b).setAlpha(i10 / 255.0f);
                return;
            case 6:
                return;
            case 7:
                ((Drawable) this.f11748b).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public void setBounds(Rect rect) {
        switch (this.f11747a) {
            case 7:
                ((Drawable) this.f11748b).setBounds(rect);
                return;
            default:
                super.setBounds(rect);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f11747a) {
            case 0:
                return;
            case 1:
                ((hi.m3) this.f11748b).M0.setColorFilter(colorFilter);
                return;
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                ((ImageReceiver) this.f11748b).setColorFilter(colorFilter);
                return;
            case 6:
                return;
            case 7:
                ((Drawable) this.f11748b).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public u3(Object obj, int i10) {
        this.f11747a = i10;
        this.f11748b = obj;
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f11747a) {
            case 7:
                ((Drawable) this.f11748b).setBounds(i10, i11, i12, i13);
                return;
            default:
                super.setBounds(i10, i11, i12, i13);
                return;
        }
    }

    public u3(ActionBarContainer actionBarContainer) {
        this.f11747a = 2;
        this.f11748b = actionBarContainer;
    }

    public u3(String str) {
        this.f11747a = 6;
        this.f11748b = new q11(str.substring(0, !str.isEmpty()), 14.0f, AndroidUtilities.bold());
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

    private final void k(ColorFilter colorFilter) {
    }
}
