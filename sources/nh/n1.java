package nh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qp;
public final class n1 extends View {
    public final int f15633a = 1;
    public final qp f15634b;

    public n1(Context context) {
        super(context);
        this.f15634b = new qp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f15633a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                qp qpVar = this.f15634b;
                qpVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                qpVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                qp qpVar2 = this.f15634b;
                qpVar2.setBounds(0, 0, width, height);
                qpVar2.setAlpha(255);
                qpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public n1(Activity activity) {
        super(activity);
        this.f15634b = new qp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20041m5, false));
    }
}
