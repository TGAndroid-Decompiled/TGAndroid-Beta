package fg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import mh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Components.lj0;
public final class k2 extends o8 {
    public final wa N;
    public final int O;
    public final eh.m P;

    public k2(Context context, int i10, g6 g6Var) {
        super(context, g6Var);
        int i11;
        this.N = new wa(1, 15);
        this.P = new eh.m(this, 8);
        if (i10 == 1) {
            i11 = k6.fk;
        } else {
            i11 = k6.Mj;
        }
        this.O = i11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        eh.m mVar = this.P;
        if (isEnabled) {
            wa waVar = this.N;
            waVar.d();
            waVar.a(canvas, k6.w0(null, this.O, false));
            lf.j.d().a(15, mVar);
        } else {
            lf.j.d().f(mVar);
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
        lj0 lj0Var = this.f23313e;
        float width = (lj0Var.getWidth() / 2.0f) + lj0Var.getX();
        float y10 = lj0Var.getY();
        float height = ((lj0Var.getHeight() / 2.0f) + (y10 + lj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.N.g(rectF);
    }
}
