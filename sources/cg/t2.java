package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
public final class t2 extends e5.c {
    public final Path h;
    public final w2 f3387n;

    public t2(w2 w2Var, Context context) {
        super(context);
        this.f3387n = w2Var;
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
        w2 w2Var = this.f3387n;
        if (w2Var.d) {
            AndroidUtilities.rectTmp.set(0.0f, -w2Var.I, getMeasuredWidth(), getMeasuredHeight());
        } else {
            AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + w2Var.I));
        }
        float dp = w2Var.I - AndroidUtilities.dp(3.0f);
        path.addRoundRect(AndroidUtilities.rectTmp, dp, dp, Path.Direction.CW);
    }
}
