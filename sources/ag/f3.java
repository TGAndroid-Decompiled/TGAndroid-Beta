package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import hh.bb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.ri0;

public final class f3 extends l8 {
    public final bb M;
    public final int N;
    public final af.e O;

    public f3(Context context, int i10, c6 c6Var) {
        super(context, c6Var);
        this.M = new bb(1, 15);
        this.O = new af.e(this, 5);
        this.N = i10 == 1 ? g6.fk : g6.Mj;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean zIsEnabled = LiteMode.isEnabled(131072);
        af.e eVar = this.O;
        if (zIsEnabled) {
            bb bbVar = this.M;
            bbVar.d();
            bbVar.a(canvas, g6.w0(null, this.N, false));
            gf.k.d().a(15, eVar);
        } else {
            gf.k.d().g(eVar);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gf.k.d().g(this.O);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ri0 ri0Var = this.f24631e;
        float width = (ri0Var.getWidth() / 2.0f) + ri0Var.getX();
        float height = ((ri0Var.getHeight() / 2.0f) + (ri0Var.getY() + ri0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.M.g(rectF);
    }
}
