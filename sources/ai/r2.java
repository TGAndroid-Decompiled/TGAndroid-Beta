package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jq;
public final class r2 extends View {
    public final int f1648a = 1;
    public final jq f1649b;

    public r2(Context context) {
        super(context);
        this.f1649b = new jq(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f1648a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                jq jqVar = this.f1649b;
                jqVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                jqVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                jq jqVar2 = this.f1649b;
                jqVar2.setBounds(0, 0, width, height);
                jqVar2.setAlpha(255);
                jqVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public r2(Activity activity) {
        super(activity);
        this.f1649b = new jq(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20950m5, false));
    }
}
