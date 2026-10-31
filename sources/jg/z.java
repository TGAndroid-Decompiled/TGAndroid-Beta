package jg;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d6;
import org.telegram.ui.Components.i01;
import org.telegram.ui.b50;
public final class z implements DialogInterface.OnDismissListener {
    public final int f10380a;

    public z(int i10) {
        this.f10380a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f10380a) {
            case 0:
                MediaController.f14436f2 = false;
                return;
            case 1:
                org.telegram.ui.b.f35913a = false;
                return;
            case 2:
                return;
            case 3:
                d6.f15189i.edit().putInt("dismissed_count", d6.f15189i.getInt("dismissed_count", 0) + 1).apply();
                return;
            case 4:
                int i10 = i01.e;
                return;
            case 5:
                b50 b50Var = b50.f35989u5;
                return;
            case 6:
                return;
            case 7:
                org.telegram.utils.twidget.p.f44435i = false;
                return;
            default:
                int i11 = vh.u1.f51993y1;
                return;
        }
    }

    public z(boolean[] zArr) {
        this.f10380a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
