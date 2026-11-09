package fi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.as;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.e40;
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
                org.telegram.ui.b.f43840a = false;
                return;
            case 2:
                return;
            case 3:
                as.f21515j.edit().putInt("dismissed_count", as.f21515j.getInt("dismissed_count", 0) + 1).apply();
                return;
            case 4:
                int i10 = fz0.f33801e;
                return;
            case 5:
                e40 e40Var = e40.f45182u5;
                return;
            case 6:
                return;
            case 7:
                org.telegram.utils.twidget.n0.f52935i = false;
                return;
            default:
                MediaController.f21249g2 = false;
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
