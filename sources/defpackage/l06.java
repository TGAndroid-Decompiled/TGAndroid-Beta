package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.LaunchActivity;
public final class l06 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final LaunchActivity b;

    public l06(LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                launchActivity.w1 = false;
                return;
            case 1:
                String str2 = LaunchActivity.C1;
                hl.d3(new sz5(launchActivity, (byte) 10), 30000L);
                return;
            default:
                String str3 = LaunchActivity.C1;
                hl.d3(new sz5(launchActivity, (byte) 0), 30000L);
                return;
        }
    }
}
