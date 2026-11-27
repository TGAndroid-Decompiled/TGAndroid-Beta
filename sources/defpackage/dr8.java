package defpackage;

import org.telegram.ui.ProfileActivity;
public final class dr8 implements Runnable {
    public final byte a;
    public final er8 b;

    public dr8(er8 er8Var, byte b) {
        this.a = b;
        this.b = er8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        er8 er8Var = this.b;
        switch (b) {
            case 0:
                ProfileActivity profileActivity = er8Var.n0;
                rq8 rq8Var = profileActivity.T5;
                if (rq8Var != null) {
                    rq8Var.dismiss();
                    profileActivity.T5 = null;
                    return;
                }
                return;
            default:
                try {
                    d79 currentListView = er8Var.h0.O.getCurrentListView();
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
