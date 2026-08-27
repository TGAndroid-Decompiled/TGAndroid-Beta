package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ap0;
import org.telegram.ui.ib0;

public final class v2 implements Utilities.Callback2 {

    public final int f10201a;

    public final TL_stars.TL_starGiftUnique f10202b;

    public final long f10203c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public final Object f10204e;

    public final Object f10205f;

    public v2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f10201a = i10;
        this.d = notificationCenterDelegate;
        this.f10204e = obj;
        this.f10202b = tL_starGiftUnique;
        this.f10203c = j10;
        this.f10205f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f10201a) {
            case 0:
                i5 i5Var = (i5) this.d;
                we.d dVar = (we.d) this.f10204e;
                gh.x0 x0Var = (gh.x0) this.f10205f;
                dVar.b();
                if (((Boolean) obj).booleanValue()) {
                    s3 s3Var = i5Var.K0;
                    if (s3Var != null) {
                        s3Var.a(this.f10202b, this.f10203c, x0Var != null);
                    }
                    if (x0Var != null) {
                        AndroidUtilities.runOnUIThread(new gh.q0(x0Var, 2));
                        i5Var.skipDismissAnimation();
                    }
                    i5Var.dismiss();
                }
                break;
            default:
                ap0.V((ap0) this.d, (boolean[]) this.f10204e, this.f10202b, this.f10203c, (ib0) this.f10205f, (k4) obj, (we.d) obj2);
                break;
        }
    }
}
