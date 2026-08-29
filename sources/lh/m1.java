package lh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.np;
public final class m1 extends View {
    public final int f15918a = 1;
    public final np f15919b;

    public m1(Context context) {
        super(context);
        this.f15919b = new np(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f15918a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                np npVar = this.f15919b;
                npVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                npVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                np npVar2 = this.f15919b;
                npVar2.setBounds(0, 0, width, height);
                npVar2.setAlpha(255);
                npVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public m1(Activity activity) {
        super(activity);
        this.f15919b = new np(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23222m5, false));
    }
}
