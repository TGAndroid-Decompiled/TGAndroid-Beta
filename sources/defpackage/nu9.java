package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class nu9 extends FrameLayout implements vlb {
    public final Path a;
    public im0 b;

    public nu9(Activity activity) {
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
        path.addRoundRect(gm.L(9.0f), gm.L(9.0f), i - gm.L(9.0f), i2 - gm.L(9.0f), gm.L(16.0f), gm.L(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(im0 im0Var) {
        this.b = im0Var;
        setBackground(im0Var);
    }

    @Override
    public final void updateColors() {
        im0 im0Var = this.b;
        if (im0Var != null) {
            im0Var.updateColors();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
