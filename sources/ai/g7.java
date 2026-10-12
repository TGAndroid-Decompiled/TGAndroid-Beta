package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.eo;
public abstract class g7 extends wm0 implements t9 {
    public final int V2;
    public final NotificationCenter.NotificationCenterDelegate W2;

    public g7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.V2 = i10;
        this.W2 = notificationCenterDelegate;
    }

    @Override
    public final void a(int[] iArr) {
        switch (this.V2) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((l7) this.W2).f1335e);
                iArr[1] = getMeasuredHeight();
                return;
            default:
                eo eoVar = (eo) this.W2;
                iArr[0] = ((int) eoVar.f37422s9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.v0.z(3.0f, eoVar.f37478x0.getPaddingBottom(), eoVar.f37478x0.getMeasuredHeight());
                return;
        }
    }
}
