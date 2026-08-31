package oh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tp;
public final class n1 extends View {
    public final int f17477a = 1;
    public final tp f17478b;

    public n1(Context context) {
        super(context);
        this.f17478b = new tp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f17477a) {
            case 0:
                int dp = AndroidUtilities.dp(1.0f);
                tp tpVar = this.f17478b;
                tpVar.setBounds(dp, dp, (getWidth() - dp) - dp, (getHeight() - dp) - dp);
                tpVar.draw(canvas);
                invalidate();
                return;
            default:
                int width = getWidth();
                int height = getHeight();
                tp tpVar2 = this.f17478b;
                tpVar2.setBounds(0, 0, width, height);
                tpVar2.setAlpha(255);
                tpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
        }
    }

    public n1(Activity activity) {
        super(activity);
        this.f17478b = new tp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21820m5, false));
    }
}
