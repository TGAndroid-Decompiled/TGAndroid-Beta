package fi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.as;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.f40;
public final class d1 implements DialogInterface.OnDismissListener {
    public final int f11786a;

    public d1(int i7) {
        this.f11786a = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f11786a) {
            case 0:
                int i7 = k2.B1;
                return;
            case 1:
                org.telegram.ui.b.f43855a = false;
                return;
            case 2:
                return;
            case 3:
                as.f21520j.edit().putInt("dismissed_count", as.f21520j.getInt("dismissed_count", 0) + 1).apply();
                return;
            case 4:
                int i10 = ez0.f33399e;
                return;
            case 5:
                f40 f40Var = f40.f45501x5;
                return;
            case 6:
                return;
            case 7:
                org.telegram.utils.twidget.n0.f52934i = false;
                return;
            default:
                MediaController.f21254g2 = false;
                return;
        }
    }

    public d1(boolean[] zArr) {
        this.f11786a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
