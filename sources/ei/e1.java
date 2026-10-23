package ei;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.z11;
import org.telegram.ui.u50;
public final class e1 implements DialogInterface.OnDismissListener {
    public final int f8959a;

    public e1(int i10) {
        this.f8959a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8959a) {
            case 0:
                int i10 = n2.H;
                return;
            case 1:
                org.telegram.ui.b.f35805a = false;
                return;
            case 2:
                return;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                return;
            case 4:
                int i11 = z11.e;
                return;
            case 5:
                u50 u50Var = u50.D3;
                return;
            case 6:
                return;
            default:
                MediaController.forceBroadcastNewPhotos = false;
                return;
        }
    }

    public e1(boolean[] zArr) {
        this.f8959a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
