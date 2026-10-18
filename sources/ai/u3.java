package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.io0;
import org.telegram.ui.kp0;
public final class u3 implements Utilities.Callback2 {
    public final int f2242a;
    public final TL_stars.TL_starGiftUnique f2243b;
    public final long f2244c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f2245f;

    public u3(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f2242a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f2243b = tL_starGiftUnique;
        this.f2244c = j10;
        this.f2245f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f2242a) {
            case 0:
                k7 k7Var = (k7) this.d;
                yh.i0 i0Var = (yh.i0) this.f2245f;
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
                        m5Var.a(this.f2243b, this.f2244c, z10);
                    }
                    if (i0Var != null) {
                        AndroidUtilities.runOnUIThread(new e4(i0Var, 0));
                        k7Var.skipDismissAnimation();
                    }
                    k7Var.dismiss();
                    return;
                }
                return;
            default:
                kp0.U((kp0) this.d, (boolean[]) this.e, this.f2243b, this.f2244c, (io0) this.f2245f, (h6) obj, (pf.c) obj2);
                return;
        }
    }
}
