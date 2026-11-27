package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class ew9 extends FrameLayout implements snb {
    public final Path a;
    public jl0 b;

    public ew9(Activity activity) {
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
        path.addRoundRect(hl.L(9.0f), hl.L(9.0f), i - hl.L(9.0f), i2 - hl.L(9.0f), hl.L(16.0f), hl.L(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(jl0 jl0Var) {
        this.b = jl0Var;
        setBackground(jl0Var);
    }

    @Override
    public final void updateColors() {
        jl0 jl0Var = this.b;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
