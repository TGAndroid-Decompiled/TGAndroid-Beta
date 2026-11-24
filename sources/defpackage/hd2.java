package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class hd2 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final byte U;
    public Object V;

    public hd2(bu5 bu5Var, Context context, ylb ylbVar, int i) {
        super(2131232584, i, ylbVar, context);
        this.U = (byte) 2;
        this.V = bu5Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.U) {
            case 0:
                canvas.save();
                Path path = (Path) this.V;
                path.rewind();
                RectF rectF = gm.P;
                rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path.addRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            case 1:
                canvas.save();
                Path path2 = (Path) this.V;
                path2.rewind();
                RectF rectF2 = gm.P;
                rectF2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path2.addRoundRect(rectF2, gm.L(6.0f), gm.L(6.0f), Path.Direction.CW);
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
                bu5 bu5Var = (bu5) this.V;
                if (this == bu5Var.A && (i3 = bu5Var.a0) > 0) {
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2));
                }
                super.onMeasure(i, i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    public hd2(Context context, int i, ylb ylbVar, int i2, byte b) {
        super(i, i2, ylbVar, context);
        this.U = b;
    }
}
