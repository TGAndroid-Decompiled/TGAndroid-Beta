package di;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.un;
public abstract class p5 extends mm0 implements o7 {
    public final int f8905f3;
    public final NotificationCenter.NotificationCenterDelegate f8906g3;

    public p5(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, u6Var);
        this.f8905f3 = i10;
        this.f8906g3 = notificationCenterDelegate;
    }

    @Override
    public final void a(int[] iArr) {
        switch (this.f8905f3) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((t5) this.f8906g3).e);
                iArr[1] = getMeasuredHeight();
                return;
            default:
                un unVar = (un) this.f8906g3;
                iArr[0] = ((int) unVar.E9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.t.B(3.0f, unVar.f44471x0.getPaddingBottom(), unVar.f44471x0.getMeasuredHeight());
                return;
        }
    }
}
