package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class r extends ScrollView {
    public final LinearLayout f635a;
    public final f0 f636b;

    public r(f0 f0Var, Context context, LinearLayout linearLayout) {
        super(context);
        this.f636b = f0Var;
        this.f635a = linearLayout;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y8 = this.f635a.getY() + AndroidUtilities.dp(1.0f);
        int dp = AndroidUtilities.dp(36.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getMeasuredWidth() - dp) / 2.0f, y8, (getMeasuredWidth() + dp) / 2.0f, AndroidUtilities.dp(4.0f) + y8);
        g6.f23340t0.setColor(-10790053);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), g6.f23340t0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((LinearLayout.LayoutParams) this.f636b.f463b.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(24.0f)) * 0.8333333f) + AndroidUtilities.dp(88.0f));
    }
}
