package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class wb2 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final byte U;
    public Object V;

    public wb2(cs5 cs5Var, Context context, wjb wjbVar, int i) {
        super(2131232572, i, wjbVar, context);
        this.U = (byte) 2;
        this.V = cs5Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.U) {
            case 0:
                canvas.save();
                Path path = (Path) this.V;
                path.rewind();
                RectF rectF = gl.P;
                rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path.addRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            case 1:
                canvas.save();
                Path path2 = (Path) this.V;
                path2.rewind();
                RectF rectF2 = gl.P;
                rectF2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path2.addRoundRect(rectF2, gl.L(6.0f), gl.L(6.0f), Path.Direction.CW);
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
                cs5 cs5Var = (cs5) this.V;
                if (this == cs5Var.A && (i3 = cs5Var.a0) > 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2));
                }
                super.onMeasure(i, i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    public wb2(Context context, int i, wjb wjbVar, int i2, byte b) {
        super(i, i2, wjbVar, context);
        this.U = b;
    }
}
