package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class z2 extends FrameLayout {

    public final int f14184a;

    public final e4 f14185b;

    public z2(e4 e4Var, Context context, int i10) {
        super(context);
        this.f14184a = i10;
        this.f14185b = e4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x8;
        switch (this.f14184a) {
            case 0:
                e4 e4Var = this.f14185b;
                if (e4Var.B2.getVisibility() == 0 && e4Var.B2.getLayoutParams().width != (x8 = (int) (((e4Var.f13288w2.getX() + e4Var.f13288w2.getMeasuredWidth()) - e4Var.B2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    e4Var.B2.getLayoutParams().width = x8;
                    e4Var.B2.invalidate();
                    e4Var.B2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                e4 e4Var2 = this.f14185b;
                if (e4Var2.f13299z1 && e4Var2.N0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - e4Var2.N0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float fD = e4Var2.P0.d(e4Var2.R0 ? 1.0f : 0.0f, false);
                    canvas.scale(fD, fD, e4Var2.N0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.i6 i6Var = e4Var2.N0;
                    i6Var.f29257w = 255;
                    i6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                e4 e4Var3 = this.f14185b;
                if (e4Var3.f13299z1 && e4Var3.M0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - e4Var3.M0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float fD2 = e4Var3.O0.d(e4Var3.Q0 ? 1.0f : 0.0f, false);
                    canvas.scale(fD2, fD2, e4Var3.M0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.i6 i6Var2 = e4Var3.M0;
                    i6Var2.f29257w = 255;
                    i6Var2.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f14184a) {
            case 1:
                return drawable == this.f14185b.N0 || super.verifyDrawable(drawable);
            case 2:
                return drawable == this.f14185b.M0 || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
