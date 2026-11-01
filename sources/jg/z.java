package jg;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.d6;
import org.telegram.ui.Components.j01;
import org.telegram.ui.a50;
public final class z implements DialogInterface.OnDismissListener {
    public final int f10381a;

    public z(int i10) {
        this.f10381a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f10381a) {
            case 0:
                MediaController.f14437f2 = false;
                return;
            case 1:
                org.telegram.ui.b.f35871a = false;
                return;
            case 2:
                return;
            case 3:
                d6.f15304i.edit().putInt("dismissed_count", d6.f15304i.getInt("dismissed_count", 0) + 1).apply();
                return;
            case 4:
                int i10 = j01.e;
                return;
            case 5:
                a50 a50Var = a50.f35573u5;
                return;
            case 6:
                return;
            case 7:
                org.telegram.utils.twidget.p.f44446i = false;
                return;
            default:
                int i11 = vh.u1.f52000y1;
                return;
        }
    }

    public z(boolean[] zArr) {
        this.f10381a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
