package ci;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dq;
public final class s1 extends View {
    public final int f5904a = 1;
    public final dq f5905b;

    public s1(Context context) {
        super(context);
        this.f5905b = new dq(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f5904a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                dq dqVar = this.f5905b;
                dqVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                dqVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                dq dqVar2 = this.f5905b;
                dqVar2.setBounds(0, 0, width, height);
                dqVar2.setAlpha(255);
                dqVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public s1(Activity activity) {
        super(activity);
        this.f5905b = new dq(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21148m5, false));
    }
}
