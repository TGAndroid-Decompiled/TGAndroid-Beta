package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ho0;
import org.telegram.ui.jp0;
public final class c4 implements Utilities.Callback2 {
    public final int f1078a;
    public final TL_stars.TL_starGiftUnique f1079b;
    public final long f1080c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f1081f;

    public c4(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f1078a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f1079b = tL_starGiftUnique;
        this.f1080c = j10;
        this.f1081f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f1078a) {
            case 0:
                k7 k7Var = (k7) this.d;
                yh.j0 j0Var = (yh.j0) this.f1081f;
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
                        m5Var.a(this.f1079b, this.f1080c, z10);
                    }
                    if (j0Var != null) {
                        AndroidUtilities.runOnUIThread(new f4(j0Var, 0));
                        k7Var.skipDismissAnimation();
                    }
                    k7Var.dismiss();
                    return;
                }
                return;
            default:
                jp0.U((jp0) this.d, (boolean[]) this.e, this.f1079b, this.f1080c, (ho0) this.f1081f, (h6) obj, (pf.c) obj2);
                return;
        }
    }
}
