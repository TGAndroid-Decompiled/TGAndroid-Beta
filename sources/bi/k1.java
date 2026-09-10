package bi;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.l11;
import org.telegram.ui.j60;
public final class k1 implements DialogInterface.OnDismissListener {
    public final int f2979a;

    public k1(int i10) {
        this.f2979a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2979a) {
            case 0:
                int i10 = f3.G;
                return;
            case 1:
                org.telegram.ui.b.f31111a = false;
                return;
            case 2:
                return;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                return;
            case 4:
                int i11 = l11.e;
                return;
            case 5:
                j60 j60Var = j60.D3;
                return;
            case 6:
                return;
            default:
                MediaController.forceBroadcastNewPhotos = false;
                return;
        }
    }

    public k1(boolean[] zArr) {
        this.f2979a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
