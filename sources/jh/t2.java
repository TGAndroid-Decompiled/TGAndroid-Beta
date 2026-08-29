package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.tm;
import org.telegram.ui.yo0;
public final class t2 implements Utilities.Callback2 {
    public final int f12831a;
    public final TL_stars.TL_starGiftUnique f12832b;
    public final long f12833c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f12834e;
    public final Object f12835f;

    public t2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f12831a = i10;
        this.d = notificationCenterDelegate;
        this.f12834e = obj;
        this.f12832b = tL_starGiftUnique;
        this.f12833c = j10;
        this.f12835f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f12831a) {
            case 0:
                h5 h5Var = (h5) this.d;
                ih.v0 v0Var = (ih.v0) this.f12835f;
                String str = (String) obj2;
                ((ye.c) this.f12834e).b();
                if (((Boolean) obj).booleanValue()) {
                    s3 s3Var = h5Var.K0;
                    if (s3Var != null) {
                        if (v0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        s3Var.d(this.f12832b, this.f12833c, z10);
                    }
                    if (v0Var != null) {
                        AndroidUtilities.runOnUIThread(new ih.o0(v0Var, 2));
                        h5Var.skipDismissAnimation();
                    }
                    h5Var.dismiss();
                    return;
                }
                return;
            default:
                yo0.V((yo0) this.d, (boolean[]) this.f12834e, this.f12832b, this.f12833c, (tm) this.f12835f, (j4) obj, (ye.c) obj2);
                return;
        }
    }
}
