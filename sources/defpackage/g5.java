package defpackage;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class g5 implements DialogInterface.OnDismissListener {
    public final byte a;

    public g5(boolean[] zArr) {
        this.a = (byte) 1;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                h5.a = false;
                return;
            case 1:
            case 2:
                return;
            case 3:
                dwe.a.edit().putInt("dismissed_count", dwe.a.getInt("dismissed_count", 0) + 1).apply();
                return;
            case 4:
                return;
            case 5:
                MediaController.h2 = false;
                return;
            case 6:
                return;
            default:
                wxc.i = false;
                return;
        }
    }

    public g5(jd jdVar, boolean[] zArr, byte b) {
        this.a = b;
    }

    public g5(byte b) {
        this.a = b;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }

    private final void c(DialogInterface dialogInterface) {
    }

    private final void d(DialogInterface dialogInterface) {
    }
}
