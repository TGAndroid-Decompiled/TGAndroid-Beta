package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sp;
public final class e2 extends View {
    public final int f2931a = 1;
    public final sp f2932b;

    public e2(Context context) {
        super(context);
        this.f2932b = new sp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f2931a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                sp spVar = this.f2932b;
                spVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                spVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                sp spVar2 = this.f2932b;
                spVar2.setBounds(0, 0, width, height);
                spVar2.setAlpha(255);
                spVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public e2(Activity activity) {
        super(activity);
        this.f2932b = new sp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20853m5, false));
    }
}
