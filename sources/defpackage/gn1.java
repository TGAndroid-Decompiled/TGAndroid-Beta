package defpackage;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.ui.LaunchActivity;
public final class gn1 implements DialogInterface.OnCancelListener {
    public final byte a;
    public final boolean[] b;

    public gn1(boolean[] zArr, byte b) {
        this.a = b;
        this.b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                zArr[0] = true;
                return;
            case 1:
                String str = LaunchActivity.C1;
                zArr[0] = true;
                return;
            case 2:
                String[] strArr = MediaController.W1;
                zArr[0] = true;
                return;
            case 3:
                String[] strArr2 = MediaController.W1;
                zArr[0] = true;
                return;
            default:
                zArr[0] = true;
                return;
        }
    }
}
