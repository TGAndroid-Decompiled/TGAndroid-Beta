package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.im0;
import org.telegram.ui.sn;
public abstract class q5 extends im0 implements p7 {
    public final int V2;
    public final NotificationCenter.NotificationCenterDelegate W2;

    public q5(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.V2 = i10;
        this.W2 = notificationCenterDelegate;
    }

    @Override
    public final void a(int[] iArr) {
        switch (this.V2) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((u5) this.W2).e);
                iArr[1] = getMeasuredHeight();
                return;
            default:
                sn snVar = (sn) this.W2;
                iArr[0] = ((int) snVar.f41377s9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.q.A(3.0f, snVar.f41433x0.getPaddingBottom(), snVar.f41433x0.getMeasuredHeight());
                return;
        }
    }
}
