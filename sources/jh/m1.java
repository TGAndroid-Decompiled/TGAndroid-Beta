package jh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hp;

public final class m1 extends View {

    public final int f13648a = 1;

    public final hp f13649b;

    public m1(Context context) {
        super(context);
        this.f13649b = new hp(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f13648a) {
            case 0:
                int iDp = AndroidUtilities.dp(1.0f);
                int width = (getWidth() - iDp) - iDp;
                int height = (getHeight() - iDp) - iDp;
                hp hpVar = this.f13649b;
                hpVar.setBounds(iDp, iDp, width, height);
                hpVar.draw(canvas);
                invalidate();
                break;
            default:
                int width2 = getWidth();
                int height2 = getHeight();
                hp hpVar2 = this.f13649b;
                hpVar2.setBounds(0, 0, width2, height2);
                hpVar2.setAlpha(255);
                hpVar2.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                break;
        }
    }

    public m1(Activity activity) {
        super(activity);
        this.f13649b = new hp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23214m5, false));
    }
}
