package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.ActionBar.d;
public final class nt3 extends t14 {
    public int V2;
    public boolean W2;
    public boolean X2;
    public final rt3 Y2;

    public nt3(rt3 rt3Var, d dVar, boolean z, Context context, boolean z2, boolean z3, wjb wjbVar, boolean z4) {
        super(dVar, z, false, false, context, z2, null, null, z3, wjbVar, false, z4);
        this.Y2 = rt3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        rt3 rt3Var = this.Y2;
        int i = rt3Var.M;
        if (i == 2 || i == 3) {
            rt3Var.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        rt3 rt3Var = this.Y2;
        if (rt3Var.b()) {
            int i6 = i4 - i2;
            if (!this.W2 && rt3Var.y) {
                this.X2 = true;
            }
            if (this.X2 && (i5 = this.V2) > 0 && i6 > 0 && i6 != i5) {
                setTranslationY(i6 - i5);
                ug8.t(animate().translationY(0.0f), gb.w, 250L);
                this.X2 = false;
            }
            this.W2 = rt3Var.y;
            this.V2 = i6;
        }
    }
}
