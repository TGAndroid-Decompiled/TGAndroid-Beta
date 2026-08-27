package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;

public final class m3 extends c5.c {
    public final Path h;

    public final p3 f562n;

    public m3(p3 p3Var, Context context) {
        super(context);
        this.f562n = p3Var;
        this.h = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.h);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Path path = this.h;
        path.reset();
        p3 p3Var = this.f562n;
        if (p3Var.d) {
            AndroidUtilities.rectTmp.set(0.0f, -p3Var.I, getMeasuredWidth(), getMeasuredHeight());
        } else {
            AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + p3Var.I));
        }
        float fDp = p3Var.I - AndroidUtilities.dp(3.0f);
        path.addRoundRect(AndroidUtilities.rectTmp, fDp, fDp, Path.Direction.CW);
    }
}
