package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.no0;
import org.telegram.ui.np0;
public final class t2 implements Utilities.Callback2 {
    public final int f14791a;
    public final TL_stars.TL_starGiftUnique f14792b;
    public final long f14793c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f14794e;
    public final Object f14795f;

    public t2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f14791a = i10;
        this.d = notificationCenterDelegate;
        this.f14794e = obj;
        this.f14792b = tL_starGiftUnique;
        this.f14793c = j10;
        this.f14795f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z4;
        switch (this.f14791a) {
            case 0:
                g5 g5Var = (g5) this.d;
                lh.u0 u0Var = (lh.u0) this.f14795f;
                String str = (String) obj2;
                ((af.f) this.f14794e).b();
                if (((Boolean) obj).booleanValue()) {
                    r3 r3Var = g5Var.L0;
                    if (r3Var != null) {
                        if (u0Var != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        r3Var.b(this.f14792b, this.f14793c, z4);
                    }
                    if (u0Var != null) {
                        AndroidUtilities.runOnUIThread(new lh.n0(u0Var, 2));
                        g5Var.skipDismissAnimation();
                    }
                    g5Var.dismiss();
                    return;
                }
                return;
            default:
                np0.U((np0) this.d, (boolean[]) this.f14794e, this.f14792b, this.f14793c, (no0) this.f14795f, (i4) obj, (af.f) obj2);
                return;
        }
    }
}
