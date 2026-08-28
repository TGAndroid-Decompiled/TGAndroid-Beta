package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.eb0;
import org.telegram.ui.zo0;
public final class v2 implements Utilities.Callback2 {
    public final int f9009a;
    public final TL_stars.TL_starGiftUnique f9010b;
    public final long f9011c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f9012e;
    public final Object f9013f;

    public v2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i9) {
        this.f9009a = i9;
        this.d = notificationCenterDelegate;
        this.f9012e = obj;
        this.f9010b = tL_starGiftUnique;
        this.f9011c = j10;
        this.f9013f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f9009a) {
            case 0:
                k5 k5Var = (k5) this.d;
                fh.z0 z0Var = (fh.z0) this.f9013f;
                String str = (String) obj2;
                ((ve.d) this.f9012e).b();
                if (((Boolean) obj).booleanValue()) {
                    u3 u3Var = k5Var.K0;
                    if (u3Var != null) {
                        if (z0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        u3Var.a(this.f9010b, this.f9011c, z10);
                    }
                    if (z0Var != null) {
                        AndroidUtilities.runOnUIThread(new fh.s0(z0Var, 2));
                        k5Var.skipDismissAnimation();
                    }
                    k5Var.dismiss();
                    return;
                }
                return;
            default:
                zo0.U((zo0) this.d, (boolean[]) this.f9012e, this.f9010b, this.f9011c, (eb0) this.f9013f, (m4) obj, (ve.d) obj2);
                return;
        }
    }
}
