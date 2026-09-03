package eg;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.b11;
import org.telegram.ui.d60;
public final class c0 implements DialogInterface.OnDismissListener {
    public final int f5100a;

    public c0(int i10) {
        this.f5100a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5100a) {
            case 0:
                MediaController.forceBroadcastNewPhotos = false;
                return;
            case 1:
                org.telegram.ui.c.f35643a = false;
                return;
            case 2:
                return;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                return;
            case 4:
                int i10 = b11.f25467e;
                return;
            case 5:
                d60 d60Var = d60.A3;
                return;
            case 6:
                return;
            default:
                int i11 = qh.x1.D;
                return;
        }
    }

    public c0(boolean[] zArr) {
        this.f5100a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
