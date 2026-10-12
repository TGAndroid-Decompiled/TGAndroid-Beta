package ci;

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.j21;
import org.telegram.ui.i60;
public final class e1 implements DialogInterface.OnDismissListener {
    public final int f5020a;

    public e1(int i10) {
        this.f5020a = i10;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f5020a) {
            case 0:
                int i10 = r2.G;
                return;
            case 1:
                org.telegram.ui.b.f36001a = false;
                return;
            case 2:
                return;
            case 3:
                SharedConfig.BackgroundActivityPrefs.increaseDismissedCount();
                return;
            case 4:
                int i11 = j21.f27351e;
                return;
            case 5:
                i60 i60Var = i60.D3;
                return;
            case 6:
                return;
            default:
                MediaController.forceBroadcastNewPhotos = false;
                return;
        }
    }

    public e1(boolean[] zArr) {
        this.f5020a = 2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
