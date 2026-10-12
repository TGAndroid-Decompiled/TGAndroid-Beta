package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lq;
public final class r2 extends View {
    public final int f1646a = 1;
    public final lq f1647b;

    public r2(Context context) {
        super(context);
        this.f1647b = new lq(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f1646a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                lq lqVar = this.f1647b;
                lqVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                lqVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                lq lqVar2 = this.f1647b;
                lqVar2.setBounds(0, 0, width, height);
                lqVar2.setAlpha(255);
                lqVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public r2(Activity activity) {
        super(activity);
        this.f1647b = new lq(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20724m5, false));
    }
}
