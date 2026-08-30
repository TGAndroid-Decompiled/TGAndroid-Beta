package dg;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.b11;
import org.telegram.ui.c60;
public final class e0 implements DialogInterface.OnDismissListener {
    public final int f4457a;

    public e0(int i10) {
        this.f4457a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f4457a) {
            case 0:
                MediaController.forceBroadcastNewPhotos = false;
                return;
            case 1:
                org.telegram.ui.c.f33058a = false;
                return;
            case 2:
                return;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                return;
            case 4:
                int i10 = b11.e;
                return;
            case 5:
                c60 c60Var = c60.A3;
                return;
            case 6:
                return;
            default:
                int i11 = ph.y1.D;
                return;
        }
    }

    public e0(boolean[] zArr) {
        this.f4457a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
