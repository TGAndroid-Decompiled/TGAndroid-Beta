package ci;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dq;
public final class t1 extends View {
    public final int f6002a = 1;
    public final dq f6003b;

    public t1(Context context) {
        super(context);
        this.f6003b = new dq(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f6002a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                dq dqVar = this.f6003b;
                dqVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                dqVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                dq dqVar2 = this.f6003b;
                dqVar2.setBounds(0, 0, width, height);
                dqVar2.setAlpha(255);
                dqVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public t1(Activity activity) {
        super(activity);
        this.f6003b = new dq(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21148m5, false));
    }
}
