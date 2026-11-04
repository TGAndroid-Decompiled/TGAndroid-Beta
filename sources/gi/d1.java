package gi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.sr;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.x30;
public final class d1 implements DialogInterface.OnDismissListener {
    public final int f12547a;

    public d1(int i3) {
        this.f12547a = i3;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f12547a) {
            case 0:
                int i3 = i2.f12950z1;
                return;
            case 1:
                org.telegram.ui.b.f43862a = false;
                return;
            case 2:
                return;
            case 3:
                sr.f25410j.edit().putInt("dismissed_count", sr.f25410j.getInt("dismissed_count", 0) + 1).apply();
                return;
            case 4:
                int i10 = dz0.f33228e;
                return;
            case 5:
                x30 x30Var = x30.f51711v5;
                return;
            case 6:
                return;
            case 7:
                org.telegram.utils.twidget.p.f52947i = false;
                return;
            default:
                MediaController.f21300h2 = false;
                return;
        }
    }

    public d1(boolean[] zArr) {
        this.f12547a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
