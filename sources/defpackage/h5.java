package defpackage;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
public final class h5 implements DialogInterface.OnDismissListener {
    public final byte a;

    public h5(boolean[] zArr) {
        this.a = (byte) 1;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                i5.a = false;
                return;
            case 1:
                return;
            case 2:
                sye.a.edit().putInt("dismissed_count", sye.a.getInt("dismissed_count", 0) + 1).apply();
                return;
            case 3:
            case 4:
                return;
            case 5:
                MediaController.h2 = false;
                return;
            case 6:
                return;
            default:
                k0d.i = false;
                return;
        }
    }

    public h5(kc kcVar, boolean[] zArr, byte b) {
        this.a = b;
    }

    public h5(byte b) {
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
