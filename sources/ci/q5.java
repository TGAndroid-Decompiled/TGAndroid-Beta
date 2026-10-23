package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.qn;
public abstract class q5 extends jm0 implements p7 {
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
                qn qnVar = (qn) this.W2;
                iArr[0] = ((int) qnVar.f40849s9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.g0.A(3.0f, qnVar.f40905x0.getPaddingBottom(), qnVar.f40905x0.getMeasuredHeight());
                return;
        }
    }
}
