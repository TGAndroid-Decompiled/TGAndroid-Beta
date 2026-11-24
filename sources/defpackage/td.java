package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class td implements Runnable {
    public final byte a;
    public final he b;

    public td(he heVar, byte b) {
        this.a = b;
        this.b = heVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        he heVar = this.b;
        switch (b) {
            case 0:
                heVar.dismiss();
                return;
            case 1:
                if (!heVar.isShowing()) {
                    try {
                        heVar.show();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 2:
                try {
                    heVar.dismiss();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 3:
                heVar.dismiss();
                return;
            case 4:
                heVar.dismiss();
                return;
            case 5:
                String[] strArr = MediaController.W1;
                try {
                    heVar.dismiss();
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            default:
                heVar.dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    u31 Q = c41.b0(S).Q(2131624012, 36, jb6.M0(2131748309, null));
                    Q.u = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
