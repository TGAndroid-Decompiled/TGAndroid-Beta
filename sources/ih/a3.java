package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a3 extends FrameLayout {
    public final int f11216a;
    public final i4 f11217b;

    public a3(i4 i4Var, Context context, int i9) {
        super(context);
        this.f11216a = i9;
        this.f11217b = i4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f11216a) {
            case 0:
                i4 i4Var = this.f11217b;
                if (i4Var.B2.getVisibility() == 0 && i4Var.B2.getLayoutParams().width != (x10 = (int) (((i4Var.f11601w2.getX() + i4Var.f11601w2.getMeasuredWidth()) - i4Var.B2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    i4Var.B2.getLayoutParams().width = x10;
                    i4Var.B2.invalidate();
                    i4Var.B2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                i4 i4Var2 = this.f11217b;
                if (i4Var2.f11612z1 && i4Var2.N0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - i4Var2.N0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.y5 y5Var = i4Var2.P0;
                    if (i4Var2.R0) {
                        f10 = 1.0f;
                    }
                    float d = y5Var.d(f10, false);
                    canvas.scale(d, d, i4Var2.N0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.i6 i6Var = i4Var2.N0;
                    i6Var.f29351w = 255;
                    i6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                i4 i4Var3 = this.f11217b;
                if (i4Var3.f11612z1 && i4Var3.M0 != null) {
                    canvas.save();
                    float f11 = 0.0f;
                    canvas.translate((getMeasuredWidth() - i4Var3.M0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.y5 y5Var2 = i4Var3.O0;
                    if (i4Var3.Q0) {
                        f11 = 1.0f;
                    }
                    float d9 = y5Var2.d(f11, false);
                    canvas.scale(d9, d9, i4Var3.M0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.i6 i6Var2 = i4Var3.M0;
                    i6Var2.f29351w = 255;
                    i6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f11216a) {
            case 1:
                if (drawable != this.f11217b.N0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f11217b.M0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
