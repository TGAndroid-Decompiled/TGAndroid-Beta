package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.yn;
public abstract class f7 extends zl0 implements s9 {
    public final int f947e3;
    public final NotificationCenter.NotificationCenterDelegate f948f3;

    public f7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f947e3 = i10;
        this.f948f3 = notificationCenterDelegate;
    }

    @Override
    public final void a(int[] iArr) {
        switch (this.f947e3) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((k7) this.f948f3).f1218e);
                iArr[1] = getMeasuredHeight();
                return;
            default:
                yn ynVar = (yn) this.f948f3;
                iArr[0] = ((int) ynVar.f43469q9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.q.A(3.0f, ynVar.f43526v0.getPaddingBottom(), ynVar.f43526v0.getMeasuredHeight());
                return;
        }
    }
}
