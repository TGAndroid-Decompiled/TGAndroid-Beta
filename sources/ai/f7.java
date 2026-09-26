package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.wn;
public abstract class f7 extends wl0 implements s9 {
    public final int X2;
    public final NotificationCenter.NotificationCenterDelegate Y2;

    public f7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
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
                wn wnVar = (wn) this.Y2;
                iArr[0] = ((int) wnVar.f39640s9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.f0.A(3.0f, wnVar.f39695x0.getPaddingBottom(), wnVar.f39695x0.getMeasuredHeight());
                return;
        }
    }
}
