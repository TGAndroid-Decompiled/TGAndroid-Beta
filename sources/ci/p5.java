package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.sn;
public abstract class p5 extends mm0 implements o7 {
    public final int Y2;
    public final NotificationCenter.NotificationCenterDelegate Z2;

    public p5(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.Y2 = i10;
        this.Z2 = notificationCenterDelegate;
    }

    @Override
    public final void a(int[] iArr) {
        switch (this.Y2) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((t5) this.Z2).e);
                iArr[1] = getMeasuredHeight();
                return;
            default:
                sn snVar = (sn) this.Z2;
                iArr[0] = ((int) snVar.E9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.v0.z(3.0f, snVar.f41737x0.getPaddingBottom(), snVar.f41737x0.getMeasuredHeight());
                return;
        }
    }
}
