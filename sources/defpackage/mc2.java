package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mc2 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final byte U;
    public Object V;

    public mc2(fu5 fu5Var, Context context, vnb vnbVar, int i) {
        super(2131232583, i, vnbVar, context);
        this.U = (byte) 2;
        this.V = fu5Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.U) {
            case 0:
                canvas.save();
                Path path = (Path) this.V;
                path.rewind();
                RectF rectF = hl.P;
                rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path.addRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            case 1:
                canvas.save();
                Path path2 = (Path) this.V;
                path2.rewind();
                RectF rectF2 = hl.P;
                rectF2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path2.addRoundRect(rectF2, hl.L(6.0f), hl.L(6.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        switch (this.U) {
            case 2:
                fu5 fu5Var = (fu5) this.V;
                if (this == fu5Var.A && (i3 = fu5Var.d0) > 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2));
                }
                super.onMeasure(i, i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    public mc2(Context context, int i, vnb vnbVar, int i2, byte b) {
        super(i, i2, vnbVar, context);
        this.U = b;
    }
}
