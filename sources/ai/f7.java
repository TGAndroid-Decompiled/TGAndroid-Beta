package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.wn;
public abstract class f7 extends zl0 implements s9 {
    public final int f878e3;
    public final NotificationCenter.NotificationCenterDelegate f879f3;

    public f7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f878e3 = i10;
        this.f879f3 = notificationCenterDelegate;
    }

    @Override
    public final void a(int[] iArr) {
        switch (this.f878e3) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((k7) this.f879f3).e);
                iArr[1] = getMeasuredHeight();
                return;
            default:
                wn wnVar = (wn) this.f879f3;
                iArr[0] = ((int) wnVar.f39733s9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.f0.A(3.0f, wnVar.f39788x0.getPaddingBottom(), wnVar.f39788x0.getMeasuredHeight());
                return;
        }
    }
}
