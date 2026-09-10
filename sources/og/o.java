package og;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class o extends ScrollView {
    public final LinearLayout f14436a;
    public final a0 f14437b;

    public o(a0 a0Var, Context context, LinearLayout linearLayout) {
        super(context);
        this.f14437b = a0Var;
        this.f14436a = linearLayout;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y3 = this.f14436a.getY() + AndroidUtilities.dp(1.0f);
        int dp = AndroidUtilities.dp(36.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getMeasuredWidth() - dp) / 2.0f, y3, (getMeasuredWidth() + dp) / 2.0f, AndroidUtilities.dp(4.0f) + y3);
        j6.f18212t0.setColor(-10790053);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), j6.f18212t0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((LinearLayout.LayoutParams) this.f14437b.f14317b.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(24.0f)) * 0.8333333f) + AndroidUtilities.dp(88.0f));
    }
}
