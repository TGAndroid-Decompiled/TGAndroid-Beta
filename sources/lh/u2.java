package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vk;
import org.telegram.ui.gp0;
public final class u2 implements Utilities.Callback2 {
    public final int f13191a;
    public final TL_stars.TL_starGiftUnique f13192b;
    public final long f13193c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f13194f;

    public u2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f13191a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f13192b = tL_starGiftUnique;
        this.f13193c = j10;
        this.f13194f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z4;
        switch (this.f13191a) {
            case 0:
                g5 g5Var = (g5) this.d;
                kh.u0 u0Var = (kh.u0) this.f13194f;
                String str = (String) obj2;
                ((af.f) this.e).b();
                if (((Boolean) obj).booleanValue()) {
                    r3 r3Var = g5Var.L0;
                    if (r3Var != null) {
                        if (u0Var != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        r3Var.b(this.f13192b, this.f13193c, z4);
                    }
                    if (u0Var != null) {
                        AndroidUtilities.runOnUIThread(new kh.n0(u0Var, 2));
                        g5Var.skipDismissAnimation();
                    }
                    g5Var.dismiss();
                    return;
                }
                return;
            default:
                gp0.V((gp0) this.d, (boolean[]) this.e, this.f13192b, this.f13193c, (vk) this.f13194f, (i4) obj, (af.f) obj2);
                return;
        }
    }
}
