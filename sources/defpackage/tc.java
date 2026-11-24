package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class tc implements Runnable {
    public final byte a;
    public final hd b;

    public tc(hd hdVar, byte b) {
        this.a = b;
        this.b = hdVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hd hdVar = this.b;
        switch (b) {
            case 0:
                hdVar.dismiss();
                return;
            case 1:
                if (!hdVar.isShowing()) {
                    try {
                        hdVar.show();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 2:
                try {
                    hdVar.dismiss();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 3:
                hdVar.dismiss();
                return;
            case 4:
                hdVar.dismiss();
                return;
            case 5:
                String[] strArr = MediaController.W1;
                try {
                    hdVar.dismiss();
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            default:
                hdVar.dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    m21 Q = u21.b0(S).Q(2131624012, 36, k96.M0(2131748360, null));
                    Q.t = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
