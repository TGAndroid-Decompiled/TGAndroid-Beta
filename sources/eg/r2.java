package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.o4;
public final class r2 extends o4 {
    public final Path h;
    public final u2 f5488n;

    public r2(u2 u2Var, Context context) {
        super(context);
        this.f5488n = u2Var;
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
        u2 u2Var = this.f5488n;
        if (u2Var.d) {
            AndroidUtilities.rectTmp.set(0.0f, -u2Var.J, getMeasuredWidth(), getMeasuredHeight());
        } else {
            AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + u2Var.J));
        }
        float dp = u2Var.J - AndroidUtilities.dp(3.0f);
        path.addRoundRect(AndroidUtilities.rectTmp, dp, dp, Path.Direction.CW);
    }
}
