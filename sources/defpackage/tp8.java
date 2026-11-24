package defpackage;

import org.telegram.ui.ProfileActivity;
public final class tp8 implements Runnable {
    public final byte a;
    public final up8 b;

    public tp8(up8 up8Var, byte b) {
        this.a = b;
        this.b = up8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        up8 up8Var = this.b;
        switch (b) {
            case 0:
                ProfileActivity profileActivity = up8Var.t0;
                gp8 gp8Var = profileActivity.Y5;
                if (gp8Var != null) {
                    gp8Var.dismiss();
                    profileActivity.Y5 = null;
                    return;
                }
                return;
            default:
                try {
                    r59 currentListView = up8Var.n0.O.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
