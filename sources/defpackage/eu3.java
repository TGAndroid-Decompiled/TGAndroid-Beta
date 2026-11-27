package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.ActionBar.e;
public final class eu3 extends o24 {
    public int V2;
    public boolean W2;
    public boolean X2;
    public final iu3 Y2;

    public eu3(iu3 iu3Var, e eVar, boolean z, Context context, boolean z2, boolean z3, vnb vnbVar, boolean z4) {
        super(eVar, z, false, false, context, z2, null, null, z3, vnbVar, false, z4);
        this.Y2 = iu3Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        iu3 iu3Var = this.Y2;
        int i = iu3Var.M;
        if (i == 2 || i == 3) {
            iu3Var.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        iu3 iu3Var = this.Y2;
        if (iu3Var.b()) {
            int i6 = i4 - i2;
            if (!this.W2 && iu3Var.y) {
                this.X2 = true;
            }
            if (this.X2 && (i5 = this.V2) > 0 && i6 > 0 && i6 != i5) {
                setTranslationY(i6 - i5);
                ik8.t(animate().translationY(0.0f), hb.w, 250L);
                this.X2 = false;
            }
            this.W2 = iu3Var.y;
            this.V2 = i6;
        }
    }
}
