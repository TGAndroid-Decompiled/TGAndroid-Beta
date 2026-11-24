package defpackage;

import android.app.Activity;
public final class x87 implements Runnable {
    public final byte a;
    public final Activity b;
    public final hd c;

    public x87(Activity activity, hd hdVar, byte b) {
        this.a = b;
        this.b = activity;
        this.c = hdVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hd hdVar = this.c;
        Activity activity = this.b;
        switch (b) {
            case 0:
                if (!activity.isFinishing()) {
                    try {
                        hdVar.dismiss();
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                try {
                    if (!activity.isFinishing()) {
                        hdVar.dismiss();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }
}
