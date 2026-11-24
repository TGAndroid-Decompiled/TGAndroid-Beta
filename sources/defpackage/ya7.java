package defpackage;

import android.app.Activity;
public final class ya7 implements Runnable {
    public final byte a;
    public final Activity b;
    public final he c;

    public ya7(Activity activity, he heVar, byte b) {
        this.a = b;
        this.b = activity;
        this.c = heVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        he heVar = this.c;
        Activity activity = this.b;
        switch (b) {
            case 0:
                if (!activity.isFinishing()) {
                    try {
                        heVar.dismiss();
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                try {
                    if (!activity.isFinishing()) {
                        heVar.dismiss();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }
}
