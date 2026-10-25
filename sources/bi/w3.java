package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.qo0;
import org.telegram.ui.rp0;
public final class w3 implements Utilities.Callback2 {
    public final int f5597a;
    public final TL_stars.TL_starGiftUnique f5598b;
    public final long f5599c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f5600f;

    public w3(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f5597a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f5598b = tL_starGiftUnique;
        this.f5599c = j10;
        this.f5600f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f5597a) {
            case 0:
                h7 h7Var = (h7) this.d;
                zh.i0 i0Var = (zh.i0) this.f5600f;
                String str = (String) obj2;
                ((qf.c) this.e).b();
                if (((Boolean) obj).booleanValue()) {
                    i5 i5Var = h7Var.R0;
                    if (i5Var != null) {
                        if (i0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i5Var.b(this.f5598b, this.f5599c, z10);
                    }
                    if (i0Var != null) {
                        AndroidUtilities.runOnUIThread(new a4(i0Var, 0));
                        h7Var.skipDismissAnimation();
                    }
                    h7Var.dismiss();
                    return;
                }
                return;
            default:
                rp0.V((rp0) this.d, (boolean[]) this.e, this.f5598b, this.f5599c, (qo0) this.f5600f, (d6) obj, (qf.c) obj2);
                return;
        }
    }
}
