package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vp;
public final class q2 extends View {
    public final int f1414a = 1;
    public final vp f1415b;

    public q2(Context context) {
        super(context);
        this.f1415b = new vp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f1414a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                vp vpVar = this.f1415b;
                vpVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                vpVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                vp vpVar2 = this.f1415b;
                vpVar2.setBounds(0, 0, width, height);
                vpVar2.setAlpha(255);
                vpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public q2(Activity activity) {
        super(activity);
        this.f1415b = new vp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19222m5, false));
    }
}
