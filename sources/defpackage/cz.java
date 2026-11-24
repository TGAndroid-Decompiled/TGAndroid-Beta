package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TextView;
public final class cz extends rqa {
    public final Path H0;
    public final float[] I0;
    public final ez J0;

    public cz(ez ezVar, Context context, wjb wjbVar, uy uyVar, x00 x00Var, x00 x00Var2, x00 x00Var3, x00 x00Var4, x00 x00Var5, x00 x00Var6) {
        super(context, wjbVar, uyVar, x00Var, null, x00Var2, x00Var3, x00Var4, x00Var5, x00Var6);
        this.J0 = ezVar;
        this.H0 = new Path();
        this.I0 = new float[8];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.H0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final int getFinalHeight() {
        return gl.L(288.0f);
    }

    @Override
    public final float getRealHeight() {
        return gl.L(288.0f);
    }

    @Override
    public final void k(int i) {
        TextView textView = this.J0.W1;
        if (textView != null && bkb.F1(textView.getBackground(), i, false)) {
            textView.invalidate();
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float L = gl.L(12.0f);
        float[] fArr = this.I0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.H0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i, i2, this.I0, Path.Direction.CW);
    }
}
