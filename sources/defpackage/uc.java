package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class uc implements Runnable {
    public final byte a;
    public final id b;

    public uc(id idVar, byte b) {
        this.a = b;
        this.b = idVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        id idVar = this.b;
        switch (b) {
            case 0:
                idVar.dismiss();
                return;
            case 1:
                if (!idVar.isShowing()) {
                    try {
                        idVar.show();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 2:
                try {
                    idVar.dismiss();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 3:
                idVar.dismiss();
                return;
            case 4:
                idVar.dismiss();
                return;
            case 5:
                String[] strArr = MediaController.W1;
                try {
                    idVar.dismiss();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            default:
                idVar.dismiss();
                e S = LaunchActivity.S();
                if (S != null) {
                    v21 Q = d31.b0(S).Q(2131624012, 36, ob6.M0(2131748306, null));
                    Q.u = true;
                    Q.j();
                    return;
                }
                return;
        }
    }
}
