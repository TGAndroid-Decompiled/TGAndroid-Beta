package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class q extends ScrollView {
    public final LinearLayout f2502a;
    public final e0 f2503b;

    public q(e0 e0Var, Context context, LinearLayout linearLayout) {
        super(context);
        this.f2503b = e0Var;
        this.f2502a = linearLayout;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y10 = this.f2502a.getY() + AndroidUtilities.dp(1.0f);
        int dp = AndroidUtilities.dp(36.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getMeasuredWidth() - dp) / 2.0f, y10, (getMeasuredWidth() + dp) / 2.0f, AndroidUtilities.dp(4.0f) + y10);
        j6.f20185t0.setColor(-10790053);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), j6.f20185t0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((LinearLayout.LayoutParams) this.f2503b.f2360b.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(24.0f)) * 0.8333333f) + AndroidUtilities.dp(88.0f));
    }
}
