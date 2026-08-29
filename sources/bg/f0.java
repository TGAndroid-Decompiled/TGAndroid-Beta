package bg;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.q01;
import org.telegram.ui.r50;
public final class f0 implements DialogInterface.OnDismissListener {
    public final int f2193a;

    public f0(int i10) {
        this.f2193a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2193a) {
            case 0:
                MediaController.forceBroadcastNewPhotos = false;
                return;
            case 1:
                int i10 = nh.k2.C;
                return;
            case 2:
                org.telegram.ui.c.f36947a = false;
                return;
            case 3:
                return;
            case 4:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                return;
            case 5:
                int i11 = q01.f31814e;
                return;
            case 6:
                r50 r50Var = r50.f41867z3;
                return;
            default:
                return;
        }
    }

    public f0(boolean[] zArr) {
        this.f2193a = 3;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
