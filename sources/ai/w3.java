package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.go0;
import org.telegram.ui.ip0;
public final class w3 implements Utilities.Callback2 {
    public final int f2355a;
    public final TL_stars.TL_starGiftUnique f2356b;
    public final long f2357c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f2358f;

    public w3(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f2355a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f2356b = tL_starGiftUnique;
        this.f2357c = j10;
        this.f2358f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f2355a) {
            case 0:
                k7 k7Var = (k7) this.d;
                yh.i0 i0Var = (yh.i0) this.f2358f;
                String str = (String) obj2;
                ((pf.c) this.e).b();
                if (((Boolean) obj).booleanValue()) {
                    m5 m5Var = k7Var.R0;
                    if (m5Var != null) {
                        if (i0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m5Var.a(this.f2356b, this.f2357c, z10);
                    }
                    if (i0Var != null) {
                        AndroidUtilities.runOnUIThread(new h4(i0Var, 0));
                        k7Var.skipDismissAnimation();
                    }
                    k7Var.dismiss();
                    return;
                }
                return;
            default:
                ip0.U((ip0) this.d, (boolean[]) this.e, this.f2356b, this.f2357c, (go0) this.f2358f, (h6) obj, (pf.c) obj2);
                return;
        }
    }
}
