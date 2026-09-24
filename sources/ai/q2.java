package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.up;
public final class q2 extends View {
    public final int f1414a = 1;
    public final up f1415b;

    public q2(Context context) {
        super(context);
        this.f1415b = new up(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f1414a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                up upVar = this.f1415b;
                upVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                upVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                up upVar2 = this.f1415b;
                upVar2.setBounds(0, 0, width, height);
                upVar2.setAlpha(255);
                upVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public q2(Activity activity) {
        super(activity);
        this.f1415b = new up(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19208m5, false));
    }
}
