package ci;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cq;
public final class s1 extends View {
    public final int f5909a = 1;
    public final cq f5910b;

    public s1(Context context) {
        super(context);
        this.f5910b = new cq(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f5909a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                cq cqVar = this.f5910b;
                cqVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                cqVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                cq cqVar2 = this.f5910b;
                cqVar2.setBounds(0, 0, width, height);
                cqVar2.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21346m5, false));
                cqVar2.setAlpha(255);
                cqVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public s1(Activity activity) {
        super(activity);
        this.f5910b = new cq(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21346m5, false));
    }
}
