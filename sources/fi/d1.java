package fi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.as;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.c40;
public final class d1 implements DialogInterface.OnDismissListener {
    public final int f11782a;

    public d1(int i7) {
        this.f11782a = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f11782a) {
            case 0:
                int i7 = k2.f12251y1;
                return;
            case 1:
                org.telegram.ui.b.f44119a = false;
                return;
            case 2:
                return;
            case 3:
                as.f21499j.edit().putInt("dismissed_count", as.f21499j.getInt("dismissed_count", 0) + 1).apply();
                return;
            case 4:
                int i10 = dz0.f33060e;
                return;
            case 5:
                c40 c40Var = c40.f44519u5;
                return;
            case 6:
                return;
            case 7:
                org.telegram.utils.twidget.p.f52856i = false;
                return;
            default:
                MediaController.f21246g2 = false;
                return;
        }
    }

    public d1(boolean[] zArr) {
        this.f11782a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
