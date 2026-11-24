package defpackage;

import android.app.Activity;
import android.content.Intent;
public final class ogc implements ed {
    public final byte a;
    public final Activity b;
    public final Intent c;

    public ogc(Activity activity, Intent intent, byte b) {
        this.a = b;
        this.b = activity;
        this.c = intent;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Intent intent = this.c;
        Activity activity = this.b;
        switch (b) {
            case 0:
                activity.startActivity(intent);
                return;
            default:
                activity.startActivity(intent);
                return;
        }
    }
}
