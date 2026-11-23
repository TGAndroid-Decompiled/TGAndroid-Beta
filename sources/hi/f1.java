package hi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.wr;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.f40;
public final class f1 implements DialogInterface.OnDismissListener {
    public final int f14629a;

    public f1(int i7) {
        this.f14629a = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14629a) {
            case 0:
                int i7 = i2.C1;
                return;
            case 1:
                org.telegram.ui.b.f45740a = false;
                return;
            case 2:
                return;
            case 3:
                wr.f27794j.edit().putInt("dismissed_count", wr.f27794j.getInt("dismissed_count", 0) + 1).apply();
                return;
            case 4:
                int i10 = pz0.f38714e;
                return;
            case 5:
                f40 f40Var = f40.C5;
                return;
            case 6:
                return;
            case 7:
                org.telegram.utils.twidget.n0.f54897i = false;
                return;
            default:
                MediaController.f22723h2 = false;
                return;
        }
    }

    public f1(boolean[] zArr) {
        this.f14629a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
