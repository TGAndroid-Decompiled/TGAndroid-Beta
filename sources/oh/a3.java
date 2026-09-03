package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a3 extends FrameLayout {
    public final int f16842a;
    public final f4 f16843b;

    public a3(f4 f4Var, Context context, int i10) {
        super(context);
        this.f16842a = i10;
        this.f16843b = f4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f16842a) {
            case 0:
                f4 f4Var = this.f16843b;
                if (f4Var.C2.getVisibility() == 0 && f4Var.C2.getLayoutParams().width != (x10 = (int) (((f4Var.f17127x2.getX() + f4Var.f17127x2.getMeasuredWidth()) - f4Var.C2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    f4Var.C2.getLayoutParams().width = x10;
                    f4Var.C2.invalidate();
                    f4Var.C2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                f4 f4Var2 = this.f16843b;
                if (f4Var2.A1 && f4Var2.O0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - f4Var2.O0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.z5 z5Var = f4Var2.Q0;
                    if (f4Var2.S0) {
                        f10 = 1.0f;
                    }
                    float d = z5Var.d(f10, false);
                    canvas.scale(d, d, f4Var2.O0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.j6 j6Var = f4Var2.O0;
                    j6Var.f28017w = 255;
                    j6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                f4 f4Var3 = this.f16843b;
                if (f4Var3.A1 && f4Var3.N0 != null) {
                    canvas.save();
                    float f11 = 0.0f;
                    canvas.translate((getMeasuredWidth() - f4Var3.N0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    org.telegram.ui.Components.z5 z5Var2 = f4Var3.P0;
                    if (f4Var3.R0) {
                        f11 = 1.0f;
                    }
                    float d10 = z5Var2.d(f11, false);
                    canvas.scale(d10, d10, f4Var3.N0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.j6 j6Var2 = f4Var3.N0;
                    j6Var2.f28017w = 255;
                    j6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f16842a) {
            case 1:
                if (drawable != this.f16843b.O0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f16843b.N0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
