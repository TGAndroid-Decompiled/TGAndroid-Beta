package hi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.vr;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.f40;
public final class f1 implements DialogInterface.OnDismissListener {
    public final int f14626a;

    public f1(int i7) {
        this.f14626a = i7;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f14626a) {
            case 0:
                int i7 = i2.C1;
                return;
            case 1:
                org.telegram.ui.b.f45736a = false;
                return;
            case 2:
                return;
            case 3:
                vr.f27618j.edit().putInt("dismissed_count", vr.f27618j.getInt("dismissed_count", 0) + 1).apply();
                return;
            case 4:
                int i10 = pz0.f38715e;
                return;
            case 5:
                f40 f40Var = f40.C5;
                return;
            case 6:
                return;
            case 7:
                org.telegram.utils.twidget.n0.f54893i = false;
                return;
            default:
                MediaController.f22720h2 = false;
                return;
        }
    }

    public f1(boolean[] zArr) {
        this.f14626a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
