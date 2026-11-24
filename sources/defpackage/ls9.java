package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class ls9 extends FrameLayout implements tjb {
    public final Path a;
    public il0 b;

    public ls9(Activity activity) {
        super(activity);
        this.a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(gl.L(9.0f), gl.L(9.0f), i - gl.L(9.0f), i2 - gl.L(9.0f), gl.L(16.0f), gl.L(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(il0 il0Var) {
        this.b = il0Var;
        setBackground(il0Var);
    }

    @Override
    public final void updateColors() {
        il0 il0Var = this.b;
        if (il0Var != null) {
            il0Var.updateColors();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
