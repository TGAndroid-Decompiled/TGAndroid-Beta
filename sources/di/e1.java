package di;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.a21;
import org.telegram.ui.n60;
public final class e1 implements DialogInterface.OnDismissListener {
    public final int f6889a;

    public e1(int i10) {
        this.f6889a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f6889a) {
            case 0:
                int i10 = r2.G;
                return;
            case 1:
                org.telegram.ui.b.f34133a = false;
                return;
            case 2:
                return;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                return;
            case 4:
                int i11 = a21.e;
                return;
            case 5:
                n60 n60Var = n60.D3;
                return;
            case 6:
                return;
            default:
                MediaController.forceBroadcastNewPhotos = false;
                return;
        }
    }

    public e1(boolean[] zArr) {
        this.f6889a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
