package defpackage;

import org.telegram.ui.ProfileActivity;
public final class sn8 implements Runnable {
    public final byte a;
    public final tn8 b;

    public sn8(tn8 tn8Var, byte b) {
        this.a = b;
        this.b = tn8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tn8 tn8Var = this.b;
        switch (b) {
            case 0:
                ProfileActivity profileActivity = tn8Var.t0;
                fn8 fn8Var = profileActivity.T5;
                if (fn8Var != null) {
                    fn8Var.dismiss();
                    profileActivity.T5 = null;
                    return;
                }
                return;
            default:
                try {
                    o39 currentListView = tn8Var.n0.O.getCurrentListView();
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
