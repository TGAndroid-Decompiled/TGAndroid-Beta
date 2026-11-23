package hi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.vr;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.e40;
public final class n1 implements DialogInterface.OnDismissListener {
    public final int f14998a;

    public n1(int i7) {
        this.f14998a = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14998a) {
            case 0:
                int i7 = r2.D1;
                return;
            case 1:
                org.telegram.ui.b.f45838a = false;
                return;
            case 2:
                return;
            case 3:
                vr.f27686j.edit().putInt("dismissed_count", vr.f27686j.getInt("dismissed_count", 0) + 1).apply();
                return;
            case 4:
                int i10 = oz0.f38325e;
                return;
            case 5:
                e40 e40Var = e40.C5;
                return;
            case 6:
                return;
            case 7:
                org.telegram.utils.twidget.n0.f54978i = false;
                return;
            default:
                MediaController.f22790h2 = false;
                return;
        }
    }

    public n1(boolean[] zArr) {
        this.f14998a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
