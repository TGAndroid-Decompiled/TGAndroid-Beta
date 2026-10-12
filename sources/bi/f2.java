package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gq;
public final class f2 extends View {
    public final int f3011a = 1;
    public final gq f3012b;

    public f2(Context context) {
        super(context);
        this.f3012b = new gq(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f3011a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                gq gqVar = this.f3012b;
                gqVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                gqVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                gq gqVar2 = this.f3012b;
                gqVar2.setBounds(0, 0, width, height);
                gqVar2.setAlpha(255);
                gqVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public f2(Activity activity) {
        super(activity);
        this.f3012b = new gq(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20063m5, false));
    }
}
