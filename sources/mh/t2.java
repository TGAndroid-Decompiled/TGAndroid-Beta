package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xk;
import org.telegram.ui.ip0;
public final class t2 implements Utilities.Callback2 {
    public final int f14789a;
    public final TL_stars.TL_starGiftUnique f14790b;
    public final long f14791c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f14792e;
    public final Object f14793f;

    public t2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f14789a = i10;
        this.d = notificationCenterDelegate;
        this.f14792e = obj;
        this.f14790b = tL_starGiftUnique;
        this.f14791c = j10;
        this.f14793f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z4;
        switch (this.f14789a) {
            case 0:
                g5 g5Var = (g5) this.d;
                lh.u0 u0Var = (lh.u0) this.f14793f;
                String str = (String) obj2;
                ((af.f) this.f14792e).b();
                if (((Boolean) obj).booleanValue()) {
                    r3 r3Var = g5Var.L0;
                    if (r3Var != null) {
                        if (u0Var != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        r3Var.b(this.f14790b, this.f14791c, z4);
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
                ip0.V((ip0) this.d, (boolean[]) this.f14792e, this.f14790b, this.f14791c, (xk) this.f14793f, (i4) obj, (af.f) obj2);
                return;
        }
    }
}
