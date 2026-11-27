package defpackage;

import android.app.Activity;
public final class gb7 implements Runnable {
    public final byte a;
    public final Activity b;
    public final id c;

    public gb7(Activity activity, id idVar, byte b) {
        this.a = b;
        this.b = activity;
        this.c = idVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        id idVar = this.c;
        Activity activity = this.b;
        switch (b) {
            case 0:
                if (!activity.isFinishing()) {
                    try {
                        idVar.dismiss();
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                try {
                    if (!activity.isFinishing()) {
                        idVar.dismiss();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }
}
