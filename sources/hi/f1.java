package hi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.xr;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.c40;
public final class f1 implements DialogInterface.OnDismissListener {
    public final int f14261a;

    public f1(int i7) {
        this.f14261a = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14261a) {
            case 0:
                int i7 = i2.C1;
                return;
            case 1:
                org.telegram.ui.b.f45549a = false;
                return;
            case 2:
                return;
            case 3:
                xr.f27574j.edit().putInt("dismissed_count", xr.f27574j.getInt("dismissed_count", 0) + 1).apply();
                return;
            case 4:
                int i10 = gz0.f35127e;
                return;
            case 5:
                c40 c40Var = c40.C5;
                return;
            case 6:
                return;
            case 7:
                org.telegram.utils.twidget.n0.f54344i = false;
                return;
            default:
                MediaController.f22329h2 = false;
                return;
        }
    }

    public f1(boolean[] zArr) {
        this.f14261a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
