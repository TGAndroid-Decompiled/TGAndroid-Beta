package nh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rp;
public final class n1 extends View {
    public final int f15653a = 1;
    public final rp f15654b;

    public n1(Context context) {
        super(context);
        this.f15654b = new rp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f15653a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                rp rpVar = this.f15654b;
                rpVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                rpVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                rp rpVar2 = this.f15654b;
                rpVar2.setBounds(0, 0, width, height);
                rpVar2.setAlpha(255);
                rpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public n1(Activity activity) {
        super(activity);
        this.f15654b = new rp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20066m5, false));
    }
}
