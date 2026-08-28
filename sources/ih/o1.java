package ih;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jp;
public final class o1 extends View {
    public final int f11877a = 1;
    public final jp f11878b;

    public o1(Context context) {
        super(context);
        this.f11878b = new jp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f11877a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                jp jpVar = this.f11878b;
                jpVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                jpVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                jp jpVar2 = this.f11878b;
                jpVar2.setBounds(0, 0, width, height);
                jpVar2.setAlpha(255);
                jpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public o1(Activity activity) {
        super(activity);
        this.f11878b = new jp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23161m5, false));
    }
}
