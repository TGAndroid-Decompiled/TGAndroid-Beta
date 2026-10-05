package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wp;
public final class q2 extends View {
    public final int f1537a = 1;
    public final wp f1538b;

    public q2(Context context) {
        super(context);
        this.f1538b = new wp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f1537a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                wp wpVar = this.f1538b;
                wpVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                wpVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                wp wpVar2 = this.f1538b;
                wpVar2.setBounds(0, 0, width, height);
                wpVar2.setAlpha(255);
                wpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public q2(Activity activity) {
        super(activity);
        this.f1538b = new wp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20992m5, false));
    }
}
