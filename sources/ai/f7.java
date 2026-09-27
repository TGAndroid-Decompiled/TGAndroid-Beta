package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.xn;
public abstract class f7 extends yl0 implements s9 {
    public final int X2;
    public final NotificationCenter.NotificationCenterDelegate Y2;

    public f7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.X2 = i10;
        this.Y2 = notificationCenterDelegate;
    }

    @Override
    public final void a(int[] iArr) {
        switch (this.X2) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((k7) this.Y2).e);
                iArr[1] = getMeasuredHeight();
                return;
            default:
                xn xnVar = (xn) this.Y2;
                iArr[0] = ((int) xnVar.f39922s9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.l0.A(3.0f, xnVar.f39977x0.getPaddingBottom(), xnVar.f39977x0.getMeasuredHeight());
                return;
        }
    }
}
