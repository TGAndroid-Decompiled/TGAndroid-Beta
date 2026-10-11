package ci;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.f21;
import org.telegram.ui.g60;
public final class e1 implements DialogInterface.OnDismissListener {
    public final int f5021a;

    public e1(int i10) {
        this.f5021a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5021a) {
            case 0:
                int i10 = r2.G;
                return;
            case 1:
                org.telegram.ui.b.f36213a = false;
                return;
            case 2:
                return;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                return;
            case 4:
                int i11 = f21.f26206e;
                return;
            case 5:
                g60 g60Var = g60.D3;
                return;
            case 6:
                return;
            default:
                MediaController.forceBroadcastNewPhotos = false;
                return;
        }
    }

    public e1(boolean[] zArr) {
        this.f5021a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
