package ei;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.v11;
import org.telegram.ui.q50;
public final class e1 implements DialogInterface.OnDismissListener {
    public final int f8948a;

    public e1(int i10) {
        this.f8948a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f8948a) {
            case 0:
                int i10 = n2.G;
                return;
            case 1:
                org.telegram.ui.b.f35454a = false;
                return;
            case 2:
                return;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                return;
            case 4:
                int i11 = v11.e;
                return;
            case 5:
                q50 q50Var = q50.D3;
                return;
            case 6:
                return;
            default:
                MediaController.forceBroadcastNewPhotos = false;
                return;
        }
    }

    public e1(boolean[] zArr) {
        this.f8948a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
