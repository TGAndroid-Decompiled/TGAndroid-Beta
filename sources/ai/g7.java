package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.zn;
public abstract class g7 extends qm0 implements t9 {
    public final int V2;
    public final NotificationCenter.NotificationCenterDelegate W2;

    public g7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.V2 = i10;
        this.W2 = notificationCenterDelegate;
    }

    @Override
    public final void a(int[] iArr) {
        switch (this.V2) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((l7) this.W2).f1337e);
                iArr[1] = getMeasuredHeight();
                return;
            default:
                zn znVar = (zn) this.W2;
                iArr[0] = ((int) znVar.f44932s9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.q.A(3.0f, znVar.f44988x0.getPaddingBottom(), znVar.f44988x0.getMeasuredHeight());
                return;
        }
    }
}
