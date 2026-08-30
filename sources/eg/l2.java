package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import lh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Components.jj0;
public final class l2 extends o8 {
    public final wa N;
    public final int O;
    public final ef.e P;

    public l2(Context context, int i10, f6 f6Var) {
        super(context, f6Var);
        int i11;
        this.N = new wa(1, 15);
        this.P = new ef.e(this, 5);
        if (i10 == 1) {
            i11 = j6.fk;
        } else {
            i11 = j6.Mj;
        }
        this.O = i11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        ef.e eVar = this.P;
        if (isEnabled) {
            wa waVar = this.N;
            waVar.d();
            waVar.a(canvas, j6.w0(null, this.O, false));
            lf.j.d().a(15, eVar);
        } else {
            lf.j.d().f(eVar);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lf.j.d().f(this.P);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        jj0 jj0Var = this.e;
        float width = (jj0Var.getWidth() / 2.0f) + jj0Var.getX();
        float y10 = jj0Var.getY();
        float height = ((jj0Var.getHeight() / 2.0f) + (y10 + jj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.N.g(rectF);
    }
}
