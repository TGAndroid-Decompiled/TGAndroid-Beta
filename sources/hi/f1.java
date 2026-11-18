package hi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.vr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.f40;
public final class f1 implements DialogInterface.OnDismissListener {
    public final int f14641a;

    public f1(int i7) {
        this.f14641a = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14641a) {
            case 0:
                int i7 = j2.C1;
                return;
            case 1:
                org.telegram.ui.b.f45700a = false;
                return;
            case 2:
                return;
            case 3:
                vr.f27590j.edit().putInt("dismissed_count", vr.f27590j.getInt("dismissed_count", 0) + 1).apply();
                return;
            case 4:
                int i10 = nz0.f37910e;
                return;
            case 5:
                f40 f40Var = f40.C5;
                return;
            case 6:
                return;
            case 7:
                org.telegram.utils.twidget.n0.f54852i = false;
                return;
            default:
                MediaController.f22692h2 = false;
                return;
        }
    }

    public f1(boolean[] zArr) {
        this.f14641a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
