package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.io0;
import org.telegram.ui.kp0;
public final class s3 implements Utilities.Callback2 {
    public final int f2137a;
    public final TL_stars.TL_starGiftUnique f2138b;
    public final long f2139c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f2140f;

    public s3(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f2137a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f2138b = tL_starGiftUnique;
        this.f2139c = j10;
        this.f2140f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f2137a) {
            case 0:
                k7 k7Var = (k7) this.d;
                yh.j0 j0Var = (yh.j0) this.f2140f;
                String str = (String) obj2;
                ((pf.c) this.e).b();
                if (((Boolean) obj).booleanValue()) {
                    m5 m5Var = k7Var.R0;
                    if (m5Var != null) {
                        if (j0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m5Var.a(this.f2138b, this.f2139c, z10);
                    }
                    if (j0Var != null) {
                        AndroidUtilities.runOnUIThread(new h4(j0Var, 0));
                        k7Var.skipDismissAnimation();
                    }
                    k7Var.dismiss();
                    return;
                }
                return;
            default:
                kp0.U((kp0) this.d, (boolean[]) this.e, this.f2138b, this.f2139c, (io0) this.f2140f, (h6) obj, (pf.c) obj2);
                return;
        }
    }
}
