package bi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.fo;
public abstract class r6 extends mm0 implements e9 {
    public final int V2;
    public final NotificationCenter.NotificationCenterDelegate W2;

    public r6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.V2 = i10;
        this.W2 = notificationCenterDelegate;
    }

    @Override
    public final void a(int[] iArr) {
        switch (this.V2) {
            case 0:
                iArr[0] = AndroidUtilities.dp(((w6) this.W2).e);
                iArr[1] = getMeasuredHeight();
                return;
            default:
                fo foVar = (fo) this.W2;
                iArr[0] = ((int) foVar.f35805s9) - AndroidUtilities.dp(4.0f);
                iArr[1] = org.telegram.messenger.g0.A(3.0f, foVar.f35861x0.getPaddingBottom(), foVar.f35861x0.getMeasuredHeight());
                return;
        }
    }
}
