package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.LaunchActivity;
public final class k06 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final LaunchActivity b;

    public k06(LaunchActivity launchActivity, byte b) {
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
                gm.d3(new rz5(launchActivity, (byte) 7), 30000L);
                return;
            default:
                String str3 = LaunchActivity.C1;
                gm.d3(new rz5(launchActivity, (byte) 10), 30000L);
                return;
        }
    }
}
